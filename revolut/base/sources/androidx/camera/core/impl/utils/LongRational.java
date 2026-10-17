package androidx.camera.core.impl.utils;

/* JADX INFO: loaded from: classes15.dex */
final class LongRational {
    private final long mDenominator;
    private final long mNumerator;

    public LongRational(long j2, long j3) {
        this.mNumerator = j2;
        this.mDenominator = j3;
    }

    public long getDenominator() {
        return this.mDenominator;
    }

    public long getNumerator() {
        return this.mNumerator;
    }

    public String toString() {
        return this.mNumerator + "/" + this.mDenominator;
    }

    public LongRational(double d) {
        this((long) (d * 10000.0d), 10000L);
    }
}
