package zbj;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewController;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoDepositsOverviewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CryptoDepositsOverviewController cryptoDepositsOverviewController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoDepositsOverviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar = (com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c) sVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51781a, "ADDRESS_TAG_LABEL_ID")) {
            oki.h.v2(cVar.G, CryptoDepositsOverviewControllerContract$ModalStep.Tag.f100082a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
