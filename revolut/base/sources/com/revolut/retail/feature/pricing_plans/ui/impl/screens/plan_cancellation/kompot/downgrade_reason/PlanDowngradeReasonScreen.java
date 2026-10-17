package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_reason;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_reason.PlanDowngradeReasonScreen;
import il9.p;
import ilk.c;
import ilk.f;
import ilk.g;
import ilk.h;
import java.util.List;
import jii.u;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import qgk.f0;
import qgk.x;
import rd0.e;
import te0.w;
import vc.s;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/downgrade_reason/PlanDowngradeReasonScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lilk/h;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lilk/f;", "<init>", "()V", "Companion", "a", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanDowngradeReasonScreen extends BaseRecyclerViewScreen<h, IOData$EmptyInput, f> {
    public final int U;
    public final int V;
    public final ao.h W;
    public final Lazy X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f103497a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f103496b0 = {o0.f186429a.j(new h0(PlanDowngradeReasonScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_reason.PlanDowngradeReasonScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public PlanDowngradeReasonScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = R$id.recyclerView;
        this.W = s.t(this, b.f);
        Lazy lazyB = j.b(new p(4));
        this.X = lazyB;
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: ilk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeReasonScreen f162251b;

            {
                this.f162251b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanDowngradeReasonScreen planDowngradeReasonScreen = this.f162251b;
                switch (i2) {
                    case 0:
                        PlanDowngradeReasonScreen.Companion companion = PlanDowngradeReasonScreen.INSTANCE;
                        qji.b bVarQ2 = planDowngradeReasonScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_reason.di.PlanDowngradeReasonScreenInjector");
                        x xVar = (x) ((flk.a) bVarQ2);
                        return new f0(xVar.f246312b, xVar.f246313c);
                    default:
                        PlanDowngradeReasonScreen.Companion companion2 = PlanDowngradeReasonScreen.INSTANCE;
                        return (g) ((f0) planDowngradeReasonScreen.Y.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: ilk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeReasonScreen f162251b;

            {
                this.f162251b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanDowngradeReasonScreen planDowngradeReasonScreen = this.f162251b;
                switch (i22) {
                    case 0:
                        PlanDowngradeReasonScreen.Companion companion = PlanDowngradeReasonScreen.INSTANCE;
                        qji.b bVarQ2 = planDowngradeReasonScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_reason.di.PlanDowngradeReasonScreenInjector");
                        x xVar = (x) ((flk.a) bVarQ2);
                        return new f0(xVar.f246312b, xVar.f246313c);
                    default:
                        PlanDowngradeReasonScreen.Companion companion2 = PlanDowngradeReasonScreen.INSTANCE;
                        return (g) ((f0) planDowngradeReasonScreen.Y.getValue()).d.get();
                }
            }
        });
        this.f103497a0 = v.k((InputChecklistDelegate) lazyB.getValue(), new RowLoadingDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        h uiState = (h) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174564b.setEnabled(uiState.f162257b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f0) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(g3().f174565c.f59410q), null, new ilk.b(this, null, 0), 3);
        a.g2(this, e.b(g3().f174565c.o.f57403b), null, new ibg.g(this, null, 16), 3);
        a.g2(this, e.b(((InputChecklistDelegate) this.X.getValue()).f52518c), null, new c(this, null), 3);
        a.g2(this, e.b(g3().f174564b.o), null, new ilk.b(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.plan_cancellation_why_are_you_leaving_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.plan_cancellation_why_are_you_leaving_subtitle, null, null, 14));
        navBarWithToolbar.setMenuItems(zhm.u.c(new TextNavBarMenuItem("ID_MENU_ITEM_SKIP", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_skip, null, null, 14), null, null, 12)));
        g3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        h uiState = (h) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174564b.setEnabled(uiState.f162257b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.f103497a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final u g3() {
        ViewBinding value = this.W.getValue(this, f103496b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.U;
    }
}
