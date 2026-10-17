package lo5;

import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KompotDestination f197407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aii.e f197408b;

    public o(KompotDestination mainDestination, ProductArticleDescriptor productArticleDescriptor) {
        Intrinsics.checkNotNullParameter(mainDestination, "mainDestination");
        this.f197407a = mainDestination;
        this.f197408b = productArticleDescriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f197407a.equals(oVar.f197407a) && Intrinsics.f(this.f197408b, oVar.f197408b);
    }

    public final int hashCode() {
        int iHashCode = this.f197407a.hashCode() * 31;
        aii.e eVar = this.f197408b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
