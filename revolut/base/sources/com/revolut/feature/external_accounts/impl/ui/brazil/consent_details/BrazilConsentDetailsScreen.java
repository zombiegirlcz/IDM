package com.revolut.feature.external_accounts.impl.ui.brazil.consent_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.BrazilConsentDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.BrazilConsentDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import iaf.d;
import ij6.b;
import ij6.g;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import vc.s;
import xf6.a3;
import xf6.e2;
import xf6.w2;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/consent_details/BrazilConsentDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/consent_details/BrazilConsentDetailsScreenContract$OutputData;", "Ldli/a;", "Lij6/h;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrazilConsentDetailsScreen extends ViewController<BrazilConsentDetailsScreenContract$OutputData> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BrazilConsentDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final BrazilConsentDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final CellDetailsDelegate Q;
    public final Object R;

    public BrazilConsentDetailsScreen(BrazilConsentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ij6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilConsentDetailsScreen f161711b;

            {
                this.f161711b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrazilConsentDetailsScreen brazilConsentDetailsScreen = this.f161711b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrazilConsentDetailsScreen.S;
                        qji.b bVarU2 = brazilConsentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.di.BrazilConsentDetailsScreenComponent.Injector");
                        a3 a3Var = (a3) bVarU2;
                        w2 w2Var = a3Var.f304790a;
                        a3 a3Var2 = a3Var.f304791b;
                        BrazilConsentDetailsScreenContract$InputData brazilConsentDetailsScreenContract$InputData = brazilConsentDetailsScreen.K;
                        brazilConsentDetailsScreenContract$InputData.getClass();
                        return new e2(w2Var, a3Var2, brazilConsentDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BrazilConsentDetailsScreen.S;
                        return (g) ((e2) brazilConsentDetailsScreen.N.getValue()).f304837c.get();
                    default:
                        KProperty[] kPropertyArr3 = BrazilConsentDetailsScreen.S;
                        BrazilConsentDetailsScreen brazilConsentDetailsScreen2 = this.f161711b;
                        return dli.f.a(brazilConsentDetailsScreen2, (g) brazilConsentDetailsScreen2.O.getValue(), v.k(brazilConsentDetailsScreen2.P, new ListSubheaderDelegate(), brazilConsentDetailsScreen2.Q, new CellDetailsNoteDelegate(), new CellDetailsLoadingDelegate(), new ListCellDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ij6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilConsentDetailsScreen f161711b;

            {
                this.f161711b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrazilConsentDetailsScreen brazilConsentDetailsScreen = this.f161711b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrazilConsentDetailsScreen.S;
                        qji.b bVarU2 = brazilConsentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.di.BrazilConsentDetailsScreenComponent.Injector");
                        a3 a3Var = (a3) bVarU2;
                        w2 w2Var = a3Var.f304790a;
                        a3 a3Var2 = a3Var.f304791b;
                        BrazilConsentDetailsScreenContract$InputData brazilConsentDetailsScreenContract$InputData = brazilConsentDetailsScreen.K;
                        brazilConsentDetailsScreenContract$InputData.getClass();
                        return new e2(w2Var, a3Var2, brazilConsentDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BrazilConsentDetailsScreen.S;
                        return (g) ((e2) brazilConsentDetailsScreen.N.getValue()).f304837c.get();
                    default:
                        KProperty[] kPropertyArr3 = BrazilConsentDetailsScreen.S;
                        BrazilConsentDetailsScreen brazilConsentDetailsScreen2 = this.f161711b;
                        return dli.f.a(brazilConsentDetailsScreen2, (g) brazilConsentDetailsScreen2.O.getValue(), v.k(brazilConsentDetailsScreen2.P, new ListSubheaderDelegate(), brazilConsentDetailsScreen2.Q, new CellDetailsNoteDelegate(), new CellDetailsLoadingDelegate(), new ListCellDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        this.Q = new CellDetailsDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ij6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilConsentDetailsScreen f161711b;

            {
                this.f161711b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrazilConsentDetailsScreen brazilConsentDetailsScreen = this.f161711b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrazilConsentDetailsScreen.S;
                        qji.b bVarU2 = brazilConsentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.di.BrazilConsentDetailsScreenComponent.Injector");
                        a3 a3Var = (a3) bVarU2;
                        w2 w2Var = a3Var.f304790a;
                        a3 a3Var2 = a3Var.f304791b;
                        BrazilConsentDetailsScreenContract$InputData brazilConsentDetailsScreenContract$InputData = brazilConsentDetailsScreen.K;
                        brazilConsentDetailsScreenContract$InputData.getClass();
                        return new e2(w2Var, a3Var2, brazilConsentDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = BrazilConsentDetailsScreen.S;
                        return (g) ((e2) brazilConsentDetailsScreen.N.getValue()).f304837c.get();
                    default:
                        KProperty[] kPropertyArr3 = BrazilConsentDetailsScreen.S;
                        BrazilConsentDetailsScreen brazilConsentDetailsScreen2 = this.f161711b;
                        return dli.f.a(brazilConsentDetailsScreen2, (g) brazilConsentDetailsScreen2.O.getValue(), v.k(brazilConsentDetailsScreen2.P, new ListSubheaderDelegate(), brazilConsentDetailsScreen2.Q, new CellDetailsNoteDelegate(), new CellDetailsLoadingDelegate(), new ListCellDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ij6.h uiState = (ij6.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setEndImage(uiState.f161716c);
        String str = uiState.d;
        if (str != null) {
            navBarWithToolbar.setToolbarTitle(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            navBarWithToolbar.setTitle(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        }
        if (uiState.f161715b) {
            navBarWithToolbar.I0(t3.PROFILE, false);
        } else {
            navBarWithToolbar.l0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, null, 8), 3);
        ViewController.P2(this, new i5b.d(rd0.e.b(this.P.f53218h), 26), new ij6.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.e), new ij6.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
