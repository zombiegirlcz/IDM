package je1;

import cli.y;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.CategoryDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;
import ufm.n;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CategoryDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CategoryDetailsScreen categoryDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = categoryDetailsScreen;
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
        n nVarI0;
        int i = this.u;
        CategoryDetailsScreen categoryDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a) categoryDetailsScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a aVar3 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a) categoryDetailsScreen.d();
                nd1.c cVar = aVar3.f60788p;
                y yVar = aVar3.f60789q;
                CatalogueCategory catalogueCategory = aVar3.o.f60786a;
                int i2 = 11;
                if (catalogueCategory == null) {
                    String name = ((f) ((j2) yVar.f22677a).getValue()).f173172a;
                    String color = ((f) ((j2) yVar.f22677a).getValue()).f173173b;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(color, "color");
                    id1.n nVar = cVar.f214281a;
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(color, "color");
                    ufm.i iVar = new ufm.i(new ufm.i(w.o0(p0.f264003c, new id1.h(nVar, name, color, null, 0)), new icc.c(new id1.a(nVar, 11), 18), 1), new icc.c(new id1.a(nVar, 0), 7), 0);
                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                    nVarI0 = w.i0(iVar);
                } else {
                    String categoryId = catalogueCategory.f60669a;
                    String name2 = ((f) ((j2) yVar.f22677a).getValue()).f173172a;
                    String color2 = ((f) ((j2) yVar.f22677a).getValue()).f173173b;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(categoryId, "categoryId");
                    Intrinsics.checkNotNullParameter(name2, "name");
                    Intrinsics.checkNotNullParameter(color2, "color");
                    id1.n nVar2 = cVar.f214281a;
                    nVar2.getClass();
                    Intrinsics.checkNotNullParameter(categoryId, "categoryId");
                    Intrinsics.checkNotNullParameter(name2, "name");
                    Intrinsics.checkNotNullParameter(color2, "color");
                    ufm.i iVar2 = new ufm.i(new ufm.i(w.o0(p0.f264003c, new id1.l(nVar2, categoryId, name2, color2, null, 0)), new icc.c(new id1.a(nVar2, 3), 10), 1), new icc.c(new id1.a(nVar2, 4), i2), 0);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                    nVarI0 = w.i0(iVar2);
                }
                aVar3.l2(new k(aVar3, nVarI0, null), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
