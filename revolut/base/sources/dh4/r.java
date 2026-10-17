package dh4;

import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.RefinancingAccountDetailsHomeScreenContract$InputData;
import dx4.k3;
import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a f114761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k3 f114762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f114763y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a aVar, k3 k3Var, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f114761w = aVar;
        this.f114762x = k3Var;
        this.f114763y = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f114761w, this.f114762x, this.f114763y, continuation, 0);
            default:
                return new r(this.f114761w, this.f114762x, this.f114763y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a aVar = this.f114761w;
                RefinancingAccountDetailsHomeScreenContract$InputData refinancingAccountDetailsHomeScreenContract$InputData = aVar.f68255p;
                ay3.a aVar2 = aVar.o;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Continuation continuation = null;
                if (i == 0) {
                    yhm.o.b(obj2);
                    h1 h1VarF = w0.F(refinancingAccountDetailsHomeScreenContract$InputData.f68253a);
                    String str = this.f114762x.f120651a;
                    this.v = 1;
                    e44.b bVar = aVar2.f11057a;
                    bVar.getClass();
                    dp4.p pVar = new dp4.p(bVar, h1VarF, new y14.e(str, this.f114763y), (Continuation) null, 13);
                    p0 p0Var = p0.f264001a;
                    if (e0.J(elm.f.f127540b, pVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        aVar.C2(new h((it3.d) obj2));
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                h1 h1VarF2 = w0.F(refinancingAccountDetailsHomeScreenContract$InputData.f68253a);
                this.v = 2;
                e44.b bVar2 = aVar2.f11057a;
                bVar2.getClass();
                dz6.o oVar = new dz6.o(bVar2, h1VarF2, continuation, 17);
                p0 p0Var2 = p0.f264001a;
                obj2 = e0.J(elm.f.f127540b, oVar, this);
                if (obj2 == aVar3) {
                    return aVar3;
                }
                aVar.C2(new h((it3.d) obj2));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a aVar5 = this.f114761w;
                    r rVar = new r(aVar5, this.f114762x, this.f114763y, null, 0);
                    this.v = 1;
                    if (aVar5.p2(this, rVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
