package com.revolut.feature.spending_analytics.impl.ui.rev10.select;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ar1.c;
import ard.g0;
import ard.h;
import ard.k;
import ard.l0;
import ard.m;
import ard.n;
import ard.n0;
import ard.p;
import ard.p0;
import ard.r;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$SelectionMode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.d;
import org.jetbrains.annotations.NotNull;
import ppd.r0;
import te0.w;
import vc.s;
import xki.e;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lard/h;", "Ldli/a;", "Lard/k;", "Companion", "a", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectTransactionController extends ViewController<h> implements dli.a {
    public final SelectTransactionContract$InputData K;
    public final int L;
    public final boolean M;
    public final ao.h N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final RowDelegate Q;
    public final SelectableDelegate R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(SelectTransactionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public SelectTransactionController(SelectTransactionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = true;
        this.N = s.t(this, m.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ard.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTransactionController f8666b;

            {
                this.f8666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SelectTransactionController selectTransactionController = this.f8666b;
                switch (i2) {
                    case 0:
                        SelectTransactionController.Companion companion = SelectTransactionController.INSTANCE;
                        return (b) ((ppd.r0) selectTransactionController.T.getValue()).e.get();
                    case 1:
                        SelectTransactionController.Companion companion2 = SelectTransactionController.INSTANCE;
                        SelectTransactionController selectTransactionController2 = this.f8666b;
                        return dli.f.a(selectTransactionController2, selectTransactionController2.d(), zhm.v.k(selectTransactionController2.P, new RowLoadingDelegate(), new SwipeToActionDelegate(selectTransactionController2.Q, false), new ListSubheaderDelegate(), selectTransactionController2.R), 0, null, null, null, 60);
                    default:
                        SelectTransactionController.Companion companion3 = SelectTransactionController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(selectTransactionController.m2()).a().get(ppd.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
                        }
                        ppd.n nVar = ((ppd.n) aVar2.b()).L0;
                        SelectTransactionContract$InputData selectTransactionContract$InputData = selectTransactionController.K;
                        selectTransactionContract$InputData.getClass();
                        return new ppd.r0(nVar, selectTransactionContract$InputData);
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = new SelectableDelegate(rowDelegate);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: ard.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTransactionController f8666b;

            {
                this.f8666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SelectTransactionController selectTransactionController = this.f8666b;
                switch (i22) {
                    case 0:
                        SelectTransactionController.Companion companion = SelectTransactionController.INSTANCE;
                        return (b) ((ppd.r0) selectTransactionController.T.getValue()).e.get();
                    case 1:
                        SelectTransactionController.Companion companion2 = SelectTransactionController.INSTANCE;
                        SelectTransactionController selectTransactionController2 = this.f8666b;
                        return dli.f.a(selectTransactionController2, selectTransactionController2.d(), zhm.v.k(selectTransactionController2.P, new RowLoadingDelegate(), new SwipeToActionDelegate(selectTransactionController2.Q, false), new ListSubheaderDelegate(), selectTransactionController2.R), 0, null, null, null, 60);
                    default:
                        SelectTransactionController.Companion companion3 = SelectTransactionController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(selectTransactionController.m2()).a().get(ppd.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
                        }
                        ppd.n nVar = ((ppd.n) aVar2.b()).L0;
                        SelectTransactionContract$InputData selectTransactionContract$InputData = selectTransactionController.K;
                        selectTransactionContract$InputData.getClass();
                        return new ppd.r0(nVar, selectTransactionContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: ard.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTransactionController f8666b;

            {
                this.f8666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SelectTransactionController selectTransactionController = this.f8666b;
                switch (i22) {
                    case 0:
                        SelectTransactionController.Companion companion = SelectTransactionController.INSTANCE;
                        return (b) ((ppd.r0) selectTransactionController.T.getValue()).e.get();
                    case 1:
                        SelectTransactionController.Companion companion2 = SelectTransactionController.INSTANCE;
                        SelectTransactionController selectTransactionController2 = this.f8666b;
                        return dli.f.a(selectTransactionController2, selectTransactionController2.d(), zhm.v.k(selectTransactionController2.P, new RowLoadingDelegate(), new SwipeToActionDelegate(selectTransactionController2.Q, false), new ListSubheaderDelegate(), selectTransactionController2.R), 0, null, null, null, 60);
                    default:
                        SelectTransactionController.Companion companion3 = SelectTransactionController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(selectTransactionController.m2()).a().get(ppd.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
                        }
                        ppd.n nVar = ((ppd.n) aVar2.b()).L0;
                        SelectTransactionContract$InputData selectTransactionContract$InputData = selectTransactionController.K;
                        selectTransactionContract$InputData.getClass();
                        return new ppd.r0(nVar, selectTransactionContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (this.K.f87884c instanceof SelectTransactionContract$SelectionMode.Multiple) {
            boolean z = uiState.f8659b;
            boolean z3 = uiState.d;
            if (z) {
                d3().f174565c.setMenuItems(u.c(new TextNavBarMenuItem(z3 ? "nav_bar_deselect" : "nav_bar_select", z3 ? new TextLocalisedClause(R$string.trips_edit_trip_transactions_nav_bar_deselect_all, null, null, 14) : new TextLocalisedClause(R$string.trips_edit_trip_transactions_nav_bar_select_all, null, null, 14), null, null, 12)));
            } else {
                d3().f174565c.setMenuItems(f0.f322471a);
            }
        }
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(uiState.f8661g);
        Boolean bool = uiState.e;
        if (bool == null) {
            largeActionButton.setVisibility(8);
        } else if (bool.equals(Boolean.TRUE)) {
            largeActionButton.setVisibility(0);
            largeActionButton.setEnabled(true);
        } else {
            if (!bool.equals(Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            largeActionButton.setVisibility(0);
            largeActionButton.setEnabled(false);
        }
        Clause clause = uiState.f;
        if (clause != null) {
            d3().f174565c.setFilters(u.c(new ActionsView.Item("date_range_filter", d.SEMIACCENT, false, null, null, clause, new ResourceImage(R$drawable.uikit_icn_24_cal, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, null, null, null, 32540)));
        } else {
            d3().f174565c.setFilters(f0.f322471a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r0) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        SelectTransactionContract$InputData selectTransactionContract$InputData = this.K;
        navBarWithToolbar.setTitle(selectTransactionContract$InputData.d, null);
        Clause clause = selectTransactionContract$InputData.e;
        if (clause != null) {
            navBarWithToolbar.setSecondDescriptionText(clause);
            navBarWithToolbar.setSecondDescriptionVisible(true);
        } else {
            navBarWithToolbar.setSecondDescriptionVisible(false);
        }
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(selectTransactionContract$InputData.f);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.f59410q.subscribe(new aoa.h(new c(this, 3), 20));
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new ard.o(this, null), 3);
        d3().f174565c.f59409p.f57337m.debounce(250L, TimeUnit.MILLISECONDS).distinctUntilChanged().subscribe(new aoa.h(new a08.e(1, d(), ard.b.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 0, 22), 21));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53218h), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.r()), null, new ard.q(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.t0()), null, new r(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new ap7.k(this, null, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new n(this, continuation, 1), 3);
        ScreenContentRecyclerView recyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        com.revolut.kompot.navigable.a.g2(this, cj9.c.O(p0.a(recyclerView), 500L), null, new n(this, continuation, 2), 3);
        ScreenContentRecyclerView recyclerView2 = d3().d;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        Intrinsics.checkNotNullParameter(recyclerView2, "<this>");
        com.revolut.kompot.navigable.a.g2(this, cj9.c.O(vkm.q.J(vkm.q.k(new n0(recyclerView2, null)), new l0(vkm.q.k(new g0(recyclerView2, null)), recyclerView2, 1)), 500L), null, new n(this, continuation, 0), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ard.b d() {
        return (ard.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
