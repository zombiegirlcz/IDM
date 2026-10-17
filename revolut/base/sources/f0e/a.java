package f0e;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import do3.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f131103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f131105c;

    public a(Data productsData, String selectedProduct, n nVar) {
        Intrinsics.checkNotNullParameter(productsData, "productsData");
        Intrinsics.checkNotNullParameter(selectedProduct, "selectedProduct");
        this.f131103a = productsData;
        this.f131104b = selectedProduct;
        this.f131105c = nVar;
    }

    public static a a(a aVar, Data productsData, n nVar, int i) {
        if ((i & 1) != 0) {
            productsData = aVar.f131103a;
        }
        String str = aVar.f131104b;
        if ((i & 4) != 0) {
            nVar = aVar.f131105c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(productsData, "productsData");
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-statements-api-navigation-DocumentsHubProduct$-selectedProduct$0");
        return new a(productsData, str, nVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        if (!Intrinsics.f(this.f131103a, aVar.f131103a)) {
            return false;
        }
        String str = aVar.f131104b;
        DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
        return Intrinsics.f(this.f131104b, str) && Intrinsics.f(this.f131105c, aVar.f131105c);
    }

    public final int hashCode() {
        int iHashCode = this.f131103a.hashCode() * 31;
        DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
        int iC = p.a.c(iHashCode, 31, this.f131104b);
        n nVar = this.f131105c;
        return iC + (nVar == null ? 0 : nVar.hashCode());
    }
}
