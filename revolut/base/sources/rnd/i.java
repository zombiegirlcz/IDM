package rnd;

import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f255615a;

    public i(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f255615a = featureToggleInteractor;
    }

    public static boolean c(AnalyticsAccount analyticsAccount) {
        if ((analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) || (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll) || (analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving) || (analyticsAccount instanceof AnalyticsAccount.Personal.All) || (analyticsAccount instanceof AnalyticsAccount.Joint.All) || (analyticsAccount instanceof AnalyticsAccount.Linked) || (analyticsAccount instanceof AnalyticsAccount.Junior.All)) {
            return true;
        }
        if ((analyticsAccount instanceof AnalyticsAccount.Pro.All) || (analyticsAccount instanceof AnalyticsAccount.Pro.CurrencyPocket) || (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual) || (analyticsAccount instanceof AnalyticsAccount.Personal.CreditCard) || (analyticsAccount instanceof AnalyticsAccount.Joint.CurrencyPocket) || (analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual) || (analyticsAccount instanceof AnalyticsAccount.Joint.Subaccount) || (analyticsAccount instanceof AnalyticsAccount.Personal.CurrencyPocket) || (analyticsAccount instanceof AnalyticsAccount.Personal.Subaccount) || (analyticsAccount instanceof AnalyticsAccount.Junior.CurrencyPocket)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int a(Set selectedAccounts, ArrayList eligibleAccounts) {
        int i;
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        Intrinsics.checkNotNullParameter(eligibleAccounts, "eligibleAccounts");
        Iterator it8 = selectedAccounts.iterator();
        int i2 = 0;
        while (it8.hasNext()) {
            AnalyticsAccount analyticsAccount = (AnalyticsAccount) it8.next();
            int i3 = 1;
            if (!(analyticsAccount instanceof AnalyticsAccount.Personal.CreditCard) && !(analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual) && !(analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving) && !(analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual) && !(analyticsAccount instanceof AnalyticsAccount.Joint.CurrencyPocket) && !(analyticsAccount instanceof AnalyticsAccount.Joint.Subaccount) && !(analyticsAccount instanceof AnalyticsAccount.Personal.CurrencyPocket) && !(analyticsAccount instanceof AnalyticsAccount.Personal.Subaccount) && !(analyticsAccount instanceof AnalyticsAccount.Pro.CurrencyPocket) && !(analyticsAccount instanceof AnalyticsAccount.Junior.CurrencyPocket) && !(analyticsAccount instanceof AnalyticsAccount.Linked)) {
                if (analyticsAccount instanceof AnalyticsAccount.Pro.All) {
                    if (!eligibleAccounts.isEmpty()) {
                        Iterator it9 = eligibleAccounts.iterator();
                        i = 0;
                        while (it9.hasNext()) {
                            AnalyticsAccount analyticsAccount2 = (AnalyticsAccount) it9.next();
                            if ((analyticsAccount2 instanceof AnalyticsAccount.Pro) && !(analyticsAccount2 instanceof AnalyticsAccount.Pro.All) && (i = i + 1) < 0) {
                                zhm.v.r();
                                throw null;
                            }
                        }
                        i3 = i;
                    }
                    i3 = 0;
                } else if (analyticsAccount instanceof AnalyticsAccount.Joint.All) {
                    if (!eligibleAccounts.isEmpty()) {
                        Iterator it10 = eligibleAccounts.iterator();
                        i = 0;
                        while (it10.hasNext()) {
                            AnalyticsAccount analyticsAccount3 = (AnalyticsAccount) it10.next();
                            if ((analyticsAccount3 instanceof AnalyticsAccount.Joint) && !(analyticsAccount3 instanceof AnalyticsAccount.Joint.All) && (i = i + 1) < 0) {
                                zhm.v.r();
                                throw null;
                            }
                        }
                        i3 = i;
                    }
                    i3 = 0;
                } else if (analyticsAccount instanceof AnalyticsAccount.Personal.All) {
                    if (!eligibleAccounts.isEmpty()) {
                        Iterator it11 = eligibleAccounts.iterator();
                        i = 0;
                        while (it11.hasNext()) {
                            AnalyticsAccount analyticsAccount4 = (AnalyticsAccount) it11.next();
                            if ((analyticsAccount4 instanceof AnalyticsAccount.Personal) && !(analyticsAccount4 instanceof AnalyticsAccount.Personal.All) && (i = i + 1) < 0) {
                                zhm.v.r();
                                throw null;
                            }
                        }
                        i3 = i;
                    }
                    i3 = 0;
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll) {
                    if (!eligibleAccounts.isEmpty()) {
                        Iterator it12 = eligibleAccounts.iterator();
                        i = 0;
                        while (it12.hasNext()) {
                            if ((((AnalyticsAccount) it12.next()) instanceof AnalyticsAccount.Savings.PersonalIndividual) && (i = i + 1) < 0) {
                                zhm.v.r();
                                throw null;
                            }
                        }
                        i3 = i;
                    }
                    i3 = 0;
                } else {
                    if (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) {
                        if (!eligibleAccounts.isEmpty()) {
                            Iterator it13 = eligibleAccounts.iterator();
                            i = 0;
                            while (it13.hasNext()) {
                                if ((((AnalyticsAccount) it13.next()) instanceof AnalyticsAccount.Savings.JointIndividual) && (i = i + 1) < 0) {
                                    zhm.v.r();
                                    throw null;
                                }
                            }
                            i3 = i;
                        }
                    } else {
                        if (!(analyticsAccount instanceof AnalyticsAccount.Junior.All)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!((jte.d) this.f255615a).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c)) {
                            continue;
                        } else if (!eligibleAccounts.isEmpty()) {
                            Iterator it14 = eligibleAccounts.iterator();
                            i3 = 0;
                            while (it14.hasNext()) {
                                AnalyticsAccount analyticsAccount5 = (AnalyticsAccount) it14.next();
                                if ((analyticsAccount5 instanceof AnalyticsAccount.Junior) && Intrinsics.f(((AnalyticsAccount.Junior) analyticsAccount5).getF99186a(), ((AnalyticsAccount.Junior.All) analyticsAccount).f99184a) && !(analyticsAccount5 instanceof AnalyticsAccount.Junior.All) && (i3 = i3 + 1) < 0) {
                                    zhm.v.r();
                                    throw null;
                                }
                            }
                        }
                    }
                    i3 = 0;
                }
            }
            i2 += i3;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0013 A[EDGE_INSN: B:4:0x0013->B:42:0x00a9 BREAK  A[LOOP:22: B:36:0x0094->B:462:?], EDGE_INSN: B:453:0x0013->B:4:0x0013 BREAK  A[LOOP:20: B:21:0x0056->B:454:?]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rnd.h b(java.util.Set r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instruction units count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rnd.i.b(java.util.Set, java.util.ArrayList):rnd.h");
    }
}
