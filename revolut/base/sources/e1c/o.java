package e1c;

import com.revolut.feature.rev_points.extensions.RevPointsTabAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
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
        q qVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jxb.l lVar = (jxb.l) qVar.f121959p.f220804a;
            pfm.a aVarE = w.g0(lVar.f179124a.executeUpsellFlow()).e(lVar.f179127g.g(Unit.f186387a, false));
            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
            this.u = 1;
            if (nim.a.a(aVarE, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return qVar.C1(u0.b(q.I2(RevPointsTabAction.ShowSpareChangeUpsell.f83615a)));
    }
}
