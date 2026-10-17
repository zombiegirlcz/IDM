package ka4;

import af4.v;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.sources.DownPaymentSourcesControllerContract$InputData;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends oki.h implements e, ax4.d {
    public final DownPaymentSourcesControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o7.b f182430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cx4.a f182431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f182432r;

    public q(DownPaymentSourcesControllerContract$InputData inputData, o7.b interactor, cx4.a creditScreenConstructorControllerExtension, v stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f182430p = interactor;
        this.f182431q = creditScreenConstructorControllerExtension;
        this.f182432r = mra.d.b(this, new f(new ax4.b(0), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f182431q).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f182431q.B1(config);
    }

    @Override // ax4.d
    public final void C(ax4.j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.f182431q).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f182431q).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f182431q.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f182431q).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f182431q.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f182431q).I(info, null);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, this.f182431q.c3(), null, null, new p(this, continuation, 1), 3);
        yji.l.a1(this, pyd.c.m(ngm.n.K(new iyi.j(this, continuation, 18))), null, null, new p(this, continuation, 0), 3);
    }

    public final void I2() {
        C2(l.f182423a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J2(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (!(event instanceof g)) {
            if (event instanceof h) {
                I2();
                return;
            } else if (event instanceof i) {
                yji.l.a1(this, pyd.c.m(ngm.n.K(new iyi.j(this, objArr2 == true ? 1 : 0, 18))), null, null, new p(this, objArr == true ? 1 : 0, 0), 3);
                return;
            } else {
                if (!(event instanceof j)) {
                    throw new NoWhenBranchMatchedException();
                }
                I2();
                return;
            }
        }
        y yVar = this.f182432r;
        Map map = ((f) ((j2) yVar.f22677a).getValue()).f182417a.f10858c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((ax4.a) entry.getValue()).f10854a) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (it8.hasNext()) {
            arrayList.add((String) ((Map.Entry) it8.next()).getKey());
        }
        oy3.e eVar = (oy3.e) ((f) ((j2) yVar.f22677a).getValue()).f182418b.getContent();
        C2(new m(arrayList, eVar != null ? eVar.f230884b : null));
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f182431q.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f182431q).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f182431q.T0(item);
    }

    @Override // ax4.d
    public final void U(String str) {
        this.f182431q.U(str);
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f182431q).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f182431q).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f182431q.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f182431q).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f182431q.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f182431q.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f182431q).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        this.f182431q.e2(documentItem);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f182432r;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f182431q).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f182431q.i0(actionId);
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f182431q).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f182431q.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f182431q).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f182431q.n1(amountInputScreen);
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f182431q).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f182431q.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f182431q.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f182431q.x1(document);
    }
}
