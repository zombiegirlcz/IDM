package lij;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.duration.EsimPlanDurationPickerBottomSheetScreen;
import gim.i;
import ib6.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimPlanDurationPickerBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EsimPlanDurationPickerBottomSheetScreen esimPlanDurationPickerBottomSheetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimPlanDurationPickerBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.U.getValue();
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        if (obj3 instanceof EsimDataPlan) {
            eVar.H2(eVar.o, new j(obj3, 9));
        } else {
            eVar.getClass();
        }
        return Unit.f186387a;
    }
}
