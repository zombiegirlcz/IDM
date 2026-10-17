package com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.rev_points.spare_change.impl.R$id;
import com.revolut.feature.rev_points.spare_change.impl.R$layout;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.RevPointsSpareChangeFullGridController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import h2c.b;
import h2c.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import no.m;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import w1c.f;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/spare_change/impl/ui/screen/full_grid_spare_change/RevPointsSpareChangeFullGridController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$Result;", "Ltki/c;", "Lh2c/m;", "Lno/m;", "Companion", "a", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsSpareChangeFullGridController extends ViewController<RevPointsSpareChangeControllerApi$Result> implements c, m {
    public final FullScreenStateDelegate K;
    public final AttributeSelectorSmallDelegate L;
    public final ListSubheaderDelegate M;
    public final CellDetailsDelegate N;
    public final h O;
    public final int P;
    public final AnalyticsProduct.Retail Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(RevPointsSpareChangeFullGridController.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/spare_change/impl/databinding/ScreenRevPointsSpareChangeFullGridControllerBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public RevPointsSpareChangeFullGridController(RevPointsSpareChangeControllerApi$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new FullScreenStateDelegate();
        this.L = new AttributeSelectorSmallDelegate();
        this.M = new ListSubheaderDelegate();
        this.N = new CellDetailsDelegate();
        this.O = s.t(this, b.f);
        this.P = R$layout.screen_rev_points_spare_change_full_grid_controller;
        k9 k9Var = k9.RevPoints;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.Q = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.R = w.y0(new h1k.a(this, inputData, 3));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: h2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeFullGridController f148769b;

            {
                this.f148769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsSpareChangeFullGridController.U;
                        return (h) ((w1c.f) this.f148769b.R.getValue()).f293835c.get();
                    default:
                        KProperty[] kPropertyArr2 = RevPointsSpareChangeFullGridController.U;
                        RevPointsSpareChangeFullGridController revPointsSpareChangeFullGridController = this.f148769b;
                        return tki.g.a(revPointsSpareChangeFullGridController, revPointsSpareChangeFullGridController.R2(), zhm.v.k(revPointsSpareChangeFullGridController.K, new GridBoxDelegate(zhm.v.k(revPointsSpareChangeFullGridController.L, new AttributeSelectorSmallLoadingDelegate()), 8.0f, 8.0f, 3), revPointsSpareChangeFullGridController.M, new ListSubheaderLoadingDelegate(), revPointsSpareChangeFullGridController.N, new CellDetailsLoadingDelegate()), R$id.revPointsSpareChangeFullGridControllerScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: h2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeFullGridController f148769b;

            {
                this.f148769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsSpareChangeFullGridController.U;
                        return (h) ((w1c.f) this.f148769b.R.getValue()).f293835c.get();
                    default:
                        KProperty[] kPropertyArr2 = RevPointsSpareChangeFullGridController.U;
                        RevPointsSpareChangeFullGridController revPointsSpareChangeFullGridController = this.f148769b;
                        return tki.g.a(revPointsSpareChangeFullGridController, revPointsSpareChangeFullGridController.R2(), zhm.v.k(revPointsSpareChangeFullGridController.K, new GridBoxDelegate(zhm.v.k(revPointsSpareChangeFullGridController.L, new AttributeSelectorSmallLoadingDelegate()), 8.0f, 8.0f, 3), revPointsSpareChangeFullGridController.M, new ListSubheaderLoadingDelegate(), revPointsSpareChangeFullGridController.N, new CellDetailsLoadingDelegate()), R$id.revPointsSpareChangeFullGridControllerScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        h2c.m uiState = (h2c.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        i iVar = uiState.f148779b;
        ActionFooterView actionFooterView = d3().f276393c;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getF82762b0() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int i = R$string.rev_points_spare_change;
        m70.a.c(t0.f186434a);
        pd.b.p(view, new TextLocalisedClause(i, u.c(""), null, 12));
        d3().f276392b.setBackgroundType(AnimatedBackgroundType.REV_POINTS.f51487a);
        NavBarWithToolbar navBarWithToolbar = d3().d;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.rev_points_day0_spare_change_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.rev_points_day0_spare_change_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.rev_points_day0_spare_change_description_basic, null, null, 14));
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        u1c.c cVarD3 = d3();
        ViewController.P2(this, rd0.e.b(cVarD3.d.f59410q), new gqh.o(this, null, 11), 3);
        ActionFooterView actionFooterView = cVarD3.f276393c;
        ViewController.P2(this, rd0.e.b(actionFooterView.e), new h2c.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(actionFooterView.f), new h2c.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(actionFooterView.f58955g), new h2c.c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.L.p()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.e), new h2c.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.K.f52371h.f121375b), new h2c.f(this, null), 3);
    }

    public final u1c.c d3() {
        ViewBinding value = this.O.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u1c.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final h2c.h R2() {
        return (h2c.h) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
