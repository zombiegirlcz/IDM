package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.hub;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.hub.DebtsV2HubController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.z1;
import e58.d;
import e94.b;
import e94.c;
import e94.f;
import e94.i;
import e94.l;
import e94.n;
import e94.p;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/hub/DebtsV2HubController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Le94/i;", "Ldli/a;", "Le94/q;", "Companion", "a", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DebtsV2HubController extends PluginScreenController<i> implements a {
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final FullScreenStateDelegate Q;
    public final Object R;
    public final Object S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(DebtsV2HubController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.hub.DebtsV2HubController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public DebtsV2HubController(DebtsV2HubScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = w.y0(new d(this, inputData, 7));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: e94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtsV2HubController f123903b;

            {
                this.f123903b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DebtsV2HubController debtsV2HubController = this.f123903b;
                switch (i2) {
                    case 0:
                        DebtsV2HubController.Companion companion = DebtsV2HubController.INSTANCE;
                        return (l) ((z1) debtsV2HubController.N.getValue()).f120266c.get();
                    case 1:
                        DebtsV2HubController.Companion companion2 = DebtsV2HubController.INSTANCE;
                        DebtsV2HubController debtsV2HubController2 = this.f123903b;
                        return dli.f.a(debtsV2HubController2, debtsV2HubController2.d(), v.k(debtsV2HubController2.Q, (SwipeToActionDelegate) debtsV2HubController2.S.getValue(), (RowDelegate) debtsV2HubController2.R.getValue(), new RowLoadingDelegate(), new FullScreenStateLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        DebtsV2HubController.Companion companion3 = DebtsV2HubController.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) debtsV2HubController.R.getValue(), false);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: e94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtsV2HubController f123903b;

            {
                this.f123903b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DebtsV2HubController debtsV2HubController = this.f123903b;
                switch (i22) {
                    case 0:
                        DebtsV2HubController.Companion companion = DebtsV2HubController.INSTANCE;
                        return (l) ((z1) debtsV2HubController.N.getValue()).f120266c.get();
                    case 1:
                        DebtsV2HubController.Companion companion2 = DebtsV2HubController.INSTANCE;
                        DebtsV2HubController debtsV2HubController2 = this.f123903b;
                        return dli.f.a(debtsV2HubController2, debtsV2HubController2.d(), v.k(debtsV2HubController2.Q, (SwipeToActionDelegate) debtsV2HubController2.S.getValue(), (RowDelegate) debtsV2HubController2.R.getValue(), new RowLoadingDelegate(), new FullScreenStateLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        DebtsV2HubController.Companion companion3 = DebtsV2HubController.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) debtsV2HubController.R.getValue(), false);
                }
            }
        });
        this.Q = new FullScreenStateDelegate();
        this.R = w.y0(new e18.i(23));
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: e94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DebtsV2HubController f123903b;

            {
                this.f123903b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DebtsV2HubController debtsV2HubController = this.f123903b;
                switch (i22) {
                    case 0:
                        DebtsV2HubController.Companion companion = DebtsV2HubController.INSTANCE;
                        return (l) ((z1) debtsV2HubController.N.getValue()).f120266c.get();
                    case 1:
                        DebtsV2HubController.Companion companion2 = DebtsV2HubController.INSTANCE;
                        DebtsV2HubController debtsV2HubController2 = this.f123903b;
                        return dli.f.a(debtsV2HubController2, debtsV2HubController2.d(), v.k(debtsV2HubController2.Q, (SwipeToActionDelegate) debtsV2HubController2.S.getValue(), (RowDelegate) debtsV2HubController2.R.getValue(), new RowLoadingDelegate(), new FullScreenStateLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        DebtsV2HubController.Companion companion3 = DebtsV2HubController.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) debtsV2HubController.R.getValue(), false);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e94.q uiState = (e94.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (uiState instanceof p) {
            NavBarWithToolbar navBarWithToolbar = d3().f174565c;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            d3().f174564b.setEnabled(false);
            return;
        }
        if (!(uiState instanceof n)) {
            if (!(uiState instanceof e94.o)) {
                throw new NoWhenBranchMatchedException();
            }
            d3().f174565c.l0();
            d3().f174564b.setEnabled(false);
            return;
        }
        NavBarWithToolbar navBarWithToolbar2 = d3().f174565c;
        navBarWithToolbar2.l0();
        n nVar = (n) uiState;
        TextLocalisedClause textLocalisedClause = nVar.f123913a;
        navBarWithToolbar2.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar2.setTitle(textLocalisedClause, null);
        navBarWithToolbar2.setDescriptionText(nVar.f123914b);
        navBarWithToolbar2.setDescriptionVisible(true);
        d3().f174564b.setText(nVar.f123915c);
        d3().f174564b.setEnabled(nVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z1) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f174564b.setLoadingButtonTag("LOADING_TAG_CONFIRM_DEBTS");
    }

    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.R.getValue()).f53218h), new e94.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new e94.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((SwipeToActionDelegate) this.S.getValue()).f), new f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
