package com.revolut.feature.statements.impl.ui.documents_hub;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.m6;
import aw0.n6;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import tki.c;
import vc.s;
import zt4.l;
import zzd.g;
import zzd.i;
import zzd.j;
import zzd.m;
import zzd.n;
import zzd.p;
import zzd.r;
import zzd.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/documents_hub/DocumentsHubScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lzzd/t;", "Lno/k;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentsHubScreen extends ViewController<q> implements c, k {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(DocumentsHubScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public AnalyticsContext K;
    public final h L;
    public final RowDelegate M;
    public final TabsDelegate N;
    public final FullScreenStateDelegate O;
    public final InputTextDelegate P;
    public final CellDetailsActionDelegate Q;
    public final CellDetailsSwitcherDelegate R;
    public final CellDetailsDelegate S;
    public final LargeActionButtonDelegate T;
    public final int U;
    public final Object V;
    public final Object W;
    public final Object X;

    public DocumentsHubScreen(DocumentsHubScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = s.t(this, g.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new TabsDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = new InputTextDelegate(null);
        this.Q = new CellDetailsActionDelegate();
        this.R = new CellDetailsSwitcherDelegate();
        this.S = new CellDetailsDelegate();
        this.T = new LargeActionButtonDelegate();
        this.U = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: zzd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsHubScreen f326678b;

            {
                this.f326678b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DocumentsHubScreen documentsHubScreen = this.f326678b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsHubScreen.Y;
                        qji.b bVarU2 = documentsHubScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.documents_hub.di.DocumentsHubScreenInjector");
                        eyd.r rVar = (eyd.r) bVarU2;
                        return new eyd.t(rVar.f130819b, rVar.f130820c, documentsHubScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsHubScreen.Y;
                        return (s) ((eyd.t) documentsHubScreen.V.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = DocumentsHubScreen.Y;
                        DocumentsHubScreen documentsHubScreen2 = this.f326678b;
                        return tki.g.a(documentsHubScreen2, documentsHubScreen2.d(), zhm.v.k(new RowLoadingDelegate(), new FixedTabsLoadingDelegate(), new CellDetailsLoadingDelegate(), documentsHubScreen2.O, new ListSubheaderDelegate(), documentsHubScreen2.M, documentsHubScreen2.P, documentsHubScreen2.Q, documentsHubScreen2.R, documentsHubScreen2.S, documentsHubScreen2.N, documentsHubScreen2.T, new FooterTextDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: zzd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsHubScreen f326678b;

            {
                this.f326678b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DocumentsHubScreen documentsHubScreen = this.f326678b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsHubScreen.Y;
                        qji.b bVarU2 = documentsHubScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.documents_hub.di.DocumentsHubScreenInjector");
                        eyd.r rVar = (eyd.r) bVarU2;
                        return new eyd.t(rVar.f130819b, rVar.f130820c, documentsHubScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsHubScreen.Y;
                        return (s) ((eyd.t) documentsHubScreen.V.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = DocumentsHubScreen.Y;
                        DocumentsHubScreen documentsHubScreen2 = this.f326678b;
                        return tki.g.a(documentsHubScreen2, documentsHubScreen2.d(), zhm.v.k(new RowLoadingDelegate(), new FixedTabsLoadingDelegate(), new CellDetailsLoadingDelegate(), documentsHubScreen2.O, new ListSubheaderDelegate(), documentsHubScreen2.M, documentsHubScreen2.P, documentsHubScreen2.Q, documentsHubScreen2.R, documentsHubScreen2.S, documentsHubScreen2.N, documentsHubScreen2.T, new FooterTextDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i3 = 2;
        this.X = w.y0(new Function0(this) { // from class: zzd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsHubScreen f326678b;

            {
                this.f326678b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DocumentsHubScreen documentsHubScreen = this.f326678b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsHubScreen.Y;
                        qji.b bVarU2 = documentsHubScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.documents_hub.di.DocumentsHubScreenInjector");
                        eyd.r rVar = (eyd.r) bVarU2;
                        return new eyd.t(rVar.f130819b, rVar.f130820c, documentsHubScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsHubScreen.Y;
                        return (s) ((eyd.t) documentsHubScreen.V.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = DocumentsHubScreen.Y;
                        DocumentsHubScreen documentsHubScreen2 = this.f326678b;
                        return tki.g.a(documentsHubScreen2, documentsHubScreen2.d(), zhm.v.k(new RowLoadingDelegate(), new FixedTabsLoadingDelegate(), new CellDetailsLoadingDelegate(), documentsHubScreen2.O, new ListSubheaderDelegate(), documentsHubScreen2.M, documentsHubScreen2.P, documentsHubScreen2.Q, documentsHubScreen2.R, documentsHubScreen2.S, documentsHubScreen2.N, documentsHubScreen2.T, new FooterTextDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        AnalyticsContext analyticsContext = uiState.f;
        r rVar = uiState.d;
        Clause clause = uiState.f326694b;
        this.K = analyticsContext;
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setAnalyticsContext(uiState.f);
        Clause clause2 = uiState.f326693a;
        if (clause2 != null) {
            navBarWithToolbar.setToolbarTitle(clause2);
        }
        if (uiState.e) {
            navBarWithToolbar.H0(false);
            navBarWithToolbar.setTitle(clause2, null);
            navBarWithToolbar.setDescriptionVisible(false);
            navBarWithToolbar.setSecondDescriptionText(clause);
            navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        } else {
            navBarWithToolbar.j0(false);
        }
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        screenRecyclerNavbarActionFooterActionFooterView.setVisibility(rVar == null ? 8 : 0);
        if (rVar != null) {
            d3().f174533b.setModel(new e(false, rVar.f326692b, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.statement_action_generate, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, rVar.f326691a, uiState.f, null, null, 924), null, null, 53));
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.K = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (eyd.t) this.V.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF94770a0() {
        return this.K;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new zzd.h(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53515c.f121375b), new l(this, continuation, 17), 3);
        RowDelegate rowDelegate = this.M;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53220l), new zzd.k(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52575g.f121375b), new zzd.l(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f51912c), new n(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f), new zzd.o(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.d.f121375b), new p(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new zzd.h(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new i(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.L.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final zzd.s R2() {
        return (zzd.s) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.X.getValue();
    }
}
