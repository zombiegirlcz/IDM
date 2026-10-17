package com.revolut.feature.transfer_reasons.impl.ui.search;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer_reasons.impl.ui.search.TransferReasonsSearchScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import h30.l;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import ky4.f;
import no.d1;
import nsf.t;
import ntf.c;
import ntf.d;
import ntf.m;
import ntf.n;
import ntf.r;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/ui/search/TransferReasonsSearchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lntf/m;", "Ldli/a;", "Lntf/n;", "Lno/d1;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferReasonsSearchScreen extends ViewController<m> implements a, d1 {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TransferReasonsSearchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final FullScreenStateDelegate O;
    public final RowDelegate P;
    public final SelectableDelegate Q;
    public final SingleChoiceDelegate R;
    public final h S;

    public TransferReasonsSearchScreen(TransferReasonsSearchScreenContract$InputData inputData, Flow selectedReasonsFlow) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(selectedReasonsFlow, "selectedReasonsFlow");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ntf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsSearchScreen f219018b;

            {
                this.f219018b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsSearchScreen.T;
                        TransferReasonsSearchScreen transferReasonsSearchScreen = this.f219018b;
                        return dli.f.a(transferReasonsSearchScreen, transferReasonsSearchScreen.R2(), v.k(transferReasonsSearchScreen.O, transferReasonsSearchScreen.P, transferReasonsSearchScreen.Q, transferReasonsSearchScreen.R), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TransferReasonsSearchScreen.T;
                        nsf.t tVar = (nsf.t) this.f219018b.M.getValue();
                        switch (tVar.f218857a) {
                            case 0:
                                return (r) tVar.f.get();
                            default:
                                return (r) tVar.f.get();
                        }
                }
            }
        });
        this.M = w.y0(new f(this, 16, inputData, selectedReasonsFlow));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ntf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsSearchScreen f219018b;

            {
                this.f219018b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsSearchScreen.T;
                        TransferReasonsSearchScreen transferReasonsSearchScreen = this.f219018b;
                        return dli.f.a(transferReasonsSearchScreen, transferReasonsSearchScreen.R2(), v.k(transferReasonsSearchScreen.O, transferReasonsSearchScreen.P, transferReasonsSearchScreen.Q, transferReasonsSearchScreen.R), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TransferReasonsSearchScreen.T;
                        nsf.t tVar = (nsf.t) this.f219018b.M.getValue();
                        switch (tVar.f218857a) {
                            case 0:
                                return (r) tVar.f.get();
                            default:
                                return (r) tVar.f.get();
                        }
                }
            }
        });
        this.O = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new SelectableDelegate(rowDelegate);
        this.R = new SingleChoiceDelegate();
        this.S = s.t(this, c.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        ntf.h hVar = uiState.d;
        navBarWithToolbar.setTitle(hVar.f219023a, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionText(hVar.f219024b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(uiState.f219031b);
        largeActionButton.L(uiState.f219032c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        l.A(R.string.common_action_continue, null, null, 14, d3().f174564b);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R.string.common_search, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59409p.f57337m), null, new ntf.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.x0()), null, new ntf.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.Q.r(), new nrb.c(24))), null, new ntf.e(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.R.p(), new nrb.c(25))), null, new ntf.e(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new ntf.f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r R2() {
        return (r) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
