package qu4;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig;
import com.revolut.feature.credit.card.api.navigation.CreditCardSetupAutoPayDestination;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreenContract$InputData;
import dx4.b2;
import dx4.c5;
import dx4.i0;
import dx4.l2;
import dx4.m4;
import dx4.q3;
import dx4.r5;
import dx4.u1;
import dx4.w1;
import dx4.x3;
import dx4.z2;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.r0;
import om4.z3;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.t0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends oki.h implements m, ax4.d {

    @NotNull
    public static final p Companion = new p();
    public final ow4.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditCardRepayPaymentAmountScreenContract$InputData f249242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z3 f249243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cx4.a f249244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lb5.b f249245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f249246t;

    public u(ow4.a moneyUtils, CreditCardRepayPaymentAmountScreenContract$InputData inputData, z3 creditCardRepayInteractor, cli.n stateMapper, cx4.a creditScreenConstructorControllerExtension, lb5.b autopayInteractor) {
        Intrinsics.checkNotNullParameter(moneyUtils, "moneyUtils");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardRepayInteractor, "creditCardRepayInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(autopayInteractor, "autopayInteractor");
        this.o = moneyUtils;
        this.f249242p = inputData;
        this.f249243q = creditCardRepayInteractor;
        this.f249244r = creditScreenConstructorControllerExtension;
        this.f249245s = autopayInteractor;
        this.f249246t = mra.d.b(this, new i(inputData.f69610c, 1535), stateMapper, null, false, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r15 == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(qu4.u r13, java.lang.String r14, gim.c r15) {
        /*
            com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreenContract$InputData r0 = r13.f249242p
            boolean r1 = r15 instanceof qu4.t
            if (r1 == 0) goto L15
            r1 = r15
            qu4.t r1 = (qu4.t) r1
            int r2 = r1.f249241x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f249241x = r2
            goto L1a
        L15:
            qu4.t r1 = new qu4.t
            r1.<init>(r13, r15)
        L1a:
            java.lang.Object r15 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f249241x
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3b
            if (r3 == r6) goto L35
            if (r3 != r5) goto L2d
            yhm.o.b(r15)     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            goto L76
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            java.lang.String r14 = r1.u
            yhm.o.b(r15)
            goto L4b
        L3b:
            yhm.o.b(r15)
            r1.u = r14
            r1.f249241x = r6
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r15 = skm.k0.b(r6, r1)
            if (r15 != r2) goto L4b
            goto L75
        L4b:
            ow4.a r15 = r13.o
            xi0.b r3 = r0.f69609b
            java.lang.String r3 = r3.f306286a
            long r9 = r15.a(r14, r3)
            om4.z3 r13 = r13.f249243q     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            java.lang.String r8 = r0.f69608a     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            r1.u = r4     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            r1.f249241x = r5     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            om4.a4 r13 = (om4.a4) r13     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            dp4.q0 r7 = r13.f226518b     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            r7.getClass()     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            dp4.p0 r6 = new dp4.p0     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            r11 = 0
            r12 = 1
            r6.<init>(r7, r8, r9, r11, r12)     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            skm.p0 r13 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            elm.f r13 = elm.f.f127540b     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            java.lang.Object r15 = skm.e0.J(r13, r6, r1)     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            if (r15 != r2) goto L76
        L75:
            return r2
        L76:
            ym4.a r15 = (ym4.a) r15     // Catch: java.lang.Throwable -> L79 java.util.concurrent.CancellationException -> L7a
            return r15
        L79:
            return r4
        L7a:
            r0 = move-exception
            r13 = r0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: qu4.u.I2(qu4.u, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f249244r).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f249244r.B1(config);
    }

    @Override // ax4.d
    public final void C(ax4.j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.f249244r).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f249244r).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f249244r.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f249244r).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(dx4.w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f249244r.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f249244r).I(info, function1);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.b1(this, rd0.e.n(ngm.n.K(new p40.v(this, continuation, 24)), h0.f322473a), null, new r(this, continuation, 0), 3);
    }

    public final void J2() {
        int i = q.f249236a[((i) ((j2) this.f249246t.f22677a).getValue()).f249228j.ordinal()];
        CreditCardRepayPaymentAmountScreenContract$InputData creditCardRepayPaymentAmountScreenContract$InputData = this.f249242p;
        if (i == 1) {
            C1(new CreditCardSetupAutoPayDestination(creditCardRepayPaymentAmountScreenContract$InputData.f69608a));
        } else if (i == 2) {
            C1(new CreditCardKompotFeatureConfig.AutoPaySettings.AutoPaySettingsDestination(creditCardRepayPaymentAmountScreenContract$InputData.f69608a));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit = Unit.f186387a;
        }
    }

    public final void K2() {
        y yVar = this.f249246t;
        dj0.d dVar = ((i) ((j2) yVar.f22677a).getValue()).f249224b;
        if (dVar != null) {
            z2 z2Var = ((i) ((j2) yVar.f22677a).getValue()).i;
            if (z2Var != null) {
                I(z2Var, new qpb.a(this, dVar, 13));
            } else {
                C2(new k(dVar));
            }
        }
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f249244r.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f249244r).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f249244r.T0(item);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.H(new s(this, continuation, 0), new t0(this.f249246t.B(new qsa.p(13)), 1)), null, new r(this, continuation, 1), 3);
        Flow flowG = ((yb5.e) this.f249245s).g(this.f249242p.f69608a, w4l.j.f294644c);
        od0.i.Companion.getClass();
        yji.l.b1(this, new vkm.y(rd0.e.n(vkm.q.Q(flowG, new r0(continuation, new Data(od0.i.f224256b, null, false, 6, null), this, 15)), h0.f322473a), new aj6.u(3, 4, continuation)), null, new r(this, continuation, 2), 3);
    }

    @Override // ax4.d
    public final void U(String str) {
        this.f249244r.U(str);
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f249244r).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f249244r).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f249244r.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f249244r).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f249244r.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f249244r.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f249244r).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        this.f249244r.e2(documentItem);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f249246t;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f249244r).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f249244r.i0(actionId);
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f249244r).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f249244r.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f249244r).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f249244r.n1(amountInputScreen);
    }

    @Override // ax4.d
    public final void p1(dx4.t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f249244r).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f249244r.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(dx4.r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f249244r.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f249244r.x1(document);
    }
}
