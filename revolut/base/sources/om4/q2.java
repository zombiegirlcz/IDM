package om4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class q2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x2 f226670w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f226671x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(x2 x2Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226670w = x2Var;
        this.f226671x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q2(this.f226670w, this.f226671x, continuation, 0);
            case 1:
                return new q2(this.f226670w, this.f226671x, continuation, 1);
            case 2:
                return new q2(this.f226670w, this.f226671x, continuation, 2);
            case 3:
                return new q2(this.f226670w, this.f226671x, continuation, 3);
            default:
                return new q2(this.f226670w, this.f226671x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    dp4.c0 c0Var = this.f226670w.f;
                    this.v = 1;
                    Object objD = c0Var.e.d(new cp4.z(this.f226671x), false, this);
                    if (objD != aVar) {
                        objD = Unit.f186387a;
                    }
                    if (objD == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    dp4.c0 c0Var2 = this.f226670w.f;
                    this.v = 1;
                    Object objD2 = c0Var2.f116607g.d(new cp4.a0(this.f226671x), false, this);
                    if (objD2 != aVar2) {
                        objD2 = Unit.f186387a;
                    }
                    if (objD2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    dp4.c1 c1Var = this.f226670w.f226745a;
                    this.v = 1;
                    Object objD3 = c1Var.i.d(this.f226671x, false, this);
                    if (objD3 != aVar3) {
                        objD3 = Unit.f186387a;
                    }
                    if (objD3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (this.f226670w.K(this.f226671x, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    ll4.w wVar = ll4.w.MAIN_POCKET;
                    this.v = 1;
                    if (this.f226670w.M(this.f226671x, wVar, this) == aVar5) {
                        return aVar5;
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
