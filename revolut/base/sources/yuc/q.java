package yuc;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f316988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f316989x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(u uVar, boolean z, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f316988w = uVar;
        this.f316989x = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f316988w, this.f316989x, continuation, 0);
            default:
                return new q(this.f316988w, this.f316989x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        u uVar = this.f316988w;
        boolean z = this.f316989x;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarF = uVar.f316998s.f(false);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarF, this);
                    if (obj2 == aVar) {
                        return aVar;
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
                if (!((do3.n) obj2).f116412h) {
                    uVar.u = Boolean.valueOf(z);
                    return uVar.C1(tla.d.a(uVar.f316999t));
                }
                this.v = 2;
                Object objK2 = uVar.K2(new q(uVar, z, continuation, i2), this);
                if (objK2 != aVar) {
                    objK2 = Unit.f186387a;
                }
                if (objK2 == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    uVar.H2(uVar.getState(), new xyh.n(z, 17));
                    wtc.h hVar = uVar.f316995p;
                    this.v = 1;
                    cuc.d dVar = hVar.f299872a;
                    dVar.getClass();
                    af3.f fVar = new af3.f(dVar, z, continuation, 8);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, fVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
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
