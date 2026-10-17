package com.revolut.sso.impl.ui.combined_authentication.unified;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.l5;
import aw0.s8;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.LoginActionFooterDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SeparatorDelegate;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LogoWithTaglineView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.combined_authentication.unified.CombinedAuthenticationUnifiedScreen;
import com.revolut.tracking.v3.ConsolidatedAuthContext;
import e0m.e;
import hx0.n;
import java.util.ArrayList;
import java.util.List;
import jji.d;
import kji.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.l;
import ljl.q0;
import mx0.o9;
import no.k;
import oz0.c;
import q97.b1;
import qll.b;
import qll.b0;
import qll.c0;
import qll.g;
import qll.j;
import qll.r;
import qo0.i;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/unified/CombinedAuthenticationUnifiedScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqll/b0;", "Ldli/a;", "Lqll/c0;", "Lkji/f;", "Lno/k;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CombinedAuthenticationUnifiedScreen extends ViewController<b0> implements dli.a, f, k {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(CombinedAuthenticationUnifiedScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenCombinedAuthenticationUnifiedBinding;", 0))};
    public final r K;
    public AnalyticsContext L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final RowDelegate R;
    public final ListSubheaderDelegate S;
    public final PhoneEditorDelegate T;
    public final InputTextDelegate U;
    public final LoginActionFooterDelegate V;
    public final LargeActionButtonDelegate W;
    public final Object X;

    public CombinedAuthenticationUnifiedScreen(r inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        ConsolidatedAuthContext.a aVarNewBuilder = ConsolidatedAuthContext.newBuilder();
        String str = inputData.f247598a;
        aVarNewBuilder.c();
        ((ConsolidatedAuthContext) aVarNewBuilder.f49761b).setDetectedCountry(str);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.L = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        this.M = R$layout.screen_combined_authentication_unified;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: qll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CombinedAuthenticationUnifiedScreen f247576b;

            {
                this.f247576b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen = this.f247576b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CombinedAuthenticationUnifiedScreen.Y;
                        qji.b bVarU2 = combinedAuthenticationUnifiedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.combined_authentication.unified.di.CombinedAuthenticationUnifiedScreenComponent.Injector");
                        ljl.j jVar = (ljl.j) bVarU2;
                        q0 q0Var = jVar.e;
                        ljl.j jVar2 = jVar.f;
                        r rVar = combinedAuthenticationUnifiedScreen.K;
                        rVar.getClass();
                        return new ljl.l(q0Var, jVar2, rVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CombinedAuthenticationUnifiedScreen.Y;
                        return (j) ((ljl.l) combinedAuthenticationUnifiedScreen.O.getValue()).f196019j.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CombinedAuthenticationUnifiedScreen.Y;
                        j70.a aVarK = ((ljl.l) combinedAuthenticationUnifiedScreen.O.getValue()).f196015b.f196062g.k();
                        vc.s.j(aVarK);
                        return new qo0.i(aVarK);
                    default:
                        KProperty[] kPropertyArr4 = CombinedAuthenticationUnifiedScreen.Y;
                        CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen2 = this.f247576b;
                        return dli.f.a(combinedAuthenticationUnifiedScreen2, combinedAuthenticationUnifiedScreen2.R2(), zhm.v.k(combinedAuthenticationUnifiedScreen2.R, combinedAuthenticationUnifiedScreen2.S, combinedAuthenticationUnifiedScreen2.T, combinedAuthenticationUnifiedScreen2.U, new SeparatorDelegate(), combinedAuthenticationUnifiedScreen2.V, combinedAuthenticationUnifiedScreen2.W), R$id.screenCombinedAuthenticationUnified_recyclerView, new ql6.s(2), null, null, 48);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: qll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CombinedAuthenticationUnifiedScreen f247576b;

            {
                this.f247576b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen = this.f247576b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CombinedAuthenticationUnifiedScreen.Y;
                        qji.b bVarU2 = combinedAuthenticationUnifiedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.combined_authentication.unified.di.CombinedAuthenticationUnifiedScreenComponent.Injector");
                        ljl.j jVar = (ljl.j) bVarU2;
                        q0 q0Var = jVar.e;
                        ljl.j jVar2 = jVar.f;
                        r rVar = combinedAuthenticationUnifiedScreen.K;
                        rVar.getClass();
                        return new ljl.l(q0Var, jVar2, rVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CombinedAuthenticationUnifiedScreen.Y;
                        return (j) ((ljl.l) combinedAuthenticationUnifiedScreen.O.getValue()).f196019j.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CombinedAuthenticationUnifiedScreen.Y;
                        j70.a aVarK = ((ljl.l) combinedAuthenticationUnifiedScreen.O.getValue()).f196015b.f196062g.k();
                        vc.s.j(aVarK);
                        return new qo0.i(aVarK);
                    default:
                        KProperty[] kPropertyArr4 = CombinedAuthenticationUnifiedScreen.Y;
                        CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen2 = this.f247576b;
                        return dli.f.a(combinedAuthenticationUnifiedScreen2, combinedAuthenticationUnifiedScreen2.R2(), zhm.v.k(combinedAuthenticationUnifiedScreen2.R, combinedAuthenticationUnifiedScreen2.S, combinedAuthenticationUnifiedScreen2.T, combinedAuthenticationUnifiedScreen2.U, new SeparatorDelegate(), combinedAuthenticationUnifiedScreen2.V, combinedAuthenticationUnifiedScreen2.W), R$id.screenCombinedAuthenticationUnified_recyclerView, new ql6.s(2), null, null, 48);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CombinedAuthenticationUnifiedScreen f247576b;

            {
                this.f247576b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen = this.f247576b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CombinedAuthenticationUnifiedScreen.Y;
                        qji.b bVarU2 = combinedAuthenticationUnifiedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.combined_authentication.unified.di.CombinedAuthenticationUnifiedScreenComponent.Injector");
                        ljl.j jVar = (ljl.j) bVarU2;
                        q0 q0Var = jVar.e;
                        ljl.j jVar2 = jVar.f;
                        r rVar = combinedAuthenticationUnifiedScreen.K;
                        rVar.getClass();
                        return new ljl.l(q0Var, jVar2, rVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CombinedAuthenticationUnifiedScreen.Y;
                        return (j) ((ljl.l) combinedAuthenticationUnifiedScreen.O.getValue()).f196019j.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CombinedAuthenticationUnifiedScreen.Y;
                        j70.a aVarK = ((ljl.l) combinedAuthenticationUnifiedScreen.O.getValue()).f196015b.f196062g.k();
                        vc.s.j(aVarK);
                        return new qo0.i(aVarK);
                    default:
                        KProperty[] kPropertyArr4 = CombinedAuthenticationUnifiedScreen.Y;
                        CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen2 = this.f247576b;
                        return dli.f.a(combinedAuthenticationUnifiedScreen2, combinedAuthenticationUnifiedScreen2.R2(), zhm.v.k(combinedAuthenticationUnifiedScreen2.R, combinedAuthenticationUnifiedScreen2.S, combinedAuthenticationUnifiedScreen2.T, combinedAuthenticationUnifiedScreen2.U, new SeparatorDelegate(), combinedAuthenticationUnifiedScreen2.V, combinedAuthenticationUnifiedScreen2.W), R$id.screenCombinedAuthenticationUnified_recyclerView, new ql6.s(2), null, null, 48);
                }
            }
        });
        this.R = new RowDelegate(null, null, 7);
        this.S = new ListSubheaderDelegate();
        this.T = new PhoneEditorDelegate();
        this.U = new InputTextDelegate(null);
        this.V = new LoginActionFooterDelegate();
        this.W = new LargeActionButtonDelegate();
        final int i5 = 3;
        this.X = w.y0(new Function0(this) { // from class: qll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CombinedAuthenticationUnifiedScreen f247576b;

            {
                this.f247576b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen = this.f247576b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CombinedAuthenticationUnifiedScreen.Y;
                        qji.b bVarU2 = combinedAuthenticationUnifiedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.combined_authentication.unified.di.CombinedAuthenticationUnifiedScreenComponent.Injector");
                        ljl.j jVar = (ljl.j) bVarU2;
                        q0 q0Var = jVar.e;
                        ljl.j jVar2 = jVar.f;
                        r rVar = combinedAuthenticationUnifiedScreen.K;
                        rVar.getClass();
                        return new ljl.l(q0Var, jVar2, rVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CombinedAuthenticationUnifiedScreen.Y;
                        return (j) ((ljl.l) combinedAuthenticationUnifiedScreen.O.getValue()).f196019j.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CombinedAuthenticationUnifiedScreen.Y;
                        j70.a aVarK = ((ljl.l) combinedAuthenticationUnifiedScreen.O.getValue()).f196015b.f196062g.k();
                        vc.s.j(aVarK);
                        return new qo0.i(aVarK);
                    default:
                        KProperty[] kPropertyArr4 = CombinedAuthenticationUnifiedScreen.Y;
                        CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen2 = this.f247576b;
                        return dli.f.a(combinedAuthenticationUnifiedScreen2, combinedAuthenticationUnifiedScreen2.R2(), zhm.v.k(combinedAuthenticationUnifiedScreen2.R, combinedAuthenticationUnifiedScreen2.S, combinedAuthenticationUnifiedScreen2.T, combinedAuthenticationUnifiedScreen2.U, new SeparatorDelegate(), combinedAuthenticationUnifiedScreen2.V, combinedAuthenticationUnifiedScreen2.W), R$id.screenCombinedAuthenticationUnified_recyclerView, new ql6.s(2), null, null, 48);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c0 uiState = (c0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        BasicNavBar basicNavBar = d3().f115642b;
        basicNavBar.setNavigationButtonImage(uiState.f247581c);
        List<? extends NavBarMenuItem> list = uiState.f;
        if (list != null) {
            basicNavBar.setMenuItems(list);
        }
        if (uiState.f247580b) {
            e.a(d3().f115641a);
        }
        String str = uiState.d;
        Image image = uiState.e;
        boolean z = uiState.f247579a;
        NavBarWithContainerBackground videoBackground = str != null ? new NavBarWithContainerBackground.VideoBackground(new UrlVideo(str, (String) null, true, oz0.b.CENTER_CROP, false, (c) null, 114), image, new VideoShutter.Fallback(image), (s8) null, 24) : new NavBarWithContainerBackground.ImageBackground(image, s8.MULTICOLOR, (Color.SolidRes) null, 12);
        WallpaperAssetSwitcher backgroundView = d3().f;
        backgroundView.setDefaultBackgroundColor(-16777216);
        backgroundView.setBackground(videoBackground, null);
        i iVar = (i) this.Q.getValue();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
        if (kp0.w0.n(iVar.f247975a)) {
            Boolean bool = iVar.e;
            boolean z3 = bool == null;
            boolean zF = Intrinsics.f(bool, Boolean.valueOf(z));
            iVar.e = Boolean.valueOf(z);
            if (z3) {
                iVar.b(backgroundView);
                return;
            }
            if (zF) {
                return;
            }
            float f = BitmapDescriptorFactory.HUE_RED;
            float f4 = z ? 0.0f : iVar.f247978g;
            if (z) {
                f = iVar.f247978g;
            }
            ValueAnimator valueAnimator = iVar.f;
            long jAbs = 500;
            if (valueAnimator != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                valueAnimator.cancel();
                jAbs = (long) (500 * (Math.abs(fFloatValue - f) / Math.abs(f4 - f)));
                f4 = fFloatValue;
            }
            ArrayList arrayList = new ArrayList();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f4, f);
            valueAnimatorOfFloat.setDuration(jAbs);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new d(arrayList, 2, iVar, backgroundView));
            valueAnimatorOfFloat.addListener(new l5(iVar, 20));
            valueAnimatorOfFloat.start();
            iVar.f = valueAnimatorOfFloat;
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.L = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.O.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.revolut_sso_consolidated_auth_variant_unified_label, null, null, 14));
        final i iVar = (i) this.Q.getValue();
        ControllerContainerConstraintLayout rootView = d3().f115641a;
        Intrinsics.checkNotNullExpressionValue(rootView, "getRoot(...)");
        final WallpaperAssetSwitcher backgroundView = d3().f;
        Intrinsics.checkNotNullExpressionValue(backgroundView, "screenCombinedAuthentica…iedWallpaperAssetSwitcher");
        final ScreenContentRecyclerView recyclerView = d3().e;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "screenCombinedAuthenticationUnifiedRecyclerView");
        iVar.getClass();
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (kp0.w0.n(iVar.f247975a)) {
            Context context = rootView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iVar.f247978g = kli.a.l(context, 75.0f);
            float fL = kli.a.l(context, 10.0f);
            iVar.f247979h = fL;
            iVar.i = fL / 3;
            int iK = kli.a.k(context, 200.0f);
            iVar.f247980j = iK;
            iVar.k = iK / 3;
            rootView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: qo0.g
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
                    ScreenContentRecyclerView screenContentRecyclerView = recyclerView;
                    int childCount = screenContentRecyclerView.getChildCount();
                    int height = 0;
                    int i33 = 0;
                    while (true) {
                        if (i33 >= childCount) {
                            break;
                        }
                        View childAt = screenContentRecyclerView.getChildAt(i33);
                        if (screenContentRecyclerView.getChildViewHolder(childAt).getBindingAdapterPosition() != -1) {
                            height = screenContentRecyclerView.getHeight() - childAt.getTop();
                            break;
                        }
                        i33++;
                    }
                    i iVar2 = iVar;
                    int i43 = iVar2.f247976b;
                    WallpaperAssetSwitcher wallpaperAssetSwitcher = backgroundView;
                    if (i43 == height && iVar2.d == wallpaperAssetSwitcher.getWidth() && iVar2.f247977c == wallpaperAssetSwitcher.getHeight()) {
                        return;
                    }
                    iVar2.f247976b = height;
                    iVar2.d = wallpaperAssetSwitcher.getWidth();
                    iVar2.f247977c = wallpaperAssetSwitcher.getHeight();
                    iVar2.b(wallpaperAssetSwitcher);
                }
            });
        }
        o9 o9Var = this.K.f247600c.f105892b;
        if (o9Var != null) {
            d3().d.setModel(new LogoWithTaglineView.a(null, o9Var, 1));
        }
        LogoWithTaglineView logoWithTaglineView = d3().d;
        Intrinsics.checkNotNullExpressionValue(logoWithTaglineView, "screenCombinedAuthentica…nifiedLogoWithTaglineView");
        n.a(logoWithTaglineView);
        d3().e.setOnTouchListener(new gzl.b(this, 10));
        View screenCombinedAuthenticationUnifiedBgOverlay = d3().f115643c;
        Intrinsics.checkNotNullExpressionValue(screenCombinedAuthenticationUnifiedBgOverlay, "screenCombinedAuthenticationUnifiedBgOverlay");
        ny0.i.e(screenCombinedAuthenticationUnifiedBgOverlay);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ((lll.a) ((l) this.O.getValue()).f196015b.f196080v0.get()).a(false);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((lll.a) ((l) this.O.getValue()).f196015b.f196080v0.get()).a(true);
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f115642b.f59211b), new qll.f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f115642b.f59210a.f57403b), new qll.d(this, continuation, 1), 3);
        PhoneEditorDelegate phoneEditorDelegate = this.T;
        ViewController.P2(this, rd0.e.b(phoneEditorDelegate.f.f121375b), new qll.d(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(phoneEditorDelegate.f52894c.f121375b), new qll.f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(phoneEditorDelegate.e.f121375b), new g(this, null), 3);
        InputTextDelegate inputTextDelegate = this.U;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new qll.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f.f121375b), new qll.d(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.V.f52752c.f121375b), new qll.d(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.W.d.f121375b), new qll.i(this, null), 3);
        ViewController.P2(this, new b1(rd0.e.b(this.R.f53218h), 8), new qll.d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52707c), new qll.e(this, null), 3);
    }

    public final dkl.d d3() {
        ViewBinding value = this.N.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dkl.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }
}
