package hib;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f152588w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f152588w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f152588w, continuation, 0);
            default:
                return new o(this.f152588w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        q qVar = this.f152588w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    n nVar = new n(0, continuation, qVar);
                    this.v = 1;
                    if (qVar.p2(this, nVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    zjh.f fVar = qVar.f152591q;
                    this.v = 1;
                    fVar.getClass();
                    cq6.k kVar = new cq6.k(fVar, continuation, 20);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, kVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                qVar.s1();
                int i5 = p.f152589a[((fib.j) obj2).ordinal()];
                if (i5 == 1) {
                    qVar.C2(new h(((e) ((j2) qVar.u.f22677a).getValue()).f152576a));
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qVar.C2(i.f152580a);
                }
                return Unit.f186387a;
        }
    }
}
