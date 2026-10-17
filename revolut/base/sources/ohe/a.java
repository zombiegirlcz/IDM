package ohe;

import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductContext f225351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductAccount f225352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f225353c;

    public a(ProductContext productContext, ProductAccount account, boolean z) {
        Intrinsics.checkNotNullParameter(productContext, "productContext");
        Intrinsics.checkNotNullParameter(account, "account");
        this.f225351a = productContext;
        this.f225352b = account;
        this.f225353c = z;
    }

    public static a a(a aVar, ProductAccount account, int i) {
        ProductContext productContext = aVar.f225351a;
        if ((i & 2) != 0) {
            account = aVar.f225352b;
        }
        boolean z = (i & 4) != 0 ? aVar.f225353c : true;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(productContext, "productContext");
        Intrinsics.checkNotNullParameter(account, "account");
        return new a(productContext, account, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f225351a, aVar.f225351a) && Intrinsics.f(this.f225352b, aVar.f225352b) && this.f225353c == aVar.f225353c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225353c) + ((this.f225352b.hashCode() + (this.f225351a.hashCode() * 31)) * 31);
    }
}
