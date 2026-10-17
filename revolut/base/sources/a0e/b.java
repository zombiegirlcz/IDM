package a0e;

import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wxd.f f338b;

    public b(String product, wxd.f configuration) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f337a = product;
        this.f338b = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        String str = bVar.f337a;
        DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
        return Intrinsics.f(this.f337a, str) && Intrinsics.f(this.f338b, bVar.f338b);
    }

    public final int hashCode() {
        DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
        return this.f338b.hashCode() + (this.f337a.hashCode() * 31);
    }
}
