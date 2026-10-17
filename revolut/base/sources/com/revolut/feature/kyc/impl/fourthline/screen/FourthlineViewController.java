package com.revolut.feature.kyc.impl.fourthline.screen;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import cli.o;
import cli.q;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.fourthline.screen.FourthlineControllerContract$InputData;
import com.revolut.feature.kyc.impl.fourthline.screen.FourthlineViewController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ox0.b0;
import te0.w;
import vc.s;
import vo8.b;
import vv8.c;
import vv8.d;
import vv8.e;
import vv8.u;
import vv8.v;
import zu8.c0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/impl/fourthline/screen/FourthlineViewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvv8/c;", "Ldli/a;", "Lvv8/e;", "Lno/m;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FourthlineViewController extends ViewController<c> implements a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(FourthlineViewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final FourthlineControllerContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final AnalyticsProduct R;
    public final Object S;
    public final Object T;
    public final Object U;

    public FourthlineViewController(FourthlineControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: vv8.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FourthlineViewController f292500b;

            {
                this.f292500b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FourthlineViewController fourthlineViewController = this.f292500b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FourthlineViewController.V;
                        Application application = fourthlineViewController.m2().getApplication();
                        Intrinsics.i(application, "null cannot be cast to non-null type android.app.Application");
                        return application;
                    case 1:
                        KProperty[] kPropertyArr2 = FourthlineViewController.V;
                        return (Application.ActivityLifecycleCallbacks) ((zu8.o) fourthlineViewController.S.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = FourthlineViewController.V;
                        qji.b bVarU2 = fourthlineViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.fourthline.screen.di.FourthlineControllerInjector");
                        zu8.p pVar = (zu8.p) bVarU2;
                        c0 c0Var = pVar.f325333b;
                        zu8.p pVar2 = pVar.f325334c;
                        FourthlineControllerContract$InputData fourthlineControllerContract$InputData = fourthlineViewController.K;
                        fourthlineControllerContract$InputData.getClass();
                        Activity activityM2 = fourthlineViewController.m2();
                        activityM2.getClass();
                        return new zu8.o(c0Var, pVar2, activityM2, fourthlineControllerContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = FourthlineViewController.V;
                        return (d) ((zu8.o) fourthlineViewController.S.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = FourthlineViewController.V;
                        FourthlineViewController fourthlineViewController2 = this.f292500b;
                        return dli.f.a(fourthlineViewController2, (d) fourthlineViewController2.T.getValue(), zhm.v.k((RowDelegate) fourthlineViewController2.O.getValue(), (SimpleMediaDelegate) fourthlineViewController2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: vv8.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FourthlineViewController f292500b;

            {
                this.f292500b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FourthlineViewController fourthlineViewController = this.f292500b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FourthlineViewController.V;
                        Application application = fourthlineViewController.m2().getApplication();
                        Intrinsics.i(application, "null cannot be cast to non-null type android.app.Application");
                        return application;
                    case 1:
                        KProperty[] kPropertyArr2 = FourthlineViewController.V;
                        return (Application.ActivityLifecycleCallbacks) ((zu8.o) fourthlineViewController.S.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = FourthlineViewController.V;
                        qji.b bVarU2 = fourthlineViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.fourthline.screen.di.FourthlineControllerInjector");
                        zu8.p pVar = (zu8.p) bVarU2;
                        c0 c0Var = pVar.f325333b;
                        zu8.p pVar2 = pVar.f325334c;
                        FourthlineControllerContract$InputData fourthlineControllerContract$InputData = fourthlineViewController.K;
                        fourthlineControllerContract$InputData.getClass();
                        Activity activityM2 = fourthlineViewController.m2();
                        activityM2.getClass();
                        return new zu8.o(c0Var, pVar2, activityM2, fourthlineControllerContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = FourthlineViewController.V;
                        return (d) ((zu8.o) fourthlineViewController.S.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = FourthlineViewController.V;
                        FourthlineViewController fourthlineViewController2 = this.f292500b;
                        return dli.f.a(fourthlineViewController2, (d) fourthlineViewController2.T.getValue(), zhm.v.k((RowDelegate) fourthlineViewController2.O.getValue(), (SimpleMediaDelegate) fourthlineViewController2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = w.y0(new b(8));
        this.P = w.y0(new b(9));
        this.Q = s.t(this, u.f);
        AnalyticsProduct analyticsProduct = inputData.e;
        this.R = analyticsProduct == null ? AnalyticsProduct.Shared.FinCrime.f : analyticsProduct;
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: vv8.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FourthlineViewController f292500b;

            {
                this.f292500b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FourthlineViewController fourthlineViewController = this.f292500b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FourthlineViewController.V;
                        Application application = fourthlineViewController.m2().getApplication();
                        Intrinsics.i(application, "null cannot be cast to non-null type android.app.Application");
                        return application;
                    case 1:
                        KProperty[] kPropertyArr2 = FourthlineViewController.V;
                        return (Application.ActivityLifecycleCallbacks) ((zu8.o) fourthlineViewController.S.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = FourthlineViewController.V;
                        qji.b bVarU2 = fourthlineViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.fourthline.screen.di.FourthlineControllerInjector");
                        zu8.p pVar = (zu8.p) bVarU2;
                        c0 c0Var = pVar.f325333b;
                        zu8.p pVar2 = pVar.f325334c;
                        FourthlineControllerContract$InputData fourthlineControllerContract$InputData = fourthlineViewController.K;
                        fourthlineControllerContract$InputData.getClass();
                        Activity activityM2 = fourthlineViewController.m2();
                        activityM2.getClass();
                        return new zu8.o(c0Var, pVar2, activityM2, fourthlineControllerContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = FourthlineViewController.V;
                        return (d) ((zu8.o) fourthlineViewController.S.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = FourthlineViewController.V;
                        FourthlineViewController fourthlineViewController2 = this.f292500b;
                        return dli.f.a(fourthlineViewController2, (d) fourthlineViewController2.T.getValue(), zhm.v.k((RowDelegate) fourthlineViewController2.O.getValue(), (SimpleMediaDelegate) fourthlineViewController2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: vv8.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FourthlineViewController f292500b;

            {
                this.f292500b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                FourthlineViewController fourthlineViewController = this.f292500b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FourthlineViewController.V;
                        Application application = fourthlineViewController.m2().getApplication();
                        Intrinsics.i(application, "null cannot be cast to non-null type android.app.Application");
                        return application;
                    case 1:
                        KProperty[] kPropertyArr2 = FourthlineViewController.V;
                        return (Application.ActivityLifecycleCallbacks) ((zu8.o) fourthlineViewController.S.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = FourthlineViewController.V;
                        qji.b bVarU2 = fourthlineViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.fourthline.screen.di.FourthlineControllerInjector");
                        zu8.p pVar = (zu8.p) bVarU2;
                        c0 c0Var = pVar.f325333b;
                        zu8.p pVar2 = pVar.f325334c;
                        FourthlineControllerContract$InputData fourthlineControllerContract$InputData = fourthlineViewController.K;
                        fourthlineControllerContract$InputData.getClass();
                        Activity activityM2 = fourthlineViewController.m2();
                        activityM2.getClass();
                        return new zu8.o(c0Var, pVar2, activityM2, fourthlineControllerContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = FourthlineViewController.V;
                        return (d) ((zu8.o) fourthlineViewController.S.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = FourthlineViewController.V;
                        FourthlineViewController fourthlineViewController2 = this.f292500b;
                        return dli.f.a(fourthlineViewController2, (d) fourthlineViewController2.T.getValue(), zhm.v.k((RowDelegate) fourthlineViewController2.O.getValue(), (SimpleMediaDelegate) fourthlineViewController2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.U = w.y0(new Function0(this) { // from class: vv8.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FourthlineViewController f292500b;

            {
                this.f292500b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                FourthlineViewController fourthlineViewController = this.f292500b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FourthlineViewController.V;
                        Application application = fourthlineViewController.m2().getApplication();
                        Intrinsics.i(application, "null cannot be cast to non-null type android.app.Application");
                        return application;
                    case 1:
                        KProperty[] kPropertyArr2 = FourthlineViewController.V;
                        return (Application.ActivityLifecycleCallbacks) ((zu8.o) fourthlineViewController.S.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = FourthlineViewController.V;
                        qji.b bVarU2 = fourthlineViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.fourthline.screen.di.FourthlineControllerInjector");
                        zu8.p pVar = (zu8.p) bVarU2;
                        c0 c0Var = pVar.f325333b;
                        zu8.p pVar2 = pVar.f325334c;
                        FourthlineControllerContract$InputData fourthlineControllerContract$InputData = fourthlineViewController.K;
                        fourthlineControllerContract$InputData.getClass();
                        Activity activityM2 = fourthlineViewController.m2();
                        activityM2.getClass();
                        return new zu8.o(c0Var, pVar2, activityM2, fourthlineControllerContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = FourthlineViewController.V;
                        return (d) ((zu8.o) fourthlineViewController.S.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = FourthlineViewController.V;
                        FourthlineViewController fourthlineViewController2 = this.f292500b;
                        return dli.f.a(fourthlineViewController2, (d) fourthlineViewController2.T.getValue(), zhm.v.k((RowDelegate) fourthlineViewController2.O.getValue(), (SimpleMediaDelegate) fourthlineViewController2.P.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        k kVarD3 = d3();
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = kVarD3.f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        screenRecyclerNavbarActionFooterActionFooterView.setVisibility(uiState.f292477b ? 0 : 8);
        kVarD3.f174533b.setModel(new aw0.e(false, uiState.d, b0.BELOW_BUTTONS, new n6(uiState.f292478c, LargeActionButton.ButtonStyle.f58725a, null, "ACTION_BUTTON_LOADING_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 49));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getP() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (zu8.o) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((Application) this.M.getValue()).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.N.getValue());
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        ((Application) this.M.getValue()).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.N.getValue());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        Continuation continuation = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.components_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.components_subtitle, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(textLocalisedClause2);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new v(this, continuation, 0), 3);
        ActionFooterView actionFooterView = d3().f174533b;
        ViewController.P2(this, rd0.e.b(actionFooterView.f), new v(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(actionFooterView.e), new vrl.d(this, continuation, 8), 3);
    }

    public final k d3() {
        ViewBinding value = this.Q.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
