package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator;

import ax4.d;
import ax4.i;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreenContract$ModalStep;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.ModalDestination;
import cv3.t;
import cv3.u;
import dx4.b2;
import dx4.c5;
import dx4.h0;
import dx4.i0;
import dx4.l2;
import dx4.m4;
import dx4.q3;
import dx4.r0;
import dx4.r5;
import dx4.t0;
import dx4.u1;
import dx4.w;
import dx4.w1;
import dx4.x3;
import dx4.z2;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lfg.d0;
import n68.x;
import nf4.f;
import nf4.g;
import nf4.j;
import nf4.l;
import nf4.m;
import nf4.p;
import nf4.r;
import oki.h;
import org.jetbrains.annotations.NotNull;
import ow3.e;
import vkm.j2;
import vkm.q;
import vkm.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends h implements j, d {

    @NotNull
    public static final m Companion = new m();
    public final cx4.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f68128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f68129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CalculatorScreenContract$InputData f68130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f68131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f68132t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public c(cx4.a creditScreenConstructorControllerExtension, l interactor, e cancellationInteractor, CalculatorScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(cancellationInteractor, "cancellationInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = creditScreenConstructorControllerExtension;
        this.f68128p = interactor;
        this.f68129q = cancellationInteractor;
        this.f68130r = inputData;
        u.Companion.getClass();
        this.f68131s = q.c(t.a());
        this.f68132t = mra.d.b(this, new nf4.e(0), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new n8i.e(this, 11));
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        h0 h0Var = bannerItem.e;
        if ((h0Var == null ? -1 : nf4.n.f214820a[h0Var.ordinal()]) == 1) {
            l2(new r(this, null), new yi5.b(26));
            return;
        }
        zhm.h0 h0Var2 = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CalculatorScreenModel", "Can't support this action " + h0Var, null, h0Var2);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        h.v2(this.u, new CalculatorScreenContract$ModalStep.VariantSelection(config), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // ax4.d
    public final void C(ax4.j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.o).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.o).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.o.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.o).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.o.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.o).I(info, null);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.o.c3(), null, null, new nf4.q(this, null, 1), 3);
    }

    public final void I2(Data data) {
        H2(this.f68132t, new nci.q(data, 3));
        U1(new nd8.i(16));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.o.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.o).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.o.T0(item);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, pyd.c.m(rd0.e.n(q.H(new nf4.q(this, continuation, 0), new q0(q.q(new d0(this.f68131s, 16)), new p(this, continuation, 0), 1)), zhm.h0.f322473a)), null, new naf.j(this, continuation, 7), 3);
        yji.l.b1(this, this.f68128p.a(), null, new p(this, continuation, 1), 3);
        if (pyd.c.E(((nf4.e) ((j2) this.f68132t.f22677a).getValue()).f214806b)) {
            n2(new x(this, continuation, 10), new n7h.c(this, 24));
        }
    }

    @Override // ax4.d
    public final void U(String str) {
        if (str != null) {
            C2(new f(str));
        }
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.o).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.o).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.o.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.o).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.o.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.o.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.o).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        C2(new g(documentItem.getName(), qk.d.v(documentItem, null, null), qk.d.E(documentItem, R$string.credit_application_offer_agreement_action_title)));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f68132t;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.o).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        C2(new f(actionId));
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.o).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.o.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.o).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        f2(new CreditAmountInputScreen(com.revolut.feature.credit.application.plugins.impl.ui.amount_input.a.c(amountInputScreen, amountInputScreen.i, false)), ModalDestination.Style.POPUP.f98311a, new nc1.j(this, amountInputScreen, 6));
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.o).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.o.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.o.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.o.x1(document);
    }
}
