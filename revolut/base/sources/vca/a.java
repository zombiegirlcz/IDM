package vca;

import com.revolut.core.model.account.AccountId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final String a(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "<this>");
        if (accountId instanceof AccountId.Joint) {
            return ((AccountId.Joint) accountId).f51413b;
        }
        if (Intrinsics.f(accountId, AccountId.Personal.f51414a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
