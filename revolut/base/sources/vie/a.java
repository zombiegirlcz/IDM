package vie;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements rfe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f289576a;

    public a(h creditAvailability) {
        Intrinsics.checkNotNullParameter(creditAvailability, "creditAvailability");
        this.f289576a = creditAvailability;
    }

    @Override // rfe.a
    public final boolean a(ProductId productId, ProductAccountId.Payload payload) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return this.f289576a.a() && c.a(productId, payload);
    }
}
