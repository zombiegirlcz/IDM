package xo8;

import com.revolut.feature.junior_payment_links.api.navigation.JuniorCardProfileNavigationDestination;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings.JuniorSettingsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ JuniorSettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(JuniorSettingsController juniorSettingsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = juniorSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
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
        JuniorSettingsController juniorSettingsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((oki.h) juniorSettingsController.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0Var = (h0) juniorSettingsController.e3();
                h0Var.C1(new JuniorCardProfileNavigationDestination(h0Var.o.f77340a));
                break;
        }
        return Unit.f186387a;
    }
}
