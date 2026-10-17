package androidx.media3.extractor.metadata;

import androidx.media3.common.Metadata;
import com.google.common.primitives.Longs;

/* JADX INFO: loaded from: classes15.dex */
public final class ThumbnailMetadata implements Metadata.Entry {
    public final long presentationTimeUs;

    public ThumbnailMetadata(long j2) {
        this.presentationTimeUs = j2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return obj2 != null && ThumbnailMetadata.class == obj2.getClass() && this.presentationTimeUs == ((ThumbnailMetadata) obj2).presentationTimeUs;
    }

    public int hashCode() {
        return Longs.hashCode(this.presentationTimeUs) + 527;
    }

    public String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.presentationTimeUs;
    }
}
