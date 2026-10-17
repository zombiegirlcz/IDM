package com.revolut.feature.credit.card.impl.ui.autopay.flow.settings;

import al4.n;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$Step;
import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.c;
import com.revolut.kompot.navigable.TransitionAnimation;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qki.d;
import sma.f;
import tp4.b;
import tp4.i;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {

    @NotNull
    public static final i Companion = new i();
    public final CreditCardAutopaySettingsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lb5.b f69062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f69063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zwc.a f69064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vt4.b f69065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vp4.a f69066t;
    public final sf0.h u;
    public final i1j.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j60.a f69067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vj4.a f69068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f69069y;
    public final yki.a z;

    public a(CreditCardAutopaySettingsFlowContract$InputData flowInput, lb5.b autopayInteractor, n creditCardInteractor, zwc.a selectPaymentFlowProvider, vt4.b creditCardDialogMapper, vp4.a creditCardAutopayDialogMapper, sf0.h serverErrorParser, i1j.a balancesFilterInteractor, j60.a bottomDialogExtension, vj4.a autopaySetAmountFlowUIConfigMapper) {
        Intrinsics.checkNotNullParameter(flowInput, "flowInput");
        Intrinsics.checkNotNullParameter(autopayInteractor, "autopayInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(selectPaymentFlowProvider, "selectPaymentFlowProvider");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(creditCardAutopayDialogMapper, "creditCardAutopayDialogMapper");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(autopaySetAmountFlowUIConfigMapper, "autopaySetAmountFlowUIConfigMapper");
        this.o = flowInput;
        this.f69062p = autopayInteractor;
        this.f69063q = creditCardInteractor;
        this.f69064r = selectPaymentFlowProvider;
        this.f69065s = creditCardDialogMapper;
        this.f69066t = creditCardAutopayDialogMapper;
        this.u = serverErrorParser;
        this.v = balancesFilterInteractor;
        this.f69067w = bottomDialogExtension;
        this.f69068x = autopaySetAmountFlowUIConfigMapper;
        this.f69069y = e.b(this, CreditCardAutopaySettingsFlowContract$State.Loading.f69044a);
        ta8.a aVar = new ta8.a(this, 29);
        this.z = cp5.d.a(this, CreditCardAutopaySettingsFlowContract$Step.Settings.f69059a, f0.f322471a, aVar);
    }

    public final void I2() {
        yki.a aVar = this.z;
        h.r2(aVar);
        h.t2(this, aVar, CreditCardAutopaySettingsFlowContract$Step.Settings.f69059a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
    }

    public final void J2(CreditScheduledAmountType creditScheduledAmountType, RepaymentSource repaymentSource) {
        String f68556a;
        CreditCardAutopayPayment.PaymentSource paymentSource;
        CreditCardAutopayPayment.PaymentAmount paymentAmountC = com.revolut.feature.credit_card.autopay.api.models_v3.d.c(creditScheduledAmountType);
        d dVar = this.f69069y;
        j2 j2Var = (j2) dVar.f22677a;
        j2 j2Var2 = (j2) dVar.f22677a;
        CreditCardAutopayPayment.AutoPayment f69045a = ((CreditCardAutopaySettingsFlowContract$State) j2Var.getValue()).getF69045a();
        Continuation continuation = null;
        boolean zEquals = paymentAmountC.equals(f69045a != null ? f69045a.e : null);
        boolean z = !zEquals;
        CreditCardAutopayPayment.AutoPayment f69045a2 = ((CreditCardAutopaySettingsFlowContract$State) j2Var2.getValue()).getF69045a();
        String str = (f69045a2 == null || (paymentSource = f69045a2.d) == null) ? null : paymentSource.f70719a;
        boolean zF = Intrinsics.f(str, repaymentSource != null ? repaymentSource.getF68556a() : null);
        boolean z3 = !zF;
        if (zEquals && zF) {
            I2();
        } else {
            l2(new f(this, new tp4.d(z3, z, this), c.a(((CreditCardAutopaySettingsFlowContract$State) j2Var2.getValue()).R4(), null, paymentAmountC, null, (repaymentSource == null || (f68556a = repaymentSource.getF68556a()) == null) ? str : f68556a, 87), continuation, 22), new yi5.b(26));
        }
    }

    @Override // qki.e
    public final d getState() {
        return this.f69069y;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.z;
    }
}
