package yed;

import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertRevampedScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.select_type.SelectAlertTypeController;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.select_type.SelectAlertTypeControllerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SharedCreateAlertRevampedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SharedCreateAlertRevampedScreen sharedCreateAlertRevampedScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = sharedCreateAlertRevampedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SharedCreateAlertRevampedScreen sharedCreateAlertRevampedScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sharedCreateAlertRevampedScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar = (com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) sharedCreateAlertRevampedScreen.T2();
                bVar.getClass();
                xi0.a aVar3 = xi0.b.Companion;
                String str = ((o) bVar.t2()).f312875b.f86863a;
                aVar3.getClass();
                bVar.f2(new SelectAlertTypeController(new SelectAlertTypeControllerContract$InputData(((o) bVar.t2()).f312879j, xi0.a.a(str))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new v(bVar, 2));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) sharedCreateAlertRevampedScreen.T2()).D2();
                break;
        }
        return Unit.f186387a;
    }
}
