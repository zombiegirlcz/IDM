package com.revolut.feature.voluntary.offboarding.impl.ui.remove_obstacles;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.voluntary.offboarding.impl.R$id;
import com.revolut.feature.voluntary.offboarding.impl.R$layout;
import com.revolut.feature.voluntary.offboarding.impl.ui.remove_obstacles.RemoveObstaclesScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import fsg.c;
import ir2.a;
import ir2.d;
import ir2.h;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ksg.d;
import ksg.g;
import ksg.i;
import rd0.e;
import sji.b;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/voluntary/offboarding/impl/ui/remove_obstacles/RemoveObstaclesScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lksg/i;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lksg/g;", "<init>", "()V", "feature_voluntary_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RemoveObstaclesScreen extends BaseRecyclerViewScreen<i, IOData$EmptyInput, g> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(RemoveObstaclesScreen.class, "binding", "getBinding()Lcom/revolut/feature/voluntary/offboarding/impl/databinding/ScreenRemoveObstaclesBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f94842a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f94843b0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, dsg.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/voluntary/offboarding/impl/databinding/ScreenRemoveObstaclesBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.removeObstacles_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.removeObstacles_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.removeObstacles_twinVerticalButton;
                    TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i);
                    if (twinVerticalButton != null) {
                        return new dsg.a(twinVerticalButton, navBarWithToolbar, controllerContainerCoordinatorLayout);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public RemoveObstaclesScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_remove_obstacles;
        this.V = R$id.removeObstacles_recyclerView;
        this.W = s.t(this, a.f);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: ksg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RemoveObstaclesScreen f189454b;

            {
                this.f189454b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RemoveObstaclesScreen removeObstaclesScreen = this.f189454b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RemoveObstaclesScreen.c0;
                        qji.b bVarQ2 = removeObstaclesScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.voluntary.offboarding.impl.ui.remove_obstacles.di.RemoveObstaclesScreenInjector");
                        fsg.d dVar = ((fsg.e) bVarQ2).f137686a;
                        fsg.c cVar = new fsg.c();
                        int i3 = 28;
                        cVar.f137674a = e4m.b.b(new fa0.q(dVar, cVar, 1, i3));
                        cVar.f137675b = e4m.b.b(new fa0.q(dVar, cVar, 0, i3));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr2 = RemoveObstaclesScreen.c0;
                        return (h) ((fsg.c) removeObstaclesScreen.X.getValue()).f137675b.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: ksg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RemoveObstaclesScreen f189454b;

            {
                this.f189454b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RemoveObstaclesScreen removeObstaclesScreen = this.f189454b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RemoveObstaclesScreen.c0;
                        qji.b bVarQ2 = removeObstaclesScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.voluntary.offboarding.impl.ui.remove_obstacles.di.RemoveObstaclesScreenInjector");
                        fsg.d dVar = ((fsg.e) bVarQ2).f137686a;
                        fsg.c cVar = new fsg.c();
                        int i3 = 28;
                        cVar.f137674a = e4m.b.b(new fa0.q(dVar, cVar, 1, i3));
                        cVar.f137675b = e4m.b.b(new fa0.q(dVar, cVar, 0, i3));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr2 = RemoveObstaclesScreen.c0;
                        return (h) ((fsg.c) removeObstaclesScreen.X.getValue()).f137675b.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f94842a0 = fullScreenStateDelegate;
        this.f94843b0 = v.k(rowDelegate, new RowLoadingDelegate(), fullScreenStateDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (c) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f53218h), null, new ksg.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f94842a0.f52371h.f121375b), null, new ksg.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f117312b.f59410q), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f117313c.o0()), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f117313c.p0()), null, new d(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF84512a0() {
        return this.f94843b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar removeObstaclesNavBar = h3().f117312b;
        Intrinsics.checkNotNullExpressionValue(removeObstaclesNavBar, "removeObstaclesNavBar");
        ir2.h hVar = uiState.f189459a;
        if (hVar instanceof h.a) {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            removeObstaclesNavBar.I0(t3Var, false);
        } else {
            if (!(hVar instanceof ir2.g)) {
                throw new NoWhenBranchMatchedException();
            }
            ir2.g gVar = (ir2.g) hVar;
            Clause clause = gVar.f167990b;
            TextClause textClause = gVar.f167989a;
            removeObstaclesNavBar.setTitle(textClause, null);
            removeObstaclesNavBar.setToolbarTitle(textClause);
            removeObstaclesNavBar.setHeaderTitleMode(j0.MULTILINE);
            if (clause != null) {
                removeObstaclesNavBar.setDescriptionVisible(true);
                removeObstaclesNavBar.setDescriptionText(clause);
            } else {
                removeObstaclesNavBar.setDescriptionVisible(false);
            }
            removeObstaclesNavBar.l0();
        }
        removeObstaclesNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TwinVerticalButton removeObstaclesTwinVerticalButton = h3().f117313c;
        Intrinsics.checkNotNullExpressionValue(removeObstaclesTwinVerticalButton, "removeObstaclesTwinVerticalButton");
        ir2.d dVar = uiState.f189461c;
        if (dVar instanceof d.a) {
            removeObstaclesTwinVerticalButton.setVisibility(8);
            return;
        }
        if (!(dVar instanceof ir2.e)) {
            throw new NoWhenBranchMatchedException();
        }
        removeObstaclesTwinVerticalButton.setVisibility(0);
        ir2.e eVar = (ir2.e) dVar;
        ir2.b bVar = eVar.f167987a;
        removeObstaclesTwinVerticalButton.setMainButtonText(bVar.f167981a);
        removeObstaclesTwinVerticalButton.setMainButtonStyle(bVar.f167982b);
        ir2.a aVar = eVar.f167988b;
        if (aVar instanceof a.C0939a) {
            removeObstaclesTwinVerticalButton.setSecondaryButtonVisible(false);
        } else {
            if (!(aVar instanceof ir2.b)) {
                throw new NoWhenBranchMatchedException();
            }
            removeObstaclesTwinVerticalButton.setSecondaryButtonVisible(true);
            ir2.b bVar2 = (ir2.b) aVar;
            removeObstaclesTwinVerticalButton.setSecondaryButtonText(bVar2.f167981a);
            removeObstaclesTwinVerticalButton.setSecondaryButtonStyle(bVar2.f167982b);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final dsg.a h3() {
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dsg.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final ksg.h T2() {
        return (ksg.h) this.Y.getValue();
    }
}
