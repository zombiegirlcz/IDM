package fmb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f136257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136258b;

    public a0(SavingsProductData productData, String str) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f136257a = productData;
        this.f136258b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f136257a, a0Var.f136257a) && Intrinsics.f(this.f136258b, a0Var.f136258b);
    }

    public final int hashCode() {
        int iHashCode = this.f136257a.hashCode() * 31;
        String str = this.f136258b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
