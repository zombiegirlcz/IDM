package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.list;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior_tasks.api.R$string;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.list.ChallengesOverviewListScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dmj.k;
import eq8.a0;
import eq8.b;
import eq8.b0;
import eq8.c;
import eq8.d0;
import eq8.g;
import gp8.l;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/list/ChallengesOverviewListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leq8/a0;", "Ldli/a;", "Leq8/d0;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengesOverviewListScreen extends ViewController<a0> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(ChallengesOverviewListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final FullScreenStateDelegate M;
    public final PlaceholderRowDelegate N;
    public final ListSubheaderDelegate O;
    public final RowDelegate P;
    public final SwipeToActionDelegate Q;
    public final PlainTextWarningDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public ChallengesOverviewListScreen(ChallengesOverviewListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, c.f);
        this.M = new FullScreenStateDelegate();
        this.N = new PlaceholderRowDelegate();
        this.O = new ListSubheaderDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new SwipeToActionDelegate(rowDelegate, false);
        this.R = new PlainTextWarningDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: eq8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengesOverviewListScreen f128366b;

            {
                this.f128366b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengesOverviewListScreen.V;
                        ChallengesOverviewListScreen challengesOverviewListScreen = this.f128366b;
                        return dli.f.a(challengesOverviewListScreen, challengesOverviewListScreen.d(), zhm.v.k(challengesOverviewListScreen.M, challengesOverviewListScreen.O, new RowLoadingDelegate(), challengesOverviewListScreen.P, challengesOverviewListScreen.Q, challengesOverviewListScreen.R, new ListSubheaderLoadingDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = ChallengesOverviewListScreen.V;
                        return (b0) ((gp8.l) this.f128366b.T.getValue()).f145320b.get();
                }
            }
        });
        this.T = w.y0(new b(this, inputData, 0));
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: eq8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengesOverviewListScreen f128366b;

            {
                this.f128366b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengesOverviewListScreen.V;
                        ChallengesOverviewListScreen challengesOverviewListScreen = this.f128366b;
                        return dli.f.a(challengesOverviewListScreen, challengesOverviewListScreen.d(), zhm.v.k(challengesOverviewListScreen.M, challengesOverviewListScreen.O, new RowLoadingDelegate(), challengesOverviewListScreen.P, challengesOverviewListScreen.Q, challengesOverviewListScreen.R, new ListSubheaderLoadingDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = ChallengesOverviewListScreen.V;
                        return (b0) ((gp8.l) this.f128366b.T.getValue()).f145320b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d0 uiState = (d0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f128374b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.junior_challenges_overview_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.junior_challenges_overview_title, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(kli.a.k(context, 80.0f), recyclerView);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new ec8.c(this, null, 26), 3);
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, new k(rd0.e.b(d3().f174539b.o.f57403b), 28), null, new cyc.c(i2, d(), b0.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/list/ChallengesOverviewListScreenContract$Event;)V", i, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, new k(rd0.e.b(this.M.f52371h.f121375b), 29), null, new cyc.c(i2, d(), b0.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/list/ChallengesOverviewListScreenContract$Event;)V", i, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, new g(rd0.e.b(this.N.f52924c), 0), null, new cyc.c(i2, d(), b0.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/list/ChallengesOverviewListScreenContract$Event;)V", i, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, new g(rd0.e.b(this.O.f52707c), 1), null, new cyc.c(i2, d(), b0.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/list/ChallengesOverviewListScreenContract$Event;)V", i, 22), 3);
        RowDelegate rowDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, new g(rd0.e.b(rowDelegate.f53218h), 2), null, new cyc.c(2, d(), b0.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/list/ChallengesOverviewListScreenContract$Event;)V", 4, 23), 3);
        int i3 = 4;
        int i5 = 2;
        com.revolut.kompot.navigable.a.g2(this, new g(rd0.e.b(rowDelegate.f53220l), 3), null, new cyc.c(i5, d(), b0.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/list/ChallengesOverviewListScreenContract$Event;)V", i3, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, new g(rd0.e.b(this.Q.f), 4), null, new cyc.c(i5, d(), b0.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/list/ChallengesOverviewListScreenContract$Event;)V", i3, 25), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b0 d() {
        return (b0) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
