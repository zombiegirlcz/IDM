package b54;

import c84.t;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.akahu.b f12431w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.credit.application.plugins.impl.ui.akahu.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f12431w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f12431w, continuation, 0);
            case 1:
                return new f(this.f12431w, continuation, 1);
            case 2:
                return new f(this.f12431w, continuation, 2);
            default:
                return new f(this.f12431w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 13;
        int i3 = 2;
        Continuation continuation = null;
        com.revolut.feature.credit.application.plugins.impl.ui.akahu.b bVar = this.f12431w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    f fVar = new f(bVar, continuation, i3);
                    this.v = 1;
                    if (bVar.p2(this, fVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    f fVar2 = new f(bVar, continuation, 3);
                    this.v = 1;
                    if (bVar.p2(this, fVar2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    mw3.c cVar = bVar.f67027q;
                    h1 h1VarA9 = bVar.f67026p.a9();
                    this.v = 1;
                    s24.a aVar4 = cVar.f209320a;
                    aVar4.getClass();
                    rhl.b bVar2 = new rhl.b(aVar4, h1VarA9, continuation, i2);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, bVar2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(bVar, (it3.d) obj2, this, 2) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    mw3.c cVar2 = bVar.f67027q;
                    h1 h1VarA92 = bVar.f67026p.a9();
                    this.v = 1;
                    s24.a aVar6 = cVar2.f209320a;
                    aVar6.getClass();
                    rhl.b bVar3 = new rhl.b(aVar6, h1VarA92, continuation, i2);
                    p0 p0Var2 = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, bVar3, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(bVar, (it3.d) obj2, this, 2) == aVar5) {
                    return aVar5;
                }
                return Unit.f186387a;
        }
    }
}
