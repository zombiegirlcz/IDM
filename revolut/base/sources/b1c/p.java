package b1c;

import android.os.Parcelable;
import aw0.db;
import aw0.ka;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import aw0.u0;
import bai.q;
import bof.r;
import bs9.l0;
import bs9.x;
import c55.n0;
import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.a0;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.alipay.impl.ui.qr.showcode.modal.AlipayPlusExpandedCodeScreenContract$InputData;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.feature.bank_transfer.models.PaymentVendorCorridor;
import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.messaging.data.api.model.GroupChatItem;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$InputData;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import dx4.e1;
import dx4.x4;
import ip0.ak0;
import ip0.ck0;
import ip0.n30;
import ip0.pb0;
import ip0.qc;
import ip0.qe0;
import ip0.tc;
import ip0.we0;
import ip0.xc;
import ip0.xk;
import ip0.y7;
import ip0.yj0;
import ip0.yt;
import ip0.zj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ms0.h4;
import mx0.f3;
import mx0.h3;
import org.jmrtd.cbeff.ISO781611;
import org.joda.time.LocalDate;
import q35.c0;
import q35.d0;
import q35.e0;
import qv0.c;
import r10.t;
import wp5.y;
import xo0.b;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11794c;

    public /* synthetic */ p(Object obj2, Object obj3, int i) {
        this.f11792a = i;
        this.f11793b = obj2;
        this.f11794c = obj3;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        b85.l lVar = (b85.l) this.f11793b;
        b85.f fVar = (b85.f) this.f11794c;
        od0.i sepaAccount = (od0.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(sepaAccount, "sepaAccount");
        LoanDetails loanDetails = fVar.f13096a;
        e0 e0Var = fVar.f13097b;
        String str = fVar.f13098c;
        x35.e eVar = (x35.e) sepaAccount.f224257a;
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_repayment_status, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.loan_management_repayment_status_completed, null, null, 14);
        u0 u0Var = u0.LARGE;
        List listC = u.c(new CellDetailsDelegate.Model("repayment-status-id", textLocalisedClause, textLocalisedClause2, 0, null, null, null, u0Var, null, false, 0, 0, 32632));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        eVarB.addAll(listC);
        String str2 = e0Var.f;
        Clause textLocalisedClause3 = (str2 == null || str2.equals(str)) ? new TextLocalisedClause(R$string.loan_management_repayment_made_by_you, null, null, 14) : new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(e0Var.f241807g, " ", e0Var.f241808h), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        xi0.b bVar = e0Var.d.f115083b;
        c45.b bVar2 = lVar.f13112c;
        aim.e eVarB2 = u.b();
        if (eVar != null) {
            CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("payment-from", new t0((Clause) new TextLocalisedClause(R$string.loan_management_transaction_payment_from, null, null, 14), (Image) null, 0, false, 30), bVar2.g(eVar), null, null, null, u0Var, 0, bVar2.d(eVar), false, false, null, null, 31480);
            u0Var = u0Var;
            eVarB2.add(model);
        } else {
            eVarB2.add(new CellDetailsDelegate.Model("payment-from", new TextLocalisedClause(R$string.loan_management_transaction_payment_from, null, null, 14), new TextLocalisedClause(R$string.loan_transaction_account_from, u.c(bVar.f306286a), null, 12), 0, null, null, null, u0Var, null, false, 0, 0, 32632));
        }
        eVarB2.add(new CellDetailsDelegate.Model("payment-made-by", new TextLocalisedClause(R$string.loan_management_repayment_made_by, null, null, 14), textLocalisedClause3, 0, null, null, null, u0Var, null, false, 0, 0, 32632));
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        aim.e eVarB3 = u.b();
        int i3 = b85.k.f13108a[loanDetails.f70144a.o.ordinal()];
        if (i3 == 1 || i3 == 2) {
            i = R$string.loan_management_transaction_loan;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.loan_management_transaction_mortgage;
        }
        eVarB3.add(new CellDetailsDelegate.Model("loan-name-list-id", new TextLocalisedClause(i, null, null, 14), ((n0) lVar.f13111b).d(loanDetails), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        dj0.d dVar = e0Var.i;
        if (dVar != null) {
            eVarB3.add(new CellDetailsDelegate.Model("repayment-principal-amount-id", new TextLocalisedClause(R$string.loan_management_repayment_principal, null, null, 14), sx4.f.b(3, null, null, dVar), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        dj0.d dVar2 = e0Var.f241809j;
        if (dVar2 != null) {
            eVarB3.add(new CellDetailsDelegate.Model("accrued-interest-amount-id", new TextLocalisedClause(R$string.loan_management_repayment_accrued_interest, null, null, 14), sx4.f.b(3, null, null, dVar2), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        dj0.d dVar3 = e0Var.k;
        if (dVar3 != null) {
            eVarB3.add(new CellDetailsDelegate.Model("late-repayment-interest-amount-id", new TextLocalisedClause(R$string.loan_management_repayment_late_repayment_interest, null, null, 14), sx4.f.b(3, null, null, dVar3), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        aim.e eVarA2 = u.a(eVarB3);
        yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA2);
        d0 d0Var = e0Var.e;
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.loan_management_repayment_type, null, null, 14);
        int i5 = b85.k.f13109b[d0Var.ordinal()];
        if (i5 == 1) {
            i2 = R$string.loan_management_repayment_payment_type_automatic;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.loan_management_repayment_payment_type_manual;
        }
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("repayment-type-id", textLocalisedClause4, new TextLocalisedClause(i2, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.addAll(u.c(model2));
        if (e0Var.f241810l == c0.DIRECT_DEBIT) {
            List listK = v.k(new CellDetailsDelegate.Model("transfer-type_id", new t0((Clause) new TextLocalisedClause(R$string.loan_management_repayment_transfer_type, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.loan_management_repayment_transfer_type_direct_debit, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsChevronDelegate.Model("MANAGE_DIRECT_DEBIT_ID", new TextLocalisedClause(R$string.loan_management_repayment_manage_direct_debit, null, null, 14), f2.INTERNAL, 0, null, null, 2040));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            eVarB.addAll(listK);
        }
        CellDetailsChevronDelegate.Model model3 = new CellDetailsChevronDelegate.Model("REPORT_ISSUE_ID", new TextLocalisedClause(R$string.loan_management_repayment_report_an_issue, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        eVarB.addAll(u.c(model3));
        return u.a(eVarB);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        List listK;
        Clause textClause;
        TextClause textClause2;
        ac4.g gVar = (ac4.g) this.f11793b;
        b8e.i iVar = (b8e.i) this.f11794c;
        b8e.h model = (b8e.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        c8e.b bVar = (c8e.b) gVar.f3031b;
        aim.e eVarB = u.b();
        Subaccount subaccount = model.f13208a;
        if (subaccount instanceof Subaccount.Teen) {
            c8e.c cVar = (c8e.c) bVar;
            listK = v.k(cVar.b(subaccount), cVar.c(subaccount), cVar.a(subaccount));
        } else if (subaccount instanceof Subaccount.Junior) {
            c8e.c cVar2 = (c8e.c) bVar;
            listK = v.k(cVar2.b(subaccount), cVar2.c(subaccount));
        } else {
            c8e.c cVar3 = (c8e.c) bVar;
            listK = v.k(cVar3.c(subaccount), cVar3.a(subaccount));
        }
        List list = listK;
        yp0.b.k(list, 0, 0, 0, 0, 31);
        eVarB.addAll(list);
        ((c8e.c) bVar).getClass();
        CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("SUBACCOUNT_DETAILS_ITEM_REPORT_BUG_ID", new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.subaccounts_details_settings_report_issue, null, null, 14), 0, true, null, null, null, 2036);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        Subaccount subaccount2 = model.f13208a;
        Intrinsics.checkNotNullParameter(subaccount2, "subaccount");
        CellDetailsChevronDelegate.Model model3 = new CellDetailsChevronDelegate.Model("SUBACCOUNT_DETAILS_ITEM_FAQ_ID", new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.subaccounts_details_settings_faq, null, null, 14), 0, true, subaccount2, null, null, 2020);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model3);
        ArrayList arrayListE0 = zhm.d0.E0(zjh.j.v((zjh.j) gVar.f3032c, iVar.f13212b), u.a(eVarB));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.subaccounts_details_header_title, null, null, 14);
        Subaccount subaccount3 = model.f13208a;
        b8e.d dVar = model.d;
        if ((subaccount3 instanceof Subaccount.Group) || (subaccount3 instanceof Subaccount.Personal) || (subaccount3 instanceof Subaccount.Joint) || (subaccount3 instanceof Subaccount.Pro) || (subaccount3 instanceof Subaccount.ProTax)) {
            textClause = new TextClause(subaccount3.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else if (subaccount3 instanceof Subaccount.Junior) {
            b8e.e eVar = dVar instanceof b8e.e ? (b8e.e) dVar : null;
            if (eVar != null) {
                textClause = new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.subaccounts_details_subtitle_junior, u.c(eVar.f13206a.f77099b), null, 12);
            } else {
                textClause2 = new TextClause(subaccount3.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                textClause = textClause2;
            }
        } else {
            if (!(subaccount3 instanceof Subaccount.Teen)) {
                throw new NoWhenBranchMatchedException();
            }
            b8e.f fVar = dVar instanceof b8e.f ? (b8e.f) dVar : null;
            if (fVar != null) {
                textClause = new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.subaccounts_details_subtitle_teen, u.c(fVar.f13207a.f90335b), null, 12);
            } else {
                textClause2 = new TextClause(subaccount3.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                textClause = textClause2;
            }
        }
        return new b8e.j(textClause, textLocalisedClause, arrayListE0);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        dj0.d dVarJ;
        b9c.i iVar = (b9c.i) this.f11793b;
        b9c.e eVar = (b9c.e) this.f11794c;
        t7c.a paymentDetails = (t7c.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        paymentDetails.getClass();
        TextClause textClause = new TextClause("Proper Barber", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause("@ProperBarber", (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122);
        TextClause textClause3 = new TextClause(eVar.f13702a.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        w80.b bVar = iVar.f13708a;
        dj0.d dVar = eVar.f13703b;
        String strE = bVar.e(dVar);
        long j2 = dVar.f115082a;
        xi0.b bVar2 = eVar.f13702a;
        bw0.h hVar = new bw0.h(strE, cp5.d.J(bVar2), true, null, Boolean.TRUE, false, false, false, false, null, 6100);
        io3.d dVarY = hb9.b.y(eVar);
        if (dVarY != null) {
            dVarJ = z92.f.j(dVarY);
        } else {
            dj0.d.Companion.getClass();
            dVarJ = dj0.d.d;
        }
        dj0.d dVar2 = dVarJ;
        AmountEditDelegate.Model model = new AmountEditDelegate.Model("AMOUNT_EDIT_DELEGATE_LIST_ID", textClause3, hVar, null, null, new bw0.m(new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_in_store_pay_merchant_balance, u.c(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), j2 > dVar2.f115082a ? bw0.l.ERROR : bw0.l.INFO, new ResourceImage(R$drawable.uikit_icn_16_chevron_down_small, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, null, 16), null, true, new b9c.d(((s80.b) iVar.f13709b).b(), bVar2), null, 1560);
        yp0.b.r(model, R$attr.uikit_dp24, R$attr.uikit_dp16, 0, 0, 12);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("CASHBACK_ROW_DELEGATE_LIST_ID", new CompositeClause(v.k(new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_in_store_pay_merchant_cashback, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new DotDividerClause((Integer) null), new TextClause("10%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14), false, new MoneyClause(new dj0.d(Math.min((long) ((j2 / 100.0f) * 10), 1000L), bVar2), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorTeal), false, db.EMPHASIS2, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), null, 8), null, null, null, false, null, null, 0, 134217628);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        List listK = v.k(model, model2);
        dj0.d.Companion.getClass();
        dj0.d dVar3 = dj0.d.e;
        return new b9c.g(textClause, textClause2, listK, dVar.f(dVar3), dVar.f(dVar3) ? new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_pay_amount, u.c(new MoneyClause(dj0.d.c(dVar, 0L, bVar2, 1), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_common_action_pay, null, null, 14));
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        List list;
        List listK;
        List listF0;
        q qVar = (q) this.f11793b;
        bai.i iVar = (bai.i) this.f11794c;
        List termsList = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(termsList, "termsList");
        List list2 = termsList;
        ArrayList arrayListF1 = zhm.d0.f1(list2);
        AcceptBankTermsScreenContract$InputData acceptBankTermsScreenContract$InputData = qVar.f14110a;
        if (arrayListF1.isEmpty()) {
            listF0 = q.b();
            list = list2;
        } else {
            wi0.b countryCode = acceptBankTermsScreenContract$InputData.f97486a.getF97483a();
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            wi0.b.Companion.getClass();
            if (Intrinsics.f(countryCode, wi0.b.f297770q3)) {
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_insurance, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                yt ytVar = yt.TOP;
                list = list2;
                listK = v.k(new ListCellDelegate.Model("DEPOSIT_PROTECTION_DISCLOSURE_ID", new j8(resourceImage, ytVar), new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_disclosure_deposit_protection_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_disclosure_deposit_protection_text, u.c(new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_disclosure_deposit_protection_link, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "DEPOSIT_PROTECTION_DISCLOSURE_US_CLICK_ID", false), 10)), null, 12), false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("CREDIT_REPORT_AUTHORIZATION_DISCLOSURE_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_disclosure_credit_report_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_disclosure_credit_report_text, u.c(new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_disclosure_credit_report_link, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "CREDIT_REPORT_AUTHORIZATION_DISCLOSURE_US_CLICK_ID", false), 10)), null, 12), false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("CARD_ISSUING_DISCLOSURE_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_disclosure_card_issuing_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_disclosure_card_issuing_text, null, null, 14), false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("PERSONAL_AGREEMENTS_DISCLOSURE_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_disclosure_personal_agreements_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_disclosure_personal_agreements_text_v2, v.k(new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_disclosure_personal_agreements_link_privacy_policy_lead_bank, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "LEAD_BANK_PRIVACY_POLICY_DISCLOSURE_US_CLICK_ID", false), 10), new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_disclosure_personal_agreements_link_privacy_notice, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "PRIVACY_NOTICE_DISCLOSURE_US_CLICK_ID", false), 10), new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_disclosure_personal_agreements_link_privacy_policy_cross_river_bank, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "PRIVACY_POLICY_DISCLOSURE_US_CLICK_ID", false), 10)), null, 12), false, null, null, 0, 0, 0, 0, 4064));
                yp0.b.k(listK, R$attr.uikit_dp0, R$attr.uikit_dp32, 0, 0, 28);
            } else {
                list = list2;
                listK = f0.f322471a;
            }
            List list3 = listK;
            ArrayList arrayList = new ArrayList(w.t(arrayListF1, 10));
            Iterator it8 = arrayListF1.iterator();
            while (it8.hasNext()) {
                arrayList.add(q.a((Terms) it8.next()));
            }
            int i = R$attr.uikit_dp16;
            yp0.b.k(arrayList, i, i, 0, 0, 28);
            ArrayList arrayListE0 = zhm.d0.E0(arrayList, list3);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            bai.h hVar = iVar.f14101b;
            boolean z = hVar.f14098b;
            boolean z3 = hVar.f14097a;
            if (z) {
                arrayList2.add(new ListSubheaderDelegate.Model("LIST_SUB_HEADER_DELEGATE_ID", (Image) null, (Clause) new TextLocalisedClause(R.string.account_terms_basic_account_row_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                arrayList3.add(new RowDelegate.Model("BASIC_ACCOUNT_TOGGLE_LIST_ITEM_ID", null, new TextLocalisedClause(R.string.account_terms_basic_account_row_title, null, null, 14), null, 0, new TextLocalisedClause(R.string.account_terms_basic_account_row_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, 0, new vf(z3, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867802));
                if (z3) {
                    Terms terms = hVar.f14099c;
                    if (terms == null) {
                        throw new IllegalStateException("Basic account shouldn't be null at this point");
                    }
                    arrayList3.add(q.a(terms));
                }
                yp0.b.k(arrayList3, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
            }
            ArrayList arrayListE02 = zhm.d0.E0(zhm.d0.E0(arrayList3, arrayList2), arrayListE0);
            wi0.b f97483a = acceptBankTermsScreenContract$InputData.f97486a.getF97483a();
            wi0.b.Companion.getClass();
            listF0 = zhm.d0.F0(new TextDelegate.Model("TERMS_NOTICE_ID", Intrinsics.f(f97483a, wi0.b.f297756l) ? new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.signup_bank_terms_notice_text_au, null, null, 14) : Intrinsics.f(f97483a, wi0.b.p0) ? new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.signup_bank_terms_notice_text_uk, null, null, 14) : Intrinsics.f(f97483a, wi0.b.O0) ? new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.signup_bank_terms_notice_text_in, null, null, 14) : Intrinsics.f(f97483a, wi0.b.D2) ? new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.signup_bank_terms_notice_text_ro, null, null, 14) : Intrinsics.f(f97483a, wi0.b.f297770q3) ? new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.terms_lead_notice_text, null, null, 14) : Intrinsics.f(f97483a, wi0.b.f297740e0) ? new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.signup_bank_terms_notice_text_ee, null, null, 14) : new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.signup_bank_terms_notice_text, null, null, 14), false, new ak0(yj0.CENTER_HORIZONTAL, null, 2), null, null, 0, 0, 0, 0, 2036), arrayListE02);
        }
        return qVar.d(listF0, !list.isEmpty(), true);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        List listC;
        Object obj5;
        bba.u uVar = (bba.u) this.f11793b;
        bba.d dVar = (bba.d) this.f11794c;
        List beneficiaries = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        aim.e eVarB = u.b();
        hp.g gVar = uVar.f14223b;
        Collection collection = (List) dVar.f14200a.getContent();
        if (collection == null) {
            collection = f0.f322471a;
        }
        String str = dVar.f14201b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        PixIdentifiedType pixIdentifiedTypeA = gVar.a(str2);
        if (collection.isEmpty()) {
            if (pixIdentifiedTypeA != null) {
                listC = u.c(new RowDelegate.Model("SEND_KEY_LIST_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_logo_pix_outline, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_send_no_results_send_to_pix_key, null, null, 14), null, 0, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, pixIdentifiedTypeA, null, 0, 0, 0, 0, 532676568));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
            } else if (gVar.b(str2)) {
                List listC2 = u.c(new RowDelegate.Model("SEND_QR_LIST_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_logo_pix_outline, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_send_no_results_send_to_qr_code, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, str2, null, 0, 0, 0, 0, 532676600));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                obj5 = listC2;
            } else {
                listC = u.c(new FullScreenStateDelegate.Model("NO_RESULTS_FOUND_LIST_ID", new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_send_no_results_title, null, null, 14), null, null, null, null, false, null, null, false, 0, 0, 32764));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
            }
            obj5 = listC;
        } else {
            Collection<f5j.a> collection2 = collection;
            ArrayList arrayList = new ArrayList(w.t(collection2, 10));
            for (f5j.a aVar : collection2) {
                arrayList.add(RowDelegate.Model.x(uVar.f14222a.c(aVar, false), null, null, new TextClause(n61.j.d(aVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -5, 15));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            obj5 = arrayList;
        }
        eVarB.addAll((Collection) obj5);
        return new bba.l(u.a(eVarB));
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r48, java.lang.Object r49, java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 2000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1c.p.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(java.lang.Object r42, java.lang.Object r43, java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1c.p.h(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r36, java.lang.Object r37, java.lang.Object r38) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1c.p.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        int i;
        CellDetailsDelegate.Model model;
        Quote quote;
        bg4.c0 c0Var = (bg4.c0) this.f11793b;
        bg4.j jVar = (bg4.j) this.f11794c;
        bg4.h content = (bg4.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Data quote2 = jVar.f15105b;
        az3.a configuration = content.f15102a;
        PaymentMethod.Pocket selectedPocket = content.f15103b;
        bg4.d0 d0Var = c0Var.f15099a;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        int i2 = R$string.credit_application_payment_checkout_title;
        String str = configuration.f11383a;
        dj0.d dVar = configuration.f11386g;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, u.c(str), null, 12);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_payment_checkout_second_description, u.c(configuration.f11384b), null, 12);
        aim.e eVarB = u.b();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(quote2, "quote");
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_payment_checkout_payment_summary_total_label, u.c(configuration.f11385c), null, 12);
        int i3 = R$string.credit_application_payment_checkout_payment_summary_total_value;
        o9 o9Var = o9.NON_SENSITIVE;
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(i3, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4)), null, 12);
        int i5 = R$attr.uikit_dp8;
        y7 y7Var = new y7("ID_CREDIT_PAYMENT_NAME", textLocalisedClause4, textLocalisedClause3, null, 0, null, i5, i5, 1656);
        od0.i iVar = (od0.i) quote2.getContent();
        if (iVar == null || (quote = (Quote) iVar.f224257a) == null) {
            i = 12;
            model = null;
        } else {
            i = 12;
            model = new CellDetailsDelegate.Model("ID_CREDIT_EXCHANGE_AMOUNT", new t0((Clause) new TextLocalisedClause(R$string.credit_application_payment_checkout_payment_summary_exchanged_amount_label, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), new TextLocalisedClause(R$string.credit_application_payment_checkout_payment_summary_exchanged_amount_value, u.c(new MoneyClause(quote.f84400c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4)), null, 12), null, quote, null, null, 0, null, false, false, null, null, 32696);
        }
        Object[] elements = {y7Var, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        if (((ArrayList) listL).size() > 1) {
            listL = yp0.b.g(listL, new ListSubheaderDelegate.Model("ID_CREDIT_PAYMENT_SUMMARY", (Image) null, (Clause) new TextLocalisedClause(R$string.credit_application_payment_checkout_payment_summary_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        } else {
            yp0.b.k(listL, 0, 0, 0, 0, 31);
        }
        eVarB.addAll(listL);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
        eVarB.addAll(yp0.b.i(dec.q.c(d0Var.f15100a, selectedPocket, true, selectedPocket.f84381j.e(dVar) ? dec.o.DEFAULT : dec.o.INSUFFICIENT_FUNDS, false, 24), new ListSubheaderDelegate.Model("ID_CREDIT_PAYMENT_PAY_WITH", (Image) null, (Clause) new TextLocalisedClause(R$string.credit_application_payment_checkout_pay_with_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        aim.e eVarA = u.a(eVarB);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
        String str2 = configuration.d;
        return new bg4.v(new aw0.e(false, str2 != null ? new TextLocalisedClause(R$string.credit_application_payment_checkout_action_footer, prk.o.v(0, 30, null, null, str2), null, i) : null, null, new n6(new TextLocalisedClause(R$string.credit_application_payment_checkout_action_button, u.c(selectedPocket.f84381j.e(dVar) ? configuration.e : configuration.f), null, i), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 53), textLocalisedClause, textLocalisedClause2, eVarA);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        QrCodeImage qrCodeImageA;
        int i;
        com.revolut.feature.alipay.impl.ui.qr.showcode.modal.e eVar = (com.revolut.feature.alipay.impl.ui.qr.showcode.modal.e) this.f11793b;
        com.revolut.feature.alipay.impl.ui.qr.showcode.modal.a aVar = (com.revolut.feature.alipay.impl.ui.qr.showcode.modal.a) this.f11794c;
        pk1.a paymentCode = (pk1.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(paymentCode, "paymentCode");
        AlipayPlusExpandedCodeScreenContract$InputData.CodeType codeType = aVar.f61085b;
        zk1.c cVar = eVar.f61088a;
        tc tcVar = new tc(qc.f165962a);
        int i2 = R$attr.uikit_dp96;
        int[] iArr = com.revolut.feature.alipay.impl.ui.qr.showcode.modal.d.f61087a;
        int i3 = iArr[codeType.ordinal()];
        if (i3 == 1) {
            String str = paymentCode.f236912a;
            zk1.c.Companion.getClass();
            qrCodeImageA = ((zk1.e) cVar).a(str, zk1.b.f322888c);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            qrCodeImageA = ((zk1.e) cVar).b(paymentCode.f236912a);
        }
        int i5 = iArr[codeType.ordinal()];
        if (i5 == 1) {
            zk1.c.Companion.getClass();
            i = (int) 512.0f;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 360;
        }
        return u.c(new xc("ID_CONTENT", v.k(new we0("ID_CODE", new qe0(i, qrCodeImageA)), new TextDelegate.Model(R$attr.uikit_dp24, R$attr.uikit_dp16, 828, new TextLocalisedClause(com.revolut.feature.alipay.api.R$string.alipay_plus_show_code_renew_down_counter, u.c(Integer.valueOf(paymentCode.f236913b)), null, 12), "ID_RENEWAL_COUNTDOWN")), 0, tcVar, null, i2, 0, 0, 876));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r37, java.lang.Object r38, java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1c.p.l(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        int i;
        TextLocalisedClause textLocalisedClause;
        bo8.e0 e0Var = (bo8.e0) this.f11793b;
        bo8.b bVar = (bo8.b) this.f11794c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        bo8.d dVar = (bo8.d) pair.f186385a;
        Data data = bVar.f17297b;
        od0.i iVar = bVar.f17298c;
        bo8.a aVar = bVar.d;
        aim.e eVarB = u.b();
        int i2 = bo8.d0.f17311a[aVar.ordinal()];
        if (i2 == 1) {
            i = com.revolut.feature.junior_settings.impl.R$string.junior_account_details_disclaimer_bizum;
        } else if (i2 == 2) {
            i = com.revolut.feature.junior_settings.impl.R$string.junior_account_details_disclaimer_blik;
        } else if (i2 == 3) {
            i = com.revolut.feature.junior_settings.impl.R$string.junior_account_details_disclaimer_mb_way;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.feature.junior_settings.impl.R$string.junior_account_details_disclaimer;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, u.c(dVar.f17309b), null, 12);
        Integer num = (Integer) iVar.f224257a;
        if (num != null) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_account_details_disclaimer_graduation, u.c(Integer.valueOf(num.intValue())), null, 12);
        } else {
            textLocalisedClause = null;
        }
        TextLocalisedClause[] elements = {textLocalisedClause2, textLocalisedClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ListCellDelegate.Model model = new ListCellDelegate.Model("SENDING_MONEY_INFO", new j8(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246)), null, new CompositeClause(kotlin.collections.d.L(elements), new TextClause(m70.a.o(kotlin.jvm.internal.t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, null, null, 0, 0, 0, 0, 4068);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        eVarB.add(new ListSubheaderDelegate.Model("WAYS_TO_GET_PAID_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_account_details_ways_to_get_paid, u.c(dVar.f17309b), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_account_details_share_account_title, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_account_details_share_account_subtitle, null, null, 14);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i3 = R$drawable.uikit_icn_24_bank;
        int i5 = R$attr.uikit_colorAccentNeutral;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i5), 0.1f, companion, i3, new Color.Solid(i5)), null, null, false, null, false, 62);
        yy0.i iVar2 = yy0.l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar2.getClass();
        RowDelegate.Model model2 = new RowDelegate.Model("ID_SHARE_ACCOUNT_DETAILS", image40, textLocalisedClause3, null, 0, textLocalisedClause4, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        eVarB.addAll((List) iii.c.f(data, new bng.a(e0Var, 10), new bhi.c(e0Var, 12), new p(e0Var, dVar, 18)));
        return u.a(eVarB);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        ProfileCardModel error;
        bo8.e0 e0Var = (bo8.e0) this.f11793b;
        bo8.d dVar = (bo8.d) this.f11794c;
        bo8.l consentState = (bo8.l) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(consentState, "consentState");
        if (consentState instanceof bo8.k) {
            return f0.f322471a;
        }
        if (!(consentState instanceof bo8.j)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((bo8.j) consentState).f17319a.b()) {
            error = e0Var.f17313a.b(bo8.e0.a(dVar));
        } else {
            si8.a cardInfo = bo8.e0.a(dVar);
            Intrinsics.checkNotNullParameter(cardInfo, "cardInfo");
            error = new ProfileCardModel.Error(new TextLocalisedClause(com.revolut.feature.junior_payment_links.impl.R$string.junior_payment_links_qr_screen_disabled_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_payment_links.impl.R$string.junior_payment_links_qr_screen_disabled_subtitle, u.c(cardInfo.f263526b), null, 12), new a0(new TextLocalisedClause(com.revolut.feature.junior_payment_links.impl.R$string.junior_payment_links_qr_screen_disabled_action, null, null, 14), null, null, 14));
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_account_details_share_payment_link_title, u.c(dVar.f17309b), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_account_details_share_payment_link_subtitle, null, null, 14);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_link;
        int i2 = R$attr.uikit_colorAccentNeutral;
        CircleBadgeModel circleBadgeModel = null;
        ProgressStyle progressStyle = null;
        boolean z = false;
        NewBadgeContent newBadgeContent = null;
        List listK = v.k(new RowDelegate.Model("SHARE_PAYMENT_LINK", new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2)), circleBadgeModel, progressStyle, z, newBadgeContent, false, 62), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new n30(error));
        yp0.b.k(listK, 0, R$attr.uikit_dp16, 0, 0, 29);
        return listK;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x09a0 A[PHI: r2
      0x09a0: PHI (r2v15 java.lang.Long) = (r2v4 java.lang.Long), (r2v8 java.lang.Long) binds: [B:95:0x099e, B:101:0x09b6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r46, java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 2679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1c.p.o(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.revolut.core.ui_kit_core.displayers.image.models.CdnImage, ip0.yj0] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r45v1 */
    /* JADX WARN: Type inference failed for: r45v2 */
    /* JADX WARN: Type inference failed for: r45v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r45v4 */
    /* JADX WARN: Type inference failed for: r45v5 */
    /* JADX WARN: Type inference failed for: r45v6 */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    private final Object p(Object obj2, Object obj3, Object obj4) {
        ?? r452;
        List listP;
        xo0.b aVar;
        List listC;
        l0 l0Var = (l0) this.f11793b;
        bs9.o oVar = (bs9.o) this.f11794c;
        bs9.p data = (bs9.p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(data, "content");
        List list = data.f18125b;
        String str = data.d;
        ?? r142 = 0;
        CompositeClause compositeClauseD = list.isEmpty() ? ((ou9.c) l0Var.f18114b).d() : null;
        Intrinsics.checkNotNullParameter(data, "content");
        bs9.q qVar = !list.isEmpty() ? bs9.q.REVERSED_CONTENT : str.length() == 0 ? bs9.q.BIASED_EMPTY_STATE : bs9.q.TOP_ANCHORED_EMPTY_STATE;
        fs9.d dVar = l0Var.f18113a;
        Intrinsics.checkNotNullParameter(data, "data");
        if (list.isEmpty()) {
            if (str.length() > 0) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.group_chat_empty_state_title, null, null, 14);
                List listK = v.k(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_24_scan_qr, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28));
                m70.a.t(kotlin.jvm.internal.t0.f186434a);
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_ADD_MEMBERS_PLACEHOLDER", textLocalisedClause, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(12, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Object) new fs9.h(str), "ID_INVITE_CODE_SUBTITLE", false), null, 8), new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 48, 48, 31), (Clause) null, 190)), zj.SMALL, null, false, null, null, false, 0, 0, 31712);
                yp0.b.r(model, R$attr.uikit_dp48, 0, 0, 0, 14);
                ListCellDelegate.Model model2 = new ListCellDelegate.Model("LIST_ID_DESCRIPTION_ADD_BILLS", new j8(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.group_chat_empty_state_description_add_bills, null, null, 14), null, false, null, null, 0, R$attr.uikit_dp8, 0, 0, 3576);
                yp0.b.r(model2, 0, R$attr.uikit_dp0, 0, 0, 13);
                c.f fVar = new c.f((qv0.h) null, 3);
                Intrinsics.checkNotNullParameter(fVar, "<set-?>");
                model2.f52698j = fVar;
                Unit unit = Unit.f186387a;
                ListCellDelegate.Model model3 = new ListCellDelegate.Model("LIST_ID_DESCRIPTION_ADD_FRIENDS", new j8(new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.group_chat_empty_state_description_add_friends, null, null, 14), null, false, null, null, R$attr.uikit_dp8, 0, 0, 0, 3832);
                yp0.b.r(model3, R$attr.uikit_dp0, 0, 0, 0, 14);
                c.a aVar2 = new c.a(0);
                Intrinsics.checkNotNullParameter(aVar2, "<set-?>");
                model3.f52698j = aVar2;
                listC = v.k(model, model2, model3);
            } else {
                listC = u.c(new FullScreenStateDelegate.Model("ID_EMPTY_PLACEHOLDER", new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_chat_empty, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D023", null, null, null, 30)), zj.REGULAR, null, false, null, null, true, 0, 0, 31716));
            }
            listP = listC;
            r452 = 0;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj5 : list) {
                LocalDate localDate = ((GroupChatItem) obj5).getF79574b().toLocalDate();
                Object arrayList = linkedHashMap.get(localDate);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(localDate, arrayList);
                }
                ((List) arrayList).add(obj5);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                LocalDate localDate2 = (LocalDate) entry.getKey();
                List list2 = (List) entry.getValue();
                Intrinsics.h(localDate2);
                long jB = jli.b.b(localDate2);
                TextDelegate.Model model4 = new TextDelegate.Model(String.valueOf(jB), new TimeClause(jB, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), false, new ak0(r142, r142, 3), null, null, 0, 0, 0, 0, 2036);
                int i = R$attr.uikit_dp4;
                yp0.b.r(model4, i, i, 0, 0, 12);
                List listP0 = zhm.d0.P0(list2, new fs9.c());
                List list3 = listP0;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                int i2 = 0;
                ?? r143 = r142;
                for (Object obj6 : list3) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        ?? r453 = r143;
                        v.s();
                        throw r453;
                    }
                    GroupChatItem groupChatItem = (GroupChatItem) obj6;
                    cam.f fVarA = ru9.o.a(i2, listP0);
                    ru9.l0 l0Var2 = dVar.f137657a;
                    ?? r454 = r143;
                    boolean z = i2 == v.j(listP0);
                    dv9.h hVar = (dv9.h) data.f18126c.get(c8g.a.j(groupChatItem));
                    if (s.s(fVarA)) {
                        String strH9 = groupChatItem.h9();
                        aVar = new xo0.a(strH9 != null ? new TextClause(strH9, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : r454);
                    } else {
                        aVar = b.a.f307540a;
                    }
                    arrayList3.add(l0Var2.a(groupChatItem, fVarA, z, true, hVar, aVar, null));
                    r143 = r454;
                    i2 = i3;
                }
                arrayList2.add(new Pair(i2b.a.q(model4, arrayList3), localDate2));
                r142 = r143;
            }
            r452 = r142;
            List listP02 = zhm.d0.P0(arrayList2, new fs9.b());
            ArrayList arrayList4 = new ArrayList();
            Iterator it8 = listP02.iterator();
            while (it8.hasNext()) {
                zhm.a0.x(zhm.d0.I0((List) ((Pair) it8.next()).f186385a), arrayList4);
            }
            listP = i2b.a.p(arrayList4, ((ou9.c) dVar.f137658b).a());
        }
        PaymentGroup group = oVar.f18116a;
        Intrinsics.checkNotNullParameter(group, "group");
        ?? r72 = r452;
        return new x(listP, new js9.b(new js9.a(new TextLocalisedClause(R.string.common_action_add_a_bill, r72, r72, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_split, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), !xam.a.l(group) ? new js9.a(new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_widget_actions_settle_up, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)) : null), l0Var.f18115c.a(oVar), oVar.f18120h, fs9.g.a(oVar.f18116a), compositeClauseD, qVar, oVar.i, gs9.b.a(oVar.f18122l), oVar.f);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        BalanceWrapper balanceWrapper;
        bse.l lVar = (bse.l) this.f11793b;
        xte.a aVar = lVar.f18187b;
        bse.g gVar = (bse.g) this.f11794c;
        List addMoneyMethods = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(addMoneyMethods, "addMoneyMethods");
        AddMoneyMethod addMoneyMethod = gVar.f18182b;
        boolean z = gVar.f18183c;
        List list = addMoneyMethods;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            if (obj5 instanceof AddMoneyMethod.TopUp) {
                arrayList.add(obj5);
            }
        }
        AddMoneyMethod.TopUp topUp = (AddMoneyMethod.TopUp) (!(addMoneyMethod instanceof AddMoneyMethod.TopUp) ? null : addMoneyMethod);
        aim.e eVarB = u.b();
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((AddMoneyMethod.TopUp) it8.next()).f65827a);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj6 : arrayList2) {
            if (obj6 instanceof TopupMethod.StoredMethod) {
                arrayList3.add(obj6);
            }
        }
        ArrayList arrayListA = xte.a.a(aVar, arrayList3, topUp != null ? topUp.f65827a : null, 4);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayListA);
        ArrayList arrayList4 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList4.add(((AddMoneyMethod.TopUp) it9.next()).f65827a);
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj7 : arrayList4) {
            if (obj7 instanceof TopupMethod.OtherMethod) {
                arrayList5.add(obj7);
            }
        }
        ArrayList arrayListD = ((aze.b) aVar).d(arrayList5, topUp != null ? topUp.f65827a : null, null, null);
        yp0.b.k(arrayListD, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayListD);
        aim.e eVarA = u.a(eVarB);
        ArrayList<AddMoneyMethod.MoveMoney> arrayList6 = new ArrayList();
        for (Object obj8 : list) {
            if (obj8 instanceof AddMoneyMethod.MoveMoney) {
                arrayList6.add(obj8);
            }
        }
        if (!(addMoneyMethod instanceof AddMoneyMethod.MoveMoney)) {
            addMoneyMethod = null;
        }
        AddMoneyMethod.MoveMoney moveMoney = (AddMoneyMethod.MoveMoney) addMoneyMethod;
        boolean zIsEmpty = eVarA.isEmpty();
        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
        for (AddMoneyMethod.MoveMoney moveMoney2 : arrayList6) {
            o2j.q qVar = lVar.f18186a;
            BalanceWrapper balanceWrapper2 = moveMoney2.f65825a;
            arrayList7.add(qVar.c(balanceWrapper2, (moveMoney == null || (balanceWrapper = moveMoney.f65825a) == null) ? null : balanceWrapper.f99404a, (cp5.d.z(balanceWrapper2.getF99406c()) || cp5.d.y(moveMoney2.f65825a.getF99406c())) ? false : true));
        }
        int size = arrayList7.size();
        List listA = arrayList7;
        listA = arrayList7;
        if (size > 2 && !zIsEmpty) {
            aim.e eVarB2 = u.b();
            List listV0 = arrayList7;
            if (!z) {
                listV0 = zhm.d0.V0(arrayList7, 2);
            }
            eVarB2.addAll(listV0);
            eVarB2.add(new LargeActionButtonDelegate.Model("EXPEND_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(z ? R.string.common_show_less : R.string.common_show_more, null, null, 14), false, null, null, null, null, 744));
            listA = u.a(eVarB2);
        }
        List list2 = listA;
        yp0.b.k(list2, 0, 0, 0, 0, 31);
        aim.e eVarB3 = u.b();
        eVarB3.add(!list2.isEmpty() ? new ListSubheaderDelegate.Model("SUBHEADER_BALANCES_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.three_ds_add_money_methods_selection_revolut_accounts, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530) : null);
        eVarB3.addAll(list2);
        eVarB3.add(eVarA.isEmpty() ? null : new ListSubheaderDelegate.Model("SUBHEADER_TOP_UP_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.three_ds_add_money_methods_selection_other_methods, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        eVarB3.addAll(eVarA);
        return zhm.d0.Z(u.a(eVarB3));
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        bw0.m mVar;
        bu4.o oVar = (bu4.o) this.f11793b;
        bu4.a aVar = (bu4.a) this.f11794c;
        gl4.d creditPaymentInfo = (gl4.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
        String str = aVar.f18671b;
        w80.b bVar = oVar.f18687a;
        String str2 = str == null ? "" : str;
        xi0.b bVar2 = creditPaymentInfo.f144557a;
        dj0.d maxAmount = creditPaymentInfo.f144561h;
        dj0.d minAmount = creditPaymentInfo.f144560g;
        dj0.d inputAmount = new dj0.d(bVar.b(str2, bVar2.f306286a), bVar2);
        aim.e eVarB = u.b();
        bw0.h hVar = new bw0.h(str == null ? "" : str, cp5.d.J(bVar2), null, true, null, str == null ? Boolean.TRUE : null, false, false, bw0.e.None, null, null, null, 31700);
        f3 f3Var = new f3(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_scan_card, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 4.0f, Float.valueOf(24.0f), null, 32), new TextLocalisedClause(R$string.credit_card_boleto_payment_pay_with_boleto, null, null, 14), null, false, h3.ACTIVE_NOT_CLICKABLE, false);
        if (str == null || kotlin.text.d0.W(str)) {
            mVar = null;
        } else {
            Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
            Intrinsics.checkNotNullParameter(minAmount, "minAmount");
            Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
            mVar = inputAmount.f(maxAmount) ? new bw0.m(new TextLocalisedClause(R$string.credit_card_boleto_payment_payment_max_limit, u.c(sx4.f.b(3, null, null, maxAmount)), null, 12), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, 24) : inputAmount.i(minAmount) ? new bw0.m(new TextLocalisedClause(R$string.credit_card_boleto_payment_payment_min_limit, u.c(sx4.f.b(3, null, null, minAmount)), null, 12), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, 24) : null;
        }
        eVarB.add(new CenteredAmountDelegate.Model("id_credit_card_boleto_payment_amount", null, hVar, f3Var, mVar, null, null, false, false, creditPaymentInfo.f144557a, null, 1378));
        AttributeSelectorSmallDelegate.Model model = new AttributeSelectorSmallDelegate.Model("id_min_repayment_amount", sx4.f.b(3, null, null, creditPaymentInfo.f144558b), new TextLocalisedClause(R$string.credit_card_boleto_payment_minimum, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, true, null, null, 472);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        AttributeSelectorSmallDelegate.Model model2 = new AttributeSelectorSmallDelegate.Model("id_statement_amount", sx4.f.b(3, null, null, creditPaymentInfo.f144559c), new TextLocalisedClause(R$string.credit_card_boleto_payment_statement, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, true, null, null, 472);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        AttributeSelectorSmallDelegate.Model model3 = new AttributeSelectorSmallDelegate.Model("id_total_repayment_amount", sx4.f.b(3, null, null, creditPaymentInfo.d), new TextLocalisedClause(R$string.credit_card_boleto_payment_total, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, true, null, null, 472);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        eVarB.add(new xk("id_repayment_information", v.k(model, model2, model3), 3, Float.valueOf(8.0f), null, 48));
        aim.e eVarB2 = u.b();
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.credit_card_boleto_payment_statement_due, null, null, 14), (Image) null, 0, false, 30);
        long jP = ebm.a.P(creditPaymentInfo.e);
        ka kaVar = ka.SHORT;
        eVarB2.add(new CellDetailsDelegate.Model("id_statement_due_date", t0Var, new TimeClause(jP, new TimeClause.Format.DayAndMonth(kaVar), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        java.time.LocalDate localDate = creditPaymentInfo.f;
        if (localDate != null) {
            eVarB2.add(new CellDetailsDelegate.Model("id_statement_closed_date", new t0((Clause) new TextLocalisedClause(R$string.credit_card_boleto_payment_statement_closed, u.c(new TimeClause(ebm.a.P(localDate), new TimeClause.Format.Month(kaVar), null, null, 12)), null, 12), (Image) null, 0, false, 30), new TimeClause(ebm.a.P(localDate), new TimeClause.Format.DayAndMonth(kaVar), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        }
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        aim.e eVarA2 = u.a(eVarB);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_boleto_payment_button, null, null, 14);
        boolean z = false;
        if (!inputAmount.f(maxAmount) && !inputAmount.i(minAmount)) {
            z = true;
        }
        return new bu4.i(eVarA2, new bu4.e(textLocalisedClause, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x025f  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r53, java.lang.Object r54, java.lang.Object r55) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1c.p.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        Object next;
        c3k.c cVar = (c3k.c) this.f11793b;
        c3k.h hVar = (c3k.h) this.f11794c;
        List paymentVendors = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(paymentVendors, "paymentVendors");
        if (cVar.f20956b.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : paymentVendors) {
                PaymentVendor paymentVendor = (PaymentVendor) obj5;
                String str = cVar.f20956b;
                String str2 = paymentVendor.f64080b;
                ArrayList arrayList2 = paymentVendor.f;
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(hVar.f20961a.b(new CountryClause(((PaymentVendorCorridor) it8.next()).f64082a, null)).toString());
                }
                Iterator it9 = zhm.d0.F0(str2, arrayList3).iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it9.next();
                    if (kotlin.text.d0.J((String) next, str, true)) {
                        break;
                    }
                }
                if (next != null) {
                    arrayList.add(obj5);
                }
            }
            paymentVendors = arrayList;
        }
        List<PaymentVendor> list = paymentVendors;
        ArrayList arrayList4 = new ArrayList(w.t(list, 10));
        for (PaymentVendor paymentVendor2 : list) {
            String strQ = j6.a.q("LIST_ID_", paymentVendor2.f64079a);
            UrlImage urlImage = new UrlImage(paymentVendor2.d, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
            ArrayList arrayList5 = paymentVendor2.f;
            arrayList4.add(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(urlImage, arrayList5.size() == 1 ? new RawImageBadge(new CountryImage(((PaymentVendorCorridor) zhm.d0.b0(arrayList5)).f64082a.f297794a, (Integer) null, (ez0.e) null, 14)) : null, null, false, null, false, 60), new TextClause(paymentVendor2.f64080b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, w2k.a.a(paymentVendor2), null, null, 0, null, false, null, false, null, null, null, null, null, null, paymentVendor2, null, 0, 0, 0, 0, 532676568));
        }
        yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
        return arrayList4;
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        c42.n nVar = (c42.n) this.f11793b;
        c42.a aVar = (c42.a) this.f11794c;
        c42.b content = (c42.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Clause clause = aVar.d;
        String str = aVar.f20977b;
        boolean z = aVar.f20978c;
        List list = content.f20979a;
        List list2 = content.f20980b;
        if (list.isEmpty() && list2.isEmpty()) {
            if (z) {
                return i2b.a.p(nVar.a(aVar), c42.n.d(clause));
            }
            if (!kotlin.text.d0.W(str)) {
                return nVar.b(str);
            }
            ApmRecipientListInputData apmRecipientListInputData = nVar.f20993a;
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_EMPTY_STATE", apmRecipientListInputData.f62265g, null, new ComplexImage.Regular(apmRecipientListInputData.f62264c), new l6(8, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_recipient_list_empty_state_widget_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), h4.ACCENT), zj.REGULAR, false, null, null, null, 1860);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            List list3 = aVar.e;
            yp0.b.k(list3, 0, 0, 0, 0, 31);
            aim.e eVarB = u.b();
            eVarB.add(model);
            eVarB.addAll(list3);
            return u.a(eVarB);
        }
        List list4 = content.f20979a;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list4) {
            if (((ApmRecipient) obj5).g8(str)) {
                arrayList.add(obj5);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : list2) {
            zm3.f fVar = (zm3.f) obj6;
            if (kotlin.text.d0.W(str) || jli.g.d(fVar.f323345a, str) || jli.g.d(fVar.f323347c, str) || jli.g.d(fVar.d, str) || jli.g.d(fVar.e, str)) {
                arrayList2.add(obj6);
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return nVar.b(str);
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((fy1.q) nVar.f20994b).g((ApmRecipient) it8.next()));
        }
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        ArrayList arrayList4 = new ArrayList(w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            arrayList4.add(((xl3.d) nVar.f20995c).m((zm3.f) it9.next()));
        }
        yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
        aim.e eVarB2 = u.b();
        eVarB2.addAll(nVar.a(aVar));
        if (z) {
            eVarB2.add(c42.n.d(clause));
        }
        eVarB2.addAll(arrayList3);
        eVarB2.addAll(arrayList4);
        return u.a(eVarB2);
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        List listO;
        List listC;
        List listA;
        r rVar = (r) this.f11793b;
        c5a.l domainState = (c5a.l) this.f11794c;
        List content = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        h5a.b bVar = (h5a.b) rVar.f17429b;
        g5a.u uVar = bVar.f149518a;
        b5a.d dVar = bVar.f149519b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(content, "content");
        if (zBooleanValue && content.isEmpty()) {
            listO = v.k(new pb0("1"), new pb0("2"), new pb0("3"));
            yp0.b.k(listO, 0, 0, 0, 0, 31);
        } else {
            y80.d dVar2 = domainState.f21506n;
            y80.d dVar3 = y80.d.GRANTED;
            boolean z = dVar2 == dVar3;
            List list = domainState.f21505m;
            Data data = domainState.f21500c;
            List list2 = domainState.f21501g;
            Data data2 = domainState.k;
            if (z && !content.isEmpty()) {
                List list3 = (List) data2.getContent();
                if (list3 == null) {
                    list3 = f0.f322471a;
                }
                List list4 = list3;
                List list5 = domainState.d;
                e3a.a aVar = domainState.e;
                n38.a aVar2 = domainState.f21503j;
                List list6 = domainState.f21505m;
                Boolean bool = (Boolean) data.getContent();
                listO = i2b.a.o(i2b.a.o(list4, uVar.b(content, list5, aVar, aVar2, list6, bool != null ? bool.booleanValue() : false)), list2);
            } else if (dVar2 == dVar3) {
                if (list.isEmpty()) {
                    listA = u.c(b5a.d.b(((o8b.c) dVar.f12480a).g() ? com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_invite_friends_title_in_tailored : com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_invite_friends_title, com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_invite_friends_action, "CONTACTS_ALLOWED_ITEM_ID"));
                } else {
                    listA = uVar.a(list, true);
                }
                listO = i2b.a.o(i2b.a.o((List) data2.getContent(), listA), list2);
            } else if (content.isEmpty()) {
                int i = h5a.a.f149517a[dVar2.ordinal()];
                listO = i2b.a.o(i != 1 ? i != 2 ? u.c(new FullScreenStateDelegate.Model("ID_TRANSFER_WIDGET_PERMISSION", new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_chat_home_contact_access_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_chat_home_contact_access_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D082", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_chat_home_contact_access_enable_permission, null, null, 14), null, h4.ACCENT), zj.REGULAR, true, null, null, null, 1856)) : i2b.a.p((List) data2.getContent(), b5a.d.b(com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_enable_permission_title, com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_enable_permission_action, "CONTACTS_DENIED_ITEM_ID")) : i2b.a.p((List) data2.getContent(), b5a.d.b(com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_enable_permission_title, com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_go_to_settings_action, "CONTACTS_PERMANENTLY_DENIED_ITEM_ID")), list2);
            } else {
                if (((List) data2.getContent()) != null && (!r5.isEmpty())) {
                    listC = (List) data2.getContent();
                } else if (domainState.f21507p) {
                    listC = f0.f322471a;
                } else {
                    ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("ID_TRANSFER_WIDGET_PERMISSION", new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_chat_home_contact_access_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_chat_home_contact_access_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D082", null, null, null, 30), new ActionWidgetDelegate.Model.b.a(null), new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_chat_home_contact_access_enable_permission, null, null, 14), null, false), com.revolut.core.ui_kit.delegates.q.REGULAR, null, null, 1920);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    listC = u.c(model);
                }
                List list7 = listC;
                List list8 = domainState.d;
                e3a.a aVar3 = domainState.e;
                n38.a aVar4 = domainState.f21503j;
                List list9 = domainState.f21505m;
                Boolean bool2 = (Boolean) data.getContent();
                listO = i2b.a.o(i2b.a.o(list7, uVar.b(content, list8, aVar3, aVar4, list9, bool2 != null ? bool2.booleanValue() : false)), list2);
            }
        }
        c5a.s sVarF = ((t) rVar.f17430c).f(domainState);
        List list10 = domainState.f21501g;
        aim.e eVarB = u.b();
        eVarB.addAll(listO);
        List listV = zjh.j.v((zjh.j) rVar.d, domainState.f21510s);
        int i2 = R$attr.uikit_dp24;
        yp0.b.q(listV, i2, i2, 0, 0, 12);
        eVarB.addAll(listV);
        Unit unit = Unit.f186387a;
        return new c5a.v(sVarF, list10, u.a(eVarB), domainState.f21504l);
    }

    private final Object w(Object obj2, Object obj3, Object obj4) {
        TextDelegate.Model model;
        c64.d0 d0Var = (c64.d0) this.f11793b;
        c64.k kVar = (c64.k) this.f11794c;
        eu3.c content = (eu3.c) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        e64.b bVar = d0Var.f21621a;
        CalculatorScreenContract$InputData calculatorScreenContract$InputData = d0Var.f21622b;
        int i = calculatorScreenContract$InputData.f67186a;
        TextLocalisedClause textLocalisedClauseA = c64.d0.a(content.f129483a);
        String str = content.f129484b;
        TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String str2 = content.f129485c;
        TagViewData tagViewDataA = str2 != null ? ae4.a.a(str2) : null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_calculator_action, u.c(new TextClause(content.f129488j, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        boolean z = calculatorScreenContract$InputData.e || kVar.d || !Intrinsics.f(calculatorScreenContract$InputData.f67187b, content.b()) || !Intrinsics.f(calculatorScreenContract$InputData.f67188c, content.c());
        ax4.b constructorDomainState = kVar.f21630a;
        e64.c cVar = (e64.c) bVar;
        cVar.getClass();
        mx4.x xVar = cVar.f122890a;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(constructorDomainState, "constructorDomainState");
        x4[] elements = {content.d, content.e};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        boolean z3 = z;
        List listI0 = content.f == eu3.b.DURATION_FIRST ? zhm.d0.I0(listL) : listL;
        ArrayList arrayList = new ArrayList(w.t(listI0, 10));
        Iterator it8 = listI0.iterator();
        while (it8.hasNext()) {
            arrayList.add(cVar.f122891b.a((x4) it8.next(), constructorDomainState));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        List list = content.f129486g;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList2.add(xVar.b((e1) it9.next(), constructorDomainState));
        }
        ArrayList arrayListU = w.u(arrayList2);
        String str3 = content.i;
        if (str3 != null) {
            HtmlClause htmlClause = new HtmlClause(0, 30, (Integer) null, (Object) null, str3);
            ak0 ak0Var = new ak0(null, null, 3);
            int i2 = R$attr.uikit_dp32;
            model = new TextDelegate.Model("id_disclaimer", htmlClause, false, ak0Var, null, null, 0, 0, i2, i2, 500);
        } else {
            model = null;
        }
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        TextDelegate.Model[] elements2 = {model, new TextDelegate.Model("id_anchor_item_id", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(0), null, null, 0, 0, 0, 0, 2036)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        ArrayList arrayListE0 = zhm.d0.E0(kotlin.collections.d.L(elements2), zhm.d0.E0(arrayListU, arrayList));
        ax4.b constructorDomainState2 = kVar.f21630a;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(constructorDomainState2, "constructorDomainState");
        List list2 = content.f129487h;
        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            arrayList3.add(xVar.b((e1) it10.next(), constructorDomainState2));
        }
        return new c64.p(i, textLocalisedClauseA, textClause, tagViewDataA, textLocalisedClause, true, z3, zBooleanValue, arrayListE0, w.u(arrayList3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0cbf  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0cd9  */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r53, java.lang.Object r54, java.lang.Object r55) {
        /*
            Method dump skipped, instruction units count: 3620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1c.p.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
