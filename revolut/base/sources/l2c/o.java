package l2c;

import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.f fVarD = aVar2.f84174q.d(Boolean.FALSE, null);
            this.u = 1;
            if (nim.a.b(fVarD, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        aVar2.C2(RevPointsSpareChangeControllerApi$Result.Deactivated.f84131a);
        return Unit.f186387a;
    }
}
