package ke2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.v1;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f182962w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f182962w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f182962w, continuation, 0);
            default:
                return new m(this.f182962w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    q qVar = this.f182962w;
                    iyi.j jVar = new iyi.j(qVar, null, 21);
                    this.v = 1;
                    if (u0.b0(qVar.X(), "CONTINUE_BUTTON", jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
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
                com.revolut.feature.apm.swish.impl.domain.a aVar3 = this.f182962w.f182965p;
                fx1.a aVar4 = aVar3.f62908a;
                dx1.g apmProduct = dx1.g.f120517a;
                Intrinsics.checkNotNullParameter(apmProduct, "apmProduct");
                v1 v1VarR = vkm.q.R(vkm.q.H(new i44.a(aVar3, null, 17), mo3.a.h(qe0.o.c(((iz1.h) aVar4).f169831c, new iz1.d(apmProduct, null), iz1.h.d, null, 28), new i6j.q(6), new i83.m(27), 2)), new p(3, null));
                this.v = 1;
                Object objF = vkm.q.F(v1VarR, this);
                return objF == aVar2 ? aVar2 : objF;
        }
    }
}
