package w38;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.impl.R$string;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f294211a;

    public s(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f294211a = featureToggleInteractor;
    }

    public static ProductAccount.ValueItem.Discover a() {
        return new ProductAccount.ValueItem.Discover(new ProductAccountId("JOINT_DISCOVER_ITEM_ID", null), new ProductAccountValue.Text(6, new TextLocalisedClause(R$string.joint_account_discovery_title, null, null, 14), (TextLocalisedClause) null), new AccountListItemModel((Image) LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_joint, R$attr.uikit_colorOnAccent, R$attr.uikit_colorPurple), (Clause) new TextLocalisedClause(R$string.joint_account_discovery_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.joint_account_discovery_tile_subtitle, null, null, 14), (List) null, (CircleBadgeModel) null, false, false, false, Constants.TAG_FULL_SVPP_IDENTIFICATION), new AccountWidgetItemModel(zhm.u.c(new ProductAccountWidgetAction(508, null, new TextLocalisedClause(R$string.joint_account_discovery_home_cta, null, null, 14), null, null, "JOINT_DISCOVER_ACTION_ID", null, null, false, false)), (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) null, false, (ProductAccountSubtitle) new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.joint_account_discovery_home_subtitle, null, null, 14), null), 58), (ProductAccountMetadata) null, ufe.b.JOINT, 48);
    }

    public static RowDelegate.Model.MainImage.Image40 b(int i) {
        return new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60);
    }
}
