package nge;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements rfe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rfe.a f215140a;

    public b(rfe.a creditAccountVisibilityFilter) {
        Intrinsics.checkNotNullParameter(creditAccountVisibilityFilter, "creditAccountVisibilityFilter");
        this.f215140a = creditAccountVisibilityFilter;
    }

    @Override // rfe.a
    public final boolean a(ProductId productId, ProductAccountId.Payload payload) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return !this.f215140a.a(productId, payload);
    }
}
