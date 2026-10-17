package a9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u0010\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\r\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"La9g/e;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "f", "()Ljo3/b;", "originalRefund", "b", "cancellationFee", "c", "d", "cashbackReversal", "e", "monetaryRefund", "La9g/c2;", "La9g/c2;", "g", "()La9g/c2;", "pointsRefund", "cancellationMonetaryFee", "cancellationPointsFee", "h", "Ljava/lang/String;", "pointsRewardReversal", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("originalRefund")
    private final jo3.b originalRefund;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationFee")
    private final jo3.b cancellationFee;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashbackReversal")
    private final jo3.b cashbackReversal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("monetaryRefund")
    private final jo3.b monetaryRefund;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pointsRefund")
    private final c2 pointsRefund;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cancellationMonetaryFee")
    private final jo3.b cancellationMonetaryFee;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationPointsFee")
    private final c2 cancellationPointsFee;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsRewardReversal")
    private final String pointsRewardReversal;

    public e(jo3.b bVar, jo3.b bVar2, jo3.b bVar3, jo3.b bVar4, c2 c2Var, jo3.b bVar5, c2 c2Var2, String str) {
        this.originalRefund = bVar;
        this.cancellationFee = bVar2;
        this.cashbackReversal = bVar3;
        this.monetaryRefund = bVar4;
        this.pointsRefund = c2Var;
        this.cancellationMonetaryFee = bVar5;
        this.cancellationPointsFee = c2Var2;
        this.pointsRewardReversal = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getCancellationFee() {
        return this.cancellationFee;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getCancellationMonetaryFee() {
        return this.cancellationMonetaryFee;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c2 getCancellationPointsFee() {
        return this.cancellationPointsFee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getCashbackReversal() {
        return this.cashbackReversal;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getMonetaryRefund() {
        return this.monetaryRefund;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.originalRefund, eVar.originalRefund) && Intrinsics.f(this.cancellationFee, eVar.cancellationFee) && Intrinsics.f(this.cashbackReversal, eVar.cashbackReversal) && Intrinsics.f(this.monetaryRefund, eVar.monetaryRefund) && Intrinsics.f(this.pointsRefund, eVar.pointsRefund) && Intrinsics.f(this.cancellationMonetaryFee, eVar.cancellationMonetaryFee) && Intrinsics.f(this.cancellationPointsFee, eVar.cancellationPointsFee) && Intrinsics.f(this.pointsRewardReversal, eVar.pointsRewardReversal);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.b getOriginalRefund() {
        return this.originalRefund;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c2 getPointsRefund() {
        return this.pointsRefund;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPointsRewardReversal() {
        return this.pointsRewardReversal;
    }

    public final int hashCode() {
        jo3.b bVar = this.originalRefund;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        jo3.b bVar2 = this.cancellationFee;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.cashbackReversal;
        int iHashCode3 = (iHashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        jo3.b bVar4 = this.monetaryRefund;
        int iHashCode4 = (iHashCode3 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31;
        c2 c2Var = this.pointsRefund;
        int iHashCode5 = (iHashCode4 + (c2Var == null ? 0 : c2Var.hashCode())) * 31;
        jo3.b bVar5 = this.cancellationMonetaryFee;
        int iHashCode6 = (iHashCode5 + (bVar5 == null ? 0 : bVar5.hashCode())) * 31;
        c2 c2Var2 = this.cancellationPointsFee;
        int iHashCode7 = (iHashCode6 + (c2Var2 == null ? 0 : c2Var2.hashCode())) * 31;
        String str = this.pointsRewardReversal;
        return iHashCode7 + (str != null ? str.hashCode() : 0);
    }
}
