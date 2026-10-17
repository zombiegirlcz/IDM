package ff4;

import ahe.y0;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.credit.application.plugins.api.models.action_button.Action;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.ModalDestination;
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
import ft3.h1;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 extends oki.h implements r, ax4.d {

    @NotNull
    public static final v Companion = new v();
    public final OfferContentScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cx4.a f134708p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f134709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f64.a f134710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f134711s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cli.y f134712t;
    public final AccountCellItemDelegate u;
    public final j2 v;

    public b0(cli.n stateMapper, OfferContentScreenContract$InputData inputData, cx4.a creditScreenConstructorControllerExtension, t offerContentScreenInteractor, f64.a repaymentTypeSelectionDialogFactory, j60.a bottomDialogScreenExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(offerContentScreenInteractor, "offerContentScreenInteractor");
        Intrinsics.checkNotNullParameter(repaymentTypeSelectionDialogFactory, "repaymentTypeSelectionDialogFactory");
        Intrinsics.checkNotNullParameter(bottomDialogScreenExtension, "bottomDialogScreenExtension");
        this.o = inputData;
        this.f134708p = creditScreenConstructorControllerExtension;
        this.f134709q = offerContentScreenInteractor;
        this.f134710r = repaymentTypeSelectionDialogFactory;
        this.f134711s = bottomDialogScreenExtension;
        h hVar = i.Companion;
        Long l2 = inputData.f68079a;
        Long l3 = inputData.f68080b;
        fu3.a aVar = inputData.f68081c;
        hVar.getClass();
        this.f134712t = mra.d.b(this, h.a(l2, l3, aVar), stateMapper, null, false, 12);
        this.u = new AccountCellItemDelegate();
        cv3.u.Companion.getClass();
        this.v = vkm.q.c(cv3.t.a());
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f134708p).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f134708p.B1(config);
    }

    @Override // ax4.d
    public final void C(ax4.j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.f134708p).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f134708p).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f134708p.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f134708p).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(dx4.w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f134708p.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f134708p).I(info, null);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f134708p.c3(), null, null, new w(this, null, 1), 3);
        AccountCellItemDelegate accountCellItemDelegate = this.u;
        yji.l.a1(this, rd0.e.b(accountCellItemDelegate.f51551c.f53218h), null, null, new a0(this, null), 3);
        this.f134711s.d(zhm.v.k(accountCellItemDelegate, new PlainTextDelegate()));
    }

    public final void I2() {
        bv3.c cVar;
        bv3.b bVar = (bv3.b) K2().f.getContent();
        Action action = (bVar == null || (cVar = bVar.f18943a) == null) ? null : cVar.k.f66299b;
        if (action == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C2(new m(action, K2().f134721c, K2().d, K2().e));
    }

    public final void J2() {
        n2(new ewa.d(this, null, 13), new whi.b(6));
    }

    public final i K2() {
        return (i) ((j2) this.f134712t.f22677a).getValue();
    }

    public final boolean L2() {
        cli.y yVar = this.f134712t;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        if (((i) j2Var.getValue()).f134722g) {
            return false;
        }
        return (((i) j2Var2.getValue()).f.getLoading() && ((i) j2Var2.getValue()).f.getContent() == null) ? false : true;
    }

    public final void M2() {
        h1 h1VarF = w0.F(this.o.e);
        yji.l.b1(this, pyd.c.m(rd0.e.n(rd0.e.b(this.f134709q.d(new eu3.d(K2().f134721c, K2().d, K2().e), h1VarF)), h0.f322473a)), null, new w(this, null, 0), 3);
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f134708p.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f134708p).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f134708p.T0(item);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (pyd.c.E(((i) ((j2) this.f134712t.f22677a).getValue()).f)) {
            M2();
        }
        Continuation continuation = null;
        yji.l.b1(this, pyd.c.m(rd0.e.n(new amh.w(vkm.q.Q(new q0(vkm.q.q(new dfj.f(this.v, 24)), new z(this, continuation, 0), 1), new y0(continuation, this, this.o.e, 8)), 11), h0.f322473a)), null, new f9d.c(this, continuation, 11), 3);
    }

    @Override // ax4.d
    public final void U(String str) {
        fu3.c cVar;
        if (!Intrinsics.f(str, "editRepaymentType")) {
            C2(new o(K2().f134721c, K2().d, K2().e));
            return;
        }
        bv3.b bVar = (bv3.b) K2().f.getContent();
        if (bVar == null || (cVar = bVar.f18945c) == null) {
            return;
        }
        this.f134710r.getClass();
        this.f134711s.x(f64.a.a(cVar));
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f134708p).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f134708p).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f134708p.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f134708p).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f134708p.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f134708p.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f134708p).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        C2(new p(documentItem.getName(), qk.d.v(documentItem, K2().f134721c, K2().d), qk.d.E(documentItem, R$string.credit_application_offer_agreement_action_title)));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f134712t;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f134708p).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f134708p.i0(actionId);
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f134708p).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f134708p.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f134708p).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        f2(new CreditAmountInputScreen(com.revolut.feature.credit.application.plugins.impl.ui.amount_input.a.c(amountInputScreen, amountInputScreen.i, false)), ModalDestination.Style.POPUP.f98311a, new f0d.l(this, amountInputScreen, 25));
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f134708p).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f134708p.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f134708p.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f134708p.x1(document);
    }
}
