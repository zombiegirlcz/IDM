package yih;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.h;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.wealth.account_closure.api.navigation.backend_reason.AccountClosureBackendReasonDestination;
import com.revolut.feature.wealth.account_closure.api.navigation.progress.AccountClosureProgressDestination;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureBackendRequestedDetails;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import whh.e;
import whh.g;
import zih.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zih.a f314329l;

    public a(zih.a accountClosureWidgetCommandProvider) {
        Intrinsics.checkNotNullParameter(accountClosureWidgetCommandProvider, "accountClosureWidgetCommandProvider");
        this.f314329l = accountClosureWidgetCommandProvider;
    }

    @Override // whh.g
    public final void Z2(e accountClosure, t clickData) {
        Intrinsics.checkNotNullParameter(accountClosure, "accountClosure");
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        AccountClosureStatus accountClosureStatus = accountClosure.f297664b;
        WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount = accountClosure.f297663a;
        boolean z = accountClosureStatus instanceof AccountClosureStatus.AccountClosureInProgress;
        zih.a aVar = this.f314329l;
        if (z) {
            TradingAccount.Portfolio d = taxAdvantageWealthAccount.getD();
            String portfolioId = String.valueOf(d != null ? d.f105210a : null);
            ActionWidgetDelegate.a aVar2 = clickData.f54721a;
            if ((aVar2 instanceof ActionWidgetDelegate.a.b) || (aVar2 instanceof ActionWidgetDelegate.a.c)) {
                ((b) aVar).getClass();
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                A2(new AccountClosureProgressDestination(portfolioId));
                return;
            } else {
                if (!(aVar2 instanceof ActionWidgetDelegate.a.d) && !(aVar2 instanceof ActionWidgetDelegate.a.C0395a) && !(aVar2 instanceof h)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (!(accountClosureStatus instanceof AccountClosureStatus.AccountClosureProgressBlocked)) {
            if (!(accountClosureStatus instanceof AccountClosureStatus.BackendRequestedAccountClosure)) {
                if (!(accountClosureStatus instanceof AccountClosureStatus.AccountClosed) && !(accountClosureStatus instanceof AccountClosureStatus.NoAccountClosure)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            } else {
                AccountClosureBackendRequestedDetails details = ((AccountClosureStatus.BackendRequestedAccountClosure) accountClosureStatus).f104505a;
                if (details != null) {
                    ((b) aVar).getClass();
                    Intrinsics.checkNotNullParameter(details, "details");
                    A2(new AccountClosureBackendReasonDestination(details));
                    return;
                }
                return;
            }
        }
        TradingAccount.Portfolio d5 = taxAdvantageWealthAccount.getD();
        String portfolioId2 = String.valueOf(d5 != null ? d5.f105210a : null);
        AccountClosureStatus.AccountClosureProgressBlocked accountClosureProgressBlocked = (AccountClosureStatus.AccountClosureProgressBlocked) accountClosureStatus;
        ActionWidgetDelegate.a aVar3 = clickData.f54721a;
        if ((aVar3 instanceof ActionWidgetDelegate.a.b) || (aVar3 instanceof ActionWidgetDelegate.a.c)) {
            ((b) aVar).getClass();
            Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
            A2(new AccountClosureProgressDestination(portfolioId2));
        } else if (!(aVar3 instanceof ActionWidgetDelegate.a.d)) {
            if (!(aVar3 instanceof ActionWidgetDelegate.a.C0395a) && !(aVar3 instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            kel.b bVar = accountClosureProgressBlocked.f104503b;
            if (bVar == null) {
                r6.b.D("Required portfolioId or cashHolding are missing");
            } else {
                A2(((b) aVar).a(portfolioId2, WealthAccountType.TAA, bVar, Long.valueOf(Math.abs(bVar.f183149b.f115082a))));
            }
        }
    }
}
