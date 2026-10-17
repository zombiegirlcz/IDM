package com.revolut.feature.insurance_credit.impl.ui.screen.cancellation_confirmation;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance_credit.impl.ui.screen.cancellation_confirmation.CancellationConfirmationScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.cancellation_confirmation.CancellationConfirmationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.k9;
import jii.k;
import jt7.b;
import jt7.c;
import jt7.e;
import jt7.f;
import jt7.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/screen/cancellation_confirmation/CancellationConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljt7/e;", "Ldli/a;", "Ljt7/g;", "Lno/m;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CancellationConfirmationScreen extends ViewController<e> implements a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CancellationConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final CancellationConfirmationScreenContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CancellationConfirmationScreen(CancellationConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = R$layout.screen_recycler_navbar_action_footer;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: jt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancellationConfirmationScreen f178418b;

            {
                this.f178418b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CancellationConfirmationScreen cancellationConfirmationScreen = this.f178418b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CancellationConfirmationScreen.R;
                        qji.b bVarU2 = cancellationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.cancellation_confirmation.di.CancellationConfirmationScreenInjector");
                        bt7.j jVar = (bt7.j) bVarU2;
                        bt7.i iVar = jVar.f18442b;
                        bt7.j jVar2 = jVar.f18443c;
                        CancellationConfirmationScreenContract$InputData cancellationConfirmationScreenContract$InputData = cancellationConfirmationScreen.K;
                        cancellationConfirmationScreenContract$InputData.getClass();
                        return new bt7.b(iVar, jVar2, cancellationConfirmationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CancellationConfirmationScreen.R;
                        return (f) ((bt7.b) cancellationConfirmationScreen.O.getValue()).f18406c.get();
                    default:
                        KProperty[] kPropertyArr3 = CancellationConfirmationScreen.R;
                        CancellationConfirmationScreen cancellationConfirmationScreen2 = this.f178418b;
                        return dli.f.a(cancellationConfirmationScreen2, (f) cancellationConfirmationScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: jt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancellationConfirmationScreen f178418b;

            {
                this.f178418b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CancellationConfirmationScreen cancellationConfirmationScreen = this.f178418b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CancellationConfirmationScreen.R;
                        qji.b bVarU2 = cancellationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.cancellation_confirmation.di.CancellationConfirmationScreenInjector");
                        bt7.j jVar = (bt7.j) bVarU2;
                        bt7.i iVar = jVar.f18442b;
                        bt7.j jVar2 = jVar.f18443c;
                        CancellationConfirmationScreenContract$InputData cancellationConfirmationScreenContract$InputData = cancellationConfirmationScreen.K;
                        cancellationConfirmationScreenContract$InputData.getClass();
                        return new bt7.b(iVar, jVar2, cancellationConfirmationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CancellationConfirmationScreen.R;
                        return (f) ((bt7.b) cancellationConfirmationScreen.O.getValue()).f18406c.get();
                    default:
                        KProperty[] kPropertyArr3 = CancellationConfirmationScreen.R;
                        CancellationConfirmationScreen cancellationConfirmationScreen2 = this.f178418b;
                        return dli.f.a(cancellationConfirmationScreen2, (f) cancellationConfirmationScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: jt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancellationConfirmationScreen f178418b;

            {
                this.f178418b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CancellationConfirmationScreen cancellationConfirmationScreen = this.f178418b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CancellationConfirmationScreen.R;
                        qji.b bVarU2 = cancellationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.cancellation_confirmation.di.CancellationConfirmationScreenInjector");
                        bt7.j jVar = (bt7.j) bVarU2;
                        bt7.i iVar = jVar.f18442b;
                        bt7.j jVar2 = jVar.f18443c;
                        CancellationConfirmationScreenContract$InputData cancellationConfirmationScreenContract$InputData = cancellationConfirmationScreen.K;
                        cancellationConfirmationScreenContract$InputData.getClass();
                        return new bt7.b(iVar, jVar2, cancellationConfirmationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CancellationConfirmationScreen.R;
                        return (f) ((bt7.b) cancellationConfirmationScreen.O.getValue()).f18406c.get();
                    default:
                        KProperty[] kPropertyArr3 = CancellationConfirmationScreen.R;
                        CancellationConfirmationScreen cancellationConfirmationScreen2 = this.f178418b;
                        return dli.f.a(cancellationConfirmationScreen2, (f) cancellationConfirmationScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        Clause clause = uiState.f178420a;
        i iVar = uiState.f178422c;
        Clause clause2 = uiState.f178421b;
        navBarWithToolbar.setTitle(clause, null);
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        ActionFooterView actionFooterView = d3().f174533b;
        actionFooterView.setVisibility(iVar == null ? 8 : 0);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (bt7.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f58955g), new c(this, null, 2), 3);
    }

    public final k d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
