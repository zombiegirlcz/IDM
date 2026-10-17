package jhe;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import com.revolut.tracking.v3.HomeTotalWealthContext;
import grl.t4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    private c() {
    }

    public static String a(TotalWealthCategoryKey categoryKey) {
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        if (Intrinsics.f(categoryKey, TotalWealthCategoryKey.Cash.INSTANCE)) {
            return "cash";
        }
        if (Intrinsics.f(categoryKey, TotalWealthCategoryKey.Savings.INSTANCE)) {
            return "savings";
        }
        if (Intrinsics.f(categoryKey, TotalWealthCategoryKey.Crypto.INSTANCE)) {
            return "crypto";
        }
        if (Intrinsics.f(categoryKey, TotalWealthCategoryKey.Invest.INSTANCE)) {
            return "invest";
        }
        if (Intrinsics.f(categoryKey, TotalWealthCategoryKey.Joint.INSTANCE)) {
            return "joint";
        }
        if (Intrinsics.f(categoryKey, TotalWealthCategoryKey.Credit.INSTANCE)) {
            return "credit";
        }
        if (Intrinsics.f(categoryKey, TotalWealthCategoryKey.Pro.INSTANCE)) {
            return "pro";
        }
        if (Intrinsics.f(categoryKey, TotalWealthCategoryKey.Linked.INSTANCE)) {
            return "linked";
        }
        if (categoryKey instanceof TotalWealthCategoryKey.Youth) {
            return j6.a.q("youth-", ((TotalWealthCategoryKey.Youth) categoryKey).f89578b);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static w0 b(TotalWealthCategoryKey categoryKey, t4 state) {
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(state, "state");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        HomeTotalWealthContext.a aVarNewBuilder = HomeTotalWealthContext.newBuilder();
        String strA = a(categoryKey);
        aVarNewBuilder.c();
        ((HomeTotalWealthContext) aVarNewBuilder.f49761b).setCategory(strA);
        aVarNewBuilder.c();
        ((HomeTotalWealthContext) aVarNewBuilder.f49761b).setState(state);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }
}
