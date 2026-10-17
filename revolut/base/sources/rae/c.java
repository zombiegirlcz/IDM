package rae;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionFeatureConfig;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionType;
import com.revolut.feature.pix.api.navigation.PixAuthorisationNavigation$Destination;
import com.revolut.feature.pix.api.navigation.PixAuthorisationNavigation$InputData;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$DeferredPayment;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.feature.subscriptions.api.subscriptionlist.SubscriptionListFeatureConfig;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.RecurringTransfersDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import fva.k;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ofm.q;
import qua.p;
import qua.u;
import rhf.g;
import rhf.h;
import te0.w;
import tof.hc;
import tof.i1;
import tof.q6;
import zh9.u0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements c9e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iva.a f252817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nm1.c f252818b;

    public c(iva.a recurringBuysNavigationProvider, nm1.c boletoFinderNavigationProvider) {
        Intrinsics.checkNotNullParameter(recurringBuysNavigationProvider, "recurringBuysNavigationProvider");
        Intrinsics.checkNotNullParameter(boletoFinderNavigationProvider, "boletoFinderNavigationProvider");
        this.f252817a = recurringBuysNavigationProvider;
        this.f252818b = boletoFinderNavigationProvider;
    }

    public static NaviCommand e(AccountId accountId, boolean z) {
        q6 hcVar;
        g gVar;
        h hVar = h.UPCOMING;
        boolean z3 = accountId instanceof AccountId.Joint;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        if (z3) {
            hcVar = new hc(((AccountId.Joint) accountId).f51413b, null);
        } else {
            if (!Intrinsics.f(accountId, personal)) {
                throw new NoWhenBranchMatchedException();
            }
            hcVar = i1.f272794a;
        }
        q6 q6Var = hcVar;
        if (z3) {
            gVar = g.JOINT_HOME;
        } else {
            if (!Intrinsics.f(accountId, personal)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = g.HOME;
        }
        FeatureCommand featureCommandF = u0.f(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) null, (String) null, accountId, hVar, gVar, (TransactionDestination) null, q6Var, (Set) null, com.revolut.feature.subscriptions.models.a.b(accountId), (RecurringPaymentFilter) null, false, 59967)));
        if (!z) {
            return featureCommandF;
        }
        NaviCommand naviCommand = null;
        return com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, naviCommand, naviCommand, 6))), featureCommandF);
    }

    public final ufm.b b(boolean z) {
        AccountId.Personal accountId = AccountId.Personal.f51414a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        NaviCommand featureCommand = new FeatureCommand(new SubscriptionListFeatureConfig(b9e.b.BLOCKED_OR_INACTIVE, y0.b(accountId), 4));
        if (z) {
            featureCommand = com.revolut.retail.core.navigation.a.c(e(accountId, true), featureCommand);
        }
        ufm.b bVarM = d0.m(featureCommand);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d0 c(p recurringPayment, boolean z) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        boolean zP = u.p(recurringPayment);
        ibd.e eVar = recurringPayment.f249314a;
        int i = 4;
        f9e.b bVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (zP) {
            tua.c cVar = recurringPayment.B;
            if (cVar != null) {
                ufm.b bVarM = d0.m(new FeatureCommand(new LoanKompotFeatureConfig.UpcomingInstalmentDetailsAsync(cVar.f274546a, cVar.f274547b)));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            }
            ufm.b bVarM2 = d0.m(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(eVar.f160150a, z, bVar, i)));
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        if (q.D(recurringPayment)) {
            tua.d dVarM = u.M(recurringPayment);
            ufm.b bVarM3 = d0.m(new FeatureCommand(new PayLaterKompotFeatureConfig.RepaymentDetails(dVarM.f274551c, dVarM.d)));
            Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
            return bVarM3;
        }
        String str = recurringPayment.f249318c;
        if (str != null && str.length() != 0 && eVar.f160152c == ibd.h.CRYPTO) {
            return ((pva.d) this.f252817a).b(recurringPayment);
        }
        if (q.p(recurringPayment)) {
            ufm.b bVarM4 = d0.m(new FeatureCommand(new RevolutPayFeatureConfig$DeferredPayment(eVar.f160150a)));
            Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
            return bVarM4;
        }
        if (u.C(recurringPayment)) {
            ufm.b bVarM5 = d0.m(u0.f(new PixAuthorisationNavigation$Destination(new PixAuthorisationNavigation$InputData.Details(eVar.f160150a))));
            Intrinsics.checkNotNullExpressionValue(bVarM5, "just(...)");
            return bVarM5;
        }
        if (u.l(recurringPayment)) {
            return w.o0(kotlin.coroutines.g.f186406a, new r83.g(this, recurringPayment, objArr2 == true ? 1 : 0, 9));
        }
        ufm.b bVarM6 = d0.m(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(eVar.f160150a, z, objArr == true ? 1 : 0, i)));
        Intrinsics.checkNotNullExpressionValue(bVarM6, "just(...)");
        return bVarM6;
    }

    public final ufm.b d(AccountId accountId, boolean z) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ufm.b bVarM = d0.m(e(accountId, z));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final FeatureCommand f(k type, String receiverAccountId, String moveMoneyAccountId) {
        Intrinsics.checkNotNullParameter(receiverAccountId, "receiverAccountId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(moveMoneyAccountId, "moveMoneyAccountId");
        return u0.f(new RecurringTransfersDestination(new RecurringTransfersDestination.InputData(type, receiverAccountId, moveMoneyAccountId)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FeatureCommand g(AccountId accountId, jq9.a juniorIncludingMode) {
        Set setY0;
        TransferFlowType jointAccountFlow;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(juniorIncludingMode, "juniorIncludingMode");
        boolean z = accountId instanceof AccountId.Joint;
        int i = 2;
        WhoToTransferFilter.Accounts accounts = WhoToTransferFilter.Accounts.f79984a;
        int i2 = 1;
        if (z) {
            setY0 = y0.b(accounts);
        } else {
            if (!(accountId instanceof AccountId.Personal)) {
                throw new NoWhenBranchMatchedException();
            }
            WhoToTransferFilter[] elements = {WhoToTransferFilter.Revolut.f80005a, accounts, WhoToTransferFilter.ApmPayId.f79991a, WhoToTransferFilter.ApmUpi.f79995a};
            Intrinsics.checkNotNullParameter(elements, "elements");
            setY0 = kotlin.collections.d.y0(elements);
        }
        Set set = setY0;
        boolean z3 = set.size() > 1;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (z) {
            jointAccountFlow = new TransferFlowType.JointAccountFlow((AccountId.Joint) accountId, null);
        } else {
            if (!(accountId instanceof AccountId.Personal)) {
                throw new NoWhenBranchMatchedException();
            }
            jointAccountFlow = TransferFlowType.Default.f92257b;
        }
        RecipientSelectionType.Transfer transfer = new RecipientSelectionType.Transfer(jointAccountFlow, com.revolut.feature.payments.who_to_transfer.api.navigation.a.SCHEDULE, new TransferMoneyPocket(objArr == true ? 1 : 0, new SourceAccount.Pocket(str, objArr2 == true ? 1 : 0, accountId, i), i2), null);
        m70.a.c(t0.f186434a);
        return new FeatureCommand(new RecipientSelectionFeatureConfig("", new RecipientSelectionInputData(null, z3, true, set, juniorIncludingMode, null, transfer, null, 161)));
    }

    public final FeatureCommand h(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return u0.f(new ScheduledPaymentsDestination(new ScheduledPaymentsInputData(com.revolut.feature.subscriptions.models.a.b(accountId), (ScheduledPaymentsInputData.InitialAction) null, 6), 2));
    }
}
