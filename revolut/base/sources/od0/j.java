package od0;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes19.dex */
public final class j {
    static {
        Optional.of(Duration.ofSeconds(1L));
        Optional.of(Duration.ofNanos(100L));
        Duration.between(Instant.parse("1970-01-01T00:00:00Z"), Instant.parse("1582-10-15T00:00:00Z")).getSeconds();
    }

    private j() {
    }

    public static UUID a(Instant instant) {
        long mostSignificantBits;
        long mostSignificantBits2;
        long j2;
        UUID uuidRandomUUID = UUID.randomUUID();
        long epochSecond = instant.getEpochSecond();
        if (epochSecond <= BodyPartID.bodyIdMax) {
            mostSignificantBits2 = ((epochSecond << 32) | ((uuidRandomUUID.getMostSignificantBits() << 32) >>> 32)) & (-61441);
            j2 = 40960;
        } else {
            if (epochSecond > 68719476735L) {
                System.err.println("Is it 20 August 4147? Wow! We've survived for so long! We're not able to generate more custom UUIDs, falling back to UUID version 4");
                mostSignificantBits = uuidRandomUUID.getMostSignificantBits();
                return new UUID(mostSignificantBits, uuidRandomUUID.getLeastSignificantBits());
            }
            mostSignificantBits2 = ((epochSecond << 28) | ((uuidRandomUUID.getMostSignificantBits() << 28) >>> 28)) & (-61441);
            j2 = 49152;
        }
        mostSignificantBits = mostSignificantBits2 | j2;
        return new UUID(mostSignificantBits, uuidRandomUUID.getLeastSignificantBits());
    }
}
