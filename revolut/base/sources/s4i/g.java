package s4i;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import w4i.a0;
import w4i.z;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f259883w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, a0 a0Var, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f259883w = a0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f259883w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            prl.e eVar = this.v.f259888t;
            z zVar = (z) this.f259883w;
            String str = zVar.f294599a;
            Object obj3 = zVar.f294600b;
            this.u = 1;
            if (eVar.o(obj3, this) == aVar) {
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
