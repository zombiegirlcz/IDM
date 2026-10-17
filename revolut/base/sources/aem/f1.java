package aem;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes23.dex */
public final class f1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3717w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function3 f3718x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(Function3 function3, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f3718x = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        sem.f fVar = (sem.f) obj2;
        switch (this.u) {
            case 0:
                f1 f1Var = new f1(this.f3718x, (Continuation) obj4, 0);
                f1Var.f3717w = fVar;
                return f1Var.invokeSuspend(Unit.f186387a);
            case 1:
                f1 f1Var2 = new f1(this.f3718x, (Continuation) obj4, 1);
                f1Var2.f3717w = fVar;
                return f1Var2.invokeSuspend(Unit.f186387a);
            case 2:
                f1 f1Var3 = new f1(this.f3718x, (Continuation) obj4, 2);
                f1Var3.f3717w = fVar;
                return f1Var3.invokeSuspend(Unit.f186387a);
            default:
                f1 f1Var4 = new f1(this.f3718x, (Continuation) obj4, 3);
                f1Var4.f3717w = fVar;
                return f1Var4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Function3 function3 = this.f3718x;
        switch (i) {
            case 0:
                sem.f fVar = (sem.f) this.f3717w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                } catch (Throwable th10) {
                    fem.b bVarC = ((wdm.f) fVar.f262233a).c();
                    this.f3717w = null;
                    this.v = 2;
                    obj2 = function3.invoke(bVarC, th10, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                }
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.f3717w = fVar;
                    this.v = 1;
                    if (fVar.c(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        Throwable th11 = (Throwable) obj2;
                        if (th11 != null) {
                            throw th11;
                        }
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                sem.f fVar2 = (sem.f) this.f3717w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                } catch (Throwable th12) {
                    fem.d dVar = (fem.d) fVar2.f262233a;
                    Logger logger = h0.f3728a;
                    g0 g0Var = new g0(dVar);
                    this.f3717w = null;
                    this.v = 2;
                    obj2 = function3.invoke(g0Var, th12, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                }
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.f3717w = fVar2;
                    this.v = 1;
                    if (fVar2.c(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        Throwable th13 = (Throwable) obj2;
                        if (th13 != null) {
                            throw th13;
                        }
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                sem.f fVar3 = (sem.f) this.f3717w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    Object obj3 = fVar3.f262233a;
                    i1 i1Var = new i1(1, 8, sem.f.class, fVar3, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
                    this.f3717w = null;
                    this.v = 1;
                    if (function3.invoke(obj3, i1Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                sem.f fVar4 = (sem.f) this.f3717w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    cem.a aVar5 = new cem.a(fVar4);
                    Object objB = fVar4.b();
                    this.f3717w = null;
                    this.v = 1;
                    if (function3.invoke(aVar5, objB, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
