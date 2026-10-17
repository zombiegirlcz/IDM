package com.revolut.feature.atm.impl.ui.redesign.details;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b2;
import au0.c1;
import au0.s0;
import aw0.d0;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.atm.impl.R$layout;
import com.revolut.feature.atm.impl.R$string;
import com.revolut.feature.atm.impl.ui.redesign.details.AtmDetailsBottomSheetContract$InputData;
import com.revolut.feature.atm.impl.ui.redesign.details.AtmDetailsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.youTransactor.uCube.rpc.Constants;
import egb.m0;
import ek2.c;
import ek2.d;
import ek2.e;
import ek2.g;
import ek2.i;
import ek2.k;
import ek2.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ms0.s4;
import org.jetbrains.annotations.NotNull;
import pd.b;
import tx0.o2;
import vc.s;
import xj2.f;
import yp0.y;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lcli/w;", "Lek2/e;", "Companion", "a", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AtmDetailsBottomSheetController extends ViewController<Object> implements w {
    public final AtmDetailsBottomSheetContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Integer O;
    public final Object P;
    public final h Q;
    public final int[] R;
    public float S;
    public Float T;
    public int U;
    public int V;
    public final Object W;
    public final Object X;
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(AtmDetailsBottomSheetController.class, "binding", "getBinding()Lcom/revolut/feature/atm/impl/databinding/ScreenAtmDetailsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public AtmDetailsBottomSheetController(AtmDetailsBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: ek2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmDetailsBottomSheetController f126939b;

            {
                this.f126939b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AtmDetailsBottomSheetController atmDetailsBottomSheetController = this.f126939b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AtmDetailsBottomSheetController.Y;
                        qji.b bVarU2 = atmDetailsBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.details.di.AtmsDetailsBottomSheetControllerInjector");
                        xj2.o oVar = (xj2.o) bVarU2;
                        xj2.n nVar = oVar.f306490a;
                        xj2.o oVar2 = oVar.f306491b;
                        AtmDetailsBottomSheetContract$InputData atmDetailsBottomSheetContract$InputData = atmDetailsBottomSheetController.K;
                        atmDetailsBottomSheetContract$InputData.getClass();
                        return new xj2.f(nVar, oVar2, atmDetailsBottomSheetContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AtmDetailsBottomSheetController.Y;
                        return (a) ((xj2.f) atmDetailsBottomSheetController.L.getValue()).f306459c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AtmDetailsBottomSheetController.Y;
                        return n14.e.a(atmDetailsBottomSheetController, atmDetailsBottomSheetController.R2());
                    default:
                        KProperty[] kPropertyArr4 = AtmDetailsBottomSheetController.Y;
                        return new z4l.j(7, v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate(), (CellDetailsActionDelegate) atmDetailsBottomSheetController.W.getValue()), false);
                }
            }
        });
        final int i2 = 1;
        this.M = te0.w.y0(new Function0(this) { // from class: ek2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmDetailsBottomSheetController f126939b;

            {
                this.f126939b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AtmDetailsBottomSheetController atmDetailsBottomSheetController = this.f126939b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AtmDetailsBottomSheetController.Y;
                        qji.b bVarU2 = atmDetailsBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.details.di.AtmsDetailsBottomSheetControllerInjector");
                        xj2.o oVar = (xj2.o) bVarU2;
                        xj2.n nVar = oVar.f306490a;
                        xj2.o oVar2 = oVar.f306491b;
                        AtmDetailsBottomSheetContract$InputData atmDetailsBottomSheetContract$InputData = atmDetailsBottomSheetController.K;
                        atmDetailsBottomSheetContract$InputData.getClass();
                        return new xj2.f(nVar, oVar2, atmDetailsBottomSheetContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AtmDetailsBottomSheetController.Y;
                        return (a) ((xj2.f) atmDetailsBottomSheetController.L.getValue()).f306459c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AtmDetailsBottomSheetController.Y;
                        return n14.e.a(atmDetailsBottomSheetController, atmDetailsBottomSheetController.R2());
                    default:
                        KProperty[] kPropertyArr4 = AtmDetailsBottomSheetController.Y;
                        return new z4l.j(7, v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate(), (CellDetailsActionDelegate) atmDetailsBottomSheetController.W.getValue()), false);
                }
            }
        });
        this.N = R$layout.screen_atm_details;
        this.O = inputData.f63156b ? Integer.valueOf(R$style.UiKitTheme_Transparent) : null;
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: ek2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmDetailsBottomSheetController f126939b;

            {
                this.f126939b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AtmDetailsBottomSheetController atmDetailsBottomSheetController = this.f126939b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AtmDetailsBottomSheetController.Y;
                        qji.b bVarU2 = atmDetailsBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.details.di.AtmsDetailsBottomSheetControllerInjector");
                        xj2.o oVar = (xj2.o) bVarU2;
                        xj2.n nVar = oVar.f306490a;
                        xj2.o oVar2 = oVar.f306491b;
                        AtmDetailsBottomSheetContract$InputData atmDetailsBottomSheetContract$InputData = atmDetailsBottomSheetController.K;
                        atmDetailsBottomSheetContract$InputData.getClass();
                        return new xj2.f(nVar, oVar2, atmDetailsBottomSheetContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AtmDetailsBottomSheetController.Y;
                        return (a) ((xj2.f) atmDetailsBottomSheetController.L.getValue()).f306459c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AtmDetailsBottomSheetController.Y;
                        return n14.e.a(atmDetailsBottomSheetController, atmDetailsBottomSheetController.R2());
                    default:
                        KProperty[] kPropertyArr4 = AtmDetailsBottomSheetController.Y;
                        return new z4l.j(7, v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate(), (CellDetailsActionDelegate) atmDetailsBottomSheetController.W.getValue()), false);
                }
            }
        });
        this.Q = s.t(this, ek2.h.f);
        this.R = new int[2];
        this.U = 830;
        this.W = te0.w.y0(new m0(14));
        final int i5 = 3;
        this.X = te0.w.y0(new Function0(this) { // from class: ek2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmDetailsBottomSheetController f126939b;

            {
                this.f126939b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AtmDetailsBottomSheetController atmDetailsBottomSheetController = this.f126939b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AtmDetailsBottomSheetController.Y;
                        qji.b bVarU2 = atmDetailsBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.details.di.AtmsDetailsBottomSheetControllerInjector");
                        xj2.o oVar = (xj2.o) bVarU2;
                        xj2.n nVar = oVar.f306490a;
                        xj2.o oVar2 = oVar.f306491b;
                        AtmDetailsBottomSheetContract$InputData atmDetailsBottomSheetContract$InputData = atmDetailsBottomSheetController.K;
                        atmDetailsBottomSheetContract$InputData.getClass();
                        return new xj2.f(nVar, oVar2, atmDetailsBottomSheetContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AtmDetailsBottomSheetController.Y;
                        return (a) ((xj2.f) atmDetailsBottomSheetController.L.getValue()).f306459c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AtmDetailsBottomSheetController.Y;
                        return n14.e.a(atmDetailsBottomSheetController, atmDetailsBottomSheetController.R2());
                    default:
                        KProperty[] kPropertyArr4 = AtmDetailsBottomSheetController.Y;
                        return new z4l.j(7, v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate(), (CellDetailsActionDelegate) atmDetailsBottomSheetController.W.getValue()), false);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        uj2.a aVarD3 = d3();
        c cVar = qVar instanceof c ? (c) qVar : null;
        if (b.k(cVar != null ? Boolean.valueOf(cVar.f126929a) : null)) {
            ((j) this.X.getValue()).c(uiState.f126935a);
        }
        if (b.k(cVar != null ? Boolean.valueOf(cVar.f126930b) : null)) {
            NavBarWithBigTile navBarWithBigTile = aVarD3.e;
            d dVar = uiState.f126936b;
            navBarWithBigTile.setActions(dVar.f126934c);
            navBarWithBigTile.setActionStatusLabel(dVar.d);
            NavBarWithBigTile atmDetailsScreenNavigationBar = aVarD3.e;
            Intrinsics.checkNotNullExpressionValue(atmDetailsScreenNavigationBar, "atmDetailsScreenNavigationBar");
            c1.S(atmDetailsScreenNavigationBar, dVar.f126932a, null, null, 6);
            navBarWithBigTile.setSocialProofLabel(new s4(null, dVar.f126933b, 0, 29));
        }
        if (b.k(cVar != null ? Boolean.valueOf(cVar.f126931c) : null)) {
            NavBarWithToolbar atmDetailsScreenCollapsedTitleBar = aVarD3.f280475b;
            Intrinsics.checkNotNullExpressionValue(atmDetailsScreenCollapsedTitleBar, "atmDetailsScreenCollapsedTitleBar");
            NavBarWithToolbar.setToolbar$default(atmDetailsScreenCollapsedTitleBar, uiState.f126937c, uiState.d, null, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        NavBarScrollingViewBehavior navBarScrollingViewBehavior;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView screenContentRecyclerView = d3().f;
        y.h(screenContentRecyclerView, (j) this.X.getValue(), new LinearLayoutManager(screenContentRecyclerView.getContext()));
        ControllerContainerCoordinatorLayout atmDetailsScreenContainer = d3().d;
        Intrinsics.checkNotNullExpressionValue(atmDetailsScreenContainer, "atmDetailsScreenContainer");
        int childCount = atmDetailsScreenContainer.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = atmDetailsScreenContainer.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                ViewGroup.LayoutParams layoutParams = ((RecyclerView) childAt).getLayoutParams();
                CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
                CoordinatorLayout.Behavior behavior = layoutParams2 != null ? layoutParams2.getBehavior() : null;
                if (behavior instanceof NavBarScrollingViewBehavior) {
                    navBarScrollingViewBehavior = (NavBarScrollingViewBehavior) behavior;
                }
            } else {
                i++;
            }
        }
        navBarScrollingViewBehavior = null;
        screenContentRecyclerView.addOnItemTouchListener(new l(navBarScrollingViewBehavior));
        NavBarWithBigTile navBarWithBigTile = d3().e;
        navBarWithBigTile.setHeightMode(new o2(new d0(1000, 830)));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(this.K.f63156b);
        d3().f280475b.setAlpha(BitmapDescriptorFactory.HUE_RED);
        d3().d.setAlpha(1.0f);
        d3().f280476c.setClickable(false);
        d3().f280475b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f280475b.setMenuItems(u.c(new IconNavBarMenuItem("COLLAPSED_DIRECTION", new ResourceImage(R$drawable.uikit_icn_24_arrow_navigation, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.common_atms_navigate, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)));
        d3().f280476c.setOnClickListener(new b2(this, 20));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.V = tk2.q.a(view);
        ViewCompat.setOnApplyWindowInsetsListener(view, new abf.c(this, view, 22));
        ViewController.P2(this, rd0.e.b(d3().e.f59357t), new i(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().e.K()), new ek2.j(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsActionDelegate) this.W.getValue()).d), new k(this, null), 3);
        b.a(this, new g(this, view, 0));
        b.b(this, new ebi.a(this, view, 1));
        ViewController.P2(this, ((com.revolut.feature.atm.impl.ui.redesign.details.a) R2()).C, new ea4.d(this, null, 22), 3);
        ViewController.P2(this, rd0.e.b(d3().f280475b.f59410q), new i(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f280475b.o.f57403b), new i(this, null, 2), 3);
    }

    public final uj2.a d3() {
        ViewBinding value = this.Q.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (uj2.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ek2.a R2() {
        return (ek2.a) this.M.getValue();
    }

    public final void f3(float f) {
        Float f4 = this.T;
        if (f4 != null) {
            float fFloatValue = f4.floatValue();
            if (fFloatValue > BitmapDescriptorFactory.HUE_RED) {
                float f5 = kotlin.ranges.f.f(f / fFloatValue, BitmapDescriptorFactory.HUE_RED, 1.0f);
                d3().d.setAlpha(f5);
                d3().f280475b.setAlpha(1.0f - f5);
                d3().f280476c.setClickable(f5 < 1.0f);
            }
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
