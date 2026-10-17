package com.revolut.feature.freelancer.impl.ui.perks.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.freelancer.impl.R$id;
import com.revolut.feature.freelancer.impl.R$layout;
import com.revolut.feature.freelancer.impl.ui.perks.details.FreelancerPerksDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tz6.b;
import tz6.c;
import tz6.d;
import tz6.g;
import tz6.i;
import tz6.j;
import us6.f0;
import vc.s;
import xki.e;
import z92.f;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/perks/details/FreelancerPerksDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ltz6/j;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerPerksDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(FreelancerPerksDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/freelancer/impl/databinding/ScreenProPerksDetailsBinding;", 0))};
    public final int K;
    public final h L;
    public final FullScreenStateDelegate M;
    public final TextDelegate N;
    public final PlainTextDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public FreelancerPerksDetailsScreen(FreelancerPerksDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_pro_perks_details;
        this.L = s.t(this, b.f);
        this.M = new FullScreenStateDelegate();
        this.N = new TextDelegate();
        this.O = new PlainTextDelegate();
        this.P = w.y0(new tml.a(this, inputData, 29));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: tz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPerksDetailsScreen f275871b;

            {
                this.f275871b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPerksDetailsScreen.S;
                        return (i) ((f0) this.f275871b.P.getValue()).f282537c.get();
                    default:
                        KProperty[] kPropertyArr2 = FreelancerPerksDetailsScreen.S;
                        FreelancerPerksDetailsScreen freelancerPerksDetailsScreen = this.f275871b;
                        return dli.f.a(freelancerPerksDetailsScreen, freelancerPerksDetailsScreen.R2(), v.k(freelancerPerksDetailsScreen.M, freelancerPerksDetailsScreen.O, freelancerPerksDetailsScreen.N, new CellDetailsLoadingDelegate(), new ListCellBulletDelegate(), new ListSubheaderDelegate(), new PlainTextLoadingDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: tz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPerksDetailsScreen f275871b;

            {
                this.f275871b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPerksDetailsScreen.S;
                        return (i) ((f0) this.f275871b.P.getValue()).f282537c.get();
                    default:
                        KProperty[] kPropertyArr2 = FreelancerPerksDetailsScreen.S;
                        FreelancerPerksDetailsScreen freelancerPerksDetailsScreen = this.f275871b;
                        return dli.f.a(freelancerPerksDetailsScreen, freelancerPerksDetailsScreen.R2(), v.k(freelancerPerksDetailsScreen.M, freelancerPerksDetailsScreen.O, freelancerPerksDetailsScreen.N, new CellDetailsLoadingDelegate(), new ListCellBulletDelegate(), new ListSubheaderDelegate(), new PlainTextLoadingDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithBigTile screenRecyclerNavbarBigTitleNextbuttonNavBar = d3().f257033b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarBigTitleNextbuttonNavBar, "screenRecyclerNavbarBigTitleNextbuttonNavBar");
        f.u(screenRecyclerNavbarBigTitleNextbuttonNavBar, uiState.f275879b);
        d3().f257033b.setLoadingState(uiState.d);
        TwinVerticalButton twinVerticalButton = d3().f257034c;
        g gVar = uiState.f275880c;
        Clause clause = gVar.d;
        twinVerticalButton.setMainButtonVisible(clause != null);
        twinVerticalButton.setMainButtonEnabled(gVar.f);
        twinVerticalButton.setMainButtonText(clause);
        AnalyticsContext analyticsContext = gVar.e;
        if (analyticsContext != null) {
            twinVerticalButton.setMainButtonAnalyticsContext(new AnalyticsContext(analyticsContext.f50296a));
        }
        twinVerticalButton.setSecondaryButtonVisible(gVar.f275874b);
        twinVerticalButton.setSecondaryButtonText(gVar.f275873a);
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        AnalyticsContext analyticsContext2 = gVar.f275875c;
        if (analyticsContext2 != null) {
            twinVerticalButton.setSecondaryButtonAnalyticsContext(new AnalyticsContext(analyticsContext2.f50296a));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f257033b.f59357t), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new tz6.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f257034c.o0()), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f257034c.p0()), new c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.O.f.f121375b), new tz6.f(this, null), 3);
    }

    public final rs6.f d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rs6.f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
