package bzg;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsPnLScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WidgetisedAnalyticsPnLScreen widgetisedAnalyticsPnLScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsPnLScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) mVarE3;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.v;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51832a;
        int iHashCode = str.hashCode();
        if (iHashCode != -1673194843) {
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (iHashCode != -511616625) {
                if (iHashCode == 1526152175 && str.equals("BREAKDOWN_FIRST_LIST_ID")) {
                    oki.h.v2(aVar3, WidgetisedAnalyticsPnLScreenContract$ModalStep.ProfitFactorInfo.f95116a, bottom_dialog);
                }
            } else if (str.equals("BREAKDOWN_SECOND_LIST_ID")) {
                oki.h.v2(aVar3, WidgetisedAnalyticsPnLScreenContract$ModalStep.WinRateInfo.f95117a, bottom_dialog);
            }
        } else if (str.equals("TOTAL_PNL_REALISED_BREAKDOWN_ID")) {
            aVar2.H2(aVar2.f95123w, new bxg.t(14));
        }
        return Unit.f186387a;
    }
}
