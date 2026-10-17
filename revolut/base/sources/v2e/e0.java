package v2e;

import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPoints;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ i0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.v = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e0 e0Var = new e0(this.v, continuation);
        e0Var.u = obj2;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RevPoints revPointsA;
        m1c.x xVar;
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object content = data.getContent();
        m1c.y yVar = content instanceof m1c.y ? (m1c.y) content : null;
        if (yVar == null || (xVar = yVar.f201475a) == null) {
            RevPoints.INSTANCE.getClass();
            revPointsA = RevPoints.Companion.a(0L);
        } else {
            revPointsA = xVar.f201472c;
        }
        i0 i0Var = this.v;
        i0Var.H2(i0Var.B, new q2e.f0(1, revPointsA));
        return Unit.f186387a;
    }
}
