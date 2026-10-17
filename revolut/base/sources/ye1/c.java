package ye1;

import a31.v;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.CatalogueProductDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import skm.p0;
import te0.w;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CatalogueProductDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CatalogueProductDetailsScreen catalogueProductDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = catalogueProductDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVarG0;
        int i = this.u;
        CatalogueProductDetailsScreen catalogueProductDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a) catalogueProductDetailsScreen.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar3 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a) catalogueProductDetailsScreen.R2();
                nd1.c cVar = aVar3.f60826q;
                i iVar = (i) ((j2) aVar3.f60829t.f22677a).getValue();
                xi0.b bVar = iVar.f312745a;
                long j2 = iVar.f312747c;
                if (bVar != null) {
                    CatalogueProduct catalogueProduct = aVar3.o.f60817a;
                    if (catalogueProduct == null) {
                        String name = iVar.d;
                        String color = iVar.e;
                        dj0.d price = new dj0.d(j2, bVar);
                        cd1.j unitPricing = cd1.j.ITEM;
                        String str = iVar.f312748g;
                        String str2 = iVar.k;
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(color, "color");
                        Intrinsics.checkNotNullParameter(price, "price");
                        Intrinsics.checkNotNullParameter(unitPricing, "unitPricing");
                        id1.n nVar = cVar.f214281a;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(color, "color");
                        Intrinsics.checkNotNullParameter(price, "price");
                        Intrinsics.checkNotNullParameter(unitPricing, "unitPricing");
                        pfm.a aVar4 = new pfm.a(new ufm.i(w.o0(p0.f264003c, new ac8.h(nVar, name, color, price, str2, unitPricing, str, null, 11)), new icc.c(new id1.a(nVar, 5), 13), 1), new icc.c(new id1.a(nVar, 6), 14), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar4, "flatMapCompletable(...)");
                        rVarG0 = w.g0(aVar4);
                    } else {
                        String productId = catalogueProduct.f60683a;
                        String name2 = iVar.d;
                        String color2 = iVar.e;
                        dj0.d price2 = new dj0.d(j2, bVar);
                        cd1.j unitPricing2 = cd1.j.ITEM;
                        String str3 = iVar.f312748g;
                        String str4 = iVar.k;
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        Intrinsics.checkNotNullParameter(name2, "name");
                        Intrinsics.checkNotNullParameter(color2, "color");
                        Intrinsics.checkNotNullParameter(price2, "price");
                        Intrinsics.checkNotNullParameter(unitPricing2, "unitPricing");
                        id1.n nVar2 = cVar.f214281a;
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        Intrinsics.checkNotNullParameter(name2, "name");
                        Intrinsics.checkNotNullParameter(color2, "color");
                        Intrinsics.checkNotNullParameter(price2, "price");
                        Intrinsics.checkNotNullParameter(unitPricing2, "unitPricing");
                        pfm.a aVar5 = new pfm.a(new ufm.i(w.o0(p0.f264003c, new v(nVar2, productId, name2, color2, price2, str4, unitPricing2, str3, (Continuation) null)), new icc.c(new id1.a(nVar2, 1), 8), 1), new icc.c(new id1.a(nVar2, 2), 9), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar5, "flatMapCompletable(...)");
                        rVarG0 = w.g0(aVar5);
                    }
                    aVar3.l2(new p(aVar3, rVarG0, null), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
