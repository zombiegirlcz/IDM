package le1;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category_items.CategoryItemsScreenContract$InputData;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nd1.n;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends oki.h implements f {
    public final CategoryItemsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nd1.c f194441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f194442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nd1.i f194443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pd1.a f194444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f194445t;

    public i(k stateMapper, CategoryItemsScreenContract$InputData inputData, nd1.c catalogueInteractor, n shoppingCartInteractor, nd1.i currencyInteractor, pd1.a colorMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(catalogueInteractor, "catalogueInteractor");
        Intrinsics.checkNotNullParameter(shoppingCartInteractor, "shoppingCartInteractor");
        Intrinsics.checkNotNullParameter(currencyInteractor, "currencyInteractor");
        Intrinsics.checkNotNullParameter(colorMapper, "colorMapper");
        this.o = inputData;
        this.f194441p = catalogueInteractor;
        this.f194442q = shoppingCartInteractor;
        this.f194443r = currencyInteractor;
        this.f194444s = colorMapper;
        CatalogueCategory catalogueCategory = inputData.f60791a;
        boolean z = inputData.f60792b;
        Data data = new Data(null, null, true, 3, null);
        cd1.e.Companion.getClass();
        this.f194445t = mra.d.b(this, new c(catalogueCategory, data, cd1.e.f, z, f0.f322471a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        nd1.c cVar = this.f194441p;
        r map = cVar.b().map(new lak.i(new laj.b(this, 14), 19));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        vkm.d dVarB = rd0.e.b(map);
        r map2 = cVar.c(false).map(new lak.i(new lbh.a(26), 20));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        vkm.d dVarB2 = rd0.e.b(map2);
        Continuation continuation = null;
        l.a1(this, ta6.a.h(dVarB, new vkm.y(new g(this, null, 0), this.f194442q.c()), new vkm.y(new g(this, null, 1), dVarB2), new ate.b(this, continuation, 7)), null, null, new l1g.e(this, continuation, 27), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f194445t;
    }
}
