package jnb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f176666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f176667b;

    public a(SavingsProductData productData, List documents) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f176666a = productData;
        this.f176667b = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f176666a, aVar.f176666a) && Intrinsics.f(this.f176667b, aVar.f176667b);
    }

    public final int hashCode() {
        return this.f176667b.hashCode() + (this.f176666a.hashCode() * 31);
    }
}
