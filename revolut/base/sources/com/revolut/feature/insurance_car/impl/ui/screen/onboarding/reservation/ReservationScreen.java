package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.reservation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.n;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import q97.p1;
import qba.b;
import ql7.g1;
import qp7.c;
import qp7.d;
import qp7.f;
import qp7.g;
import qp7.o;
import qp7.p;
import qp7.q;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;
import zl7.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/reservation/ReservationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lqp7/p;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/reservation/ReservationScreenContract$InputData;", "Lqp7/o;", "Lno/m;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReservationScreen extends BaseRecyclerViewScreen<p, ReservationScreenContract$InputData, o> implements m {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(ReservationScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenCollapsingButtonBinding;", 0))};
    public final /* synthetic */ a U;
    public final int V;
    public final int W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f75624a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LargeActionButtonDelegate f75625b0;
    public final TextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final SelectableDelegate f75626d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final FullScreenStateDelegate f75627e0;
    public final List f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReservationScreen(ReservationScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = a.f323190a;
        this.V = R$layout.screen_collapsing_button;
        this.W = R$id.screenCollapsingButton_recyclerView;
        this.X = s.t(this, qp7.a.f);
        this.Y = w.y0(new b(this, inputData, 21));
        this.Z = w.y0(new p1(this, 16));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f75624a0 = rowDelegate;
        this.f75625b0 = new LargeActionButtonDelegate();
        TextDelegate textDelegate = new TextDelegate();
        this.c0 = textDelegate;
        SelectableDelegate selectableDelegate = new SelectableDelegate(textDelegate);
        this.f75626d0 = selectableDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f75627e0 = fullScreenStateDelegate;
        this.f0 = v.k(rowDelegate, selectableDelegate, textDelegate, fullScreenStateDelegate, new ListSubheaderDelegate(), new RowLoadingDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, jki.o oVar) {
        p uiState = (p) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f217060b.setLargeButtonEnabled(uiState.f248313b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        this.U.getClass();
        return new AnalyticsProduct.Retail(a.f323191b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (g1) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        int i = 0;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f217061c.f59410q), null, new qp7.b(this, continuation, i), 3);
        j60.a aVar = (j60.a) ((g1) this.Y.getValue()).d.get();
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        LargeActionButtonDelegate largeActionButtonDelegate = this.f75625b0;
        aVar.d(v.k(largeActionButtonDelegate, plainTextDelegate));
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75624a0.f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(largeActionButtonDelegate.d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75626d0.r()), null, new qp7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f217060b.d()), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f217060b.c()), null, new qp7.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.d), null, new g(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75627e0.f52371h.f121375b), null, new qp7.h(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f217061c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_policy_review_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        CollapsingActionButton collapsingActionButton = g3().f217060b;
        collapsingActionButton.setLargeButtonText(new TextLocalisedClause(R$string.car_insurance_policy_review_action_button_title, null, null, 14));
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        NavBarWithToolbar screenCollapsingButtonNavBar = g3().f217061c;
        Intrinsics.checkNotNullExpressionValue(screenCollapsingButtonNavBar, "screenCollapsingButtonNavBar");
        zl7.e.a(this, screenCollapsingButtonNavBar, h(), new qgf.o(this, 20));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, jki.o oVar) {
        p uiState = (p) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f217060b.setLargeButtonEnabled(uiState.f248313b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getY() {
        return this.f0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.W;
    }

    public final nl7.f g3() {
        ViewBinding value = this.X.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nl7.f) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final q T2() {
        return (q) this.Z.getValue();
    }
}
