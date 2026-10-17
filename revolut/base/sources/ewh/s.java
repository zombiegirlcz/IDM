package ewh;

import com.revolut.feature_autoinvest_ui_api.navigation.AutoInvestMoveControllerApi$Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import m1c.o0;
import m1c.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ v v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, Continuation continuation) {
        super(1, continuation);
        this.v = vVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        v vVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.i iVarA = vVar.f130285q.a(o0.DEACTIVATION);
            this.u = 1;
            obj2 = nim.a.b(iVarA, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        p0 p0Var = (p0) obj2;
        if ((p0Var == null ? -1 : r.f130281a[p0Var.ordinal()]) == 1) {
            yji.l.j2(vVar, vVar.e1(new p1c.b()), null, new eu7.c(vVar, 14), 1);
        } else {
            vVar.C2(new AutoInvestMoveControllerApi$Result.Move(vVar.o.f96624a));
        }
        return Unit.f186387a;
    }
}
