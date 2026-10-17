package vge;

import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.tab.accounts.api.R$plurals;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kge.d f288870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f288871b;

    public b0(kge.d accountNotificationRepository, e2 productAccountRepository) {
        Intrinsics.checkNotNullParameter(accountNotificationRepository, "accountNotificationRepository");
        Intrinsics.checkNotNullParameter(productAccountRepository, "productAccountRepository");
        this.f288870a = accountNotificationRepository;
        this.f288871b = productAccountRepository;
    }

    public static AccountListItemModel b(AccountListItemModel accountListItemModel, int i) {
        return AccountListItemModel.a(accountListItemModel, new TextLocalisedQuantityClause(R$plurals.account_switcher_item_subtitle_new_transfers, Integer.valueOf(i), (List) null, (Style) null, 28), 475);
    }

    @Override // vge.y
    public final Flow a(ProductId productId, Flow originFlow) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        return boh.f.e(originFlow, new v73.c(this, productId, 24));
    }
}
