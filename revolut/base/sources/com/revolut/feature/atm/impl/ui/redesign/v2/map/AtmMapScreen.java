package com.revolut.feature.atm.impl.ui.redesign.v2.map;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.atm.impl.R$id;
import com.revolut.feature.atm.impl.R$layout;
import com.revolut.feature.atm.impl.ui.redesign.v2.map.AtmMapScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.t9;
import org.jetbrains.annotations.NotNull;
import rr0.f;
import uj2.d;
import v0f.p;
import vc.s;
import vkm.v1;
import vkm.z1;
import w50.g;
import wk2.c;
import wk2.j;
import wk2.l;
import wk2.m;
import wk2.n;
import xj2.k;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/v2/map/AtmMapScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lwk2/n;", "<init>", "()V", "Companion", "a", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AtmMapScreen extends ViewController<q> implements w {
    public final Object M;
    public c N;
    public View O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(AtmMapScreen.class, "binding", "getBinding()Lcom/revolut/feature/atm/impl/databinding/ScreenAtmsMapV2Binding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final h K = s.t(this, b.f);
    public int L = -1;
    public final int T = R$layout.screen_atms_map_v2;

    /* JADX INFO: renamed from: com.revolut.feature.atm.impl.ui.redesign.v2.map.AtmMapScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/atm/impl/databinding/ScreenAtmsMapV2Binding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.atmsMapScreen_locationButton;
            FormsActionButton formsActionButton = (FormsActionButton) ViewBindings.findChildViewById(p0, i);
            if (formsActionButton != null) {
                i = R$id.atmsMapScreen_map;
                MapView mapView = (MapView) ViewBindings.findChildViewById(p0, i);
                if (mapView != null) {
                    i = R$id.atmsMapScreen_navbar;
                    BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                    if (basicNavBar != null) {
                        i = R$id.atmsMapScreen_searchHereButton;
                        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                        if (largeActionButton != null) {
                            return new d((ControllerContainerConstraintLayout) p0, formsActionButton, mapView, basicNavBar, largeActionButton);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public AtmMapScreen() {
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: wk2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmMapScreen f298172b;

            {
                this.f298172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AtmMapScreen atmMapScreen = this.f298172b;
                switch (i2) {
                    case 0:
                        AtmMapScreen.Companion companion = AtmMapScreen.INSTANCE;
                        Context context = atmMapScreen.d3().f280483a.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        return Integer.valueOf(kli.a.k(context, 16.0f));
                    case 1:
                        AtmMapScreen.Companion companion2 = AtmMapScreen.INSTANCE;
                        return atmMapScreen.d3().e.A.V();
                    case 2:
                        AtmMapScreen.Companion companion3 = AtmMapScreen.INSTANCE;
                        qji.b bVarU2 = atmMapScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.v2.map.di.AtmMapInjector");
                        xj2.o oVar = (xj2.o) bVarU2;
                        return new xj2.k(oVar.f306490a, oVar.f306491b);
                    case 3:
                        AtmMapScreen.Companion companion4 = AtmMapScreen.INSTANCE;
                        return (m) ((xj2.k) atmMapScreen.Q.getValue()).d.get();
                    default:
                        AtmMapScreen.Companion companion5 = AtmMapScreen.INSTANCE;
                        return n14.e.a(atmMapScreen, (m) atmMapScreen.R.getValue());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: wk2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmMapScreen f298172b;

            {
                this.f298172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AtmMapScreen atmMapScreen = this.f298172b;
                switch (i22) {
                    case 0:
                        AtmMapScreen.Companion companion = AtmMapScreen.INSTANCE;
                        Context context = atmMapScreen.d3().f280483a.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        return Integer.valueOf(kli.a.k(context, 16.0f));
                    case 1:
                        AtmMapScreen.Companion companion2 = AtmMapScreen.INSTANCE;
                        return atmMapScreen.d3().e.A.V();
                    case 2:
                        AtmMapScreen.Companion companion3 = AtmMapScreen.INSTANCE;
                        qji.b bVarU2 = atmMapScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.v2.map.di.AtmMapInjector");
                        xj2.o oVar = (xj2.o) bVarU2;
                        return new xj2.k(oVar.f306490a, oVar.f306491b);
                    case 3:
                        AtmMapScreen.Companion companion4 = AtmMapScreen.INSTANCE;
                        return (m) ((xj2.k) atmMapScreen.Q.getValue()).d.get();
                    default:
                        AtmMapScreen.Companion companion5 = AtmMapScreen.INSTANCE;
                        return n14.e.a(atmMapScreen, (m) atmMapScreen.R.getValue());
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: wk2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmMapScreen f298172b;

            {
                this.f298172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AtmMapScreen atmMapScreen = this.f298172b;
                switch (i22) {
                    case 0:
                        AtmMapScreen.Companion companion = AtmMapScreen.INSTANCE;
                        Context context = atmMapScreen.d3().f280483a.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        return Integer.valueOf(kli.a.k(context, 16.0f));
                    case 1:
                        AtmMapScreen.Companion companion2 = AtmMapScreen.INSTANCE;
                        return atmMapScreen.d3().e.A.V();
                    case 2:
                        AtmMapScreen.Companion companion3 = AtmMapScreen.INSTANCE;
                        qji.b bVarU2 = atmMapScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.v2.map.di.AtmMapInjector");
                        xj2.o oVar = (xj2.o) bVarU2;
                        return new xj2.k(oVar.f306490a, oVar.f306491b);
                    case 3:
                        AtmMapScreen.Companion companion4 = AtmMapScreen.INSTANCE;
                        return (m) ((xj2.k) atmMapScreen.Q.getValue()).d.get();
                    default:
                        AtmMapScreen.Companion companion5 = AtmMapScreen.INSTANCE;
                        return n14.e.a(atmMapScreen, (m) atmMapScreen.R.getValue());
                }
            }
        });
        final int i5 = 3;
        this.R = te0.w.y0(new Function0(this) { // from class: wk2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmMapScreen f298172b;

            {
                this.f298172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AtmMapScreen atmMapScreen = this.f298172b;
                switch (i22) {
                    case 0:
                        AtmMapScreen.Companion companion = AtmMapScreen.INSTANCE;
                        Context context = atmMapScreen.d3().f280483a.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        return Integer.valueOf(kli.a.k(context, 16.0f));
                    case 1:
                        AtmMapScreen.Companion companion2 = AtmMapScreen.INSTANCE;
                        return atmMapScreen.d3().e.A.V();
                    case 2:
                        AtmMapScreen.Companion companion3 = AtmMapScreen.INSTANCE;
                        qji.b bVarU2 = atmMapScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.v2.map.di.AtmMapInjector");
                        xj2.o oVar = (xj2.o) bVarU2;
                        return new xj2.k(oVar.f306490a, oVar.f306491b);
                    case 3:
                        AtmMapScreen.Companion companion4 = AtmMapScreen.INSTANCE;
                        return (m) ((xj2.k) atmMapScreen.Q.getValue()).d.get();
                    default:
                        AtmMapScreen.Companion companion5 = AtmMapScreen.INSTANCE;
                        return n14.e.a(atmMapScreen, (m) atmMapScreen.R.getValue());
                }
            }
        });
        final int i6 = 4;
        this.S = te0.w.y0(new Function0(this) { // from class: wk2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmMapScreen f298172b;

            {
                this.f298172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                AtmMapScreen atmMapScreen = this.f298172b;
                switch (i22) {
                    case 0:
                        AtmMapScreen.Companion companion = AtmMapScreen.INSTANCE;
                        Context context = atmMapScreen.d3().f280483a.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        return Integer.valueOf(kli.a.k(context, 16.0f));
                    case 1:
                        AtmMapScreen.Companion companion2 = AtmMapScreen.INSTANCE;
                        return atmMapScreen.d3().e.A.V();
                    case 2:
                        AtmMapScreen.Companion companion3 = AtmMapScreen.INSTANCE;
                        qji.b bVarU2 = atmMapScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.v2.map.di.AtmMapInjector");
                        xj2.o oVar = (xj2.o) bVarU2;
                        return new xj2.k(oVar.f306490a, oVar.f306491b);
                    case 3:
                        AtmMapScreen.Companion companion4 = AtmMapScreen.INSTANCE;
                        return (m) ((xj2.k) atmMapScreen.Q.getValue()).d.get();
                    default:
                        AtmMapScreen.Companion companion5 = AtmMapScreen.INSTANCE;
                        return n14.e.a(atmMapScreen, (m) atmMapScreen.R.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        co3.a aVar;
        ah0.b bVar;
        co3.a aVar2;
        Integer num;
        int iIntValue;
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        l lVar = qVar instanceof l ? (l) qVar : null;
        if (pd.b.k(lVar != null ? Boolean.valueOf(lVar.f298202a) : null)) {
            d3().f280485c.setLocationVisible(uiState.f298209a);
        }
        if (pd.b.k(lVar != null ? Boolean.valueOf(lVar.e) : null)) {
            FormsActionButton atmsMapScreenLocationButton = d3().f280484b;
            Intrinsics.checkNotNullExpressionValue(atmsMapScreenLocationButton, "atmsMapScreenLocationButton");
            atmsMapScreenLocationButton.setVisibility(uiState.f298211c ? 0 : 8);
        }
        if (pd.b.k(lVar != null ? Boolean.valueOf(lVar.f298206h) : null) && (num = uiState.f) != null && (iIntValue = num.intValue()) != this.L) {
            this.L = iIntValue;
            d3().f280485c.setMapPadding(0, 0, 0, iIntValue);
        }
        if (pd.b.k(lVar != null ? Boolean.valueOf(lVar.f) : null)) {
            LargeActionButton atmsMapScreenSearchHereButton = d3().e;
            Intrinsics.checkNotNullExpressionValue(atmsMapScreenSearchHereButton, "atmsMapScreenSearchHereButton");
            atmsMapScreenSearchHereButton.setVisibility(uiState.d ? 0 : 8);
        }
        if (pd.b.k(lVar != null ? Boolean.valueOf(lVar.f298205g) : null)) {
            ((f) ((sy0.b) this.P.getValue())).b(uiState.e);
        }
        if (pd.b.k(lVar != null ? Boolean.valueOf(lVar.f298203b) : null) && (aVar2 = uiState.f298210b) != null) {
            MapView atmsMapScreenMap = d3().f280485c;
            Intrinsics.checkNotNullExpressionValue(atmsMapScreenMap, "atmsMapScreenMap");
            atmsMapScreenMap.g0(new ah0.a(aVar2.f25486a, aVar2.f25487b), 15.0f, true);
        }
        if (lVar != null && lVar.f298204c && (bVar = uiState.f298215l) != null) {
            d3().f280485c.i0(bVar, true);
        }
        if (lVar != null && lVar.d && (aVar = uiState.f298214j) != null) {
            ah0.a aVar3 = new ah0.a(aVar.f25486a, aVar.f25487b);
            if (uiState.k) {
                MapView atmsMapScreenMap2 = d3().f280485c;
                Intrinsics.checkNotNullExpressionValue(atmsMapScreenMap2, "atmsMapScreenMap");
                atmsMapScreenMap2.g0(aVar3, 19.0f, true);
            } else {
                d3().f280485c.h0(aVar3, true);
            }
        }
        if (pd.b.k(lVar != null ? Boolean.valueOf(lVar.i) : null)) {
            d3().f280485c.setMarkers(new t9(uiState.f298216m, true));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (m) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f280485c.setClusterClickToZoom(true, 80.0f);
        FormsActionButton formsActionButton = d3().f280484b;
        formsActionButton.setImage(new ResourceImage(R$drawable.uikit_icn_24_location_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        formsActionButton.f(FormsActionButton.a.b.f58990a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        c cVar;
        View viewE3 = e3();
        if (viewE3 != null && (cVar = this.N) != null) {
            viewE3.removeOnLayoutChangeListener(cVar);
        }
        this.N = null;
        this.O = null;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        wa3.d dVar = new wa3.d(rd0.e.b(d3().d.f59211b), 14);
        Continuation continuation = null;
        v1 v1Var = new v1(new wih.c(this, view, continuation, 3));
        final int i = 1;
        final z1 z1VarB = vkm.q.b(1, 5, null);
        FormsActionButton atmsMapScreenLocationButton = d3().f280484b;
        Intrinsics.checkNotNullExpressionValue(atmsMapScreenLocationButton, "atmsMapScreenLocationButton");
        final int i2 = 0;
        edl.a.s(atmsMapScreenLocationButton, new Function1() { // from class: wk2.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i2;
                z1 z1Var = z1VarB;
                AtmMapScreen.Companion companion = AtmMapScreen.INSTANCE;
                switch (i3) {
                    case 0:
                        z1Var.k(p.f298218a);
                        break;
                    default:
                        z1Var.k(u.f298223a);
                        break;
                }
                return Unit.f186387a;
            }
        });
        LargeActionButton atmsMapScreenSearchHereButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(atmsMapScreenSearchHereButton, "atmsMapScreenSearchHereButton");
        edl.a.s(atmsMapScreenSearchHereButton, new Function1() { // from class: wk2.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i;
                z1 z1Var = z1VarB;
                AtmMapScreen.Companion companion = AtmMapScreen.INSTANCE;
                switch (i3) {
                    case 0:
                        z1Var.k(p.f298218a);
                        break;
                    default:
                        z1Var.k(u.f298223a);
                        break;
                }
                return Unit.f186387a;
            }
        });
        ViewController.P2(this, vkm.q.J(dVar, v1Var, z1VarB, new wa3.d(rd0.e.b(d3().f280485c.f58773m), 16), new p(new wa3.d(rd0.e.b(d3().f280485c.f58772l), 13), 14), new wa3.d(rd0.e.b(d3().f280485c.k), 15)), new g(this, continuation, 29), 3);
        ViewController.P2(this, ((a) ((m) this.R.getValue())).D, new j(this, null), 3);
    }

    public final d d3() {
        ViewBinding value = this.K.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    public final View e3() {
        if (this.O == null) {
            View viewFindViewWithTag = d3().f280485c.findViewWithTag("GoogleWatermark");
            if (viewFindViewWithTag == null) {
                viewFindViewWithTag = d3().f280485c.findViewWithTag("HuaweiWatermark");
            }
            this.O = viewFindViewWithTag;
        }
        return this.O;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.S.getValue();
    }
}
