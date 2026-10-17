package jfb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class s0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.reverywhere.impl.web_app.d f173837w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(com.revolut.feature.retail.reverywhere.impl.web_app.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f173837w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s0(this.f173837w, continuation, 0);
            case 1:
                return new s0(this.f173837w, continuation, 1);
            default:
                return new s0(this.f173837w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (skm.k0.b(300L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                com.revolut.feature.retail.reverywhere.impl.web_app.d dVar = this.f173837w;
                dVar.H2(dVar.B, new je5.n(15));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (skm.k0.b(30000L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                com.revolut.feature.retail.reverywhere.impl.web_app.d dVar2 = this.f173837w;
                dVar2.H2(dVar2.B, new je5.n(16));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.retail.reverywhere.impl.web_app.d dVar3 = this.f173837w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    bjl.q0 q0Var = dVar3.o;
                    cjl.f fVar = new cjl.f(dVar3.f82936p.getF82922b());
                    this.v = 1;
                    obj2 = ((xjl.m) q0Var).a(fVar, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                dVar3.H2(dVar3.B, new jeg.g((cjl.c) obj2, 4));
                return Unit.f186387a;
        }
    }
}
