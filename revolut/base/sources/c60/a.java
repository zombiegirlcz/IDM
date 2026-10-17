package c60;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.NetworkErrorException;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends AbstractAccountAuthenticator {
    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle addAccount(AccountAuthenticatorResponse response, String accountType, String authTokenType, String[] requiredFeatures, Bundle options) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(authTokenType, "authTokenType");
        Intrinsics.checkNotNullParameter(requiredFeatures, "requiredFeatures");
        Intrinsics.checkNotNullParameter(options, "options");
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle confirmCredentials(AccountAuthenticatorResponse response, Account account, Bundle options) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(options, "options");
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle editProperties(AccountAuthenticatorResponse response, String accountType) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse response, Account account) throws NetworkErrorException {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(account, "account");
        Bundle accountRemovalAllowed = super.getAccountRemovalAllowed(response, account);
        Intrinsics.checkNotNullExpressionValue(accountRemovalAllowed, "getAccountRemovalAllowed(...)");
        return accountRemovalAllowed;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle getAuthToken(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(authTokenType, "authTokenType");
        Intrinsics.checkNotNullParameter(options, "options");
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final String getAuthTokenLabel(String authTokenType) {
        Intrinsics.checkNotNullParameter(authTokenType, "authTokenType");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle hasFeatures(AccountAuthenticatorResponse response, Account account, String[] features) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(features, "features");
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle updateCredentials(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(authTokenType, "authTokenType");
        Intrinsics.checkNotNullParameter(options, "options");
        throw new UnsupportedOperationException();
    }
}
