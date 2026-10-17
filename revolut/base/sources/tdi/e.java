package tdi;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature_rev_points_pocket_api.R$string;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model.MainImage.Image40 a(int i) {
        return new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60);
    }

    public static ProductAccount.ValueItem.Discover b(RevPointsPocketThreshold maxThreshold) {
        Intrinsics.checkNotNullParameter(maxThreshold, "maxThreshold");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_points_pocket_discovery_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.rev_points_pocket_discovery_disclaimer, u.c(nub.a.i(maxThreshold.f97794b, null, new nub.c(new NumberClause.Format.Compact(false)), o9.NON_SENSITIVE, 1)), null, 12);
        ProductAccountId productAccountId = new ProductAccountId("POINTS_POCKET_DISCOVER_ITEM_ID", ExtendedSubaccountType.RevPoints.INSTANCE);
        AccountListItemModel accountListItemModel = new AccountListItemModel((Image) LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_rev_points_mono, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), (Clause) textLocalisedClause, (Clause) textLocalisedClause2, (List) null, (CircleBadgeModel) null, false, false, false, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        return new ProductAccount.ValueItem.Discover(productAccountId, new ProductAccountValue.Text(4, textLocalisedClause, textLocalisedClause2), accountListItemModel, new AccountWidgetItemModel(u.c(new ProductAccountWidgetAction(508, null, new TextLocalisedClause(R$string.rev_points_pocket_discovery_action, null, null, 14), null, null, "POINTS_POCKET_DISCOVER_GET_STARTED_ACTION_ITEM_ID", null, null, false, false)), (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) textLocalisedClause, false, (ProductAccountSubtitle) new ProductAccountSubtitle.Text(textLocalisedClause2, null), 50), (ProductAccountMetadata) null, ufe.b.REVPOINTS_POCKET, 48);
    }
}
