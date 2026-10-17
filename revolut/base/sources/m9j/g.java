package m9j;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ CryptoHoldingScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CryptoHoldingScreen cryptoHoldingScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cryptoHoldingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        oki.h.v2(((com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a) this.u.d()).D, CryptoHoldingScreenContract$ModalStep.AutoEarnInfoDialog.f99998a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
