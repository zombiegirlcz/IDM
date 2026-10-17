package om4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class e1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r1 f226558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f226559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f226560y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(r1 r1Var, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226558w = r1Var;
        this.f226559x = str;
        this.f226560y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e1(this.f226558w, this.f226559x, this.f226560y, continuation, 0);
            case 1:
                return new e1(this.f226558w, this.f226559x, this.f226560y, continuation, 1);
            case 2:
                return new e1(this.f226558w, this.f226559x, this.f226560y, continuation, 2);
            default:
                return new e1(this.f226558w, this.f226559x, this.f226560y, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    x1 x1Var = this.f226558w.e;
                    this.v = 1;
                    Object objD = x1Var.f226742a.f116608h.d(new cp4.f0(this.f226559x, this.f226560y), true, this);
                    if (objD != aVar) {
                        objD = Unit.f186387a;
                    }
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
                    this.v = 1;
                    if (this.f226558w.q(this.f226559x, this.f226560y, this) == aVar2) {
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
                    this.v = 1;
                    if (this.f226558w.p(this.f226559x, this.f226560y, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    Object objD2 = this.f226558w.e.f226742a.f116608h.d(new cp4.f0(this.f226559x, this.f226560y), true, this);
                    if (objD2 != aVar4) {
                        objD2 = Unit.f186387a;
                    }
                    if (objD2 != aVar4) {
                        objD2 = Unit.f186387a;
                    }
                    if (objD2 != aVar4) {
                        objD2 = Unit.f186387a;
                    }
                    if (objD2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
