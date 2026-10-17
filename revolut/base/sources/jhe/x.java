package jhe;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.accounts.api.R$string;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountBalance;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class x {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductAccountListAction f174245a = new ProductAccountListAction(504, null, new TextClause("Add money", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ADD_MONEY_ACTION_ID", null, null, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ProductAccountListAction f174246b = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.home_total_wealth_action_converter, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_rates_converter_page, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_CONVERTER_ID", null, null, false, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ProductAccountListAction f174247c = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.home_total_wealth_action_documents, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_DOCUMENTS_ID", null, null, false, false);

    public static final class a {
        private a() {
        }
    }

    public static ProductAccount.ValueItem.Main a(ProductAccountId accountId, dj0.d balance, ProductAccountListAction productAccountListAction) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(balance, "balance");
        ProductAccountValue.Balance balance2 = new ProductAccountValue.Balance(balance, (TextLocalisedClause) null, 6);
        AccountListItemModel accountListItemModel = new AccountListItemModel((Image) new ResourceImage(R$drawable.uikit_icn_24_logo_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) new TextLocalisedClause(R$string.home_total_wealth_title, null, null, 14), (Clause) null, (List) null, (CircleBadgeModel) null, false, false, true, Constants.TAG_FC_SPEED_MODE);
        ProductAccountListAction[] elements = {f174245a, productAccountListAction, sfe.d.f262406a, sfe.d.f262407b, f174247c, f174246b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ProductAccount.ValueItem.Main(accountId, (ProductAccountValue) balance2, accountListItemModel, new AccountWidgetItemModel((List) ce9.m.O(kotlin.collections.d.L(elements)), (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) new TextLocalisedClause(R$string.home_total_wealth_title, null, null, 14), false, (ProductAccountSubtitle) null, 114), new ProductAccountMetadata(new ProductAccountBalance.WithAmount(balance), true), (AccountListItemModel) null, false, false, 352);
    }
}
