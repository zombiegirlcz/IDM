package pcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u000e\u0010\t¨\u0006\u0012"}, d2 = {"Lpcl/t;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "d", "()Ljo3/b;", "earningsPerShareRfy", "b", "e", "salesPerShareRfy", "c", "bookValuePerShareRfy", "cashFlowPerShareRfy", "cashPerShareRfy", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("earningsPerShareRfy")
    private final jo3.b earningsPerShareRfy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("salesPerShareRfy")
    private final jo3.b salesPerShareRfy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("bookValuePerShareRfy")
    private final jo3.b bookValuePerShareRfy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cashFlowPerShareRfy")
    private final jo3.b cashFlowPerShareRfy;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cashPerShareRfy")
    private final jo3.b cashPerShareRfy;

    public t(jo3.b bVar, jo3.b bVar2, jo3.b bVar3, jo3.b bVar4, jo3.b bVar5) {
        this.earningsPerShareRfy = bVar;
        this.salesPerShareRfy = bVar2;
        this.bookValuePerShareRfy = bVar3;
        this.cashFlowPerShareRfy = bVar4;
        this.cashPerShareRfy = bVar5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getBookValuePerShareRfy() {
        return this.bookValuePerShareRfy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getCashFlowPerShareRfy() {
        return this.cashFlowPerShareRfy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getCashPerShareRfy() {
        return this.cashPerShareRfy;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getEarningsPerShareRfy() {
        return this.earningsPerShareRfy;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getSalesPerShareRfy() {
        return this.salesPerShareRfy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.earningsPerShareRfy, tVar.earningsPerShareRfy) && Intrinsics.f(this.salesPerShareRfy, tVar.salesPerShareRfy) && Intrinsics.f(this.bookValuePerShareRfy, tVar.bookValuePerShareRfy) && Intrinsics.f(this.cashFlowPerShareRfy, tVar.cashFlowPerShareRfy) && Intrinsics.f(this.cashPerShareRfy, tVar.cashPerShareRfy);
    }

    public final int hashCode() {
        jo3.b bVar = this.earningsPerShareRfy;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        jo3.b bVar2 = this.salesPerShareRfy;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.bookValuePerShareRfy;
        int iHashCode3 = (iHashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        jo3.b bVar4 = this.cashFlowPerShareRfy;
        int iHashCode4 = (iHashCode3 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31;
        jo3.b bVar5 = this.cashPerShareRfy;
        return iHashCode4 + (bVar5 != null ? bVar5.hashCode() : 0);
    }
}
