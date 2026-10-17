package com.revolut.retail.feature.api;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final AccountId a(AnalyticsAccount analyticsAccount) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "<this>");
        if (analyticsAccount instanceof AnalyticsAccount.Joint) {
            return ((AnalyticsAccount.Joint) analyticsAccount).getF99182a();
        }
        if (analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual) {
            return ((AnalyticsAccount.Savings.JointIndividual) analyticsAccount).f99199a;
        }
        if (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) {
            return ((AnalyticsAccount.Savings.JointAll) analyticsAccount).f99198a;
        }
        if ((analyticsAccount instanceof AnalyticsAccount.Pro) || (analyticsAccount instanceof AnalyticsAccount.Junior) || (analyticsAccount instanceof AnalyticsAccount.Linked) || (analyticsAccount instanceof AnalyticsAccount.Savings) || (analyticsAccount instanceof AnalyticsAccount.Personal)) {
            return AccountId.Personal.f51414a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final SpendingAnalyticsAccount b(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "<this>");
        if (accountId instanceof AccountId.Personal) {
            return AnalyticsAccount.Personal.All.f99192a;
        }
        if (accountId instanceof AccountId.Joint) {
            return new AnalyticsAccount.Joint.All((AccountId.Joint) accountId);
        }
        throw new NoWhenBranchMatchedException();
    }
}
