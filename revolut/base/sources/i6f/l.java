package i6f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ManagedPortfolioDetailsController f158943w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(ManagedPortfolioDetailsController managedPortfolioDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f158943w = managedPortfolioDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f158943w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f158943w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            default:
                l lVar3 = new l(this.f158943w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((x) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ManagedPortfolioDetailsController managedPortfolioDetailsController = this.f158943w;
        switch (i) {
            case 0:
                x xVar = (x) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE3 = managedPortfolioDetailsController.d();
                alc.d action = xVar.f158989a;
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.c) sVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                cVar.n2(new i13.d(cVar, action, (Continuation) null), new whi.b(6));
                return Unit.f186387a;
            case 1:
                y yVar = (y) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE32 = managedPortfolioDetailsController.d();
                List actions = yVar.f158990a;
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar2 = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.c) sVarE32;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(actions, "actions");
                cVar2.n2(new com.revolut.feature.trading.managed_portfolios.impl.ui.details.a(cVar2, actions, null), new whi.b(6));
                return Unit.f186387a;
            default:
                z zVar = (z) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE33 = managedPortfolioDetailsController.d();
                h7f.c status = zVar.f158991a;
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar3 = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.c) sVarE33;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(status, "status");
                boolean z = status instanceof h7f.a;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z) {
                    cVar3.E.getClass();
                    yji.l.j2(cVar3, new ActionsBottomSheetController(h7f.f.a()), bottom_dialog, null, 2);
                } else {
                    if (!(status instanceof h7f.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.v2(cVar3.J, new ManagedPortfolioDetailsControllerContract$ModalStep.RebalanceStatus(((h7f.b) status).f149877a), bottom_dialog);
                }
                return Unit.f186387a;
        }
    }
}
