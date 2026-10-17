package j2c;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.RevPointsSpareChangeFullListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ RevPointsSpareChangeFullListController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RevPointsSpareChangeFullListController revPointsSpareChangeFullListController, Continuation continuation) {
        super(2, continuation);
        this.u = revPointsSpareChangeFullListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a aVar2 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) this.u.R2();
        f fVar = (f) ((j2) aVar2.v.f22677a).getValue();
        if (!zi0.c.E(fVar.d)) {
            aVar2.f84169t.a();
        }
        if (!zi0.c.E(fVar.f170808c)) {
            aVar2.u.a();
        }
        return Unit.f186387a;
    }
}
