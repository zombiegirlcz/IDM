package mxa;

import com.revolut.data.model.Data;
import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nxa.l;
import nxa.m;
import pwa.n;
import te0.w;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210239a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f210240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f210241c;

    public /* synthetic */ d(String str, g gVar, n nVar) {
        this.f210240b = str;
        this.f210241c = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f210239a) {
            case 0:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                String str = user.f;
                String str2 = this.f210240b;
                if (a0.z(str2, str, true)) {
                    ufm.b bVarM = d0.m(u0.f(new ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination(false, false, null, n.SALARY, 7)));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                if (!w.Y(user)) {
                    return g.c(str2, this.f210241c);
                }
                ufm.b bVarM2 = d0.m(com.revolut.retail.core.navigation.a.c(g.b(null), vhi.c.c(ReferralsBizFeatureConfig.SalaryReferralIneligibleDestination.f81839a, yhi.b.BOTTOM_DIALOG, null, false, 12)));
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return bVarM2;
            case 1:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return g.c(this.f210240b, this.f210241c);
            default:
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return l.a(update, null, new Data(null, new IllegalStateException("Bind referral invitation failed"), false, 5, null), false, new m(this.f210240b, this.f210241c), 5);
        }
    }

    public /* synthetic */ d(String str, n nVar) {
        this.f210240b = str;
        this.f210241c = nVar;
    }

    public /* synthetic */ d(g gVar, String str, n nVar) {
        this.f210240b = str;
        this.f210241c = nVar;
    }
}
