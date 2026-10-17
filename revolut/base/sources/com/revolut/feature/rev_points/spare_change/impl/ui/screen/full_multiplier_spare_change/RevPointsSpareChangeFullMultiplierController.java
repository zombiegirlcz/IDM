package com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RadialSliderDelegate;
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
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.RevPointsSpareChangeFullMultiplierController;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import l2c.b;
import l2c.d;
import l2c.f;
import l2c.k;
import no.m;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rev_points/spare_change/impl/ui/screen/full_multiplier_spare_change/RevPointsSpareChangeFullMultiplierController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$Result;", "Ltki/c;", "Ll2c/k;", "Lno/m;", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsSpareChangeFullMultiplierController extends ViewController<RevPointsSpareChangeControllerApi$Result> implements c, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(RevPointsSpareChangeFullMultiplierController.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/spare_change/impl/databinding/ScreenRevPointsSpareChangeFullMultiplierControllerBinding;", 0))};
    public final FullScreenStateDelegate K;
    public final RadialSliderDelegate L;
    public final ListSubheaderDelegate M;
    public final CellDetailsDelegate N;
    public final h O;
    public final int P;
    public final AnalyticsProduct.Retail Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public RevPointsSpareChangeFullMultiplierController(RevPointsSpareChangeControllerApi$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new FullScreenStateDelegate();
        this.L = new RadialSliderDelegate();
        this.M = new ListSubheaderDelegate();
        this.N = new CellDetailsDelegate();
        this.O = s.t(this, b.f);
        this.P = R$layout.screen_rev_points_spare_change_full_multiplier_controller;
        k9 k9Var = k9.RevPoints;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.Q = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.R = w.y0(new kpl.b(this, inputData, 12));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: l2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeFullMultiplierController f191740b;

            {
                this.f191740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsSpareChangeFullMultiplierController.U;
                        return (f) ((w1c.h) this.f191740b.R.getValue()).f293840c.get();
                    default:
                        KProperty[] kPropertyArr2 = RevPointsSpareChangeFullMultiplierController.U;
                        RevPointsSpareChangeFullMultiplierController revPointsSpareChangeFullMultiplierController = this.f191740b;
                        return tki.g.a(revPointsSpareChangeFullMultiplierController, revPointsSpareChangeFullMultiplierController.R2(), zhm.v.k(revPointsSpareChangeFullMultiplierController.K, revPointsSpareChangeFullMultiplierController.L, revPointsSpareChangeFullMultiplierController.M, new ListSubheaderLoadingDelegate(), revPointsSpareChangeFullMultiplierController.N, new CellDetailsLoadingDelegate()), R$id.revPointsSpareChangeFullMultiplierControllerScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: l2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeFullMultiplierController f191740b;

            {
                this.f191740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsSpareChangeFullMultiplierController.U;
                        return (f) ((w1c.h) this.f191740b.R.getValue()).f293840c.get();
                    default:
                        KProperty[] kPropertyArr2 = RevPointsSpareChangeFullMultiplierController.U;
                        RevPointsSpareChangeFullMultiplierController revPointsSpareChangeFullMultiplierController = this.f191740b;
                        return tki.g.a(revPointsSpareChangeFullMultiplierController, revPointsSpareChangeFullMultiplierController.R2(), zhm.v.k(revPointsSpareChangeFullMultiplierController.K, revPointsSpareChangeFullMultiplierController.L, revPointsSpareChangeFullMultiplierController.M, new ListSubheaderLoadingDelegate(), revPointsSpareChangeFullMultiplierController.N, new CellDetailsLoadingDelegate()), R$id.revPointsSpareChangeFullMultiplierControllerScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        i iVar = uiState.f191748b;
        ActionFooterView actionFooterView = d3().f276399c;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w1c.h) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int i = R$string.rev_points_spare_change;
        m70.a.c(t0.f186434a);
        pd.b.p(view, new TextLocalisedClause(i, u.c(""), null, 12));
        d3().f276398b.setBackgroundType(AnimatedBackgroundType.REV_POINTS.f51487a);
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
        u1c.e eVarD3 = d3();
        ViewController.P2(this, rd0.e.b(eVarD3.d.f59410q), new ko2.b(this, null, 22), 3);
        ActionFooterView actionFooterView = eVarD3.f276399c;
        ViewController.P2(this, rd0.e.b(actionFooterView.e), new l2c.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(actionFooterView.f), new l2c.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(actionFooterView.f58955g), new l2c.c(this, null, 2), 3);
        r rVarDistinctUntilChanged = this.L.f53138c.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewController.P2(this, rd0.e.b(rVarDistinctUntilChanged), new l2c.c(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.N.e), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.K.f52371h.f121375b), new l2c.e(this, null), 3);
    }

    public final u1c.e d3() {
        ViewBinding value = this.O.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u1c.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
