package xnd;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnd.v0 f307366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.d f307367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f307368c;

    public a(rnd.v0 savingsAnalyticsAccountProvider, g6e.d subaccountInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(savingsAnalyticsAccountProvider, "savingsAnalyticsAccountProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f307366a = savingsAnalyticsAccountProvider;
        this.f307367b = subaccountInteractor;
        this.f307368c = walletInteractor;
    }

    public final Flow a(AnalyticsAccountsSelection selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        boolean zJ = ind.a.j(selection);
        Flow flowE = null;
        rnd.v0 v0Var = this.f307366a;
        if (zJ) {
            AnalyticsAccount analyticsAccountA = ind.a.a(selection);
            if (!(analyticsAccountA instanceof AnalyticsAccount.Personal.All) && !(analyticsAccountA instanceof AnalyticsAccount.Joint.All) && !(analyticsAccountA instanceof AnalyticsAccount.Pro.All) && !(analyticsAccountA instanceof AnalyticsAccount.Personal.CreditCard) && !(analyticsAccountA instanceof AnalyticsAccount.Linked) && !(analyticsAccountA instanceof AnalyticsAccount.Junior.All)) {
                if (analyticsAccountA instanceof AnalyticsAccount.Savings.PersonalAll) {
                    flowE = v0Var.c();
                } else if (analyticsAccountA instanceof AnalyticsAccount.Savings.JointIndividual) {
                    flowE = v0Var.d(((AnalyticsAccount.Savings.JointIndividual) analyticsAccountA).f99200b);
                } else if (analyticsAccountA instanceof AnalyticsAccount.Savings.PersonalIndividual) {
                    flowE = v0Var.d(((AnalyticsAccount.Savings.PersonalIndividual) analyticsAccountA).f99204a);
                } else if (analyticsAccountA instanceof AnalyticsAccount.Savings.JointAll) {
                    flowE = v0Var.e();
                } else if (analyticsAccountA instanceof AnalyticsAccount.Savings.JuniorSaving) {
                    flowE = v0Var.f(((AnalyticsAccount.Savings.JuniorSaving) analyticsAccountA).f99201a);
                } else {
                    boolean z = analyticsAccountA instanceof AnalyticsAccount.Personal.Subaccount;
                    g6e.d dVar = this.f307367b;
                    if (z) {
                        flowE = nim.a.v(((s6e.z) dVar).u(((AnalyticsAccount.Personal.Subaccount) analyticsAccountA).f99195a), new xlj.h(11));
                    } else if (analyticsAccountA instanceof AnalyticsAccount.Joint.Subaccount) {
                        flowE = nim.a.v(((s6e.z) dVar).u(((AnalyticsAccount.Joint.Subaccount) analyticsAccountA).f99183b), new xlj.h(12));
                    } else {
                        boolean z3 = analyticsAccountA instanceof AnalyticsAccount.Personal.CurrencyPocket;
                        AccountId.Personal personal = AccountId.Personal.f51414a;
                        if (z3) {
                            flowE = b(personal, ((AnalyticsAccount.Personal.CurrencyPocket) analyticsAccountA).f99194a);
                        } else if (analyticsAccountA instanceof AnalyticsAccount.Joint.CurrencyPocket) {
                            AnalyticsAccount.Joint.CurrencyPocket currencyPocket = (AnalyticsAccount.Joint.CurrencyPocket) analyticsAccountA;
                            flowE = b(currencyPocket.f99180a, currencyPocket.f99181b);
                        } else if (analyticsAccountA instanceof AnalyticsAccount.Pro.CurrencyPocket) {
                            flowE = b(personal, ((AnalyticsAccount.Pro.CurrencyPocket) analyticsAccountA).f99197a);
                        } else {
                            if (!(analyticsAccountA instanceof AnalyticsAccount.Junior.CurrencyPocket)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            flowE = nim.a.v(rd0.e.b(this.f307368c.P()), new xf0.h(((AnalyticsAccount.Junior.CurrencyPocket) analyticsAccountA).f99188c, 10));
                        }
                    }
                }
            }
        } else if (!(selection instanceof AnalyticsAccountsSelection.TotalWealth) && !(selection instanceof AnalyticsAccountsSelection.Pro) && !(selection instanceof AnalyticsAccountsSelection.Spending)) {
            if (!(selection instanceof AnalyticsAccountsSelection.Savings)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsAccountsSelection.Savings savings = (AnalyticsAccountsSelection.Savings) selection;
            if (ind.a.h(savings)) {
                flowE = v0Var.c();
            } else if (ind.a.c(savings)) {
                flowE = v0Var.e();
            }
        }
        if (flowE != null) {
            return nim.a.v(flowE, new xlj.h(10));
        }
        od0.i.Companion.getClass();
        return zi0.c.i(od0.i.f224256b);
    }

    public final akg.n b(AccountId accountId, String str) {
        return nim.a.v(rd0.e.b(this.f307368c.L(str, accountId, w4l.h.f294642c)), new xlj.h(13));
    }
}
