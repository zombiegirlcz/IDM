package r9g;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u0006\u0010\u001a¨\u0006\u001c"}, d2 = {"Lr9g/w;", "", "", "toString", "()Ljava/lang/String;", "Lr9g/b0;", "a", "Lr9g/b0;", "b", "()Lr9g/b0;", "overallPrice", "e", "priceInRequestedCurrency", "", "Lr9g/d0;", "c", "Ljava/util/List;", "()Ljava/util/List;", "pointsRedeemOptions", "Ljo3/a;", "d", "Ljo3/a;", "()Ljo3/a;", "pointsReward", "Lofi/d;", "Lofi/d;", "()Lofi/d;", "cashback", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("overallPrice")
    @NotNull
    private final b0 overallPrice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("priceInRequestedCurrency")
    @NotNull
    private final b0 priceInRequestedCurrency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsRedeemOptions")
    private final List<d0> pointsRedeemOptions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pointsReward")
    private final jo3.a pointsReward;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cashback")
    private final ofi.d cashback;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ofi.d getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getOverallPrice() {
        return this.overallPrice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPointsRedeemOptions() {
        return this.pointsRedeemOptions;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getPointsReward() {
        return this.pointsReward;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getPriceInRequestedCurrency() {
        return this.priceInRequestedCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.overallPrice, wVar.overallPrice) && Intrinsics.f(this.priceInRequestedCurrency, wVar.priceInRequestedCurrency) && Intrinsics.f(this.pointsRedeemOptions, wVar.pointsRedeemOptions) && Intrinsics.f(this.pointsReward, wVar.pointsReward) && Intrinsics.f(this.cashback, wVar.cashback);
    }

    public final int hashCode() {
        int iHashCode = (this.priceInRequestedCurrency.hashCode() + (this.overallPrice.hashCode() * 31)) * 31;
        List<d0> list = this.pointsRedeemOptions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        jo3.a aVar = this.pointsReward;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ofi.d dVar = this.cashback;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }
}
