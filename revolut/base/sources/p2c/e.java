package p2c;

import com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.RevPointsSpareChangeController;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RevPointsSpareChangeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(RevPointsSpareChangeController revPointsSpareChangeController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = revPointsSpareChangeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsSpareChangeController revPointsSpareChangeController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a aVar2 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a) revPointsSpareChangeController.d3();
                aVar2.getClass();
                aVar2.l2(new r(0, aVar2, null), new o(aVar2, 1));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a) revPointsSpareChangeController.d3()).J2();
                break;
        }
        return Unit.f186387a;
    }
}
