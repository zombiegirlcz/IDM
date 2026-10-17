package com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout;

import a3i.q;
import b7d.c;
import bg4.b0;
import bg4.c0;
import bg4.i;
import bg4.j;
import bg4.k;
import bg4.o;
import bg4.p;
import bg4.r;
import bg4.s;
import bg4.w;
import boh.f;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.CheckoutControllerContract$ModalStep;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import ngm.n;
import oki.h;
import q7c.g;
import q7c.m;
import t1j.b;
import vkm.j2;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements i {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f68172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f68173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CheckoutControllerContract$InputData f68174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f68175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f68176t;

    public a(b paymentInteractor, g paymentMethodsInteractor, m quoteInteractor, CheckoutControllerContract$InputData inputData, c0 stateMapper) {
        Intrinsics.checkNotNullParameter(paymentInteractor, "paymentInteractor");
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = paymentInteractor;
        this.f68172p = paymentMethodsInteractor;
        this.f68173q = quoteInteractor;
        this.f68174r = inputData;
        Data data = new Data(null, null, true, 3, null);
        od0.i.Companion.getClass();
        this.f68175s = d.b(this, new j(data, new Data(od0.i.f224256b, null, false, 6, null)), stateMapper, null, false, 12);
        this.f68176t = e.a(this, new c(this, 25));
    }

    @Override // yji.l
    public final void I1() {
        I2();
        l.a1(this, rd0.e.n(f.e(this.f68175s.B(new bek.a(6)), new w(this, 0)), h0.f322473a), null, null, new bg4.y(this, null, 1), 3);
    }

    public final void I2() {
        Continuation continuation = null;
        l.a1(this, rd0.e.n(c8g.a.D(f.e(pyd.c.m(n.K(new q(this, continuation, 10))), new w(this, 1))), h0.f322473a), null, null, new bg4.y(this, continuation, 0), 3);
    }

    public final void J2(r event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof bg4.q;
        s sVar = s.f15113a;
        if (z) {
            C2(sVar);
            return;
        }
        if (event instanceof bg4.m) {
            C2(sVar);
            return;
        }
        boolean z3 = event instanceof p;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        CheckoutControllerContract$ModalStep.PaymentMethodPicker paymentMethodPicker = CheckoutControllerContract$ModalStep.PaymentMethodPicker.f68171a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f68176t;
        if (z3) {
            h.v2(aVar, paymentMethodPicker, popup);
            return;
        }
        if (event instanceof bg4.n) {
            h.v2(aVar, new CheckoutControllerContract$ModalStep.PaymentBreakdown(((bg4.n) event).f15109a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        if (!(event instanceof bg4.l)) {
            if (event instanceof k) {
                C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(((k) event).f15106a, null, 0, false, true, true, 65438))));
                return;
            } else {
                if (!(event instanceof o)) {
                    throw new NoWhenBranchMatchedException();
                }
                I2();
                return;
            }
        }
        bg4.h hVar = (bg4.h) zi0.c.I(((j) ((j2) this.f68175s.f22677a).getValue()).f15104a);
        PaymentMethod.Pocket pocket = hVar.f15103b;
        if (pocket.f84381j.e(hVar.f15102a.f11386g)) {
            l2(new b0(this, pocket, null), new yi5.b(26));
        } else {
            h.v2(aVar, paymentMethodPicker, popup);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f68176t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f68175s;
    }
}
