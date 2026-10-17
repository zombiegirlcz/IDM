package com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen;

import ax4.j;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.FamilyCreditCardSettingsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import dx4.b2;
import dx4.c5;
import dx4.i0;
import dx4.l2;
import dx4.m4;
import dx4.q3;
import dx4.r5;
import dx4.t0;
import dx4.u1;
import dx4.w;
import dx4.w1;
import dx4.x3;
import dx4.z2;
import g4b.a0;
import gqh.o;
import ha1.k;
import hb4.i;
import hb4.l;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qy3.f;
import qy3.g;
import vkm.j2;
import vkm.q;
import vkm.q0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends h implements i, ax4.d {

    @NotNull
    public static final l Companion = new l();
    public final FamilyCreditCardSettingsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gx3.a f67683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cx4.a f67684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f67685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f67686s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f67687t;

    public e(FamilyCreditCardSettingsScreenContract$InputData inputData, gx3.a interactor, cx4.a creditScreenConstructorControllerExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f67683p = interactor;
        this.f67684q = creditScreenConstructorControllerExtension;
        this.f67685r = mra.d.b(this, new hb4.e(new ax4.b(0), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        qy3.b.Companion.getClass();
        this.f67686s = q.c(new qy3.b(r0.g()));
        this.f67687t = hx7.e.a(this, new h1c.c(this, 23));
    }

    public static final f I2(e eVar, qy3.b bVar) {
        qy3.c cVar = (qy3.c) ((hb4.e) ((j2) eVar.f67685r.f22677a).getValue()).f150599b.getContent();
        Long l2 = null;
        g gVar = cVar != null ? cVar.f250142b : null;
        Map map = bVar.f250140a;
        Object orDefault = map.getOrDefault("restrictSensitivePurchases", null);
        if (!(orDefault instanceof Boolean)) {
            orDefault = null;
        }
        Boolean boolValueOf = (Boolean) orDefault;
        if (boolValueOf == null) {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            boolValueOf = gVar != null ? Boolean.valueOf(gVar.f250154c) : null;
        }
        Object orDefault2 = map.getOrDefault("monthlySpendingLimit", null);
        if (!(orDefault2 instanceof Long)) {
            orDefault2 = null;
        }
        Long lValueOf = (Long) orDefault2;
        if (lValueOf == null) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            lValueOf = gVar != null ? Long.valueOf(gVar.f250152a) : null;
        }
        if (map.containsKey("singlePurchaseLimit")) {
            Object orDefault3 = map.getOrDefault("singlePurchaseLimit", null);
            if (!(orDefault3 instanceof Long)) {
                orDefault3 = null;
            }
            Long l3 = (Long) orDefault3;
            if (l3 != null) {
                l2 = l3;
            }
        } else if (gVar != null) {
            l2 = gVar.f250153b;
        }
        return new f(lValueOf != null ? lValueOf.longValue() : 0L, l2, Intrinsics.f(boolValueOf, Boolean.TRUE));
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f67684q).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f67684q.B1(config);
    }

    @Override // ax4.d
    public final void C(j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.f67684q).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f67684q).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f67684q.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f67684q).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f67684q.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f67684q).I(info, null);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, this.f67684q.c3(), null, null, new d(this, continuation, 1), 3);
        yji.l.a1(this, pyd.c.m(rd0.e.n(q.H(new d(this, continuation, 0), new q0(new a0(this.f67686s, 14), new o(this, continuation, 27), 1)), h0.f322473a)), null, null, new gul.n(this, continuation, 28), 3);
        H2(this.f67685r, new k(29));
        n2(new a(this, continuation, 0), new h56.a(this, 20));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f67687t;
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f67684q.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f67684q).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f67684q.T0(item);
    }

    @Override // ax4.d
    public final void U(String str) {
        this.f67684q.U(str);
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f67684q).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f67684q).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f67684q.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f67684q).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f67684q.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f67684q.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f67684q).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        this.f67684q.e2(documentItem);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f67685r;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f67684q).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f67684q.i0(actionId);
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f67684q).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f67684q.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f67684q).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        h.v2(this.f67687t, new FamilyCreditCardSettingsScreenContract$ModalStep.AmountInput(amountInputScreen), ModalDestination.Style.POPUP.f98311a);
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f67684q).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f67684q.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(dx4.r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f67684q.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f67684q.x1(document);
    }
}
