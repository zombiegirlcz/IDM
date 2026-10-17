package dje;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface c {
    List a(AccountsExtensionContract$AccountsState accountsExtensionContract$AccountsState);

    List b(AccountsExtensionContract$AccountsState accountsExtensionContract$AccountsState, String str);

    boolean c(AccountsExtensionContract$AccountsState accountsExtensionContract$AccountsState);

    MoneyClause d(AccountsExtensionContract$AccountsState accountsExtensionContract$AccountsState);

    int e(AccountsExtensionContract$AccountsState accountsExtensionContract$AccountsState);

    Clause f(AccountsExtensionContract$AccountsState accountsExtensionContract$AccountsState);

    Clause g(AccountsExtensionContract$AccountsState accountsExtensionContract$AccountsState);
}
