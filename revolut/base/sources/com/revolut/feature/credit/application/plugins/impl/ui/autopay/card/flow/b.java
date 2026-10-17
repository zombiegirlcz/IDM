package com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$Step;
import com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest;
import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import hw3.c;
import hw3.e;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import l54.i;
import qki.d;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements l54.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditCardApplicationAutopayFlowContract$InputData f67133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj4.a f67134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f67135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f67136s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lb5.a f67137t;
    public final uj4.a u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.a f67138w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CreditCardApplicationAutopayFlowContract$InputData flowInput, wj4.a autoPayStatusDialogFactory, c creditApplicationCommonInteractor, e creditApplicationConfigInteractor, lb5.a autoPayInteractor, uj4.a autoPayExternalAccountFlowProvider, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(flowInput, "flowInput");
        Intrinsics.checkNotNullParameter(autoPayStatusDialogFactory, "autoPayStatusDialogFactory");
        Intrinsics.checkNotNullParameter(creditApplicationCommonInteractor, "creditApplicationCommonInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        Intrinsics.checkNotNullParameter(autoPayInteractor, "autoPayInteractor");
        Intrinsics.checkNotNullParameter(autoPayExternalAccountFlowProvider, "autoPayExternalAccountFlowProvider");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67133p = flowInput;
        this.f67134q = autoPayStatusDialogFactory;
        this.f67135r = creditApplicationCommonInteractor;
        this.f67136s = creditApplicationConfigInteractor;
        this.f67137t = autoPayInteractor;
        this.u = autoPayExternalAccountFlowProvider;
        this.v = hx7.e.b(this, new CreditCardApplicationAutopayFlowContract$State(0));
        v vVar = new v(this, 8);
        this.f67138w = cp5.d.a(this, CreditCardApplicationAutopayFlowContract$Step.Loading.f67128a, f0.f322471a, vVar);
    }

    @Override // yji.l
    public final void I1() {
        n2(new i(this, null, 1), new whi.b(6));
    }

    public final AutoPayRequest.Setup P2() {
        d dVar = this.v;
        j2 j2Var = (j2) dVar.f22677a;
        j2 j2Var2 = (j2) dVar.f22677a;
        Integer num = ((CreditCardApplicationAutopayFlowContract$State) j2Var.getValue()).f67124c;
        if (num == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iIntValue = num.intValue();
        CreditScheduledAmountType creditScheduledAmountType = ((CreditCardApplicationAutopayFlowContract$State) j2Var2.getValue()).d;
        if (creditScheduledAmountType != null) {
            return new AutoPayRequest.Setup(iIntValue, creditScheduledAmountType, ((CreditCardApplicationAutopayFlowContract$State) j2Var2.getValue()).c(), null, null);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // qki.e
    public final d getState() {
        return this.v;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67138w;
    }
}
