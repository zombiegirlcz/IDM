package f84;

import c84.t;
import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.b f132724w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f132724w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f132724w, continuation, 0);
            case 1:
                return new d(this.f132724w, continuation, 1);
            case 2:
                return new d(this.f132724w, continuation, 2);
            default:
                return new d(this.f132724w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 2;
        Continuation continuation = null;
        com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.b bVar = this.f132724w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    k kVar = bVar.f67357q;
                    this.v = 1;
                    obj2 = kVar.c(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(bVar, (it3.d) obj2, this, 2) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    d dVar = new d(bVar, continuation, 0);
                    this.v = 1;
                    if (bVar.p2(this, dVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    k kVar2 = bVar.f67357q;
                    this.v = 1;
                    uw3.a aVar4 = kVar2.f132737b;
                    h1 h1VarA9 = kVar2.f132736a.a9();
                    z24.a aVar5 = aVar4.f283543a;
                    aVar5.getClass();
                    yv1.k kVar3 = new yv1.k(aVar5, h1VarA9, continuation, 17);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, kVar3, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
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
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    d dVar2 = new d(bVar, continuation, i2);
                    this.v = 1;
                    if (bVar.p2(this, dVar2) == aVar6) {
                        return aVar6;
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
