package v9g;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, d2 = {"Lv9g/h;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "overallPrice", "d", "priceInRequestedCurrency", "Lv9g/d;", "c", "Lv9g/d;", "()Lv9g/d;", "cashback", "Lv9g/g;", "Lv9g/g;", "()Lv9g/g;", "pointsOption", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("overallPrice")
    @NotNull
    private final jo3.a overallPrice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("priceInRequestedCurrency")
    @NotNull
    private final jo3.a priceInRequestedCurrency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashback")
    @NotNull
    private final d cashback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pointsOption")
    private final g pointsOption;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getOverallPrice() {
        return this.overallPrice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getPointsOption() {
        return this.pointsOption;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getPriceInRequestedCurrency() {
        return this.priceInRequestedCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.overallPrice, hVar.overallPrice) && Intrinsics.f(this.priceInRequestedCurrency, hVar.priceInRequestedCurrency) && Intrinsics.f(this.cashback, hVar.cashback) && Intrinsics.f(this.pointsOption, hVar.pointsOption);
    }

    public final int hashCode() {
        int iHashCode = (this.cashback.hashCode() + v7.j(this.priceInRequestedCurrency, this.overallPrice.hashCode() * 31, 31)) * 31;
        g gVar = this.pointsOption;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
