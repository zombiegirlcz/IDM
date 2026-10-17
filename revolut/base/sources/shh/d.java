package shh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WealthAccount.TaxAdvantageWealthAccount f263478b;

    public /* synthetic */ d(WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount, int i) {
        this.f263477a = i;
        this.f263478b = taxAdvantageWealthAccount;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f263477a) {
            case 0:
                com.revolut.feature.junior_profile.api.models.a juniorProfile = (com.revolut.feature.junior_profile.api.models.a) obj2;
                Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
                WealthAccount.TaxAdvantageWealthAccount.JIsa jIsa = (WealthAccount.TaxAdvantageWealthAccount.JIsa) this.f263478b;
                String strM = tz4.d.m(juniorProfile);
                String f = juniorProfile.getF();
                if (f == null) {
                    f = "";
                }
                return new chh.g(jIsa, new chh.d(strM, f));
            default:
                AccountClosureStatus status = (AccountClosureStatus) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                return new whh.e(this.f263478b, status);
        }
    }
}
