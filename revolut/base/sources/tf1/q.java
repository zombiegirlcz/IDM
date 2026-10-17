package tf1;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes20.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xf1.a f270195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bla.b f270196b;

    public q(xf1.a addNewProductRepository, bla.b productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(addNewProductRepository, "addNewProductRepository");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f270195a = addNewProductRepository;
        this.f270196b = productCatalogueInteractor;
    }

    public final Flow a(qf1.f itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        xf1.c cVar = (xf1.c) this.f270195a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        String strB = cVar.b(itemId).b();
        Continuation continuation = null;
        if (strB != null && ((jla.h) this.f270196b).d(strB, null) != bla.c.ENABLED) {
            return new go.g(null, 2);
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return rd0.e.e(new v1(new wh3.h(cVar, itemId, (Continuation) null, 13)), zhm.h0.f322473a, new x18.c(3, 6, continuation));
    }
}
