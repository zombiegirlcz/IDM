package zfe;

import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import kotlin.jvm.internal.Intrinsics;
import qv0.l;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    static l a(com.revolut.feature.tab.accounts.impl.ui.spaces.a aVar, ProductContext productContext, ProductAccount.ValueItem.Main account, Object obj2) {
        Intrinsics.checkNotNullParameter(productContext, "productContext");
        Intrinsics.checkNotNullParameter(account, "account");
        return aVar.e(account, com.revolut.feature.tab.accounts.impl.ui.spaces.a.c(productContext, account), productContext, false, false, false, obj2);
    }
}
