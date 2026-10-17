package ch.qos.logback.core.util;

/* JADX INFO: loaded from: classes.dex */
public class DefaultInvocationGate implements InvocationGate {
    static final int DEFAULT_MASK = 15;
    static final int MASK_DECREASE_RIGHT_SHIFT_COUNT = 2;
    private static final long MASK_DECREASE_THRESHOLD = 800;
    private static final long MASK_INCREASE_THRESHOLD = 100;
    private static final int MAX_MASK = 65535;
    private long invocationCounter;
    long lowerLimitForMaskMatch;
    private volatile long mask;
    private long maxDelayThreshold;
    private long minDelayThreshold;
    long upperLimitForNoMaskMatch;

    public DefaultInvocationGate() {
        this(100L, MASK_DECREASE_THRESHOLD, System.currentTimeMillis());
    }

    private void decreaseMask() {
        this.mask >>>= 2;
    }

    private void increaseMask() {
        if (this.mask >= 65535) {
            return;
        }
        this.mask = (this.mask << 1) | 1;
    }

    private void updateLimits(long j2) {
        this.lowerLimitForMaskMatch = this.minDelayThreshold + j2;
        this.upperLimitForNoMaskMatch = j2 + this.maxDelayThreshold;
    }

    public long getInvocationCounter() {
        return this.invocationCounter;
    }

    public long getMask() {
        return this.mask;
    }

    @Override // ch.qos.logback.core.util.InvocationGate
    public final boolean isTooSoon(long j2) {
        long j3 = this.invocationCounter;
        this.invocationCounter = 1 + j3;
        boolean z = (j3 & this.mask) == this.mask;
        if (z) {
            if (j2 < this.lowerLimitForMaskMatch) {
                increaseMask();
            }
            updateLimits(j2);
        } else if (j2 > this.upperLimitForNoMaskMatch) {
            decreaseMask();
            updateLimits(j2);
            return false;
        }
        return !z;
    }

    public DefaultInvocationGate(long j2, long j3, long j5) {
        this.mask = 15L;
        this.invocationCounter = 0L;
        this.minDelayThreshold = j2;
        this.maxDelayThreshold = j3;
        this.lowerLimitForMaskMatch = j2 + j5;
        this.upperLimitForNoMaskMatch = j5 + j3;
    }
}
