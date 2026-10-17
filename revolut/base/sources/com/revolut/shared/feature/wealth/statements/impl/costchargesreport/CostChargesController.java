package com.revolut.shared.feature.wealth.statements.impl.costchargesreport;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.wealth.statements.impl.costchargesreport.CostChargesController;
import dli.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m9d.y0;
import mfl.b;
import mfl.c;
import mfl.i;
import mfl.l;
import mfl.m;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/statements/impl/costchargesreport/CostChargesController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lmfl/m;", "feature_shared_wealth_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CostChargesController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CostChargesController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;
    public final Lazy Q;

    public CostChargesController(i inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, c.f);
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: mfl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CostChargesController f205020b;

            {
                this.f205020b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CostChargesController costChargesController = this.f205020b;
                switch (i2) {
                    case 0:
                        ViewBinding value = costChargesController.K.getValue(costChargesController, CostChargesController.R[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.m) value).f174539b;
                    case 1:
                        KProperty[] kPropertyArr = CostChargesController.R;
                        return (o) ((rfl.a) costChargesController.N.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr2 = CostChargesController.R;
                        CostChargesController costChargesController2 = this.f205020b;
                        return dli.f.a(costChargesController2, (o) costChargesController2.O.getValue(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) costChargesController2.M.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.M = w.y0(new b(0));
        this.N = w.y0(new ltf.b(this, inputData, 29));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mfl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CostChargesController f205020b;

            {
                this.f205020b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CostChargesController costChargesController = this.f205020b;
                switch (i22) {
                    case 0:
                        ViewBinding value = costChargesController.K.getValue(costChargesController, CostChargesController.R[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.m) value).f174539b;
                    case 1:
                        KProperty[] kPropertyArr = CostChargesController.R;
                        return (o) ((rfl.a) costChargesController.N.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr2 = CostChargesController.R;
                        CostChargesController costChargesController2 = this.f205020b;
                        return dli.f.a(costChargesController2, (o) costChargesController2.O.getValue(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) costChargesController2.M.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar;
        final int i3 = 2;
        this.Q = j.b(new Function0(this) { // from class: mfl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CostChargesController f205020b;

            {
                this.f205020b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CostChargesController costChargesController = this.f205020b;
                switch (i22) {
                    case 0:
                        ViewBinding value = costChargesController.K.getValue(costChargesController, CostChargesController.R[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.m) value).f174539b;
                    case 1:
                        KProperty[] kPropertyArr = CostChargesController.R;
                        return (o) ((rfl.a) costChargesController.N.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr2 = CostChargesController.R;
                        CostChargesController costChargesController2 = this.f205020b;
                        return dli.f.a(costChargesController2, (o) costChargesController2.O.getValue(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) costChargesController2.M.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.L.getValue();
        l lVar = uiState.f205033b;
        navBarWithToolbar.setTitle(lVar.f205030a, null);
        navBarWithToolbar.setDescriptionText(lVar.f205031b);
        navBarWithToolbar.setDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rfl.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (mfl.o) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((NavBarWithToolbar) this.L.getValue()).setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(w.a0(((RowDelegate) this.M.getValue()).f53218h, new md0.c(19))), new m75.i(this, null, 21), 3);
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) this.L.getValue()).f59410q), new y0(this, null, 10), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.P;
    }

    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
