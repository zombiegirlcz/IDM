package y0b;

import com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.AdvancedChartsScreen;
import com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.AdvancedChartsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AdvancedChartsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AdvancedChartsScreen advancedChartsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = advancedChartsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = yVar.f167226b.f58316a;
        int iHashCode = str.hashCode();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        AdvancedChartsScreen advancedChartsScreen = this.v;
        switch (iHashCode) {
            case -1258366178:
                if (str.equals("CHART_ACTIONS_ADD")) {
                    oki.h.v2(((com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a) advancedChartsScreen.R2()).f82082t, AdvancedChartsScreenContract$ModalStep.ChartAdd.f82071a, bottom_dialog);
                }
                break;
            case -866842597:
                if (str.equals("CHART_ACTIONS_DRAWING")) {
                    oki.h.v2(((com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a) advancedChartsScreen.R2()).f82082t, AdvancedChartsScreenContract$ModalStep.ChartDrawingSelector.f82072a, bottom_dialog);
                }
                break;
            case -354558799:
                if (str.equals("CHART_ACTIONS_DATE")) {
                    oki.h.v2(((com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a) advancedChartsScreen.R2()).f82082t, AdvancedChartsScreenContract$ModalStep.ChartIntervalSelector.f82074a, bottom_dialog);
                }
                break;
            case 1218188141:
                if (str.equals("CHART_ACTIONS_CHART_STYLE")) {
                    oki.h.v2(((com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a) advancedChartsScreen.R2()).f82082t, AdvancedChartsScreenContract$ModalStep.ChartStyleSelector.f82075a, bottom_dialog);
                }
                break;
            case 1908843681:
                if (str.equals("CHART_ACTIONS_TRADE")) {
                    ((com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.a) advancedChartsScreen.R2()).f82080r.e3();
                }
                break;
        }
        return Unit.f186387a;
    }
}
