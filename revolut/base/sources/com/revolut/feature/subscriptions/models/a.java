package com.revolut.feature.subscriptions.models;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final AccountId a(RecurringPaymentAccount recurringPaymentAccount) {
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "<this>");
        if (recurringPaymentAccount instanceof RecurringPaymentAccount.Joint) {
            RecurringPaymentAccount.Joint joint = (RecurringPaymentAccount.Joint) recurringPaymentAccount;
            return new AccountId.Joint(joint.f89316a, joint.f89317b);
        }
        boolean z = recurringPaymentAccount instanceof RecurringPaymentAccount.Junior;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        if (z || (recurringPaymentAccount instanceof RecurringPaymentAccount.Pro) || Intrinsics.f(recurringPaymentAccount, RecurringPaymentAccount.Personal.f89320a)) {
            return personal;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RecurringPaymentAccount b(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "<this>");
        if (accountId instanceof AccountId.Joint) {
            AccountId.Joint joint = (AccountId.Joint) accountId;
            return new RecurringPaymentAccount.Joint(joint.f51412a, joint.f51413b);
        }
        if (accountId instanceof AccountId.Personal) {
            return RecurringPaymentAccount.Personal.f89320a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
