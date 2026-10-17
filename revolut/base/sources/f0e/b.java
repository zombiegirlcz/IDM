package f0e;

import aii.r;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131106a;

    public b(String product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f131106a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        String str = ((b) obj2).f131106a;
        DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
        return Intrinsics.f(this.f131106a, str);
    }

    public final int hashCode() {
        DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
        return this.f131106a.hashCode();
    }
}
