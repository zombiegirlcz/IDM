package com.revolut.feature.wealth.ui.impl.trades;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.r0;
import au0.s0;
import au0.z0;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.wealth.ui.impl.trades.HoldingTradeDetailsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import efm.r;
import i7d.i;
import java.util.List;
import jii.d0;
import k1h.l;
import k1h.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mga.i0;
import org.jmrtd.lds.LDSFile;
import pnh.d;
import pnh.k;
import pnh.n;
import pnh.p;
import te0.w;
import tki.c;
import tx0.p2;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/trades/HoldingTradeDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lpnh/q;", "Locf/c;", "Lmga/i0;", "Li7d/i;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HoldingTradeDetailsController extends ViewController<q> implements c, ocf.c, i0, i {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f96044a0 = {o0.f186429a.j(new h0(HoldingTradeDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};
    public final k K;
    public final int L;
    public final h M;
    public final ActionsDelegate N;
    public final ActionWidgetDelegate O;
    public final CellDetailsActionableIconDelegate P;
    public final CellDetailsActionDelegate Q;
    public final HighlightTileDelegate R;
    public final PlainTextDelegate S;
    public final RowDelegate T;
    public final BannerDelegate U;
    public final ListSubheaderDelegate V;
    public final ListSubheaderLoadingDelegate W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public HoldingTradeDetailsController(k inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbarwithbigtile;
        this.M = s.t(this, pnh.b.f);
        this.N = new ActionsDelegate();
        this.O = new ActionWidgetDelegate();
        this.P = new CellDetailsActionableIconDelegate();
        this.Q = new CellDetailsActionDelegate();
        this.R = new HighlightTileDelegate();
        this.S = new PlainTextDelegate();
        this.T = new RowDelegate(null, null, 7);
        this.U = new BannerDelegate();
        this.V = new ListSubheaderDelegate();
        this.W = new ListSubheaderLoadingDelegate();
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: pnh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingTradeDetailsController f237764b;

            {
                this.f237764b = this;
            }

            /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                HoldingTradeDetailsController holdingTradeDetailsController = this.f237764b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = HoldingTradeDetailsController.f96044a0;
                        HoldingTradeDetailsController holdingTradeDetailsController2 = this.f237764b;
                        m mVarR2 = holdingTradeDetailsController2.R2();
                        List listK = zhm.v.k(new RowLoadingDelegate(), new CellDetailsDelegate(), holdingTradeDetailsController2.N, holdingTradeDetailsController2.S, holdingTradeDetailsController2.P, holdingTradeDetailsController2.Q, holdingTradeDetailsController2.T, holdingTradeDetailsController2.O, holdingTradeDetailsController2.U, holdingTradeDetailsController2.V, holdingTradeDetailsController2.W, holdingTradeDetailsController2.R, new HighlightTileLoadingDelegate(), new FullScreenStateDelegate());
                        ScreenContentRecyclerView screenRecyclerNavBarWithBigTileRecyclerView = holdingTradeDetailsController2.d3().f174511c;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileRecyclerView, "screenRecyclerNavBarWithBigTileRecyclerView");
                        return tki.g.a(holdingTradeDetailsController2, mVarR2, listK, screenRecyclerNavBarWithBigTileRecyclerView.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = HoldingTradeDetailsController.f96044a0;
                        phm.a aVar = (phm.a) ue0.e.j(holdingTradeDetailsController.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                        }
                        mkh.s sVar = ((mkh.s) ((mkh.u) aVar2.b())).l0;
                        k kVar = holdingTradeDetailsController.K;
                        kVar.getClass();
                        return new mkh.h(sVar, kVar, holdingTradeDetailsController);
                    default:
                        KProperty[] kPropertyArr3 = HoldingTradeDetailsController.f96044a0;
                        return (m) ((mkh.h) ((qnh.a) holdingTradeDetailsController.Y.getValue())).f.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: pnh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingTradeDetailsController f237764b;

            {
                this.f237764b = this;
            }

            /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                HoldingTradeDetailsController holdingTradeDetailsController = this.f237764b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HoldingTradeDetailsController.f96044a0;
                        HoldingTradeDetailsController holdingTradeDetailsController2 = this.f237764b;
                        m mVarR2 = holdingTradeDetailsController2.R2();
                        List listK = zhm.v.k(new RowLoadingDelegate(), new CellDetailsDelegate(), holdingTradeDetailsController2.N, holdingTradeDetailsController2.S, holdingTradeDetailsController2.P, holdingTradeDetailsController2.Q, holdingTradeDetailsController2.T, holdingTradeDetailsController2.O, holdingTradeDetailsController2.U, holdingTradeDetailsController2.V, holdingTradeDetailsController2.W, holdingTradeDetailsController2.R, new HighlightTileLoadingDelegate(), new FullScreenStateDelegate());
                        ScreenContentRecyclerView screenRecyclerNavBarWithBigTileRecyclerView = holdingTradeDetailsController2.d3().f174511c;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileRecyclerView, "screenRecyclerNavBarWithBigTileRecyclerView");
                        return tki.g.a(holdingTradeDetailsController2, mVarR2, listK, screenRecyclerNavBarWithBigTileRecyclerView.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = HoldingTradeDetailsController.f96044a0;
                        phm.a aVar = (phm.a) ue0.e.j(holdingTradeDetailsController.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                        }
                        mkh.s sVar = ((mkh.s) ((mkh.u) aVar2.b())).l0;
                        k kVar = holdingTradeDetailsController.K;
                        kVar.getClass();
                        return new mkh.h(sVar, kVar, holdingTradeDetailsController);
                    default:
                        KProperty[] kPropertyArr3 = HoldingTradeDetailsController.f96044a0;
                        return (m) ((mkh.h) ((qnh.a) holdingTradeDetailsController.Y.getValue())).f.get();
                }
            }
        });
        final int i3 = 2;
        this.Z = w.y0(new Function0(this) { // from class: pnh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingTradeDetailsController f237764b;

            {
                this.f237764b = this;
            }

            /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                HoldingTradeDetailsController holdingTradeDetailsController = this.f237764b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HoldingTradeDetailsController.f96044a0;
                        HoldingTradeDetailsController holdingTradeDetailsController2 = this.f237764b;
                        m mVarR2 = holdingTradeDetailsController2.R2();
                        List listK = zhm.v.k(new RowLoadingDelegate(), new CellDetailsDelegate(), holdingTradeDetailsController2.N, holdingTradeDetailsController2.S, holdingTradeDetailsController2.P, holdingTradeDetailsController2.Q, holdingTradeDetailsController2.T, holdingTradeDetailsController2.O, holdingTradeDetailsController2.U, holdingTradeDetailsController2.V, holdingTradeDetailsController2.W, holdingTradeDetailsController2.R, new HighlightTileLoadingDelegate(), new FullScreenStateDelegate());
                        ScreenContentRecyclerView screenRecyclerNavBarWithBigTileRecyclerView = holdingTradeDetailsController2.d3().f174511c;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileRecyclerView, "screenRecyclerNavBarWithBigTileRecyclerView");
                        return tki.g.a(holdingTradeDetailsController2, mVarR2, listK, screenRecyclerNavBarWithBigTileRecyclerView.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = HoldingTradeDetailsController.f96044a0;
                        phm.a aVar = (phm.a) ue0.e.j(holdingTradeDetailsController.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                        }
                        mkh.s sVar = ((mkh.s) ((mkh.u) aVar2.b())).l0;
                        k kVar = holdingTradeDetailsController.K;
                        kVar.getClass();
                        return new mkh.h(sVar, kVar, holdingTradeDetailsController);
                    default:
                        KProperty[] kPropertyArr3 = HoldingTradeDetailsController.f96044a0;
                        return (m) ((mkh.h) ((qnh.a) holdingTradeDetailsController.Y.getValue())).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        pnh.q uiState = (pnh.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        p pVar = uiState.f237796b;
        if (!(pVar instanceof n)) {
            if (!pVar.equals(pnh.o.f237794a)) {
                throw new NoWhenBranchMatchedException();
            }
            f3().setLoadingState(true);
            return;
        }
        n nVar = (n) pVar;
        Clause clause = nVar.f237793c;
        Clause clause2 = nVar.f237792b;
        NavBarWithBigTile navBarWithBigTileF3 = f3();
        navBarWithBigTileF3.setLoadingState(false);
        navBarWithBigTileF3.setToolbarTitleWithSubtitle(clause2, clause);
        navBarWithBigTileF3.setTitle(new z0(clause2, false));
        navBarWithBigTileF3.setDescription(nVar.d);
        k1h.k kVar = nVar.f237791a;
        if (kVar instanceof l) {
            navBarWithBigTileF3.setAvatarGroup(((l) kVar).f180267a, true);
        } else {
            if (!(kVar instanceof m)) {
                throw new NoWhenBranchMatchedException();
            }
            m mVar = (m) kVar;
            Image image = mVar.f180268a;
            CircleBadgeModel circleBadgeModel = mVar.f180270c;
            navBarWithBigTileF3.setAvatar(new AvatarModel.Default(image, null, null, null, circleBadgeModel != null ? new AvatarModel.BadgeModel(circleBadgeModel, com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, LDSFile.EF_DG14_TAG), r0.BLURRED_BACKGROUND);
        }
        navBarWithBigTileF3.setActionStatusLabel(new aw0.k(6, clause, null, false));
    }

    @Override // ocf.c
    /* JADX INFO: renamed from: M1, reason: from getter */
    public final BannerDelegate getU() {
        return this.U;
    }

    @Override // mga.i0
    public final r N0() {
        return this.R.f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qnh.a) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTileF3 = f3();
        navBarWithBigTileF3.setHeightMode(p2.f275222a);
        navBarWithBigTileF3.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTileF3.setLayoutType(s0.CENTERED_HORIZONTALLY);
    }

    @Override // mga.i0
    public final r a2() {
        return this.T.f53218h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((tki.b) ((tki.a) this.X.getValue())).f271959b.f;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(f3().f59357t), new pnh.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(f3().f59360y.f57274n), new pnh.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.f51807c), new pfk.o0(this, (Continuation) null, 23), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new d(this, null), 3);
    }

    public final d0 d3() {
        ViewBinding value = this.M.getValue(this, f96044a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final pnh.m R2() {
        return (pnh.m) this.Z.getValue();
    }

    public final NavBarWithBigTile f3() {
        NavBarWithBigTile screenRecyclerNavBarWithBigTileNavBarWithBigTile = d3().f174510b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileNavBarWithBigTile, "screenRecyclerNavBarWithBigTileNavBarWithBigTile");
        return screenRecyclerNavBarWithBigTileNavBarWithBigTile;
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f174509a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.X.getValue();
    }
}
