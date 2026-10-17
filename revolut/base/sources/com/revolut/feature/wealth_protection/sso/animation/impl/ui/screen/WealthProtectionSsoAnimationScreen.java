package com.revolut.feature.wealth_protection.sso.animation.impl.ui.screen;

import android.graphics.Bitmap;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import au0.c1;
import au0.s0;
import au0.u0;
import au0.z0;
import aw0.s8;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.wealth_protection.sso.animation.impl.R$id;
import com.revolut.feature.wealth_protection.sso.animation.impl.R$layout;
import com.revolut.feature.wealth_protection.sso.animation.impl.ui.screen.WealthProtectionSsoAnimationScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import frh.c;
import frh.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth_protection/sso/animation/impl/ui/screen/WealthProtectionSsoAnimationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lcli/w;", "Lfrh/c;", "<init>", "()V", "feature_wealth_protection_sso_animation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthProtectionSsoAnimationScreen extends ViewController<Object> implements w {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(WealthProtectionSsoAnimationScreen.class, "binding", "getBinding()Lcom/revolut/feature/wealth_protection/sso/animation/impl/databinding/ScreenWealthProtectionSsoAnimationBinding;", 0))};
    public final int K = R$layout.screen_wealth_protection_sso_animation;
    public final h L = s.t(this, a.f);
    public final Object M;
    public final Object N;
    public final Object O;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, xqh.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/wealth_protection/sso/animation/impl/databinding/ScreenWealthProtectionSsoAnimationBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
            int i = R$id.wp_sso_animation_navBarWithBigTile;
            NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
            if (navBarWithBigTile != null) {
                return new xqh.a(controllerContainerConstraintLayout, navBarWithBigTile);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public WealthProtectionSsoAnimationScreen() {
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: frh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthProtectionSsoAnimationScreen f137482b;

            {
                this.f137482b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WealthProtectionSsoAnimationScreen wealthProtectionSsoAnimationScreen = this.f137482b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WealthProtectionSsoAnimationScreen.P;
                        qji.b bVarU2 = wealthProtectionSsoAnimationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_protection.sso.animation.impl.ui.screen.di.WealthProtectionSsoAnimationScreenInjector");
                        zqh.c cVar = new zqh.c();
                        cVar.f324496a = e4m.b.b(new zd8.c(1));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = WealthProtectionSsoAnimationScreen.P;
                        return (d) ((zqh.c) wealthProtectionSsoAnimationScreen.M.getValue()).f324496a.get();
                    default:
                        KProperty[] kPropertyArr3 = WealthProtectionSsoAnimationScreen.P;
                        return n14.e.a(wealthProtectionSsoAnimationScreen, (d) wealthProtectionSsoAnimationScreen.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: frh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthProtectionSsoAnimationScreen f137482b;

            {
                this.f137482b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WealthProtectionSsoAnimationScreen wealthProtectionSsoAnimationScreen = this.f137482b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WealthProtectionSsoAnimationScreen.P;
                        qji.b bVarU2 = wealthProtectionSsoAnimationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_protection.sso.animation.impl.ui.screen.di.WealthProtectionSsoAnimationScreenInjector");
                        zqh.c cVar = new zqh.c();
                        cVar.f324496a = e4m.b.b(new zd8.c(1));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = WealthProtectionSsoAnimationScreen.P;
                        return (d) ((zqh.c) wealthProtectionSsoAnimationScreen.M.getValue()).f324496a.get();
                    default:
                        KProperty[] kPropertyArr3 = WealthProtectionSsoAnimationScreen.P;
                        return n14.e.a(wealthProtectionSsoAnimationScreen, (d) wealthProtectionSsoAnimationScreen.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: frh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthProtectionSsoAnimationScreen f137482b;

            {
                this.f137482b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WealthProtectionSsoAnimationScreen wealthProtectionSsoAnimationScreen = this.f137482b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WealthProtectionSsoAnimationScreen.P;
                        qji.b bVarU2 = wealthProtectionSsoAnimationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_protection.sso.animation.impl.ui.screen.di.WealthProtectionSsoAnimationScreenInjector");
                        zqh.c cVar = new zqh.c();
                        cVar.f324496a = e4m.b.b(new zd8.c(1));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = WealthProtectionSsoAnimationScreen.P;
                        return (d) ((zqh.c) wealthProtectionSsoAnimationScreen.M.getValue()).f324496a.get();
                    default:
                        KProperty[] kPropertyArr3 = WealthProtectionSsoAnimationScreen.P;
                        return n14.e.a(wealthProtectionSsoAnimationScreen, (d) wealthProtectionSsoAnimationScreen.N.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zqh.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        qji.b bVarU2 = U2();
        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_protection.sso.animation.impl.ui.flow.di.WealthProtectionSsoAnimationFlowComponent");
        arh.b bVar = (arh.b) ((zqh.b) bVarU2).f324494b.f324491b.get();
        Bitmap bitmap = bVar.f8718a;
        bVar.f8718a = null;
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile navBarWithBigTile = ((xqh.a) value).f308176b;
        navBarWithBigTile.setLayoutType(s0.CENTERED);
        c1.S(navBarWithBigTile, u.c(new u0(new NavBarWithContainerBackground.VideoBackground(new UrlVideo("https://assets.revolut.com/mobile/retail/security_hub/light.mp4", "https://assets.revolut.com/mobile/retail/security_hub/dark.mp4", false, oz0.b.CENTER_CROP, false, (oz0.c) null, 116), (Image) null, (VideoShutter) null, (s8) null, 30), null, null, null)), null, null, 6);
        navBarWithBigTile.setTitle(new z0(new TextLocalisedClause(R$string.security_hub_wealth_protection_title, null, null, 14), false));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.O.getValue();
    }
}
