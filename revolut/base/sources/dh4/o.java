package dh4;

import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a f114758w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f114758w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f114758w, continuation, 0);
            default:
                return new o(this.f114758w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a aVar = this.f114758w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ay3.a aVar3 = aVar.o;
                    h1 h1VarF = w0.F(aVar.f68255p.f68253a);
                    this.v = 1;
                    e44.b bVar = aVar3.f11057a;
                    bVar.getClass();
                    dz6.o oVar = new dz6.o(bVar, h1VarF, continuation, 17);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, oVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar.C2(new h((it3.d) obj2));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    o oVar2 = new o(aVar, continuation, 0);
                    this.v = 1;
                    if (aVar.p2(this, oVar2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
