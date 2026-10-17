package kye;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s2 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190831w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f190832x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(k3 k3Var, dj0.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f190831w = k3Var;
        this.f190832x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s2(this.f190831w, this.f190832x, continuation, 0);
            default:
                return new s2(this.f190831w, this.f190832x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s2) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        k3 k3Var = this.f190831w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    t1j.b bVar = k3Var.P;
                    yte.m mVar = yte.m.OPEN_BANKING;
                    this.v = 1;
                    a31.w wVar = new a31.w((r10.w) bVar.f267380b, mVar.name(), this.f190832x, (String) null, (String) null, (Continuation) null);
                    skm.p0 p0Var = skm.p0.f264001a;
                    obj2 = skm.e0.J(elm.f.f127540b, wVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (((qte.c) obj2).f249100b.f115082a == 0) {
                    return obj2;
                }
                return null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ufm.n nVarB = k3Var.C.b(this.f190832x);
                    this.v = 1;
                    obj2 = nim.a.b(nVarB, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                dj0.d dVar = (dj0.d) obj2;
                Intrinsics.h(dVar);
                return new qte.d(dVar, null, null);
        }
    }
}
