package ind;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final AnalyticsAccount a(AnalyticsAccountsSelection analyticsAccountsSelection) {
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "<this>");
        return (AnalyticsAccount) d0.a0(analyticsAccountsSelection.getF99208a());
    }

    public static final String b(Set set) {
        AccountId.Joint f99182a;
        Intrinsics.checkNotNullParameter(set, "<this>");
        AnalyticsAccount analyticsAccount = (AnalyticsAccount) d0.L0(set);
        if (analyticsAccount != null) {
            AnalyticsAccount.Joint joint = analyticsAccount instanceof AnalyticsAccount.Joint ? (AnalyticsAccount.Joint) analyticsAccount : null;
            if (joint != null && (f99182a = joint.getF99182a()) != null) {
                return f99182a.f51412a;
            }
        }
        return null;
    }

    public static final boolean c(AnalyticsAccountsSelection.Savings savings) {
        Intrinsics.checkNotNullParameter(savings, "<this>");
        Set set = savings.f99206a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (!(((AnalyticsAccount.Savings) it8.next()) instanceof AnalyticsAccount.Savings.JointIndividual)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(AnalyticsAccountsSelection.Spending spending) {
        Intrinsics.checkNotNullParameter(spending, "<this>");
        Set set = spending.f99207a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (!(((SpendingAnalyticsAccount) it8.next()) instanceof AnalyticsAccount.Joint)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean e(AnalyticsAccountsSelection.Spending spending) {
        Intrinsics.checkNotNullParameter(spending, "<this>");
        Set set = spending.f99207a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (!(((SpendingAnalyticsAccount) it8.next()) instanceof AnalyticsAccount.Junior)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean f(AnalyticsAccountsSelection analyticsAccountsSelection) {
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "<this>");
        if ((analyticsAccountsSelection instanceof AnalyticsAccountsSelection.TotalWealth) || (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Pro)) {
            return false;
        }
        if (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Savings) {
            return g((AnalyticsAccountsSelection.Savings) analyticsAccountsSelection);
        }
        if (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Spending) {
            return e((AnalyticsAccountsSelection.Spending) analyticsAccountsSelection);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean g(AnalyticsAccountsSelection.Savings savings) {
        Intrinsics.checkNotNullParameter(savings, "<this>");
        Set set = savings.f99206a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (!(((AnalyticsAccount.Savings) it8.next()) instanceof AnalyticsAccount.Savings.JuniorSaving)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean h(AnalyticsAccountsSelection.Savings savings) {
        Intrinsics.checkNotNullParameter(savings, "<this>");
        Set set = savings.f99206a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (!(((AnalyticsAccount.Savings) it8.next()) instanceof AnalyticsAccount.Savings.PersonalIndividual)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean i(AnalyticsAccountsSelection.Spending spending) {
        Intrinsics.checkNotNullParameter(spending, "<this>");
        Set set = spending.f99207a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (!(((SpendingAnalyticsAccount) it8.next()) instanceof AnalyticsAccount.Personal)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean j(AnalyticsAccountsSelection analyticsAccountsSelection) {
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "<this>");
        return !(analyticsAccountsSelection instanceof AnalyticsAccountsSelection.TotalWealth) && analyticsAccountsSelection.getF99208a().size() == 1;
    }
}
