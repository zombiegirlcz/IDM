package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input;

import ax4.d;
import ax4.j;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import dh4.m;
import dx4.b2;
import dx4.c5;
import dx4.e1;
import dx4.h3;
import dx4.i0;
import dx4.j3;
import dx4.k3;
import dx4.l2;
import dx4.m4;
import dx4.o4;
import dx4.p4;
import dx4.q3;
import dx4.r0;
import dx4.r5;
import dx4.t0;
import dx4.u1;
import dx4.w;
import dx4.w1;
import dx4.x3;
import dx4.z2;
import fgj.g;
import fh4.i;
import fh4.k;
import fh4.o;
import fh4.p;
import hh4.f;
import hx7.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;
import yji.l;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends h implements p, d {
    public final ay3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RefinancingAccountDetailsInputScreenContract$InputData f68279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fuf.b f68280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cx4.a f68281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f68282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f68283t;

    public c(ay3.a refinancingAccountDetailsInteractor, RefinancingAccountDetailsInputScreenContract$InputData inputData, fuf.b inputValidator, cx4.a creditScreenConstructorControllerExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(refinancingAccountDetailsInteractor, "refinancingAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputValidator, "inputValidator");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = refinancingAccountDetailsInteractor;
        this.f68279p = inputData;
        this.f68280q = inputValidator;
        this.f68281r = creditScreenConstructorControllerExtension;
        this.f68282s = mra.d.b(this, new i(inputData.f68268b, new ax4.b(0)), stateMapper, null, false, 12);
        this.f68283t = e.a(this, new g(this, 2));
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f68281r).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f68281r.B1(config);
    }

    @Override // ax4.d
    public final void C(j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        U1(new m(maskedText, (yqi.b) d0.d0(this.f68280q.a(maskedText).f316033b), 1));
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f68281r).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f68281r.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f68281r).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f68281r.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f68281r).I(info, null);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f68281r.c3(), null, null, new f9d.c(this, (Continuation) null, 16), 3);
    }

    public final k3 I2() {
        ArrayList<e1> arrayListG = d9.e1.g(this.f68279p.f68268b.e, o4.f120701a);
        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListG, 10));
        for (e1 e1Var : arrayListG) {
            if (e1Var == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.items.InputItem");
            }
            arrayList.add((k3) e1Var);
        }
        return (k3) d0.d0(arrayList);
    }

    public final String J2() {
        k3 k3VarI2 = I2();
        if (k3VarI2 != null) {
            hh4.e eVar = f.Companion;
            j3 j3Var = k3VarI2.d;
            eVar.getClass();
            return hh4.e.a(j3Var).b(k3VarI2, ((i) ((j2) this.f68282s.f22677a).getValue()).f135137b);
        }
        RefinancingAccountDetailsInputScreenContract$InputData refinancingAccountDetailsInputScreenContract$InputData = this.f68279p;
        String str = refinancingAccountDetailsInputScreenContract$InputData.f68267a;
        fh4.n nVar = o.Companion;
        p4 p4Var = refinancingAccountDetailsInputScreenContract$InputData.f68268b;
        nVar.getClass();
        throw new IllegalStateException(a0.d.s("Couldn't find input field for facilityId=", str, ", screenId=", fh4.n.a(p4Var).name()));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f68283t;
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        C2(new k(categoryId));
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f68281r).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f68281r.T0(item);
    }

    @Override // ax4.d
    public final void U(String str) {
        this.f68281r.U(str);
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f68281r).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f68281r).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f68281r.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f68281r).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f68281r.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f68281r.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f68281r).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        this.f68281r.e2(documentItem);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f68282s;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f68281r).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f68281r.i0(actionId);
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f68281r).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        k3 k3VarI2 = I2();
        if (k3VarI2 == null) {
            return;
        }
        j3 j3Var = k3VarI2.d;
        h3 h3Var = j3Var instanceof h3 ? (h3) j3Var : null;
        if (h3Var == null) {
            return;
        }
        h.v2(this.f68283t, new RefinancingAccountDetailsInputScreenContract$ModalStep.SingleBankSelector(h3Var, k3VarI2), ModalDestination.Style.POPUP.f98311a);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f68281r).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f68281r.n1(amountInputScreen);
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f68281r).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f68281r.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f68281r.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f68281r.x1(document);
    }
}
