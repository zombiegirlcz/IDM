package com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.checkout;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import db1.e;
import j68.a;
import java.util.List;
import jb1.c;
import jb1.d;
import jb1.f;
import jb1.i;
import jb1.l;
import jb1.m;
import jb1.n;
import jb1.o;
import jii.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/screen/checkout/CheckoutScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ljb1/o;", "Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/screen/checkout/CheckoutScreenContract$InputData;", "Ljb1/i;", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CheckoutScreen extends BaseRecyclerViewScreen<o, CheckoutScreenContract$InputData, i> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(CheckoutScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final h U;
    public final FullScreenStateDelegate V;
    public final CellIncrementDelegate W;
    public final RowDelegate X;
    public final List Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f60599a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f60600b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutScreen(CheckoutScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, c.f);
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.V = fullScreenStateDelegate;
        CellIncrementDelegate cellIncrementDelegate = new CellIncrementDelegate();
        this.W = cellIncrementDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.X = rowDelegate;
        this.Y = v.k(rowDelegate, new RowLoadingDelegate(), cellIncrementDelegate, fullScreenStateDelegate);
        this.Z = R$id.screenRecyclerNavbarActionFooter_recyclerView;
        this.f60599a0 = R$layout.screen_recycler_navbar_action_footer;
        this.f60600b0 = w.y0(new a(this, inputData, 10));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (e) this.f60600b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174534c.f59410q), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174533b.f), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174533b.e), null, new d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.f52371h.f121375b), null, new jb1.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.f53220l), null, new f(this, null), 3);
        CellIncrementDelegate cellIncrementDelegate = this.W;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellIncrementDelegate.d), null, new d(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellIncrementDelegate.f51948c), null, new d(this, continuation, 4), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(o uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f174534c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        if ((uiState instanceof n) || (uiState instanceof m)) {
            NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = h3().f174534c;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
            screenRecyclerNavbarActionFooterNavBar.j0(false);
            h3().f174534c.setDescriptionVisible(false);
            ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = h3().f174533b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
            screenRecyclerNavbarActionFooterActionFooterView.setVisibility(8);
            return;
        }
        if (!(uiState instanceof l)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar2 = h3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar2, "screenRecyclerNavbarActionFooterNavBar");
        screenRecyclerNavbarActionFooterNavBar2.H0(false);
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar3 = h3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar3, "screenRecyclerNavbarActionFooterNavBar");
        l lVar = (l) uiState;
        TextLocalisedClause textLocalisedClause = lVar.f172558b;
        screenRecyclerNavbarActionFooterNavBar3.setTitle(textLocalisedClause, null);
        h3().f174534c.setToolbarTitle(textLocalisedClause);
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView2 = h3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView2, "screenRecyclerNavbarActionFooterActionFooterView");
        screenRecyclerNavbarActionFooterActionFooterView2.setVisibility(0);
        h3().f174533b.setModel(new aw0.e(true, lVar.f172559c, null, new n6(lVar.d, LargeActionButton.ButtonStyle.f58725a, null, null, lVar.e, null, null, 988), null, null, 52));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.f60599a0;
    }

    public final k h3() {
        ViewBinding value = this.U.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final jb1.k T2() {
        return (jb1.k) ((e) this.f60600b0.getValue()).d.get();
    }
}
