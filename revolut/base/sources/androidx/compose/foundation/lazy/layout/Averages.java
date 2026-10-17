package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b!\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0003R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u000fR\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u000fR\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u000fR\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u000fR\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010\u000fR\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0016¨\u0006."}, d2 = {"Landroidx/compose/foundation/lazy/layout/Averages;", "", "<init>", "()V", "", "new", "current", "calculateAverageTime", "(JJ)J", "", "calculateAverageCount", "(II)I", "timeNanos", "", "saveCompositionTimeNanos", "(J)V", "saveResumeTimeNanos", "savePauseTimeNanos", "saveApplyTimeNanos", "saveMeasureTimeNanos", "count", "saveNestedPrefetchCount", "(I)V", "clearMeasureTime", "compositionTimeNanos", "J", "getCompositionTimeNanos", "()J", "setCompositionTimeNanos", "resumeTimeNanos", "getResumeTimeNanos", "setResumeTimeNanos", "pauseTimeNanos", "getPauseTimeNanos", "setPauseTimeNanos", "applyTimeNanos", "getApplyTimeNanos", "setApplyTimeNanos", "measureTimeNanos", "getMeasureTimeNanos", "setMeasureTimeNanos", "nestedPrefetchCount", "I", "getNestedPrefetchCount", "()I", "setNestedPrefetchCount", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Averages {
    private long applyTimeNanos;
    private long compositionTimeNanos;
    private long measureTimeNanos;
    private int nestedPrefetchCount = -1;
    private long pauseTimeNanos;
    private long resumeTimeNanos;

    private final int calculateAverageCount(int i, int current) {
        return current == -1 ? i : ((current * 3) + i) / 4;
    }

    private final long calculateAverageTime(long j2, long current) {
        if (current == 0) {
            return j2;
        }
        long j3 = 4;
        return (j2 / j3) + ((current / j3) * ((long) 3));
    }

    public final void clearMeasureTime() {
        this.measureTimeNanos = 0L;
    }

    public final long getApplyTimeNanos() {
        return this.applyTimeNanos;
    }

    public final long getCompositionTimeNanos() {
        return this.compositionTimeNanos;
    }

    public final long getMeasureTimeNanos() {
        return this.measureTimeNanos;
    }

    public final int getNestedPrefetchCount() {
        return this.nestedPrefetchCount;
    }

    public final long getPauseTimeNanos() {
        return this.pauseTimeNanos;
    }

    public final long getResumeTimeNanos() {
        return this.resumeTimeNanos;
    }

    public final void saveApplyTimeNanos(long timeNanos) {
        this.applyTimeNanos = calculateAverageTime(timeNanos, this.applyTimeNanos);
    }

    public final void saveCompositionTimeNanos(long timeNanos) {
        this.compositionTimeNanos = calculateAverageTime(timeNanos, this.compositionTimeNanos);
    }

    public final void saveMeasureTimeNanos(long timeNanos) {
        this.measureTimeNanos = calculateAverageTime(timeNanos, this.measureTimeNanos);
    }

    public final void saveNestedPrefetchCount(int count) {
        this.nestedPrefetchCount = calculateAverageCount(count, this.nestedPrefetchCount);
    }

    public final void savePauseTimeNanos(long timeNanos) {
        this.pauseTimeNanos = calculateAverageTime(timeNanos, this.pauseTimeNanos);
    }

    public final void saveResumeTimeNanos(long timeNanos) {
        this.resumeTimeNanos = calculateAverageTime(timeNanos, this.resumeTimeNanos);
    }
}
