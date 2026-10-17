package wnd;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static TextLocalisedQuantityClause a(rnd.h hVar, Style style) {
        return new TextLocalisedQuantityClause(R$plurals.analytics_dashboard_account_multi_accounts, Integer.valueOf(hVar.f255613b), (List) null, style, 12);
    }

    public static Clause b(AnalyticsAccountsSelection accountsSelection, rnd.g gVar, rnd.h accountMetadata, Custom custom) {
        boolean zIsEmpty;
        Intrinsics.checkNotNullParameter(accountsSelection, "accountsSelection");
        Intrinsics.checkNotNullParameter(accountMetadata, "accountMetadata");
        if (accountsSelection instanceof AnalyticsAccountsSelection.TotalWealth) {
            return new TextLocalisedClause(R$string.analytics_account_picker_total_wealth, null, custom, 10);
        }
        if (ind.a.j(accountsSelection)) {
            AnalyticsAccount analyticsAccountA = ind.a.a(accountsSelection);
            if (analyticsAccountA instanceof AnalyticsAccount.Personal.CreditCard) {
                return new TextLocalisedClause(R$string.analytics_dashboard_account_credit_card, null, custom, 10);
            }
            if (analyticsAccountA instanceof AnalyticsAccount.Joint.All) {
                return new TextLocalisedClause(R$string.analytics_dashboard_account_joint, null, custom, 10);
            }
            if (analyticsAccountA instanceof AnalyticsAccount.Joint.Subaccount) {
                rnd.f fVar = gVar instanceof rnd.f ? (rnd.f) gVar : null;
                if (fVar != null) {
                    return new TextClause(fVar.f255609a.getName(), (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
                }
            } else if (analyticsAccountA instanceof AnalyticsAccount.Joint.CurrencyPocket) {
                rnd.b bVar = gVar instanceof rnd.b ? (rnd.b) gVar : null;
                if (bVar != null) {
                    return new CompositeClause(v.k(new TextLocalisedClause(R$string.analytics_dashboard_account_joint, null, null, 14), new CurrencyClause(bVar.f255593a, null, null, 6)), new DotDividerClause((Integer) null), custom, null, 8);
                }
            } else {
                if (analyticsAccountA instanceof AnalyticsAccount.Linked) {
                    return new TextClause(((AnalyticsAccount.Linked) analyticsAccountA).d, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
                }
                if (analyticsAccountA instanceof AnalyticsAccount.Personal.All) {
                    return new TextLocalisedClause(R$string.analytics_dashboard_account_personal, null, custom, 10);
                }
                if (analyticsAccountA instanceof AnalyticsAccount.Personal.Subaccount) {
                    rnd.f fVar2 = gVar instanceof rnd.f ? (rnd.f) gVar : null;
                    if (fVar2 != null) {
                        return new TextClause(fVar2.f255609a.getName(), (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
                    }
                } else if (analyticsAccountA instanceof AnalyticsAccount.Personal.CurrencyPocket) {
                    rnd.b bVar2 = gVar instanceof rnd.b ? (rnd.b) gVar : null;
                    if (bVar2 != null) {
                        return new CurrencyClause(bVar2.f255593a, null, custom, 2);
                    }
                } else {
                    if (analyticsAccountA instanceof AnalyticsAccount.Pro.All) {
                        return new TextLocalisedClause(R$string.analytics_dashboard_account_pro, null, custom, 10);
                    }
                    if (analyticsAccountA instanceof AnalyticsAccount.Pro.CurrencyPocket) {
                        rnd.b bVar3 = gVar instanceof rnd.b ? (rnd.b) gVar : null;
                        if (bVar3 != null) {
                            return new CompositeClause(v.k(new TextLocalisedClause(R$string.analytics_dashboard_account_pro, null, null, 14), new CurrencyClause(bVar3.f255593a, null, null, 6)), new DotDividerClause((Integer) null), custom, null, 8);
                        }
                    } else if (analyticsAccountA instanceof AnalyticsAccount.Savings.PersonalIndividual) {
                        rnd.d dVar = gVar instanceof rnd.d ? (rnd.d) gVar : null;
                        if (dVar != null) {
                            return new TextClause(dVar.f255599a, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
                        }
                    } else if (analyticsAccountA instanceof AnalyticsAccount.Savings.PersonalAll) {
                        rnd.a aVar = gVar instanceof rnd.a ? (rnd.a) gVar : null;
                        if (aVar != null) {
                            return new TextLocalisedClause(oc.c.q(aVar.f255590a), null, custom, 10);
                        }
                    } else {
                        if (analyticsAccountA instanceof AnalyticsAccount.Junior.All) {
                            return new TextClause(((AnalyticsAccount.Junior.All) analyticsAccountA).f99185b, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
                        }
                        if (analyticsAccountA instanceof AnalyticsAccount.Junior.CurrencyPocket) {
                            rnd.c cVar = gVar instanceof rnd.c ? (rnd.c) gVar : null;
                            if (cVar != null) {
                                return new CompositeClause(v.k(new TextClause(((AnalyticsAccount.Junior.CurrencyPocket) analyticsAccountA).f99187b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CurrencyClause(cVar.f255595a, CurrencyClause.Format.Ticker.f57756a, null, 4)), new DotDividerClause((Integer) null), custom, null, 8);
                            }
                        } else if (analyticsAccountA instanceof AnalyticsAccount.Savings.JuniorSaving) {
                            rnd.e eVar = gVar instanceof rnd.e ? (rnd.e) gVar : null;
                            if (eVar != null) {
                                return new CompositeClause(v.k(new TextClause(eVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(eVar.f255604a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), custom, null, 8);
                            }
                        } else if (analyticsAccountA instanceof AnalyticsAccount.Savings.JointIndividual) {
                            rnd.d dVar2 = gVar instanceof rnd.d ? (rnd.d) gVar : null;
                            if (dVar2 != null) {
                                return new CompositeClause(v.k(new TextLocalisedClause(R$string.analytics_dashboard_account_joint, null, null, 14), new TextClause(dVar2.f255599a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), custom, null, 8);
                            }
                        } else {
                            if (!(analyticsAccountA instanceof AnalyticsAccount.Savings.JointAll)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            rnd.a aVar2 = gVar instanceof rnd.a ? (rnd.a) gVar : null;
                            if (aVar2 != null) {
                                return new CompositeClause(v.k(new TextLocalisedClause(R$string.analytics_dashboard_account_joint, null, null, 14), new TextLocalisedClause(oc.c.q(aVar2.f255590a), null, null, 14)), new DotDividerClause((Integer) null), custom, null, 8);
                            }
                        }
                    }
                }
            }
            return null;
        }
        if (accountsSelection instanceof AnalyticsAccountsSelection.Pro) {
            return new CompositeClause(v.k(new TextLocalisedClause(R$string.analytics_dashboard_account_pro, null, null, 14), new NumberClause(accountMetadata.f255613b, (NumberClause.Format.Compact) null, (Custom) null, 6)), new DotDividerClause((Integer) null), custom, null, 8);
        }
        if (accountsSelection instanceof AnalyticsAccountsSelection.Savings) {
            AnalyticsAccountsSelection.Savings savings = (AnalyticsAccountsSelection.Savings) accountsSelection;
            if (accountMetadata.f255612a) {
                return new TextLocalisedClause(R$string.analytics_dashboard_account_all_savings, null, custom, 10);
            }
            boolean zH = ind.a.h(savings);
            Set set = savings.f99206a;
            if (zH) {
                rnd.a aVar3 = gVar instanceof rnd.a ? (rnd.a) gVar : null;
                return aVar3 != null ? new CompositeClause(v.k(new TextLocalisedClause(oc.c.r(aVar3.f255590a), null, null, 14), new NumberClause(set.size(), (NumberClause.Format.Compact) null, (Custom) null, 6)), new DotDividerClause((Integer) null), custom, null, 8) : a(accountMetadata, custom);
            }
            if (!ind.a.c(savings)) {
                return a(accountMetadata, custom);
            }
            rnd.a aVar4 = gVar instanceof rnd.a ? (rnd.a) gVar : null;
            return aVar4 != null ? new CompositeClause(v.k(new CompositeClause(v.k(new TextLocalisedClause(R$string.analytics_dashboard_account_joint, null, null, 14), new TextLocalisedClause(oc.c.r(aVar4.f255590a), null, null, 14)), new DotDividerClause((Integer) null), custom, null, 8), new NumberClause(set.size(), (NumberClause.Format.Compact) null, (Custom) null, 6)), new DotDividerClause((Integer) null), custom, null, 8) : a(accountMetadata, custom);
        }
        if (!(accountsSelection instanceof AnalyticsAccountsSelection.Spending)) {
            throw new IllegalStateException("Total wealth selection should be handled above");
        }
        AnalyticsAccountsSelection.Spending spending = (AnalyticsAccountsSelection.Spending) accountsSelection;
        if (accountMetadata.f255612a) {
            return new TextLocalisedClause(R$string.analytics_account_chooser_all_accounts, null, custom, 10);
        }
        boolean zI = ind.a.i(spending);
        Set set2 = spending.f99207a;
        if (zI) {
            return new CompositeClause(v.k(new TextLocalisedClause(R$string.analytics_dashboard_account_personal, null, null, 14), new NumberClause(set2.size(), (NumberClause.Format.Compact) null, (Custom) null, 6)), new DotDividerClause((Integer) null), custom, null, 8);
        }
        if (ind.a.d(spending)) {
            return new CompositeClause(v.k(new TextLocalisedClause(R$string.analytics_dashboard_account_joint, null, null, 14), new NumberClause(set2.size(), (NumberClause.Format.Compact) null, (Custom) null, 6)), new DotDividerClause((Integer) null), custom, null, 8);
        }
        Intrinsics.checkNotNullParameter(spending, "<this>");
        Set<SpendingAnalyticsAccount> set3 = set2;
        Object objC0 = d0.c0(set3);
        AnalyticsAccount.Junior junior = objC0 instanceof AnalyticsAccount.Junior ? (AnalyticsAccount.Junior) objC0 : null;
        boolean z = true;
        if (junior == null) {
            zIsEmpty = set2.isEmpty();
        } else {
            String f99186a = junior.getF99186a();
            if ((set3 instanceof Collection) && set3.isEmpty()) {
                zIsEmpty = true;
            } else {
                for (SpendingAnalyticsAccount spendingAnalyticsAccount : set3) {
                    if (!(spendingAnalyticsAccount instanceof AnalyticsAccount.Junior) || !Intrinsics.f(((AnalyticsAccount.Junior) spendingAnalyticsAccount).getF99186a(), f99186a)) {
                        zIsEmpty = false;
                        break;
                    }
                }
                zIsEmpty = true;
            }
        }
        if (zIsEmpty) {
            Object objA0 = d0.a0(set3);
            Intrinsics.i(objA0, "null cannot be cast to non-null type com.revolut.retail.feature.api.AnalyticsAccount.Junior");
            return new CompositeClause(v.k(new TextClause(((AnalyticsAccount.Junior) objA0).getF99187b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new NumberClause(set2.size(), (NumberClause.Format.Compact) null, (Custom) null, 6)), new DotDividerClause((Integer) null), custom, null, 8);
        }
        Intrinsics.checkNotNullParameter(spending, "<this>");
        if (!(set3 instanceof Collection) || !set3.isEmpty()) {
            Iterator it8 = set3.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (!(((SpendingAnalyticsAccount) it8.next()) instanceof AnalyticsAccount.Linked)) {
                    z = false;
                    break;
                }
            }
        }
        return z ? accountMetadata.d ? new TextLocalisedClause(R$string.analytics_account_picker_linked, null, custom, 10) : new CompositeClause(v.k(new TextLocalisedClause(R$string.analytics_account_picker_linked, null, null, 14), new NumberClause(accountMetadata.f255613b, (NumberClause.Format.Compact) null, (Custom) null, 6)), new DotDividerClause((Integer) null), custom, null, 8) : a(accountMetadata, custom);
    }
}
