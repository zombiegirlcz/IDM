package yna;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c1 f315353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f315354x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(c1 c1Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f315353w = c1Var;
        this.f315354x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j0(this.f315353w, this.f315354x, continuation, 0);
            case 1:
                return new j0(this.f315353w, this.f315354x, continuation, 1);
            default:
                return new j0(this.f315353w, this.f315354x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                wli.x xVar = this.f315353w.i0;
                Boolean bool = Boolean.FALSE;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, this.f315354x, null, bool, this, 2);
                return objX1 == aVar ? aVar : objX1;
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
                ufm.c cVarA = this.f315353w.G.a(this.f315354x);
                this.v = 1;
                Object objB = nim.a.b(cVarA, this);
                return objB == aVar2 ? aVar2 : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                c1 c1Var = this.f315353w;
                Continuation continuation = null;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    z0 z0Var = new z0(c1Var, this.f315354x, continuation, 2);
                    this.v = 1;
                    obj2 = c1Var.p2(this, z0Var);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                z0 z0Var2 = new z0(c1Var, (String) obj2, continuation, 1);
                this.v = 2;
                if (do3.q.t(c1Var, z0Var2, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
        }
    }
}
