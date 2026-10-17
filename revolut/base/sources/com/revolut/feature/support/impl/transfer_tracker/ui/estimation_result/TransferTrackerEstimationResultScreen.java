package com.revolut.feature.support.impl.transfer_tracker.ui.estimation_result;

import a15.d;
import aee.b;
import aee.f;
import aee.j;
import aee.k;
import aee.m;
import aee.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.support.impl.transfer_tracker.ui.estimation_result.TransferTrackerEstimationResultScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rde.g;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/estimation_result/TransferTrackerEstimationResultScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laee/k;", "Ldli/a;", "Laee/n;", "Companion", "a", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferTrackerEstimationResultScreen extends ViewController<k> implements a {
    public final int K;
    public final boolean L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final LargeActionButtonDelegate Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TransferTrackerEstimationResultScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.support.impl.transfer_tracker.ui.estimation_result.TransferTrackerEstimationResultScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TransferTrackerEstimationResultScreen(TransferTrackerEstimationResultScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = true;
        this.M = s.t(this, b.f);
        this.N = w.y0(new a07.b(this, inputData, 24));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: aee.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferTrackerEstimationResultScreen f3556b;

            {
                this.f3556b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TransferTrackerEstimationResultScreen.Companion companion = TransferTrackerEstimationResultScreen.INSTANCE;
                        return (m) ((rde.g) this.f3556b.N.getValue()).f253432g.get();
                    default:
                        TransferTrackerEstimationResultScreen.Companion companion2 = TransferTrackerEstimationResultScreen.INSTANCE;
                        TransferTrackerEstimationResultScreen transferTrackerEstimationResultScreen = this.f3556b;
                        return dli.f.a(transferTrackerEstimationResultScreen, transferTrackerEstimationResultScreen.R2(), v.k(transferTrackerEstimationResultScreen.P, new ListSubheaderDelegate(), new CounterTextDelegate(), new SimpleMediaDelegate(), transferTrackerEstimationResultScreen.Q), 0, null, null, null, 60);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        this.Q = new LargeActionButtonDelegate();
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: aee.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferTrackerEstimationResultScreen f3556b;

            {
                this.f3556b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TransferTrackerEstimationResultScreen.Companion companion = TransferTrackerEstimationResultScreen.INSTANCE;
                        return (m) ((rde.g) this.f3556b.N.getValue()).f253432g.get();
                    default:
                        TransferTrackerEstimationResultScreen.Companion companion2 = TransferTrackerEstimationResultScreen.INSTANCE;
                        TransferTrackerEstimationResultScreen transferTrackerEstimationResultScreen = this.f3556b;
                        return dli.f.a(transferTrackerEstimationResultScreen, transferTrackerEstimationResultScreen.R2(), v.k(transferTrackerEstimationResultScreen.P, new ListSubheaderDelegate(), new CounterTextDelegate(), new SimpleMediaDelegate(), transferTrackerEstimationResultScreen.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        j jVar = uiState.f3567b;
        TextLocalisedClause textLocalisedClause = jVar.f3562a;
        Clause clause = jVar.f3563b;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((g) this.N.getValue()).d.get()).d(v.k(new RowDelegate(null, null, 7), this.Q));
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(u.c(new TextNavBarMenuItem("MENU_ITEM_DONE", new TextLocalisedClause(R$string.common_action_done, null, null, 14), null, null, 12)));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(d3().f174539b.o.f57403b), 19), null, new f(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.P.f53226s, new aed.a(3))), null, new aee.g(2, R2(), m.class, "onActionClicked", "onActionClicked(Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/Action;)V", 4, 0), 3);
        LargeActionButtonDelegate largeActionButtonDelegate = this.Q;
        ViewController.P2(this, new d(rd0.e.b(largeActionButtonDelegate.d.f121375b), 21), new a0l.k(this, null, 29), 3);
        ViewController.P2(this, new d(rd0.e.b(largeActionButtonDelegate.d.f121375b), 20), new aee.h(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m R2() {
        return (m) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
