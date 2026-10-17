package dh4;

import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.RefinancingAccountDetailsHomeController;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.RefinancingAccountDetailsHomeScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import dx4.a3;
import dx4.f2;
import dx4.z2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RefinancingAccountDetailsHomeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RefinancingAccountDetailsHomeController refinancingAccountDetailsHomeController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = refinancingAccountDetailsHomeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RefinancingAccountDetailsHomeController refinancingAccountDetailsHomeController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a) refinancingAccountDetailsHomeController.e3()).C2(g.f114746a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a aVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a) refinancingAccountDetailsHomeController.e3();
                lv3.a aVar4 = (lv3.a) ((f) ((j2) aVar3.f68259t.f22677a).getValue()).f114744a.getContent();
                a3 a3Var = aVar4 != null ? aVar4.f200280g : null;
                if (a3Var instanceof z2) {
                    aVar3.I((z2) a3Var, new n(aVar3, 0));
                } else if (a3Var instanceof f2) {
                    oki.h.v2(aVar3.u, new RefinancingAccountDetailsHomeScreenContract$ModalStep.Confirmation((f2) a3Var), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                } else {
                    if (a3Var != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.K2();
                }
                return Unit.f186387a;
        }
    }
}
