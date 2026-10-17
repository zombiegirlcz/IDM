package ah4;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.documents.RefinancingAccountDocumentsScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import dx4.b2;
import dx4.c5;
import dx4.i0;
import dx4.l2;
import dx4.m4;
import dx4.n4;
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
import e60.s;
import ip0.u00;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.y0;
import nii.z;
import vkm.j2;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends oki.h implements l, ax4.d {
    public final RefinancingAccountDocumentsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e60.a f4892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cx4.a f4893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ay3.a f4894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final asi.d f4895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final py3.b f4896t;
    public final y u;

    public h(RefinancingAccountDocumentsScreenContract$InputData inputData, e60.a mediaPickerControllerExtension, cx4.a creditScreenConstructorControllerExtension, ay3.a refinancingAccountDetailsInteractor, asi.d userSessionInteractor, py3.b creditApplicationErrorHandlerChecker, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(refinancingAccountDetailsInteractor, "refinancingAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationErrorHandlerChecker, "creditApplicationErrorHandlerChecker");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f4892p = mediaPickerControllerExtension;
        this.f4893q = creditScreenConstructorControllerExtension;
        this.f4894r = refinancingAccountDetailsInteractor;
        this.f4895s = userSessionInteractor;
        this.f4896t = creditApplicationErrorHandlerChecker;
        this.u = mra.d.b(this, new m(inputData.f68252c, null, new ax4.b(0), null), stateMapper, null, false, 12);
    }

    public static p4 I2(lv3.a aVar, String facilityId, String id10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(id10, "categoryId");
        aVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        for (n4 n4Var : aVar.e) {
            if (Intrinsics.f(n4Var.f120689a, facilityId)) {
                for (p4 p4Var : n4Var.f120690b) {
                    fh4.n nVar = fh4.o.Companion;
                    String str = p4Var.f120716a;
                    nVar.getClass();
                    if (fh4.n.b(str) == fh4.o.DOCUMENTS) {
                        Intrinsics.checkNotNullParameter(id10, "id");
                        for (n4 n4Var2 : p4Var.f) {
                            if (Intrinsics.f(n4Var2.f120689a, id10)) {
                                return (p4) d0.K0(n4Var2.f120690b);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f4893q).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f4893q.B1(config);
    }

    @Override // ax4.d
    public final void C(ax4.j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.f4893q).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f4893q).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        a31.g gVar = new a31.g(uploadUrl, 23);
        y yVar = this.u;
        H2(yVar, gVar);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.refinancing_account_details_documents_upload_category_title, u.c(((m) ((j2) yVar.f22677a).getValue()).f4899a.d), null, 12);
        u00 u00Var = u00.BACK;
        List listC = allowedFileTypes;
        if (listC.isEmpty()) {
            listC = u.c(t80.f.PDF);
        }
        ((s) this.f4892p).T(new e60.i(null, textLocalisedClause, null, true, 0, 0, listC, null, false, u00Var, null, 15797));
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f4893q).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f4893q.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f4893q).I(info, null);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f4893q.c3(), null, null, new g(this, null, 0), 3);
    }

    public final void J2() {
        X1(new y0(null, new z(new TextLocalisedClause(R$string.refinancing_account_details_documents_upload_status_error, null, null, 14), null, null, null, null, null, true, null, null, null, null, null, null, 32510), false, 5));
    }

    @Override // yji.l
    public final void K1() {
        s1();
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f4893q.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f4893q).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f4893q.T0(item);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (jh.d.h(this.f4895s.a())) {
            yji.l.b1(this, rd0.e.b(((s) this.f4892p).f122868g), null, new g(this, null, 1), 3);
        }
    }

    @Override // ax4.d
    public final void U(String str) {
        this.f4893q.U(str);
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f4893q).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f4893q).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f4893q.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f4893q).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        X1(new y0(null, new c0(null, null, null, true, null, false, false, null, 1903), false, 5));
        n2(new ad4.c(this, deleteUrl, null, 9), new whi.b(6));
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f4893q.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f4893q).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        this.f4893q.e2(documentItem);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f4893q).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f4893q.i0(actionId);
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f4893q).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f4893q.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f4893q).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f4893q.n1(amountInputScreen);
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f4893q).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f4893q.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f4893q.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f4893q.x1(document);
    }
}
