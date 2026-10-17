package com.revolut.crypto.challenge.impl.ui.screen.progress;

import aii.q;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import au0.b1;
import au0.c1;
import au0.m0;
import au0.s0;
import au0.u0;
import aw0.d0;
import aw0.s8;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.core.ui_kit_resources.R$raw;
import com.revolut.crypto.challenge.api.R$string;
import com.revolut.crypto.challenge.impl.R$id;
import com.revolut.crypto.challenge.impl.R$layout;
import com.revolut.crypto.challenge.impl.ui.screen.progress.CryptoChallengeProgressViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import kkf.r6;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lt.d;
import m11.g;
import m11.r;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tki.c;
import tx0.o2;
import vc.s;
import xki.e;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/crypto/challenge/impl/ui/screen/progress/CryptoChallengeProgressViewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lm11/g;", "<init>", "()V", "Companion", "a", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoChallengeProgressViewController extends ViewController<q> implements c {
    public final Lazy L;
    public final Object O;
    public final Object P;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CryptoChallengeProgressViewController.class, "binding", "getBinding()Lcom/revolut/crypto/challenge/impl/databinding/ScreenChallengeProgressBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final h K = s.t(this, b.f);
    public final int M = R$style.UiKitTheme_Night;
    public final int N = R$layout.screen_challenge_progress;
    public final ProgressStepsDelegate Q = new ProgressStepsDelegate();

    /* JADX INFO: renamed from: com.revolut.crypto.challenge.impl.ui.screen.progress.CryptoChallengeProgressViewController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, y01.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/crypto/challenge/impl/databinding/ScreenChallengeProgressBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.screenChallengeProgress_actionFooterView;
            ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
            if (actionFooterView != null) {
                i = R$id.screenChallengeProgress_navBar;
                NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
                if (navBarWithBigTile != null) {
                    i = R$id.screenChallengeProgress_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new y01.a((ControllerContainerCoordinatorLayout) p0, actionFooterView, navBarWithBigTile);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public CryptoChallengeProgressViewController() {
        final int i = 0;
        this.L = j.b(new Function0(this) { // from class: m11.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoChallengeProgressViewController f201184b;

            {
                this.f201184b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoChallengeProgressViewController cryptoChallengeProgressViewController = this.f201184b;
                switch (i2) {
                    case 0:
                        CryptoChallengeProgressViewController.Companion companion = CryptoChallengeProgressViewController.INSTANCE;
                        View rootView = cryptoChallengeProgressViewController.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        CryptoChallengeProgressViewController.Companion companion2 = CryptoChallengeProgressViewController.INSTANCE;
                        return (e) ((z01.b) cryptoChallengeProgressViewController.P.getValue()).f318168c.get();
                    case 2:
                        CryptoChallengeProgressViewController.Companion companion3 = CryptoChallengeProgressViewController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoChallengeProgressViewController.m2()).a().get(z01.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z01.a.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.crypto.challenge.impl.declaration.CryptoChallengeApiComponent");
                        return new z01.b(((z01.a) objB).f);
                    default:
                        CryptoChallengeProgressViewController.Companion companion4 = CryptoChallengeProgressViewController.INSTANCE;
                        CryptoChallengeProgressViewController cryptoChallengeProgressViewController2 = this.f201184b;
                        return tki.g.a(cryptoChallengeProgressViewController2, cryptoChallengeProgressViewController2.R2(), u.c(cryptoChallengeProgressViewController2.Q), R$id.screenChallengeProgress_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: m11.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoChallengeProgressViewController f201184b;

            {
                this.f201184b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoChallengeProgressViewController cryptoChallengeProgressViewController = this.f201184b;
                switch (i22) {
                    case 0:
                        CryptoChallengeProgressViewController.Companion companion = CryptoChallengeProgressViewController.INSTANCE;
                        View rootView = cryptoChallengeProgressViewController.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        CryptoChallengeProgressViewController.Companion companion2 = CryptoChallengeProgressViewController.INSTANCE;
                        return (e) ((z01.b) cryptoChallengeProgressViewController.P.getValue()).f318168c.get();
                    case 2:
                        CryptoChallengeProgressViewController.Companion companion3 = CryptoChallengeProgressViewController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoChallengeProgressViewController.m2()).a().get(z01.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z01.a.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.crypto.challenge.impl.declaration.CryptoChallengeApiComponent");
                        return new z01.b(((z01.a) objB).f);
                    default:
                        CryptoChallengeProgressViewController.Companion companion4 = CryptoChallengeProgressViewController.INSTANCE;
                        CryptoChallengeProgressViewController cryptoChallengeProgressViewController2 = this.f201184b;
                        return tki.g.a(cryptoChallengeProgressViewController2, cryptoChallengeProgressViewController2.R2(), u.c(cryptoChallengeProgressViewController2.Q), R$id.screenChallengeProgress_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: m11.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoChallengeProgressViewController f201184b;

            {
                this.f201184b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoChallengeProgressViewController cryptoChallengeProgressViewController = this.f201184b;
                switch (i22) {
                    case 0:
                        CryptoChallengeProgressViewController.Companion companion = CryptoChallengeProgressViewController.INSTANCE;
                        View rootView = cryptoChallengeProgressViewController.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        CryptoChallengeProgressViewController.Companion companion2 = CryptoChallengeProgressViewController.INSTANCE;
                        return (e) ((z01.b) cryptoChallengeProgressViewController.P.getValue()).f318168c.get();
                    case 2:
                        CryptoChallengeProgressViewController.Companion companion3 = CryptoChallengeProgressViewController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoChallengeProgressViewController.m2()).a().get(z01.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z01.a.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.crypto.challenge.impl.declaration.CryptoChallengeApiComponent");
                        return new z01.b(((z01.a) objB).f);
                    default:
                        CryptoChallengeProgressViewController.Companion companion4 = CryptoChallengeProgressViewController.INSTANCE;
                        CryptoChallengeProgressViewController cryptoChallengeProgressViewController2 = this.f201184b;
                        return tki.g.a(cryptoChallengeProgressViewController2, cryptoChallengeProgressViewController2.R2(), u.c(cryptoChallengeProgressViewController2.Q), R$id.screenChallengeProgress_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: m11.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoChallengeProgressViewController f201184b;

            {
                this.f201184b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CryptoChallengeProgressViewController cryptoChallengeProgressViewController = this.f201184b;
                switch (i22) {
                    case 0:
                        CryptoChallengeProgressViewController.Companion companion = CryptoChallengeProgressViewController.INSTANCE;
                        View rootView = cryptoChallengeProgressViewController.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        CryptoChallengeProgressViewController.Companion companion2 = CryptoChallengeProgressViewController.INSTANCE;
                        return (e) ((z01.b) cryptoChallengeProgressViewController.P.getValue()).f318168c.get();
                    case 2:
                        CryptoChallengeProgressViewController.Companion companion3 = CryptoChallengeProgressViewController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoChallengeProgressViewController.m2()).a().get(z01.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z01.a.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.crypto.challenge.impl.declaration.CryptoChallengeApiComponent");
                        return new z01.b(((z01.a) objB).f);
                    default:
                        CryptoChallengeProgressViewController.Companion companion4 = CryptoChallengeProgressViewController.INSTANCE;
                        CryptoChallengeProgressViewController cryptoChallengeProgressViewController2 = this.f201184b;
                        return tki.g.a(cryptoChallengeProgressViewController2, cryptoChallengeProgressViewController2.R2(), u.c(cryptoChallengeProgressViewController2.Q), R$id.screenChallengeProgress_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(this.M);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (uiState.e) {
            ((w01.c) this.L.getValue()).a(R$raw.uikit_lottie_confetti_deprecated, w01.g.FIT_XY);
        }
        c1.S(d3().f310101c, u.c(new u0(new NavBarWithContainerBackground.VideoBackground(new UrlVideo(uiState.f201177a, (String) null, false, oz0.b.FIT, false, (oz0.c) null, 114), (Image) null, (VideoShutter) null, (s8) null, 30), uiState.f201178b, new au0.o0(uiState.f201179c))), null, null, 6);
        d3().f310100b.setModel(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z01.b) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f310101c;
        navBarWithBigTile.setHeightMode(new o2(new d0(1120, 1450)));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setTitleStyle(b1.DEFAULT);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.FULL_GRADIENT);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setMenuItems(u.c(new ActionNavBarMenuItem(new TextLocalisedClause(R$string.crypto_challenge_progress_info_button_accessibility_label, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "Info")));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f310101c;
        ViewController.P2(this, rd0.e.b(navBarWithBigTile.f59357t), new m11.q(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithBigTile.b()), new m11.q(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(navBarWithBigTile.f59360y.f57278q), new m11.q(this, null, 2), 3);
        ViewController.P2(this, kii.e.t(this.Q.f53022c, "hide(...)"), new m11.q(this, null, 3), 3);
        ViewController.P2(this, new r6(new d(rd0.e.b(d3().f310100b.f), 7), 20), new r(this, null, 0), 3);
        ViewController.P2(this, new r6(new d(rd0.e.b(d3().f310100b.f58955g), 8), 21), new r(this, null, 1), 3);
    }

    public final y01.a d3() {
        ViewBinding value = this.K.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (y01.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m11.e R2() {
        return (m11.e) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
