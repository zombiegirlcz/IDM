package d88;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior.accounts.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import wp5.y;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(int i, int i2, int i3, String str) {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i5 = R$attr.uikit_colorAccentNeutral;
        Color.Solid solid = new Color.Solid(i5);
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i5), 0.1f, companion, i, solid), null, null, false, null, false, 60), new TextLocalisedClause(i2, null, null, 14), null, 0, new TextLocalisedClause(i3, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    public static ProductAccount.ValueItem.Discover b() {
        return new ProductAccount.ValueItem.Discover(new ProductAccountId("DISCOVER_JUNIOR_ACCOUNT_ID", null), new ProductAccountValue.Text(6, new TextLocalisedClause(R$string.junior_account_discovery_title, null, null, 14), (TextLocalisedClause) null), new AccountListItemModel((Image) LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_children, new Color.Solid(R$attr.uikit_colorOnAccent), new Color.Solid(R$attr.uikit_colorBlue)), (Clause) new TextLocalisedClause(R$string.junior_account_discovery_tile_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.junior_account_discovery_tile_subtitle, null, null, 14), (List) null, (CircleBadgeModel) null, false, false, false, Constants.TAG_FULL_SVPP_IDENTIFICATION), new AccountWidgetItemModel(u.c(new ProductAccountWidgetAction(508, null, new TextLocalisedClause(R$string.junior_account_discovery_create_account, null, null, 14), null, null, "DISCOVER_JUNIOR_ACCOUNT_ACTION_ID", null, null, false, false)), (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) null, false, (ProductAccountSubtitle) new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.junior_account_discovery_subtitle, null, null, 14), null), 58), (ProductAccountMetadata) null, ufe.b.YOUTH, 48);
    }
}
