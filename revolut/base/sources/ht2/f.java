package ht2;

import com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.BaseReferralWithIncentiveOverviewScreen;
import ip0.az;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BaseReferralWithIncentiveOverviewScreen f155220w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(BaseReferralWithIncentiveOverviewScreen baseReferralWithIncentiveOverviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155220w = baseReferralWithIncentiveOverviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f155220w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f155220w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f155220w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((az) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BaseReferralWithIncentiveOverviewScreen baseReferralWithIncentiveOverviewScreen = this.f155220w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarD3 = baseReferralWithIncentiveOverviewScreen.d3();
                w wVar = (w) nVarD3;
                wVar.K2(aVar.d, aVar.f275445a);
                break;
            case 1:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarD32 = baseReferralWithIncentiveOverviewScreen.d3();
                w wVar2 = (w) nVarD32;
                wVar2.K2(aVar3.d, aVar3.f275445a);
                break;
            default:
                az azVar = (az) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarD33 = baseReferralWithIncentiveOverviewScreen.d3();
                w wVar3 = (w) nVarD33;
                wVar3.K2(azVar.f163509c, azVar.f163507a);
                break;
        }
        return Unit.f186387a;
    }
}
