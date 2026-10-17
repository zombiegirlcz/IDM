package pjl;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountManager f236800a;

    public d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AccountManager accountManager = AccountManager.get(context);
        Intrinsics.checkNotNullExpressionValue(accountManager, "get(...)");
        this.f236800a = accountManager;
    }

    @Override // pjl.a
    public final Unit a(Account account, String str, String str2) {
        this.f236800a.setAuthToken(account, str, str2);
        return Unit.f186387a;
    }

    @Override // pjl.a
    public final String b(Account account, String str) {
        return this.f236800a.getUserData(account, str);
    }

    @Override // pjl.a
    public final Object c(String str) {
        Account[] accountsByType = this.f236800a.getAccountsByType(str);
        Intrinsics.checkNotNullExpressionValue(accountsByType, "getAccountsByType(...)");
        return accountsByType;
    }

    @Override // pjl.a
    public final Unit d(Account account, Bundle bundle) {
        this.f236800a.addAccountExplicitly(account, null, bundle);
        return Unit.f186387a;
    }

    @Override // pjl.a
    public final Object e(Account account, String str, s0 s0Var) {
        return this.f236800a.peekAuthToken(account, str);
    }

    @Override // pjl.a
    public final Unit f(Account account) {
        this.f236800a.removeAccount(new Account(account.name, account.type), null, null, null);
        return Unit.f186387a;
    }

    @Override // pjl.a
    public final Unit g(Account account, String str, String str2) {
        this.f236800a.setUserData(account, str, str2);
        return Unit.f186387a;
    }
}
