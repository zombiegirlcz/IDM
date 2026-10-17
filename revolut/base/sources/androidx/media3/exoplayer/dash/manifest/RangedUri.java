package androidx.media3.exoplayer.dash.manifest;

import a0.d;
import android.net.Uri;
import androidx.media3.common.util.UriUtil;

/* JADX INFO: loaded from: classes15.dex */
public final class RangedUri {
    private int hashCode;
    public final long length;
    private final String referenceUri;
    public final long start;

    public RangedUri(String str, long j2, long j3) {
        this.referenceUri = str == null ? "" : str;
        this.start = j2;
        this.length = j3;
    }

    public RangedUri attemptMerge(RangedUri rangedUri, String str) {
        String strResolveUriString = resolveUriString(str);
        RangedUri rangedUri2 = null;
        if (rangedUri != null && strResolveUriString.equals(rangedUri.resolveUriString(str))) {
            long j2 = this.length;
            if (j2 != -1) {
                long j3 = this.start;
                if (j3 + j2 == rangedUri.start) {
                    long j5 = rangedUri.length;
                    return new RangedUri(strResolveUriString, j3, j5 != -1 ? j2 + j5 : -1L);
                }
            }
            long j16 = rangedUri.length;
            if (j16 != -1) {
                long j22 = rangedUri.start;
                if (j22 + j16 == this.start) {
                    rangedUri2 = new RangedUri(strResolveUriString, j22, j2 != -1 ? j16 + j2 : -1L);
                }
            }
        }
        return rangedUri2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && RangedUri.class == obj2.getClass()) {
            RangedUri rangedUri = (RangedUri) obj2;
            if (this.start == rangedUri.start && this.length == rangedUri.length && this.referenceUri.equals(rangedUri.referenceUri)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = this.referenceUri.hashCode() + ((((527 + ((int) this.start)) * 31) + ((int) this.length)) * 31);
        }
        return this.hashCode;
    }

    public Uri resolveUri(String str) {
        return UriUtil.resolveToUri(str, this.referenceUri);
    }

    public String resolveUriString(String str) {
        return UriUtil.resolve(str, this.referenceUri);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("RangedUri(referenceUri=");
        sb6.append(this.referenceUri);
        sb6.append(", start=");
        sb6.append(this.start);
        sb6.append(", length=");
        return d.j(this.length, ")", sb6);
    }
}
