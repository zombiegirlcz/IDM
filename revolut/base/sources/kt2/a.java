package kt2;

import com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.type.BigTileReferralWithIncentiveOverviewScreen;
import gim.i;
import ht2.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BigTileReferralWithIncentiveOverviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(BigTileReferralWithIncentiveOverviewScreen bigTileReferralWithIncentiveOverviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bigTileReferralWithIncentiveOverviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.v, continuation, 0);
            default:
                return new a(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BigTileReferralWithIncentiveOverviewScreen bigTileReferralWithIncentiveOverviewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bigTileReferralWithIncentiveOverviewScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                KProperty[] kPropertyArr = BigTileReferralWithIncentiveOverviewScreen.Y;
                ((w) bigTileReferralWithIncentiveOverviewScreen.R2()).J2();
                break;
        }
        return Unit.f186387a;
    }
}
