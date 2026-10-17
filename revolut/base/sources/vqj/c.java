package vqj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"Lvqj/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "walletId", "b", "historyAvailableFrom", "", "Lvqj/f;", "Ljava/util/List;", "()Ljava/util/List;", "snapshots", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("walletId")
    @NotNull
    private final String walletId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("historyAvailableFrom")
    @NotNull
    private final String historyAvailableFrom;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("snapshots")
    @NotNull
    private final List<f> snapshots;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHistoryAvailableFrom() {
        return this.historyAvailableFrom;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getSnapshots() {
        return this.snapshots;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.walletId, cVar.walletId) && Intrinsics.f(this.historyAvailableFrom, cVar.historyAvailableFrom) && Intrinsics.f(this.snapshots, cVar.snapshots);
    }

    public final int hashCode() {
        return this.snapshots.hashCode() + p.a.c(this.walletId.hashCode() * 31, 31, this.historyAvailableFrom);
    }
}
