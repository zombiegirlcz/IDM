package q56;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.DeFiSendAddBeneficiaryScreen;
import com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.DeFiSendAddBeneficiaryScreenContract$Modal;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeFiSendAddBeneficiaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DeFiSendAddBeneficiaryScreen deFiSendAddBeneficiaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deFiSendAddBeneficiaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = model.f52580a;
        com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a aVar2 = (com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "DEFI_SEND_ADD_BENEFICIARY_ADDRESS_ITEM_ID")) {
            oki.h.v2(aVar2.u, DeFiSendAddBeneficiaryScreenContract$Modal.QrScanner.f71815a, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
        }
        return Unit.f186387a;
    }
}
