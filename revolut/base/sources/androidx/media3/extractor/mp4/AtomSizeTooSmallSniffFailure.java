package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SniffFailure;
import j6.a;

/* JADX INFO: loaded from: classes15.dex */
public final class AtomSizeTooSmallSniffFailure implements SniffFailure {
    public final long atomSize;
    public final int atomType;
    public final int minimumHeaderSize;

    public AtomSizeTooSmallSniffFailure(int i, long j2, int i2) {
        this.atomType = i;
        this.atomSize = j2;
        this.minimumHeaderSize = i2;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("AtomSizeTooSmall{type=");
        sb6.append(Util.toFourccString(this.atomType));
        sb6.append(", size=");
        sb6.append(this.atomSize);
        sb6.append(", minHeaderSize=");
        return a.v(sb6, "}", this.minimumHeaderSize);
    }
}
