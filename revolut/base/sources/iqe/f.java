package iqe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountBalance;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.teen.accounts.api.model.TeenAccountPayload;
import com.revolut.feature.teen.accounts.impl.R$string;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import wa7.p;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y79.a f167822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn2.c f167823b;

    public f(y79.a onHoldAccountMapper, fn2.c teenAccountActionsProvider) {
        Intrinsics.checkNotNullParameter(onHoldAccountMapper, "onHoldAccountMapper");
        Intrinsics.checkNotNullParameter(teenAccountActionsProvider, "teenAccountActionsProvider");
        this.f167822a = onHoldAccountMapper;
        this.f167823b = teenAccountActionsProvider;
    }

    public final ProductAccount.ValueItem.Main a(fo3.c wallet, io3.d pocket, gqe.c teenHomeUiConfig, TeenProfile teenProfile, boolean z) {
        boolean z3;
        List listL;
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(teenHomeUiConfig, "teenHomeUiConfig");
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        xi0.a aVar = xi0.b.Companion;
        String str = pocket.f163147c;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        dj0.d dVar = new dj0.d(pocket.i, bVarA);
        String str2 = pocket.f163145a;
        ProductAccountId productAccountId = new ProductAccountId(str2, new TeenAccountPayload.Pocket(wallet.f136805h, wallet.f136801a, str2));
        boolean z4 = teenHomeUiConfig.f145711c;
        ProductAccountValue.Balance balance = new ProductAccountValue.Balance(dVar, z4 ? null : new TextLocalisedClause(R$string.teen_account_switcher_account_cell_balance_description_inactive, null, null, 14), 4);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(dVar), true);
        CurrencyImage currencyImage = new CurrencyImage(bVarA.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        CurrencyClause currencyClause = new CurrencyClause(bVarA, null, null, 6);
        boolean z6 = teenHomeUiConfig.f145711c;
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        Intrinsics.checkNotNullParameter(teenHomeUiConfig, "teenHomeUiConfig");
        if (z4) {
            z3 = z4;
            ProductAccountListAction[] elements = {fn2.c.j(teenProfile), ((p) this.f167823b.f136517b).b(pocket, z, true)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
        } else {
            z3 = z4;
            listL = f0.f322471a;
        }
        AccountListItemModel accountListItemModel = new AccountListItemModel((Image) currencyImage, (Clause) currencyClause, teenHomeUiConfig.f145710b, listL, teenHomeUiConfig.f145709a, false, false, z6, BERTags.FLAGS);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.teen_home_header_account_name, u.c(teenProfile.f90335b), null, 12);
        List enabledActions = teenHomeUiConfig.d;
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        Intrinsics.checkNotNullParameter(enabledActions, "enabledActions");
        List listK = fn2.c.k(new a(teenProfile, pocket), enabledActions);
        ProductAccountSubtitle productAccountSubtitleA = ((e89.a) this.f167822a).a(pocket, f0.f322471a);
        if (productAccountSubtitleA == null) {
            productAccountSubtitleA = new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.teen_home_header_subtitle_active, null, null, 14), null);
        }
        return new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, accountListItemModel, new AccountWidgetItemModel(listK, (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) textLocalisedClause, false, productAccountSubtitleA, 50), productAccountMetadata, (AccountListItemModel) null, !z3, true, 288);
    }

    public final ProductAccount.ValueItem.Main b(fo3.c wallet, dj0.d totalBalance, TeenProfile teenProfile, gqe.c teenHomeUiConfig) {
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        Intrinsics.checkNotNullParameter(teenHomeUiConfig, "teenHomeUiConfig");
        bqe.b.Companion.getClass();
        ProductAccountId productAccountId = new ProductAccountId(a0.d.r(bqe.a.f17818b, wallet.f136801a), new TeenAccountPayload.AllAccounts(wallet.f136805h, wallet.f136801a));
        ProductAccountValue.Balance balance = new ProductAccountValue.Balance(totalBalance, (TextLocalisedClause) null, 4);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(totalBalance), true);
        LayeredImage layeredImageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.teen_account_switcher_all_accounts_title, null, null, 14);
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        Intrinsics.checkNotNullParameter(teenHomeUiConfig, "teenHomeUiConfig");
        boolean z = teenHomeUiConfig.f145711c;
        AccountListItemModel accountListItemModel = new AccountListItemModel((Image) layeredImageI, (Clause) textLocalisedClause, (Clause) null, z ? u.c(fn2.c.j(teenProfile)) : f0.f322471a, (CircleBadgeModel) null, false, false, false, Constants.TAG_F4);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.teen_home_header_all_accounts_title, u.c(teenProfile.f90335b), null, 12);
        List enabledActions = teenHomeUiConfig.d;
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        Intrinsics.checkNotNullParameter(enabledActions, "enabledActions");
        return new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, accountListItemModel, new AccountWidgetItemModel(fn2.c.k(new b(wallet, teenProfile), enabledActions), (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) textLocalisedClause2, false, (ProductAccountSubtitle) new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.teen_home_header_subtitle_active, null, null, 14), null), 50), productAccountMetadata, (AccountListItemModel) null, !z, false, 288);
    }
}
