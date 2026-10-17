package com.revolut.feature.alipay.impl.ui.qr;

import ali.g;
import android.content.Context;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.CenteredFixedTabsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.alipay.impl.R$id;
import com.revolut.feature.alipay.impl.R$layout;
import com.revolut.feature.alipay.impl.ui.qr.AlipayPlusQrFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ok1.f;
import te0.w;
import vc.s;
import vfg.m;
import vge.z1;
import vk1.c;
import vk1.d;
import vk1.k;
import vk1.l;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/alipay/impl/ui/qr/AlipayPlusQrFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvk1/k;", "Lali/g;", "Lvk1/l;", "Lcom/revolut/feature/alipay/impl/ui/qr/AlipayPlusQrFlowContract$Page;", "<init>", "()V", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AlipayPlusQrFlow extends ViewController<k> implements g {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AlipayPlusQrFlow.class, "binding", "getBinding()Lcom/revolut/feature/alipay/impl/databinding/ScreenAlipayQrContainerBinding;", 0))};
    public final boolean K = true;
    public final int L = R$layout.screen_alipay_qr_container;
    public final int M = R$style.UiKitTheme_Mono;
    public final h N = s.t(this, a.f);
    public final Object O;
    public final Object P;
    public final Object Q;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, lk1.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/alipay/impl/databinding/ScreenAlipayQrContainerBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.qrContainer_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.qrContainer_tabs;
                CenteredFixedTabsView centeredFixedTabsView = (CenteredFixedTabsView) ViewBindings.findChildViewById(p0, i);
                if (centeredFixedTabsView != null) {
                    i = R$id.qrContainer_viewPager;
                    if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new lk1.b((ControllerContainerConstraintLayout) p0, navBarWithToolbar, centeredFixedTabsView);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public AlipayPlusQrFlow() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: vk1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusQrFlow f289845b;

            {
                this.f289845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AlipayPlusQrFlow alipayPlusQrFlow = this.f289845b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusQrFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(alipayPlusQrFlow.m2()).a().get(ok1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ok1.f(((ok1.d) aVar2.b()).f225863h);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ok1.d.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusQrFlow.R;
                        return (g) ((ok1.f) alipayPlusQrFlow.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AlipayPlusQrFlow.R;
                        return mif.a.a(alipayPlusQrFlow, 0, R$id.qrContainer_viewPager, alipayPlusQrFlow.d(), 5);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: vk1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusQrFlow f289845b;

            {
                this.f289845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AlipayPlusQrFlow alipayPlusQrFlow = this.f289845b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusQrFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(alipayPlusQrFlow.m2()).a().get(ok1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ok1.f(((ok1.d) aVar2.b()).f225863h);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ok1.d.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusQrFlow.R;
                        return (g) ((ok1.f) alipayPlusQrFlow.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AlipayPlusQrFlow.R;
                        return mif.a.a(alipayPlusQrFlow, 0, R$id.qrContainer_viewPager, alipayPlusQrFlow.d(), 5);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: vk1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusQrFlow f289845b;

            {
                this.f289845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AlipayPlusQrFlow alipayPlusQrFlow = this.f289845b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusQrFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(alipayPlusQrFlow.m2()).a().get(ok1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ok1.f(((ok1.d) aVar2.b()).f225863h);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ok1.d.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusQrFlow.R;
                        return (g) ((ok1.f) alipayPlusQrFlow.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AlipayPlusQrFlow.R;
                        return mif.a.a(alipayPlusQrFlow, 0, R$id.qrContainer_viewPager, alipayPlusQrFlow.d(), 5);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f196182b.setMenuItems(uiState.f289857c);
        CenteredFixedTabsView centeredFixedTabsView = d3().f196183c;
        centeredFixedTabsView.setVisibility(0);
        centeredFixedTabsView.setItems(uiState.f289855a, uiState.f289856b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((com.revolut.feature.alipay.impl.ui.qr.a) d()).I2(c.f289847a);
        return true;
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        AlipayPlusQrFlowContract$Page pagerItem2 = (AlipayPlusQrFlowContract$Page) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        ((com.revolut.feature.alipay.impl.ui.qr.a) d()).I2(new d(pagerItem2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f196182b;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        navBarWithToolbar.setBackgroundColor(kli.a.s(R$attr.uikit_colorTransparent, context));
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, Integer.valueOf(kli.a.s(R$attr.uikit_colorForeground, new ContextThemeWrapper(view.getContext(), R$style.UiKitTheme_TransparentNight))), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f196183c.f58424a), null, new m(this, null, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f196182b.f59410q), null, new z1(this, null, 4), 3);
    }

    public final lk1.b d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (lk1.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final vk1.g d() {
        return (vk1.g) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF78873d0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
