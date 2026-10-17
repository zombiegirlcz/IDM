package com.revolut.feature.tax_residency.impl.v2.ui.tin_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.v2.ui.tin_input.TinInputScreen;
import com.revolut.feature.tax_residency.impl.v2.ui.tin_input.TinInputScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ine.o;
import ine.p;
import java.util.List;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import xki.e;
import yi3.d;
import ype.b;
import ype.g;
import ype.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/tin_input/TinInputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lype/g;", "Ltki/c;", "Lype/j;", "Lno/m;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TinInputScreen extends ViewController<g> implements c, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TinInputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final TinInputScreenContract$InputData K;
    public final AnalyticsProduct L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final List Q;
    public final Object R;

    public TinInputScreen(TinInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = inputData.f90313l;
        this.M = R$layout.screen_recycler_navbar_action_footer;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ype.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TinInputScreen f315847b;

            {
                this.f315847b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TinInputScreen tinInputScreen = this.f315847b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TinInputScreen.S;
                        qji.b bVarU2 = tinInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.ui.tin_input.di.TinInputScreenInjector");
                        p pVar = (p) bVarU2;
                        o oVar = pVar.f162893b;
                        p pVar2 = pVar.f162894c;
                        TinInputScreenContract$InputData tinInputScreenContract$InputData = tinInputScreen.K;
                        tinInputScreenContract$InputData.getClass();
                        return new ine.s(oVar, pVar2, tinInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TinInputScreen.S;
                        return (h) ((ine.s) tinInputScreen.O.getValue()).f162903c.get();
                    default:
                        KProperty[] kPropertyArr3 = TinInputScreen.S;
                        TinInputScreen tinInputScreen2 = this.f315847b;
                        return tki.g.a(tinInputScreen2, tinInputScreen2.d(), tinInputScreen2.Q, R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ype.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TinInputScreen f315847b;

            {
                this.f315847b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TinInputScreen tinInputScreen = this.f315847b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TinInputScreen.S;
                        qji.b bVarU2 = tinInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.ui.tin_input.di.TinInputScreenInjector");
                        p pVar = (p) bVarU2;
                        o oVar = pVar.f162893b;
                        p pVar2 = pVar.f162894c;
                        TinInputScreenContract$InputData tinInputScreenContract$InputData = tinInputScreen.K;
                        tinInputScreenContract$InputData.getClass();
                        return new ine.s(oVar, pVar2, tinInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TinInputScreen.S;
                        return (h) ((ine.s) tinInputScreen.O.getValue()).f162903c.get();
                    default:
                        KProperty[] kPropertyArr3 = TinInputScreen.S;
                        TinInputScreen tinInputScreen2 = this.f315847b;
                        return tki.g.a(tinInputScreen2, tinInputScreen2.d(), tinInputScreen2.Q, R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = v.k(new InputTextDelegate(new d(this, 9)), new CellDetailsStandaloneNoteDelegate());
        this.R = w.y0(new Function0(this) { // from class: ype.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TinInputScreen f315847b;

            {
                this.f315847b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TinInputScreen tinInputScreen = this.f315847b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TinInputScreen.S;
                        qji.b bVarU2 = tinInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.ui.tin_input.di.TinInputScreenInjector");
                        p pVar = (p) bVarU2;
                        o oVar = pVar.f162893b;
                        p pVar2 = pVar.f162894c;
                        TinInputScreenContract$InputData tinInputScreenContract$InputData = tinInputScreen.K;
                        tinInputScreenContract$InputData.getClass();
                        return new ine.s(oVar, pVar2, tinInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TinInputScreen.S;
                        return (h) ((ine.s) tinInputScreen.O.getValue()).f162903c.get();
                    default:
                        KProperty[] kPropertyArr3 = TinInputScreen.S;
                        TinInputScreen tinInputScreen2 = this.f315847b;
                        return tki.g.a(tinInputScreen2, tinInputScreen2.d(), tinInputScreen2.Q, R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.tin_flow_input_title, u.c(uiState.f315854b), null, 12);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(uiState.f315855c);
        d3().f174533b.setModel(uiState.d);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ine.s) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.tin_flow_input_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        TinInputScreenContract$InputData tinInputScreenContract$InputData = this.K;
        if (czi.c.G(tinInputScreenContract$InputData.f90314m)) {
            navBarWithToolbar.setNavigationButtonIcon(czi.c.Q(tinInputScreenContract$InputData.f90314m));
        }
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        if (czi.c.G(this.K.f90314m)) {
            ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new ype.c(this, null, 0), 3);
        }
        ViewController.P2(this, rd0.e.b(d3().f174534c.x0()), new woc.p(2, d(), ype.h.class, "onSecondDescriptionClicked", "onSecondDescriptionClicked(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 25), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new ype.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f58955g), new yk6.m(this, continuation, 8), 3);
    }

    public final k d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ype.h d() {
        return (ype.h) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }
}
