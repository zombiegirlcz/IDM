package com.revolut.feature.junior_rewards.impl.ui.list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior_rewards.impl.ui.list.JuniorRewardsListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nm8.d;
import te0.w;
import tm8.b;
import tm8.c;
import tm8.g;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_rewards/impl/ui/list/JuniorRewardsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ltm8/h;", "feature_junior_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorRewardsListScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(JuniorRewardsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final FullScreenStateDelegate M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public JuniorRewardsListScreen(JuniorRewardsListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, b.f);
        this.M = new FullScreenStateDelegate();
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: tm8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorRewardsListScreen f272160b;

            {
                this.f272160b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorRewardsListScreen.R;
                        JuniorRewardsListScreen juniorRewardsListScreen = this.f272160b;
                        return dli.f.a(juniorRewardsListScreen, (g) juniorRewardsListScreen.Q.getValue(), v.k(new ListSubheaderDelegate(), juniorRewardsListScreen.M, juniorRewardsListScreen.N), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = JuniorRewardsListScreen.R;
                        return (g) ((nm8.d) this.f272160b.P.getValue()).f.get();
                }
            }
        });
        this.P = w.y0(new sw6.a(this, inputData, 28));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: tm8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorRewardsListScreen f272160b;

            {
                this.f272160b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorRewardsListScreen.R;
                        JuniorRewardsListScreen juniorRewardsListScreen = this.f272160b;
                        return dli.f.a(juniorRewardsListScreen, (g) juniorRewardsListScreen.Q.getValue(), v.k(new ListSubheaderDelegate(), juniorRewardsListScreen.M, juniorRewardsListScreen.N), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = JuniorRewardsListScreen.R;
                        return (g) ((nm8.d) this.f272160b.P.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        tm8.h uiState = (tm8.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        Clause clause = uiState.f272164a;
        Clause clause2 = uiState.f272166c;
        if (clause != null) {
            NavBarWithToolbar navBarWithToolbar = d3().f174565c;
            navBarWithToolbar.setTitle(clause, null);
            navBarWithToolbar.setToolbarTitle(clause);
        }
        d3().f174564b.setText(clause2);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(clause2 != null ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new tm8.d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new tm8.d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new tm8.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
