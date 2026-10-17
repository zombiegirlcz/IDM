package lyd;

import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200790a;

    public g(String product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f200790a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        String str = ((g) obj2).f200790a;
        DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
        return Intrinsics.f(this.f200790a, str);
    }

    public final int hashCode() {
        DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
        return this.f200790a.hashCode();
    }
}
