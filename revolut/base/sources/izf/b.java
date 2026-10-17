package izf;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u000e"}, d2 = {"Lizf/b;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "refund", "b", "penalty", "cashbackReversal", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("refund")
    @NotNull
    private final jo3.a refund;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("penalty")
    @NotNull
    private final jo3.a penalty;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashbackReversal")
    @NotNull
    private final jo3.a cashbackReversal;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getCashbackReversal() {
        return this.cashbackReversal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getPenalty() {
        return this.penalty;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getRefund() {
        return this.refund;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.refund, bVar.refund) && Intrinsics.f(this.penalty, bVar.penalty) && Intrinsics.f(this.cashbackReversal, bVar.cashbackReversal);
    }

    public final int hashCode() {
        return this.cashbackReversal.hashCode() + v7.j(this.penalty, this.refund.hashCode() * 31, 31);
    }
}
