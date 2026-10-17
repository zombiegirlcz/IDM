package o7h;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lo7h/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "collectionKey", "baseCurrency", "Lo7h/g;", "c", "Lo7h/g;", "()Lo7h/g;", "performance", "", "d", "J", "()J", "timestamp", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("collectionKey")
    @NotNull
    private final String collectionKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("baseCurrency")
    @NotNull
    private final String baseCurrency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("performance")
    @NotNull
    private final g performance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("timestamp")
    private final long timestamp;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCollectionKey() {
        return this.collectionKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getPerformance() {
        return this.performance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.collectionKey, hVar.collectionKey) && Intrinsics.f(this.baseCurrency, hVar.baseCurrency) && Intrinsics.f(this.performance, hVar.performance) && this.timestamp == hVar.timestamp;
    }

    public final int hashCode() {
        return Long.hashCode(this.timestamp) + ((this.performance.hashCode() + p.a.c(this.collectionKey.hashCode() * 31, 31, this.baseCurrency)) * 31);
    }
}
