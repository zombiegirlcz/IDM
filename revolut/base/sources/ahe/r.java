package ahe;

import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class r {
    public static final TotalWealthCategoryKey a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.f(str, "cash")) {
            return TotalWealthCategoryKey.Cash.INSTANCE;
        }
        if (Intrinsics.f(str, "savings")) {
            return TotalWealthCategoryKey.Savings.INSTANCE;
        }
        if (Intrinsics.f(str, "crypto")) {
            return TotalWealthCategoryKey.Crypto.INSTANCE;
        }
        if (Intrinsics.f(str, "invest")) {
            return TotalWealthCategoryKey.Invest.INSTANCE;
        }
        if (Intrinsics.f(str, "joint")) {
            return TotalWealthCategoryKey.Joint.INSTANCE;
        }
        if (Intrinsics.f(str, "credit")) {
            return TotalWealthCategoryKey.Credit.INSTANCE;
        }
        if (Intrinsics.f(str, "pro")) {
            return TotalWealthCategoryKey.Pro.INSTANCE;
        }
        if (Intrinsics.f(str, "linked")) {
            return TotalWealthCategoryKey.Linked.INSTANCE;
        }
        if (Intrinsics.f(str, "youth-")) {
            return new TotalWealthCategoryKey.Youth("__tw_youth_promo__");
        }
        if (kotlin.text.a0.H(str, "youth-", false)) {
            String strE0 = kotlin.text.d0.e0(str, "youth-");
            if (kotlin.text.d0.W(strE0)) {
                strE0 = null;
            }
            if (strE0 != null) {
                return new TotalWealthCategoryKey.Youth(strE0);
            }
        }
        return null;
    }

    public static final String b(TotalWealthCategoryKey totalWealthCategoryKey) {
        Intrinsics.checkNotNullParameter(totalWealthCategoryKey, "<this>");
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Cash.INSTANCE)) {
            return "cash";
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Savings.INSTANCE)) {
            return "savings";
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Crypto.INSTANCE)) {
            return "crypto";
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Invest.INSTANCE)) {
            return "invest";
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Joint.INSTANCE)) {
            return "joint";
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Credit.INSTANCE)) {
            return "credit";
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Pro.INSTANCE)) {
            return "pro";
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Linked.INSTANCE)) {
            return "linked";
        }
        if (!(totalWealthCategoryKey instanceof TotalWealthCategoryKey.Youth)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((TotalWealthCategoryKey.Youth) totalWealthCategoryKey).f89578b;
        return Intrinsics.f(str, "__tw_youth_promo__") ? "youth-" : j6.a.q("youth-", str);
    }
}
