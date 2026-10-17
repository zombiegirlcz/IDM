package com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content;

import a82.q;
import android.net.Uri;
import aw0.o9;
import ax4.d;
import ax4.i;
import ax4.j;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ActiveCreditFacilityRetention;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferences;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.IncompleteApplicationRetention;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.DocumentsContentContract$ModalStep;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import dx4.b2;
import dx4.c5;
import dx4.i0;
import dx4.l2;
import dx4.m4;
import dx4.p3;
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
import h74.g;
import hx7.e;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kp0.w0;
import oki.h;
import skm.a2;
import sw3.c;
import vkm.j2;
import vkm.q0;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements g, d {
    public final DocumentsContentContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f67308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cx4.a f67309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f80.a f67310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y74.a f67311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f67312t;
    public a2 u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(DocumentsContentContract$InputData inputData, c consentsInteractor, cx4.a creditScreenConstructorControllerExtension, f80.a uriHelper, y74.a pdfDownloadControllerModelExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(consentsInteractor, "consentsInteractor");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(pdfDownloadControllerModelExtension, "pdfDownloadControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f67308p = consentsInteractor;
        this.f67309q = creditScreenConstructorControllerExtension;
        this.f67310r = uriHelper;
        this.f67311s = pdfDownloadControllerModelExtension;
        this.f67312t = mra.d.b(this, new h74.a(new ax4.b(0), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.v = e.a(this, new h1c.c(this, 14));
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f67309q).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f67309q.B1(config);
    }

    @Override // ax4.d
    public final void C(j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.f67309q).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f67309q).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f67309q.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f67309q).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f67309q.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f67309q).I(info, null);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f67309q.c3(), null, null, new h74.n(this, null, 1), 3);
        I2();
    }

    public final void I2() {
        a2 a2Var = this.u;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        h1 productPayload = w0.F(this.o.f67304a);
        c cVar = this.f67308p;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        this.u = l.a1(this, pyd.c.m(rd0.e.e(new q0(ngm.n.K(new sb4.i(cVar, productPayload, continuation, 10)), new qqj.g(cVar, productPayload, continuation, 12), 1), h0.f322473a, new q(3, 28, null))), null, null, new h74.n(this, null, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f67309q.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f67309q).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f67309q.T0(item);
    }

    @Override // ax4.d
    public final void U(String str) {
        this.f67309q.U(str);
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f67309q).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f67309q).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f67309q.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        if (a0.H(url2, "revolut://app/credit/credit-consent-preferences", false)) {
            C2(h74.d.f149845a);
            return;
        }
        if (!a0.H(url2, "revolut://app/credit/document_viewer", false)) {
            C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(url2, new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, true, true, true, 64924))));
            return;
        }
        Uri uri2 = ((f80.b) this.f67310r).f(url2);
        p3.Companion.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        String string = uri2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String queryParameter = uri2.getQueryParameter("htmlLink");
        if (queryParameter == null) {
            queryParameter = uri2.toString();
            Intrinsics.checkNotNullExpressionValue(queryParameter, "toString(...)");
        }
        e2(new p3(string, null, title, null, null, false, queryParameter, uri2.getQueryParameter("pdfLink"), false));
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f67309q.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f67309q.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f67309q).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        String name = documentItem.getName();
        su3.a aVarV = qk.d.v(documentItem, null, null);
        int i = R$string.consents_template_document_viewer_action;
        Intrinsics.checkNotNullParameter(documentItem, "<this>");
        C2(new h74.e(name, aVarV, new DocumentViewerScreenConfig(documentItem.c() != null, false, documentItem.a() == null ? ju3.b.INVISIBLE : documentItem.d() ? ju3.b.QUICK_READ_ACTION_SUPPORT : ju3.b.DEFAULT, null, qk.d.x(i, documentItem.a()), null, 40)));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f67312t;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f67309q).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        EditPreferencesConfiguration application;
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        lu3.c cVar = (lu3.c) ((h74.a) ((j2) this.f67312t.f22677a).getValue()).f149842b.getContent();
        ConsentPreferences consentPreferences = cVar != null ? cVar.f : null;
        if (consentPreferences == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Consent preferences are not available");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        if (Intrinsics.f(actionId, lu3.a.EDIT_ACTIVE_FACILITY_PREFERENCE.a())) {
            ActiveCreditFacilityRetention activeCreditFacilityRetention = consentPreferences.f66434a;
            application = new EditPreferencesConfiguration.ActiveFacility(activeCreditFacilityRetention.f66431a, activeCreditFacilityRetention.f66432b, activeCreditFacilityRetention.f66433c, activeCreditFacilityRetention.d);
        } else {
            if (!Intrinsics.f(actionId, lu3.a.EDIT_APPLICATION_PREFERENCE.a())) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unexpected action ", actionId));
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var2);
                return;
            }
            IncompleteApplicationRetention incompleteApplicationRetention = consentPreferences.f66435b;
            application = new EditPreferencesConfiguration.Application(incompleteApplicationRetention.f66442a, incompleteApplicationRetention.f66443b, incompleteApplicationRetention.f66444c, incompleteApplicationRetention.d, incompleteApplicationRetention.e);
        }
        h.v2(this.v, new DocumentsContentContract$ModalStep.EditPreferences(application), ModalDestination.Style.POPUP.f98311a);
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f67309q).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f67309q.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f67309q).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        h.v2(this.v, new DocumentsContentContract$ModalStep.AmountInput(amountInputScreen), ModalDestination.Style.POPUP.f98311a);
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f67309q).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f67309q.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f67309q.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f67309q.x1(document);
    }
}
