package com.revolut.feature.referrals.shared.ui.impl.ui.invites_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import eya.d;
import grl.k9;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import org.jetbrains.annotations.NotNull;
import rya.g;
import rya.i;
import rya.j;
import rya.k;
import rya.l;
import rya.n;
import rya.p;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import xki.e;
import yp0.v;
import yp0.y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrya/g;", "Ldli/a;", "Lrya/l;", "Lno/m;", "Companion", "a", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvitesListController extends ViewController<g> implements dli.a, m {
    public final h K;
    public final RowDelegate L;
    public final RowLoadingDelegate M;
    public final FullScreenStateDelegate N;
    public v O;
    public final k9 P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(InvitesListController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public InvitesListController(InvitesListContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, n.f);
        this.L = new RowDelegate(null, null, 7);
        this.M = new RowLoadingDelegate();
        this.N = new FullScreenStateDelegate();
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137502n;
        companion.getClass();
        AnalyticsProduct.Companion.a(k9Var);
        this.P = k9Var;
        this.Q = R$layout.screen_recycler_navbar_nextbutton;
        this.R = w.y0(new rxe.b(this, inputData, 3));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: rya.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvitesListController f258283b;

            {
                this.f258283b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        InvitesListController.Companion companion2 = InvitesListController.INSTANCE;
                        return (h) ((eya.d) this.f258283b.R.getValue()).f130621h.get();
                    default:
                        InvitesListController.Companion companion3 = InvitesListController.INSTANCE;
                        InvitesListController invitesListController = this.f258283b;
                        return dli.f.a(invitesListController, invitesListController.R2(), zhm.v.k(invitesListController.L, invitesListController.M, invitesListController.N, new CounterTextDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: rya.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvitesListController f258283b;

            {
                this.f258283b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        InvitesListController.Companion companion2 = InvitesListController.INSTANCE;
                        return (h) ((eya.d) this.f258283b.R.getValue()).f130621h.get();
                    default:
                        InvitesListController.Companion companion3 = InvitesListController.INSTANCE;
                        InvitesListController invitesListController = this.f258283b;
                        return dli.f.a(invitesListController, invitesListController.R2(), zhm.v.k(invitesListController.L, invitesListController.M, invitesListController.N, new CounterTextDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (((a) R2()).u) {
            NavBarWithToolbar navBarWithToolbar = d3().f174565c;
            Clause clauseB = uiState.b();
            if (clauseB != null) {
                navBarWithToolbar.setToolbarTitle(clauseB);
                navBarWithToolbar.setTitle(clauseB, null);
            }
            navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
            navBarWithToolbar.setTitleAutoSize(true);
            if (uiState instanceof k) {
                LargeActionButton goToButton = d3().f174564b;
                Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
                Clause clause = ((k) uiState).f258279a;
                goToButton.setVisibility(clause == null ? 8 : 0);
                if (clause != null) {
                    d3().f174564b.setText(clause);
                    return;
                }
                return;
            }
            if (uiState instanceof j) {
                LargeActionButton goToButton2 = d3().f174564b;
                Intrinsics.checkNotNullExpressionValue(goToButton2, "goToButton");
                goToButton2.setVisibility(8);
                return;
            } else {
                if (!(uiState instanceof i)) {
                    throw new NoWhenBranchMatchedException();
                }
                LargeActionButton goToButton3 = d3().f174564b;
                Intrinsics.checkNotNullExpressionValue(goToButton3, "goToButton");
                Clause clause2 = ((i) uiState).f258275b;
                goToButton3.setVisibility(clause2 == null ? 8 : 0);
                if (clause2 != null) {
                    d3().f174564b.setText(clause2);
                    return;
                }
                return;
            }
        }
        if (uiState instanceof k) {
            NavBarWithToolbar navBarWithToolbar2 = d3().f174565c;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "navBarWithToolbar");
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar2.I0(t3Var, false);
            LargeActionButton goToButton4 = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton4, "goToButton");
            goToButton4.setVisibility(8);
            return;
        }
        if (uiState instanceof j) {
            d3().f174565c.l0();
            LargeActionButton goToButton5 = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton5, "goToButton");
            goToButton5.setVisibility(8);
            return;
        }
        if (!(uiState instanceof i)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar navBarWithToolbar3 = d3().f174565c;
        navBarWithToolbar3.l0();
        i iVar = (i) uiState;
        Clause clause3 = iVar.f258275b;
        Clause clause4 = iVar.f258274a;
        if (clause4 != null) {
            navBarWithToolbar3.setToolbarTitle(clause4);
            navBarWithToolbar3.setTitle(clause4, null);
        }
        navBarWithToolbar3.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar3.setTitleAutoSize(true);
        LargeActionButton goToButton6 = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton6, "goToButton");
        goToButton6.setVisibility(clause3 == null ? 8 : 0);
        d3().f174564b.setText(clause3);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return new AnalyticsProduct.Retail(this.P);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        v vVar = this.O;
        if (vVar != null) {
            ((dli.c) this.T.getValue()).h().removeOnScrollListener(vVar);
        }
        this.O = null;
    }

    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new rya.o(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new rya.o(this, null, 1), 3);
        if (((a) R2()).u) {
            this.O = y.a(((dli.c) this.T.getValue()).h(), 5, false, new rrd.l(this, 26));
        }
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new rya.q(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final rya.h R2() {
        return (rya.h) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
