package q09;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m0 f241195w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(m0 m0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241195w = m0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l0(this.f241195w, continuation, 0);
            case 1:
                return new l0(this.f241195w, continuation, 1);
            default:
                return new l0(this.f241195w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                m0 m0Var = this.f241195w;
                efm.d0 d0VarB = m0Var.f241197p.b(m0Var.f241199r.f78016a, u09.y.CONTENT_FINISHED);
                this.v = 1;
                Object objB = nim.a.b(d0VarB, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                m0 m0Var2 = this.f241195w;
                efm.d0 d0VarB2 = m0Var2.f241197p.b(m0Var2.f241199r.f78016a, u09.y.QUIZ_STARTED);
                this.v = 1;
                Object objB2 = nim.a.b(d0VarB2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                m0 m0Var3 = this.f241195w;
                efm.d0 d0VarB3 = m0Var3.f241197p.b(m0Var3.f241199r.f78016a, u09.y.COMPLETED);
                this.v = 1;
                Object objB3 = nim.a.b(d0VarB3, this);
                return objB3 == aVar3 ? aVar3 : objB3;
        }
    }
}
