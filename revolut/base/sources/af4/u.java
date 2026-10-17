package af4;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.summary.MortgageValuationSummaryControllerContract$InputData;
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
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends oki.h implements g, ax4.d {
    public final MortgageValuationSummaryControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qx3.a f3878p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hk0.a f3879q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tqi.e f3880r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cx4.a f3881s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f3882t;

    public u(MortgageValuationSummaryControllerContract$InputData inputData, qx3.a interactor, hk0.a networkFileRepository, tqi.e shareExternalDestinationFactory, cx4.a creditScreenConstructorControllerExtension, v stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(shareExternalDestinationFactory, "shareExternalDestinationFactory");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f3878p = interactor;
        this.f3879q = networkFileRepository;
        this.f3880r = shareExternalDestinationFactory;
        this.f3881s = creditScreenConstructorControllerExtension;
        this.f3882t = mra.d.b(this, new h(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f3881s).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f3881s.B1(config);
    }

    @Override // ax4.d
    public final void C(ax4.j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.f3881s).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f3881s).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f3881s.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f3881s).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f3881s.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f3881s).I(info, null);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, pyd.c.m(ngm.n.K(new s(this, continuation, 0))), null, null, new e(this, continuation, 1), 3);
    }

    public final void I2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof l;
        o oVar = o.f3870a;
        if (z) {
            C2(oVar);
            return;
        }
        if (event instanceof j) {
            C2(oVar);
            return;
        }
        Continuation continuation = null;
        if (event instanceof i) {
            l2(new a01.e(this, continuation, 22), new yi5.b(26));
        } else {
            if (!(event instanceof k)) {
                throw new NoWhenBranchMatchedException();
            }
            yji.l.a1(this, pyd.c.m(ngm.n.K(new s(this, continuation, 0))), null, null, new e(this, continuation, 1), 3);
        }
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f3881s.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f3881s).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f3881s.T0(item);
    }

    @Override // ax4.d
    public final void U(String str) {
        this.f3881s.U(str);
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f3881s).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f3881s).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f3881s.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f3881s).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f3881s.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f3881s.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f3881s).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        this.f3881s.e2(documentItem);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f3882t;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f3881s).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Continuation continuation;
        Object next;
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Iterator it8 = ((zy3.b) zi0.c.I(((h) ((j2) this.f3882t.f22677a).getValue()).f3864a)).d.iterator();
        while (true) {
            continuation = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((zy3.a) next).f326360a, actionId)) {
                    break;
                }
            }
        }
        zy3.a aVar = (zy3.a) next;
        if (aVar != null) {
            n2(new ad4.c(this, aVar.f326361b, continuation, 8), new whi.b(6));
        }
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f3881s).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f3881s.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f3881s).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f3881s.n1(amountInputScreen);
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f3881s).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f3881s.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f3881s.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f3881s.x1(document);
    }
}
