package xei;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001c\u0010*\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b\u001e\u0010)R\"\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b\n\u0010 ¨\u0006,"}, d2 = {"Lxei/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "type", "", "b", "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "isBestPrice", "Lxei/g;", "c", "Lxei/g;", "()Lxei/g;", "overallPrice", "d", "g", "priceInRequestedCurrency", "Lxei/a;", "e", "Lxei/a;", "()Lxei/a;", "cashback", "", "Lxei/h;", "f", "Ljava/util/List;", "()Ljava/util/List;", "pointsRedeemOptions", "pointsReward", "h", "Lxei/h;", "()Lxei/h;", "redeemedPoints", "Lxei/i;", "Lxei/i;", "()Lxei/i;", "pointsRewardRate", "discounts", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

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
    private final g overallPrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("priceInRequestedCurrency")
    private final g priceInRequestedCurrency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cashback")
    private final a cashback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("pointsRedeemOptions")
    private final List<h> pointsRedeemOptions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsReward")
    private final String pointsReward;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("redeemedPoints")
    private final h redeemedPoints;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("pointsRewardRate")
    private final i pointsRewardRate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("discounts")
    private final List<String> discounts;

    public k(String type, Boolean bool, g overallPrice, g gVar, a aVar, ArrayList arrayList, String str, h hVar, i iVar, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(overallPrice, "overallPrice");
        this.type = type;
        this.isBestPrice = bool;
        this.overallPrice = overallPrice;
        this.priceInRequestedCurrency = gVar;
        this.cashback = aVar;
        this.pointsRedeemOptions = arrayList;
        this.pointsReward = str;
        this.redeemedPoints = hVar;
        this.pointsRewardRate = iVar;
        this.discounts = arrayList2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDiscounts() {
        return this.discounts;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getOverallPrice() {
        return this.overallPrice;
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
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.type, kVar.type) && Intrinsics.f(this.isBestPrice, kVar.isBestPrice) && Intrinsics.f(this.overallPrice, kVar.overallPrice) && Intrinsics.f(this.priceInRequestedCurrency, kVar.priceInRequestedCurrency) && Intrinsics.f(this.cashback, kVar.cashback) && Intrinsics.f(this.pointsRedeemOptions, kVar.pointsRedeemOptions) && Intrinsics.f(this.pointsReward, kVar.pointsReward) && Intrinsics.f(this.redeemedPoints, kVar.redeemedPoints) && Intrinsics.f(this.pointsRewardRate, kVar.pointsRewardRate) && Intrinsics.f(this.discounts, kVar.discounts);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final i getPointsRewardRate() {
        return this.pointsRewardRate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g getPriceInRequestedCurrency() {
        return this.priceInRequestedCurrency;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final h getRedeemedPoints() {
        return this.redeemedPoints;
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Boolean bool = this.isBestPrice;
        int iHashCode2 = (this.overallPrice.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        g gVar = this.priceInRequestedCurrency;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        a aVar = this.cashback;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<h> list = this.pointsRedeemOptions;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.pointsReward;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.redeemedPoints;
        int iHashCode7 = (iHashCode6 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i iVar = this.pointsRewardRate;
        int iHashCode8 = (iHashCode7 + (iVar == null ? 0 : iVar.hashCode())) * 31;
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
