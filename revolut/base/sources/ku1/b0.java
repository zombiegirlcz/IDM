package ku1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f189596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c02.j f189597x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(e0 e0Var, c02.j jVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f189596w = e0Var;
        this.f189597x = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b0(this.f189596w, this.f189597x, continuation, 0);
            case 1:
                return new b0(this.f189596w, this.f189597x, continuation, 1);
            case 2:
                return new b0(this.f189596w, this.f189597x, continuation, 2);
            case 3:
                return new b0(this.f189596w, this.f189597x, continuation, 3);
            default:
                return new b0(this.f189596w, this.f189597x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b0) create(continuation)).invokeSuspend(Unit.f186387a);
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
                e0 e0Var = this.f189596w;
                eu1.a aVar2 = e0Var.f189601q;
                String str = ((h) e0Var.t2()).e;
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ufm.n nVarB = ((eu1.h) aVar2).b(this.f189597x, str);
                this.v = 1;
                Object objB = nim.a.b(nVarB, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                e0 e0Var2 = this.f189596w;
                b0 b0Var = new b0(e0Var2, this.f189597x, null, 0);
                this.v = 1;
                Object objT = do3.q.t(e0Var2, b0Var, this);
                return objT == aVar3 ? aVar3 : objT;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                e0 e0Var3 = this.f189596w;
                b0 b0Var2 = new b0(e0Var3, this.f189597x, null, 1);
                this.v = 1;
                Object objB0 = u0.b0(e0Var3.X(), "MAIN_BUTTON_LOADING_TAG", b0Var2, this);
                return objB0 == aVar4 ? aVar4 : objB0;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ufm.n nVarC = ((eu1.h) this.f189596w.f189601q).c(this.f189597x, null);
                this.v = 1;
                Object objB2 = nim.a.b(nVarC, this);
                return objB2 == aVar5 ? aVar5 : objB2;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                e0 e0Var4 = this.f189596w;
                b0 b0Var3 = new b0(e0Var4, this.f189597x, null, 3);
                this.v = 1;
                Object objB02 = u0.b0(e0Var4.X(), "SECONDARY_BUTTON_LOADING_TAG", b0Var3, this);
                return objB02 == aVar6 ? aVar6 : objB02;
        }
    }
}
