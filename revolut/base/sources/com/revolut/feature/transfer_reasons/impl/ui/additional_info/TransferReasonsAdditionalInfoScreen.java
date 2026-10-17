package com.revolut.feature.transfer_reasons.impl.ui.additional_info;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nsf.j;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import xsf.b;
import xsf.d;
import xsf.g;
import xsf.i;
import xsf.k;
import xsf.o;
import xsf.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/ui/additional_info/TransferReasonsAdditionalInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxsf/o;", "Ltki/c;", "Lxsf/q;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferReasonsAdditionalInfoScreen extends ViewController<o> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TransferReasonsAdditionalInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TransferReasonsAdditionalInfoScreen(TransferReasonsAdditionalInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_action_footer;
        this.L = w.y0(new b(this, 0));
        this.M = w.y0(new xfj.a(this, inputData, 16));
        this.N = w.y0(new b(this, 2));
        this.O = s.t(this, d.f);
        this.P = w.y0(new b(this, 3));
        this.Q = w.y0(new b(this, 4));
        this.R = w.y0(new xsf.c(0));
        this.S = w.y0(new b(this, 5));
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        xsf.q uiState = (xsf.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        Clause clause = uiState.f308478c;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        Clause clause2 = uiState.d;
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        if (clause2 != null) {
            navBarWithToolbar.setDescriptionText(clause2);
        }
        d3().f174533b.setModel(uiState.f308477b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new xsf.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new xsf.h(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(d3().f174533b.e, new xrl.a(2))), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((SelectableDelegate) this.S.getValue()).r(), new xrl.a(3))), null, new xsf.j(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.R.getValue()).f53225r, new xrl.a(4))), null, new xsf.j(this, null, 1), 3);
        ?? r56 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).f52575g.f121375b), null, new g(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p R2() {
        return (p) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.L.getValue();
    }
}
