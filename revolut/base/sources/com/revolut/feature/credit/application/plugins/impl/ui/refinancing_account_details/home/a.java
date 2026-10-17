package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home;

import ax4.d;
import ax4.i;
import ax4.j;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import dce.s0;
import dh4.f;
import dh4.k;
import dh4.m;
import dh4.p;
import dh4.q;
import dx4.b2;
import dx4.c5;
import dx4.d3;
import dx4.e1;
import dx4.i0;
import dx4.j3;
import dx4.k3;
import dx4.l2;
import dx4.m4;
import dx4.n4;
import dx4.q3;
import dx4.r0;
import dx4.r5;
import dx4.t0;
import dx4.u1;
import dx4.w;
import dx4.w1;
import dx4.x3;
import dx4.z2;
import ft3.h1;
import fuf.b;
import hx7.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import mx4.e0;
import oki.h;
import pyd.c;
import vkm.j2;
import yji.l;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements k, d {
    public final ay3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RefinancingAccountDetailsHomeScreenContract$InputData f68255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cx4.a f68256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e0 f68257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f68258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f68259t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(ay3.a accountDetailsInteractor, n stateMapper, RefinancingAccountDetailsHomeScreenContract$InputData inputData, cx4.a creditScreenConstructorControllerExtension, e0 fullScreenModalMapper, b inputValidator) {
        Intrinsics.checkNotNullParameter(accountDetailsInteractor, "accountDetailsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(fullScreenModalMapper, "fullScreenModalMapper");
        Intrinsics.checkNotNullParameter(inputValidator, "inputValidator");
        this.o = accountDetailsInteractor;
        this.f68255p = inputData;
        this.f68256q = creditScreenConstructorControllerExtension;
        this.f68257r = fullScreenModalMapper;
        this.f68258s = inputValidator;
        this.f68259t = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = e.a(this, new dgj.h(this, 1));
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f68256q).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f68256q.B1(config);
    }

    @Override // ax4.d
    public final void C(j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        U1(new m(maskedText, (yqi.b) d0.d0(this.f68258s.a(maskedText).f316033b), 0));
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f68256q).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f68256q.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f68256q).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f68256q.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f68256q).I(info, function1);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f68256q.c3(), null, null, new q(this, null, 1), 3);
    }

    public final void I2(String str) {
        Object next;
        lv3.a aVar = (lv3.a) ((f) ((j2) this.f68259t.f22677a).getValue()).f114744a.getContent();
        if (aVar != null) {
            Iterator it8 = aVar.e.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it8.next();
                    if (Intrinsics.f(((n4) next).f120689a, str)) {
                        break;
                    }
                }
            }
            n4 n4Var = (n4) next;
            if (n4Var != null) {
                C2(new dh4.i(n4Var.f120689a, n4Var.f120690b));
            }
        }
    }

    public final void J2() {
        h1 productPayload = w0.F(this.f68255p.f68253a);
        ay3.a aVar = this.o;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        e44.b bVar = aVar.f11057a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.b1(this, c.m(bVar.e.b(new e44.a(productPayload), loadingStrategy)), null, new q(this, null, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    public final void K2() {
        k3 k3Var;
        Object next;
        y yVar = this.f68259t;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        lv3.a aVar = (lv3.a) ((f) j2Var.getValue()).f114744a.getContent();
        Continuation continuation = null;
        if (aVar != null) {
            ArrayList<e1> arrayListG = d9.e1.g(aVar.d, p.f114759a);
            ArrayList arrayList = new ArrayList(zhm.w.t(arrayListG, 10));
            for (e1 e1Var : arrayListG) {
                if (e1Var == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.items.InputItem");
                }
                arrayList.add((k3) e1Var);
            }
            Iterator it8 = arrayList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                k3 k3Var2 = (k3) next;
                if (((f) j2Var2.getValue()).f114745b.f.containsKey(k3Var2.f120651a) && (k3Var2.d instanceof d3)) {
                    break;
                }
            }
            k3Var = (k3) next;
        } else {
            k3Var = null;
        }
        if (k3Var == null) {
            n2(new cq6.k(this, continuation, 17), new whi.b(6));
            return;
        }
        j3 j3Var = k3Var.d;
        d3 d3Var = j3Var instanceof d3 ? (d3) j3Var : null;
        String str = d3Var != null ? d3Var.d : null;
        if (str == null) {
            str = "";
        }
        j jVar = (j) ((f) j2Var2.getValue()).f114745b.f.get(k3Var.f120651a);
        String str2 = jVar != null ? jVar.f10883b : null;
        n2(new s0(this, k3Var, str.concat(str2 != null ? str2 : ""), continuation, 4), new whi.b(6));
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f68256q.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f68256q).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f68256q.T0(item);
    }

    @Override // yji.l
    public final void T1(long j2) {
        J2();
    }

    @Override // ax4.d
    public final void U(String str) {
        this.f68256q.U(str);
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f68256q).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f68256q).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        I2(infoActionCell.f120661a);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f68256q).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f68256q.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f68256q.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f68256q).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        this.f68256q.e2(documentItem);
    }

    @Override // cli.z
    public final g getState() {
        return this.f68259t;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f68256q).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f68256q.i0(actionId);
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f68256q).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f68256q.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f68256q).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f68256q.n1(amountInputScreen);
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f68256q).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f68256q.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        I2(cellItem.f120735a);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f68256q.x1(document);
    }
}
