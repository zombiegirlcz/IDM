package hzh;

import aim.e;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import d9.e1;
import dj0.d;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import myh.i;
import org.jetbrains.annotations.NotNull;
import wd6.h;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final C0900a Companion = new C0900a();

    /* JADX INFO: renamed from: hzh.a$a, reason: collision with other inner class name */
    public static final class C0900a {
        private C0900a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.lang.Object[], qv0.i[]] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.lang.Object[], qv0.i[]] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.revolut.core.ui_kit.models.Style, com.revolut.feature.crypto.config.api.models.CryptoPeggedPair, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public static e a(i summary, n9l.a aVar) {
        h hVar;
        int i;
        ?? r2;
        h hVar2;
        ?? model;
        int i2;
        ?? model2;
        CellDetailsDelegate.Model model3;
        Intrinsics.checkNotNullParameter(summary, "summary");
        ChargeBreakdown chargeBreakdown = summary.f;
        h hVar3 = summary.f210521a;
        Object model4 = null;
        if (chargeBreakdown != null) {
            List list = chargeBreakdown.f104723b;
            Amount amount = chargeBreakdown.f104722a;
            if (list.isEmpty()) {
                model3 = new CellDetailsDelegate.Model("breakdown.fee", new TextLocalisedClause(R$string.cryptobuysell_exchange_summary_fee, null, null, 14), new TextLocalisedClause(R.string.transaction_no_fees, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
            } else if (e1.I(amount.f104717a)) {
                model3 = new CellDetailsDelegate.Model("breakdown.fee", new TextLocalisedClause(R$string.cryptobuysell_exchange_summary_fee, null, null, 14), b(amount), 0, null, null, null, null, null, false, 0, 0, 32760);
            } else {
                hVar = hVar3;
                r2 = 0;
                i = 14;
                model4 = new CellDetailsActionDelegate.Model("breakdown.fee", new TextLocalisedClause(R$string.cryptobuysell_exchange_summary_fee, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), b(amount), null, false, false, null, null, chargeBreakdown, 0, 0, 0, 0, 4192228);
            }
            hVar = hVar3;
            i = 14;
            r2 = 0;
            model4 = model3;
        } else {
            hVar = hVar3;
            i = 14;
            r2 = 0;
        }
        d dVar = summary.f210524g;
        ?? model5 = dVar != null ? new CellDetailsDelegate.Model("EXCHANGE_ITEM_LIST_ID", new TextLocalisedClause(R$string.cryptobuysell_fx_orders_take_profit_stop_loss_order_review_summary_exchange, r2, r2, i), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760) : r2;
        e eVarB = u.b();
        if (aVar != null) {
            hVar2 = hVar;
            model = new CellDetailsActionDelegate.Model("CRYPTO_PRICE_ID", new TextLocalisedClause(R$string.cryptobuysell_fx_orders_current_price_title, r2, r2, i), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), com.revolut.core.ui_kit.models.b.b(aVar.f213661a, aVar.f213662b, aVar.f213663c, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254)), false, false, null, new n0i.a(hVar, summary.f210522b, true, r2), 0, 0, 32224);
        } else {
            hVar2 = hVar;
            model = r2;
        }
        int i3 = b.f157191a[hVar2.ordinal()];
        if (i3 == 1) {
            i2 = R$string.cryptobuysell_limit_order_target_price_stop;
        } else {
            if (i3 != 2) {
                throw new IllegalArgumentException(hVar2 + " not supported");
            }
            i2 = R$string.cryptobuysell_limit_order_target_price_limit;
        }
        CellDetailsDelegate.Model model6 = new CellDetailsDelegate.Model("ID_LIMIT", new TextLocalisedClause(i2, r2, r2, i), new RateClause(new BigDecimal(String.valueOf(summary.f210523c)), summary.k, new RateClause.Format.Default(summary.o, true), r2), 0, null, null, null, null, null, false, 0, 0, 32760);
        if (model != 0) {
            ?? elements = {model6, model};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            eVarB.addAll(listL);
        }
        ?? elements2 = new qv0.i[5];
        ?? r92 = model6;
        if (model != 0) {
            r92 = r2;
        }
        elements2[0] = r92;
        elements2[1] = new CellDetailsDelegate.Model("ID_AMOUNT", new TextLocalisedClause(R$string.cryptobuysell_exchange_summary_amount, r2, r2, i), new MoneyClause(summary.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
        boolean z = summary.i;
        elements2[2] = z ? model5 : model4;
        ?? r4 = model4;
        if (!z) {
            r4 = model5;
        }
        elements2[3] = r4;
        d dVar2 = summary.f210525h;
        if (dVar2 != null) {
            model2 = new CellDetailsDelegate.Model("TOTAL_ITEM_LIST_ID", new TextLocalisedClause(summary.f210527l ? R$string.cryptobuysell_order_details_summary_total_credit : R$string.cryptobuysell_order_details_summary_total_cost, r2, r2, i), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        } else {
            model2 = r2;
        }
        elements2[4] = model2;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL2 = kotlin.collections.d.L(elements2);
        yp0.b.k(listL2, 0, 0, 0, 0, 31);
        eVarB.addAll(listL2);
        return u.a(eVarB);
    }

    public static AssetClause b(Amount amount) {
        AssetClauseType crypto;
        BigDecimal bigDecimal = amount.f104717a;
        Asset asset = amount.f104718b;
        int i = b.f157192b[asset.f104719a.ordinal()];
        if (i == 1) {
            crypto = new AssetClauseType.Crypto(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else if (i == 2) {
            crypto = new AssetClauseType.Commodity(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else {
            if (i != 3) {
                if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("can't map " + asset.f104719a + " amount").toString());
            }
            crypto = new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        }
        return new AssetClause(bigDecimal, crypto, asset.f104720b, null, null, 24);
    }
}
