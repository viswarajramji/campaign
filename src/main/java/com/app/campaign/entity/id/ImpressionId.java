package com.app.campaign.entity.id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
public class ImpressionId implements Serializable {

    private Long bannerId;
    private Long campaignId;
    private LocalDateTime timestamp;  // Include timestamp as part of the primary key

    // Parameterized constructor
    public ImpressionId(Long bannerId, Long campaignId, LocalDateTime timestamp) {
        this.bannerId = bannerId;
        this.campaignId = campaignId;
        this.timestamp = timestamp;
    }

    // Override equals method for composite key comparisons
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImpressionId that = (ImpressionId) o;
        return Objects.equals(bannerId, that.bannerId) &&
                Objects.equals(campaignId, that.campaignId) &&
                Objects.equals(timestamp, that.timestamp);
    }

    // Override hashCode method for composite key comparisons
    @Override
    public int hashCode() {
        return Objects.hash(bannerId, campaignId, timestamp);
    }
}
