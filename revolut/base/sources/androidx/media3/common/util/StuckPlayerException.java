package androidx.media3.common.util;

/* JADX INFO: loaded from: classes15.dex */
public final class StuckPlayerException extends IllegalStateException {
    public final int stuckType;
    public final int timeoutMs;

    public StuckPlayerException(int i, int i2) {
        super(getMessage(i, i2));
        this.stuckType = i;
        this.timeoutMs = i2;
    }

    private static String getMessage(int i, int i2) {
        if (i == 0) {
            return j6.a.l(i2, "Player stuck buffering and not loading for ", " ms");
        }
        if (i == 1) {
            return j6.a.l(i2, "Player stuck buffering with no progress for ", " ms");
        }
        if (i == 2) {
            return j6.a.l(i2, "Player stuck playing with no progress for ", " ms");
        }
        if (i == 3) {
            return j6.a.l(i2, "Player stuck playing without ending for ", " ms");
        }
        if (i == 4) {
            return j6.a.l(i2, "Player stuck suppressed for ", " ms");
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && StuckPlayerException.class == obj2.getClass()) {
            StuckPlayerException stuckPlayerException = (StuckPlayerException) obj2;
            if (this.stuckType == stuckPlayerException.stuckType && this.timeoutMs == stuckPlayerException.timeoutMs) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.stuckType) * 31) + this.timeoutMs;
    }
}
