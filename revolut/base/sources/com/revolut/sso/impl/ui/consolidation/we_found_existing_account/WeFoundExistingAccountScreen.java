package com.revolut.sso.impl.ui.consolidation.we_found_existing_account;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.ui.consolidation.we_found_existing_account.WeFoundExistingAccountScreen;
import com.revolut.sso.impl.ui.consolidation.we_found_existing_account.WeFoundExistingAccountScreenContract$InputData;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.q0;
import ljl.x0;
import lml.b;
import lml.c;
import lml.e;
import lml.f;
import lml.g;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/consolidation/we_found_existing_account/WeFoundExistingAccountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llml/e;", "Ldli/a;", "Llml/g;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WeFoundExistingAccountScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(WeFoundExistingAccountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final WeFoundExistingAccountScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public WeFoundExistingAccountScreen(WeFoundExistingAccountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: lml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeFoundExistingAccountScreen f197094b;

            {
                this.f197094b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WeFoundExistingAccountScreen weFoundExistingAccountScreen = this.f197094b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WeFoundExistingAccountScreen.Q;
                        qji.b bVarU2 = weFoundExistingAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.consolidation.we_found_existing_account.di.WeFoundExistingAccountScreenInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        WeFoundExistingAccountScreenContract$InputData weFoundExistingAccountScreenContract$InputData = weFoundExistingAccountScreen.K;
                        weFoundExistingAccountScreenContract$InputData.getClass();
                        return new x0(q0Var, cVar2, weFoundExistingAccountScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = WeFoundExistingAccountScreen.Q;
                        WeFoundExistingAccountScreen weFoundExistingAccountScreen2 = this.f197094b;
                        return dli.f.a(weFoundExistingAccountScreen2, (f) weFoundExistingAccountScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new RowDelegate(null, null, 7)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = WeFoundExistingAccountScreen.Q;
                        return (f) ((x0) weFoundExistingAccountScreen.N.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: lml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeFoundExistingAccountScreen f197094b;

            {
                this.f197094b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WeFoundExistingAccountScreen weFoundExistingAccountScreen = this.f197094b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WeFoundExistingAccountScreen.Q;
                        qji.b bVarU2 = weFoundExistingAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.consolidation.we_found_existing_account.di.WeFoundExistingAccountScreenInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        WeFoundExistingAccountScreenContract$InputData weFoundExistingAccountScreenContract$InputData = weFoundExistingAccountScreen.K;
                        weFoundExistingAccountScreenContract$InputData.getClass();
                        return new x0(q0Var, cVar2, weFoundExistingAccountScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = WeFoundExistingAccountScreen.Q;
                        WeFoundExistingAccountScreen weFoundExistingAccountScreen2 = this.f197094b;
                        return dli.f.a(weFoundExistingAccountScreen2, (f) weFoundExistingAccountScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new RowDelegate(null, null, 7)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = WeFoundExistingAccountScreen.Q;
                        return (f) ((x0) weFoundExistingAccountScreen.N.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: lml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeFoundExistingAccountScreen f197094b;

            {
                this.f197094b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WeFoundExistingAccountScreen weFoundExistingAccountScreen = this.f197094b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WeFoundExistingAccountScreen.Q;
                        qji.b bVarU2 = weFoundExistingAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.consolidation.we_found_existing_account.di.WeFoundExistingAccountScreenInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        WeFoundExistingAccountScreenContract$InputData weFoundExistingAccountScreenContract$InputData = weFoundExistingAccountScreen.K;
                        weFoundExistingAccountScreenContract$InputData.getClass();
                        return new x0(q0Var, cVar2, weFoundExistingAccountScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = WeFoundExistingAccountScreen.Q;
                        WeFoundExistingAccountScreen weFoundExistingAccountScreen2 = this.f197094b;
                        return dli.f.a(weFoundExistingAccountScreen2, (f) weFoundExistingAccountScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new RowDelegate(null, null, 7)), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = WeFoundExistingAccountScreen.Q;
                        return (f) ((x0) weFoundExistingAccountScreen.N.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(uiState.f197097a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f197097a);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(uiState.f197098b);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x0) this.N.getValue();
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
        d3().f174564b.setText(new TextLocalisedClause(R$string.revolut_sso_common_actions_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.x0()), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
