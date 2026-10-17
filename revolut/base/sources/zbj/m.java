package zbj;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewController;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoDepositsOverviewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CryptoDepositsOverviewController cryptoDepositsOverviewController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoDepositsOverviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVar;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.v.d();
        String listItemId = model.f51832a;
        com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar = (com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c) sVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(listItemId, "listItemId");
        if (Intrinsics.f(listItemId, "MINIMUM_DEPOSIT_ID") && (dVar = (dj0.d) ((q) ((j2) cVar.F.f22677a).getValue()).f320929h.g()) != null) {
            oki.h.v2(cVar.G, new CryptoDepositsOverviewControllerContract$ModalStep.MinimumDeposit(dVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
