package as1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import xo1.f;

/* JADX INFO: loaded from: classes20.dex */
public final class y extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ a0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.v = a0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        a0 a0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            a3b.h hVar = new a3b.h(a0Var, 4);
            an1.d dVar = new an1.d(a0Var, 2);
            x xVar = new x(a0Var, null, 1);
            this.u = 1;
            obj2 = n14.k.P(a0Var.X(), null, hVar, dVar, xVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        nii.e eVar = (nii.e) obj2;
        if (eVar instanceof nii.d) {
            xo1.f fVar = (xo1.f) ((nii.d) eVar).f216133a;
            if (!(fVar instanceof xo1.e)) {
                if (fVar instanceof f.a) {
                    throw new IllegalStateException("Tapi Transfers do not support StandingOrder");
                }
                throw new NoWhenBranchMatchedException();
            }
            a0Var.C2(new k(((xo1.e) fVar).f307568a));
        }
        return Unit.f186387a;
    }
}
