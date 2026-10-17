package g6i;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.retail.savings.api.documents.navigation.SavingsDocumentLauncherDestination;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.vaults.R$string;
import com.revolut.feature_crypto_order_flow.api.navigation.AccountBalanceLimitBottomSheetControllerProvider$InputData;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import grl.k9;
import j6i.j;
import j6i.l;
import j6i.o;
import j6i.p;
import j6i.q;
import j6i.r;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yji.n;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends n implements v5i.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t1 f140946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p1i.i f140947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j60.a f140948n;
    public final t8i.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f140949p;

    public c(t1 currencyRateNaviProvider, p1i.i quoteLimitsDialogMapper, j60.a bottomDialogExtension, t8i.d savingsTopUpLimitBottomSheetFactory) {
        Intrinsics.checkNotNullParameter(currencyRateNaviProvider, "currencyRateNaviProvider");
        Intrinsics.checkNotNullParameter(quoteLimitsDialogMapper, "quoteLimitsDialogMapper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(savingsTopUpLimitBottomSheetFactory, "savingsTopUpLimitBottomSheetFactory");
        this.f140946l = currencyRateNaviProvider;
        this.f140947m = quoteLimitsDialogMapper;
        this.f140948n = bottomDialogExtension;
        this.o = savingsTopUpLimitBottomSheetFactory;
        this.f140949p = true;
    }

    @Override // yji.n
    public final void D2() {
        if (this.f140949p) {
            LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
            List listK = v.k(largeActionButtonDelegate, new CellDetailsDelegate());
            j60.a aVar = this.f140948n;
            aVar.d(listK);
            n.j2(this, rd0.e.b(largeActionButtonDelegate.d.f121375b), null, new a(this, null), 3);
            n.j2(this, rd0.e.b(aVar.C()), null, new b(this, null), 3);
        }
    }

    public final void Z2(yqi.b error) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(error, "error");
        boolean z = error instanceof l;
        j60.a aVar = this.f140948n;
        p1i.i iVar = this.f140947m;
        if (z) {
            aVar.x(iVar.d(((l) error).f171783a.f104750b));
            return;
        }
        if (error instanceof j6i.d) {
            aVar.x(iVar.b(((j6i.d) error).f171775a.f104747b));
            return;
        }
        if (error instanceof j6i.e) {
            Limit.UsageLimit usageLimit = ((j6i.e) error).f171776a;
            aVar.x(iVar.c(usageLimit.f104750b, usageLimit.f104751c));
            return;
        }
        if (error instanceof j6i.i) {
            aVar.x(iVar.f(a.a.L(((j6i.i) error).f171780a.f104747b)));
            return;
        }
        boolean z3 = error instanceof r;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (!z3) {
            if (error instanceof j) {
                aVar.x(iVar.e());
                return;
            } else {
                if (error instanceof j6i.a) {
                    n.P2(this, o2(new nyh.a(new AccountBalanceLimitBottomSheetControllerProvider$InputData(((j6i.a) error).f171772a))), bottom_dialog, null, 2);
                    return;
                }
                return;
            }
        }
        r error2 = (r) error;
        this.o.getClass();
        Intrinsics.checkNotNullParameter(error2, "error");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.vaults_us_crb_one_off_maxmimum_amount_limit_reached_title, null, null, 14);
        if (error2 instanceof o) {
            o oVar = (o) error2;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_account_maximum_limit_reached_hys_description, v.k(new MoneyClause(oVar.f171786a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextClause(oVar.f171787b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(oVar.f171788c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        } else if (error2 instanceof p) {
            p pVar = (p) error2;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_account_maximum_limit_reached_hys_limitless_description, v.k(new MoneyClause(pVar.f171789a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextClause(pVar.f171790b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        } else {
            if (!(error2 instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
            q qVar = (q) error2;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_account_maximum_limit_reached_description, v.k(new TextClause(qVar.f171792b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(qVar.f171791a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        }
        lw0.a aVar2 = new lw0.a(textLocalisedClause2, textLocalisedClause, null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.vaults_us_crb_one_off_maxmimum_amount_limit_reached_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Savings;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        n.P2(this, new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), bottom_dialog, null, 2);
    }

    public final void b3(String id10, x5i.a targetAccount) {
        SavingsAccountDetails savingsAccountDetails;
        SavingsAccountDetails savingsAccountDetails2;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        if (Intrinsics.f(id10, "SHIELD_SAVINGS_MENU_BUTTON_ID")) {
            AccountSource accountSource = targetAccount.f302980b.d;
            AccountSource.SavingsSource savingsSource = accountSource instanceof AccountSource.SavingsSource ? (AccountSource.SavingsSource) accountSource : null;
            SavingsProductData savingsProductData = (savingsSource == null || (savingsAccountDetails2 = savingsSource.f97216a) == null) ? null : savingsAccountDetails2.f86462c;
            AccountSource.JuniorSavingsSource juniorSavingsSource = accountSource instanceof AccountSource.JuniorSavingsSource ? (AccountSource.JuniorSavingsSource) accountSource : null;
            SavingsProductData savingsProductData2 = (juniorSavingsSource == null || (savingsAccountDetails = juniorSavingsSource.f97207b) == null) ? null : savingsAccountDetails.f86462c;
            if (savingsProductData == null) {
                if (savingsProductData2 == null) {
                    return;
                } else {
                    savingsProductData = savingsProductData2;
                }
            }
            SavingsProduct savingsProduct = savingsProductData.f86683a;
            SavingsProduct.Protection protection = savingsProduct.f;
            SavingsDocument savingsDocument = protection != null ? protection.e : null;
            if (savingsDocument != null) {
                A2(new SavingsDocumentLauncherDestination(savingsDocument));
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Protection or document for product with id:", savingsProduct.f86617a, " is null"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
    }
}
