package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MonthPickerDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlanLargeDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ip0.mx;
import java.time.YearMonth;
import java.util.List;
import kl7.k1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kp7.g;
import kp7.i;
import kp7.j;
import kp7.n;
import kp7.o;
import mx0.v5;
import no.m;
import ql7.a1;
import rp0.l;
import rp0.t;
import rp0.y;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_selection/MotorPlanSelectorScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lkp7/o;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_selection/MotorPlanSelectorScreenContract$InputData;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_selection/a;", "Lno/m;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MotorPlanSelectorScreen extends BaseRecyclerViewScreen<o, MotorPlanSelectorScreenContract$InputData, a> implements m {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(MotorPlanSelectorScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenMotorPlanSelectorBinding;", 0))};
    public final /* synthetic */ zl7.a U;
    public final int V;
    public final int W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f75601a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LargeActionButtonDelegate f75602b0;
    public final TextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final MonthPickerDelegate f75603d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final FullScreenStateDelegate f75604e0;
    public final LargeActionButtonDelegate f0;
    public final ProductSelectionDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final List f75605h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotorPlanSelectorScreen(MotorPlanSelectorScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = zl7.a.f323190a;
        this.V = R$layout.screen_motor_plan_selector;
        this.W = R$id.motorPlanSelector_recyclerView;
        this.X = s.t(this, kp7.a.f);
        this.Y = w.y0(new k8e.a(this, inputData, 29));
        this.Z = w.y0(new kob.a(this, 1));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f75601a0 = rowDelegate;
        this.f75602b0 = new LargeActionButtonDelegate();
        TextDelegate textDelegate = new TextDelegate();
        this.c0 = textDelegate;
        this.f75603d0 = new MonthPickerDelegate();
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f75604e0 = fullScreenStateDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.f0 = largeActionButtonDelegate;
        ProductSelectionDelegate productSelectionDelegate = new ProductSelectionDelegate();
        this.g0 = productSelectionDelegate;
        this.f75605h0 = v.k(rowDelegate, textDelegate, fullScreenStateDelegate, largeActionButtonDelegate, productSelectionDelegate, new ListSubheaderDelegate(), new PlanTileDelegate(0), new PlanLargeDelegate(), new RowLoadingDelegate(), new FixedTabsLoadingDelegate(), new PlanTileLoadingDelegate(), new HeaderLoadingDelegate());
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        e eVar = (e) T2();
        k1 k1Var = (k1) ((j) eVar.t2()).f188177a.getContent();
        List list = k1Var != null ? k1Var.f185350b : null;
        if (list != null && !list.isEmpty()) {
            MotorPlanSelectorScreenContract$InputData motorPlanSelectorScreenContract$InputData = eVar.f75613p;
            if (!(motorPlanSelectorScreenContract$InputData instanceof MotorPlanSelectorScreenContract$InputData.Application) ? !(motorPlanSelectorScreenContract$InputData instanceof MotorPlanSelectorScreenContract$InputData.RenewalPolicy) : !((MotorPlanSelectorScreenContract$InputData.Application) motorPlanSelectorScreenContract$InputData).f75607b) {
                j60.a aVar = eVar.f75616s;
                int year = ((j) eVar.t2()).e.getYear();
                YearMonth selectedMonth = ((j) eVar.t2()).e;
                l80.f fVar = (l80.f) eVar.u;
                YearMonth minAvailableMonth = YearMonth.from(fVar.e().plusMonths(1L));
                Intrinsics.checkNotNullExpressionValue(minAvailableMonth, "from(...)");
                YearMonth maxAvailableMonth = YearMonth.from(fVar.e().plusMonths(13L));
                Intrinsics.checkNotNullExpressionValue(maxAvailableMonth, "from(...)");
                Intrinsics.checkNotNullParameter(selectedMonth, "selectedMonth");
                Intrinsics.checkNotNullParameter(minAvailableMonth, "minAvailableMonth");
                Intrinsics.checkNotNullParameter(maxAvailableMonth, "maxAvailableMonth");
                t tVar = new t(new TextLocalisedClause(R$string.car_insurance_renewal_reminder_title, null, null, 14), null, null, 30);
                l lVar = l.WINDOW;
                aim.e eVarB = u.b();
                eVarB.add(new PlainTextDelegate.Model("REMINDER_DESCRIPTION_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.car_insurance_renewal_reminder_description, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 61422));
                mx mxVar = new mx("REMINDER_MONTH_PICKER_ID", year, YearMonth.from(selectedMonth), YearMonth.from(minAvailableMonth), YearMonth.from(maxAvailableMonth));
                yp0.b.l(mxVar, 0, 0, 0, 0, null, false, 63);
                eVarB.add(mxVar);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_renewal_reminder_set_reminder, null, null, 14);
                int i = R$attr.uikit_dp16;
                eVarB.add(new LargeActionButtonDelegate.Model("REMINDER_PRIMARY_BUTTON_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i, R$attr.uikit_dp8, i, i, 496));
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.car_insurance_renewal_reminder_close, null, null, 14);
                int i2 = R$attr.uikit_dp8;
                int i3 = R$attr.uikit_dp24;
                int i5 = R$attr.uikit_dp16;
                eVarB.add(new LargeActionButtonDelegate.Model("REMINDER_SECONDARY_BUTTON_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, null, i2, i3, i5, i5, 496));
                aVar.x(new y(u.a(eVarB), tVar, lVar, null, null, null, 1016));
                return true;
            }
        }
        return super.F2();
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        this.U.getClass();
        return new AnalyticsProduct.Retail(zl7.a.f323191b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (a1) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f217078c.f59410q), null, new kp7.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f217078c.p0()), null, new kp7.b(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f217077b.o0()), null, new kp7.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f217077b.p0()), null, new kp7.e(this, continuation, 2), 3);
        RowDelegate rowDelegate = this.f75601a0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53225r), null, new kp7.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.g0.p()), null, new kp7.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.c0.d), null, new kp7.b(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f75602b0.d.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().d.f), null, new kp7.b(this, continuation, 0), 3);
        FullScreenStateDelegate fullScreenStateDelegate = this.f75604e0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), null, new kp7.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fullScreenStateDelegate.d), null, new kp7.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f0.d.f121375b), null, new kp7.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f75603d0.f52775c.f121375b), null, new kp7.b(this, continuation, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f217078c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        h3().f217077b.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        ((j60.a) ((a1) this.Y.getValue()).d.get()).d(v.k(this.f75602b0, this.f75603d0, new PlainTextDelegate()));
        pd.b.p(view, new TextLocalisedClause(R$string.car_insurance_plan_selection_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getL0() {
        return this.f75605h0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.W;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void Z2(o uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        FixedTabs fixedTabs = h3().d;
        List list = uiState.f188188c;
        CompositeClause compositeClause = uiState.f188187b;
        ?? r2 = uiState.i;
        fixedTabs.setItems(list, uiState.d);
        TwinVerticalButton twinVerticalButton = h3().f217077b;
        boolean z = uiState.f188189g;
        twinVerticalButton.setMainButtonVisible(z);
        Clause clause = uiState.f;
        twinVerticalButton.setSecondaryButtonVisible(clause != null);
        if (clause != null) {
            twinVerticalButton.setSecondaryButtonText(clause);
        }
        if (z) {
            h3().f217077b.setMainButtonText((Clause) uiState.e);
        }
        FixedTabs motorPlanSelectorTabs = h3().d;
        Intrinsics.checkNotNullExpressionValue(motorPlanSelectorTabs, "motorPlanSelectorTabs");
        motorPlanSelectorTabs.setVisibility(uiState.f188190h ? 0 : 8);
        NavBarWithToolbar navBarWithToolbar = h3().f217078c;
        navBarWithToolbar.setToolbarTitle(r2);
        navBarWithToolbar.setTitle(r2, null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(compositeClause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getS() {
        return this.V;
    }

    public final nl7.l h3() {
        ViewBinding value = this.X.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nl7.l) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final n T2() {
        return (n) this.Z.getValue();
    }
}
