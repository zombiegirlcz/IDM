package a2f;

import a41.j1;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration.TradeRevPointsAccountRegistrationScreenContract$InputData;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import tsk.t;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u2f.d f823x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, u2f.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f822w = pVar;
        this.f823x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f822w, this.f823x, continuation, 0);
            default:
                return new o(this.f822w, this.f823x, continuation, 1);
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
        u2f.d dVar = this.f823x;
        p pVar = this.f822w;
        switch (i) {
            case 0:
                TradeRevPointsAccountRegistrationScreenContract$InputData tradeRevPointsAccountRegistrationScreenContract$InputData = pVar.o;
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
                t tVar = pVar.f824p;
                u2f.j jVar = tradeRevPointsAccountRegistrationScreenContract$InputData.f91133b;
                String str = dVar.f276624m.f276638a;
                String str2 = ((f) ((j2) pVar.f828t.f22677a).getValue()).f810b;
                String str3 = tradeRevPointsAccountRegistrationScreenContract$InputData.f91132a;
                this.v = 1;
                k1f.d dVar2 = (k1f.d) tVar.f274170b;
                dVar2.getClass();
                j1 j1Var = new j1(dVar2, jVar, str, str2, str3, (Continuation) null);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, j1Var, this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    o oVar = new o(pVar, dVar, null, 0);
                    this.v = 1;
                    obj2 = u0.b0(pVar.X(), "REGISTER_ACCOUNT_BUTTON_TAG", oVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                pVar.C2(new g((TradeRevPointsAccount) obj2));
                return Unit.f186387a;
        }
    }
}
