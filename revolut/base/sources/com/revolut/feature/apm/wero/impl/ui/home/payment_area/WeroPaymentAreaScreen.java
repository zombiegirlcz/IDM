package com.revolut.feature.apm.wero.impl.ui.home.payment_area;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.wero.api.R$string;
import com.revolut.feature.apm.wero.impl.ui.home.payment_area.WeroPaymentAreaScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zh2.c;
import zh2.d;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/home/payment_area/WeroPaymentAreaScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzh2/d;", "<init>", "()V", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WeroPaymentAreaScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(WeroPaymentAreaScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object O;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar;
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final h N = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public WeroPaymentAreaScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: zh2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroPaymentAreaScreen f322216b;

            {
                this.f322216b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WeroPaymentAreaScreen weroPaymentAreaScreen = this.f322216b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WeroPaymentAreaScreen.Q;
                        WeroPaymentAreaScreen weroPaymentAreaScreen2 = this.f322216b;
                        return dli.f.a(weroPaymentAreaScreen2, (c) weroPaymentAreaScreen2.P.getValue(), u.c(weroPaymentAreaScreen2.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroPaymentAreaScreen.Q;
                        qji.b bVarU2 = weroPaymentAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.home.payment_area.di.WeroPaymentAreaScreenInjector");
                        nh2.w wVar = new nh2.w();
                        int i3 = 26;
                        wVar.f215358a = e4m.b.b(new mil.a(wVar, 1, i3));
                        wVar.f215359b = e4m.b.b(new mil.a(wVar, 0, i3));
                        return wVar;
                    default:
                        KProperty[] kPropertyArr3 = WeroPaymentAreaScreen.Q;
                        return (c) ((nh2.w) weroPaymentAreaScreen.O.getValue()).f215359b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: zh2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroPaymentAreaScreen f322216b;

            {
                this.f322216b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WeroPaymentAreaScreen weroPaymentAreaScreen = this.f322216b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WeroPaymentAreaScreen.Q;
                        WeroPaymentAreaScreen weroPaymentAreaScreen2 = this.f322216b;
                        return dli.f.a(weroPaymentAreaScreen2, (c) weroPaymentAreaScreen2.P.getValue(), u.c(weroPaymentAreaScreen2.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroPaymentAreaScreen.Q;
                        qji.b bVarU2 = weroPaymentAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.home.payment_area.di.WeroPaymentAreaScreenInjector");
                        nh2.w wVar = new nh2.w();
                        int i3 = 26;
                        wVar.f215358a = e4m.b.b(new mil.a(wVar, 1, i3));
                        wVar.f215359b = e4m.b.b(new mil.a(wVar, 0, i3));
                        return wVar;
                    default:
                        KProperty[] kPropertyArr3 = WeroPaymentAreaScreen.Q;
                        return (c) ((nh2.w) weroPaymentAreaScreen.O.getValue()).f215359b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: zh2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroPaymentAreaScreen f322216b;

            {
                this.f322216b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WeroPaymentAreaScreen weroPaymentAreaScreen = this.f322216b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WeroPaymentAreaScreen.Q;
                        WeroPaymentAreaScreen weroPaymentAreaScreen2 = this.f322216b;
                        return dli.f.a(weroPaymentAreaScreen2, (c) weroPaymentAreaScreen2.P.getValue(), u.c(weroPaymentAreaScreen2.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroPaymentAreaScreen.Q;
                        qji.b bVarU2 = weroPaymentAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.home.payment_area.di.WeroPaymentAreaScreenInjector");
                        nh2.w wVar = new nh2.w();
                        int i32 = 26;
                        wVar.f215358a = e4m.b.b(new mil.a(wVar, 1, i32));
                        wVar.f215359b = e4m.b.b(new mil.a(wVar, 0, i32));
                        return wVar;
                    default:
                        KProperty[] kPropertyArr3 = WeroPaymentAreaScreen.Q;
                        return (c) ((nh2.w) weroPaymentAreaScreen.O.getValue()).f215359b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (nh2.w) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wero_area_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wero_area_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setMenuItems(u.c(new IconNavBarMenuItem("ID_SETTINGS_ACTION", new ResourceImage(R$drawable.uikit_icn_24_settings, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.wero_settings_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new z3f.b(this, null, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.o.f57403b), null, new zfd.s(this, (Continuation) null, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new zh2.b(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
