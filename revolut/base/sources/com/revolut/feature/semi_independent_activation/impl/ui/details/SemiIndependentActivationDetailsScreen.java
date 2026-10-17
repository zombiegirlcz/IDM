package com.revolut.feature.semi_independent_activation.impl.ui.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.semi_independent_activation.impl.ui.details.SemiIndependentActivationDetailsScreen;
import com.revolut.feature.semi_independent_activation.impl.ui.details.SemiIndependentActivationDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rlh.c;
import s0d.b;
import s0d.d;
import s0d.h;
import s0d.j;
import s0d.k;
import s0d.l;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/semi_independent_activation/impl/ui/details/SemiIndependentActivationDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls0d/h;", "Ldli/a;", "Ls0d/l;", "feature_semi_independent_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SemiIndependentActivationDetailsScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(SemiIndependentActivationDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final SemiIndependentActivationDetailsScreenContract$InputData K;
    public final Object L;
    public final int M;
    public final ao.h N;
    public final ListSubheaderDelegate O;
    public final RowLoadingDelegate P;
    public final FullScreenStateDelegate Q;
    public final RowDelegate R;
    public final Object S;
    public final Object T;

    public SemiIndependentActivationDetailsScreen(SemiIndependentActivationDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: s0d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SemiIndependentActivationDetailsScreen f258939b;

            {
                this.f258939b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SemiIndependentActivationDetailsScreen semiIndependentActivationDetailsScreen = this.f258939b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SemiIndependentActivationDetailsScreen.U;
                        return (j) ((o0d.a) semiIndependentActivationDetailsScreen.T.getValue()).f221198c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SemiIndependentActivationDetailsScreen.U;
                        SemiIndependentActivationDetailsScreen semiIndependentActivationDetailsScreen2 = this.f258939b;
                        return dli.f.a(semiIndependentActivationDetailsScreen2, semiIndependentActivationDetailsScreen2.d(), v.k(semiIndependentActivationDetailsScreen2.O, semiIndependentActivationDetailsScreen2.P, semiIndependentActivationDetailsScreen2.Q, semiIndependentActivationDetailsScreen2.R), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SemiIndependentActivationDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(semiIndependentActivationDetailsScreen.m2()).a().get(o0d.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o0d.c.class, " is not found"));
                        }
                        o0d.c cVar = ((o0d.c) aVar2.b()).f;
                        SemiIndependentActivationDetailsScreenContract$InputData semiIndependentActivationDetailsScreenContract$InputData = semiIndependentActivationDetailsScreen.K;
                        semiIndependentActivationDetailsScreenContract$InputData.getClass();
                        return new o0d.a(cVar, semiIndependentActivationDetailsScreenContract$InputData);
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar_action_footer;
        this.N = s.t(this, b.f);
        this.O = new ListSubheaderDelegate();
        this.P = new RowLoadingDelegate();
        this.Q = new FullScreenStateDelegate();
        this.R = new RowDelegate(null, null, 7);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: s0d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SemiIndependentActivationDetailsScreen f258939b;

            {
                this.f258939b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SemiIndependentActivationDetailsScreen semiIndependentActivationDetailsScreen = this.f258939b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SemiIndependentActivationDetailsScreen.U;
                        return (j) ((o0d.a) semiIndependentActivationDetailsScreen.T.getValue()).f221198c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SemiIndependentActivationDetailsScreen.U;
                        SemiIndependentActivationDetailsScreen semiIndependentActivationDetailsScreen2 = this.f258939b;
                        return dli.f.a(semiIndependentActivationDetailsScreen2, semiIndependentActivationDetailsScreen2.d(), v.k(semiIndependentActivationDetailsScreen2.O, semiIndependentActivationDetailsScreen2.P, semiIndependentActivationDetailsScreen2.Q, semiIndependentActivationDetailsScreen2.R), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SemiIndependentActivationDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(semiIndependentActivationDetailsScreen.m2()).a().get(o0d.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o0d.c.class, " is not found"));
                        }
                        o0d.c cVar = ((o0d.c) aVar2.b()).f;
                        SemiIndependentActivationDetailsScreenContract$InputData semiIndependentActivationDetailsScreenContract$InputData = semiIndependentActivationDetailsScreen.K;
                        semiIndependentActivationDetailsScreenContract$InputData.getClass();
                        return new o0d.a(cVar, semiIndependentActivationDetailsScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: s0d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SemiIndependentActivationDetailsScreen f258939b;

            {
                this.f258939b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SemiIndependentActivationDetailsScreen semiIndependentActivationDetailsScreen = this.f258939b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SemiIndependentActivationDetailsScreen.U;
                        return (j) ((o0d.a) semiIndependentActivationDetailsScreen.T.getValue()).f221198c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SemiIndependentActivationDetailsScreen.U;
                        SemiIndependentActivationDetailsScreen semiIndependentActivationDetailsScreen2 = this.f258939b;
                        return dli.f.a(semiIndependentActivationDetailsScreen2, semiIndependentActivationDetailsScreen2.d(), v.k(semiIndependentActivationDetailsScreen2.O, semiIndependentActivationDetailsScreen2.P, semiIndependentActivationDetailsScreen2.Q, semiIndependentActivationDetailsScreen2.R), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SemiIndependentActivationDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(semiIndependentActivationDetailsScreen.m2()).a().get(o0d.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o0d.c.class, " is not found"));
                        }
                        o0d.c cVar = ((o0d.c) aVar2.b()).f;
                        SemiIndependentActivationDetailsScreenContract$InputData semiIndependentActivationDetailsScreenContract$InputData = semiIndependentActivationDetailsScreen.K;
                        semiIndependentActivationDetailsScreenContract$InputData.getClass();
                        return new o0d.a(cVar, semiIndependentActivationDetailsScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        k kVar = uiState.f258948a;
        aw0.h hVar = uiState.f258949b;
        if (kVar != null) {
            TextLocalisedClause textLocalisedClause = kVar.f258946a;
            navBarWithToolbar.l0();
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setSecondDescriptionText(kVar.f258947b);
            navBarWithToolbar.setSecondDescriptionVisible(true);
        } else {
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        ActionFooterView actionFooterView = d3().f174533b;
        actionFooterView.setVisibility(hVar == null ? 8 : 0);
        if (hVar != null) {
            actionFooterView.setModel(hVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o0d.a) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new c(this, null, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new s0d.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f58955g), null, new s0d.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f53218h), null, new s0d.e(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
