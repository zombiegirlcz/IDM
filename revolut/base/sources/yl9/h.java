package yl9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f314672w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(k kVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f314672w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f314672w, continuation, 0);
            case 1:
                return new h(this.f314672w, continuation, 1);
            case 2:
                return new h(this.f314672w, continuation, 2);
            default:
                return new h(this.f314672w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        k kVar = this.f314672w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    ql9.d dVar = kVar.f314675q;
                    String str = kVar.o.f78958a.f78950a;
                    this.v = 1;
                    dVar.getClass();
                    ql9.b bVar = new ql9.b(dVar, str, continuation, i2);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, bVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                kVar.C2(c.f314667a);
                return Unit.f186387a;
            case 1:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    h hVar = new h(kVar, continuation, i2);
                    this.v = 1;
                    if (kVar.p2(this, hVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    ql9.d dVar2 = kVar.f314675q;
                    String str2 = kVar.o.f78958a.f78950a;
                    this.v = 1;
                    dVar2.getClass();
                    ql9.b bVar2 = new ql9.b(dVar2, str2, continuation, 4);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(elm.f.f127540b, bVar2, this);
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                kVar.C2(d.f314668a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    h hVar2 = new h(kVar, continuation, 2);
                    this.v = 1;
                    if (kVar.p2(this, hVar2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
