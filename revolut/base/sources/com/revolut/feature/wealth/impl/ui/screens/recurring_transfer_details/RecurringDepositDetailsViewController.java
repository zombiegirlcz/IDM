package com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.RecurringDepositDetailsViewController;
import com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.RecurringDepositDetailsViewControllerContract$Input;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import efm.r;
import grl.k9;
import h1h.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import tcg.a0;
import tch.d0;
import tch.e0;
import tch.p;
import tch.t;
import te0.w;
import tki.c;
import tx0.t3;
import vc.s;
import xki.e;
import z9h.i;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/recurring_transfer_details/RecurringDepositDetailsViewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltch/t;", "Ltki/c;", "Ltch/e0;", "Lno/m;", "Lh1h/f;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringDepositDetailsViewController extends ViewController<t> implements c, m, f {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(RecurringDepositDetailsViewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final RecurringDepositDetailsViewControllerContract$Input K;
    public final AnalyticsProduct.Retail L;
    public final Object M;
    public final int N;
    public final h O;
    public final boolean P;
    public final RowDelegate Q;
    public final ListSubheaderDelegate R;
    public final CellDetailsActionDelegate S;
    public final ActionsDelegate T;
    public final TwinHorizontalButtonDelegate U;
    public final CellDetailsChevronDelegate V;
    public final Object W;

    public RecurringDepositDetailsViewController(RecurringDepositDetailsViewControllerContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137500l;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: tch.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringDepositDetailsViewController f269839b;

            {
                this.f269839b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringDepositDetailsViewController.X;
                        RecurringDepositDetailsViewController recurringDepositDetailsViewController = this.f269839b;
                        hf0.a aVarJ = ue0.e.j(recurringDepositDetailsViewController.m2());
                        RecurringDepositDetailsViewControllerContract$Input recurringDepositDetailsViewControllerContract$Input = recurringDepositDetailsViewController.K;
                        if (l.f269840a[recurringDepositDetailsViewControllerContract$Input.f95637b.ordinal()] != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gpc.a aVar = (gpc.a) ue0.e.h(aVarJ, ykc.b.class);
                        qji.b bVarR1 = recurringDepositDetailsViewController.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.di.RecurringDepositDetailsViewControllerInjector");
                        z9h.j jVar = (z9h.j) bVarR1;
                        return new z9h.i(jVar.f320452b, jVar.f320453c, recurringDepositDetailsViewController, recurringDepositDetailsViewController, recurringDepositDetailsViewControllerContract$Input, aVar, new v1h.a(recurringDepositDetailsViewController.V));
                    default:
                        KProperty[] kPropertyArr2 = RecurringDepositDetailsViewController.X;
                        RecurringDepositDetailsViewController recurringDepositDetailsViewController2 = this.f269839b;
                        return tki.g.a(recurringDepositDetailsViewController2, recurringDepositDetailsViewController2.R2(), zhm.v.k(new CellDetailsLoadingDelegate(), recurringDepositDetailsViewController2.S, recurringDepositDetailsViewController2.T, recurringDepositDetailsViewController2.V, new CellDetailsNoteDelegate(), new CellDetailsDelegate(), recurringDepositDetailsViewController2.Q, recurringDepositDetailsViewController2.R, new RowLoadingDelegate(), new PlainTextWarningDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, tch.m.f);
        this.P = true;
        this.Q = new RowDelegate(null, null, 7);
        this.R = new ListSubheaderDelegate();
        this.S = new CellDetailsActionDelegate();
        this.T = new ActionsDelegate();
        this.U = new TwinHorizontalButtonDelegate();
        this.V = new CellDetailsChevronDelegate();
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: tch.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringDepositDetailsViewController f269839b;

            {
                this.f269839b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringDepositDetailsViewController.X;
                        RecurringDepositDetailsViewController recurringDepositDetailsViewController = this.f269839b;
                        hf0.a aVarJ = ue0.e.j(recurringDepositDetailsViewController.m2());
                        RecurringDepositDetailsViewControllerContract$Input recurringDepositDetailsViewControllerContract$Input = recurringDepositDetailsViewController.K;
                        if (l.f269840a[recurringDepositDetailsViewControllerContract$Input.f95637b.ordinal()] != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gpc.a aVar = (gpc.a) ue0.e.h(aVarJ, ykc.b.class);
                        qji.b bVarR1 = recurringDepositDetailsViewController.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.di.RecurringDepositDetailsViewControllerInjector");
                        z9h.j jVar = (z9h.j) bVarR1;
                        return new z9h.i(jVar.f320452b, jVar.f320453c, recurringDepositDetailsViewController, recurringDepositDetailsViewController, recurringDepositDetailsViewControllerContract$Input, aVar, new v1h.a(recurringDepositDetailsViewController.V));
                    default:
                        KProperty[] kPropertyArr2 = RecurringDepositDetailsViewController.X;
                        RecurringDepositDetailsViewController recurringDepositDetailsViewController2 = this.f269839b;
                        return tki.g.a(recurringDepositDetailsViewController2, recurringDepositDetailsViewController2.R2(), zhm.v.k(new CellDetailsLoadingDelegate(), recurringDepositDetailsViewController2.S, recurringDepositDetailsViewController2.T, recurringDepositDetailsViewController2.V, new CellDetailsNoteDelegate(), new CellDetailsDelegate(), recurringDepositDetailsViewController2.Q, recurringDepositDetailsViewController2.R, new RowLoadingDelegate(), new PlainTextWarningDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e0 uiState = (e0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        d0 d0Var = uiState.f269822a;
        if (d0Var == null) {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            navBarWithToolbar.l0();
            navBarWithToolbar.setTitle(d0Var.f269818a, null);
            navBarWithToolbar.setDescriptionText(d0Var.f269819b);
            navBarWithToolbar.setEndIconImage(d0Var.f269820c);
            d3().f174539b.setFilters(d0Var.d);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.wealth_robo_portfolio_recurring_transfer_widget_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        ((j60.a) ((i) this.M.getValue()).f320441h.get()).d(u.c(this.U));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new t05.m(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(d3().f174539b.s0(), new a0(5))), null, new ryj.f(2, R2(), p.class, "handleParcel", "handleParcel(Lcom/revolut/feature/wealth/impl/ui/screens/recurring_transfer_details/RecurringDepositDetailsViewControllerContract$Parcel;)V", 4, 16), 3);
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, new t9l.f(rd0.e.b(this.S.d), 3), null, new ryj.f(i2, R2(), p.class, "handleParcel", "handleParcel(Lcom/revolut/feature/wealth/impl/ui/screens/recurring_transfer_details/RecurringDepositDetailsViewControllerContract$Parcel;)V", i, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, new t9l.f(rd0.e.b(this.T.f51611c.f121375b), 4), null, new ryj.f(i2, R2(), p.class, "handleParcel", "handleParcel(Lcom/revolut/feature/wealth/impl/ui/screens/recurring_transfer_details/RecurringDepositDetailsViewControllerContract$Parcel;)V", i, 18), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.U;
        r rVarMerge = r.merge(w.a0(twinHorizontalButtonDelegate.f53572c.f121375b, new a0(6)), w.a0(twinHorizontalButtonDelegate.d.f121375b, new a0(7)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new ryj.f(2, R2(), p.class, "handleParcel", "handleParcel(Lcom/revolut/feature/wealth/impl/ui/screens/recurring_transfer_details/RecurringDepositDetailsViewControllerContract$Parcel;)V", 4, 15), 3);
    }

    @Override // f1h.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final RowDelegate getM() {
        return this.Q;
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) ((i) this.M.getValue()).v.get();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    @Override // h1h.f
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final ListSubheaderDelegate getL() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
