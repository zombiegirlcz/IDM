package rv6;

import com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.FreelancerCashbackPlanScreen;
import com.revolut.feature.profile.api.navigation.ProfileFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FreelancerCashbackPlanScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(FreelancerCashbackPlanScreen freelancerCashbackPlanScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = freelancerCashbackPlanScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            case 1:
                return new h(this.v, continuation, 1);
            default:
                return new h(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FreelancerCashbackPlanScreen freelancerCashbackPlanScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) freelancerCashbackPlanScreen.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) freelancerCashbackPlanScreen.d();
                uVar.getClass();
                uVar.n2(new t(uVar, null, 1), new whi.b(6));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar2 = (u) freelancerCashbackPlanScreen.d();
                uVar2.getClass();
                uVar2.C1(u0.c(ProfileFeatureConfig.Terms.f81349a));
                break;
        }
        return Unit.f186387a;
    }
}
