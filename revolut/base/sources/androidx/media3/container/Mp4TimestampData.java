package androidx.media3.container;

import androidx.media3.common.Metadata;
import com.google.common.primitives.Longs;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4TimestampData implements Metadata.Entry {
    public final long creationTimestampSeconds;
    public final long modificationTimestampSeconds;
    public final long timescale;

    public Mp4TimestampData(long j2, long j3) {
        this.creationTimestampSeconds = j2;
        this.modificationTimestampSeconds = j3;
        this.timescale = -1L;
    }

    public static long unixTimeToMp4TimeSeconds(long j2) {
        return (j2 / 1000) + 2082844800;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Mp4TimestampData)) {
            return false;
        }
        Mp4TimestampData mp4TimestampData = (Mp4TimestampData) obj2;
        return this.creationTimestampSeconds == mp4TimestampData.creationTimestampSeconds && this.modificationTimestampSeconds == mp4TimestampData.modificationTimestampSeconds && this.timescale == mp4TimestampData.timescale;
    }

    public int hashCode() {
        return Longs.hashCode(this.timescale) + ((Longs.hashCode(this.modificationTimestampSeconds) + ((Longs.hashCode(this.creationTimestampSeconds) + 527) * 31)) * 31);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.creationTimestampSeconds + ", modification time=" + this.modificationTimestampSeconds + ", timescale=" + this.timescale;
    }

    public Mp4TimestampData(long j2, long j3, long j5) {
        this.creationTimestampSeconds = j2;
        this.modificationTimestampSeconds = j3;
        this.timescale = j5;
    }
}
