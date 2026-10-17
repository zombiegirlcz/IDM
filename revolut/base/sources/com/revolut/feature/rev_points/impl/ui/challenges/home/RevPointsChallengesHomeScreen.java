package com.revolut.feature.rev_points.impl.ui.challenges.home;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import ew1.d;
import ezb.c;
import ezb.f;
import ezb.i;
import ezb.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/challenges/home/RevPointsChallengesHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lezb/j;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsChallengesHomeScreen extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(RevPointsChallengesHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsChallengesHomeScreenBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final f R;
    public final Object S;
    public final Object T;

    public RevPointsChallengesHomeScreen(RevPointsChallengesHomeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_rev_points_challenges_home_screen;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: ezb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsChallengesHomeScreen f130921b;

            {
                this.f130921b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsChallengesHomeScreen revPointsChallengesHomeScreen = this.f130921b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsChallengesHomeScreen.U;
                        return n14.e.a(revPointsChallengesHomeScreen, revPointsChallengesHomeScreen.d());
                    case 1:
                        return new ContainerDelegate(v.k(revPointsChallengesHomeScreen.N, new RowLoadingDelegate(), revPointsChallengesHomeScreen.O, new ListSubheaderDelegate()), null, 6);
                    case 2:
                        return new z4l.j(7, u.c((ContainerDelegate) revPointsChallengesHomeScreen.P.getValue()), false);
                    default:
                        KProperty[] kPropertyArr2 = RevPointsChallengesHomeScreen.U;
                        return (h) ((zxb.h) revPointsChallengesHomeScreen.S.getValue()).f326156b.get();
                }
            }
        });
        this.M = s.t(this, ezb.b.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new FullScreenStateDelegate();
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: ezb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsChallengesHomeScreen f130921b;

            {
                this.f130921b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsChallengesHomeScreen revPointsChallengesHomeScreen = this.f130921b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsChallengesHomeScreen.U;
                        return n14.e.a(revPointsChallengesHomeScreen, revPointsChallengesHomeScreen.d());
                    case 1:
                        return new ContainerDelegate(v.k(revPointsChallengesHomeScreen.N, new RowLoadingDelegate(), revPointsChallengesHomeScreen.O, new ListSubheaderDelegate()), null, 6);
                    case 2:
                        return new z4l.j(7, u.c((ContainerDelegate) revPointsChallengesHomeScreen.P.getValue()), false);
                    default:
                        KProperty[] kPropertyArr2 = RevPointsChallengesHomeScreen.U;
                        return (h) ((zxb.h) revPointsChallengesHomeScreen.S.getValue()).f326156b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: ezb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsChallengesHomeScreen f130921b;

            {
                this.f130921b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsChallengesHomeScreen revPointsChallengesHomeScreen = this.f130921b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsChallengesHomeScreen.U;
                        return n14.e.a(revPointsChallengesHomeScreen, revPointsChallengesHomeScreen.d());
                    case 1:
                        return new ContainerDelegate(v.k(revPointsChallengesHomeScreen.N, new RowLoadingDelegate(), revPointsChallengesHomeScreen.O, new ListSubheaderDelegate()), null, 6);
                    case 2:
                        return new z4l.j(7, u.c((ContainerDelegate) revPointsChallengesHomeScreen.P.getValue()), false);
                    default:
                        KProperty[] kPropertyArr2 = RevPointsChallengesHomeScreen.U;
                        return (h) ((zxb.h) revPointsChallengesHomeScreen.S.getValue()).f326156b.get();
                }
            }
        });
        this.R = new f(this);
        this.S = te0.w.y0(new eq8.b(this, inputData, 18));
        final int i5 = 3;
        this.T = te0.w.y0(new Function0(this) { // from class: ezb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsChallengesHomeScreen f130921b;

            {
                this.f130921b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                RevPointsChallengesHomeScreen revPointsChallengesHomeScreen = this.f130921b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsChallengesHomeScreen.U;
                        return n14.e.a(revPointsChallengesHomeScreen, revPointsChallengesHomeScreen.d());
                    case 1:
                        return new ContainerDelegate(v.k(revPointsChallengesHomeScreen.N, new RowLoadingDelegate(), revPointsChallengesHomeScreen.O, new ListSubheaderDelegate()), null, 6);
                    case 2:
                        return new z4l.j(7, u.c((ContainerDelegate) revPointsChallengesHomeScreen.P.getValue()), false);
                    default:
                        KProperty[] kPropertyArr2 = RevPointsChallengesHomeScreen.U;
                        return (h) ((zxb.h) revPointsChallengesHomeScreen.S.getValue()).f326156b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ((z4l.j) this.Q.getValue()).c(uiState.f130925a);
        Tabs tabs = d3().d;
        List<com.revolut.core.ui_kit.views.q> list = uiState.f130926b;
        i iVar = uiState.f130927c;
        tabs.setItems(list, iVar.name());
        d3().f300811c.setCurrentItem(iVar.b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zxb.h) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f300810b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_points_challenge_v3_home, u.c(new TextLocalisedClause(R$string.rev_points_challenge_title, null, null, 14)), null, 12);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f300811c.setAdapter((z4l.j) this.Q.getValue());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        d3().f300811c.unregisterOnPageChangeCallback(this.R);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f300810b.f59410q), null, new ev7.b(this, continuation, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f58882b), null, new d(this, continuation, 13), 3);
        RowDelegate rowDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new ezb.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53220l), null, new ezb.e(this, null), 3);
        d3().f300811c.registerOnPageChangeCallback(this.R);
    }

    public final wxb.b d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wxb.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ezb.h d() {
        return (ezb.h) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.L.getValue();
    }
}
