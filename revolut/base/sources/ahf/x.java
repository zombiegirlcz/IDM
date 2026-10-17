package ahf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends gim.i implements Function2 {
    public z u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f5101w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f5102x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.f5101w = zVar;
        this.f5102x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.f5101w, this.f5102x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        z zVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            z zVar2 = this.f5101w;
            c0 c0Var = zVar2.f5105r;
            qua.p pVar = (qua.p) this.f5102x;
            this.u = zVar2;
            this.v = 1;
            Object objA = c0Var.a(pVar, this);
            if (objA == aVar) {
                return aVar;
            }
            zVar = zVar2;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = this.u;
            yhm.o.b(obj2);
        }
        return zVar.C1((aii.u) obj2);
    }
}
