package vy5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.currency.accounts.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountBalance;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.retail.common.ui.api.Toggles;
import com.youTransactor.uCube.rpc.Constants;
import f95.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    @NotNull
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f293220q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y79.a f293221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f293222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y91.b f293223c;
    public final uw1.c d;
    public final wa7.p e;
    public final ProductAccountListAction f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProductAccountListAction f293224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProductAccountListAction f293225h;
    public final ProductAccountListAction i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ProductAccountListAction f293226j;
    public final ProductAccountListAction k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ProductAccountListAction f293227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProductAccountListAction f293228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ProductAccountListAction f293229n;
    public final ProductAccountListAction o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ProductAccountListAction f293230p;

    static {
        uy5.e.Companion.getClass();
        f293220q = uy5.d.f284077b;
    }

    public v0(y79.a onHoldAccountMapper, gte.a featureToggleInteractor, y91.b accountsProductFeatureChecker, uw1.c apmFeatureChecker, wa7.p hiddenAccountsActionsProvider, r12.h apmHomeActionsMapper) {
        Intrinsics.checkNotNullParameter(onHoldAccountMapper, "onHoldAccountMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsProvider, "hiddenAccountsActionsProvider");
        Intrinsics.checkNotNullParameter(apmHomeActionsMapper, "apmHomeActionsMapper");
        this.f293221a = onHoldAccountMapper;
        this.f293222b = featureToggleInteractor;
        this.f293223c = accountsProductFeatureChecker;
        this.d = apmFeatureChecker;
        this.e = hiddenAccountsActionsProvider;
        this.f = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.home_currency_account_action_add_money, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ADD_MONEY_ACTION_ID", null, null, false, false);
        this.f293224g = sfe.d.f262407b;
        this.f293225h = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.home_currency_account_action_statement, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_STATEMENT_ID", null, null, false, false);
        this.i = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.revolut_accounts_action_overdraft_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_overdraft, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_OVERDRAFT_ID", null, null, false, false);
        this.f293226j = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.home_currency_account_action_converter, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_rates_converter_page, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_CONVERTER_ID", null, null, false, false);
        this.k = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.home_currency_account_action_activate, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_switch_on, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_ACTIVATE_ACCOUNT_ID", null, null, false, false);
        this.f293227l = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.revolut_accounts_action_withdraw, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_INDIA_WITHDRAWAL_ID", null, null, false, false);
        this.f293228m = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.upi_home_scan_qr_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_scan_qr, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_SCAN_QR_ID", null, null, false, false);
        this.f293229n = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.home_currency_account_action_salary, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_salary, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_SALARY_ID", null, null, false, false);
        this.o = sfe.d.e;
        this.f293230p = sfe.d.d;
    }

    public static ProductAccountSubtitle.Text a(f95.g gVar) {
        if (gVar instanceof g.c) {
            return new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.home_currency_account_subtitle_overdraft_terminated, null, null, 14), null);
        }
        if (gVar instanceof g.b) {
            return new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.home_currency_account_subtitle_overdraft_restricted, null, null, 14), null);
        }
        if (gVar instanceof g.a) {
            return new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.home_currency_account_subtitle_overdraft_limit_exceeded, null, null, 14), null);
        }
        if (gVar instanceof f95.f) {
            return new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.home_currency_account_subtitle_overdraft_active, zhm.u.c(sx4.f.b(3, null, null, ((f95.f) gVar).f132832a)), null, 12), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ProductAccountListAction b(io3.d dVar) {
        Object obj2 = dVar;
        if (!((jte.d) this.f293222b).c(Toggles.AccountDetailsSurfacing.f98561c)) {
            obj2 = "ACTION_DETAILS_ALL_ID";
        } else if (dVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Base currency pocket must exist at this point");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            Unit unit = Unit.f186387a;
            obj2 = "ACTION_DETAILS_ALL_ID";
        }
        return ProductAccountListAction.a(this.f293224g, null, false, obj2, 383);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList c(io3.d r8, xi0.b r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            io3.k r0 = r8.f
            io3.k r1 = io3.k.DELISTED
            r2 = 0
            r3 = 1
            if (r0 != r1) goto La
            r1 = r3
            goto Lb
        La:
            r1 = r2
        Lb:
            io3.k r4 = io3.k.ACTIVE
            if (r0 != r4) goto L10
            goto L11
        L10:
            r3 = r2
        L11:
            java.lang.String r0 = r8.f163147c
            java.lang.String r9 = r9.f306286a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r0, r9)
            r0 = 0
            if (r1 == 0) goto L2a
            com.revolut.feature.pockets.api.PocketsUIApi$Toggles$DisableDelistedAccountDetails r4 = com.revolut.feature.pockets.api.PocketsUIApi$Toggles.DisableDelistedAccountDetails.f80766c
            gte.a r5 = r7.f293222b
            jte.d r5 = (jte.d) r5
            boolean r4 = r5.c(r4)
            if (r4 == 0) goto L2a
            r4 = r0
            goto L2c
        L2a:
            com.revolut.feature.tab.accounts.api.model.ProductAccountListAction r4 = r7.f293224g
        L2c:
            if (r3 != 0) goto L33
            if (r1 != 0) goto L33
            com.revolut.feature.tab.accounts.api.model.ProductAccountListAction r5 = r7.k
            goto L34
        L33:
            r5 = r0
        L34:
            ra7.b r6 = ra7.c.Companion
            wa7.p r6 = r7.e
            com.revolut.feature.tab.accounts.api.model.ProductAccountListAction r10 = r6.b(r0, r10, r11)
            if (r3 != 0) goto L40
            if (r1 == 0) goto L45
        L40:
            if (r9 != 0) goto L45
            com.revolut.feature.tab.accounts.api.model.ProductAccountListAction r9 = r7.f293230p
            goto L46
        L45:
            r9 = r0
        L46:
            com.revolut.feature.tab.accounts.api.model.ProductAccountListAction[] r9 = new com.revolut.feature.tab.accounts.api.model.ProductAccountListAction[]{r4, r5, r10, r9}
            java.lang.String r10 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)
            java.util.List r9 = kotlin.collections.d.L(r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = zhm.w.t(r9, r11)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L62:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L78
            java.lang.Object r11 = r9.next()
            com.revolut.feature.tab.accounts.api.model.ProductAccountListAction r11 = (com.revolut.feature.tab.accounts.api.model.ProductAccountListAction) r11
            r1 = 383(0x17f, float:5.37E-43)
            com.revolut.feature.tab.accounts.api.model.ProductAccountListAction r11 = com.revolut.feature.tab.accounts.api.model.ProductAccountListAction.a(r11, r0, r2, r8, r1)
            r10.add(r11)
            goto L62
        L78:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vy5.v0.c(io3.d, xi0.b, boolean, boolean):java.util.ArrayList");
    }

    public final ProductAccount.ValueItem.Main d(do3.n user, dj0.d totalBalance, List onHoldAccounts, a alternativeFeatures, f95.b currencyAccountOverdraftDetails, ProductAccountSubtitle productAccountSubtitle, io3.d dVar) {
        ProductAccountListAction productAccountListAction;
        ProductAccountListAction productAccountListAction2;
        ProductAccountSubtitle productAccountSubtitle2;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(onHoldAccounts, "onHoldAccounts");
        Intrinsics.checkNotNullParameter(alternativeFeatures, "alternativeFeatures");
        Intrinsics.checkNotNullParameter(currencyAccountOverdraftDetails, "currencyAccountOverdraftDetails");
        ProductAccountId productAccountId = new ProductAccountId(f293220q, null);
        ProductAccountValue.Balance balance = new ProductAccountValue.Balance(totalBalance, (TextLocalisedClause) null, 6);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(totalBalance), true);
        AccountListItemModel accountListItemModel = new AccountListItemModel((Image) LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), (Clause) (te0.w.V(user) ? new TextLocalisedClause(R$string.home_currency_account_spaces_total_item_title_mx, null, null, 14) : new TextLocalisedClause(R$string.home_currency_account_spaces_total_item_title, null, null, 14)), (Clause) null, zhm.u.c(b(dVar)), (CircleBadgeModel) null, false, false, false, Constants.TAG_F4);
        CompositeClause compositeClause = new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.home_currency_account_product_space_name, null, null, 14), te0.w.V(user) ? new TextLocalisedClause(R$string.home_currency_account_spaces_total_item_title_mx, null, null, 14) : new TextLocalisedClause(R$string.home_currency_account_spaces_total_item_title, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12);
        Intrinsics.checkNotNullParameter(currencyAccountOverdraftDetails, "<this>");
        boolean z = currencyAccountOverdraftDetails instanceof f95.a;
        Iterator it8 = alternativeFeatures.f293131b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                productAccountListAction = null;
                break;
            }
            productAccountListAction = ((ApmProduct) it8.next()) instanceof ApmUpi ? y02.e.i : null;
            if (productAccountListAction != null) {
                break;
            }
        }
        if (((ty1.b) this.d).b(uw1.f.UPI)) {
            if (productAccountListAction == null) {
                productAccountListAction = this.f293228m;
            }
            productAccountListAction2 = productAccountListAction;
        } else {
            productAccountListAction2 = null;
        }
        List listD1 = zhm.d0.d1(zhm.z0.i(this.f, productAccountListAction2, alternativeFeatures.f293132c, sfe.d.f262406a, b(dVar), z ? this.i : null, this.f293223c.a("STATEMENTS.account_statement") ? ProductAccountListAction.a(this.f293225h, new TextLocalisedClause(R$string.home_currency_account_action_statements, null, null, 14), false, "ACTION_STATEMENT_ALL_ID", 381) : null));
        ArrayList arrayList = new ArrayList(zhm.w.t(listD1, 10));
        Iterator it9 = listD1.iterator();
        while (it9.hasNext()) {
            arrayList.add(ce9.m.N((ProductAccountListAction) it9.next()));
        }
        ProductAccountSubtitle.Text textC = ((e89.a) this.f293221a).c(onHoldAccounts);
        if (textC == null) {
            Intrinsics.checkNotNullParameter(currencyAccountOverdraftDetails, "<this>");
            f95.a aVar = currencyAccountOverdraftDetails instanceof f95.a ? (f95.a) currencyAccountOverdraftDetails : null;
            f95.g gVar = aVar != null ? aVar.f132821a : null;
            ProductAccountSubtitle.Text textA = gVar != null ? a(gVar) : null;
            productAccountSubtitle2 = textA != null ? textA : productAccountSubtitle;
        } else {
            productAccountSubtitle2 = textC;
        }
        return new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, accountListItemModel, new AccountWidgetItemModel((List) arrayList, (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) compositeClause, false, productAccountSubtitle2, 50), productAccountMetadata, (AccountListItemModel) null, false, false, 352);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0170 A[PHI: r1
      0x0170: PHI (r1v2 com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle) = 
      (r1v1 com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle)
      (r1v4 com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle)
     binds: [B:32:0x0163, B:36:0x016e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem.Main e(io3.d r35, xi0.b r36, java.util.List r37, java.util.ArrayList r38, com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel.EmptyStateStories r39, f95.b r40, com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle r41, boolean r42) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vy5.v0.e(io3.d, xi0.b, java.util.List, java.util.ArrayList, com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel$EmptyStateStories, f95.b, com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle, boolean):com.revolut.feature.tab.accounts.api.model.ProductAccount$ValueItem$Main");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList f(io3.d r22, vy5.a r23, xi0.b r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vy5.v0.f(io3.d, vy5.a, xi0.b, boolean):java.util.ArrayList");
    }
}
