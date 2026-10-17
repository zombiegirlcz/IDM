package androidx.media3.extractor;

import com.google.common.base.Preconditions;
import v0.a;

/* JADX INFO: loaded from: classes.dex */
public interface SeekMap {

    /* JADX INFO: loaded from: classes15.dex */
    public static final class SeekPoints {
        public final SeekPoint first;
        public final SeekPoint second;

        public SeekPoints(SeekPoint seekPoint) {
            this(seekPoint, seekPoint);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 != null && SeekPoints.class == obj2.getClass()) {
                SeekPoints seekPoints = (SeekPoints) obj2;
                if (this.first.equals(seekPoints.first) && this.second.equals(seekPoints.second)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.second.hashCode() + (this.first.hashCode() * 31);
        }

        public String toString() {
            String str;
            StringBuilder sb6 = new StringBuilder("[");
            sb6.append(this.first);
            if (this.first.equals(this.second)) {
                str = "";
            } else {
                str = ", " + this.second;
            }
            return a.i(sb6, str, "]");
        }

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            this.first = (SeekPoint) Preconditions.checkNotNull(seekPoint);
            this.second = (SeekPoint) Preconditions.checkNotNull(seekPoint2);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class Unseekable implements SeekMap {
        private final long durationUs;
        private final SeekPoints startSeekPoints;

        public Unseekable(long j2) {
            this(j2, 0L);
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekPoints getSeekPoints(long j2) {
            return this.startSeekPoints;
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return false;
        }

        public Unseekable(long j2, long j3) {
            this.durationUs = j2;
            this.startSeekPoints = new SeekPoints(j3 == 0 ? SeekPoint.START : new SeekPoint(0L, j3));
        }
    }

    long getDurationUs();

    SeekPoints getSeekPoints(long j2);

    boolean isSeekable();
}
