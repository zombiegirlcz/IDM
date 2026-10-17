package vlf;

import aw0.k7;
import aw0.o9;
import aw0.u0;
import bnf.r;
import cmf.h;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.feature.transactions.impl.model.FeeBreakdownNavigation;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.youTransactor.uCube.rpc.Constants;
import h93.f0;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k71.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import qv0.i;
import thf.d;
import thf.m;
import tof.a3;
import tof.o3;
import tof.t3;
import tof.y6;
import wa7.p;
import wnf.e;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wnf.b f290427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f290428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f290429c;
    public final rhf.d d;

    public b(wnf.b legacyCommonMapper, m transactionTextResourcesMapper, d transactionIconResourcesMapper, p hiddenAccountsTransactionInteractor, t1j.b refundsUIStateProvider, rhf.d entryPoint) {
        Intrinsics.checkNotNullParameter(legacyCommonMapper, "legacyCommonMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsTransactionInteractor, "hiddenAccountsTransactionInteractor");
        Intrinsics.checkNotNullParameter(refundsUIStateProvider, "refundsUIStateProvider");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f290427a = legacyCommonMapper;
        this.f290428b = transactionTextResourcesMapper;
        this.f290429c = transactionIconResourcesMapper;
        this.d = entryPoint;
    }

    public static h f(b bVar, a3 transaction, Map pockets, na7.a hiddenAccountData, Map map, boolean z, int i, int i2, int i3) {
        Map juniorTransactionData = (i3 & 8) != 0 ? r0.g() : map;
        int i5 = (i3 & 32) != 0 ? R$attr.uikit_colorForeground : i;
        int i6 = (i3 & 64) != 0 ? R$attr.uikit_colorForeground_80 : i2;
        bVar.getClass();
        d dVar = bVar.f290429c;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(hiddenAccountData, "hiddenAccountData");
        Intrinsics.checkNotNullParameter(juniorTransactionData, "juniorTransactionData");
        rhf.d entryPoint = bVar.d;
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        MoneyClause moneyClauseI = ((e) bVar.f290427a).i(transaction, entryPoint == rhf.d.ANALYTICS);
        String strA = m.a(bVar.f290428b, transaction, pockets, null, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        Custom custom = new Custom(new Custom.Color.Solid(i5), false, p.c(transaction, hiddenAccountData.d), 246);
        Intrinsics.checkNotNullParameter(strA, "<this>");
        return new h(moneyClauseI, new TextClause(strA, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124), new TimeClause(transaction.f272593h.getMillis(), new TimeClause.Format.Pretty(0), new Custom(new Custom.Color.Solid(i6), false, false, 254), null, 8), d.a(dVar, transaction, r0.g(), null, null, null, null, pockets, juniorTransactionData, null, null, null, 1852), d.c(dVar, transaction, null, null, null, null, 28), z, true);
    }

    public static ArrayList g(int i, String suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new s7("ID_LOADING_ITEM_".concat(suffix), 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public final CellDetailsDelegate.Model a(a3 transaction) {
        MoneyClause moneyClauseF;
        dj0.d dVar;
        xi0.b bVar;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ((e) this.f290427a).getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        y6 y6Var = transaction.e;
        dj0.d dVar2 = transaction.k;
        int i = wnf.d.f298828b[y6Var.ordinal()];
        int i2 = R.string.money_form_amount;
        switch (i) {
            case 1:
                i2 = R.string.transaction_top_up;
                break;
            case 2:
                i2 = R.string.transaction_top_up_amount;
                break;
            case 3:
                i2 = R.string.transaction_top_up_chargeback;
                break;
            case 4:
                i2 = R$string.transactionUI_fees_breakdown_charged_by_atm;
                break;
            case 5:
                Set set = k.f181789a;
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                if (!Intrinsics.f(transaction.f272611s, "credit_card_topup") && !k.v0(transaction)) {
                    if (k.h(transaction) && !k.Z(transaction)) {
                        i2 = com.revolut.retail.feature.payments.money_request.core.R$string.transaction_money_requested;
                    } else if (pyd.c.i(dVar2) > 0) {
                        i2 = R.string.transaction_money_received;
                    } else if (pyd.c.i(dVar2) < 0) {
                        i2 = !k.q(transaction) ? R.string.transaction_money_sent : R$string.bank_transfer_review_field_exchanged_amount;
                    }
                }
                break;
            case 6:
                i2 = R$string.transactionUI_fees_breakdown_charged_by_merchant;
                break;
            case 7:
            case 8:
                i2 = R.string.transaction_refunded;
                break;
            case 9:
                if (pyd.c.i(dVar2) > 0) {
                    i2 = R.string.transaction_bought;
                } else if (pyd.c.i(dVar2) < 0) {
                    i2 = R.string.transaction_sold;
                }
                break;
            case 10:
                i2 = R.string.transaction_reward;
                break;
            case 11:
                i2 = R.string.transaction_fee;
                break;
            case 12:
            case 13:
                i2 = com.revolut.feature.credit.core.R$string.loan_management_transaction_payment_amount;
                break;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, null, null, 14);
        if (k.q(transaction) && y6Var == y6.TRANSFER) {
            moneyClauseF = new MoneyClause(transaction.k, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12);
        } else if ((k.q(transaction) && y6Var != y6.EXCHANGE) || k.A(transaction)) {
            moneyClauseF = xjf.e.b(transaction);
        } else if (y6Var == y6.EXCHANGE) {
            Intrinsics.checkNotNullParameter(transaction, "<this>");
            long jF0 = k.f0(transaction);
            o3 o3Var = transaction.J;
            String str = (o3Var == null || (dVar = o3Var.f272965a) == null || (bVar = dVar.f115083b) == null) ? null : bVar.f306286a;
            if (str == null) {
                str = "";
            }
            moneyClauseF = new MoneyClause(new dj0.d(jF0, new xi0.b(6, str, null)), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12);
        } else {
            moneyClauseF = xjf.e.f(transaction);
        }
        return new CellDetailsDelegate.Model("ID_EXTRAS_AMOUNT", textLocalisedClause, moneyClauseF, 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final i b(f0 f0Var, String cardDetails) {
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        ((e) this.f290427a).getClass();
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        if (f0Var == null) {
            return new CellDetailsDelegate.Model("ID_EXTRAS_CARD", new TextLocalisedClause(R$string.transactionUI_transaction_details_form_card_copy, null, null, 14), new TextClause(cardDetails, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        return new CellDetailsActionDelegate.Model("ID_EXTRAS_CARD", new TextLocalisedClause(R$string.transactionUI_transaction_details_form_card_copy, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(cardDetails, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, false, u0.LARGE, null, f0Var.f150110a, 0, 0, 0, 0, 4191972);
    }

    public final CellDetailsDelegate.Model c(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return ((e) this.f290427a).e(transaction);
    }

    public final i d(a3 transaction, ChargeBreakdown chargeBreakdown) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        e eVar = (e) this.f290427a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.transaction_fee, null, null, 14);
        String str = "ID_EXTRAS_FEE";
        if ((chargeBreakdown != null ? chargeBreakdown.f104722a : null) != null && !chargeBreakdown.f104723b.isEmpty()) {
            return new CellDetailsActionDelegate.Model(str, textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), eVar.a(chargeBreakdown), null, false, false, null, null, new FeeBreakdownNavigation(transaction, chargeBreakdown, null, true), 0, 0, 0, 0, 4192228);
        }
        if ((chargeBreakdown != null ? chargeBreakdown.f104722a : null) != null && chargeBreakdown.f104723b.isEmpty()) {
            return new CellDetailsDelegate.Model("ID_EXTRAS_FEE", textLocalisedClause, eVar.a(chargeBreakdown), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        long j2 = transaction.f272606p.f115082a + transaction.f272599l.f115082a;
        return new CellDetailsDelegate.Model("ID_EXTRAS_FEE", textLocalisedClause, j2 > 0 ? new MoneyClause(new dj0.d(j2, transaction.k.f115083b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : new TextLocalisedClause(R.string.transaction_no_fees, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final i e(String listId, a3 transaction, FeeBreakdownNavigation feeBreakdownNavigation) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ((e) this.f290427a).getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (transaction.f272599l.f115082a <= 0) {
            return new CellDetailsDelegate.Model(listId, new TextLocalisedClause(R$string.transactionUI_fees_breakdown_fees_title, null, null, 14), new TextLocalisedClause(R$string.transactionUI_fees_breakdown_fees_no_fee, null, null, 14), 0, feeBreakdownNavigation, null, null, null, null, false, 0, 0, 32744);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_fees_breakdown_fees_title, null, null, 14);
        MoneyClause moneyClause = new MoneyClause(transaction.f272599l, new MoneyClause.Format.Defaults(k7.ONLY_NEGATIVE, null, false, false, 14), null, null, 12);
        return new CellDetailsActionDelegate.Model(listId, textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), moneyClause, null, false, false, null, null, feeBreakdownNavigation, 0, 0, 0, 0, 4192228);
    }

    public final Clause h(DateTime dateTime, a3 transaction, t3 t3Var, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return ((r) this.f290428b).h(dateTime, transaction, t3Var, z);
    }

    public final CellDetailsDelegate.Model i(double d) {
        ((e) this.f290427a).getClass();
        return new CellDetailsDelegate.Model("ID_PURCHASED_LOYALTY_POINTS", new TextLocalisedClause(R$string.transactionUI_transaction_details_purchased, null, null, 14), nub.a.p(d, null, null, 7), 0, null, null, null, u0.LARGE, null, false, 0, 0, 32632);
    }

    public final CellDetailsDelegate.Model j(Clause status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return ((e) this.f290427a).l(status);
    }
}
