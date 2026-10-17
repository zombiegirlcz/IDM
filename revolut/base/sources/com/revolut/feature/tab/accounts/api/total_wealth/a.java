package com.revolut.feature.tab.accounts.api.total_wealth;

import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final yfe.a a(TotalWealthCategoryKey totalWealthCategoryKey) {
        Intrinsics.checkNotNullParameter(totalWealthCategoryKey, "<this>");
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Cash.INSTANCE)) {
            return yfe.a.Cash;
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Savings.INSTANCE)) {
            return yfe.a.Savings;
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Crypto.INSTANCE)) {
            return yfe.a.Crypto;
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Invest.INSTANCE)) {
            return yfe.a.Invest;
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Joint.INSTANCE)) {
            return yfe.a.Joint;
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Credit.INSTANCE)) {
            return yfe.a.Credit;
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Pro.INSTANCE)) {
            return yfe.a.Pro;
        }
        if (Intrinsics.f(totalWealthCategoryKey, TotalWealthCategoryKey.Linked.INSTANCE)) {
            return yfe.a.Linked;
        }
        if (totalWealthCategoryKey instanceof TotalWealthCategoryKey.Youth) {
            return yfe.a.Youth;
        }
        throw new NoWhenBranchMatchedException();
    }
}
