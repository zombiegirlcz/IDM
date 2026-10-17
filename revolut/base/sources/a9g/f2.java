package a9g;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0010\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006%"}, d2 = {"La9g/f2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "type", "", "b", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "isBestPrice", "La9g/b2;", "c", "La9g/b2;", "()La9g/b2;", "overallPrice", "d", "e", "priceInRequestedCurrency", "La9g/h;", "La9g/h;", "()La9g/h;", "cashback", "", "La9g/d2;", "f", "Ljava/util/List;", "()Ljava/util/List;", "pointsRedeemOptions", "pointsReward", "La9g/d2;", "()La9g/d2;", "redeemedPoints", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f2 {

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
    private final b2 overallPrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("priceInRequestedCurrency")
    private final b2 priceInRequestedCurrency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cashback")
    private final h cashback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("pointsRedeemOptions")
    private final List<d2> pointsRedeemOptions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsReward")
    private final String pointsReward;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("redeemedPoints")
    private final d2 redeemedPoints;

    public f2(String type, Boolean bool, b2 overallPrice, b2 b2Var, h hVar, ArrayList arrayList, String str, d2 d2Var) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(overallPrice, "overallPrice");
        this.type = type;
        this.isBestPrice = bool;
        this.overallPrice = overallPrice;
        this.priceInRequestedCurrency = b2Var;
        this.cashback = hVar;
        this.pointsRedeemOptions = arrayList;
        this.pointsReward = str;
        this.redeemedPoints = d2Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b2 getOverallPrice() {
        return this.overallPrice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPointsRedeemOptions() {
        return this.pointsRedeemOptions;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPointsReward() {
        return this.pointsReward;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b2 getPriceInRequestedCurrency() {
        return this.priceInRequestedCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj2;
        return Intrinsics.f(this.type, f2Var.type) && Intrinsics.f(this.isBestPrice, f2Var.isBestPrice) && Intrinsics.f(this.overallPrice, f2Var.overallPrice) && Intrinsics.f(this.priceInRequestedCurrency, f2Var.priceInRequestedCurrency) && Intrinsics.f(this.cashback, f2Var.cashback) && Intrinsics.f(this.pointsRedeemOptions, f2Var.pointsRedeemOptions) && Intrinsics.f(this.pointsReward, f2Var.pointsReward) && Intrinsics.f(this.redeemedPoints, f2Var.redeemedPoints);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d2 getRedeemedPoints() {
        return this.redeemedPoints;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getIsBestPrice() {
        return this.isBestPrice;
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Boolean bool = this.isBestPrice;
        int iHashCode2 = (this.overallPrice.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        b2 b2Var = this.priceInRequestedCurrency;
        int iHashCode3 = (iHashCode2 + (b2Var == null ? 0 : b2Var.hashCode())) * 31;
        h hVar = this.cashback;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        List<d2> list = this.pointsRedeemOptions;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.pointsReward;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        d2 d2Var = this.redeemedPoints;
        return iHashCode6 + (d2Var != null ? d2Var.hashCode() : 0);
    }
}
