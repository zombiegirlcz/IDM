package zr2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.a2;
import tof.a3;
import zr2.d;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3 f324536w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, a3 a3Var, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f324536w = a3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f324536w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        n nVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            a2 a2Var = nVar.f324545w;
            Continuation continuation = null;
            if (a2Var != null) {
                a2Var.f(null);
            }
            ack.n nVar2 = new ack.n(19);
            zp8.g gVar = new zp8.g(nVar, this.f324536w, continuation, 3);
            this.u = 1;
            obj2 = n14.k.Q(nVar, null, null, nVar2, gVar, this, 3);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (((nii.e) obj2) instanceof nii.d) {
            nVar.v2(d.b.f324533a);
        }
        return Unit.f186387a;
    }
}
