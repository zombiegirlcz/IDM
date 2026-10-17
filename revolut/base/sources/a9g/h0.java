package a9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, d2 = {"La9g/h0;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "b", "()Ljo3/b;", "overallPrice", "d", "priceInRequestedCurrency", "La9g/c0;", "c", "La9g/c0;", "()La9g/c0;", "cashback", "La9g/f0;", "La9g/f0;", "()La9g/f0;", "pointsOption", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("overallPrice")
    @NotNull
    private final jo3.b overallPrice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("priceInRequestedCurrency")
    @NotNull
    private final jo3.b priceInRequestedCurrency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashback")
    @NotNull
    private final c0 cashback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pointsOption")
    private final f0 pointsOption;

    public h0(jo3.b overallPrice, jo3.b priceInRequestedCurrency, c0 cashback, f0 f0Var) {
        Intrinsics.checkNotNullParameter(overallPrice, "overallPrice");
        Intrinsics.checkNotNullParameter(priceInRequestedCurrency, "priceInRequestedCurrency");
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        this.overallPrice = overallPrice;
        this.priceInRequestedCurrency = priceInRequestedCurrency;
        this.cashback = cashback;
        this.pointsOption = f0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c0 getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getOverallPrice() {
        return this.overallPrice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f0 getPointsOption() {
        return this.pointsOption;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getPriceInRequestedCurrency() {
        return this.priceInRequestedCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.overallPrice, h0Var.overallPrice) && Intrinsics.f(this.priceInRequestedCurrency, h0Var.priceInRequestedCurrency) && Intrinsics.f(this.cashback, h0Var.cashback) && Intrinsics.f(this.pointsOption, h0Var.pointsOption);
    }

    public final int hashCode() {
        int iHashCode = (this.cashback.hashCode() + wp5.y.e(this.priceInRequestedCurrency, this.overallPrice.hashCode() * 31, 31)) * 31;
        f0 f0Var = this.pointsOption;
        return iHashCode + (f0Var == null ? 0 : f0Var.hashCode());
    }
}
