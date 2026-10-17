package fmb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f136270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f136271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f136272c;

    public h0(SavingsProductData productToUpsell, hha.d highestPlanToUpsell, ArrayList plansToUpsell) {
        Intrinsics.checkNotNullParameter(productToUpsell, "productToUpsell");
        Intrinsics.checkNotNullParameter(highestPlanToUpsell, "highestPlanToUpsell");
        Intrinsics.checkNotNullParameter(plansToUpsell, "plansToUpsell");
        this.f136270a = productToUpsell;
        this.f136271b = highestPlanToUpsell;
        this.f136272c = plansToUpsell;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f136270a, h0Var.f136270a) && Intrinsics.f(this.f136271b, h0Var.f136271b) && this.f136272c.equals(h0Var.f136272c);
    }

    public final int hashCode() {
        return this.f136272c.hashCode() + ((this.f136271b.hashCode() + (this.f136270a.hashCode() * 31)) * 31);
    }
}
