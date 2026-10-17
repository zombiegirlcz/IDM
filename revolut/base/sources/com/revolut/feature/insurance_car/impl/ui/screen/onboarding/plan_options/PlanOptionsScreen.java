package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_options;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ip0.md;
import ip7.c;
import ip7.d;
import ip7.h;
import ip7.i;
import ip7.j;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nl7.n;
import no.m;
import ql7.z0;
import rd0.e;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;
import zl7.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_options/PlanOptionsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lip7/i;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_options/PlanOptionsScreenContract$InputData;", "Lip7/h;", "Lno/m;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanOptionsScreen extends BaseRecyclerViewScreen<i, PlanOptionsScreenContract$InputData, h> implements m {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75595d0 = {o0.f186429a.j(new h0(PlanOptionsScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenPlanOptionsBinding;", 0))};
    public final /* synthetic */ a U;
    public final int V;
    public final ao.h W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f75596a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final SelectableDelegate f75597b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanOptionsScreen(PlanOptionsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = a.f323190a;
        this.V = R$layout.screen_plan_options;
        this.W = s.t(this, ip7.a.f);
        this.X = R$id.planOptions_recyclerView;
        this.Y = w.y0(new md(this, inputData, 12));
        this.Z = w.y0(new ie7.a(this, 24));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f75596a0 = rowDelegate;
        SelectableDelegate selectableDelegate = new SelectableDelegate(new CellDetailsDelegate());
        this.f75597b0 = selectableDelegate;
        this.c0 = v.k(rowDelegate, selectableDelegate, new RowLoadingDelegate(), new FullScreenStateDelegate());
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.U.getClass();
        return new AnalyticsProduct.Retail(a.f323191b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (z0) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (j) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217084c.f59410q), null, new ip7.b(this, continuation, 0), 3);
        RowDelegate rowDelegate = this.f75596a0;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53225r), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f75597b0.r()), null, new ip7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f217083b.o), null, new ip7.b(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f217084c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_plan_options_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF72096a0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        boolean z = uiState.f167672c;
        if (z) {
            h3().f217083b.setText((Clause) uiState.f167671b);
        }
        LargeActionButton planOptionsButton = h3().f217083b;
        Intrinsics.checkNotNullExpressionValue(planOptionsButton, "planOptionsButton");
        planOptionsButton.setVisibility(z ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    public final n h3() {
        ViewBinding value = this.W.getValue(this, f75595d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n) value;
    }
}
