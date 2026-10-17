package nie;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductId f215684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductAccountId f215685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f215686c;

    public b(ProductId productId, ProductAccountId accountId, Object obj2) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f215684a = productId;
        this.f215685b = accountId;
        this.f215686c = obj2;
    }

    @Override // nie.c
    /* JADX INFO: renamed from: a */
    public final ProductAccountId getF89728b() {
        return this.f215685b;
    }

    @Override // nie.c
    /* JADX INFO: renamed from: b */
    public final ProductId getF89727a() {
        return this.f215684a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f215684a == bVar.f215684a && Intrinsics.f(this.f215685b, bVar.f215685b) && Intrinsics.f(this.f215686c, bVar.f215686c);
    }

    public final int hashCode() {
        int iHashCode = (this.f215685b.hashCode() + (this.f215684a.hashCode() * 31)) * 31;
        Object obj2 = this.f215686c;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
