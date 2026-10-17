package ble;

import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$ModalStep;
import com.revolut.feature.wealth.ui.api.currencychanger.kompot.WealthCurrencyChangerDescriptor;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TabInvestController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(TabInvestController tabInvestController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = tabInvestController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.v, continuation, 0);
            case 1:
                return new l(this.v, continuation, 1);
            case 2:
                return new l(this.v, continuation, 2);
            default:
                return new l(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((l) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        TabInvestController tabInvestController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.tab.invest.impl.ui.home.f) tabInvestController.R2()).f0, TabInvestControllerContract$ModalStep.ThemeCustomisation.f89852a, ModalDestination.Style.POPUP.f98311a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.tab.invest.impl.ui.home.f) tabInvestController.R2()).f0, new TabInvestControllerContract$ModalStep.KompotDescriptor(new WealthCurrencyChangerDescriptor(null, false)), bottom_dialog);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.invest.impl.ui.home.f fVar = (com.revolut.feature.tab.invest.impl.ui.home.f) tabInvestController.R2();
                fVar.getClass();
                fVar.C1(new MainContainerScreenDestination.Slide(dy0.o.RIGHT, false));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.invest.impl.ui.home.f fVar2 = (com.revolut.feature.tab.invest.impl.ui.home.f) tabInvestController.R2();
                if (fVar2.F.E()) {
                    oki.h.v2(fVar2.f0, TabInvestControllerContract$ModalStep.RegisteredIdentities.f89851a, bottom_dialog);
                }
                break;
        }
        return Unit.f186387a;
    }
}
