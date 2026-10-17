package yzf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0019"}, d2 = {"Lyzf/a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "b", "()Ljo3/b;", "overallPrice", "e", "priceInRequestedCurrency", "Llzf/a;", "c", "Llzf/a;", "()Llzf/a;", "cashback", "Lwzf/a;", "d", "Lwzf/a;", "()Lwzf/a;", "pointsOption", "Ljava/lang/String;", "pointsReward", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("overallPrice")
    @NotNull
    private final jo3.b overallPrice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("priceInRequestedCurrency")
    @NotNull
    private final jo3.b priceInRequestedCurrency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("cashback")
    @NotNull
    private final lzf.a cashback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("pointsOption")
    private final wzf.a pointsOption;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("pointsReward")
    private final String pointsReward;

    public a(jo3.b overallPrice, jo3.b priceInRequestedCurrency, lzf.a cashback, wzf.a aVar, String str) {
        Intrinsics.checkNotNullParameter(overallPrice, "overallPrice");
        Intrinsics.checkNotNullParameter(priceInRequestedCurrency, "priceInRequestedCurrency");
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        this.overallPrice = overallPrice;
        this.priceInRequestedCurrency = priceInRequestedCurrency;
        this.cashback = cashback;
        this.pointsOption = aVar;
        this.pointsReward = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final lzf.a getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getOverallPrice() {
        return this.overallPrice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final wzf.a getPointsOption() {
        return this.pointsOption;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPointsReward() {
        return this.pointsReward;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getPriceInRequestedCurrency() {
        return this.priceInRequestedCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.overallPrice, aVar.overallPrice) && Intrinsics.f(this.priceInRequestedCurrency, aVar.priceInRequestedCurrency) && Intrinsics.f(this.cashback, aVar.cashback) && Intrinsics.f(this.pointsOption, aVar.pointsOption) && Intrinsics.f(this.pointsReward, aVar.pointsReward);
    }

    public final int hashCode() {
        int iHashCode = (this.cashback.hashCode() + y.e(this.priceInRequestedCurrency, this.overallPrice.hashCode() * 31, 31)) * 31;
        wzf.a aVar = this.pointsOption;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.pointsReward;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
