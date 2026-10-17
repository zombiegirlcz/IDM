package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.TransferProgressScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import h1h.f;
import hbf.g;
import hbf.n;
import hbf.p;
import hbf.r;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nz8.d;
import te0.w;
import tki.c;
import tx0.t3;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_progress/screen/TransferProgressScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lhbf/s;", "Lh1h/f;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferProgressScreen extends ViewController<q> implements c, f {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(TransferProgressScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final FullScreenStateDelegate L;
    public final int M;
    public final Object N;
    public final Object O;
    public final CellDetailsDelegate P;
    public final CellDetailsActionDelegate Q;
    public final CellDetailsChevronDelegate R;
    public final RowDelegate S;
    public final ListSubheaderDelegate T;
    public final Object U;

    public TransferProgressScreen(String transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        this.K = s.t(this, hbf.c.f);
        this.L = new FullScreenStateDelegate();
        this.M = R$layout.screen_recycler_navbar;
        this.N = w.y0(new h1k.a(this, transferId, 14));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: hbf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferProgressScreen f150655b;

            {
                this.f150655b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TransferProgressScreen.V;
                        return (n) ((l9f.r) this.f150655b.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr2 = TransferProgressScreen.V;
                        TransferProgressScreen transferProgressScreen = this.f150655b;
                        return tki.g.a(transferProgressScreen, transferProgressScreen.R2(), zhm.v.k(new ProgressStepVerticalLoadingV2Delegate(), new ProgressStepVerticalV2Delegate(), transferProgressScreen.L, transferProgressScreen.P, transferProgressScreen.T, new RowLoadingDelegate(), transferProgressScreen.S, new CellDetailsLoadingDelegate(), transferProgressScreen.Q, transferProgressScreen.R), 0, null, null, null, 60);
                }
            }
        });
        this.P = new CellDetailsDelegate();
        this.Q = new CellDetailsActionDelegate();
        this.R = new CellDetailsChevronDelegate();
        this.S = new RowDelegate(null, null, 7);
        this.T = new ListSubheaderDelegate();
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: hbf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferProgressScreen f150655b;

            {
                this.f150655b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferProgressScreen.V;
                        return (n) ((l9f.r) this.f150655b.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr2 = TransferProgressScreen.V;
                        TransferProgressScreen transferProgressScreen = this.f150655b;
                        return tki.g.a(transferProgressScreen, transferProgressScreen.R2(), zhm.v.k(new ProgressStepVerticalLoadingV2Delegate(), new ProgressStepVerticalV2Delegate(), transferProgressScreen.L, transferProgressScreen.P, transferProgressScreen.T, new RowLoadingDelegate(), transferProgressScreen.S, new CellDetailsLoadingDelegate(), transferProgressScreen.Q, transferProgressScreen.R), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        hbf.s uiState = (hbf.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setFilters(uiState.f150678c);
        r rVar = uiState.f150676a;
        if (Intrinsics.f(rVar, p.f150674a)) {
            navBarWithToolbar.I0(t3.PROFILE, false);
            return;
        }
        if (Intrinsics.f(rVar, hbf.q.f150675a)) {
            navBarWithToolbar.l0();
            navBarWithToolbar.j0(false);
            navBarWithToolbar.setTitle(null, null);
            navBarWithToolbar.setDescriptionVisible(false);
            navBarWithToolbar.setSecondDescriptionVisible(false);
            return;
        }
        if (!(rVar instanceof hbf.o)) {
            throw new NoWhenBranchMatchedException();
        }
        navBarWithToolbar.l0();
        navBarWithToolbar.H0(false);
        hbf.o oVar2 = (hbf.o) rVar;
        Clause clause = oVar2.f150673c;
        navBarWithToolbar.setTitle(oVar2.f150671a, null);
        navBarWithToolbar.setDescriptionText(oVar2.f150672b);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        Image image = oVar2.d;
        if (image != null) {
            navBarWithToolbar.setEndImage(d.L(image));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l9f.r) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new gqh.o(this, null, 28), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.s0()), new hbf.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new hbf.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f51780c), new hbf.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.e), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f51821c), new hbf.h(this, null), 3);
    }

    @Override // f1h.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final RowDelegate getS() {
        return this.S;
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    @Override // h1h.f
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final ListSubheaderDelegate getT() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.U.getValue();
    }
}
