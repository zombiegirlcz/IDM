package com.revolut.trading.orders.ui.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.r0;
import au0.s0;
import aw0.k;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import java.util.List;
import jii.d0;
import jij.d;
import jsl.f0;
import jsl.g0;
import jsl.i0;
import jsl.j0;
import jsl.v0;
import jsl.x0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import tx0.p2;
import tx0.p3;
import tx0.q3;
import tx0.r3;
import tx0.s3;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/trading/orders/ui/details/InvestOrderDetailsScreenRedesigned;", "Lcom/revolut/trading/orders/ui/details/BaseInvestOrderDetailsScreen;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestOrderDetailsScreenRedesigned extends BaseInvestOrderDetailsScreen {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f106816h0 = {o0.f186429a.j(new h0(InvestOrderDetailsScreenRedesigned.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};
    public final int f0;
    public final h g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestOrderDetailsScreenRedesigned(InvestOrderDetailsContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f0 = R$layout.screen_recycler_navbarwithbigtile;
        this.g0 = s.t(this, v0.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j0 uiState = (j0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        i0 i0Var = uiState.f178216a;
        if (!(i0Var instanceof f0)) {
            if (i0Var.equals(g0.f178213a)) {
                f3().setLoadingState(true);
                return;
            } else {
                if (!i0Var.equals(jsl.h0.f178214a)) {
                    throw new NoWhenBranchMatchedException();
                }
                f3().setLoadingState(false);
                return;
            }
        }
        f0 f0Var = (f0) i0Var;
        TextLocalisedClause textLocalisedClause = f0Var.f178210b;
        Clause clause = f0Var.f178209a;
        NavBarWithBigTile navBarWithBigTileF3 = f3();
        navBarWithBigTileF3.setLoadingState(false);
        navBarWithBigTileF3.setToolbarTitleWithSubtitle(clause, textLocalisedClause);
        navBarWithBigTileF3.setTitle(clause);
        navBarWithBigTileF3.setDescription(f0Var.f178211c);
        s3 s3Var = f0Var.d;
        if (s3Var instanceof p3) {
            navBarWithBigTileF3.setAvatar(((p3) s3Var).f275223a, r0.BLURRED_BACKGROUND);
        } else if (s3Var instanceof q3) {
            navBarWithBigTileF3.setAvatarGroup(((q3) s3Var).f275229a, true);
        } else if (s3Var instanceof r3) {
            navBarWithBigTileF3.setAvatar(new AvatarModel.Default(((r3) s3Var).f275236a.getImage(), null, f0Var.e, null, 494), r0.BLURRED_BACKGROUND);
        } else {
            if (s3Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithBigTileF3.setAvatar(null, r0.DEFAULT);
        }
        navBarWithBigTileF3.setActionStatusLabel(new k(6, textLocalisedClause, null, false));
        navBarWithBigTileF3.setActions(f0Var.f);
    }

    @Override // com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        NavBarWithBigTile navBarWithBigTileF3 = f3();
        navBarWithBigTileF3.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTileF3.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
        navBarWithBigTileF3.setTitleStyle(b1.LARGE);
        navBarWithBigTileF3.setIconClickable(true);
        navBarWithBigTileF3.setHeightMode(p2.f275222a);
    }

    @Override // com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        ViewController.P2(this, e.b(f3().f59357t), new x0(this, null, 0), 3);
        ViewController.P2(this, e.b(f3().f59360y.f57274n), new x0(this, null, 1), 3);
        ViewController.P2(this, new d(e.b(f3().K()), 14), new jij.h(this, (Continuation) null, 24), 3);
    }

    @Override // com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen
    public final int e3() {
        ViewBinding value = this.g0.getValue(this, f106816h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView screenRecyclerNavBarWithBigTileRecyclerView = ((d0) value).f174511c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileRecyclerView, "screenRecyclerNavBarWithBigTileRecyclerView");
        return screenRecyclerNavBarWithBigTileRecyclerView.getId();
    }

    public final NavBarWithBigTile f3() {
        ViewBinding value = this.g0.getValue(this, f106816h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile screenRecyclerNavBarWithBigTileNavBarWithBigTile = ((d0) value).f174510b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileNavBarWithBigTile, "screenRecyclerNavBarWithBigTileNavBarWithBigTile");
        return screenRecyclerNavBarWithBigTileNavBarWithBigTile;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.f0;
    }
}
