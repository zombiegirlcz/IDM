package h2c;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.RevPointsSpareChangeFullGridController;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.RevPointsSpareChangeFullGridControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsSpareChangeFullGridController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RevPointsSpareChangeFullGridController revPointsSpareChangeFullGridController, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsSpareChangeFullGridController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SpareChangeCalculations spareChangeCalculations;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a aVar2 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a) hVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "SPARE_CHANGE_CELL_DELEGATE_BUY_ITEM_ID") && (spareChangeCalculations = (SpareChangeCalculations) ((i) ((j2) aVar2.v.f22677a).getValue()).d.getContent()) != null) {
            oki.h.v2(aVar2.f84160w, new RevPointsSpareChangeFullGridControllerContract$ModalStep.Breakdown(spareChangeCalculations), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
