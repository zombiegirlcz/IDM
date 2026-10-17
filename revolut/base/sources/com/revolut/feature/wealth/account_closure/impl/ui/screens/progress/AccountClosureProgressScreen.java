package com.revolut.feature.wealth.account_closure.impl.ui.screens.progress;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.progress.AccountClosureProgressScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vkm.d;
import wrj.m;
import wug.b;
import wug.c;
import wug.f;
import xki.e;
import yy0.j;
import z0h.s1;
import zhm.v;
import ztg.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/progress/AccountClosureProgressScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwug/f;", "Lz0h/s1;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountClosureProgressScreen extends ViewController<q> implements a, s1 {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AccountClosureProgressScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final TextDelegate N;
    public final CellDetailsChevronDelegate O;
    public final Object P;
    public final Object Q;

    public AccountClosureProgressScreen(AccountClosureProgressScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = w.y0(new m(this, inputData, 4));
        this.N = new TextDelegate();
        this.O = new CellDetailsChevronDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: wug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureProgressScreen f300130b;

            {
                this.f300130b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = AccountClosureProgressScreen.R;
                        return (e) ((ztg.i) this.f300130b.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr2 = AccountClosureProgressScreen.R;
                        AccountClosureProgressScreen accountClosureProgressScreen = this.f300130b;
                        return dli.f.a(accountClosureProgressScreen, (e) accountClosureProgressScreen.P.getValue(), v.k(accountClosureProgressScreen.N, new ProgressStepVerticalDelegate(), accountClosureProgressScreen.O, new FullScreenStateLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: wug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureProgressScreen f300130b;

            {
                this.f300130b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountClosureProgressScreen.R;
                        return (e) ((ztg.i) this.f300130b.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr2 = AccountClosureProgressScreen.R;
                        AccountClosureProgressScreen accountClosureProgressScreen = this.f300130b;
                        return dli.f.a(accountClosureProgressScreen, (e) accountClosureProgressScreen.P.getValue(), v.k(accountClosureProgressScreen.N, new ProgressStepVerticalDelegate(), accountClosureProgressScreen.O, new FullScreenStateLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f300134a;
        Clause clause2 = uiState.f300135b;
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        Image image = uiState.f300136c;
        if (image != null) {
            navBarWithToolbar.setEndImage(new j(image));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (wug.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new wkg.e(this, null, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f51821c), null, new c(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // z0h.s1
    public final d r() {
        return rd0.e.b(this.N.d);
    }
}
