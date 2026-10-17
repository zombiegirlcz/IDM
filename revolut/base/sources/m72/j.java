package m72;

import blj.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import vkm.t0;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ z1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f203293w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z1 z1Var, k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = z1Var;
        this.f203293w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f203293w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            Flow flowJ = q.j(q.i(this.v, 1, ukm.f.DROP_OLDEST), -1, 2);
            k kVar = this.f203293w;
            t0 t0VarB = q.B(new i(kVar, null), flowJ);
            t tVar = new t(kVar, 12);
            this.u = 1;
            if (t0VarB.collect(tVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
