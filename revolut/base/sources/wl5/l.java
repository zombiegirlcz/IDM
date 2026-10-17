package wl5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import m1c.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f298422w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(s sVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f298422w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f298422w, continuation, 0);
            default:
                return new l(this.f298422w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
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
                ufm.i iVarA = this.f298422w.u.a(o0.DEACTIVATION);
                this.v = 1;
                Object objB = nim.a.b(iVarA, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                s sVar = this.f298422w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    sl5.f fVar = sVar.f298429q;
                    this.v = 1;
                    obj2 = fVar.d(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (((il5.d) obj2) instanceof il5.a) {
                    sVar.v2(jl5.c.f175596a);
                }
                return Unit.f186387a;
        }
    }
}
