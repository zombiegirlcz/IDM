package tdi;

import aw0.o9;
import ce9.m;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountBalance;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitleAction;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature_rev_points_pocket_api.R$string;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import wa7.p;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f269998a;

    public g(p hiddenAccountsActionsProvider) {
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsProvider, "hiddenAccountsActionsProvider");
        this.f269998a = hiddenAccountsActionsProvider;
    }

    public final ProductAccount.ValueItem.Main a(RevPointsPocketInfo revPointsPocketInfo, RevPointsPocketThreshold revPointsPocketThreshold) {
        Intrinsics.checkNotNullParameter(revPointsPocketInfo, "revPointsPocketInfo");
        ProductAccountId productAccountId = new ProductAccountId(revPointsPocketInfo.f97784a, ExtendedSubaccountType.RevPoints.INSTANCE);
        dj0.d dVar = revPointsPocketInfo.e;
        ProductAccountValue.Balance balance = new ProductAccountValue.Balance(dVar, (TextLocalisedClause) null, 6);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(dVar), true);
        LayeredImage layeredImageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_rev_points_mono, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_points_pocket_product_account_pocket_item_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = revPointsPocketThreshold != null ? new TextLocalisedClause(R$string.rev_points_pocket_common_per_year, u.c(nub.a.q(revPointsPocketThreshold.f97794b, null, null, null, 7)), null, 12) : new TextLocalisedClause(R$string.rev_points_pocket_product_account_pocket_item_subtitle_not_earning, null, null, 14);
        ra7.b bVar = ra7.c.Companion;
        AccountListItemModel accountListItemModel = new AccountListItemModel((Image) layeredImageI, (Clause) textLocalisedClause, (Clause) textLocalisedClause2, v.l(this.f269998a.b(null, false, true)), (CircleBadgeModel) null, false, false, true, 240);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.rev_points_pocket_title, null, null, 14);
        List listK = v.k(new ProductAccountWidgetAction(492, null, new TextLocalisedClause(R$string.rev_points_pocket_home_header_action_add_money, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "REV_POINTS_POCKET_ACTION_ADD_MONEY_ID", null, null, false, false), new ProductAccountWidgetAction(428, null, new TextLocalisedClause(R$string.rev_points_pocket_home_header_action_withdraw, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "REV_POINTS_POCKET_ACTION_WITHDRAW_ID", null, null, false, !dVar.k()), m.N(sfe.d.f262408c));
        Float fValueOf = Float.valueOf(16.0f);
        List listK2 = v.k(revPointsPocketThreshold != null ? new TextLocalisedClause(R$string.rev_points_pocket_common_per_year, u.c(nub.a.q(revPointsPocketThreshold.f97794b, null, null, null, 7)), null, 12) : new TextLocalisedClause(R$string.rev_points_pocket_home_header_action_activate_reward, null, null, 14), new ImageClause(R$drawable.uikit_icn_24_info_outline, Integer.valueOf(R$attr.uikit_colorWhite), fValueOf, fValueOf, 16));
        m70.a.t(t0.f186434a);
        return new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, accountListItemModel, new AccountWidgetItemModel(listK, (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) textLocalisedClause3, false, (ProductAccountSubtitle) new ProductAccountSubtitle.Clickable(new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, ProductAccountSubtitleAction.EmptyPayload.f89528b), 50), productAccountMetadata, (AccountListItemModel) null, false, true, 352);
    }
}
