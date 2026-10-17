package ila;

import com.revolut.feature.product_catalogue.impl.data.ProductCatalogueService;
import e4m.e;
import fla.g;
import gla.r;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import vc.s;
import xe0.f;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f162205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f162206b;

    public a(b bVar, int i) {
        this.f162205a = bVar;
        this.f162206b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f162205a;
        nj0.a aVar = bVar.f162207a;
        ee0.a aVar2 = bVar.f162209c;
        int i = this.f162206b;
        if (i == 0) {
            ProductCatalogueService productCatalogueService = (ProductCatalogueService) bVar.e.get();
            fla.a aVar3 = new fla.a();
            ela.a aVar4 = bVar.f162208b;
            gte.a aVarB = aVar4.f127280a.b();
            s.j(aVarB);
            return new g(productCatalogueService, aVar3, new a61.a(aVar4.f127281b.e(), aVarB), (j) bVar.f.get(), (ue0.c) bVar.f162210g.get());
        }
        if (i == 1) {
            ik0.b retrofitFactory = ((nj0.d) aVar).m();
            s.j(retrofitFactory);
            ek.a converterFactory = ((nj0.d) aVar).d();
            ela.d.Companion.getClass();
            ela.b productCatalogueNetworkConfiguration = new ela.b();
            d.Companion.getClass();
            Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
            Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
            Intrinsics.checkNotNullParameter(productCatalogueNetworkConfiguration, "productCatalogueNetworkConfiguration");
            Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 25).create(ProductCatalogueService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            ProductCatalogueService productCatalogueService2 = (ProductCatalogueService) objCreate;
            s.k(productCatalogueService2);
            return productCatalogueService2;
        }
        if (i == 2) {
            d.Companion.getClass();
            return new ne0.d();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        je0.d mapper = aVar2.d();
        s.j(mapper);
        yk0.a databaseSessionProvider = bVar.d.b();
        s.j(databaseSessionProvider);
        f storageFactory = aVar2.f();
        s.j(storageFactory);
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "product_catalogue", mapper, 3, v.k(new gla.j(), new r()), 32);
    }
}
