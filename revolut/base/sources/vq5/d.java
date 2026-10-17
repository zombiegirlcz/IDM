package vq5;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationControllerContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoSendConfirmationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CryptoSendConfirmationController cryptoSendConfirmationController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoSendConfirmationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) fVarE3;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.E;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51787l;
        String str = model.f51781a;
        if (obj3 instanceof CryptoAddress) {
            aVar2.C2(new h(((CryptoAddress) obj3).f71059a));
        } else {
            boolean zF = Intrinsics.f(str, "CryptoSendConfirmation_RemainingLimit");
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (zF && (obj3 instanceof CryptoWithdrawLimits)) {
                oki.h.v2(aVar3, new CryptoSendConfirmationControllerContract$Step.RemainingLimit((CryptoWithdrawLimits) obj3), bottom_dialog);
            } else if (Intrinsics.f(str, "CryptoSendConfirmation_CrossCurrencyPrice")) {
                oki.h.v2(aVar3, CryptoSendConfirmationControllerContract$Step.CrossCurrencyPrice.f71318a, bottom_dialog);
            } else if ((obj3 instanceof ko5.l) && a0.H(str, "CryptoSendConfirmation_CrossCurrencyFees", false)) {
                ko5.l lVar = (ko5.l) obj3;
                ko5.i iVar = lVar.f.f186229b;
                CryptoWithdrawFeesBreakdown cryptoWithdrawFeesBreakdown = new CryptoWithdrawFeesBreakdown(null, null, null, null, iVar.f186230a, iVar.f186231b);
                ko5.j jVar = lVar.f186240c;
                oki.h.v2(aVar3, new CryptoSendConfirmationControllerContract$Step.FeeBreakdown(cryptoWithdrawFeesBreakdown, jVar != null ? new n9l.a(jVar.f186232a, jVar.f186233b, jVar.f186234c, null, null, null) : null), bottom_dialog);
            }
        }
        return Unit.f186387a;
    }
}
