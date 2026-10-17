package c2f;

import a41.j1;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration_tax_id.TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import tsk.t;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f20774w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f20775x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f20774w = lVar;
        this.f20775x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f20774w, this.f20775x, continuation, 0);
            default:
                return new k(this.f20774w, this.f20775x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        l lVar = this.f20774w;
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
                t tVar = lVar.f20776p;
                TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData = lVar.o;
                u2f.j jVar = tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData.f91136c;
                String str = tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData.f91134a;
                String str2 = tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData.f91135b;
                this.v = 1;
                k1f.d dVar = (k1f.d) tVar.f274170b;
                dVar.getClass();
                j1 j1Var = new j1(dVar, jVar, this.f20775x, str, str2, (Continuation) null);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, j1Var, this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    k kVar = new k(lVar, this.f20775x, null, 0);
                    this.v = 1;
                    obj2 = u0.b0(lVar.X(), "SUBMIT_BUTTON_LOADING_TAG", kVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                lVar.C2(new f((TradeRevPointsAccount) obj2));
                return Unit.f186387a;
        }
    }
}
