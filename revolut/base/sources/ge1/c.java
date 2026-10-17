package ge1;

import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueEmbeddedScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CatalogueEmbeddedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CatalogueEmbeddedScreen catalogueEmbeddedScreen, Continuation continuation) {
        super(2, continuation);
        this.v = catalogueEmbeddedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ExtraSmallCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        ExtraSmallCardDelegate.Model model = (ExtraSmallCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.b bVar = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.b) hVarD3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        if (obj3 instanceof CatalogueCategory) {
            oki.h.v2(bVar.u, new CatalogueScreenContract$ModalStep.ShowCategoryItems((CatalogueCategory) obj3, bVar.f60779r.f60772a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            if (!(obj3 instanceof CatalogueProduct)) {
                throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj3, "Unsupported parcel type: "));
            }
            CatalogueProduct catalogueProduct = (CatalogueProduct) obj3;
            cd1.c cVar = (cd1.c) ((f) ((j2) bVar.f60781t.f22677a).getValue()).f143208a.getContent();
            TaxRate taxRate = null;
            Object obj4 = null;
            taxRate = null;
            if (cVar != null && (list = cVar.f23148c) != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (Intrinsics.f(((TaxRate) next).f60694a, catalogueProduct.f60687h)) {
                        obj4 = next;
                        break;
                    }
                }
                taxRate = (TaxRate) obj4;
            }
            bVar.C2(new g(catalogueProduct, taxRate));
        }
        return Unit.f186387a;
    }
}
