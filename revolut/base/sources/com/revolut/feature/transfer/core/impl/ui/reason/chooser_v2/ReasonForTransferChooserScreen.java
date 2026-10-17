package com.revolut.feature.transfer.core.impl.ui.reason.chooser_v2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser_v2.ReasonForTransferChooserContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser_v2.ReasonForTransferChooserScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.core.R$string;
import dli.a;
import dli.c;
import ip4.m;
import iqf.d;
import iqf.e;
import iqf.l;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lpf.p;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/reason/chooser_v2/ReasonForTransferChooserScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liqf/d;", "Ldli/a;", "Liqf/e;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReasonForTransferChooserScreen extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ReasonForTransferChooserScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final ReasonForTransferChooserContract$InputData K;
    public final int L;
    public final h M;
    public final SingleChoiceDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public ReasonForTransferChooserScreen(ReasonForTransferChooserContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, iqf.h.f);
        this.N = new SingleChoiceDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: iqf.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReasonForTransferChooserScreen f167832b;

            {
                this.f167832b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReasonForTransferChooserScreen reasonForTransferChooserScreen = this.f167832b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReasonForTransferChooserScreen.R;
                        qji.b bVarU2 = reasonForTransferChooserScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer.core.impl.ui.reason.chooser_v2.di.ReasonForTransferChooserScreenInjector");
                        lpf.d dVar = (lpf.d) bVarU2;
                        lpf.i iVar = dVar.f199016b;
                        lpf.d dVar2 = dVar.f199017c;
                        ReasonForTransferChooserContract$InputData reasonForTransferChooserContract$InputData = reasonForTransferChooserScreen.K;
                        reasonForTransferChooserContract$InputData.getClass();
                        return new p(iVar, dVar2, reasonForTransferChooserContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReasonForTransferChooserScreen.R;
                        return (l) ((p) reasonForTransferChooserScreen.O.getValue()).f199073b.get();
                    default:
                        KProperty[] kPropertyArr3 = ReasonForTransferChooserScreen.R;
                        ReasonForTransferChooserScreen reasonForTransferChooserScreen2 = this.f167832b;
                        return dli.f.a(reasonForTransferChooserScreen2, reasonForTransferChooserScreen2.R2(), u.c(reasonForTransferChooserScreen2.N), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: iqf.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReasonForTransferChooserScreen f167832b;

            {
                this.f167832b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReasonForTransferChooserScreen reasonForTransferChooserScreen = this.f167832b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReasonForTransferChooserScreen.R;
                        qji.b bVarU2 = reasonForTransferChooserScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer.core.impl.ui.reason.chooser_v2.di.ReasonForTransferChooserScreenInjector");
                        lpf.d dVar = (lpf.d) bVarU2;
                        lpf.i iVar = dVar.f199016b;
                        lpf.d dVar2 = dVar.f199017c;
                        ReasonForTransferChooserContract$InputData reasonForTransferChooserContract$InputData = reasonForTransferChooserScreen.K;
                        reasonForTransferChooserContract$InputData.getClass();
                        return new p(iVar, dVar2, reasonForTransferChooserContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReasonForTransferChooserScreen.R;
                        return (l) ((p) reasonForTransferChooserScreen.O.getValue()).f199073b.get();
                    default:
                        KProperty[] kPropertyArr3 = ReasonForTransferChooserScreen.R;
                        ReasonForTransferChooserScreen reasonForTransferChooserScreen2 = this.f167832b;
                        return dli.f.a(reasonForTransferChooserScreen2, reasonForTransferChooserScreen2.R2(), u.c(reasonForTransferChooserScreen2.N), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: iqf.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReasonForTransferChooserScreen f167832b;

            {
                this.f167832b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReasonForTransferChooserScreen reasonForTransferChooserScreen = this.f167832b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReasonForTransferChooserScreen.R;
                        qji.b bVarU2 = reasonForTransferChooserScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer.core.impl.ui.reason.chooser_v2.di.ReasonForTransferChooserScreenInjector");
                        lpf.d dVar = (lpf.d) bVarU2;
                        lpf.i iVar = dVar.f199016b;
                        lpf.d dVar2 = dVar.f199017c;
                        ReasonForTransferChooserContract$InputData reasonForTransferChooserContract$InputData = reasonForTransferChooserScreen.K;
                        reasonForTransferChooserContract$InputData.getClass();
                        return new p(iVar, dVar2, reasonForTransferChooserContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReasonForTransferChooserScreen.R;
                        return (l) ((p) reasonForTransferChooserScreen.O.getValue()).f199073b.get();
                    default:
                        KProperty[] kPropertyArr3 = ReasonForTransferChooserScreen.R;
                        ReasonForTransferChooserScreen reasonForTransferChooserScreen2 = this.f167832b;
                        return dli.f.a(reasonForTransferChooserScreen2, reasonForTransferChooserScreen2.R2(), u.c(reasonForTransferChooserScreen2.N), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ActionFooterView actionFooterView = d3().f174533b;
        actionFooterView.setVisibility(uiState.f167830b != null ? 0 : 8);
        i iVar = uiState.f167830b;
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        k kVarD3 = d3();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.purpose_of_payment_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = kVarD3.f174534c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.purpose_of_payment_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.purpose_of_payment_search_placeholder, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new iaf.d(this, null, 18), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new iqf.i(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59409p.f57337m), new iqf.i(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.N.p(), new m(5))), new iqf.i(this, null, 2), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
