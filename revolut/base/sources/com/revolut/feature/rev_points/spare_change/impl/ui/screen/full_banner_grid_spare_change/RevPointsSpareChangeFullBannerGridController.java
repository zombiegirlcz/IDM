package com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.c1;
import au0.u0;
import au0.z0;
import aw0.i;
import aw0.s8;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.impl.R$dimen;
import com.revolut.feature.rev_points.spare_change.impl.R$id;
import com.revolut.feature.rev_points.spare_change.impl.R$layout;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.RevPointsSpareChangeFullBannerGridController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.youTransactor.uCube.rpc.Constants;
import f2c.b;
import f2c.d;
import f2c.g;
import f2c.l;
import grl.k9;
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
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/spare_change/impl/ui/screen/full_banner_grid_spare_change/RevPointsSpareChangeFullBannerGridController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$Result;", "Ltki/c;", "Lf2c/l;", "Lno/m;", "Companion", "a", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsSpareChangeFullBannerGridController extends ViewController<RevPointsSpareChangeControllerApi$Result> implements c, m {
    public final FullScreenStateDelegate K;
    public final AttributeSelectorSmallDelegate L;
    public final ListSubheaderDelegate M;
    public final TextDelegate N;
    public final h O;
    public final int P;
    public final AnalyticsProduct.Retail Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(RevPointsSpareChangeFullBannerGridController.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/spare_change/impl/databinding/ScreenRevPointsSpareChangeFullBannerGridControllerBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public RevPointsSpareChangeFullBannerGridController(RevPointsSpareChangeFullBannerGridControllerApi$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new FullScreenStateDelegate();
        this.L = new AttributeSelectorSmallDelegate();
        this.M = new ListSubheaderDelegate();
        this.N = new TextDelegate();
        this.O = s.t(this, b.f);
        this.P = R$layout.screen_rev_points_spare_change_full_banner_grid_controller;
        k9 k9Var = k9.RevPoints;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.Q = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.R = w.y0(new eq8.b(this, inputData, 22));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: f2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeFullBannerGridController f131493b;

            {
                this.f131493b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsSpareChangeFullBannerGridController.U;
                        return (g) ((w1c.e) this.f131493b.R.getValue()).f293832c.get();
                    default:
                        KProperty[] kPropertyArr2 = RevPointsSpareChangeFullBannerGridController.U;
                        RevPointsSpareChangeFullBannerGridController revPointsSpareChangeFullBannerGridController = this.f131493b;
                        return tki.g.a(revPointsSpareChangeFullBannerGridController, revPointsSpareChangeFullBannerGridController.R2(), zhm.v.k(revPointsSpareChangeFullBannerGridController.K, new GridBoxDelegate(zhm.v.k(revPointsSpareChangeFullBannerGridController.L, new AttributeSelectorSmallLoadingDelegate()), 8.0f, 8.0f, 3), revPointsSpareChangeFullBannerGridController.M, new ListSubheaderLoadingDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), revPointsSpareChangeFullBannerGridController.N, new PlainTextLoadingDelegate()), R$id.revPointsSpareChangeFullBannerGridControllerScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: f2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeFullBannerGridController f131493b;

            {
                this.f131493b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsSpareChangeFullBannerGridController.U;
                        return (g) ((w1c.e) this.f131493b.R.getValue()).f293832c.get();
                    default:
                        KProperty[] kPropertyArr2 = RevPointsSpareChangeFullBannerGridController.U;
                        RevPointsSpareChangeFullBannerGridController revPointsSpareChangeFullBannerGridController = this.f131493b;
                        return tki.g.a(revPointsSpareChangeFullBannerGridController, revPointsSpareChangeFullBannerGridController.R2(), zhm.v.k(revPointsSpareChangeFullBannerGridController.K, new GridBoxDelegate(zhm.v.k(revPointsSpareChangeFullBannerGridController.L, new AttributeSelectorSmallLoadingDelegate()), 8.0f, 8.0f, 3), revPointsSpareChangeFullBannerGridController.M, new ListSubheaderLoadingDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), revPointsSpareChangeFullBannerGridController.N, new PlainTextLoadingDelegate()), R$id.revPointsSpareChangeFullBannerGridControllerScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        i iVar = uiState.f131503b;
        Clause clause = uiState.f131504c;
        ActionFooterView actionFooterView = d3().f276389b;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
        d3().f276390c.setDescription(clause != null ? new au0.o0(clause) : null);
        ScreenContentRecyclerView screenContentRecyclerView = d3().d;
        screenContentRecyclerView.setPadding(screenContentRecyclerView.getPaddingLeft(), screenContentRecyclerView.getPaddingTop(), screenContentRecyclerView.getPaddingRight(), screenContentRecyclerView.getResources().getDimensionPixelSize(clause == null ? R$dimen.rev_points_spare_change_full_banner_grid_recycler_bottom_padding : R$dimen.rev_points_spare_change_full_banner_grid_recycler_bottom_padding_with_navbar_description));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w1c.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int i = R$string.rev_points_spare_change;
        m70.a.c(t0.f186434a);
        pd.b.p(view, new TextLocalisedClause(i, u.c(""), null, 12));
        NavBarWithBigTile navBarWithBigTile = d3().f276390c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setTitleStyle(b1.LARGE);
        navBarWithBigTile.setToolbarTitle(new TextLocalisedClause(R$string.rev_points_day0_spare_change_title, null, null, 14));
        c1.S(navBarWithBigTile, u.c(new u0(new NavBarWithContainerBackground.ImageBackground(new CdnImage("opt_in_header_v2", "mobile/loyalty/spare_change", null, null, null, null, Constants.TAG_FC_SPEED_MODE), (s8) null, (Color.SolidRes) null, 14), new z0(new TextLocalisedClause(R$string.rev_points_day0_spare_change_title, null, null, 14), false), null, null)), null, null, 6);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        u1c.b bVarD3 = d3();
        ViewController.P2(this, rd0.e.b(bVarD3.f276390c.f59357t), new ev7.b(this, null, 13), 3);
        ActionFooterView actionFooterView = bVarD3.f276389b;
        ViewController.P2(this, rd0.e.b(actionFooterView.e), new f2c.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(actionFooterView.f), new f2c.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(actionFooterView.f58955g), new f2c.c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.L.p()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new f2c.c(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.K.f52371h.f121375b), new f2c.e(this, null), 3);
    }

    public final u1c.b d3() {
        ViewBinding value = this.O.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u1c.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
