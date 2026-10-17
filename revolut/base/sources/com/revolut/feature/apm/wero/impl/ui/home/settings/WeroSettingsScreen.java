package com.revolut.feature.apm.wero.impl.ui.home.settings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bi2.c;
import bi2.d;
import bi2.g;
import bi2.i;
import bi2.j;
import bi2.k;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.wero.api.R$string;
import com.revolut.feature.apm.wero.impl.ui.home.settings.WeroSettingsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nh2.a0;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/home/settings/WeroSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lbi2/c;", "<init>", "()V", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WeroSettingsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(WeroSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object N = w.y0(new b8g.a(29));
    public final Object O = w.y0(new g(0));
    public final Object P;
    public final Object Q;
    public final Object R;

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

    public WeroSettingsScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: bi2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroSettingsScreen f15384b;

            {
                this.f15384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WeroSettingsScreen weroSettingsScreen = this.f15384b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WeroSettingsScreen.S;
                        WeroSettingsScreen weroSettingsScreen2 = this.f15384b;
                        return dli.f.a(weroSettingsScreen2, (d) weroSettingsScreen2.R.getValue(), v.k((RowDelegate) weroSettingsScreen2.N.getValue(), (FullScreenStateDelegate) weroSettingsScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroSettingsScreen.S;
                        qji.b bVarU2 = weroSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.home.settings.di.WeroSettingsScreenInjector");
                        nh2.s sVar = (nh2.s) bVarU2;
                        return new a0(sVar.f215346b, sVar.f215347c);
                    default:
                        KProperty[] kPropertyArr3 = WeroSettingsScreen.S;
                        return (d) ((a0) weroSettingsScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: bi2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroSettingsScreen f15384b;

            {
                this.f15384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WeroSettingsScreen weroSettingsScreen = this.f15384b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WeroSettingsScreen.S;
                        WeroSettingsScreen weroSettingsScreen2 = this.f15384b;
                        return dli.f.a(weroSettingsScreen2, (d) weroSettingsScreen2.R.getValue(), v.k((RowDelegate) weroSettingsScreen2.N.getValue(), (FullScreenStateDelegate) weroSettingsScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroSettingsScreen.S;
                        qji.b bVarU2 = weroSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.home.settings.di.WeroSettingsScreenInjector");
                        nh2.s sVar = (nh2.s) bVarU2;
                        return new a0(sVar.f215346b, sVar.f215347c);
                    default:
                        KProperty[] kPropertyArr3 = WeroSettingsScreen.S;
                        return (d) ((a0) weroSettingsScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: bi2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroSettingsScreen f15384b;

            {
                this.f15384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WeroSettingsScreen weroSettingsScreen = this.f15384b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WeroSettingsScreen.S;
                        WeroSettingsScreen weroSettingsScreen2 = this.f15384b;
                        return dli.f.a(weroSettingsScreen2, (d) weroSettingsScreen2.R.getValue(), v.k((RowDelegate) weroSettingsScreen2.N.getValue(), (FullScreenStateDelegate) weroSettingsScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroSettingsScreen.S;
                        qji.b bVarU2 = weroSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.home.settings.di.WeroSettingsScreenInjector");
                        nh2.s sVar = (nh2.s) bVarU2;
                        return new a0(sVar.f215346b, sVar.f215347c);
                    default:
                        KProperty[] kPropertyArr3 = WeroSettingsScreen.S;
                        return (d) ((a0) weroSettingsScreen.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (d) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.wero_back, null, null, 14), 126));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wero_settings_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wero_settings_title, null, null, 14), null);
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new bf5.a(this, null, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), null, new i(this, null), 3);
        ?? r56 = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53218h), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53220l), null, new k(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
