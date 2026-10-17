package l2c;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest1B;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.RevPointsSpareChangeFullMultiplierController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ RevPointsSpareChangeFullMultiplierController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RevPointsSpareChangeFullMultiplierController revPointsSpareChangeFullMultiplierController, Continuation continuation) {
        super(2, continuation);
        this.u = revPointsSpareChangeFullMultiplierController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a aVar2 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a) this.u.R2();
        g gVar = (g) ((j2) aVar2.f84180y.f22677a).getValue();
        if (!zi0.c.E(gVar.f191744c)) {
            aVar2.f84178w.a();
        }
        if (!zi0.c.E(gVar.d)) {
            aVar2.v.a();
        }
        if (((jte.d) aVar2.f84177t).c(RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest1B.f84111c) && !zi0.c.E(gVar.e)) {
            aVar2.f84179x.a();
        }
        return Unit.f186387a;
    }
}
