package com.revolut.feature.credit.card.impl.ui.repay.flow;

import al4.n;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardAutoPayPrompt;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$Step;
import ghl.c;
import gu4.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import om4.b4;
import org.jetbrains.annotations.NotNull;
import pm4.e;
import qki.d;
import vkm.j2;
import yki.i;
import yw4.f;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements gu4.b {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final List f69586y = v.k(f.STATEMENT_DEFERRAL_INSTALMENT_PLANS, f.PAYMENT_OPTION_BOLETO, f.PAYMENT_OPTION_SPEI, f.PAYMENT_OPTION_PSE);
    public final CreditCardRepayFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f69587p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vt4.a f69588q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b4 f69589r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f69590s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f69591t;
    public final lb5.b u;
    public final yt4.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f69592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f69593x;

    public b(CreditCardRepayFlowContract$InputData inputData, n creditCardInteractor, vt4.a creditCardBottomSheetMapper, b4 creditCardRevPointsRedeemAvailabilityInteractor, gte.a featureToggleInteractor, e creditCardPaymentDialogMapper, lb5.b autopayInteractor, yt4.a autopayPromptFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardBottomSheetMapper, "creditCardBottomSheetMapper");
        Intrinsics.checkNotNullParameter(creditCardRevPointsRedeemAvailabilityInteractor, "creditCardRevPointsRedeemAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardPaymentDialogMapper, "creditCardPaymentDialogMapper");
        Intrinsics.checkNotNullParameter(autopayInteractor, "autopayInteractor");
        Intrinsics.checkNotNullParameter(autopayPromptFactory, "autopayPromptFactory");
        this.o = inputData;
        this.f69587p = creditCardInteractor;
        this.f69588q = creditCardBottomSheetMapper;
        this.f69589r = creditCardRevPointsRedeemAvailabilityInteractor;
        this.f69590s = featureToggleInteractor;
        this.f69591t = creditCardPaymentDialogMapper;
        this.u = autopayInteractor;
        this.v = autopayPromptFactory;
        this.f69592w = hx7.e.b(this, new CreditCardRepayFlowContract$FlowState(0));
        this.f69593x = d8l.d.a(this, new c(this, 17));
    }

    public final void I2() {
        boolean zC = ((jte.d) this.f69590s).c(CreditCardApi$Toggles$CreditCardAutoPayPrompt.f68672c);
        gu4.d dVar = gu4.d.f146693a;
        if (!zC) {
            C2(dVar);
            return;
        }
        gu4.c cVar = ((CreditCardRepayFlowContract$FlowState) ((j2) this.f69592w.f22677a).getValue()).e;
        if (cVar == null) {
            C2(dVar);
            return;
        }
        int i = gu4.h.f146698a[cVar.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            C2(dVar);
        } else {
            i iVar = this.f69593x;
            h.t2(this, iVar, CreditCardRepayFlowContract$Step.AutopayPrompt.f69573a, false, null, false, 12);
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            iVar.a();
        }
    }

    @Override // yki.j
    public final void M0() {
        n2(new ge7.f(this, null, 28), new gu4.e(this, 1));
    }

    @Override // qki.e
    public final d getState() {
        return this.f69592w;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69593x;
    }
}
