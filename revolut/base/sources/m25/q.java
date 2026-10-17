package m25;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.impl.ui.account.empty_states.events.actions.EmptyStateActionParcel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class q {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cm4.h f201713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g25.l f201714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mx4.u f201715c;

    public q(cm4.h creditCardProductMapper, g25.l creditApplicationAccountIconProvider, r creditCardEmptyStateProvider, mx4.u contentImageMapper) {
        Intrinsics.checkNotNullParameter(creditCardProductMapper, "creditCardProductMapper");
        Intrinsics.checkNotNullParameter(creditApplicationAccountIconProvider, "creditApplicationAccountIconProvider");
        Intrinsics.checkNotNullParameter(creditCardEmptyStateProvider, "creditCardEmptyStateProvider");
        Intrinsics.checkNotNullParameter(contentImageMapper, "contentImageMapper");
        this.f201713a = creditCardProductMapper;
        this.f201714b = creditApplicationAccountIconProvider;
        this.f201715c = contentImageMapper;
    }

    public final AccountWidgetItemModel a(q25.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        String str = header.f241540b;
        return new AccountWidgetItemModel(zhm.u.c(new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_discover_v2_credit_card_header_action, zhm.u.c(header.f241541c), null, 12), null, EmptyStateActionParcel.Discover.f70054a, "id_credit_card_discover", null, null, false, false)), (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.DelayedStories.f89488a, (Clause) null, false, (ProductAccountSubtitle) (str != null ? new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.credit_discover_v2_credit_card_header_subtitle, zhm.u.c(str), null, 12), null) : null), 58);
    }
}
