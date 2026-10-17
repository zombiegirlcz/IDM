package na8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.JuniorIsaChildCreationScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.JuniorIsaChildCreationScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorIsaChildCreationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(JuniorIsaChildCreationScreen juniorIsaChildCreationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorIsaChildCreationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f52580a;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = ((com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a) nVarE3).v;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "HOME_ADDRESS_INPUT_LIST_ID")) {
            oki.h.v2(aVar2, JuniorIsaChildCreationScreenContract$ModalStep.UpdateAddress.f76779a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        } else if (Intrinsics.f(listId, "GENDER_INPUT_LIST_ID")) {
            oki.h.v2(aVar2, JuniorIsaChildCreationScreenContract$ModalStep.UpdateGender.f76780a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
