package ink;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_referrals_invite_video.PlanReferralsInviteVideoScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_referrals_invite_video.PlanReferralsInviteVideoScreenContract$InputData;
import ink.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import qgk.c1;
import qgk.i0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlanReferralsInviteVideoScreen f162975b;

    public /* synthetic */ a(PlanReferralsInviteVideoScreen planReferralsInviteVideoScreen, int i) {
        this.f162974a = i;
        this.f162975b = planReferralsInviteVideoScreen;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f162974a;
        PlanReferralsInviteVideoScreen planReferralsInviteVideoScreen = this.f162975b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = PlanReferralsInviteVideoScreen.P;
                qji.b bVarU2 = planReferralsInviteVideoScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_referrals_invite_video.di.PlanReferralsInviteVideoScreenInjector");
                c1 c1Var = (c1) bVarU2;
                i0 i0Var = c1Var.f245903b;
                c1 c1Var2 = c1Var.f245904c;
                PlanReferralsInviteVideoScreenContract$InputData planReferralsInviteVideoScreenContract$InputData = planReferralsInviteVideoScreen.K;
                planReferralsInviteVideoScreenContract$InputData.getClass();
                break;
            case 1:
                KProperty[] kPropertyArr2 = PlanReferralsInviteVideoScreen.P;
                break;
            case 2:
                KProperty[] kPropertyArr3 = PlanReferralsInviteVideoScreen.P;
                break;
            case 3:
                KProperty[] kPropertyArr4 = PlanReferralsInviteVideoScreen.P;
                ((f) ((d) planReferralsInviteVideoScreen.M.getValue())).C2(c.b.f162977a);
                break;
            default:
                KProperty[] kPropertyArr5 = PlanReferralsInviteVideoScreen.P;
                ((f) ((d) planReferralsInviteVideoScreen.M.getValue())).C2(c.a.f162976a);
                break;
        }
        return Unit.f186387a;
    }
}
