package com.revolut.sso.impl.ui.combined_authentication.two_buttons;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import aw0.s8;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.LogoWithTaglineView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.combined_authentication.two_buttons.CombinedAuthenticationTwoButtonsScreen;
import com.revolut.tracking.v3.ConsolidatedAuthContext;
import hx0.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.q0;
import lll.a;
import mx0.o9;
import no.k;
import oll.b;
import oll.e;
import oll.h;
import oll.i;
import oll.j;
import oz0.c;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/two_buttons/CombinedAuthenticationTwoButtonsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Loll/h;", "Lcli/w;", "Loll/i;", "Lno/k;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CombinedAuthenticationTwoButtonsScreen extends ViewController<h> implements w, k {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CombinedAuthenticationTwoButtonsScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenCombinedAuthenticationTwoButtonsBinding;", 0))};
    public final e K;
    public AnalyticsContext L;
    public final int M;
    public final ao.h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CombinedAuthenticationTwoButtonsScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        ConsolidatedAuthContext.a aVarNewBuilder = ConsolidatedAuthContext.newBuilder();
        String str = inputData.f226454a;
        aVarNewBuilder.c();
        ((ConsolidatedAuthContext) aVarNewBuilder.f49761b).setDetectedCountry(str);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.L = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        this.M = R$layout.screen_combined_authentication_two_buttons;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: oll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CombinedAuthenticationTwoButtonsScreen f226452b;

            {
                this.f226452b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CombinedAuthenticationTwoButtonsScreen combinedAuthenticationTwoButtonsScreen = this.f226452b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CombinedAuthenticationTwoButtonsScreen.R;
                        qji.b bVarU2 = combinedAuthenticationTwoButtonsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.combined_authentication.two_buttons.di.CombinedAuthenticationTwoButtonsScreenComponent.Injector");
                        ljl.j jVar = (ljl.j) bVarU2;
                        q0 q0Var = jVar.e;
                        ljl.j jVar2 = jVar.f;
                        e eVar = combinedAuthenticationTwoButtonsScreen.K;
                        eVar.getClass();
                        return new ljl.k(q0Var, jVar2, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CombinedAuthenticationTwoButtonsScreen.R;
                        return (j) ((ljl.k) combinedAuthenticationTwoButtonsScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = CombinedAuthenticationTwoButtonsScreen.R;
                        return n14.e.a(combinedAuthenticationTwoButtonsScreen, (j) combinedAuthenticationTwoButtonsScreen.P.getValue());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: oll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CombinedAuthenticationTwoButtonsScreen f226452b;

            {
                this.f226452b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CombinedAuthenticationTwoButtonsScreen combinedAuthenticationTwoButtonsScreen = this.f226452b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CombinedAuthenticationTwoButtonsScreen.R;
                        qji.b bVarU2 = combinedAuthenticationTwoButtonsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.combined_authentication.two_buttons.di.CombinedAuthenticationTwoButtonsScreenComponent.Injector");
                        ljl.j jVar = (ljl.j) bVarU2;
                        q0 q0Var = jVar.e;
                        ljl.j jVar2 = jVar.f;
                        e eVar = combinedAuthenticationTwoButtonsScreen.K;
                        eVar.getClass();
                        return new ljl.k(q0Var, jVar2, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CombinedAuthenticationTwoButtonsScreen.R;
                        return (j) ((ljl.k) combinedAuthenticationTwoButtonsScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = CombinedAuthenticationTwoButtonsScreen.R;
                        return n14.e.a(combinedAuthenticationTwoButtonsScreen, (j) combinedAuthenticationTwoButtonsScreen.P.getValue());
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: oll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CombinedAuthenticationTwoButtonsScreen f226452b;

            {
                this.f226452b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CombinedAuthenticationTwoButtonsScreen combinedAuthenticationTwoButtonsScreen = this.f226452b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CombinedAuthenticationTwoButtonsScreen.R;
                        qji.b bVarU2 = combinedAuthenticationTwoButtonsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.combined_authentication.two_buttons.di.CombinedAuthenticationTwoButtonsScreenComponent.Injector");
                        ljl.j jVar = (ljl.j) bVarU2;
                        q0 q0Var = jVar.e;
                        ljl.j jVar2 = jVar.f;
                        e eVar = combinedAuthenticationTwoButtonsScreen.K;
                        eVar.getClass();
                        return new ljl.k(q0Var, jVar2, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CombinedAuthenticationTwoButtonsScreen.R;
                        return (j) ((ljl.k) combinedAuthenticationTwoButtonsScreen.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = CombinedAuthenticationTwoButtonsScreen.R;
                        return n14.e.a(combinedAuthenticationTwoButtonsScreen, (j) combinedAuthenticationTwoButtonsScreen.P.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        String str = uiState.f226459a;
        Image image = uiState.f226460b;
        NavBarWithContainerBackground videoBackground = str != null ? new NavBarWithContainerBackground.VideoBackground(new UrlVideo(str, (String) null, true, oz0.b.CENTER_CROP, false, (c) null, 114), image, new VideoShutter.Fallback(image), (s8) null, 24) : new NavBarWithContainerBackground.ImageBackground(image, s8.MULTICOLOR, (Color.SolidRes) null, 12);
        WallpaperAssetSwitcher wallpaperAssetSwitcher = d3().d;
        wallpaperAssetSwitcher.setDefaultBackgroundColor(-16777216);
        wallpaperAssetSwitcher.setBackground(videoBackground, null);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.L = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ljl.k) this.O.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.revolut_sso_consolidated_auth_variant_two_buttons_label, null, null, 14));
        TwinVerticalButton twinVerticalButton = d3().f115640c;
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.revolut_sso_consolidated_auth_action_create_account, null, null, 14));
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.revolut_sso_consolidated_auth_action_log_in, null, null, 14));
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        o9 o9Var = this.K.f226456c.f105892b;
        if (o9Var != null) {
            d3().f115639b.setModel(new LogoWithTaglineView.a(null, o9Var, 1));
        }
        LogoWithTaglineView logoWithTaglineView = d3().f115639b;
        Intrinsics.checkNotNullExpressionValue(logoWithTaglineView, "screenCombinedAuthentica…uttonsLogoWithTaglineView");
        n.a(logoWithTaglineView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ((a) ((ljl.k) this.O.getValue()).f196005b.f196080v0.get()).a(false);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((a) ((ljl.k) this.O.getValue()).f196005b.f196080v0.get()).a(true);
        ViewController.P2(this, rd0.e.b(d3().f115640c.o0()), new oll.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f115640c.p0()), new oll.c(this, null, 1), 3);
    }

    public final dkl.c d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dkl.c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.Q.getValue();
    }
}
