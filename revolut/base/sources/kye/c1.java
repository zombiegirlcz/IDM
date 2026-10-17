package kye;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class c1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190718w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(int i, Continuation continuation, k3 k3Var) {
        super(1, continuation);
        this.u = i;
        this.f190718w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c1(0, continuation, this.f190718w);
            case 1:
                return new c1(1, continuation, this.f190718w);
            default:
                return new c1(2, continuation, this.f190718w);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        k3 k3Var = this.f190718w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                hg6.a aVar2 = k3Var.Q;
                this.v = 1;
                th6.h hVar = aVar2.f152108a.f183920a;
                hVar.getClass();
                sqd.h0 h0Var = new sqd.h0(hVar, null, 25);
                skm.p0 p0Var = skm.p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, h0Var, this);
                return objJ == aVar ? aVar : objJ;
            case 1:
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
                hg6.a aVar4 = k3Var.Q;
                this.v = 1;
                zh6.c cVar = aVar4.f152109b.f161082a;
                cVar.getClass();
                yzb.c cVar2 = new yzb.c(cVar, null, 18);
                skm.p0 p0Var2 = skm.p0.f264001a;
                Object objJ2 = skm.e0.J(elm.f.f127540b, cVar2, this);
                return objJ2 == aVar3 ? aVar3 : objJ2;
            default:
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
                u51.a aVar6 = k3Var.I;
                n nVar = k3Var.f190767s;
                jhi.b bVarG = mo3.a.g(((e0f.r1) aVar6).i(pw5.a.K(nVar.f190796b, nVar.f190795a)), null, new l0(5), 1);
                this.v = 1;
                Object objZ = vkm.q.z(bVarG, this);
                return objZ == aVar5 ? aVar5 : objZ;
        }
    }
}
