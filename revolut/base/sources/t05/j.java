package t05;

import com.revolut.feature.credit.health.api.models.CreditScore;
import com.revolut.feature.credit.health.impl.domain.model.ActiveApplication;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsight;
import com.revolut.feature.credit.health.impl.domain.model.PreapprovedOffer;
import com.revolut.feature.credit.health.impl.ui.dashboard.DashboardScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DashboardScreen f266922w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(DashboardScreen dashboardScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f266922w = dashboardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f266922w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f266922w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j(this.f266922w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            case 3:
                j jVar4 = new j(this.f266922w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
            default:
                j jVar5 = new j(this.f266922w, continuation, 4);
                jVar5.v = obj2;
                return jVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((ActiveApplication) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((CreditScoreInsight) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((j) create((PreapprovedOffer) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((CreditScoreInsight) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CreditScore creditScore;
        int i = this.u;
        DashboardScreen dashboardScreen = this.f266922w;
        switch (i) {
            case 0:
                ActiveApplication application = (ActiveApplication) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarD3 = dashboardScreen.d3();
                xVarD3.getClass();
                Intrinsics.checkNotNullParameter(application, "application");
                xVarD3.C2(new o(application));
                break;
            case 1:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarD32 = dashboardScreen.d3();
                String id10 = aVar2.f275445a;
                xVarD32.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "LEARN_MORE_ID") && (creditScore = (CreditScore) ((n) ((j2) xVarD32.f266939s.f22677a).getValue()).f266925c.getContent()) != null) {
                    xVarD32.C2(new p(creditScore));
                }
                break;
            case 2:
                CreditScoreInsight insight = (CreditScoreInsight) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarD33 = dashboardScreen.d3();
                xVarD33.getClass();
                Intrinsics.checkNotNullParameter(insight, "insight");
                xVarD33.C2(new q(insight));
                break;
            case 3:
                PreapprovedOffer offer = (PreapprovedOffer) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarD34 = dashboardScreen.d3();
                xVarD34.getClass();
                Intrinsics.checkNotNullParameter(offer, "offer");
                xVarD34.C2(new s(offer));
                break;
            default:
                CreditScoreInsight insight2 = (CreditScoreInsight) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarD35 = dashboardScreen.d3();
                xVarD35.getClass();
                Intrinsics.checkNotNullParameter(insight2, "insight");
                xVarD35.C2(new q(insight2));
                break;
        }
        return Unit.f186387a;
    }
}
