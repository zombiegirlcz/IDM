package b8d;

import aw0.c7;
import aw0.ka;
import aw0.o9;
import aw0.x4;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.impl.ui.account.creditcard.mappers.CreditCardAdministrationFeeMapper;
import com.revolut.feature.credit.impl.ui.account.creditcard.mappers.CreditCardStatementSectionMapper;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.payments.air.widget.impl.model.TransferWidgetDetails;
import com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient;
import com.revolut.feature.payments.air.widget.impl.ui.chat.ResolvedRecipient;
import com.youTransactor.uCube.rpc.Constants;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import mx0.v5;
import pij.d1;
import tof.i1;
import tof.r9;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13160b;

    public /* synthetic */ f0(Object obj2, int i) {
        this.f13159a = i;
        this.f13160b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v24, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6, types: [java.lang.Number, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r4v51, types: [aim.e, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v64, types: [aim.e, java.util.List] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List listL;
        List listA;
        List list;
        Object objG;
        List listA2;
        hg hgVar;
        ActionWidgetDelegate.Model model;
        Flow flowB;
        Flow flowI;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        int i = this.f13159a;
        int i2 = 8;
        int i3 = 10;
        int i5 = 12;
        ?? r132 = 0;
        int i6 = 14;
        Object obj5 = this.f13160b;
        switch (i) {
            case 0:
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter((aj0.c) obj2, "<unused var>");
                return (Data) obj5;
            case 1:
                List pairs = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pairs, "pairs");
                return rd0.e.b(((ppk.f) ((r10.v) obj5).f250864c).e(pairs, n9l.b.SEC_3));
            case 2:
                x15.h account = (x15.h) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(account, "model");
                kpj.f fVar = ((k25.u) obj5).f180359r;
                Intrinsics.checkNotNullParameter(account, "account");
                boolean z = account instanceof x15.f;
                if (z) {
                    m25.n nVar = (m25.n) fVar.f188258b;
                    List<gl4.a> boletos = ((x15.f) account).u;
                    Intrinsics.checkNotNullParameter(boletos, "boletos");
                    ArrayList arrayList = new ArrayList();
                    for (gl4.a aVar : boletos) {
                        long jH = oc.c.h(((l80.f) nVar.f201711a).e(), aVar.f144555c) + 1;
                        ?? ValueOf = jH > 0 ? Long.valueOf(jH) : r132;
                        if (ValueOf != 0) {
                            String str = "id_credit_card_boleto_widget_" + aVar.f;
                            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_card_account_widget_boleto_title, r132, r132, i6);
                            TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.credit_card_account_widget_boleto_expiry, (Number) ValueOf, zhm.u.c(ValueOf), new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 8);
                            com.revolut.core.ui_kit.delegates.m mVar = new com.revolut.core.ui_kit.delegates.m(LayeredImage.INSTANCE.k(R$drawable.uikit_icn_24_scan_card, R$attr.uikit_colorWhite, R$attr.uikit_colorAccent), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10);
                            MoneyClause moneyClauseB = sx4.f.b(3, null, null, aVar.f144554b);
                            m70.a.c(t0.f186434a);
                            model = new ActionWidgetDelegate.Model(str, textLocalisedClause3, textLocalisedQuantityClause, mVar, new com.revolut.core.ui_kit.delegates.p(moneyClauseB, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new com.revolut.core.ui_kit.delegates.k(new TextLocalisedClause(R$string.credit_card_account_widget_boleto_action_details, null, null, 14), new TextLocalisedClause(R$string.credit_common_cancel, null, null, 14), null, null, Constants.TAG_FC_SPEED_MODE), com.revolut.core.ui_kit.delegates.q.REGULAR, new m25.m(aVar.f144553a), null, false, 7936);
                        } else {
                            model = null;
                        }
                        if (model != null) {
                            arrayList.add(model);
                        }
                        r132 = 0;
                        i6 = 14;
                    }
                    List list2 = (List) ue0.e.M(arrayList);
                    if (list2 != null) {
                        hgVar = new hg("id_credit_card_boleto_widget", list2, 1, x4.c.f10604a, null, new gg.b(false, 3), false, false, null, null, 0, 0, 0, 0, 32720);
                        int i21 = R$attr.uikit_dp8;
                        int i22 = R$attr.uikit_dp0;
                        yp0.b.p(hgVar, i21, i21, i22, i22);
                    } else {
                        hgVar = null;
                    }
                    listL = zhm.v.l(hgVar);
                } else {
                    if (!(account instanceof x15.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listL = zhm.f0.f322471a;
                }
                Intrinsics.checkNotNullParameter(account, "account");
                if (z) {
                    aim.e eVarB = zhm.u.b();
                    x15.f account2 = (x15.f) account;
                    if (!account2.v) {
                        Intrinsics.checkNotNullParameter(account2, "account");
                        boolean z3 = account2.f302259g;
                        long j2 = account2.f302264n.f115082a;
                        dj0.d dVar = account2.o;
                        String str2 = account2.f302256a;
                        CreditCardAutopayPayments creditCardAutopayPayments = account2.d;
                        if (z3) {
                            listA2 = zhm.u.c(new RowDelegate.Model("id_statement_first_statement", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D001", null, null, null, 30), null, null, false, null, false, 60), new TextLocalisedClause(R$string.credit_card_account_statement_first_statement, zhm.u.c(com.revolut.core.ui_kit.models.j.b(c7.Companion, account2.i, new LocalDateClause$DateFormat.DayAndMonth(0))), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
                        } else {
                            xw4.a aVar2 = account2.e;
                            if (aVar2 == xw4.a.OVERDUE) {
                                aim.e eVarB2 = zhm.u.b();
                                eVarB2.add(CreditCardStatementSectionMapper.f(account2));
                                wi0.b bVar = account2.f302258c;
                                int i32 = account2.f302270w;
                                wi0.b.Companion.getClass();
                                n14.e.b(eVarB2, (!Intrinsics.f(bVar, wi0.b.O) || i32 <= 0) ? null : CreditCardStatementSectionMapper.d(new TextLocalisedClause(R$string.credit_card_account_statement_days_past_due_value, zhm.u.c(Integer.valueOf(i32)), null, 12), new TextLocalisedClause(R$string.credit_card_account_statement_days_past_due, null, null, 14), "ID_DAYS_PAST_DUE"));
                                CreditCardStatementSectionMapper.a(eVarB2, account2);
                                eVarB2.add(CreditCardStatementSectionMapper.g(account2));
                                eVarB2.addAll(CreditCardStatementSectionMapper.b(creditCardAutopayPayments, str2));
                                listA2 = zhm.u.a(eVarB2);
                            } else if (aVar2 == xw4.a.TERMINATED) {
                                aim.e eVarB3 = zhm.u.b();
                                eVarB3.add(CreditCardStatementSectionMapper.d(sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, dVar), new TextLocalisedClause(R$string.credit_common_total_to_repay, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), "id_statement_total_to_repay"));
                                eVarB3.add(CreditCardStatementSectionMapper.d(sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, dVar), new TextLocalisedClause(R$string.credit_card_common_outstanding_balance, null, null, 14), "id_statement_outstanding_balance"));
                                eVarB3.add(CreditCardStatementSectionMapper.d(sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, account2.f302265p), new TextLocalisedClause(R$string.credit_common_accrued_interest, null, null, 14), "id_statement_accrued_interest"));
                                listA2 = zhm.u.a(eVarB3);
                            } else if (aVar2 == xw4.a.LIMIT_EXCEEDED) {
                                aim.e eVarB4 = zhm.u.b();
                                eVarB4.add(CreditCardStatementSectionMapper.f(account2));
                                CreditCardStatementSectionMapper.a(eVarB4, account2);
                                eVarB4.add(CreditCardStatementSectionMapper.g(account2));
                                eVarB4.addAll(CreditCardStatementSectionMapper.b(creditCardAutopayPayments, str2));
                                listA2 = zhm.u.a(eVarB4);
                            } else if (account2.f302260h) {
                                aim.e eVarB5 = zhm.u.b();
                                eVarB5.add(CreditCardStatementSectionMapper.f(account2));
                                CreditCardStatementSectionMapper.a(eVarB5, account2);
                                eVarB5.add(CreditCardStatementSectionMapper.g(account2));
                                eVarB5.addAll(CreditCardStatementSectionMapper.b(creditCardAutopayPayments, str2));
                                listA2 = zhm.u.a(eVarB5);
                            } else {
                                CellDetailsDelegate.Model modelF = j2 > 0 ? CreditCardStatementSectionMapper.f(account2) : null;
                                boolean z4 = j2 == 0;
                                if (z4) {
                                    objG = CreditCardStatementSectionMapper.e(new TextLocalisedClause(R$string.credit_management_remaining_dot_value, zhm.u.c(com.revolut.core.ui_kit.models.j.b(c7.Companion, account2.f302261j, new LocalDateClause$DateFormat.Month(ka.SHORT))), null, 12), "id_statement_statement");
                                } else {
                                    if (z4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    objG = CreditCardStatementSectionMapper.g(account2);
                                }
                                aim.e eVarB6 = zhm.u.b();
                                n14.e.b(eVarB6, modelF);
                                if (account2.f302269t) {
                                    eVarB6.add(CreditCardStatementSectionMapper.e(new TextLocalisedClause(R$string.credit_management_minimum, null, null, 14), "id_statement_minimum"));
                                }
                                eVarB6.add(objG);
                                eVarB6.addAll(CreditCardStatementSectionMapper.b(creditCardAutopayPayments, str2));
                                listA2 = zhm.u.a(eVarB6);
                            }
                        }
                        List list3 = listA2;
                        yp0.b.k(list3, 0, 0, 0, 0, 31);
                        eVarB.addAll(list3);
                    }
                    x15.a content = account2.f302263m;
                    if (content != null) {
                        int i33 = content.f302244c;
                        ll4.a aVar3 = content.f302242a;
                        Intrinsics.checkNotNullParameter(content, "content");
                        if (aVar3.f196500b == 0) {
                            list = zhm.f0.f322471a;
                        } else {
                            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_management_monthly_fee, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
                            MoneyClause moneyClause = new MoneyClause(new dj0.d(i33 >= aVar3.f196500b ? 0L : aVar3.f196499a, content.f302243b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                            int i43 = aVar3.f196500b;
                            Object[] elements = {new CellDetailsDelegate.Model("id_administration_fee_info", textLocalisedClause4, moneyClause, null, resourceImage, true, 0, null, new CreditCardAdministrationFeeMapper.AdministrationFeeInfoParcel(i43), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008), new PlainTextDelegate.Model("id-administration-fee-status", (Clause) null, i33 >= aVar3.f196500b ? new CompositeClause(zhm.v.k(new ImageClause(R$drawable.uikit_icn_16_check_circle, Integer.valueOf(R$attr.uikit_colorGreen), (Float) null, (Float) null, 28), new TextLocalisedClause(R$string.credit_management_n_transactions_made_to_waive_fee, zhm.u.c(Integer.valueOf(i43)), new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254), 8)), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12) : new TextLocalisedClause(R$string.credit_management_make_n_transactions_to_waive_fee, zhm.u.c(Integer.valueOf(i43)), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 61422), i33 >= aVar3.f196500b ? null : new VaultsProgressDelegate.Model("id-administration-fee-progress", null, null, null, null, null, null, null, false, (int) ((i33 / i43) * 100), null, false, null, null, 8384510), i33 >= aVar3.f196500b ? null : new CellDetailsDelegate.Model("id-administration-fee-transactions", new TextLocalisedClause(R$string.credit_common_transactions, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextClause(a0.d.i(i33, "/", i43), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, R$attr.uikit_dp0, R$attr.uikit_dp16, 26616)};
                            Intrinsics.checkNotNullParameter(elements, "elements");
                            List listL2 = kotlin.collections.d.L(elements);
                            yp0.b.k(listL2, 0, 0, 0, 0, 31);
                            list = listL2;
                        }
                        eVarB.addAll(list);
                    }
                    listA = zhm.u.a(eVarB);
                } else {
                    if (!(account instanceof x15.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listA = zhm.f0.f322471a;
                }
                return new k25.c(listL, listA);
            case 3:
                vu3.p content2 = (vu3.p) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                return new zfe.c(o25.e.b(content2, (String) obj5), o25.e.a(content2));
            case 4:
                PaymentWidget widget = (PaymentWidget) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(widget, "widget");
                com.revolut.feature.payments.air.widget.impl.ui.chat.b bVar2 = (com.revolut.feature.payments.air.widget.impl.ui.chat.b) obj5;
                oo9.a aVar4 = widget.f79073b;
                TransferWidgetDetails transferWidgetDetails = widget.f79074c;
                int i59 = po9.o.f237925a[aVar4.ordinal()];
                if (i59 == 1) {
                    po9.x xVar = bVar2.o;
                    String widgetId = bVar2.c3().f310974a;
                    xVar.getClass();
                    Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    String str3 = transferWidgetDetails.d;
                    if (str3 == null) {
                        flowB = new go.g(new po9.t(widgetId, new po9.f(new Data(null, new IllegalArgumentException("Transaction id is missing"), false, 5, null))), 2);
                    } else {
                        efm.r rVarL = ((mjf.b0) xVar.f237941a).l(new r9(str3), zhm.u.c(i1.f272794a), 1, TransactionsSort.STARTED_DATE_DESC, new TransactionContext(new Priority.HIGH("AIR payment widget"), null, 2));
                        efm.r map = ((njf.j) xVar.f237942b).f().map(new pjg.i(new pnh.a0(13), 29));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        efm.r map2 = nim.a.w(kli.a.h(rVarL, map), new pnh.a0(i6)).map(new po9.w(i, new pig.y(widgetId, i2)));
                        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                        flowB = rd0.e.b(map2);
                    }
                    return new vkm.y(new pnf.f(bVar2, 0 == true ? 1 : 0, 6), flowB);
                }
                if (i59 != 2 && i59 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.payments.air.widget.impl.ui.chat.c cVar = bVar2.f79117n;
                String widgetId2 = bVar2.c3().f310974a;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(widgetId2, "widgetId");
                Intrinsics.checkNotNullParameter(widget, "widget");
                WidgetRecipient recipient = transferWidgetDetails.f79077a;
                Intrinsics.checkNotNullParameter(recipient, "recipient");
                if (recipient instanceof WidgetRecipient.P2P) {
                    cl3.a aVar5 = cVar.f79122a;
                    String str4 = ((WidgetRecipient.P2P) recipient).f79097a;
                    efm.r rVarDefaultIfEmpty = ((wl3.h) aVar5).f(str4).n().map(new pjg.i(new pnh.a0(9), 27)).onErrorReturn(new pjg.i(new pnh.a0(i3), 28)).defaultIfEmpty(new Data(null, new NoSuchElementException("Contact not found by revtag: ".concat(str4)), false, 5, null));
                    Intrinsics.checkNotNullExpressionValue(rVarDefaultIfEmpty, "defaultIfEmpty(...)");
                    flowI = rd0.e.b(rVarDefaultIfEmpty);
                } else if (recipient instanceof WidgetRecipient.ExistingBeneficiary) {
                    flowI = rd0.e.b(nim.a.w(cVar.f79123b.j(((WidgetRecipient.ExistingBeneficiary) recipient).f79085a, w4l.h.f294642c), new pnh.a0(11)));
                } else if (recipient instanceof WidgetRecipient.NewBeneficiary) {
                    flowI = zi0.c.i(new ResolvedRecipient.NewBeneficiary((WidgetRecipient.NewBeneficiary) recipient));
                } else if (recipient instanceof WidgetRecipient.ExistingCard) {
                    flowI = rd0.e.b(nim.a.w(cVar.f79124c.b(((WidgetRecipient.ExistingCard) recipient).f79087a), new pnh.a0(i5)));
                } else {
                    if (!(recipient instanceof WidgetRecipient.NewCard)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    flowI = zi0.c.i(new ResolvedRecipient.NewCard((WidgetRecipient.NewCard) recipient));
                }
                return new dfj.m0(nim.a.v(flowI, new d1(widget, 26)), widgetId2, 2);
            default:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Loan loan = (Loan) pair.f186385a;
                List repayments = (List) pair.f186386b;
                w25.h hVar = ((u25.i) obj5).d;
                Intrinsics.checkNotNullParameter(loan, "loan");
                Intrinsics.checkNotNullParameter(repayments, "repayments");
                if (loan.i instanceof LoanState.Planned) {
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.credit_loan_account_action_pending_title, null, null, 14);
                    LocalDate expectedDate = loan.f70111g;
                    Intrinsics.checkNotNullParameter(expectedDate, "expectedDate");
                    long jBetween = ChronoUnit.DAYS.between(LocalDate.now(), expectedDate);
                    if (jBetween == 0) {
                        textLocalisedClause2 = new TextLocalisedClause(R$string.loans_home_delayed_disbursal_description_today, null, null, 14);
                    } else {
                        if (jBetween != 1) {
                            textLocalisedClause = new TextLocalisedClause(R$string.loans_home_delayed_disbursal_description_days, zhm.v.k(Long.valueOf(jBetween), com.revolut.core.ui_kit.models.j.b(c7.Companion, expectedDate, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT))), null, 12);
                            ActionWidgetDelegate.Model model2 = new ActionWidgetDelegate.Model("SEE_DETAILS", textLocalisedClause5, textLocalisedClause, new com.revolut.core.ui_kit.delegates.m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D271", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6), null, new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(R$string.credit_loan_account_action_pending_button, null, null, 14), null, 14), com.revolut.core.ui_kit.delegates.q.REGULAR, null, null, false, 8080);
                            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                            return zhm.u.c(model2);
                        }
                        textLocalisedClause2 = new TextLocalisedClause(R$string.loans_home_delayed_disbursal_description_tomorrow, null, null, 14);
                    }
                    textLocalisedClause = textLocalisedClause2;
                    ActionWidgetDelegate.Model model22 = new ActionWidgetDelegate.Model("SEE_DETAILS", textLocalisedClause5, textLocalisedClause, new com.revolut.core.ui_kit.delegates.m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D271", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6), null, new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(R$string.credit_loan_account_action_pending_button, null, null, 14), null, 14), com.revolut.core.ui_kit.delegates.q.REGULAR, null, null, false, 8080);
                    yp0.b.l(model22, 0, 0, 0, 0, null, false, 63);
                    return zhm.u.c(model22);
                }
                ?? B = zhm.u.b();
                q35.j jVar = loan.f70120s;
                b95.a aVar6 = loan.o;
                ?? B2 = zhm.u.b();
                i = jVar != null ? 1 : 0;
                int i66 = i == 0 ? 2 : 1;
                if (i != 0) {
                    B2.add(((c55.p) hVar.f293948a).a(jVar, aVar6));
                }
                List listV0 = zhm.d0.V0(repayments, i66);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(listV0, 10));
                Iterator it8 = listV0.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((c55.c0) hVar.f293949b).a((q35.e0) it8.next(), aVar6));
                }
                B2.addAll(arrayList2);
                if (repayments.size() > i66) {
                    B2.add(new LargeActionButtonDelegate.Model("SEE_ALL_REPAYMENTS", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.credit_loan_account_see_all_repayments, null, null, 14), false, null, null, null, null, 1000));
                }
                aim.e eVarA = zhm.u.a(B2);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                B.addAll(eVarA);
                return zhm.u.a(B);
        }
    }

    public f0(o25.i iVar, String str) {
        this.f13159a = 3;
        this.f13160b = str;
    }
}
