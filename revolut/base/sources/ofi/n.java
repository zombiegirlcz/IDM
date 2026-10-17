package ofi;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001c\u0010*\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b\u001e\u0010)R\"\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b\n\u0010 ¨\u0006,"}, d2 = {"Lofi/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "type", "", "b", "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "isBestPrice", "Lofi/j;", "c", "Lofi/j;", "()Lofi/j;", "overallPriceDto", "d", "g", "priceInRequestedCurrency", "Lofi/d;", "e", "Lofi/d;", "()Lofi/d;", "cashback", "", "Lofi/k;", "f", "Ljava/util/List;", "()Ljava/util/List;", "pointsRedeemOptions", "pointsReward", "h", "Lofi/k;", "()Lofi/k;", "redeemedPoints", "Lofi/l;", "Lofi/l;", "()Lofi/l;", "pointsRewardRate", "discounts", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("isBestPrice")
    private final Boolean isBestPrice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("overallPrice")
    @NotNull
    private final j overallPriceDto;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("priceInRequestedCurrency")
    private final j priceInRequestedCurrency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cashback")
    private final d cashback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("pointsRedeemOptions")
    private final List<k> pointsRedeemOptions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsReward")
    private final String pointsReward;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("redeemedPoints")
    private final k redeemedPoints;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("pointsRewardRate")
    private final l pointsRewardRate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("discounts")
    private final List<String> discounts;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDiscounts() {
        return this.discounts;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j getOverallPriceDto() {
        return this.overallPriceDto;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getPointsRedeemOptions() {
        return this.pointsRedeemOptions;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPointsReward() {
        return this.pointsReward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.type, nVar.type) && Intrinsics.f(this.isBestPrice, nVar.isBestPrice) && Intrinsics.f(this.overallPriceDto, nVar.overallPriceDto) && Intrinsics.f(this.priceInRequestedCurrency, nVar.priceInRequestedCurrency) && Intrinsics.f(this.cashback, nVar.cashback) && Intrinsics.f(this.pointsRedeemOptions, nVar.pointsRedeemOptions) && Intrinsics.f(this.pointsReward, nVar.pointsReward) && Intrinsics.f(this.redeemedPoints, nVar.redeemedPoints) && Intrinsics.f(this.pointsRewardRate, nVar.pointsRewardRate) && Intrinsics.f(this.discounts, nVar.discounts);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l getPointsRewardRate() {
        return this.pointsRewardRate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final j getPriceInRequestedCurrency() {
        return this.priceInRequestedCurrency;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final k getRedeemedPoints() {
        return this.redeemedPoints;
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Boolean bool = this.isBestPrice;
        int iHashCode2 = (this.overallPriceDto.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        j jVar = this.priceInRequestedCurrency;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        d dVar = this.cashback;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<k> list = this.pointsRedeemOptions;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.pointsReward;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        k kVar = this.redeemedPoints;
        int iHashCode7 = (iHashCode6 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l lVar = this.pointsRewardRate;
        int iHashCode8 = (iHashCode7 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        List<String> list2 = this.discounts;
        return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getIsBestPrice() {
        return this.isBestPrice;
    }
}
