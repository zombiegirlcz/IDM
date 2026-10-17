package ye1;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.CatalogueProductDetailsScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.ProductDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CatalogueProductDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CatalogueProductDetailsScreen catalogueProductDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = catalogueProductDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarR2 = this.v.R2();
        String listId = model.f52580a;
        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a) kVarR2;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.u;
        Intrinsics.checkNotNullParameter(listId, "listId");
        boolean zF = Intrinsics.f(listId, "SELECT_CATEGORY_LIST_ID");
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (zF) {
            if (((i) ((j2) aVar2.f60829t.f22677a).getValue()).i.isEmpty()) {
                oki.h.v2(aVar3, ProductDetailsScreenContract$ModalStep.EmptyCategories.f60822a, bottom_dialog);
            } else {
                oki.h.v2(aVar3, ProductDetailsScreenContract$ModalStep.Categories.f60820a, bottom_dialog);
            }
        } else if (Intrinsics.f(listId, "TAX_LIST_ID")) {
            oki.h.v2(aVar3, ProductDetailsScreenContract$ModalStep.SelectTaxRate.f60824a, bottom_dialog);
        }
        return Unit.f186387a;
    }
}
