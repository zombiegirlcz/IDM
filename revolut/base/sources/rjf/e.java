package rjf;

import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import qua.p;
import qua.u;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iva.a f254672a;

    public e(iva.a recurringBuysNavigationProvider) {
        Intrinsics.checkNotNullParameter(recurringBuysNavigationProvider, "recurringBuysNavigationProvider");
        this.f254672a = recurringBuysNavigationProvider;
    }

    public final d0 a(p recurringPayment) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(recurringPayment, "<this>");
        if (recurringPayment.f249314a.f160152c == ibd.h.LOAN_PAYMENT) {
            tua.c cVarL = u.L(recurringPayment);
            ufm.b bVarM = d0.m(new FeatureCommand(new LoanKompotFeatureConfig.UpcomingInstalmentDetailsAsync(cVarL.f274546a, cVarL.f274547b)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (q.D(recurringPayment)) {
            tua.d dVarM = u.M(recurringPayment);
            ufm.b bVarM2 = d0.m(new FeatureCommand(new PayLaterKompotFeatureConfig.RepaymentDetails(dVarM.f274551c, dVarM.d)));
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        String str = recurringPayment.f249318c;
        ibd.e eVar = recurringPayment.f249314a;
        if (str != null && str.length() != 0 && eVar.f160152c == ibd.h.CRYPTO) {
            return ((pva.d) this.f254672a).b(recurringPayment);
        }
        ufm.b bVarM3 = d0.m(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(eVar.f160150a, false, null, 6)));
        Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
        return bVarM3;
    }
}
