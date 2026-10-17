package nnb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final npg.j f217497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsProductData f217498b;

    public j(npg.j statementOption, SavingsProductData product) {
        Intrinsics.checkNotNullParameter(statementOption, "statementOption");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f217497a = statementOption;
        this.f217498b = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f217497a, jVar.f217497a) && Intrinsics.f(this.f217498b, jVar.f217498b);
    }

    public final int hashCode() {
        return this.f217498b.hashCode() + (this.f217497a.hashCode() * 31);
    }
}
