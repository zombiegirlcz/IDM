package wfh;

import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import jel.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FundDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(FundDetailsScreen fundDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = fundDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            default:
                return new i(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        w wVarI;
        int i = this.u;
        FundDetailsScreen fundDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d dVar = (com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d) fundDetailsScreen.R2();
                nel.n nVar = (nel.n) ((l) ((j2) dVar.E.f22677a).getValue()).f297121b.getContent();
                if (nVar != null && (wVarI = ifk.b.i(nVar)) != null) {
                    oki.h.v2(dVar.D, new FundDetailsScreenContract$ModalStep.ShowFundClassInfo(wVarI), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d) fundDetailsScreen.R2()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
