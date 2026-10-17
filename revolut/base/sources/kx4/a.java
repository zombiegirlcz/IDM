package kx4;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.credit.core.ui.fullscreen_info.CreditFullScreenInfoController;
import com.revolut.feature.credit.core.ui.info.CreditInfoController;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import dx4.b2;
import dx4.c5;
import dx4.m4;
import dx4.o5;
import dx4.p5;
import dx4.t0;
import dx4.w1;
import dx4.x4;
import dx4.z2;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import mx4.a1;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends cx4.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lx4.a f190378m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a1 f190379n;
    public final wli.x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ax4.b f190380p;

    public a(lx4.a creditSignedDocumentsInteractor, a1 sliderAmountMapper, wli.x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(creditSignedDocumentsInteractor, "creditSignedDocumentsInteractor");
        Intrinsics.checkNotNullParameter(sliderAmountMapper, "sliderAmountMapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f190378m = creditSignedDocumentsInteractor;
        this.f190379n = sliderAmountMapper;
        this.o = deeplinkHandler;
        this.f190380p = new ax4.b(0);
    }

    @Override // ax4.d
    public final void B0(dx4.i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditScreenConstructorControllerExtensionImpl", "Can't support this action " + bannerItem.e, null, h0Var);
    }

    @Override // ax4.d
    public final void C(ax4.j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        d3(new kp0.q(((ax4.b) b3()).f, maskedText, 22));
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        d3(new kv7.g(item, 12));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.n
    public final void D2() {
        yji.n.l2(this, (MutableStateFlow) this.f190378m.f200526a.getValue(), null, new krc.h(this, null, 16), 3);
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        d3(new kp0.q(((ax4.b) b3()).f10860h, maskedDate, 20));
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        N2(new CreditInfoController(new fy4.t(info)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, function1);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        d3(new g36.a(((ax4.b) b3()).f10857b, listId, 1));
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        d3(new js7.c(5, body));
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        InputSliderDelegate.Model model = (InputSliderDelegate.Model) value.f186385a;
        cy0.a aVar = (cy0.a) value.f186386b;
        Object obj2 = model.f52567m;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.items.SliderItem");
        x4 x4Var = (x4) obj2;
        long j2 = aVar.f110014a;
        boolean z = aVar.f110016c;
        this.f190379n.getClass();
        U1(new c64.r(x4Var, new ax4.l(x4Var.f120841m, aVar.f110014a, a1.a(j2, z, x4Var)), 1));
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        A2(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(url2, new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, true, true, true, 65436))));
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f190380p;
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        V2(new kq5.d(this, deeplink, null, 16), new yi5.b(29));
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        d3(new khg.s(((ax4.b) b3()).f10859g, 13, listId, text));
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        U1(new kp0.q((p5) value.f186385a, (o5) value.f186386b, 21));
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        yji.n.P2(this, new CreditFullScreenInfoController(new ey4.g(info)), ModalDestination.Style.POPUP.f98311a, null, 2);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        d3(new kv7.g(item, 11));
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        d3(new ab4.p(item, 1));
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        d3(new kv7.g(expandableCheckboxItem, 13));
    }
}
