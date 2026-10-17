package bmb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SavingsProductData f16787c;

    public c(String title, String description, SavingsProductData productData) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f16785a = title;
        this.f16786b = description;
        this.f16787c = productData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f16785a, cVar.f16785a) && Intrinsics.f(this.f16786b, cVar.f16786b) && Intrinsics.f(this.f16787c, cVar.f16787c);
    }

    public final int hashCode() {
        return this.f16787c.hashCode() + p.a.c(this.f16785a.hashCode() * 31, 31, this.f16786b);
    }
}
