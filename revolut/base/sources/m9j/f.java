package m9j;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoHoldingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CryptoHoldingScreen cryptoHoldingScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoHoldingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarD = this.v.d();
        Object obj3 = model.f51917h;
        com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a aVar2 = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a) kVarD;
        aVar2.getClass();
        if (obj3 instanceof j) {
            j jVar = (j) obj3;
            if (jVar.f203810b) {
                oki.h.v2(aVar2.D, new CryptoHoldingScreenContract$ModalStep.AutoStakingDisableConfirmationDialog(jVar.f203809a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else {
                aVar2.n2(new o(aVar2, null, 1), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
