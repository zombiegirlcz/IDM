package com.revolut.feature.insurance_car.impl.ui.screen.policy.summary;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f2;
import au0.s0;
import au0.u0;
import au0.v0;
import aw0.s8;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.DrivingScoreDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nl7.p;
import no.m;
import ql7.c1;
import rd0.e;
import rgf.b;
import rlh.c;
import rq7.d;
import rq7.f;
import rq7.g;
import rq7.i;
import rq7.k;
import rq7.q;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;
import zl7.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/summary/PolicySummaryScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lrq7/q;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/summary/PolicySummaryScreenContract$InputData;", "Lrq7/k;", "Lno/m;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PolicySummaryScreen extends BaseRecyclerViewScreen<q, PolicySummaryScreenContract$InputData, k> implements m {
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(PolicySummaryScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenPolicySummaryBinding;", 0))};
    public final /* synthetic */ a U;
    public final int V;
    public final h W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CellDetailsActionDelegate f75667a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f75668b0;
    public final PlainTextWarningDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final DrivingScoreDelegate f75669d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ListSubheaderDelegate f75670e0;
    public final LargeActionButtonDelegate f0;
    public final PlainTextDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ActionWidgetDelegate f75671h0;
    public final List i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolicySummaryScreen(PolicySummaryScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = a.f323190a;
        this.V = R$layout.screen_policy_summary;
        this.W = s.t(this, rq7.a.f);
        this.X = R$id.policySummary_recyclerView;
        this.Y = w.y0(new b(this, inputData, 16));
        this.Z = w.y0(new r1a.a(this, 24));
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.f75667a0 = cellDetailsActionDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f75668b0 = rowDelegate;
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        this.c0 = plainTextWarningDelegate;
        DrivingScoreDelegate drivingScoreDelegate = new DrivingScoreDelegate();
        this.f75669d0 = drivingScoreDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.f75670e0 = listSubheaderDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.f0 = largeActionButtonDelegate;
        this.g0 = new PlainTextDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.f75671h0 = actionWidgetDelegate;
        this.i0 = v.k(cellDetailsActionDelegate, rowDelegate, new CellDetailsDelegate(), listSubheaderDelegate, largeActionButtonDelegate, new RowLoadingDelegate(), new FullScreenStateDelegate(), drivingScoreDelegate, plainTextWarningDelegate, actionWidgetDelegate, new ScrollerDelegate(u.c(actionWidgetDelegate), false));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        this.U.getClass();
        return new AnalyticsProduct.Retail(a.f323191b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (c1) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217088b.f59357t), null, new c(this, continuation, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217088b.K()), null, new rq7.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75668b0.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75667a0.d), null, new rq7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f0.d.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.d.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, kii.e.t(this.f75669d0.f52207c, "hide(...)"), null, new rq7.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75670e0.f52707c), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.g0.d.f121375b), null, new rk9.d(this, continuation, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75671h0.f51589c.f121375b), null, new rq7.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithBigTile navBarWithBigTile = h3().f217088b;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        ((j60.a) ((c1) this.Y.getValue()).f.get()).d(v.k(this.f0, this.f75668b0, this.g0));
        pd.b.p(view, new TextLocalisedClause(R$string.car_insurance_policy_summary_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF69871a0() {
        return this.i0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getU() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(q uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithBigTile navBarWithBigTile = h3().f217088b;
        Clause clause = uiState.f256496b;
        navBarWithBigTile.setToolbarTitle(clause);
        navBarWithBigTile.setTitle(clause);
        navBarWithBigTile.setDescription(uiState.f256497c);
        Image image = uiState.d;
        navBarWithBigTile.setPages(v.l(image != null ? new u0(new NavBarWithContainerBackground.ImageBackground(image, (s8) null, (Color.SolidRes) null, 14), null, null, null) : null), f2.LINE_INDICATOR, v0.NONE);
        navBarWithBigTile.setActionStatusLabel(uiState.e);
        navBarWithBigTile.setActions(uiState.f256498g);
        navBarWithBigTile.setMenuItems(uiState.f);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    public final p h3() {
        ViewBinding value = this.W.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final rq7.p T2() {
        return (rq7.p) this.Z.getValue();
    }
}
