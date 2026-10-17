package vy5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f293215w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f293215w = wVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f293215w, continuation, 0);
            default:
                return new u(this.f293215w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        w wVar = this.f293215w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    rfb.b bVar = wVar.B;
                    this.v = 1;
                    obj2 = bVar.a(rfb.d.f253751a, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rfb.a aVar2 = (rfb.a) obj2;
                if (aVar2.f253748a) {
                    wVar.A2(aVar2.f253749b);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                Continuation continuation = null;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    g89.a aVar4 = wVar.u;
                    this.v = 1;
                    aVar4.getClass();
                    fo1.b0 b0Var = new fo1.b0(aVar4, continuation, 18);
                    skm.p0 p0Var = skm.p0.f264001a;
                    obj2 = skm.e0.J(elm.f.f127540b, b0Var, this);
                    if (obj2 != aVar3) {
                    }
                    return aVar3;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                efm.d0 d0VarS1 = lg0.b.s1(wVar.f293236s, (String) obj2, null, null, 6);
                this.v = 2;
                Object objB = nim.a.b(d0VarS1, this);
                if (objB != aVar3) {
                    return objB;
                }
                return aVar3;
        }
    }
}
