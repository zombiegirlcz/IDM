package akf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class q1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s1 f5887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ oq9.h f5888x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(s1 s1Var, oq9.h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f5887w = s1Var;
        this.f5888x = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q1(this.f5887w, this.f5888x, continuation, 0);
            default:
                return new q1(this.f5887w, this.f5888x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    mq9.f fVar = this.f5887w.f5898q;
                    oq9.h hVar = this.f5888x;
                    pfm.r rVarJ = ((mr9.a) fVar).j(hVar.f227822b, hVar);
                    this.v = 1;
                    if (nim.a.a(rVarJ, this) == aVar) {
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
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    s1 s1Var = this.f5887w;
                    q1 q1Var = new q1(s1Var, this.f5888x, null, 0);
                    this.v = 1;
                    if (s1Var.Y2(this, q1Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
