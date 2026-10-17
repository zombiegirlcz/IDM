package com.revolut.feature.insurance_car.impl.ui.screen.policy.smart_driving;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HistogramDelegate;
import com.revolut.core.ui_kit.delegates.HistogramEmptyDelegate;
import com.revolut.core.ui_kit.delegates.HistogramLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LimitProgressBarWithTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pe2.c;
import pgk.f;
import pq7.b;
import pq7.d;
import pq7.i;
import pq7.j;
import pq7.k;
import ql7.i1;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/smart_driving/SmartDrivingScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lpq7/k;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/smart_driving/SmartDrivingScreenContract$InputData;", "Lpq7/i;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmartDrivingScreen extends BaseRecyclerViewScreen<k, SmartDrivingScreenContract$InputData, i> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75663d0 = {o0.f186429a.j(new h0(SmartDrivingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final h V;
    public final RowDelegate W;
    public final FixedTabsDelegate X;
    public final LimitProgressBarWithTextDelegate Y;
    public final LargeActionButtonDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75664a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f75665b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartDrivingScreen(SmartDrivingScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, b.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.W = rowDelegate;
        FixedTabsDelegate fixedTabsDelegate = new FixedTabsDelegate();
        this.X = fixedTabsDelegate;
        LimitProgressBarWithTextDelegate limitProgressBarWithTextDelegate = new LimitProgressBarWithTextDelegate();
        this.Y = limitProgressBarWithTextDelegate;
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.Z = new LargeActionButtonDelegate();
        ScrollerDelegate scrollerDelegate = new ScrollerDelegate(v.k(rowDelegate, referralContactDelegate), false);
        ScrollerBoxDelegate scrollerBoxDelegate = new ScrollerBoxDelegate(u.c(referralContactDelegate));
        this.f75664a0 = w.y0(new c(this, inputData, 23));
        this.f75665b0 = w.y0(new f(this, 16));
        this.c0 = v.k(rowDelegate, fixedTabsDelegate, limitProgressBarWithTextDelegate, new HistogramLoadingDelegate(), new HistogramDelegate(), new HistogramEmptyDelegate(), scrollerDelegate, scrollerBoxDelegate, new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174539b.setMenuItems(uiState.f238694a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (i1) this.f75664a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(g3().f174539b.f59410q), null, new pnb.b(this, null, 3), 3);
        a.g2(this, e.b(g3().f174539b.o.f57403b), null, new pq7.c(this, null, 0), 3);
        a.g2(this, e.b(this.X.f52339c.f121375b), null, new d(this, null), 3);
        a.g2(this, e.b((ihm.f) this.Y.f52641c.getValue()), null, new pq7.c(this, null, 1), 3);
        a.g2(this, e.b(this.W.f53220l), null, new pq7.e(this, null), 3);
        a.g2(this, e.b(this.Z.d.f121375b), null, new pq7.f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.car_insurance_smart_driving_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.car_insurance_smart_driving_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((i1) this.f75664a0.getValue()).d.get()).d(v.k(new CellDetailsDelegate(), this.Z));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        k uiState = (k) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174539b.setMenuItems(uiState.f238694a);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    public final jii.m g3() {
        ViewBinding value = this.V.getValue(this, f75663d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final j T2() {
        return (j) this.f75665b0.getValue();
    }
}
