package ei4;

import android.content.Intent;
import android.net.Uri;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.partner_solicitor_details.PartnerSolicitorDetailsControllerContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
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
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends oki.h implements e, ax4.d {

    @NotNull
    private static final k Companion = new k();
    public final PartnerSolicitorDetailsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cx4.a f126405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f126406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f126407r;

    public l(PartnerSolicitorDetailsControllerContract$InputData inputData, cx4.a creditScreenConstructorControllerExtension, a intentProvider, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f126405p = creditScreenConstructorControllerExtension;
        this.f126406q = intentProvider;
        this.f126407r = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f126405p).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f126405p.B1(config);
    }

    @Override // ax4.d
    public final void C(ax4.j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.f126405p).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f126405p).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f126405p.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f126405p).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f126405p.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f126405p).I(info, null);
    }

    public final void I2(h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof g) {
            B2();
        } else {
            if (!(event instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(i.f126401a);
        }
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f126405p.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f126405p).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f126405p.T0(item);
    }

    @Override // ax4.d
    public final void U(String str) {
        this.f126405p.U(str);
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f126405p).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f126405p).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f126405p.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f126405p).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f126405p.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f126405p.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f126405p).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        this.f126405p.e2(documentItem);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f126407r;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f126405p).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intent intent;
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        ez3.i iVar = (ez3.i) this.o.f68405a.f130900g.get(actionId);
        boolean z = iVar instanceof ez3.f;
        a aVar = this.f126406q;
        if (z) {
            String phoneNumber = ((ez3.f) iVar).f130894a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + phoneNumber));
        } else if (iVar instanceof ez3.g) {
            String email = ((ez3.g) iVar).f130895a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(email, "email");
            intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + email));
        } else {
            if (!(iVar instanceof ez3.h)) {
                if (iVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PartnerSolicitorDetailsControllerModel", p.a.p("Unsupported ", actionId, " action"), null, h0Var);
                return;
            }
            String url2 = ((ez3.h) iVar).f130896a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(url2, "url");
            intent = new Intent("android.intent.action.VIEW", Uri.parse(url2));
        }
        C1(new ExternalDestination.ByIntent(intent, null));
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f126405p).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f126405p.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f126405p).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f126405p.n1(amountInputScreen);
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f126405p).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f126405p.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f126405p.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f126405p.x1(document);
    }
}
