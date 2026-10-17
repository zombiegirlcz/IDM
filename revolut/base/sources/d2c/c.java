package d2c;

import com.revolut.feature.rev_points.spare_change.impl.ui.screen.deactivation.RevPointsSpareChangeDeactivationController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import p1c.c;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RevPointsSpareChangeDeactivationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RevPointsSpareChangeDeactivationController revPointsSpareChangeDeactivationController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = revPointsSpareChangeDeactivationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsSpareChangeDeactivationController revPointsSpareChangeDeactivationController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) ((d) revPointsSpareChangeDeactivationController.O.getValue())).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) ((d) revPointsSpareChangeDeactivationController.O.getValue());
                if (jVar.o == null) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar.C2(c.a.f231889a);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) ((d) revPointsSpareChangeDeactivationController.O.getValue())).B2();
                return Unit.f186387a;
        }
    }
}
