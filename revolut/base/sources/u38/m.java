package u38;

import aw0.o9;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountBalance;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n38.d0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    @NotNull
    public static final k Companion = new k();
    public static final String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f276827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y79.a f276828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f276829c;
    public final wa7.p d;

    static {
        i38.c.Companion.getClass();
        e = i38.b.f158111b;
    }

    public m(j actionsMapper, y79.a onHoldAccountMapper, g jointEmptyStateProvider, wa7.p hiddenAccountsActionsProvider) {
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(onHoldAccountMapper, "onHoldAccountMapper");
        Intrinsics.checkNotNullParameter(jointEmptyStateProvider, "jointEmptyStateProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsProvider, "hiddenAccountsActionsProvider");
        this.f276827a = actionsMapper;
        this.f276828b = onHoldAccountMapper;
        this.f276829c = jointEmptyStateProvider;
        this.d = hiddenAccountsActionsProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProductAccount.ValueItem.Main a(d0 pendingInvitation, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(pendingInvitation, "pendingInvitation");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        xi0.a aVar = xi0.b.Companion;
        String str = baseCurrency.f306286a;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        CurrencyImage currencyImage = new CurrencyImage(baseCurrency.f306286a, (ImageTransformations) null, (TextLocalisedClause) (0 == true ? 1 : 0), 14);
        ProductAccountId productAccountId = new ProductAccountId("JOINT_PENDING_INVITATION_PRODUCT_ID", null);
        ProductAccountValue.Balance balance = new ProductAccountValue.Balance(new dj0.d(0L, baseCurrency), (TextLocalisedClause) null, 6);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(new dj0.d(0L, baseCurrency)), true);
        AccountListItemModel accountListItemModel = new AccountListItemModel((Image) currencyImage, (Clause) new TextClause(bVarA.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new TextLocalisedClause(R$string.joint_home_currency_account_outgoing_invitation_title, u.c(pendingInvitation.d), null, 12), (List) f0.f322471a, (CircleBadgeModel) null, false, false, false, 240);
        CompositeClause compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.joint_home_currency_account_product_name, null, null, 14), new TextClause(bVarA.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12);
        j jVar = this.f276827a;
        List listK = v.k(jVar.i, jVar.f276823j, jVar.k);
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            arrayList.add(ProductAccountListAction.a((ProductAccountListAction) it8.next(), null, false, pendingInvitation, 383));
        }
        return new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, accountListItemModel, new AccountWidgetItemModel((List) ce9.m.O(arrayList), (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.DelayedStories.f89488a, (Clause) compositeClause, false, (ProductAccountSubtitle) new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.joint_home_currency_account_outgoing_invitation_title, u.c(pendingInvitation.d), null, 12), null), 50), productAccountMetadata, (AccountListItemModel) null, false, true, 288);
    }

    public final ArrayList b(io3.d dVar, xi0.b bVar, boolean z, boolean z3) {
        io3.k kVar = dVar.f;
        boolean z4 = kVar == io3.k.ACTIVE || kVar == io3.k.DELISTED;
        boolean zF = Intrinsics.f(dVar.f163147c, bVar.f306286a);
        ProductAccountListAction productAccountListAction = sfe.d.f262407b;
        j jVar = this.f276827a;
        ProductAccountListAction productAccountListAction2 = jVar.f276820c;
        if (z4) {
            productAccountListAction2 = null;
        }
        ra7.b bVar2 = ra7.c.Companion;
        ProductAccountListAction productAccountListActionB = this.d.b(null, z, z3);
        ProductAccountListAction productAccountListAction3 = jVar.f276825m;
        if (!z4 || zF) {
            productAccountListAction3 = null;
        }
        ProductAccountListAction[] elements = {productAccountListAction, productAccountListAction2, productAccountListActionB, productAccountListAction3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList(w.t(listL, 10));
        Iterator it8 = listL.iterator();
        while (it8.hasNext()) {
            arrayList.add(ProductAccountListAction.a((ProductAccountListAction) it8.next(), null, false, dVar, 383));
        }
        return arrayList;
    }

    public final ProductAccount.ValueItem.Main c(dj0.d totalBalance, n38.a jointAccount, List onHoldAccounts, do3.n user, ProductAccountSubtitle productAccountSubtitle, io3.d dVar) {
        List listO;
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
        Intrinsics.checkNotNullParameter(onHoldAccounts, "onHoldAccounts");
        Intrinsics.checkNotNullParameter(user, "user");
        j jVar = this.f276827a;
        ProductAccountListAction productAccountListAction = jVar.d;
        ProductAccountListAction productAccountListAction2 = jVar.f276821g;
        y91.b bVar = jVar.f276819b;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
        n38.q qVar = jointAccount.f211925c;
        int i = qVar == null ? -1 : i.f276817a[qVar.ordinal()];
        if (i == 1) {
            ProductAccountListAction productAccountListAction3 = jVar.e;
            ProductAccountListAction productAccountListActionA = ProductAccountListAction.a(sfe.d.f262407b, null, false, "DETAILS_ACTION_SUMMARY", 383);
            ProductAccountListAction productAccountListActionA2 = ProductAccountListAction.a(productAccountListAction, null, false, "STATEMENT_ACTION_SUMMARY", 383);
            if (!bVar.a("STATEMENTS.account_statement")) {
                productAccountListActionA2 = null;
            }
            if (te0.w.V(user)) {
                productAccountListAction2 = null;
            }
            ProductAccountListAction[] elements = {productAccountListAction3, productAccountListActionA, productAccountListActionA2, productAccountListAction2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listO = ce9.m.O(kotlin.collections.d.L(elements));
        } else if (i == 2) {
            ProductAccountListAction productAccountListAction4 = jVar.f276822h;
            ProductAccountListAction productAccountListAction5 = sfe.d.f262406a;
            ProductAccountListAction productAccountListActionA3 = jVar.a(dVar);
            ProductAccountListAction productAccountListActionA4 = ProductAccountListAction.a(productAccountListAction, null, false, "STATEMENT_ACTION_SUMMARY", 383);
            if (!bVar.a("STATEMENTS.account_statement")) {
                productAccountListActionA4 = null;
            }
            if (te0.w.V(user)) {
                productAccountListAction2 = null;
            }
            listO = ce9.m.O(zhm.d0.d1(z0.i(productAccountListAction4, productAccountListAction5, productAccountListActionA3, productAccountListActionA4, productAccountListAction2)));
        } else {
            if (i != 3) {
                throw new IllegalStateException(("unknown state : " + jointAccount.f211925c).toString());
            }
            listO = f0.f322471a;
        }
        List list = listO;
        ProductAccountId productAccountId = new ProductAccountId(e, null);
        ProductAccountValue.Balance balance = new ProductAccountValue.Balance(totalBalance, (TextLocalisedClause) null, 6);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(totalBalance), true);
        AccountListItemModel accountListItemModel = new AccountListItemModel((Image) LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_coins, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), (Clause) new TextLocalisedClause(R$string.joint_home_account_spaces_total_item_title, null, null, 14), (Clause) null, u.c(jVar.a(dVar)), (CircleBadgeModel) null, false, false, false, Constants.TAG_F4);
        CompositeClause compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.joint_home_currency_account_product_name, null, null, 14), new TextLocalisedClause(R$string.joint_home_account_spaces_total_item_title, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12);
        ProductAccountSubtitle.Text textC = ((e89.a) this.f276828b).c(onHoldAccounts);
        ProductAccountSubtitle productAccountSubtitle2 = textC == null ? productAccountSubtitle : textC;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ProductAccountWidgetAction) it8.next()).f89538a);
        }
        return new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, accountListItemModel, new AccountWidgetItemModel(list, (NavBarWithContainerBackground) null, this.f276829c.a(arrayList), (Clause) compositeClause, false, productAccountSubtitle2, 50), productAccountMetadata, (AccountListItemModel) null, false, false, 352);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.revolut.core.ui_kit.models.Style, com.revolut.feature.tab.accounts.models.ProductAccountId$Payload, java.util.List] */
    public final ProductAccount.ValueItem.Main d(io3.d pocket, xi0.b baseCurrency, n38.a jointAccount, List onHoldAccounts, ProductAccountSubtitle productAccountSubtitle, do3.n user, boolean z, g48.a alternativeFeatures) {
        Iterable iterableL;
        ?? r87;
        TextLocalisedClause textLocalisedClause;
        ProductAccountSubtitle productAccountSubtitle2;
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
        Intrinsics.checkNotNullParameter(onHoldAccounts, "onHoldAccounts");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(alternativeFeatures, "alternativeFeatures");
        xi0.a aVar = xi0.b.Companion;
        String str = pocket.f163147c;
        long j2 = pocket.i;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        j jVar = this.f276827a;
        ProductAccountListAction productAccountListAction = jVar.f276822h;
        ProductAccountListAction productAccountListAction2 = jVar.d;
        ProductAccountListAction productAccountListAction3 = jVar.f276820c;
        ProductAccountListAction productAccountListAction4 = jVar.f276821g;
        y91.b bVar = jVar.f276819b;
        Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(alternativeFeatures, "alternativeFeatures");
        String pocketId = pocket.f163145a;
        String str2 = pocket.f163147c;
        io3.k kVar = pocket.f;
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        n38.q qVar = jointAccount.f211925c;
        int i = qVar == null ? -1 : i.f276817a[qVar.ordinal()];
        if (i == 1) {
            if (kVar == io3.k.ACTIVE || kVar == io3.k.DELISTED) {
                productAccountListAction3 = null;
            }
            ProductAccountListAction productAccountListAction5 = jVar.e;
            ProductAccountListAction productAccountListAction6 = sfe.d.f262407b;
            if (!bVar.a("STATEMENTS.account_statement")) {
                productAccountListAction2 = null;
            }
            if (te0.w.V(user)) {
                productAccountListAction4 = null;
            }
            ProductAccountListAction[] elements = {productAccountListAction3, productAccountListAction5, productAccountListAction6, productAccountListAction2, productAccountListAction4};
            Intrinsics.checkNotNullParameter(elements, "elements");
            iterableL = kotlin.collections.d.L(elements);
        } else if (i == 2) {
            boolean z3 = kVar == io3.k.ACTIVE;
            boolean z4 = kVar == io3.k.DELISTED;
            boolean z6 = z3 || z4;
            boolean z11 = z3;
            boolean zF = Intrinsics.f(str2, baseCurrency.f306286a);
            List list = alternativeFeatures.f140347a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                boolean z12 = zF;
                boolean z29 = z6;
                if (((ApmProduct) obj2).a(str2)) {
                    arrayList.add(obj2);
                }
                zF = z12;
                z6 = z29;
            }
            boolean z31 = zF;
            boolean z41 = z6;
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                ProductAccountListAction productAccountListActionA = r12.h.a((ApmProduct) it8.next());
                if (productAccountListActionA != null) {
                    arrayList2.add(productAccountListActionA);
                }
            }
            aim.e eVarB = u.b();
            if (!z11 && !z4) {
                eVarB.add(productAccountListAction3);
            }
            boolean z49 = !z4;
            eVarB.add(ProductAccountListAction.a(productAccountListAction, null, z49, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG));
            if (!z4) {
                eVarB.addAll(arrayList2);
            }
            if (z41) {
                eVarB.add(ProductAccountListAction.a(sfe.d.f262406a, null, z49, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG));
            }
            eVarB.add(sfe.d.f262407b);
            if (bVar.a("STATEMENTS.account_statement")) {
                eVarB.add(productAccountListAction2);
            }
            if (!z41) {
                eVarB.add(ProductAccountListAction.a(jVar.f, null, z4, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG));
            }
            if (!te0.w.V(user)) {
                eVarB.add(productAccountListAction4);
            }
            if ((z11 || z4) && !z31) {
                eVarB.add(jVar.f276824l);
            }
            iterableL = u.a(eVarB);
        } else {
            if (i != 3) {
                throw new IllegalStateException(("unknown state : " + qVar).toString());
            }
            ProductAccountListAction productAccountListActionA2 = ProductAccountListAction.a(productAccountListAction, null, false, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            ProductAccountListAction productAccountListActionA3 = ProductAccountListAction.a(sfe.d.f262406a, null, false, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            ProductAccountListAction productAccountListActionA4 = ProductAccountListAction.a(sfe.d.f262407b, null, false, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            ProductAccountListAction productAccountListActionA5 = ProductAccountListAction.a(productAccountListAction2, null, false, null, 510);
            if (!bVar.a("STATEMENTS.account_statement")) {
                productAccountListActionA5 = null;
            }
            if (te0.w.V(user)) {
                productAccountListAction4 = null;
            }
            ProductAccountListAction[] elements2 = {productAccountListActionA2, productAccountListActionA3, productAccountListActionA4, productAccountListActionA5, productAccountListAction4};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            iterableL = kotlin.collections.d.L(elements2);
        }
        ArrayList arrayList3 = new ArrayList(w.t(iterableL, 10));
        Iterator it9 = iterableL.iterator();
        while (it9.hasNext()) {
            arrayList3.add(ProductAccountListAction.a((ProductAccountListAction) it9.next(), null, false, pocket, 383));
        }
        ArrayList arrayListO = ce9.m.O(arrayList3);
        int i2 = l.f276826a[kVar.ordinal()];
        if (i2 == 1) {
            r87 = 0;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.pocket_details.api.R$string.pocket_inactive, null, null, 14);
        } else if (i2 != 2) {
            textLocalisedClause = null;
            r87 = 0;
        } else {
            r87 = 0;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.tab.accounts.api.R$string.home_currency_account_delisted, null, null, 14);
        }
        n38.q qVar2 = n38.q.PENDING;
        ?? textLocalisedClause2 = qVar == qVar2 ? new TextLocalisedClause(R$string.joint_account_switcher_pending_account_description, r87, r87, 14) : kVar == io3.k.DELISTED ? textLocalisedClause : r87;
        boolean z54 = kVar == io3.k.ACTIVE;
        ProductAccountId productAccountId = new ProductAccountId(pocketId, r87);
        ProductAccountValue.Balance balance = new ProductAccountValue.Balance(new dj0.d(j2, bVarA), textLocalisedClause, 4);
        boolean z74 = kVar == io3.k.INACTIVE || kVar == io3.k.DELISTED;
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(new dj0.d(j2, bVarA)), true);
        CurrencyImage currencyImage = new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) (0 == true ? 1 : 0), 14);
        CurrencyClause currencyClause = new CurrencyClause(bVarA, null, null, 6);
        io3.k kVar2 = io3.k.DELISTED;
        boolean z83 = z54;
        AccountListItemModel accountListItemModel = new AccountListItemModel(currencyImage, currencyClause, (Clause) textLocalisedClause2, b(pocket, baseCurrency, z, z54), qVar == qVar2 ? new WarningCircleBadge(dw0.a.Awaiting) : null, kVar != kVar2, kVar != kVar2, z83, 32);
        AccountListItemModel accountListItemModel2 = new AccountListItemModel((Image) new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) (0 == true ? 1 : 0), 14), (Clause) new TextLocalisedClause(R$string.account_switcher_favourite_joint_account_title, v.k(new TextLocalisedClause(R$string.joint_home_currency_account_product_name, null, null, 14), new CurrencyClause(bVarA, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12), (Clause) null, (List) b(pocket, baseCurrency, z, z83), (CircleBadgeModel) null, false, false, z83, Constants.TAG_F4);
        CompositeClause compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.joint_home_currency_account_product_name, null, null, 14), new TextClause(pocket.f163147c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12);
        ProductAccountSubtitle.Clickable clickableA = ((e89.a) this.f276828b).a(pocket, onHoldAccounts);
        if (clickableA == null) {
            ProductAccountSubtitle.Text text = textLocalisedClause != null ? new ProductAccountSubtitle.Text(textLocalisedClause, null) : null;
            productAccountSubtitle2 = text != null ? text : productAccountSubtitle;
        } else {
            productAccountSubtitle2 = clickableA;
        }
        ArrayList arrayList4 = new ArrayList(w.t(arrayListO, 10));
        Iterator it10 = arrayListO.iterator();
        while (it10.hasNext()) {
            arrayList4.add(((ProductAccountWidgetAction) it10.next()).f89538a);
        }
        return new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, accountListItemModel, new AccountWidgetItemModel((List) arrayListO, (NavBarWithContainerBackground) null, this.f276829c.a(arrayList4), (Clause) compositeClause, false, productAccountSubtitle2, 50), productAccountMetadata, accountListItemModel2, z74, true, 256);
    }
}
