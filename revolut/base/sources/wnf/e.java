package wnf;

import aw0.k7;
import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.feature.transactions.api.TransactionApi$Toggles$AmountWithChargesMigration;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import d9.e1;
import io3.l;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import n61.j;
import org.jetbrains.annotations.NotNull;
import qv0.c;
import thf.m;
import tof.a1;
import tof.a3;
import tof.d7;
import tof.h0;
import tof.l0;
import tof.m1;
import tof.o3;
import tof.u0;
import tof.u3;
import tof.v3;
import tof.w5;
import tof.x1;
import tof.y6;
import u80.t;
import wa7.p;
import whf.n;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Set f298830m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f298831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.d f298832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nq9.a f298833c;
    public final nq9.e d;
    public final gte.a e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f298834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2k.e f298835h;
    public final elc.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qd0.b f298836j;
    public final cm4.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final thf.g f298837l;

    static {
        y6[] elements = {y6.CARD_PAYMENT, y6.CARD_CREDIT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f298830m = kotlin.collections.d.y0(elements);
    }

    public e(u80.m moneyFormatter, m transactionTextResourcesMapper, thf.d transactionIconResourcesMapper, thf.c transactionCategoryResourcesMapper, vnf.a transactionDetailsHelpItemsProvider, nq9.a paymentsGroupsBillsItemsMapper, nq9.e paymentsGroupsSplitsItemsMapper, w0a.h splitBillItemsMapper, gte.a featureToggleInteractor, n transactionListMapper, l4i.a amountConverter, t ratesMoneyUtils, b2k.e taxesItemProvider, elc.c roboPortfolioUiMapper, qd0.b languageProvider, gi0.a mobileServicesProvider, cm4.f creditCardInstalmentMapper, g fromToActionMapper, p hiddenAccountsTransactionInteractor, thf.g transactionsItemMapper) {
        Intrinsics.checkNotNullParameter(moneyFormatter, "moneyFormatter");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionDetailsHelpItemsProvider, "transactionDetailsHelpItemsProvider");
        Intrinsics.checkNotNullParameter(paymentsGroupsBillsItemsMapper, "paymentsGroupsBillsItemsMapper");
        Intrinsics.checkNotNullParameter(paymentsGroupsSplitsItemsMapper, "paymentsGroupsSplitsItemsMapper");
        Intrinsics.checkNotNullParameter(splitBillItemsMapper, "splitBillItemsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(transactionListMapper, "transactionListMapper");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        Intrinsics.checkNotNullParameter(taxesItemProvider, "taxesItemProvider");
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(mobileServicesProvider, "mobileServicesProvider");
        Intrinsics.checkNotNullParameter(creditCardInstalmentMapper, "creditCardInstalmentMapper");
        Intrinsics.checkNotNullParameter(fromToActionMapper, "fromToActionMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsTransactionInteractor, "hiddenAccountsTransactionInteractor");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        this.f298831a = transactionTextResourcesMapper;
        this.f298832b = transactionIconResourcesMapper;
        this.f298833c = paymentsGroupsBillsItemsMapper;
        this.d = paymentsGroupsSplitsItemsMapper;
        this.e = featureToggleInteractor;
        this.f = transactionListMapper;
        this.f298834g = ratesMoneyUtils;
        this.f298835h = taxesItemProvider;
        this.i = roboPortfolioUiMapper;
        this.f298836j = languageProvider;
        this.k = creditCardInstalmentMapper;
        this.f298837l = transactionsItemMapper;
    }

    public static MoneyClause.Format.Headers f(dj0.d dVar, boolean z) {
        return new MoneyClause.Format.Headers(z ? k7.NEVER : k7.ALWAYS, cp5.d.z(dVar.f115083b) ? ScaleMode.CryptoHoldingFormat.f51439a : null, null, false, false, 28);
    }

    public static CellDetailsActionDelegate.Model k(String str, dj0.d dVar, a3 a3Var) {
        Clause[] elements = {new TextLocalisedClause(R$string.transactionUI_transaction_details_spare_change_section_spare_change, null, null, 14), str != null ? new TextLocalisedClause(R$string.transactionUI_transaction_details_spare_change_section_spare_change_multiplier, u.c(str), null, 12) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.a(t0.f186434a);
        return new CellDetailsActionDelegate.Model("ID_EXTRAS_SPARE_CHANGE_AMOUNT", new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), 0, new ResourceImage(R$drawable.uikit_icn_24_fees, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12), null, false, false, null, null, a3Var, 0, 0, 0, 0, 4192228);
    }

    public final Clause a(ChargeBreakdown chargeBreakdown) {
        return e1.D(chargeBreakdown.f104722a.f104717a) ? new MoneyClause(l4i.a.b(chargeBreakdown.f104722a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : new TextLocalisedClause(R.string.transaction_no_fees, null, null, 14);
    }

    public final aim.e b(u3 transactionDetailsBill) {
        int i;
        Intrinsics.checkNotNullParameter(transactionDetailsBill, "transactionDetailsBill");
        aim.e eVarB = u.b();
        v3 v3Var = transactionDetailsBill.f273100c;
        String str = v3Var != null ? v3Var.d : null;
        String str2 = v3Var != null ? v3Var.e : null;
        if (str != null && str2 != null) {
            eVarB.add(new CellDetailsDelegate.Model("ID_BILL_BANK_NAME", new TextLocalisedClause(com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_country_br_review_item_bank_title, null, null, 14), new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(str2, " · ", str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        v3 v3Var2 = transactionDetailsBill.f273100c;
        BeneficiaryIdentificationType beneficiaryIdentificationType = v3Var2 != null ? v3Var2.f273116c : null;
        String strB = v3Var2 != null ? v3Var2.f273115b : null;
        if (beneficiaryIdentificationType != null && strB != null) {
            int[] iArr = d.d;
            int i2 = iArr[beneficiaryIdentificationType.ordinal()];
            if (i2 == 1) {
                i = com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_country_br_review_item_cnpj_title;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_country_br_review_item_cpf_title;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            int i3 = iArr[beneficiaryIdentificationType.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                strB = j.b(AccountFieldType.BRAZIL_CPF_ID, strB);
            }
            eVarB.add(new CellDetailsDelegate.Model("ID_BILL_TYPE", textLocalisedClause, new TextClause(strB, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        String str3 = transactionDetailsBill.f273099b;
        if (str3 != null) {
            eVarB.add(new CellDetailsDelegate.Model("ID_BILL_DUE_DATE", new TextLocalisedClause(com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_country_br_review_item_due_date_title, null, null, 14), new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        String str4 = transactionDetailsBill.f273098a;
        if (str4 != null) {
            eVarB.add(new CellDetailsNoteDelegate.Model("ID_BILL_NUMBER", new TextLocalisedClause(com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_country_br_review_item_bill_number_title, null, null, 14), null, new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        }
        String str5 = transactionDetailsBill.e;
        if (str5 != null) {
            eVarB.add(new CellDetailsDelegate.Model("ID_BILL_IDENTIFIER", new TextLocalisedClause(com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_country_br_review_item_bill_number_title, null, null, 14), new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        return u.a(eVarB);
    }

    public final Clause c(String fullString, String substring, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(fullString, "fullString");
        Intrinsics.checkNotNullParameter(substring, "substring");
        int iT = d0.T(fullString, substring, 0, false, 6);
        int length = substring.length() + iT;
        TextClause textClause = new TextClause(substring, (Style) new Custom(Integer.valueOf(i2), false, null, z, null, 246), (Integer) null, false, (o9) null, (List) null, 124);
        if (iT == 0) {
            String strSubstring = fullString.substring(length);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return yoj.b.w(textClause, new TextClause(strSubstring, (Style) new Custom(Integer.valueOf(i), false, null, z, null, 246), (Integer) null, false, (o9) null, (List) null, 124));
        }
        if (iT <= 0 || length >= fullString.length()) {
            String strSubstring2 = fullString.substring(0, iT);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            return yoj.b.w(new TextClause(strSubstring2, (Style) new Custom(Integer.valueOf(i), false, null, z, null, 246), (Integer) null, false, (o9) null, (List) null, 124), textClause);
        }
        String strSubstring3 = fullString.substring(0, iT);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        String strSubstring4 = fullString.substring(length);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        return yoj.b.w(yoj.b.w(new TextClause(strSubstring3, (Style) new Custom(Integer.valueOf(i), false, null, z, null, 246), (Integer) null, false, (o9) null, (List) null, 124), textClause), new TextClause(strSubstring4, (Style) new Custom(Integer.valueOf(i), false, null, z, null, 246), (Integer) null, false, (o9) null, (List) null, 124));
    }

    public final CellDetailsActionDelegate.Model d(a3 transaction, boolean z) {
        l lVar;
        l lVar2;
        ibd.i iVar;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        a1 a1Var = transaction.L1;
        w5 w5Var = transaction.f272624y;
        if (a1Var != a1.EXCHANGE_LEDGER) {
            if (z) {
                return new CellDetailsActionDelegate.Model("ID_EXTRAS_CONFIRMATION", new TextLocalisedClause(R$string.transaction_details_actions_confirmation, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.transactionUI_transaction_details_form_download, null, null, 14), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
            }
            if (!k.m0(transaction)) {
                d7 d7Var = transaction.S;
                if ((d7Var != null ? d7Var.f272693b : null) == null && (((lVar = w5Var.f273144b) != (lVar2 = l.SAVINGS) || ((lVar == lVar2 && !k.n0(transaction) && (!k.f(transaction) || ((iVar = transaction.C) != null && iVar.getType() != ibd.h.BILL_MONEY_BOX))) || k.k0(transaction) || k.a1(transaction))) && w5Var.f273145c != io3.i.EXTERNAL)) {
                    m1 m1Var = transaction.C1;
                    if ((m1Var != null ? m1Var.f272925b : null) != u0.WAITING_FOR_FUND_TRANSFER && !k.v1(transaction) && (transaction.f272585c1 != x1.UPI || !k.c1(transaction))) {
                        return new CellDetailsActionDelegate.Model("ID_EXTRAS_STATEMENT", new TextLocalisedClause(R$string.transaction_details_actions_statement, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.transactionUI_transaction_details_form_download, null, null, 14), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
                    }
                }
            }
        }
        return null;
    }

    public final CellDetailsDelegate.Model e(a3 transaction) {
        xi0.b bVar;
        dj0.d dVar;
        BigDecimal bigDecimal;
        h0 h0Var;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        xi0.b bVar2 = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(k.k0(transaction) ? R$string.bank_transfer_exchange_details_exchange_rate_revolut : k.l(transaction) ? R$string.transactionUI_fees_breakdown_exchange_rate : R.string.money_form_rate, null, null, 14);
        Intrinsics.checkNotNullParameter(transaction, "<this>");
        t ratesMoneyUtils = this.f298834g;
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        qd0.b languageProvider = this.f298836j;
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        boolean zC = pyd.c.C(transaction);
        l0 l0Var = transaction.Q1;
        String strD = "";
        if (!zC) {
            bVar = transaction.k.f115083b;
        } else {
            if (l0Var == null || (str2 = l0Var.f272897c.f272778b) == null) {
                m70.a.c(t0.f186434a);
                return new CellDetailsDelegate.Model("ID_EXTRAS_RATE", textLocalisedClause, new TextClause(strD, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
            }
            bVar = new xi0.b(6, str2, null);
        }
        if (!pyd.c.C(transaction)) {
            o3 o3Var = transaction.J;
            if (o3Var != null && (dVar = o3Var.f272965a) != null) {
                bVar2 = dVar.f115083b;
            }
        } else if (l0Var != null && (h0Var = l0Var.f272899h) != null && (str = h0Var.f272778b) != null) {
            bVar2 = new xi0.b(6, str, null);
        }
        if (pyd.c.C(transaction)) {
            if (l0Var == null || (bigDecimal = l0Var.f272900j) == null) {
                m70.a.c(t0.f186434a);
            }
            return new CellDetailsDelegate.Model("ID_EXTRAS_RATE", textLocalisedClause, new TextClause(strD, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        bigDecimal = new BigDecimal(String.valueOf(transaction.f272619w));
        int i = xjf.d.f306518a[transaction.e.ordinal()];
        boolean z = true;
        if (i != 1 && i != 2 && i != 3) {
            z = false;
        }
        strD = xjf.e.d(bVar, bVar2, bigDecimal, ratesMoneyUtils, languageProvider, z, false);
        return new CellDetailsDelegate.Model("ID_EXTRAS_RATE", textLocalisedClause, new TextClause(strD, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final MoneyClause g(a3 transaction, Custom custom) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        o3 o3Var = transaction.J;
        dj0.d dVarB = o3Var != null ? o3Var.f272965a : null;
        if (!kt5.b.a(transaction) || dVarB == null) {
            dVarB = p(transaction) ? transaction.k : this.e.a(TransactionApi$Toggles$AmountWithChargesMigration.f91951c) ? k.b(transaction) : transaction.N1;
        }
        dj0.d dVar = dVarB;
        return new MoneyClause(dVar, f(dVar, k.m0(transaction)), custom, null, 8);
    }

    public final MoneyClause h(a3 a3Var, Custom custom, dj0.d dVar, MoneyClause.Format format) {
        if (p(a3Var)) {
            dVar = a3Var.k;
        } else if (dVar == null) {
            dVar = this.e.a(TransactionApi$Toggles$AmountWithChargesMigration.f91951c) ? k.b(a3Var) : a3Var.N1;
        }
        dj0.d dVar2 = dVar;
        if (format == null) {
            format = f(dVar2, k.m0(a3Var));
        }
        return new MoneyClause(dVar2, format, custom, null, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.MoneyClause i(tof.a3 r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            if (r11 == 0) goto L19
            tof.v4 r11 = r10.u
            boolean r11 = r11 instanceof tof.u4
            if (r11 != 0) goto L19
            k71.o r11 = k71.k.a0(r10)
            boolean r1 = r11 instanceof k71.n
            if (r1 == 0) goto L19
            k71.n r11 = (k71.n) r11
            goto L1a
        L19:
            r11 = r0
        L1a:
            if (r11 != 0) goto L44
            com.revolut.core.ui_kit.models.Custom r1 = new com.revolut.core.ui_kit.models.Custom
            tof.v6 r11 = r10.f
            tof.v6 r0 = tof.v6.PENDING
            if (r11 != r0) goto L2d
            boolean r11 = k71.k.l(r10)
            if (r11 != 0) goto L2d
            int r11 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorGreyTone50
            goto L2f
        L2d:
            int r11 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorForeground
        L2f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            boolean r3 = k71.k.m0(r10)
            r6 = 0
            r7 = 252(0xfc, float:3.53E-43)
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.revolut.core.ui_kit.models.MoneyClause r10 = r9.g(r10, r1)
            return r10
        L44:
            boolean r1 = com.google.crypto.tink.shaded.protobuf.t1.p(r11)
            if (r1 == 0) goto L60
            com.revolut.core.ui_kit.models.Custom r2 = new com.revolut.core.ui_kit.models.Custom
            int r11 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorGreyTone50
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r7 = 0
            r8 = 252(0xfc, float:3.53E-43)
            r4 = 1
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.revolut.core.ui_kit.models.MoneyClause r10 = r9.g(r10, r2)
            return r10
        L60:
            com.revolut.core.ui_kit.models.Custom r1 = new com.revolut.core.ui_kit.models.Custom
            int r2 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorForeground
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r7 = 254(0xfe, float:3.56E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            dj0.d r11 = r11.f181792a
            com.revolut.core.ui_kit.models.MoneyClause r10 = r9.h(r10, r1, r11, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wnf.e.i(tof.a3, boolean):com.revolut.core.ui_kit.models.MoneyClause");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate.Model j(java.lang.String r19) {
        /*
            r18 = this;
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_note
            r1 = 0
            r3 = 14
            r2.<init>(r0, r1, r1, r3)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            if (r19 == 0) goto L19
            boolean r0 = kotlin.text.d0.W(r19)
            if (r0 == 0) goto L15
            goto L19
        L15:
            r0 = 2131961879(0x7f132817, float:1.9560467E38)
            goto L1b
        L19:
            int r0 = com.revolut.retail.feature.payments.money_request.core.R$string.transfer_money_edit_view_add_note
        L1b:
            r8.<init>(r0, r1, r1, r3)
            if (r19 == 0) goto L3a
            boolean r0 = kotlin.text.d0.W(r19)
            if (r0 != 0) goto L29
            r10 = r19
            goto L2a
        L29:
            r10 = r1
        L2a:
            if (r10 == 0) goto L3a
            com.revolut.core.ui_kit.models.TextClause r9 = new com.revolut.core.ui_kit.models.TextClause
            r15 = 0
            r16 = 126(0x7e, float:1.77E-43)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r4 = r9
            goto L3b
        L3a:
            r4 = r1
        L3b:
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r7 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r10 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_pencil
            int r0 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorAccent
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r16 = 0
            r17 = 246(0xf6, float:3.45E-43)
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate$Model r0 = new com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate$Model
            r12 = 0
            r13 = 128628(0x1f674, float:1.80246E-40)
            java.lang.String r1 = "ID_COMMENT"
            r3 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wnf.e.j(java.lang.String):com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate$Model");
    }

    public final CellDetailsDelegate.Model l(Clause status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new CellDetailsDelegate.Model("ID_EXTRAS_STATUS", new TextLocalisedClause(R.string.transaction_status, null, null, 14), status, 0, null, null, null, aw0.u0.LARGE, null, false, 0, 0, 32632);
    }

    public final CellDetailsDelegate.Model m(thf.a status, boolean z) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (!(z && status.f271369b) && z) {
            return null;
        }
        return l(status.f271368a);
    }

    public final CellDetailsNoteDelegate.Model n(Clause status, Clause clause) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new CellDetailsNoteDelegate.Model("ID_EXTRAS_STATUS", new TextLocalisedClause(R.string.transaction_status, null, null, 14), null, yoj.b.w(status, clause != null ? yoj.b.w(new DotDividerClause((Integer) null), clause) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, false, false, null, null, null, null, null, new c.e((qv0.h) null, 3), 0, 0, 0, 0, 8380404);
    }

    public final qv0.i o(a3 transaction, snf.b accountInfo) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        Clause clauseA = g.a(accountInfo);
        Integer numB = g.b(accountInfo);
        if (clauseA == null) {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Cannot render ", accountInfo.a()));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return null;
        }
        TextLocalisedClause textLocalisedClause = k.z(transaction) ? new TextLocalisedClause(R.string.transaction_payment_to, null, null, 14) : new TextLocalisedClause(R$string.transaction_details_state_to, null, null, 14);
        if (accountInfo.f264573c == null || numB == null) {
            return new CellDetailsDelegate.Model("ID_EXTRAS_TO_ITEM", textLocalisedClause, clauseA, 0, null, null, null, aw0.u0.LARGE, numB != null ? new ResourceImage(numB.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, false, 0, 0, 32120);
        }
        return new CellDetailsActionDelegate.Model("ID_EXTRAS_TO_ITEM", textLocalisedClause, 0, new ResourceImage(numB.intValue(), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), clauseA, null, false, true, aw0.u0.LARGE, null, accountInfo.f264573c, 0, 0, 0, 0, 4191844);
    }

    public final boolean p(a3 a3Var) {
        if (this.e.a(TransactionApi$Toggles$AmountWithChargesMigration.f91951c)) {
            return k.S0(a3Var) || k.G0(a3Var) || k.J0(a3Var);
        }
        return false;
    }
}
