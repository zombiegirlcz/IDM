package com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import au0.c1;
import aw0.i;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.rev_points.spare_change.impl.R$id;
import com.revolut.feature.rev_points.spare_change.impl.R$layout;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.RevPointsSpareChangeFullListController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import grl.k9;
import j2c.g;
import j2c.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import no.m;
import pd.b;
import te0.w;
import tki.c;
import u1c.d;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/spare_change/impl/ui/screen/full_list_spare_change/RevPointsSpareChangeFullListController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$Result;", "Ltki/c;", "Lj2c/m;", "Lno/m;", "<init>", "()V", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsSpareChangeFullListController extends ViewController<RevPointsSpareChangeControllerApi$Result> implements c, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(RevPointsSpareChangeFullListController.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/spare_change/impl/databinding/ScreenRevPointsSpareChangeFullListControllerBinding;", 0))};
    public final int K = R$layout.screen_rev_points_spare_change_full_list_controller;
    public final AnalyticsProduct.Retail L;
    public final RowDelegate M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev_points/spare_change/impl/databinding/ScreenRevPointsSpareChangeFullListControllerBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.revPointsSpareChangeFullListControllerScreen_button;
            ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
            if (actionFooterView != null) {
                ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
                int i2 = R$id.revPointsSpareChangeFullListControllerScreen_navBar;
                NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i2);
                if (navBarWithBigTile != null) {
                    i2 = R$id.revPointsSpareChangeFullListControllerScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                        return new d(controllerContainerCoordinatorLayout, actionFooterView, navBarWithBigTile);
                    }
                }
                i = i2;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public RevPointsSpareChangeFullListController() {
        k9 k9Var = k9.RevPoints;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = new RowDelegate(null, null, 7);
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: j2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeFullListController f170804b;

            {
                this.f170804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsSpareChangeFullListController revPointsSpareChangeFullListController = this.f170804b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsSpareChangeFullListController.S;
                        RevPointsSpareChangeFullListController revPointsSpareChangeFullListController2 = this.f170804b;
                        return tki.g.a(revPointsSpareChangeFullListController2, revPointsSpareChangeFullListController2.R2(), zhm.v.k(new TextDelegate(), revPointsSpareChangeFullListController2.M, revPointsSpareChangeFullListController2.N), R$id.revPointsSpareChangeFullListControllerScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsSpareChangeFullListController.S;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsSpareChangeFullListController.m2()).a().get(w1c.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new w1c.g(((w1c.a) aVar2.b()).f293821h);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", w1c.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = RevPointsSpareChangeFullListController.S;
                        return (e) ((w1c.g) revPointsSpareChangeFullListController.Q.getValue()).f293837b.get();
                }
            }
        });
        this.P = s.t(this, a.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: j2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeFullListController f170804b;

            {
                this.f170804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsSpareChangeFullListController revPointsSpareChangeFullListController = this.f170804b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsSpareChangeFullListController.S;
                        RevPointsSpareChangeFullListController revPointsSpareChangeFullListController2 = this.f170804b;
                        return tki.g.a(revPointsSpareChangeFullListController2, revPointsSpareChangeFullListController2.R2(), zhm.v.k(new TextDelegate(), revPointsSpareChangeFullListController2.M, revPointsSpareChangeFullListController2.N), R$id.revPointsSpareChangeFullListControllerScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsSpareChangeFullListController.S;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsSpareChangeFullListController.m2()).a().get(w1c.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new w1c.g(((w1c.a) aVar2.b()).f293821h);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", w1c.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = RevPointsSpareChangeFullListController.S;
                        return (e) ((w1c.g) revPointsSpareChangeFullListController.Q.getValue()).f293837b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: j2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeFullListController f170804b;

            {
                this.f170804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsSpareChangeFullListController revPointsSpareChangeFullListController = this.f170804b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsSpareChangeFullListController.S;
                        RevPointsSpareChangeFullListController revPointsSpareChangeFullListController2 = this.f170804b;
                        return tki.g.a(revPointsSpareChangeFullListController2, revPointsSpareChangeFullListController2.R2(), zhm.v.k(new TextDelegate(), revPointsSpareChangeFullListController2.M, revPointsSpareChangeFullListController2.N), R$id.revPointsSpareChangeFullListControllerScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsSpareChangeFullListController.S;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsSpareChangeFullListController.m2()).a().get(w1c.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new w1c.g(((w1c.a) aVar2.b()).f293821h);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", w1c.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = RevPointsSpareChangeFullListController.S;
                        return (e) ((w1c.g) revPointsSpareChangeFullListController.Q.getValue()).f293837b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j2c.m uiState = (j2c.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f276396c;
        j jVar = uiState.f170816b;
        i iVar = uiState.f170817c;
        if (jVar instanceof j2c.i) {
            navBarWithBigTile.setLoadingState(true);
        }
        if (jVar instanceof j2c.h) {
            navBarWithBigTile.setLoadingState(false);
        }
        if (jVar instanceof g) {
            navBarWithBigTile.setLoadingState(false);
            navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
            g gVar = (g) jVar;
            c1.S(navBarWithBigTile, gVar.f170809a, null, null, 6);
            navBarWithBigTile.setToolbarTitle(gVar.f170810b);
            navBarWithBigTile.setDescription(gVar.f170811c);
        }
        ActionFooterView actionFooterView = d3().f276395b;
        actionFooterView.setVisibility(iVar == null ? 8 : 0);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w1c.g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int i = R$string.rev_points_spare_change;
        m70.a.c(t0.f186434a);
        b.p(view, new TextLocalisedClause(i, u.c(""), null, 12));
        d3().f276396c.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d dVarD3 = d3();
        NavBarWithBigTile navBarWithBigTile = dVarD3.f276396c;
        ViewController.P2(this, rd0.e.b(navBarWithBigTile.f59357t), new j2c.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithBigTile.f59360y.f57278q), new j2c.c(this, null, 0), 3);
        ActionFooterView actionFooterView = dVarD3.f276395b;
        ViewController.P2(this, rd0.e.b(actionFooterView.f), new j2c.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(actionFooterView.f58955g), new j2c.c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(actionFooterView.e), new j2c.c(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new j2c.d(this, null), 3);
    }

    public final d d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j2c.e R2() {
        return (j2c.e) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.O.getValue();
    }
}
