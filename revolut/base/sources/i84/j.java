package i84;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.due_day.CreditCardOfferSelectDueDayScreenContract$InputData;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends oki.h implements f, ax4.d {
    public final g84.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cx4.a f159442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f159443q;

    public j(CreditCardOfferSelectDueDayScreenContract$InputData inputData, g84.e creditCardOfferFlowInteractor, cx4.a creditScreenConstructorControllerExtension, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardOfferFlowInteractor, "creditCardOfferFlowInteractor");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = creditCardOfferFlowInteractor;
        this.f159442p = creditScreenConstructorControllerExtension;
        this.f159443q = mra.d.b(this, new e(inputData.f67379a), stateMapper, null, false, 12);
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f159442p).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f159442p.B1(config);
    }

    @Override // ax4.d
    public final void C(ax4.j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.f159442p).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f159442p).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f159442p.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f159442p).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f159442p.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f159442p).I(info, null);
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f159442p.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f159442p).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f159442p.T0(item);
    }

    @Override // ax4.d
    public final void U(String str) {
        this.f159442p.U(str);
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f159442p).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f159442p).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f159442p.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f159442p).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f159442p.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f159442p.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f159442p).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        this.f159442p.e2(documentItem);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f159443q;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f159442p).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f159442p.i0(actionId);
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f159442p).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f159442p.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f159442p).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f159442p.n1(amountInputScreen);
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f159442p).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f159442p.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f159442p.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f159442p.x1(document);
    }
}
