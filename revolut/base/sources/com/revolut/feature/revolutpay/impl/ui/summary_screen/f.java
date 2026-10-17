package com.revolut.feature.revolutpay.impl.ui.summary_screen;

import android.os.Parcelable;
import aw0.o9;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolutpay.api.declaration.RevolutPayApi$Toggles;
import com.revolut.feature.revolutpay.api.shared.domain.models.AcceptPaymentParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentOptionsDiscount;
import com.revolut.feature.revolutpay.api.shared.domain.models.order.CheckoutMode;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.BuyNowPayLater;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.ExpandableDisclaimerConfiguration;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.PaymentConfiguration;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.SplitBillPaymentParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.PayLaterOffer;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.CardPaymentAvailability;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PayWithAnyFundingOptions;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.revolutpay.api.shared.domain.models.ramp.RampOrderDetails;
import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPoints;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;
import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$InputData;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$ModalStep;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$OutputData;
import com.revolut.feature.revolutpay.shared.R$plurals;
import com.revolut.feature.revolutpay.shared.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.FinishCommand;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jkh.g;
import k7c.d0;
import k7c.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import l6c.b;
import l6c.j;
import n1g.p;
import n33.r0;
import nii.j0;
import nii.u1;
import nii.y0;
import nii.z;
import o9c.i0;
import o9c.l0;
import o9c.q0;
import o9c.s;
import o9c.u;
import o9c.u0;
import oki.h;
import pec.o;
import q6c.n;
import q7c.m;
import q7c.q;
import q97.l1;
import q9c.b0;
import q9c.l;
import q9c.r;
import q9c.t;
import r9c.i;
import u6c.e0;
import u6c.f0;
import vkm.j2;
import vkm.z1;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends h implements u {
    public final u8c.b A;
    public final r8c.a B;
    public final t C;
    public final i D;
    public final ndc.a E;
    public final zcc.a F;
    public final q9c.h G;
    public final s9c.a H;
    public final hec.a I;
    public final l J;
    public final sh5.d K;
    public final sdc.f L;
    public final y M;
    public final z1 N;
    public final z1 O;
    public final com.revolut.kompot.navigable.vc.modal.a P;
    public final RevolutPaySummaryScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f84571p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f84572q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b6c.a f84573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f84574s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g9c.b f84575t;
    public final d0 u;
    public final k67.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p8c.c f84576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final agf.b f84577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f84578y;
    public final tdc.q z;

    public f(RevolutPaySummaryScreenContract$InputData inputData, q revolutPayInteractor, k orderDetailsRepository, b6c.a paymentsInteractor, m quoteInteractor, g9c.b statusDialogModelBuilder, d0 paymentWithChallengeRepository, k67.a gamblingBlockInteractor, p8c.c paymentControllerModelExtension, agf.b transactionWorkflowInteractor, o shippingExtension, tdc.q paymentMethodExtension, u8c.b topUpFlowWrapperExtension, r8c.a moveMoneyNavigationProvider, t paymentOptionsExtension, i orderAmountMapper, ndc.a revPointsBottomSheetProvider, zcc.a paymentSummaryInteractor, q9c.h accountPickerExtension, s9c.a retailFlowProvider, hec.a suspiciousTransactionExtension, l orderCredentialsExtension, sh5.d cryptoFcaDisclaimerWidget, gte.a featureToggleInteractor, sdc.f idempotencyKeyExtension, i0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutPayInteractor, "revolutPayInteractor");
        Intrinsics.checkNotNullParameter(orderDetailsRepository, "orderDetailsRepository");
        Intrinsics.checkNotNullParameter(paymentsInteractor, "paymentsInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(statusDialogModelBuilder, "statusDialogModelBuilder");
        Intrinsics.checkNotNullParameter(paymentWithChallengeRepository, "paymentWithChallengeRepository");
        Intrinsics.checkNotNullParameter(gamblingBlockInteractor, "gamblingBlockInteractor");
        Intrinsics.checkNotNullParameter(paymentControllerModelExtension, "paymentControllerModelExtension");
        Intrinsics.checkNotNullParameter(transactionWorkflowInteractor, "transactionWorkflowInteractor");
        Intrinsics.checkNotNullParameter(shippingExtension, "shippingExtension");
        Intrinsics.checkNotNullParameter(paymentMethodExtension, "paymentMethodExtension");
        Intrinsics.checkNotNullParameter(topUpFlowWrapperExtension, "topUpFlowWrapperExtension");
        Intrinsics.checkNotNullParameter(moveMoneyNavigationProvider, "moveMoneyNavigationProvider");
        Intrinsics.checkNotNullParameter(paymentOptionsExtension, "paymentOptionsExtension");
        Intrinsics.checkNotNullParameter(orderAmountMapper, "orderAmountMapper");
        Intrinsics.checkNotNullParameter(revPointsBottomSheetProvider, "revPointsBottomSheetProvider");
        Intrinsics.checkNotNullParameter(paymentSummaryInteractor, "paymentSummaryInteractor");
        Intrinsics.checkNotNullParameter(accountPickerExtension, "accountPickerExtension");
        Intrinsics.checkNotNullParameter(retailFlowProvider, "retailFlowProvider");
        Intrinsics.checkNotNullParameter(suspiciousTransactionExtension, "suspiciousTransactionExtension");
        Intrinsics.checkNotNullParameter(orderCredentialsExtension, "orderCredentialsExtension");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyExtension, "idempotencyKeyExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f84571p = revolutPayInteractor;
        this.f84572q = orderDetailsRepository;
        this.f84573r = paymentsInteractor;
        this.f84574s = quoteInteractor;
        this.f84575t = statusDialogModelBuilder;
        this.u = paymentWithChallengeRepository;
        this.v = gamblingBlockInteractor;
        this.f84576w = paymentControllerModelExtension;
        this.f84577x = transactionWorkflowInteractor;
        this.f84578y = shippingExtension;
        this.z = paymentMethodExtension;
        this.A = topUpFlowWrapperExtension;
        this.B = moveMoneyNavigationProvider;
        this.C = paymentOptionsExtension;
        this.D = orderAmountMapper;
        this.E = revPointsBottomSheetProvider;
        this.F = paymentSummaryInteractor;
        this.G = accountPickerExtension;
        this.H = retailFlowProvider;
        this.I = suspiciousTransactionExtension;
        this.J = orderCredentialsExtension;
        this.K = cryptoFcaDisclaimerWidget;
        this.L = idempotencyKeyExtension;
        this.M = mra.d.b(this, new s(inputData.getF84525c(), ((jte.d) featureToggleInteractor).c(RevolutPayApi$Toggles.RevolutPayZeroAuthNew.f84298c), 262140), stateMapper, null, false, 12);
        ukm.f fVar = ukm.f.DROP_OLDEST;
        z1 z1VarB = vkm.q.b(0, 2, fVar);
        z1VarB.k(Unit.f186387a);
        this.N = z1VarB;
        this.O = vkm.q.a(0, 1, fVar);
        this.P = hx7.e.a(this, new nx2.f(this, 29));
    }

    @Override // yji.l
    public final void I1() {
        RampOrderDetails f84527h = this.o.getF84527h();
        int i = 16;
        int i2 = 1;
        Continuation continuation = null;
        if (f84527h != null && f84527h.f84413g) {
            n2(new nya.i0(this, f84527h, null, 16), new whi.b(6));
        }
        o95.b bVar = new o95.b(i);
        y yVar = this.M;
        int i3 = 2;
        yji.l.a1(this, vkm.q.Q(vkm.q.J(new r0(mo3.a.g(nim.a.v(yVar.B(bVar), new l0(this, 1)), null, new o4a.a(24), 1), 9), this.O), new u0(0, this, continuation)), null, null, new nt.e(2, this, f.class, "handlePaymentState", "handlePaymentState(Lcom/revolut/feature/revolutpay/api/shared/domain/models/PaymentInitiationResult;)V", 4, 11), 3);
        yji.l.a1(this, vkm.q.P(new p(yVar.B(new o95.b(10)), this, 27), 1), null, null, new m84.c(i3, 12, continuation), 3);
        u0 u0Var = new u0(i2, this, continuation);
        z1 z1Var = this.N;
        yji.l.a1(this, vkm.q.Q(z1Var, u0Var), null, null, null, 7);
        yji.l.a1(this, vkm.q.Q(z1Var, new u0(i3, this, continuation)), null, null, new q0(8, this, continuation), 3);
        yji.l.a1(this, ((b0) this.C).o.B(new l1(18)), null, null, new g(this, continuation, i), 3);
        yji.l.a1(this, xam.a.h(new q0(i3, this, continuation), yVar.B(new o95.b(17))), null, null, new q0(9, this, continuation), 3);
    }

    public final s6c.k I2(q6c.h hVar, pec.e eVar) {
        if (eVar instanceof pec.d) {
            pec.d dVar = (pec.d) eVar;
            dj0.d dVar2 = new dj0.d(dVar.f235364c.f204649a, hVar.f242543l);
            dj0.d dVar3 = dVar.f235363b.f84739c;
            return new s6c.k(dVar2, pyd.c.H(dVar2, dVar3), dVar3);
        }
        if (!(eVar instanceof pec.b) && !(eVar instanceof pec.c)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentConfiguration f84526g = this.o.getF84526g();
        SplitBillPaymentParams splitBillPaymentParams = f84526g != null ? f84526g.f84343b : null;
        this.F.getClass();
        dj0.d dVar4 = zcc.a.a(hVar, splitBillPaymentParams).f242558h;
        return new s6c.k(dVar4, dVar4, null);
    }

    public final void J2(Throwable th10) {
        H2(this.M, new o95.b(13));
        s1();
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.P;
    }

    public final void K2(l6c.b bVar) {
        y0 y0VarC;
        y0 y0Var;
        o3k.a aVar = new o3k.a(bVar, 24);
        y yVar = this.M;
        H2(yVar, aVar);
        j2 j2Var = (j2) yVar.f22677a;
        boolean z = bVar instanceof l6c.h;
        g9c.b bVar2 = this.f84575t;
        if (!z) {
            if (bVar instanceof l6c.e) {
                u6c.k kVar = ((l6c.e) bVar).f192391a;
                M2();
                T2(kVar);
                return;
            }
            if (bVar instanceof l6c.f) {
                u6c.k kVar2 = ((l6c.f) bVar).f192392a;
                M2();
                T2(kVar2);
                return;
            }
            if (bVar instanceof b.C1094b) {
                M2();
                T2(null);
                return;
            }
            if (bVar instanceof l6c.i) {
                l6c.i iVar = (l6c.i) bVar;
                L2(iVar.f192398b, iVar.f192397a);
                return;
            }
            if (bVar instanceof l6c.d) {
                String str = ((l6c.d) bVar).f192389a;
                s1();
                if (str != null) {
                    H2(yVar, new o23.l(str, 13));
                    return;
                }
                return;
            }
            if (bVar instanceof l6c.c) {
                s1();
                return;
            }
            if ((bVar instanceof l6c.g) || (bVar instanceof j)) {
                return;
            }
            if (bVar instanceof b.a) {
                M2();
                rdc.d dVar = bVar2.f141530a;
                yji.l.a1(this, X1(new y0("ALREADY_COMPLETED_DIALOG_ID", new z(new TextLocalisedClause(R$string.revolut_pay_accept_payment_already_completed_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_accept_payment_already_completed_description, null, null, 14), null, null, null, null, true, null, null, null, null, null, null, 32508), false, 4)), null, null, new q0(0, this, null), 3);
                return;
            } else {
                if (!(bVar instanceof l6c.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                M2();
                sdc.f fVar = this.L;
                fVar.X2(fVar.f261853n, new scl.e(fVar, 4));
                rdc.d dVar2 = bVar2.f141530a;
                X1(new y0("FAILURE_PAYMENT_DIALOG_ID", new z(new TextLocalisedClause(R$string.revolut_pay_accept_payment_failure_title_unable_to_complete, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_common_loading_error_subtitle, null, null, 14), null, null, null, null, true, null, null, null, null, null, null, 32508), false, 4));
                return;
            }
        }
        String str2 = ((l6c.h) bVar).f192396b;
        M2();
        r rVar = (r) ((s) j2Var.getValue()).f223229h.getContent();
        s6c.p pVarA = rVar != null ? rVar.a() : null;
        RevPoints revPoints = pVarA != null ? pVarA.d : null;
        RevolutPaySummaryScreenContract$InputData revolutPaySummaryScreenContract$InputData = this.o;
        boolean i = revolutPaySummaryScreenContract$InputData.getI();
        boolean zH = ((s) j2Var.getValue()).h();
        u1.b bVar3 = u1.b.f216225a;
        if (zH) {
            Object content = ((s) j2Var.getValue()).f223227c.getContent();
            if (content == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String merchantName = ((q6c.h) content).f242544m.f242536c;
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            y0VarC = new y0("SUCCESS_AUTHORISATION_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.revolut_pay_accept_payment_zero_authorization_title, zhm.u.c(new TextClause(merchantName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Clause) new TextLocalisedClause(R$string.revolut_pay_accept_payment_zero_authorization_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) bVar3, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4044), false, 4);
        } else if (((s) j2Var.getValue()).f()) {
            boolean i2 = revolutPaySummaryScreenContract$InputData.getI();
            bVar2.getClass();
            y0VarC = new y0("SUCCESS_AUTHORISATION_DIALOG_ID", new j0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_accept_payment_success_title_mit, null, null, 14), (Clause) new TextLocalisedClause(i2 ? com.revolut.feature.revolutpay.impl.R$string.revolut_pay_accept_payment_success_description : com.revolut.feature.revolutpay.impl.R$string.revolut_pay_accept_payment_success_description_without_redirect, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) bVar3, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4044), false, 4);
        } else if (revPoints != null) {
            long j2 = revPoints.f84427a;
            r rVar2 = (r) ((s) j2Var.getValue()).f223229h.getContent();
            s6c.p pVarA2 = rVar2 != null ? rVar2.a() : null;
            dj0.d dVar3 = pVarA2 != null ? pVarA2.f260233b : null;
            gec.i iVar2 = bVar2.f141531b;
            if (dVar3 == null || dVar3.k()) {
                int i3 = i ? R$plurals.revolut_pay_accept_payment_success_description_reward : R$plurals.revolut_pay_accept_payment_success_description_without_redirect_reward;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_accept_payment_success_title, null, null, 14);
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2, 6);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "getMajorUnits-impl(...)");
                y0Var = new y0("SUCCESS_PAYMENT_DIALOG_ID", new j0((Clause) textLocalisedClause, (Clause) new TextLocalisedQuantityClause(i3, bigDecimalValueOf, zhm.u.c(udc.a.a(j2, new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null))), (Style) null, 24), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) bVar3, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4044), false, 4);
            } else if (j2 == 0 && dVar3.f(dj0.d.e)) {
                y0VarC = new y0("SUCCESS_PAYMENT_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.revolut_pay_accept_payment_success_title, null, null, 14), (Clause) new TextLocalisedClause(i ? R$string.revolut_pay_accept_payment_success_subtitle_discount : R$string.revolut_pay_accept_payment_success_subtitle_without_redirect_discount, zhm.u.c(new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254), null, 8)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) bVar3, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4044), false, 4);
            } else {
                int i5 = i ? R$plurals.revolut_pay_accept_payment_success_description_reward_and_discount : R$plurals.revolut_pay_accept_payment_success_description_without_redirect_reward_and_discount;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.revolut_pay_accept_payment_success_title, null, null, 14);
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j2, 6);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "getMajorUnits-impl(...)");
                y0Var = new y0("SUCCESS_PAYMENT_DIALOG_ID", new j0((Clause) textLocalisedClause2, (Clause) new TextLocalisedQuantityClause(i5, bigDecimalValueOf2, v.k(new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), udc.a.a(j2, new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null))), (Style) null, 24), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) bVar3, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4044), false, 4);
            }
            y0VarC = y0Var;
        } else {
            y0VarC = bVar2.c(i);
        }
        yji.l.a1(this, X1(y0VarC), null, null, new o4a.b(this, str2, null, 2), 3);
    }

    public final void L2(String str, String transactionId) {
        s1();
        FinishCommand command = new FinishCommand(-1, null, null, 6);
        d0 d0Var = this.u;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(command, "command");
        d0Var.f181950a.f("PENDING_COMMAND_MEMORY_CACHE_ID", command);
        d0Var.a(str);
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        d0Var.f181950a.f("PENDING_TRANSACTION_ID_MEMORY_CACHE_ID", transactionId);
        l2(new d(this, transactionId, str, null), new yi5.b(26));
    }

    public final void M2() {
        H2(this.M, new o95.b(14));
    }

    public final void N2(PaymentMethod paymentMethod, String str, String str2, BuyNowPayLater buyNowPayLater) {
        PaymentOptionsDiscount paymentOptionsDiscount;
        String str3;
        q6c.j jVar;
        Object next;
        t6c.e eVar;
        y yVar = this.M;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        List list = ((s) j2Var.getValue()).f223230j;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((u6c.z) it8.next()).a());
        }
        List listN = c6d.b.N(arrayList);
        r rVar = (r) ((s) j2Var2.getValue()).f223229h.getContent();
        if (rVar != null) {
            t6c.f fVar = rVar.f243875b;
            paymentOptionsDiscount = (fVar == null || (eVar = fVar.f268292b) == null) ? null : new PaymentOptionsDiscount(fVar.f268291a, eVar.f268289b);
        } else {
            paymentOptionsDiscount = null;
        }
        q9c.f fVar2 = (q9c.f) ((s) j2Var2.getValue()).f223236r.getContent();
        String strA = fVar2 != null ? fVar2.a() : null;
        if (strA == null) {
            throw new IllegalArgumentException("Credentials need to be loaded to initiate payment");
        }
        RevolutPaySummaryScreenContract$InputData revolutPaySummaryScreenContract$InputData = this.o;
        CheckoutMode f84525c = revolutPaySummaryScreenContract$InputData.getF84525c();
        PaymentConfiguration f84526g = revolutPaySummaryScreenContract$InputData.getF84526g();
        SplitBillPaymentParams splitBillPaymentParams = f84526g != null ? f84526g.f84343b : null;
        PaymentConfiguration f84526g2 = revolutPaySummaryScreenContract$InputData.getF84526g();
        String orderToken = strA;
        PaymentInitiationParams paymentInitiationParams = new PaymentInitiationParams(orderToken, paymentMethod, str2, f84525c, str, paymentOptionsDiscount, listN, splitBillPaymentParams, f84526g2 != null ? f84526g2.f84344c : null, buyNowPayLater, 1024);
        sdc.f fVar3 = this.L;
        fVar3.getClass();
        Intrinsics.checkNotNullParameter(paymentInitiationParams, "paymentInitiationParams");
        vki.a aVar = fVar3.f261853n;
        sdc.e eVar2 = (sdc.e) ((j2) aVar.f22677a).getValue();
        PaymentInitiationParams paymentInitiationParams2 = eVar2.f261850b;
        sdc.c cVarZ2 = (paymentInitiationParams2 == null || paymentInitiationParams2.equals(paymentInitiationParams)) ? eVar2.f261849a : fVar3.Z2();
        fVar3.X2(aVar, new s31.a(cVarZ2, paymentInitiationParams, 26));
        String value = cVarZ2.getValue();
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        CheckoutMode checkoutMode = paymentInitiationParams.d;
        Intrinsics.checkNotNullParameter(checkoutMode, "checkoutMode");
        PaymentInitiationParams paymentInitiationParams3 = new PaymentInitiationParams(orderToken, paymentMethod, paymentInitiationParams.f84328c, checkoutMode, paymentInitiationParams.e, paymentInitiationParams.f, paymentInitiationParams.f84329g, paymentInitiationParams.f84330h, paymentInitiationParams.i, paymentInitiationParams.f84331j, value);
        RevolutPaySummaryScreenContract$InputData.Standard standard = revolutPaySummaryScreenContract$InputData instanceof RevolutPaySummaryScreenContract$InputData.Standard ? (RevolutPaySummaryScreenContract$InputData.Standard) revolutPaySummaryScreenContract$InputData : null;
        String str4 = standard != null ? standard.d : null;
        if (a0.z(str4, "INPERSON_TERMINAL", true)) {
            h.v2(this.P, new RevolutPaySummaryScreenContract$ModalStep.TerminalPayment(paymentInitiationParams3), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
            return;
        }
        PaymentConfiguration f84526g3 = revolutPaySummaryScreenContract$InputData.getF84526g();
        if (f84526g3 != null && (str3 = f84526g3.f84342a) != null) {
            q6c.h hVar = (q6c.h) ((s) j2Var2.getValue()).f223227c.getContent();
            if (hVar != null) {
                Iterator it9 = hVar.f242547q.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it9.next();
                        if (Intrinsics.f(((q6c.j) next).f242548a, str3)) {
                            break;
                        }
                    }
                }
                jVar = (q6c.j) next;
            } else {
                jVar = null;
            }
            q6c.m mVar = hVar != null ? hVar.f242538b : null;
            boolean z = jVar != null;
            n nVar = jVar != null ? jVar.f242549b : null;
            l6c.b bVar = ((s) j2Var2.getValue()).f223233n;
            IllegalStateException illegalStateException = new IllegalStateException("Revolut Pay applink payment falling back to initiation: orderState=" + mVar + ", paymentMatchFound=" + z + ", matchedPaymentState=" + nVar + ", initiationResult=" + (bVar != null ? bVar.getClass().getSimpleName() : null));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        U2();
        int i = 4;
        int i2 = 2;
        yji.l.a1(this, ((q7c.j) this.f84573r).c(paymentInitiationParams3, str4), new nt.e(i2, this, f.class, "handlePaymentAttemptError", "handlePaymentAttemptError(Ljava/lang/Throwable;)Z", i, 4), null, new nt.e(i2, this, f.class, "handlePaymentState", "handlePaymentState(Lcom/revolut/feature/revolutpay/api/shared/domain/models/PaymentInitiationResult;)V", i, 3), 2);
    }

    public final void O2() {
        Object next;
        t6c.k kVar;
        t6c.n nVar;
        t6c.f fVar;
        t6c.e eVar;
        y yVar = this.M;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        f0 f0Var = (f0) ((s) j2Var.getValue()).i.getContent();
        if (!(f0Var instanceof u6c.a0)) {
            if (f0Var instanceof e0) {
                IllegalStateException illegalStateException = new IllegalStateException("Pay button clicked with disallowed payment method");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return;
            }
            if (f0Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Pay button clicked with null payment method");
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            return;
        }
        Iterator it8 = ((u6c.a0) f0Var).f277543b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (!((s) j2Var2.getValue()).f223230j.contains((u6c.z) next)) {
                    break;
                }
            }
        }
        u6c.z zVar = (u6c.z) next;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.P;
        if (zVar != null) {
            h.v2(aVar, new RevolutPaySummaryScreenContract$ModalStep.RiskScreen(zVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        yhm.r rVar = (yhm.r) t1.u(((s) j2Var2.getValue()).d, ((s) j2Var2.getValue()).k, ((s) j2Var2.getValue()).f223229h).getContent();
        if (rVar != null) {
            do3.n nVar2 = (do3.n) rVar.f314201a;
            od0.i iVar = (od0.i) rVar.f314202b;
            r rVar2 = (r) rVar.f314203c;
            l6c.b bVar = ((s) j2Var2.getValue()).f223233n;
            PaymentScheduleSelection paymentScheduleSelection = rVar2.f243876c;
            PaymentScheduleSelection.PayLater payLater = paymentScheduleSelection instanceof PaymentScheduleSelection.PayLater ? (PaymentScheduleSelection.PayLater) paymentScheduleSelection : null;
            t6c.o oVar = rVar2.f243874a;
            if (bVar instanceof l6c.c) {
                l6c.c cVar = (l6c.c) bVar;
                boolean i = this.o.getI();
                r rVar3 = (r) ((s) j2Var2.getValue()).f223229h.getContent();
                String str = cVar.f192386a;
                od0.i iVar2 = (od0.i) ((s) j2Var2.getValue()).k.getContent();
                String strD = com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.d(iVar2 != null ? (PaymentMethod) iVar2.f224257a : null);
                PaymentOptionsDiscount paymentOptionsDiscount = (rVar3 == null || (fVar = rVar3.f243875b) == null || (eVar = fVar.f268292b) == null) ? null : new PaymentOptionsDiscount(fVar.f268291a, eVar.f268289b);
                if (rVar3 != null && (nVar = rVar3.f243874a.f268307b) != null) {
                    strB = nVar.f268305c;
                }
                l2(new a(this, new AcceptPaymentParams(str, strD, paymentOptionsDiscount, strB), i, cVar, null), new yi5.b(26));
                return;
            }
            if (!iVar.d()) {
                int i2 = jli.h.f175850a;
                return;
            }
            boolean zX2 = ((PaymentMethod) iVar.c()).x2();
            ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
            if (zX2) {
                PaymentMethod.Card card = (PaymentMethod.Card) iVar.c();
                t6c.n nVar3 = oVar.f268307b;
                String str2 = nVar3 != null ? nVar3.f268305c : null;
                String str3 = nVar2.f116411g;
                q9c.f fVar2 = (q9c.f) ((s) j2Var2.getValue()).f223236r.getContent();
                strB = fVar2 != null ? fVar2.b() : null;
                if (strB == null) {
                    throw new IllegalArgumentException("Credentials need to be loaded to request CVV");
                }
                h.v2(aVar, new RevolutPaySummaryScreenContract$ModalStep.RequestCvv(card, str2, str3, strB), fullscreen_fade);
                return;
            }
            if (payLater == null) {
                PaymentMethod paymentMethod = (PaymentMethod) iVar.c();
                t6c.n nVar4 = oVar.f268307b;
                N2(paymentMethod, nVar4 != null ? nVar4.f268305c : null, nVar2.f116411g, null);
                return;
            }
            PayLaterOffer payLaterOffer = payLater.f84445a;
            PaymentMethod paymentMethod2 = (PaymentMethod) iVar.c();
            String str4 = nVar2.f116411g;
            t6c.f fVar3 = rVar2.f243875b;
            String str5 = (fVar3 == null || (kVar = fVar3.f268293c) == null) ? null : kVar.f268300a;
            if (str5 == null) {
                t6c.n nVar5 = oVar.f268307b;
                h.v2(aVar, new RevolutPaySummaryScreenContract$ModalStep.PayLaterApplication(paymentMethod2, nVar5 != null ? nVar5.f268305c : null, str4, payLaterOffer.f84353a), fullscreen_fade);
            } else {
                t6c.n nVar6 = oVar.f268307b;
                N2(paymentMethod2, nVar6 != null ? nVar6.f268305c : null, str4, new BuyNowPayLater(str5, payLaterOffer.f84353a));
            }
        }
    }

    public final void P2() {
        y yVar = this.M;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        s6c.l lVar = (s6c.l) ((s) j2Var.getValue()).f.getContent();
        dj0.d orderTotal = lVar != null ? lVar.d() : null;
        if (orderTotal == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        od0.i iVar = (od0.i) ((s) j2Var2.getValue()).k.getContent();
        PaymentMethod paymentMethod = iVar != null ? (PaymentMethod) iVar.f224257a : null;
        q6c.h hVar = (q6c.h) ((s) j2Var2.getValue()).f223227c.getContent();
        CardPaymentAvailability cardPaymentAvailabilityA = hVar != null ? hVar.a(this.o.getF84526g()) : null;
        if (cardPaymentAvailabilityA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        PayWithAnyFundingOptions fundingOptions = new PayWithAnyFundingOptions(cardPaymentAvailabilityA, true, true);
        tdc.r rVar = (tdc.r) this.z;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(orderTotal, "orderTotal");
        Intrinsics.checkNotNullParameter(fundingOptions, "fundingOptions");
        tdc.h hVarB = ((tdc.m) ((j2) rVar.f269966p.f22677a).getValue()).b();
        if (hVarB == null) {
            throw new IllegalArgumentException("Order identifier accessed before order passed in observing payment method");
        }
        tdc.g gVar = rVar.o;
        u6c.t tVarL = gVar.l();
        String str = hVarB.f269953c;
        u6c.u uVar = (u6c.u) rVar.f269968r.getValue();
        PaymentConfiguration f84526g = gVar.getF84526g();
        rVar.N2(rVar.o2(new w6c.i(new PayWithAnyControllerDescriptor$InputData(tVarL, orderTotal, paymentMethod, str, uVar, fundingOptions, null, f84526g != null ? f84526g.f84342a : null, hVarB.f269952b, hVarB.f269951a, 128))), ModalDestination.Style.FULLSCREEN_FADE.f98307a, new su0.c(1, rVar, tdc.r.class, "handlePayWithAnyResult", "handlePayWithAnyResult(Lcom/revolut/feature/revolutpay/api/shared/navigation/PayWithAnyControllerDescriptor$OutputData;)V", 0, 18));
    }

    public final void Q2(ExpandableDisclaimerConfiguration expandableDisclaimerConfiguration) {
        h.v2(this.P, new RevolutPaySummaryScreenContract$ModalStep.ExpandableDisclaimer(expandableDisclaimerConfiguration), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final void R2(Quote quote, dj0.d dVar) {
        y yVar = this.M;
        l71.d dVar2 = (l71.d) ((s) ((j2) yVar.f22677a).getValue()).e.getContent();
        od0.i iVar = (od0.i) ((s) ((j2) yVar.f22677a).getValue()).k.getContent();
        PaymentMethod paymentMethod = iVar != null ? (PaymentMethod) iVar.f224257a : null;
        PaymentMethod.Pocket pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : null;
        if (dVar2 == null && pocket == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Could not open payment breakdown disclaimer as user company and pocket are null");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        if (dVar2 == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Could not open payment breakdown disclaimer as user company is null");
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            return;
        }
        if (pocket != null) {
            h.v2(this.P, new RevolutPaySummaryScreenContract$ModalStep.PaymentBreakdown(quote, dVar, new PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Default(pocket.f84379g, hb9.b.C(dVar2.a()))), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        IllegalStateException illegalStateException3 = new IllegalStateException("Could not open payment breakdown disclaimer as user pocket is null");
        h0 h0Var3 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
    }

    public final void S2(String str) {
        aii.r paymentSuccessful;
        q9c.f fVar = (q9c.f) ((s) ((j2) this.M.f22677a).getValue()).f223236r.getContent();
        if (fVar instanceof q9c.e) {
            paymentSuccessful = new RevolutPaySummaryScreenContract$OutputData.OAuthPaymentSuccessful(((q9c.e) fVar).f243863a.f277732c);
        } else {
            if (str == null || !this.o.getF84528j()) {
                str = null;
            }
            paymentSuccessful = new RevolutPaySummaryScreenContract$OutputData.PaymentSuccessful(str);
        }
        C2(paymentSuccessful);
    }

    public final void T2(u6c.k kVar) {
        q6c.h hVar = (q6c.h) ((s) ((j2) this.M.f22677a).getValue()).f223227c.getContent();
        yji.l.a1(this, X1(this.f84575t.b(hVar != null ? hVar.f242544m.f242536c : null, kVar)), null, null, new e(this, kVar, null), 3);
    }

    public final void U2() {
        boolean zH = ((s) ((j2) this.M.f22677a).getValue()).h();
        rdc.d dVar = this.f84575t.f141530a;
        X1(rdc.d.a(zH));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.M;
    }

    @Override // oki.h
    public final void onBackPressed() {
        l6c.b bVar = ((s) ((j2) this.M.f22677a).getValue()).f223233n;
        if (bVar instanceof l6c.c) {
            String paymentToken = ((l6c.c) bVar).f192387b;
            q7c.j jVar = (q7c.j) this.f84573r;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
            skm.e0.C(jVar.f242820c, null, null, new prl.k(21, jVar, paymentToken, (Continuation) null), 3);
        }
        C2(RevolutPaySummaryScreenContract$OutputData.BackPressed.f84555a);
    }
}
