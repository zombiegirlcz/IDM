package c97;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Lc97/l;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "firstSearchDelayMs", "b", "subsequentSearchDelayMs", "c", "thresholdMs", "feature_global_search_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstSearchDelayMs")
    private final long firstSearchDelayMs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subsequentSearchDelayMs")
    private final long subsequentSearchDelayMs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("thresholdMs")
    private final long thresholdMs;

    public l(long j2, long j3, long j5) {
        this.firstSearchDelayMs = j2;
        this.subsequentSearchDelayMs = j3;
        this.thresholdMs = j5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getFirstSearchDelayMs() {
        return this.firstSearchDelayMs;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getSubsequentSearchDelayMs() {
        return this.subsequentSearchDelayMs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getThresholdMs() {
        return this.thresholdMs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.firstSearchDelayMs == lVar.firstSearchDelayMs && this.subsequentSearchDelayMs == lVar.subsequentSearchDelayMs && this.thresholdMs == lVar.thresholdMs;
    }

    public final int hashCode() {
        return Long.hashCode(this.thresholdMs) + a0.d.c(Long.hashCode(this.firstSearchDelayMs) * 31, 31, this.subsequentSearchDelayMs);
    }
}
