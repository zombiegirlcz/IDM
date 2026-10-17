package l9j;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoEarningScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CryptoEarningScreen cryptoEarningScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoEarningScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.d();
        Object obj3 = model.o;
        com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a aVar2 = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a) hVarE3;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.f99995w;
        boolean z = obj3 instanceof oc5.f;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            oki.h.v2(aVar3, new CryptoEarningScreenContract$ModalStep.UnstakingPeriodDisclaimerDialog(((oc5.f) obj3).f224105a), bottom_dialog);
        } else if (obj3 instanceof oc5.b) {
            oki.h.v2(aVar3, new CryptoEarningScreenContract$ModalStep.StakingLockedBalancesDialog(((oc5.b) obj3).f224102a), bottom_dialog);
        } else if (obj3 instanceof oc5.e) {
            aVar2.I2((oc5.e) obj3);
        }
        return Unit.f186387a;
    }
}
