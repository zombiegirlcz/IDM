package androidx.media3.common.util;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class TimestampAdjuster {
    private long firstSampleTimestampUs;
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();
    private long timestampOffsetUs;

    public TimestampAdjuster(long j2) {
        reset(j2);
    }

    public static long ptsToUs(long j2) {
        return Util.scaleLargeTimestamp(j2, 1000000L, 90000L);
    }

    public static long usToNonWrappedPts(long j2) {
        return Util.scaleLargeTimestamp(j2, 90000L, 1000000L);
    }

    public static long usToWrappedPts(long j2) {
        return usToNonWrappedPts(j2) % 8589934592L;
    }

    public synchronized long adjustSampleTimestamp(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!isInitialized()) {
                long jLongValue = this.firstSampleTimestampUs;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) Preconditions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
                }
                this.timestampOffsetUs = jLongValue - j2;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j2;
            return j2 + this.timestampOffsetUs;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public synchronized long adjustTsTimestamp(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.lastUnadjustedTimestampUs;
            if (j3 != -9223372036854775807L) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j3);
                long j5 = (4294967296L + jUsToNonWrappedPts) / 8589934592L;
                long j16 = ((j5 - 1) * 8589934592L) + j2;
                long j22 = (j5 * 8589934592L) + j2;
                j2 = Math.abs(j16 - jUsToNonWrappedPts) < Math.abs(j22 - jUsToNonWrappedPts) ? j16 : j22;
            }
            return adjustSampleTimestamp(ptsToUs(j2));
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public synchronized long adjustTsTimestampGreaterThanPreviousTimestamp(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.lastUnadjustedTimestampUs;
            if (j3 != -9223372036854775807L) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j3);
                long j5 = jUsToNonWrappedPts / 8589934592L;
                long j16 = (j5 * 8589934592L) + j2;
                j2 = j16 >= jUsToNonWrappedPts ? j16 : ((j5 + 1) * 8589934592L) + j2;
            }
            return adjustSampleTimestamp(ptsToUs(j2));
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j2;
        j2 = this.firstSampleTimestampUs;
        if (j2 == Long.MAX_VALUE || j2 == 9223372036854775806L) {
            j2 = -9223372036854775807L;
        }
        return j2;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j2;
        try {
            j2 = this.lastUnadjustedTimestampUs;
        } catch (Throwable th10) {
            throw th10;
        }
        return j2 != -9223372036854775807L ? j2 + this.timestampOffsetUs : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized boolean isInitialized() {
        return this.timestampOffsetUs != -9223372036854775807L;
    }

    public synchronized void reset(long j2) {
        this.firstSampleTimestampUs = j2;
        this.timestampOffsetUs = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = -9223372036854775807L;
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j2, long j3) throws InterruptedException, TimeoutException {
        try {
            Preconditions.checkState(this.firstSampleTimestampUs == 9223372036854775806L);
            if (isInitialized()) {
                return;
            }
            if (z) {
                this.nextSampleTimestampUs.set(Long.valueOf(j2));
            } else {
                long jElapsedRealtime = 0;
                long j5 = j3;
                while (!isInitialized()) {
                    if (j3 == 0) {
                        wait();
                    } else {
                        Preconditions.checkState(j5 > 0);
                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                        wait(j5);
                        jElapsedRealtime += android.os.SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j3 && !isInitialized()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j3 + " milliseconds");
                        }
                        j5 = j3 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
