package ake;

import a15.n;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.derivatives.models.BalanceWithPnl;
import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import com.revolut.feature.tab.crypto.impl.R$string;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto.CryptoAccountsState;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto.CryptoHeaderData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements dje.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uje.a f5808a;

    public b(uje.a headerMappingUtils) {
        Intrinsics.checkNotNullParameter(headerMappingUtils, "headerMappingUtils");
        this.f5808a = headerMappingUtils;
    }

    @Override // dje.c
    public final List a(AccountsExtensionContract$AccountsState accountsState) {
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        return !(accountsState instanceof CryptoAccountsState) ? f0.f322471a : (List) iii.c.f(((CryptoAccountsState) accountsState).f89817a.f5802a, new acb.f(this, accountsState, 23), new a8a.a(this, accountsState, 2), new n(this, accountsState, 17));
    }

    @Override // dje.c
    public final List b(AccountsExtensionContract$AccountsState accountsState, String accountId) {
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return !(accountsState instanceof CryptoAccountsState) ? f0.f322471a : ((CryptoAccountsState) accountsState).f89817a.d;
    }

    @Override // dje.c
    public final boolean c(AccountsExtensionContract$AccountsState accountsState) {
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        return accountsState instanceof CryptoAccountsState;
    }

    @Override // dje.c
    public final MoneyClause d(AccountsExtensionContract$AccountsState accountsState) {
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        CryptoHeaderData cryptoHeaderData = (CryptoHeaderData) ((CryptoAccountsState) accountsState).f89817a.f5802a.getContent();
        if (cryptoHeaderData == null) {
            return null;
        }
        dj0.d dVar = cryptoHeaderData.f89818a.f71385b;
        dj0.d dVar2 = cryptoHeaderData.f89819b;
        BalanceWithPnl balanceWithPnl = cryptoHeaderData.f89820c;
        return new MoneyClause(uje.a.a(dVar, dVar2, balanceWithPnl != null ? balanceWithPnl.f71894a : null), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    @Override // dje.c
    public final int e(AccountsExtensionContract$AccountsState accountsState) {
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        return R$drawable.uikit_icn_24_bitcoin;
    }

    @Override // dje.c
    public final Clause f(AccountsExtensionContract$AccountsState accountsState) {
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        return new TextLocalisedClause(R$string.home_crypto, null, null, 14);
    }

    @Override // dje.c
    public final Clause g(AccountsExtensionContract$AccountsState accountsState) {
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        if (accountsState instanceof CryptoAccountsState) {
            return ((CryptoAccountsState) accountsState).f89817a.e.f263435a;
        }
        return null;
    }
}
