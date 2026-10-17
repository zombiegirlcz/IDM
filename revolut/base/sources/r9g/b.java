package r9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u0010\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\r\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"Lr9g/b;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "f", "()Ljo3/a;", "originalRefund", "b", "cancellationFee", "c", "d", "cashbackReversal", "e", "monetaryRefund", "Lr9g/v;", "Lr9g/v;", "g", "()Lr9g/v;", "pointsRefund", "cancellationMonetaryFee", "cancellationPointsFee", "h", "Ljava/lang/String;", "pointsRewardReversal", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("originalRefund")
    private final jo3.a originalRefund;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationFee")
    private final jo3.a cancellationFee;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashbackReversal")
    private final jo3.a cashbackReversal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("monetaryRefund")
    private final jo3.a monetaryRefund;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pointsRefund")
    private final v pointsRefund;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cancellationMonetaryFee")
    private final jo3.a cancellationMonetaryFee;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationPointsFee")
    private final v cancellationPointsFee;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsRewardReversal")
    private final String pointsRewardReversal;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getCancellationFee() {
        return this.cancellationFee;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getCancellationMonetaryFee() {
        return this.cancellationMonetaryFee;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final v getCancellationPointsFee() {
        return this.cancellationPointsFee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getCashbackReversal() {
        return this.cashbackReversal;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getMonetaryRefund() {
        return this.monetaryRefund;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.originalRefund, bVar.originalRefund) && Intrinsics.f(this.cancellationFee, bVar.cancellationFee) && Intrinsics.f(this.cashbackReversal, bVar.cashbackReversal) && Intrinsics.f(this.monetaryRefund, bVar.monetaryRefund) && Intrinsics.f(this.pointsRefund, bVar.pointsRefund) && Intrinsics.f(this.cancellationMonetaryFee, bVar.cancellationMonetaryFee) && Intrinsics.f(this.cancellationPointsFee, bVar.cancellationPointsFee) && Intrinsics.f(this.pointsRewardReversal, bVar.pointsRewardReversal);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getOriginalRefund() {
        return this.originalRefund;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final v getPointsRefund() {
        return this.pointsRefund;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPointsRewardReversal() {
        return this.pointsRewardReversal;
    }

    public final int hashCode() {
        jo3.a aVar = this.originalRefund;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        jo3.a aVar2 = this.cancellationFee;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.cashbackReversal;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        jo3.a aVar4 = this.monetaryRefund;
        int iHashCode4 = (iHashCode3 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        v vVar = this.pointsRefund;
        int iHashCode5 = (iHashCode4 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        jo3.a aVar5 = this.cancellationMonetaryFee;
        int iHashCode6 = (iHashCode5 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        v vVar2 = this.cancellationPointsFee;
        int iHashCode7 = (iHashCode6 + (vVar2 == null ? 0 : vVar2.hashCode())) * 31;
        String str = this.pointsRewardReversal;
        return iHashCode7 + (str != null ? str.hashCode() : 0);
    }
}
