package md8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import m9d.j1;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f204512w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(q qVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f204512w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f204512w, continuation, 0);
            case 1:
                return new n(this.f204512w, continuation, 1);
            default:
                return new n(this.f204512w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    q qVar = this.f204512w;
                    m mVar = new m(qVar, null);
                    this.v = 1;
                    if (u0.b0(qVar.X(), "SECONDARY_BUTTON_LOADING_TAG", mVar, this) == aVar) {
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
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                efm.r rVarG = m70.a.g(this.f204512w.f204518s.K(w4l.j.f294644c), null, new j1(20), 1);
                this.v = 1;
                Object objC = nim.a.c(rVarG, this);
                return objC == aVar2 ? aVar2 : objC;
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
                efm.r rVarG2 = m70.a.g(this.f204512w.f204518s.H(), null, new j1(21), 1);
                this.v = 1;
                Object objC2 = nim.a.c(rVarG2, this);
                return objC2 == aVar3 ? aVar3 : objC2;
        }
    }
}
