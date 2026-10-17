package com.revolut.feature.insurance_car.impl.ui.screen.mta.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
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
import ghk.t;
import gmk.j;
import go7.a;
import go7.c;
import go7.d;
import go7.g;
import go7.i;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nl7.f;
import ql7.t1;
import rd0.e;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/mta/review/MtaReviewScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lgo7/i;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/mta/review/MtaReviewScreenContract$InputData;", "Lgo7/g;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MtaReviewScreen extends BaseRecyclerViewScreen<i, MtaReviewScreenContract$InputData, g> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75535d0 = {o0.f186429a.j(new h0(MtaReviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenCollapsingButtonBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final CellDetailsDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TextDelegate f75536a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final SelectableDelegate f75537b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtaReviewScreen(MtaReviewScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_collapsing_button;
        this.V = R$id.screenCollapsingButton_recyclerView;
        this.W = s.t(this, a.f);
        this.X = w.y0(new t(this, inputData, 10));
        this.Y = w.y0(new g8i.h(this, 19));
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.Z = cellDetailsDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.f75536a0 = textDelegate;
        SelectableDelegate selectableDelegate = new SelectableDelegate(textDelegate);
        this.f75537b0 = selectableDelegate;
        this.c0 = v.k(new RowDelegate(null, null, 7), cellDetailsDelegate, selectableDelegate, textDelegate, new ListSubheaderDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        i uiState = (i) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f217060b.setLargeButtonEnabled(uiState.f145098b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (t1) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (go7.h) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f217061c.f59410q), null, new go7.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.d), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75537b0.r()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75536a0.d), null, new gii.b(this, continuation, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f217060b.d()), null, new go7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f217060b.c()), null, new go7.b(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f217061c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_mta_review_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        CollapsingActionButton collapsingActionButton = g3().f217060b;
        collapsingActionButton.setLargeButtonText(new TextLocalisedClause(R$string.car_insurance_mta_review_primary_button, null, null, 14));
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        NavBarWithToolbar screenCollapsingButtonNavBar = g3().f217061c;
        Intrinsics.checkNotNullExpressionValue(screenCollapsingButtonNavBar, "screenCollapsingButtonNavBar");
        zl7.e.a(this, screenCollapsingButtonNavBar, h(), new j(this, 4));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        i uiState = (i) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f217060b.setLargeButtonEnabled(uiState.f145098b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final f g3() {
        ViewBinding value = this.W.getValue(this, f75535d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }
}
