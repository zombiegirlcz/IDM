package com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor;

import ax4.d;
import ax4.i;
import ax4.j;
import cli.k;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.ConstructorCreditPromptControllerContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.a;
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
import dx4.w;
import dx4.w1;
import dx4.x3;
import dx4.z2;
import ht3.f0;
import hx7.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qee.s;
import s09.c;
import s42.f;
import s74.g;
import s74.l;
import s74.m;
import wli.x;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements l, d {
    public final cx4.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f67344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f67345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f67346r;

    public b(cx4.a creditScreenConstructorControllerExtension, x deeplinkHandler, s stateMapper) {
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = creditScreenConstructorControllerExtension;
        this.f67344p = deeplinkHandler;
        this.f67345q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
        this.f67346r = e.a(this, new f(this, 12));
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.o).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.o.B1(config);
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
    public final void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.o.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.o).I(info, null);
    }

    public final void I2() {
        C2(a.C0472a.f67342a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J2(s74.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof s74.f) {
            C2(new m(ht3.d.PRIMARY_BUTTON, ((s74.f) event).f260510a));
            return;
        }
        if (event instanceof g) {
            C2(new m(ht3.d.SECONDARY_BUTTON, ((g) event).f260511a));
            return;
        }
        if (event instanceof s74.h) {
            I2();
            return;
        }
        if (event instanceof s74.i) {
            I2();
            return;
        }
        if (!(event instanceof s74.j)) {
            throw new NoWhenBranchMatchedException();
        }
        ty0.a aVar = ((s74.j) event).f260514a;
        Object[] objArr = 0;
        if (!Intrinsics.f(aVar.f275445a, "CONSTRUCTOR_PROMPT_LINK_ITEM_ID")) {
            n2(new c(this, aVar, objArr == true ? 1 : 0, 18), new whi.b(6));
            return;
        }
        Object obj2 = aVar.d;
        f0 f0Var = obj2 instanceof f0 ? (f0) obj2 : null;
        if (f0Var != null) {
            h.v2(this.f67346r, new ConstructorCreditPromptControllerContract$ModalStep.Info(f0Var.f155267a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            C2(a.b.f67343a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f67346r;
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

    @Override // ax4.d
    public final void U(String str) {
        this.o.U(str);
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
        this.o.e2(documentItem);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f67345q;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.o).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.o.i0(actionId);
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
        this.o.n1(amountInputScreen);
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
