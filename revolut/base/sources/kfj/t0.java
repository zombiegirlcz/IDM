package kfj;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkfj/t0;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "c", "()Ljava/math/BigDecimal;", "points", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "discount", "finalPrice", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "preselected", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    @NotNull
    private final BigDecimal points;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("discount")
    @NotNull
    private final jo3.a discount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("finalPrice")
    @NotNull
    private final jo3.a finalPrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("preselected")
    private final Boolean preselected;

    public t0(BigDecimal points, jo3.a discount, jo3.a finalPrice, Boolean bool) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.points = points;
        this.discount = discount;
        this.finalPrice = finalPrice;
        this.preselected = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getFinalPrice() {
        return this.finalPrice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getPoints() {
        return this.points;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getPreselected() {
        return this.preselected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.points, t0Var.points) && Intrinsics.f(this.discount, t0Var.discount) && Intrinsics.f(this.finalPrice, t0Var.finalPrice) && Intrinsics.f(this.preselected, t0Var.preselected);
    }

    public final int hashCode() {
        int iJ = v7.j(this.finalPrice, v7.j(this.discount, this.points.hashCode() * 31, 31), 31);
        Boolean bool = this.preselected;
        return iJ + (bool == null ? 0 : bool.hashCode());
    }
}
