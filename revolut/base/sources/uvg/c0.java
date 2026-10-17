package uvg;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0011"}, d2 = {"Luvg/c0;", "", "", "toString", "()Ljava/lang/String;", "Lorg/joda/time/DateTime;", "a", "Lorg/joda/time/DateTime;", "c", "()Lorg/joda/time/DateTime;", "timestamp", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "amount", "cumulativeNetTopUp", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("timestamp")
    @NotNull
    private final DateTime timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cumulativeNetTopUp")
    private final jo3.a cumulativeNetTopUp;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getCumulativeNetTopUp() {
        return this.cumulativeNetTopUp;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.timestamp, c0Var.timestamp) && Intrinsics.f(this.amount, c0Var.amount) && Intrinsics.f(this.cumulativeNetTopUp, c0Var.cumulativeNetTopUp);
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, this.timestamp.hashCode() * 31, 31);
        jo3.a aVar = this.cumulativeNetTopUp;
        return iJ + (aVar == null ? 0 : aVar.hashCode());
    }
}
