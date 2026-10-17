package l85;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment_v2.ReviewPaymentV2ControllerContract$InputData;
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
import dx4.w;
import dx4.w1;
import dx4.x3;
import dx4.z2;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l0c.s;
import skm.a2;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends oki.h implements h, ax4.d {
    public final ReviewPaymentV2ControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LoanRepaymentAccountModelExtension f192799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y45.j f192800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cx4.a f192801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wie.a f192802s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f192803t;
    public final y u;

    public n(cli.n mapper, ReviewPaymentV2ControllerContract$InputData inputData, LoanRepaymentAccountModelExtension repaymentAccountPickerModelExtension, y45.j repaymentInteractor, cx4.a creditScreenConstructorControllerExtension, wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repaymentAccountPickerModelExtension, "repaymentAccountPickerModelExtension");
        Intrinsics.checkNotNullParameter(repaymentInteractor, "repaymentInteractor");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.o = inputData;
        this.f192799p = repaymentAccountPickerModelExtension;
        this.f192800q = repaymentInteractor;
        this.f192801r = creditScreenConstructorControllerExtension;
        this.f192802s = creditAccountDestinationResolver;
        this.u = mra.d.b(this, new g(new Data(null, null, true, 3, null), inputData.f70575c), mapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(l85.n r5, gim.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof l85.k
            if (r0 == 0) goto L16
            r0 = r6
            l85.k r0 = (l85.k) r0
            int r1 = r0.f192796x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f192796x = r1
            goto L1b
        L16:
            l85.k r0 = new l85.k
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f192796x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            l85.n r5 = r0.u
            yhm.o.b(r6)
            goto L50
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            wie.a r6 = r5.f192802s
            com.revolut.feature.credit.models.CreditAccountType$Loan r2 = new com.revolut.feature.credit.models.CreditAccountType$Loan
            com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment_v2.ReviewPaymentV2ControllerContract$InputData r4 = r5.o
            java.lang.String r4 = r4.f70573a
            r2.<init>(r4)
            r0.u = r5
            r0.f192796x = r3
            rie.a r3 = rie.b.Companion
            r3 = 0
            java.lang.Object r6 = r6.c(r2, r3, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            aii.u r6 = (aii.u) r6
            r5.C1(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l85.n.I2(l85.n, gim.c):java.lang.Object");
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f192801r).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f192801r.B1(config);
    }

    @Override // ax4.d
    public final void C(ax4.j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.f192801r).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f192801r).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f192801r.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f192801r).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f192801r.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f192801r).I(info, null);
    }

    @Override // yji.l
    public final void I1() {
        J2();
    }

    public final void J2() {
        ReviewPaymentV2ControllerContract$InputData reviewPaymentV2ControllerContract$InputData = this.o;
        this.f192803t = yji.l.a1(this, rd0.e.n(boh.f.e(this.f192799p.c3(reviewPaymentV2ControllerContract$InputData.f70573a, reviewPaymentV2ControllerContract$InputData.d), new s(this, 20)), h0.f322473a), null, null, new l1g.e(this, (Continuation) null, 9), 3);
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f192801r.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f192801r).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f192801r.T0(item);
    }

    @Override // ax4.d
    public final void U(String str) {
        this.f192801r.U(str);
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f192801r).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f192801r).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f192801r.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f192801r).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f192801r.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f192801r.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f192801r).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        this.f192801r.e2(documentItem);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f192801r).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f192801r.i0(actionId);
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f192801r).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f192801r.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f192801r).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f192801r.n1(amountInputScreen);
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f192801r).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f192801r.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f192801r.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f192801r.x1(document);
    }
}
