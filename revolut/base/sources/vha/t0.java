package vha;

import aw0.o9;
import bia.d;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pro.accounts.impl.ProAccountsProductMapper$SubtitleAction$CashbackAction;
import com.revolut.feature.pro.accounts.impl.ProAccountsProductMapper$SubtitleAction$PendingAmountAction;
import com.revolut.feature.pro.accounts.impl.R$string;
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
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class t0 {

    @NotNull
    public static final r0 Companion = new r0();
    public static final String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f289439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y79.a f289440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f289441c;

    static {
        sha.b.Companion.getClass();
        d = sha.a.f263448b;
    }

    public t0(f1 emptyStateStoriesFactory, y79.a onHoldAccountMapper, b proAccountActionsMapper) {
        Intrinsics.checkNotNullParameter(emptyStateStoriesFactory, "emptyStateStoriesFactory");
        Intrinsics.checkNotNullParameter(onHoldAccountMapper, "onHoldAccountMapper");
        Intrinsics.checkNotNullParameter(proAccountActionsMapper, "proAccountActionsMapper");
        this.f289439a = emptyStateStoriesFactory;
        this.f289440b = onHoldAccountMapper;
        this.f289441c = proAccountActionsMapper;
    }

    public static ProductAccountSubtitle.Clickable b(rr6.m mVar, boolean z, dj0.d dVar) {
        Float fValueOf = Float.valueOf(16.0f);
        long j2 = dVar.f115082a;
        ImageClauseTint.TextColor textColor = ImageClauseTint.TextColor.f57790a;
        ProductAccountSubtitleAction.EmptyPayload emptyPayload = ProductAccountSubtitleAction.EmptyPayload.f89528b;
        return j2 > 0 ? z ? new ProductAccountSubtitle.Clickable(new TextLocalisedClause(R$string.pro_accounts_switcher_inactive, null, null, 14), null, emptyPayload) : new ProductAccountSubtitle.Clickable(new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.freelancer_common_main_header_pending_amount_subtitle, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new ImageClause(R$drawable.uikit_icn_16_info_outline, textColor, fValueOf, fValueOf, 16)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, new ProductAccountSubtitleAction.General(ProAccountsProductMapper$SubtitleAction$PendingAmountAction.f81192a)) : z ? new ProductAccountSubtitle.Clickable(new TextLocalisedClause(R$string.pro_accounts_switcher_inactive, null, null, 14), null, emptyPayload) : new ProductAccountSubtitle.Clickable(new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.freelancer_common_main_header_subtitle, zhm.u.c(new PercentageClause(mVar.f256723c, (PercentageClause.Format) null, (Style) null, 6)), null, 12), new ImageClause(R$drawable.uikit_icn_16_info_outline, textColor, fValueOf, fValueOf, 16)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, new ProductAccountSubtitleAction.General(ProAccountsProductMapper$SubtitleAction$CashbackAction.f81191a));
    }

    public static ProductAccount.ValueItem.Discover d(xi0.b bVar) {
        return new ProductAccount.ValueItem.Discover(new ProductAccountId("DISCOVER_PRO_ACCOUNT_ID", null), new ProductAccountValue.Text(6, new TextLocalisedClause(R$string.freelancer_common_product_name_title, null, null, 14), (TextLocalisedClause) null), new AccountListItemModel((Image) LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_credit_card, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), (Clause) new TextLocalisedClause(R$string.freelancer_common_product_name_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.freelancer_home_discover_common_subtitle, null, null, 14), (List) null, (CircleBadgeModel) null, false, false, false, Constants.TAG_FULL_SVPP_IDENTIFICATION), new AccountWidgetItemModel(zhm.u.c(new ProductAccountWidgetAction(508, null, new TextLocalisedClause(R$string.freelancer_home_discover_open_pro_title, null, null, 14), null, null, "DISCOVER_PRO_ACTION_ID", null, null, false, false)), (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) null, false, (ProductAccountSubtitle) new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.freelancer_home_discover_common_subtitle, null, null, 14), null), 58), new ProductAccountMetadata(bVar != null ? new ProductAccountBalance.CurrencyOnly(bVar) : null, true), ufe.b.PRO, 32);
    }

    public final ProductAccount.ValueItem.Main a(bia.b proAccountInfo) {
        Intrinsics.checkNotNullParameter(proAccountInfo, "proAccountInfo");
        String str = proAccountInfo.f15456a.f115083b.f306286a;
        ArrayList arrayListD = this.f289441c.d(proAccountInfo, d.b.f15462a);
        ProductAccountId productAccountId = new ProductAccountId("PENDING_PRO_ACCOUNT_ID", null);
        dj0.d dVar = proAccountInfo.f15456a;
        ProductAccountValue.Balance balance = new ProductAccountValue.Balance(dVar, (TextLocalisedClause) null, 6);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(dVar), true);
        CurrencyImage currencyImage = new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        xi0.b.Companion.getClass();
        CurrencyClause currencyClause = new CurrencyClause(xi0.a.a(str), null, null, 6);
        yt8.i iVar = proAccountInfo.e;
        AccountListItemModel accountListItemModel = new AccountListItemModel((Image) currencyImage, (Clause) currencyClause, (Clause) ((iVar == yt8.i.NONE || ngm.n.q(iVar)) ? new TextLocalisedClause(R$string.freelancer_account_switcher_account_pending_kyc_title, null, null, 14) : new TextLocalisedClause(R$string.freelancer_account_switcher_account_pending_title, null, null, 14)), (List) null, (CircleBadgeModel) new AccentCircleBadge(dw0.a.Pending), false, false, false, 232);
        CompositeClause compositeClause = new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.freelancer_common_product_name_title, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12);
        rr6.m mVar = proAccountInfo.f15457b;
        dj0.d.Companion.getClass();
        ProductAccountSubtitle.Clickable clickableB = b(mVar, false, dj0.d.e);
        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListD, 10));
        Iterator it8 = arrayListD.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ProductAccountWidgetAction) it8.next()).f89538a);
        }
        return new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, accountListItemModel, new AccountWidgetItemModel((List) arrayListD, (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) this.f289439a.a(arrayList), (Clause) compositeClause, false, (ProductAccountSubtitle) clickableB, 50), productAccountMetadata, (AccountListItemModel) null, false, false, 352);
    }

    public final ProductAccount.ValueItem.Main c(bia.b proAccountInfo, List onHoldAccounts, dj0.d pendingAmount) {
        Intrinsics.checkNotNullParameter(proAccountInfo, "proAccountInfo");
        Intrinsics.checkNotNullParameter(onHoldAccounts, "onHoldAccounts");
        Intrinsics.checkNotNullParameter(pendingAmount, "pendingAmount");
        ProductAccountId productAccountId = new ProductAccountId(d, null);
        ProductAccountValue.Balance balance = new ProductAccountValue.Balance(proAccountInfo.f15456a, (TextLocalisedClause) null, 6);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(proAccountInfo.f15456a), true);
        AccountListItemModel accountListItemModel = new AccountListItemModel((Image) LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), (Clause) new TextLocalisedClause(R$string.freelancer_account_spaces_all_accounts_item_title, null, null, 14), (Clause) null, (List) null, (CircleBadgeModel) null, false, false, false, Constants.TAG_FC_SPEED_MODE);
        CompositeClause compositeClause = new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.freelancer_common_product_name_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_account_spaces_all_accounts_item_title, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12);
        ArrayList arrayListD = this.f289441c.d(proAccountInfo, d.a.f15461a);
        ProductAccountSubtitle productAccountSubtitleC = ((e89.a) this.f289440b).c(onHoldAccounts);
        if (productAccountSubtitleC == null) {
            productAccountSubtitleC = b(proAccountInfo.f15457b, false, pendingAmount);
        }
        return new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, accountListItemModel, new AccountWidgetItemModel((List) arrayListD, (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) compositeClause, false, productAccountSubtitleC, 50), productAccountMetadata, (AccountListItemModel) null, false, false, 352);
    }

    public final ProductAccount.ValueItem.Main e(io3.d pocket, bia.b proAccountInfo, List onHoldAccounts, dj0.d pendingAmount, boolean z) {
        ProductAccountSubtitle productAccountSubtitle;
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(proAccountInfo, "proAccountInfo");
        Intrinsics.checkNotNullParameter(onHoldAccounts, "onHoldAccounts");
        Intrinsics.checkNotNullParameter(pendingAmount, "pendingAmount");
        io3.k kVar = pocket.f;
        String str = pocket.f163147c;
        boolean z3 = kVar == io3.k.INACTIVE;
        boolean z4 = kVar == io3.k.ACTIVE;
        bia.e eVar = new bia.e(pocket);
        b bVar = this.f289441c;
        ArrayList arrayListD = bVar.d(proAccountInfo, eVar);
        int i = s0.f289436a[kVar.ordinal()];
        TextLocalisedClause textLocalisedClause = i != 1 ? i != 2 ? null : new TextLocalisedClause(com.revolut.feature.tab.accounts.api.R$string.home_currency_account_delisted, null, null, 14) : new TextLocalisedClause(R$string.pro_accounts_switcher_inactive, null, null, 14);
        ProductAccountId productAccountId = new ProductAccountId(pocket.f163145a, null);
        ProductAccountValue.Balance balance = new ProductAccountValue.Balance(io3.h.e(pocket), textLocalisedClause, 4);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(io3.h.e(pocket)), true);
        boolean z6 = z3 || kVar == io3.k.DELISTED;
        CurrencyImage currencyImage = new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        xi0.b.Companion.getClass();
        CurrencyClause currencyClause = new CurrencyClause(xi0.a.a(str), null, null, 6);
        io3.k kVar2 = io3.k.DELISTED;
        boolean z11 = z4;
        AccountListItemModel accountListItemModel = new AccountListItemModel(currencyImage, currencyClause, kVar == kVar2 ? textLocalisedClause : null, bVar.c(proAccountInfo, new bia.e(pocket), z, z4), (CircleBadgeModel) null, kVar != kVar2, kVar != kVar2, z11, 48);
        AccountListItemModel accountListItemModel2 = new AccountListItemModel((Image) new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14), (Clause) new TextLocalisedClause(R$string.freelancer_account_switcher_favourite_account_title, zhm.v.k(new TextLocalisedClause(R$string.freelancer_common_product_name_title, null, null, 14), new CurrencyClause(xi0.a.a(str), CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12), (Clause) null, bVar.c(proAccountInfo, new bia.e(pocket), z, z11), (CircleBadgeModel) null, false, false, z11, Constants.TAG_F4);
        CompositeClause compositeClause = new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.freelancer_common_product_name_title, null, null, 14), new TextClause(pocket.f163147c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12);
        ProductAccountSubtitle.Clickable clickableA = ((e89.a) this.f289440b).a(pocket, onHoldAccounts);
        if (clickableA != null) {
            productAccountSubtitle = clickableA;
        } else {
            ProductAccountSubtitle.Text text = textLocalisedClause != null ? new ProductAccountSubtitle.Text(textLocalisedClause, null) : null;
            if (text != null) {
                productAccountSubtitle = text;
            } else {
                clickableA = b(proAccountInfo.f15457b, z3, pendingAmount);
                productAccountSubtitle = clickableA;
            }
        }
        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListD, 10));
        Iterator it8 = arrayListD.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ProductAccountWidgetAction) it8.next()).f89538a);
        }
        return new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, accountListItemModel, new AccountWidgetItemModel((List) arrayListD, (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) this.f289439a.a(arrayList), (Clause) compositeClause, false, productAccountSubtitle, 50), productAccountMetadata, accountListItemModel2, z6, true, 256);
    }
}
