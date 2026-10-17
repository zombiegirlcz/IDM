package oe1;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EditCustomProductScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(EditCustomProductScreen editCustomProductScreen, Continuation continuation) {
        super(2, continuation);
        this.v = editCustomProductScreen;
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
        o.b(obj2);
        h hVarE3 = this.v.d();
        String listId = model.f52580a;
        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a aVar2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a) hVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SELECT_TAX_RATE_LIST_ID")) {
            oki.h.v2(aVar2.f60808t, EditCustomProductScreenContract$ModalStep.SelectTaxRate.f60803a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
