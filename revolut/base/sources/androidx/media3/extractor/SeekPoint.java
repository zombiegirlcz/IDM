package androidx.media3.extractor;

import a0.d;

/* JADX INFO: loaded from: classes15.dex */
public final class SeekPoint {
    public static final SeekPoint START = new SeekPoint(0, 0);
    public final long position;
    public final long timeUs;

    public SeekPoint(long j2, long j3) {
        this.timeUs = j2;
        this.position = j3;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && SeekPoint.class == obj2.getClass()) {
            SeekPoint seekPoint = (SeekPoint) obj2;
            if (this.timeUs == seekPoint.timeUs && this.position == seekPoint.position) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.timeUs) * 31) + ((int) this.position);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("[timeUs=");
        sb6.append(this.timeUs);
        sb6.append(", position=");
        return d.j(this.position, "]", sb6);
    }
}
