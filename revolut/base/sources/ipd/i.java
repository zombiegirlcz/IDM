package ipd;

import com.google.protobuf.b4;
import com.google.protobuf.d4;
import com.google.protobuf.f3;
import com.google.protobuf.h3;
import com.google.protobuf.w0;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import grl.v;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i {
    public static final v a(AnalyticsAccountsSelection analyticsAccountsSelection) {
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "<this>");
        if (!ind.a.j(analyticsAccountsSelection)) {
            if (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.TotalWealth) {
                return v.PERSONAL;
            }
            if (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Pro) {
                return v.PRO;
            }
            if (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Savings) {
                return v.SAVINGS;
            }
            if (!(analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Spending)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsAccountsSelection.Spending spending = (AnalyticsAccountsSelection.Spending) analyticsAccountsSelection;
            if (!ind.a.i(spending) && ind.a.d(spending)) {
                return v.JOINT;
            }
            return v.PERSONAL;
        }
        AnalyticsAccount analyticsAccountA = ind.a.a(analyticsAccountsSelection);
        if (analyticsAccountA instanceof AnalyticsAccount.Personal.CreditCard) {
            return v.CREDIT;
        }
        if (analyticsAccountA instanceof AnalyticsAccount.Personal) {
            return v.PERSONAL;
        }
        if (analyticsAccountA instanceof AnalyticsAccount.Linked) {
            return v.LINKED;
        }
        if (analyticsAccountA instanceof AnalyticsAccount.Pro) {
            return v.PRO;
        }
        if (analyticsAccountA instanceof AnalyticsAccount.Joint) {
            return v.JOINT;
        }
        if (analyticsAccountA instanceof AnalyticsAccount.Savings) {
            return v.SAVINGS;
        }
        if (analyticsAccountA instanceof AnalyticsAccount.Junior) {
            return v.YOUTH;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final h3 b(AnalyticsAccountsSelection analyticsAccountsSelection) {
        Pair pair;
        Pair pair2;
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "<this>");
        f3 f3VarNewBuilder = h3.newBuilder();
        Set<AnalyticsAccount> f99208a = analyticsAccountsSelection.getF99208a();
        int iB = q0.b(w.t(f99208a, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (AnalyticsAccount analyticsAccount : f99208a) {
            if (analyticsAccount instanceof AnalyticsAccount.Personal.All) {
                pair2 = new Pair("personal_all", "PERSONAL_ALL");
            } else {
                if (analyticsAccount instanceof AnalyticsAccount.Personal.CurrencyPocket) {
                    pair = new Pair(((AnalyticsAccount.Personal.CurrencyPocket) analyticsAccount).f99194a, "PERSONAL");
                } else if (analyticsAccount instanceof AnalyticsAccount.Personal.Subaccount) {
                    pair = new Pair(((AnalyticsAccount.Personal.Subaccount) analyticsAccount).f99195a, "PERSONAL_POCKET");
                } else if (analyticsAccount instanceof AnalyticsAccount.Personal.CreditCard) {
                    pair = new Pair(((AnalyticsAccount.Personal.CreditCard) analyticsAccount).f99193a, "CREDIT_CARD");
                } else if (analyticsAccount instanceof AnalyticsAccount.Joint.All) {
                    pair2 = new Pair("joint_all", "JOINT_ALL");
                } else if (analyticsAccount instanceof AnalyticsAccount.Joint.CurrencyPocket) {
                    pair = new Pair(((AnalyticsAccount.Joint.CurrencyPocket) analyticsAccount).f99181b, "JOINT");
                } else if (analyticsAccount instanceof AnalyticsAccount.Joint.Subaccount) {
                    pair = new Pair(((AnalyticsAccount.Joint.Subaccount) analyticsAccount).f99183b, "JOINT_POCKET");
                } else if (analyticsAccount instanceof AnalyticsAccount.Linked) {
                    pair = new Pair(((AnalyticsAccount.Linked) analyticsAccount).f99189a, "LINKED");
                } else if (analyticsAccount instanceof AnalyticsAccount.Junior) {
                    pair = new Pair(((AnalyticsAccount.Junior) analyticsAccount).getF99186a(), "YOUTH");
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll) {
                    pair2 = new Pair("personal_savings_all", "SAVINGS_ALL");
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual) {
                    pair = new Pair(((AnalyticsAccount.Savings.PersonalIndividual) analyticsAccount).f99204a, "SAVINGS");
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) {
                    pair2 = new Pair("joint_savings_all", "JOINT_SAVINGS_ALL");
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual) {
                    pair = new Pair(((AnalyticsAccount.Savings.JointIndividual) analyticsAccount).f99200b, "JOINT_SAVINGS");
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving) {
                    pair = new Pair(((AnalyticsAccount.Savings.JuniorSaving) analyticsAccount).f99201a, "YOUTH_SAVINGS");
                } else if (analyticsAccount instanceof AnalyticsAccount.Pro.All) {
                    pair2 = new Pair("pro_all", "PRO_ALL");
                } else {
                    if (!(analyticsAccount instanceof AnalyticsAccount.Pro.CurrencyPocket)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pair = new Pair(((AnalyticsAccount.Pro.CurrencyPocket) analyticsAccount).f99197a, "PRO");
                }
                pair2 = pair;
            }
            String str = (String) pair2.f186385a;
            String str2 = (String) pair2.f186386b;
            b4 b4VarNewBuilder = d4.newBuilder();
            b4VarNewBuilder.h(str2);
            linkedHashMap.put(str, b4VarNewBuilder.a());
        }
        f3VarNewBuilder.h(linkedHashMap);
        w0 w0VarA = f3VarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        return (h3) w0VarA;
    }
}
