package com.revolut.feature.transfer_reasons.impl.ui.reasons;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import bib.b;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer_reasons.api.R$string;
import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import htf.c;
import htf.d;
import htf.f;
import htf.n;
import htf.p;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import no.d1;
import nsf.r;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/ui/reasons/TransferReasonsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhtf/n;", "Ldli/a;", "Lhtf/p;", "Lno/d1;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferReasonsScreen extends ViewController<n> implements a, d1 {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TransferReasonsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;
    public final LargeActionButtonDelegate P;
    public final RowDelegate Q;
    public final SelectableDelegate R;
    public final SingleChoiceDelegate S;

    public TransferReasonsScreen(TransferReasonsScreenContract$InputData inputData, Flow selectedReasonsFlow, Flow selectedCategoryFlow) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(selectedReasonsFlow, "selectedReasonsFlow");
        Intrinsics.checkNotNullParameter(selectedCategoryFlow, "selectedCategoryFlow");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: htf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsScreen f155363b;

            {
                this.f155363b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsScreen.T;
                        TransferReasonsScreen transferReasonsScreen = this.f155363b;
                        return dli.f.a(transferReasonsScreen, transferReasonsScreen.d(), v.k(new ListSubheaderDelegate(), transferReasonsScreen.P, transferReasonsScreen.Q, transferReasonsScreen.R, transferReasonsScreen.S), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TransferReasonsScreen.T;
                        nsf.r rVar = (nsf.r) this.f155363b.M.getValue();
                        switch (rVar.f218851a) {
                            case 0:
                                return (o) rVar.f.get();
                            default:
                                return (o) rVar.f.get();
                        }
                }
            }
        });
        this.M = w.y0(new b(this, inputData, selectedReasonsFlow, selectedCategoryFlow, 11));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: htf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsScreen f155363b;

            {
                this.f155363b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsScreen.T;
                        TransferReasonsScreen transferReasonsScreen = this.f155363b;
                        return dli.f.a(transferReasonsScreen, transferReasonsScreen.d(), v.k(new ListSubheaderDelegate(), transferReasonsScreen.P, transferReasonsScreen.Q, transferReasonsScreen.R, transferReasonsScreen.S), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TransferReasonsScreen.T;
                        nsf.r rVar = (nsf.r) this.f155363b.M.getValue();
                        switch (rVar.f218851a) {
                            case 0:
                                return (o) rVar.f.get();
                            default:
                                return (o) rVar.f.get();
                        }
                }
            }
        });
        this.O = s.t(this, htf.b.f);
        this.P = new LargeActionButtonDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = new SelectableDelegate(rowDelegate);
        this.S = new SingleChoiceDelegate();
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(uiState.f155377b);
        largeActionButton.L(uiState.f155378c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transfer_reasons_outbound_title, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        List listK = v.k(new TextLocalisedClause(R$string.transfer_reasons_common_header_description_choose, null, null, 14), new TextLocalisedClause(R$string.transfer_reasons_common_header_description_get_help, null, new Click(30, (Integer) null, (Object) null, "GET_HELP_ID", false), 10));
        m70.a.t(t0.f186434a);
        navBarWithToolbar.setSecondDescriptionText(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.x0()), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d.f121375b), null, new htf.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53218h), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.R.r(), new hqk.a(17))), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.S.p(), new hqk.a(18))), null, new d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final htf.o d() {
        return (htf.o) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
