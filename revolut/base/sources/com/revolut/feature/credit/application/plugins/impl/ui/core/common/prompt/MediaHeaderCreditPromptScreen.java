package com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.s0;
import au0.u0;
import aw0.s8;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerLinearLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.MediaHeaderCreditPromptScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.b8;
import dw3.c8;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import njj.l;
import q97.b1;
import r74.b0;
import r74.c0;
import r74.d0;
import r74.m;
import r74.n;
import r74.p;
import r74.x;
import rd0.c;
import rd0.d;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/core/common/prompt/MediaHeaderCreditPromptScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/common/prompt/a;", "Ldli/a;", "Lr74/p;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MediaHeaderCreditPromptScreen extends PluginScreenController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(MediaHeaderCreditPromptScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenMediaHeaderCreditPromptBinding;", 0))};
    public final CreditPromptScreenContract$InputData L;
    public final int M;
    public final h N;
    public AnalyticsContext O;
    public final Object P;
    public final Object Q;
    public final FullScreenStateDelegate R;
    public final NotificationCentreItemDelegate S;
    public final PlainTextDelegate T;
    public final TextDelegate U;
    public final RowDelegate V;
    public final Object W;
    public final Object X;

    public MediaHeaderCreditPromptScreen(CreditPromptScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_media_header_credit_prompt;
        this.N = s.t(this, x.f);
        this.O = inputData.f67331c;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: r74.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MediaHeaderCreditPromptScreen f252016b;

            {
                this.f252016b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MediaHeaderCreditPromptScreen mediaHeaderCreditPromptScreen = this.f252016b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MediaHeaderCreditPromptScreen.Y;
                        qji.b bVarU2 = mediaHeaderCreditPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.di.CreditPromptScreenInjector");
                        return (c8) ((b8) ((u74.a) bVarU2).b().mo3808a(mediaHeaderCreditPromptScreen)).b(mediaHeaderCreditPromptScreen.L).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = MediaHeaderCreditPromptScreen.Y;
                        return ((c8) mediaHeaderCreditPromptScreen.P.getValue()).b();
                    case 2:
                        return zhm.v.k(mediaHeaderCreditPromptScreen.S, mediaHeaderCreditPromptScreen.T, mediaHeaderCreditPromptScreen.R, mediaHeaderCreditPromptScreen.V, mediaHeaderCreditPromptScreen.U, new EsimDelegate(), new ListSubheaderDelegate(), new ScrollerDelegate(zhm.u.c(new BigTileDelegate()), false), new CellDetailsDelegate());
                    default:
                        KProperty[] kPropertyArr3 = MediaHeaderCreditPromptScreen.Y;
                        MediaHeaderCreditPromptScreen mediaHeaderCreditPromptScreen2 = this.f252016b;
                        return dli.f.a(mediaHeaderCreditPromptScreen2, mediaHeaderCreditPromptScreen2.d(), (List) mediaHeaderCreditPromptScreen2.W.getValue(), R$id.screenMediaHeaderCreditPrompt_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: r74.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MediaHeaderCreditPromptScreen f252016b;

            {
                this.f252016b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MediaHeaderCreditPromptScreen mediaHeaderCreditPromptScreen = this.f252016b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MediaHeaderCreditPromptScreen.Y;
                        qji.b bVarU2 = mediaHeaderCreditPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.di.CreditPromptScreenInjector");
                        return (c8) ((b8) ((u74.a) bVarU2).b().mo3808a(mediaHeaderCreditPromptScreen)).b(mediaHeaderCreditPromptScreen.L).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = MediaHeaderCreditPromptScreen.Y;
                        return ((c8) mediaHeaderCreditPromptScreen.P.getValue()).b();
                    case 2:
                        return zhm.v.k(mediaHeaderCreditPromptScreen.S, mediaHeaderCreditPromptScreen.T, mediaHeaderCreditPromptScreen.R, mediaHeaderCreditPromptScreen.V, mediaHeaderCreditPromptScreen.U, new EsimDelegate(), new ListSubheaderDelegate(), new ScrollerDelegate(zhm.u.c(new BigTileDelegate()), false), new CellDetailsDelegate());
                    default:
                        KProperty[] kPropertyArr3 = MediaHeaderCreditPromptScreen.Y;
                        MediaHeaderCreditPromptScreen mediaHeaderCreditPromptScreen2 = this.f252016b;
                        return dli.f.a(mediaHeaderCreditPromptScreen2, mediaHeaderCreditPromptScreen2.d(), (List) mediaHeaderCreditPromptScreen2.W.getValue(), R$id.screenMediaHeaderCreditPrompt_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = new FullScreenStateDelegate();
        this.S = new NotificationCentreItemDelegate();
        this.T = new PlainTextDelegate();
        this.U = new TextDelegate();
        this.V = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: r74.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MediaHeaderCreditPromptScreen f252016b;

            {
                this.f252016b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MediaHeaderCreditPromptScreen mediaHeaderCreditPromptScreen = this.f252016b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MediaHeaderCreditPromptScreen.Y;
                        qji.b bVarU2 = mediaHeaderCreditPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.di.CreditPromptScreenInjector");
                        return (c8) ((b8) ((u74.a) bVarU2).b().mo3808a(mediaHeaderCreditPromptScreen)).b(mediaHeaderCreditPromptScreen.L).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = MediaHeaderCreditPromptScreen.Y;
                        return ((c8) mediaHeaderCreditPromptScreen.P.getValue()).b();
                    case 2:
                        return zhm.v.k(mediaHeaderCreditPromptScreen.S, mediaHeaderCreditPromptScreen.T, mediaHeaderCreditPromptScreen.R, mediaHeaderCreditPromptScreen.V, mediaHeaderCreditPromptScreen.U, new EsimDelegate(), new ListSubheaderDelegate(), new ScrollerDelegate(zhm.u.c(new BigTileDelegate()), false), new CellDetailsDelegate());
                    default:
                        KProperty[] kPropertyArr3 = MediaHeaderCreditPromptScreen.Y;
                        MediaHeaderCreditPromptScreen mediaHeaderCreditPromptScreen2 = this.f252016b;
                        return dli.f.a(mediaHeaderCreditPromptScreen2, mediaHeaderCreditPromptScreen2.d(), (List) mediaHeaderCreditPromptScreen2.W.getValue(), R$id.screenMediaHeaderCreditPrompt_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.X = w.y0(new Function0(this) { // from class: r74.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MediaHeaderCreditPromptScreen f252016b;

            {
                this.f252016b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                MediaHeaderCreditPromptScreen mediaHeaderCreditPromptScreen = this.f252016b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MediaHeaderCreditPromptScreen.Y;
                        qji.b bVarU2 = mediaHeaderCreditPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.di.CreditPromptScreenInjector");
                        return (c8) ((b8) ((u74.a) bVarU2).b().mo3808a(mediaHeaderCreditPromptScreen)).b(mediaHeaderCreditPromptScreen.L).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = MediaHeaderCreditPromptScreen.Y;
                        return ((c8) mediaHeaderCreditPromptScreen.P.getValue()).b();
                    case 2:
                        return zhm.v.k(mediaHeaderCreditPromptScreen.S, mediaHeaderCreditPromptScreen.T, mediaHeaderCreditPromptScreen.R, mediaHeaderCreditPromptScreen.V, mediaHeaderCreditPromptScreen.U, new EsimDelegate(), new ListSubheaderDelegate(), new ScrollerDelegate(zhm.u.c(new BigTileDelegate()), false), new CellDetailsDelegate());
                    default:
                        KProperty[] kPropertyArr3 = MediaHeaderCreditPromptScreen.Y;
                        MediaHeaderCreditPromptScreen mediaHeaderCreditPromptScreen2 = this.f252016b;
                        return dli.f.a(mediaHeaderCreditPromptScreen2, mediaHeaderCreditPromptScreen2.d(), (List) mediaHeaderCreditPromptScreen2.W.getValue(), R$id.screenMediaHeaderCreditPrompt_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (!(uiState instanceof r74.o)) {
            if (!(uiState instanceof n) && !(uiState instanceof m)) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalStateException illegalStateException = new IllegalStateException(p.a.p("UI state ", o0.f186429a.b(uiState.getClass()).m(), " is not supported by CreditPromptScreen, please use CreditPromptScreen"));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        r74.o oVar2 = (r74.o) uiState;
        TextLocalisedClause textLocalisedClause = oVar2.f252001a;
        Clause clause = oVar2.d;
        NavBarWithBigTile screenMediaHeaderCreditPromptNavBarWithBigTile = d3().d;
        Intrinsics.checkNotNullExpressionValue(screenMediaHeaderCreditPromptNavBarWithBigTile, "screenMediaHeaderCreditPromptNavBarWithBigTile");
        screenMediaHeaderCreditPromptNavBarWithBigTile.setToolbarTitle(textLocalisedClause);
        screenMediaHeaderCreditPromptNavBarWithBigTile.setNavigationButtonIcon(oVar2.f252005h);
        Image image = oVar2.f252003c;
        if (image != null) {
            NavBarWithContainerBackground.ImageBackground imageBackground = new NavBarWithContainerBackground.ImageBackground(image, (s8) null, (Color.SolidRes) null, 14);
            Clause clause2 = oVar2.f252002b;
            List listC = u.c(new u0(imageBackground, textLocalisedClause, clause2 != null ? new au0.o0(clause2) : null));
            NavBarWithBigTile screenMediaHeaderCreditPromptNavBarWithBigTile2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(screenMediaHeaderCreditPromptNavBarWithBigTile2, "screenMediaHeaderCreditPromptNavBarWithBigTile");
            c1.S(screenMediaHeaderCreditPromptNavBarWithBigTile2, listC, null, null, 6);
        }
        LegacyContentContainerLinearLayout screenMediaHeaderCreditPromptLayoutButtons = d3().f10717c;
        Intrinsics.checkNotNullExpressionValue(screenMediaHeaderCreditPromptLayoutButtons, "screenMediaHeaderCreditPromptLayoutButtons");
        screenMediaHeaderCreditPromptLayoutButtons.setVisibility(0);
        LargeActionButton largeActionButtonF3 = f3();
        Clause clause3 = oVar2.f;
        largeActionButtonF3.setVisibility(clause != null ? 0 : 8);
        f3().setText(clause);
        LargeActionButton.ButtonStyle buttonStyle = oVar2.e;
        if (buttonStyle != null) {
            f3().o(buttonStyle);
        }
        g3().setVisibility(clause3 == null ? 8 : 0);
        g3().setText(clause3);
        LargeActionButton.ButtonStyle buttonStyle2 = oVar2.f252004g;
        if (buttonStyle2 != null) {
            g3().o(buttonStyle2);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((b) d()).C2(a.C0471a.f67333a);
        return true;
    }

    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController, no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.O = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c8) this.P.getValue();
    }

    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController, no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getO() {
        return this.O;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f3().setVisibility(8);
        g3().setVisibility(8);
        NavBarWithBigTile screenMediaHeaderCreditPromptNavBarWithBigTile = d3().d;
        Intrinsics.checkNotNullExpressionValue(screenMediaHeaderCreditPromptNavBarWithBigTile, "screenMediaHeaderCreditPromptNavBarWithBigTile");
        screenMediaHeaderCreditPromptNavBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        screenMediaHeaderCreditPromptNavBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        screenMediaHeaderCreditPromptNavBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        f3().setLoadingButtonTag("PRIMARY_BUTTON");
        g3().setLoadingButtonTag("SECONDARY_BUTTON");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile screenMediaHeaderCreditPromptNavBarWithBigTile = d3().d;
        Intrinsics.checkNotNullExpressionValue(screenMediaHeaderCreditPromptNavBarWithBigTile, "screenMediaHeaderCreditPromptNavBarWithBigTile");
        ViewController.P2(this, rd0.e.b(screenMediaHeaderCreditPromptNavBarWithBigTile.f59357t), new c0(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(f3().o), new c0(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(g3().o), new c0(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new d0(this, null), 3);
        ViewController.P2(this, new l(new b1(rd0.e.b(this.S.f52865c), 28), 26), new b0(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.T.d.f121375b), new b0(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.V.f53226s), new b0(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.U.d), new b0(this, null, 0), 3);
    }

    public final aw3.q d3() {
        ViewBinding value = this.N.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.q) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r74.l d() {
        return (r74.l) this.Q.getValue();
    }

    public final LargeActionButton f3() {
        LargeActionButton screenMediaHeaderCreditPromptFirstButton = d3().f10716b;
        Intrinsics.checkNotNullExpressionValue(screenMediaHeaderCreditPromptFirstButton, "screenMediaHeaderCreditPromptFirstButton");
        return screenMediaHeaderCreditPromptFirstButton;
    }

    public final LargeActionButton g3() {
        LargeActionButton screenMediaHeaderCreditPromptSecondButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenMediaHeaderCreditPromptSecondButton, "screenMediaHeaderCreditPromptSecondButton");
        return screenMediaHeaderCreditPromptSecondButton;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF93089d0() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }
}
