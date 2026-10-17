package j3i;

import cli.y;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.ii;
import com.revolut.core.ui_kit.delegates.ji;
import com.revolut.core.ui_kit.delegates.ki;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerController;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerControllerContract$Limit;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChartLimitPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ChartLimitPickerController chartLimitPickerController, Continuation continuation) {
        super(2, continuation);
        this.v = chartLimitPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((TrendViewDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TrendViewDelegate.a aVar = (TrendViewDelegate.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = aVar instanceof ki;
        ChartLimitPickerController chartLimitPickerController = this.v;
        if (z) {
            i iVarE3 = chartLimitPickerController.d();
            ki kiVar = (ki) aVar;
            hw0.q limitType = kiVar.f54396b;
            float f = kiVar.f54397c;
            com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b bVar = (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) iVarE3;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(limitType, "limitType");
            bVar.H2(bVar.v, new n(limitType, f, 0));
        } else if (aVar instanceof ji) {
            j2 j2Var = ((com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) chartLimitPickerController.d()).f97000x;
            Boolean bool = Boolean.FALSE;
            j2Var.getClass();
            j2Var.g(null, bool);
        } else if (aVar instanceof ii) {
            j2 j2Var2 = ((com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) chartLimitPickerController.d()).f97000x;
            Boolean bool2 = Boolean.FALSE;
            j2Var2.getClass();
            j2Var2.g(null, bool2);
            i iVarE32 = chartLimitPickerController.d();
            hw0.q limitType2 = ((ii) aVar).f54307b;
            com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b bVar2 = (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) iVarE32;
            bVar2.getClass();
            com.revolut.kompot.navigable.vc.modal.a aVar3 = bVar2.f97001y;
            Intrinsics.checkNotNullParameter(limitType2, "limitType");
            y yVar = bVar2.v;
            j2 j2Var3 = (j2) yVar.f22677a;
            j2 j2Var4 = (j2) yVar.f22677a;
            if (new BigDecimal(String.valueOf(((k) j2Var3.getValue()).e.f171195a)).compareTo(bVar2.u) >= 0) {
                hw0.q qVar = hw0.q.LOWEST;
                ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                if (limitType2 == qVar) {
                    ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit = ((k) j2Var4.getValue()).f171197a;
                    if (chartLimitPickerControllerContract$Limit != null) {
                        oki.h.v2(aVar3, new ChartLimitPickerControllerContract$ModalStep.LowestAmountPicker(chartLimitPickerControllerContract$Limit), popup);
                    }
                } else {
                    ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit2 = ((k) j2Var4.getValue()).f171198b;
                    if (chartLimitPickerControllerContract$Limit2 != null) {
                        oki.h.v2(aVar3, new ChartLimitPickerControllerContract$ModalStep.HighestAmountPicker(chartLimitPickerControllerContract$Limit2), popup);
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}
