package com.revolut.feature.apm.wero.impl.ui.home.area;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.apm.core.ui.api.R$id;
import com.revolut.feature.apm.core.ui.api.R$layout;
import com.revolut.feature.apm.wero.api.R$string;
import com.revolut.feature.apm.wero.impl.ui.home.area.WeroHomeAreaScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import h12.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nh2.r;
import pn3.b;
import r12.g;
import te0.w;
import tw0.t0;
import uxe.l;
import vc.s;
import ve7.i;
import vh2.f;
import vh2.j;
import vh2.n;
import xki.e;
import y02.c;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/home/area/WeroHomeAreaScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lvh2/f;", "Ly02/c;", "<init>", "()V", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WeroHomeAreaScreen extends ViewController<q> implements dli.a, c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(WeroHomeAreaScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/api/databinding/ScreenApmAreaBinding;", 0))};
    public final int K = R$style.UiKitTheme_Transparent;
    public final int L = R$layout.screen_apm_area;
    public final h M = s.t(this, a.f);
    public final Object N = w.y0(new i(9));
    public final ApmWero O = ApmWero.f61829c;
    public final TextLocalisedClause P = new TextLocalisedClause(R$string.wero_area_title, null, null, 14);
    public final Object Q;
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, w02.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/apm/core/ui/api/databinding/ScreenApmAreaBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return w02.a.a(p0);
        }
    }

    public WeroHomeAreaScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: vh2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroHomeAreaScreen f289279b;

            {
                this.f289279b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WeroHomeAreaScreen weroHomeAreaScreen = this.f289279b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WeroHomeAreaScreen.T;
                        WeroHomeAreaScreen weroHomeAreaScreen2 = this.f289279b;
                        return dli.f.a(weroHomeAreaScreen2, weroHomeAreaScreen2.R2(), d0.E0(u.c((PaymentLinkWidgetDelegate) weroHomeAreaScreen2.N.getValue()), ((r12.g) ((y02.a) ((r) weroHomeAreaScreen2.R.getValue()).d.get())).f250889l), R$id.apmArea_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroHomeAreaScreen.T;
                        qji.b bVarU2 = weroHomeAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.home.area.di.WeroHomeAreaScreenInjector");
                        nh2.s sVar = (nh2.s) bVarU2;
                        return new r(sVar.f215346b, sVar.f215347c, weroHomeAreaScreen);
                    default:
                        KProperty[] kPropertyArr3 = WeroHomeAreaScreen.T;
                        return (g) ((r) weroHomeAreaScreen.R.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: vh2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroHomeAreaScreen f289279b;

            {
                this.f289279b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WeroHomeAreaScreen weroHomeAreaScreen = this.f289279b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WeroHomeAreaScreen.T;
                        WeroHomeAreaScreen weroHomeAreaScreen2 = this.f289279b;
                        return dli.f.a(weroHomeAreaScreen2, weroHomeAreaScreen2.R2(), d0.E0(u.c((PaymentLinkWidgetDelegate) weroHomeAreaScreen2.N.getValue()), ((r12.g) ((y02.a) ((r) weroHomeAreaScreen2.R.getValue()).d.get())).f250889l), R$id.apmArea_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroHomeAreaScreen.T;
                        qji.b bVarU2 = weroHomeAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.home.area.di.WeroHomeAreaScreenInjector");
                        nh2.s sVar = (nh2.s) bVarU2;
                        return new r(sVar.f215346b, sVar.f215347c, weroHomeAreaScreen);
                    default:
                        KProperty[] kPropertyArr3 = WeroHomeAreaScreen.T;
                        return (g) ((r) weroHomeAreaScreen.R.getValue()).i.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: vh2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroHomeAreaScreen f289279b;

            {
                this.f289279b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WeroHomeAreaScreen weroHomeAreaScreen = this.f289279b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WeroHomeAreaScreen.T;
                        WeroHomeAreaScreen weroHomeAreaScreen2 = this.f289279b;
                        return dli.f.a(weroHomeAreaScreen2, weroHomeAreaScreen2.R2(), d0.E0(u.c((PaymentLinkWidgetDelegate) weroHomeAreaScreen2.N.getValue()), ((r12.g) ((y02.a) ((r) weroHomeAreaScreen2.R.getValue()).d.get())).f250889l), R$id.apmArea_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroHomeAreaScreen.T;
                        qji.b bVarU2 = weroHomeAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.home.area.di.WeroHomeAreaScreenInjector");
                        nh2.s sVar = (nh2.s) bVarU2;
                        return new r(sVar.f215346b, sVar.f215347c, weroHomeAreaScreen);
                    default:
                        KProperty[] kPropertyArr3 = WeroHomeAreaScreen.T;
                        return (g) ((r) weroHomeAreaScreen.R.getValue()).i.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(this.K);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ((g) ((y02.a) ((r) this.R.getValue()).d.get())).Q(uiState);
    }

    @Override // y02.c
    public final void D0(BaseDraggableWidgetDelegate.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((n) R2()).M2(event);
    }

    @Override // y02.c
    public final void D1() {
        n nVar = (n) R2();
        nVar.H2(nVar.f289291y, new vgk.g(1));
        nVar.z.k(Unit.f186387a);
    }

    @Override // y02.c
    public final void E1() {
        m2().onBackPressed();
    }

    @Override // y02.c
    public final Clause G() {
        return this.P;
    }

    @Override // y02.c
    public final void H(Object obj2) {
        vh2.a aVar = obj2 instanceof vh2.a ? (vh2.a) obj2 : null;
        if (aVar == null) {
            return;
        }
        ((n) R2()).J2(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.R.getValue();
    }

    @Override // y02.c
    public final void T0(t clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        n nVar = (n) R2();
        nVar.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        k kVarB = ((u12.a) nVar.f289286r).b(clickData);
        if (Intrinsics.f(kVarB, h12.i.f148450a)) {
            ((b) nVar.f289287s).c(nVar, new j(nVar, 0));
        } else if (Intrinsics.f(kVarB, h12.j.f148451a)) {
            nVar.l2(new l(nVar, null, 21), new yi5.b(26));
        } else if (kVarB != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // y02.c
    public final void T1(Object obj2) {
        ((n) R2()).K2(obj2);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = T;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.M;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView screenContentRecyclerView = ((w02.a) value).d;
        RecyclerView.Adapter adapter = screenContentRecyclerView.getAdapter();
        Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.recyclerkit.delegates.DiffAdapter");
        screenContentRecyclerView.addItemDecoration(new t0((koi.h) adapter, false));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((w02.a) value2).f293619c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PaymentLinkWidgetDelegate) this.N.getValue()).f), null, new vh2.i(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final vh2.g R2() {
        return (vh2.g) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // y02.c
    public final ApmProduct l() {
        return this.O;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
