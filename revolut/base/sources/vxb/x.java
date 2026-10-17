package vxb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\t\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0011"}, d2 = {"Lvxb/x;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "tier", "b", "c", "product", "", "D", "()D", "booster", "baseRate", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("tier")
    @NotNull
    private final String tier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("product")
    @NotNull
    private final String product;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("booster")
    private final double booster;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("baseRate")
    private final double baseRate;

    public x(String tier, String product, double d, double d5) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(product, "product");
        this.tier = tier;
        this.product = product;
        this.booster = d;
        this.baseRate = d5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getBaseRate() {
        return this.baseRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getBooster() {
        return this.booster;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTier() {
        return this.tier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.tier, xVar.tier) && Intrinsics.f(this.product, xVar.product) && Double.compare(this.booster, xVar.booster) == 0 && Double.compare(this.baseRate, xVar.baseRate) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.baseRate) + m72.b.c(p.a.c(this.tier.hashCode() * 31, 31, this.product), this.booster, 31);
    }
}
