package ael;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.revolutpay.api.declaration.RevolutPayApi$Toggles;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import ip0.y10;
import ip0.z10;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kkf.a5;
import kkf.b6;
import kkf.i9;
import kkf.j5;
import kkf.l8;
import kkf.m2;
import kkf.o2;
import kkf.s4;
import kkf.y1;
import kkf.z3;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import tof.a3;
import tof.d5;
import tof.gb;
import tof.i7;
import tof.k6;
import tof.l6;
import tof.m6;
import tof.n6;
import tof.o6;
import tof.r9;
import tof.t3;
import tof.w1;
import tof.w5;
import tof.xa;
import tof.y6;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class l0 extends kotlin.jvm.internal.a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3637a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f3637a = i3;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        a3 transaction = (a3) obj2;
        String str = (String) obj3;
        y1 y1Var = (y1) this.receiver;
        y1Var.getClass();
        if (k71.k.q0(transaction) || k71.k.T(transaction)) {
            return zhm.f0.f322471a;
        }
        vlf.b bVar = y1Var.f185026b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ((wnf.e) bVar.f290427a).getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        tof.w0 w0Var = transaction.D0;
        CellDetailsDelegate.Model model = null;
        if (w0Var != null) {
            d5 d5Var = w0Var.f273124b;
            String str2 = d5Var != null ? d5Var.f272688a : null;
            Clause textLocalisedClause = Intrinsics.f(str, w0Var.f273123a) ? new TextLocalisedClause(R$string.transactionUI_transaction_made_by_you, null, null, 14) : str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            if (textLocalisedClause != null) {
                model = new CellDetailsDelegate.Model("ID_JOINT_TRANSACTION_MADEBY", new TextLocalisedClause(R$string.transactionUI_transaction_made_by, null, null, 14), textLocalisedClause, 0, null, null, null, null, null, false, 0, 0, 32760);
            }
        }
        return zhm.v.l(model);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        ((m2) this.receiver).getClass();
        aim.e eVarB = zhm.u.b();
        if (zBooleanValue && !zBooleanValue2) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transactionsUI_locked_profile_kyc_passed_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.transactionUI_transaction_details_identity_verification, null, null, 14);
            z10 z10Var = sa.Companion;
            ResourceImage resourceImage = w01.h.f293612a;
            Intrinsics.checkNotNullParameter(z10Var, "<this>");
            eVarB.add(new sa("ID_KYC_BANNER", (Clause) textLocalisedClause, (Clause) textLocalisedClause2, zhm.u.c(new ActionsView.Item("ID_VERIFY_IDENTITY_ACTION", null, false, null, null, new TextLocalisedClause(R.string.identity_action_verify, null, null, 14), null, null, null, null, false, null, null, null, null, 32670)), false, (Image) w01.h.f293613b, (y10) null, (Object) null, 4048));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        o2 o2Var = (o2) this.receiver;
        o2Var.getClass();
        aim.e eVarB = zhm.u.b();
        if (zBooleanValue && !zBooleanValue2) {
            o2Var.f184863n.getClass();
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transaction_details_security_limit_exceeded_banner_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.transaction_details_security_limit_exceeded_banner_subtitle, null, null, 14);
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.transaction_details_security_limit_exceeded_banner_action, null, null, 14);
            String str = "ID_LIMIT_EXCEEDED_BANNER_ACTION";
            sa saVar = new sa("ID_LIMIT_EXCEEDED_BANNER", (Clause) textLocalisedClause, (Clause) textLocalisedClause2, zhm.u.c(new ActionsView.Item(str, mx0.d.SEMIACCENT, false, null, null, textLocalisedClause3, null, null, null, null, false, null, null, null, null, 24476)), false, (Image) resourceImage, (y10) null, (Object) null, 4048);
            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
            zhm.a0.x(zhm.u.c(saVar), eVarB);
        }
        return zhm.u.a(eVarB);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        a3 a3Var = (a3) obj2;
        k71.q qVar = (k71.q) obj3;
        z3 z3Var = (z3) this.receiver;
        z3Var.getClass();
        if (a3Var == null) {
            return zhm.f0.f322471a;
        }
        List listK = zhm.v.k(new ListSubheaderDelegate.Model("ID_ORIGINAL_TRANSACTION_OF_SPARE_CHANGE", (Image) null, (Clause) new TextLocalisedClause(R$string.transaction_details_original_transaction_section_spare_change_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), ((anf.k) z3Var.o).p(a3Var, qVar, new thf.f(false, 3)));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj2, Object obj3, Object obj4) {
        klf.j1 j1Var = (klf.j1) obj3;
        ((s4) this.receiver).getClass();
        aim.e eVarB = zhm.u.b();
        if (k71.k.g0((a3) obj2) && !j1Var.c()) {
            Float f = null;
            Parcelable parcelable = null;
            String str = "ID_BUTTON_PAYMENT_VERIFICATION_CONFIRM";
            boolean z = false;
            Clause clause = null;
            String str2 = "ID_BUTTON_PAYMENT_VERIFICATION_DENY";
            boolean z3 = false;
            e4 e4Var = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            sa saVar = new sa("ID_PAYMENT_VERIFICATION", (Clause) new TextLocalisedClause(R$string.transactionUI_details_suspicious_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.transactionUI_details_suspicious_subtitle, null, null, 14), zhm.v.k(new ActionsView.Item(str, mx0.d.SEMIACCENT, z, null, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, f, parcelable, 32668), new ActionsView.Item(str2, mx0.d.NEGATIVE, z3, e4Var, clause, new TextLocalisedClause(R$string.transactionUI_action_no_terminate_card, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), objArr, objArr2, null, false, 0 == true ? 1 : 0, f, parcelable, null, 32668)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048);
            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
            eVarB.add(saVar);
        }
        return zhm.u.a(eVarB);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        qua.p recurringPayment = (qua.p) obj2;
        a5 a5Var = (a5) this.receiver;
        a5Var.getClass();
        if (((klf.j1) obj3).c()) {
            return zhm.f0.f322471a;
        }
        aim.e eVarB = zhm.u.b();
        if (recurringPayment != null) {
            CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ID_EXTRAS_TRANSFER_TYPE", new TextLocalisedClause(R$string.transactionUI_bank_transfer_types, null, null, 14), new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_recurring_payments_title, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
            qv0.i iVarR = ((i9e.f) a5Var.e).r(recurringPayment, false);
            vlf.b bVar = a5Var.d;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
            ((wnf.e) bVar.f290427a).getClass();
            Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
            qv0.i[] elements = {model, iVarR, new CellDetailsChevronDelegate.Model("ID_GO_TO_SUBSCRIPTION_DETAILS", new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.recurring_transaction_go_to_recurring_button, null, null, 14), 0, false, recurringPayment, null, null, 2028)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            zhm.a0.x(listL, eVarB);
        }
        return zhm.u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ael.l0.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        String retryPaymentUrl;
        String str;
        t3 t3Var = (t3) obj3;
        j5 j5Var = (j5) this.receiver;
        j5Var.getClass();
        boolean zC = false;
        if (Intrinsics.f(((a3) obj2).f272611s, "insufficient_balance")) {
            if ((t3Var != null ? t3Var.F0 : null) == w1.MERCHANT && (str = t3Var.E0) != null && str.length() != 0) {
                zC = ((jte.d) j5Var.f184774m).c(RevolutPayApi$Toggles.RevolutPayMITInsufficientFundsRetry.f84296c);
            }
        }
        if (!zC) {
            return zhm.f0.f322471a;
        }
        if (t3Var == null || (retryPaymentUrl = t3Var.E0) == null) {
            return zhm.f0.f322471a;
        }
        ((d9c.b) j5Var.f184775n).getClass();
        Intrinsics.checkNotNullParameter(retryPaymentUrl, "retryPaymentUrl");
        Intrinsics.checkNotNullParameter("MIT_INSUFFICIENT_FUNDS_COMPLETE_PAYMENT_LIST_ID", "completePaymentActionListId");
        List listC = zhm.u.c(new sa("MIT_INSUFFICIENT_FUNDS_WARNING_LIST_ID", (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_transaction_details_insufficient_funds_mit_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_transaction_details_insufficient_funds_mit_subtitle, null, null, 14), zhm.u.c(new ActionsView.Item("MIT_INSUFFICIENT_FUNDS_COMPLETE_PAYMENT_LIST_ID", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_transaction_details_insufficient_funds_mit_complete_payment, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_link_external_simple, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, retryPaymentUrl, null, 24476)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        a3 a3Var = (a3) obj2;
        ChargeBreakdown chargeBreakdown = (ChargeBreakdown) obj3;
        vlf.b bVar = ((b6) this.receiver).f184614c;
        if (k71.k.m0(a3Var) || !k71.k.q(a3Var)) {
            return zhm.f0.f322471a;
        }
        qv0.i[] elements = {bnf.s.a(bVar.c(a3Var), new TextLocalisedClause(R$string.transactionUI_fees_breakdown_exchange_rate, null, null, 14)), bVar.d(a3Var, chargeBreakdown), bnf.s.a(bVar.a(a3Var), new TextLocalisedClause(R$string.transactionui_details_exchange_completed, null, null, 14))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        qv0.i iVarO;
        a3 transaction = (a3) obj2;
        snf.y yVar = (snf.y) obj3;
        l8 l8Var = (l8) this.receiver;
        l8Var.getClass();
        if (k71.k.q0(transaction) || k71.k.T(transaction)) {
            return zhm.f0.f322471a;
        }
        snf.b accountInfo = yVar.f264605b;
        if (accountInfo != null) {
            vlf.b bVar = l8Var.f184813m;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
            iVarO = ((wnf.e) bVar.f290427a).o(transaction, accountInfo);
        } else {
            iVarO = null;
        }
        return zhm.v.l(iVarO);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        a3 a3Var = (a3) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        i9 i9Var = (i9) this.receiver;
        i9Var.getClass();
        w5 w5Var = a3Var.f272624y;
        String str = a3Var.f272614t;
        boolean z = w5Var.f273145c != io3.i.EXTERNAL;
        boolean z3 = str == null || kotlin.text.d0.W(str);
        if (!z || zBooleanValue || z3) {
            return zhm.f0.f322471a;
        }
        List listC = zhm.u.c(((wnf.e) i9Var.f184761c.f290427a).j(str));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        String str;
        a3 a3Var = (a3) obj2;
        t3 t3Var = (t3) obj3;
        klf.s0 s0Var = (klf.s0) this.receiver;
        s0Var.getClass();
        if ((t3Var != null ? t3Var.H0 : null) != null) {
            i7.c cVar = i7.Companion;
            i7[] i7VarArr = {new gb(s0Var.f185570b.f185494j), new xa(io3.l.CREDIT)};
            cVar.getClass();
            return new klf.o0(i7.c.a(i7VarArr), klf.n0.REV_POINTS);
        }
        if (a3Var.e == y6.TRANSFER && (str = a3Var.q0) != null) {
            tof.a aVar = a3Var.R0;
            if ((aVar != null ? aVar.f272572a : null) == tof.c.PERSONAL) {
                tof.a aVar2 = a3Var.S0;
                if ((aVar2 != null ? aVar2.f272572a : null) == tof.c.CREDIT) {
                    i7.c cVar2 = i7.Companion;
                    i7[] i7VarArr2 = {new r9(str), new xa(io3.l.CREDIT)};
                    cVar2.getClass();
                    return new klf.o0(i7.c.a(i7VarArr2), klf.n0.FIAT);
                }
            }
        }
        return null;
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        String str;
        a3 a3Var = (a3) obj2;
        t3 t3Var = (t3) obj3;
        lkf.d dVar = (lkf.d) this.receiver;
        dVar.getClass();
        if (t3Var == null || (str = t3Var.B0) == null) {
            return zhm.f0.f322471a;
        }
        q02.a chargeback = v13.d.i(a3Var);
        if (chargeback != null && a3Var.e == y6.WERO_PAYMENT) {
            CircleBadgeModel whiteCircleBadge = null;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transaction_details_chargeback_title_apm, zhm.u.c(ApmWero.f61829c.e()), null, 12);
            ((s12.s) dVar.f196371m).getClass();
            Intrinsics.checkNotNullParameter(chargeback, "chargeback");
            aef.a aVar = chargeback.f241055a;
            int[] iArr = s12.r.f259055a;
            int i = iArr[aVar.ordinal()];
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? hx7.l.n(aVar) : com.revolut.feature.apm.core.api.R$string.apm_transaction_chargeback_status_rejected : com.revolut.feature.apm.core.api.R$string.apm_transaction_chargeback_status_completed : com.revolut.feature.apm.core.api.R$string.apm_transaction_chargeback_status_cancelled : com.revolut.feature.apm.core.api.R$string.apm_transaction_chargeback_status_action_required : com.revolut.feature.apm.core.api.R$string.apm_transaction_chargeback_status_in_progress, null, null, 14);
            Intrinsics.checkNotNullParameter(chargeback, "chargeback");
            List listK = zhm.v.k(textLocalisedClause2, new TimeClause(chargeback.f241056b.toEpochMilli(), new TimeClause.Format.Pretty(0), null, null, 12));
            m70.a.a(kotlin.jvm.internal.t0.f186434a);
            CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_document, null, null, 6);
            Intrinsics.checkNotNullParameter(chargeback, "chargeback");
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 1) {
                whiteCircleBadge = new WhiteCircleBadge(dw0.a.Pending);
            } else if (i2 == 2) {
                whiteCircleBadge = new WarningCircleBadge(dw0.a.Info);
            } else if (i2 == 3) {
                whiteCircleBadge = new InactiveCircleBadge(dw0.a.Cancelled);
            } else if (i2 == 4) {
                whiteCircleBadge = new WhiteCircleBadge(dw0.a.Checked);
            } else if (i2 == 5) {
                whiteCircleBadge = new DangerCircleBadge(dw0.a.Error);
            }
            List listC = zhm.u.c(new RowDelegate.Model("CHARGEBACK_ITEM_LIST_ID", new RowDelegate.Model.MainImage.Image40(glyphImage, whiteCircleBadge, null, false, null, false, 60), textLocalisedClause, null, 0, compositeClause, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_link_external_simple, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, new lkf.b(str), null, 0, 0, 0, 0, 532675544));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        return zhm.f0.f322471a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r3 = this;
            tof.a3 r4 = (tof.a3) r4
            h93.f0 r5 = (h93.f0) r5
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            java.lang.Object r6 = r3.receiver
            okf.b r6 = (okf.b) r6
            r6.getClass()
            tof.h3 r4 = r4.A
            r0 = 0
            if (r4 == 0) goto L15
            tof.p6 r4 = r4.f272780b
            goto L16
        L15:
            r4 = r0
        L16:
            if (r4 != 0) goto L1b
            if (r5 != 0) goto L1b
            goto L5e
        L1b:
            if (r4 == 0) goto L2b
            java.lang.String r1 = r4.f272993c
            if (r1 == 0) goto L2b
            boolean r2 = kotlin.text.d0.W(r1)
            if (r2 != 0) goto L28
            goto L29
        L28:
            r1 = r0
        L29:
            if (r1 != 0) goto L35
        L2b:
            if (r5 == 0) goto L34
            b93.j r1 = r5.f150114h
            if (r1 == 0) goto L34
            java.lang.String r1 = r1.f13640b
            goto L35
        L34:
            r1 = r0
        L35:
            if (r1 == 0) goto L3e
            java.lang.String r2 = " "
            java.lang.String r1 = r1.concat(r2)
            goto L3f
        L3e:
            r1 = r0
        L3f:
            if (r1 != 0) goto L43
            java.lang.String r1 = ""
        L43:
            if (r4 == 0) goto L47
            java.lang.String r0 = r4.f272992b
        L47:
            if (r0 == 0) goto L50
            java.lang.String r4 = "··"
            java.lang.String r4 = com.google.android.gms.internal.mlkit_vision_face.a.o(r1, r4, r0)
            goto L58
        L50:
            java.lang.CharSequence r4 = kotlin.text.d0.F0(r1)
            java.lang.String r4 = r4.toString()
        L58:
            vlf.b r6 = r6.d
            qv0.i r0 = r6.b(r5, r4)
        L5e:
            java.util.List r4 = zhm.v.l(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ael.l0.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        k6 k6Var;
        Pair pair;
        k6 k6Var2;
        String strE;
        a3 a3Var = (a3) obj2;
        t3 t3Var = (t3) obj3;
        pkf.j1 j1Var = (pkf.j1) this.receiver;
        j1Var.getClass();
        aim.e eVarB = zhm.u.b();
        if (t3Var == null || (k6Var = t3Var.f273082w0) == null) {
            k6Var = a3Var.L0;
        }
        if (k6Var == null) {
            pair = new Pair(null, zhm.f0.f322471a);
        } else {
            l6 l6Var = k6Var.f272889b;
            m6 m6Var = k6Var.d;
            n6 n6Var = k6Var.f272890c;
            dj0.d dVar = a3Var.N1;
            if (m6Var != null) {
                dj0.d dVar2 = m6Var.f272933a;
                ArrayList arrayList = m6Var.f272934b;
                aim.e eVarB2 = zhm.u.b();
                eVarB2.add(new CellDetailsDelegate.Model("GROSS_AMOUNT_CELL_DETAILS_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(R$string.transactionUI_referral_reward_gross_amount, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
                int i = 0;
                for (Object obj5 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    o6 o6Var = (o6) obj5;
                    eVarB2.add(new CellDetailsDelegate.Model(j6.a.l(i, "TAX_", "_CELL_DETAILS_LIST_ID"), new aw0.t0((Clause) new TextClause(o6Var.f272969a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), new MoneyClause(o6Var.f272970b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
                    i = i2;
                }
                eVarB2.add(new CellDetailsDelegate.Model("NET_AMOUNT_CELL_DETAILS_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(R$string.transactionUI_referral_reward_net_amount, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
                pair = new Pair(dVar2, zhm.u.a(eVarB2));
            } else if (n6Var != null) {
                l6 l6Var2 = n6Var.f272950a;
                pair = new Pair(xjf.e.h(l6Var2), zhm.v.k(new CellDetailsDelegate.Model("GROSS_AMOUNT_CELL_DETAILS_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(R$string.transactionUI_referral_reward_gross_amount, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(xjf.e.h(l6Var2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("TAX_CELL_DETAILS_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(R$string.transactionUI_referral_reward_withholding_tax, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(xjf.e.h(n6Var.f272951b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("NET_AMOUNT_CELL_DETAILS_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(R$string.transactionUI_referral_reward_net_amount, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760)));
            } else {
                pair = new Pair(xjf.e.h(l6Var), zhm.u.c(new CellDetailsDelegate.Model("AMOUNT_CELL_DETAILS_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(R$string.transactionUI_learn_reward_amount, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(xjf.e.h(l6Var), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760)));
            }
        }
        dj0.d dVar3 = (dj0.d) pair.f186385a;
        eVarB.addAll((List) pair.f186386b);
        u80.t ratesMoneyUtils = j1Var.f237080m;
        qd0.b languageProvider = j1Var.f237081n;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        if (t3Var == null || (k6Var2 = t3Var.f273082w0) == null) {
            k6Var2 = a3Var.L0;
        }
        String str = k6Var2 != null ? k6Var2.f272888a : null;
        l6 l6Var3 = k6Var2 != null ? k6Var2.f272889b : null;
        if (str == null || l6Var3 == null) {
            strE = null;
        } else {
            xi0.b bVar = a3Var.k.f115083b;
            xi0.a aVar = xi0.b.Companion;
            String str2 = l6Var3.f272917b;
            aVar.getClass();
            strE = xjf.e.e(bVar, xi0.a.a(str2), new BigDecimal(str).doubleValue(), ratesMoneyUtils, languageProvider, 64);
        }
        CellDetailsDelegate.Model model = strE != null ? new CellDetailsDelegate.Model("PRICE_CELL_DETAILS_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(R$string.transactionUI_learn_reward_price, null, null, 14), (Image) null, 0, false, 30), new TextClause(strE, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760) : null;
        if (model != null) {
            eVarB.add(model);
        }
        CellDetailsDelegate.Model model2 = (dVar3 == null || !dVar3.equals(a3Var.k)) ? new CellDetailsDelegate.Model("EXCHANGED_CELL_DETAILS_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(R$string.transactionUI_learn_reward_exchanged, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(a3Var.k, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null;
        if (model2 != null) {
            eVarB.add(model2);
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0bc1  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0c28  */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 3290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ael.l0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
