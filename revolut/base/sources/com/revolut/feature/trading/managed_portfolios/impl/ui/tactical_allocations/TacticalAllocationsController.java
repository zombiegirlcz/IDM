package com.revolut.feature.trading.managed_portfolios.impl.ui.tactical_allocations;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.tactical_allocations.TacticalAllocationsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ot1.p;
import ox5.r;
import p0l.d;
import p8f.b;
import p8f.f;
import p8f.g;
import te0.w;
import vc.s;
import w5f.b0;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/tactical_allocations/TacticalAllocationsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lp8f/g;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TacticalAllocationsController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TacticalAllocationsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final RowLoadingDelegate O;
    public final RowDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;

    public TacticalAllocationsController(TacticalAllocationsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = w.y0(new p(this, inputData, 20));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: p8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TacticalAllocationsController f234148b;

            {
                this.f234148b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TacticalAllocationsController.S;
                        return (f) ((b0) this.f234148b.M.getValue()).f295119c.get();
                    default:
                        KProperty[] kPropertyArr2 = TacticalAllocationsController.S;
                        TacticalAllocationsController tacticalAllocationsController = this.f234148b;
                        return dli.f.a(tacticalAllocationsController, (f) tacticalAllocationsController.N.getValue(), v.k(tacticalAllocationsController.P, tacticalAllocationsController.O, tacticalAllocationsController.Q), 0, null, null, null, 60);
                }
            }
        });
        this.O = new RowLoadingDelegate();
        this.P = new RowDelegate(null, null, 7);
        this.Q = new FullScreenStateDelegate();
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: p8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TacticalAllocationsController f234148b;

            {
                this.f234148b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TacticalAllocationsController.S;
                        return (f) ((b0) this.f234148b.M.getValue()).f295119c.get();
                    default:
                        KProperty[] kPropertyArr2 = TacticalAllocationsController.S;
                        TacticalAllocationsController tacticalAllocationsController = this.f234148b;
                        return dli.f.a(tacticalAllocationsController, (f) tacticalAllocationsController.N.getValue(), v.k(tacticalAllocationsController.P, tacticalAllocationsController.O, tacticalAllocationsController.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wealth_robo_template_details_allocation_updates_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_robo_template_details_allocation_updates_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new d(this, continuation, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, new p73.d(rd0.e.b(this.P.f53218h), 3), null, new r(this, continuation, 15), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new p8f.d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
