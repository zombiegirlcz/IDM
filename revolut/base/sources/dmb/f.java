package dmb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f115877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsProductData f115878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f115879c;
    public final String d;
    public final xi0.b e;

    public f(hha.d currentPlan, SavingsProductData bestCurrentProduct, List productsWithPlanToUpgrade, String selectedPlanId, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(bestCurrentProduct, "bestCurrentProduct");
        Intrinsics.checkNotNullParameter(productsWithPlanToUpgrade, "productsWithPlanToUpgrade");
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f115877a = currentPlan;
        this.f115878b = bestCurrentProduct;
        this.f115879c = productsWithPlanToUpgrade;
        this.d = selectedPlanId;
        this.e = baseCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f115877a, fVar.f115877a) && Intrinsics.f(this.f115878b, fVar.f115878b) && Intrinsics.f(this.f115879c, fVar.f115879c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.d((this.f115878b.hashCode() + (this.f115877a.hashCode() * 31)) * 31, 31, this.f115879c), 31, this.d);
    }
}
