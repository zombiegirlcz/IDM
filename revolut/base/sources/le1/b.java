package le1;

import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category_items.CategoryItemsScreen;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CategoryItemsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CategoryItemsScreen categoryItemsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = categoryItemsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((ExtraSmallCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        ExtraSmallCardDelegate.Model model = (ExtraSmallCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.U.getValue();
        Intrinsics.h(model);
        i iVar = (i) fVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        CatalogueProduct catalogueProduct = obj3 instanceof CatalogueProduct ? (CatalogueProduct) obj3 : null;
        if (catalogueProduct != null) {
            Iterator it8 = ((c) ((j2) iVar.f194445t.f22677a).getValue()).e.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((TaxRate) next).f60694a, catalogueProduct.f60687h)) {
                    break;
                }
            }
            TaxRate taxRate = (TaxRate) next;
            if (iVar.o.f60793c) {
                iVar.C2(new e(catalogueProduct, taxRate));
            } else {
                iVar.n2(new h(iVar, catalogueProduct, taxRate, null), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
