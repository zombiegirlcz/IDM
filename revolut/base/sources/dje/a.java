package dje;

import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public interface a extends b {
    com.revolut.kompot.navigable.a K0(String str);

    void R(AccountsExtensionContract$AccountsState accountsExtensionContract$AccountsState);

    int getOrder();

    AccountsExtensionContract$AccountsState i();

    Flow v();
}
