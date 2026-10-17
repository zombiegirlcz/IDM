package s25;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.R$string;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import go.g;
import ip0.bk0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import sfe.a0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements pfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f259251a;

    public c(e mapper, b headerStateProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(headerStateProvider, "headerStateProvider");
        this.f259251a = mapper;
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new g(u.c(new TextDelegate.Model("credit_hub.header", new TextLocalisedClause(R$string.account_switcher_sub_space_credit_title, null, null, 14), false, new bk0(0), null, null, 0, 0, 0, 0, 2036)), 2);
    }

    @Override // pfe.b
    public final Object i(ProductAccountId productAccountId, gim.c cVar) {
        return a0.f262402a;
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new g(new Data(this.f259251a.a(accountId), null, false, 6, null), 2);
    }
}
