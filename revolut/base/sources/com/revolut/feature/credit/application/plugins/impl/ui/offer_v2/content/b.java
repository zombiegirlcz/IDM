package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content;

import ax4.d;
import ax4.i;
import ax4.j;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$ModalStep;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.ModalDestination;
import cv3.k;
import cv3.s;
import cv3.t;
import cv3.u;
import dx4.b2;
import dx4.c5;
import dx4.i0;
import dx4.l2;
import dx4.m4;
import dx4.q3;
import dx4.r0;
import dx4.r5;
import dx4.t0;
import dx4.u1;
import dx4.w1;
import dx4.x3;
import dx4.z2;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import om4.m1;
import org.jetbrains.annotations.NotNull;
import ox5.m0;
import p5f.c;
import pf4.a0;
import pf4.b0;
import pf4.e;
import pf4.f;
import pf4.m;
import pf4.o;
import pf4.v;
import pf4.w;
import pf4.x;
import vkm.j2;
import vkm.q;
import vkm.q0;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements o, d {

    @NotNull
    public static final w Companion = new w();
    public final cx4.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f68140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final OfferContentScreenContract$InputData f68141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2 f68142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f68143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f68144t;

    public b(cx4.a creditScreenConstructorControllerExtension, v interactor, OfferContentScreenContract$InputData inputData, n stateMapper) {
        e eVar;
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = creditScreenConstructorControllerExtension;
        this.f68140p = interactor;
        this.f68141q = inputData;
        u.Companion.getClass();
        this.f68142r = q.c(t.a());
        s offerContent = inputData.f68134b;
        e.Companion.getClass();
        if (offerContent != null) {
            Intrinsics.checkNotNullParameter(offerContent, "offerContent");
            eVar = new e(new ax4.b(0), new Data(offerContent, null, false, 6, null), false);
        } else {
            eVar = new e(new ax4.b(0), new Data(null, null, true, 3, null), false);
        }
        this.f68143s = mra.d.b(this, eVar, stateMapper, null, false, 12);
        this.f68144t = hx7.e.a(this, new c(this, 16));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof pf4.y
            if (r0 == 0) goto L13
            r0 = r7
            pf4.y r0 = (pf4.y) r0
            int r1 = r0.f235467w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235467w = r1
            goto L18
        L13:
            pf4.y r0 = new pf4.y
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235467w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L71
        L2a:
            r0 = move-exception
            r7 = r0
            r2 = r7
            goto L81
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r7)
            goto L62
        L3a:
            yhm.o.b(r7)
            cli.y r7 = r6.f68143s
            pd4.u r2 = new pd4.u
            r5 = 22
            r2.<init>(r5)
            r6.H2(r7, r2)
            vkm.j2 r7 = r6.f68142r
            cv3.t r2 = cv3.u.Companion
            r2.getClass()
            cv3.u r2 = cv3.t.a()
            r0.f235467w = r4
            r7.getClass()
            r4 = 0
            r7.g(r4, r2)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            if (r7 != r1) goto L62
            goto L70
        L62:
            pf4.v r7 = r6.f68140p     // Catch: java.lang.Throwable -> L2a
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData r2 = r6.f68141q     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = r2.f68135c     // Catch: java.lang.Throwable -> L2a
            r0.f235467w = r3     // Catch: java.lang.Throwable -> L2a
            java.io.Serializable r7 = r7.f(r2, r0)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            r1 = r7
            cv3.s r1 = (cv3.s) r1     // Catch: java.lang.Throwable -> L2a
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L2a
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2a
            r6.L2(r0)     // Catch: java.lang.Throwable -> L2a
            goto L8d
        L81:
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data
            r4 = 5
            r5 = 0
            r1 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r6.L2(r0)
        L8d:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b.I2(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b, gim.c):java.lang.Object");
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.o).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        h.v2(this.f68144t, new OfferContentScreenContract$ModalStep.VariantSelection(config), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // ax4.d
    public final void C(j maskedText) {
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
    public final void H1(dx4.w amountInputScreen) {
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
        l.a1(this, this.o.c3(), null, null, new a0(this, null, 1), 3);
        l.a1(this, this.f68140p.e(), new b0(this, null, 1), null, new x(this, null, 1), 2);
    }

    public final void J2() {
        s sVar = (s) ((e) ((j2) this.f68143s.f22677a).getValue()).f235436b.getContent();
        k kVar = sVar != null ? sVar.e : null;
        if (kVar instanceof cv3.j) {
            C2(new f(((cv3.j) kVar).f109258a));
        } else if (kVar instanceof cv3.l) {
            c8g.c.i(this, ((cv3.l) kVar).f109259a);
        } else {
            C2(new pf4.h(kVar));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f68144t;
    }

    public final void K2() {
        n2(new x(this, null, 0), new m1(1, this, b.class, "handleLoadContentError", "handleLoadContentError(Ljava/lang/Throwable;)Z", 0, 24));
    }

    public final void L2(Data data) {
        Throwable error = data.getError();
        if (error != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
        }
        H2(this.f68143s, new m0(data, 27));
        U1(new pd4.u(21));
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
        l.b1(this, pyd.c.m(rd0.e.n(q.H(new a0(this, continuation, 0), new q0(new olf.e(this.f68142r, 13), new p0l.d(this, continuation, 20), 1)), h0.f322473a)), null, new b0(this, null, 0), 3);
        if (pyd.c.E(((e) ((j2) this.f68143s.f22677a).getValue()).f235436b)) {
            K2();
        }
    }

    @Override // ax4.d
    public final void U(String str) {
        C2(new pf4.l(str));
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
        C2(new pf4.k(documentItem.getName(), qk.d.v(documentItem, null, null), qk.d.E(documentItem, R$string.credit_application_offer_agreement_action_title)));
    }

    @Override // cli.z
    public final g getState() {
        return this.f68143s;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.o).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        C2(new pf4.i(actionId));
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
        f2(new CreditAmountInputScreen(com.revolut.feature.credit.application.plugins.impl.ui.amount_input.a.c(amountInputScreen, amountInputScreen.i, this.f68141q.e)), ModalDestination.Style.POPUP.f98311a, new p5e.h(this, amountInputScreen, 14));
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
        C2(new m(document));
    }
}
