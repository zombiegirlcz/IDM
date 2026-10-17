package com.revolut.feature.backend_driven_limits.impl.v2.ui.list;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.RestrictionsScreen;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.RestrictionsScreenContract$InputData;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.a;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.b;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.c;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import sl2.f;
import sl2.g;
import sl2.j;
import sl2.k;
import sl2.l;
import te0.w;
import tx0.t3;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_driven_limits/impl/v2/ui/list/RestrictionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/backend_driven_limits/impl/v2/ui/list/a;", "Ltki/c;", "Lsl2/m;", "Lno/m;", "feature_backend_driven_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RestrictionsScreen extends ViewController<a> implements tki.c, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(RestrictionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final RestrictionsScreenContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final FullScreenStateDelegate Q;
    public final CounterTextDelegate R;
    public final RowDelegate S;
    public final Object T;

    public RestrictionsScreen(RestrictionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.FinCrime;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, sl2.d.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: sl2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RestrictionsScreen f264087b;

            {
                this.f264087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RestrictionsScreen restrictionsScreen = this.f264087b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RestrictionsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(restrictionsScreen.m2()).a().get(kl2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kl2.a.class, " is not found"));
                        }
                        kl2.a aVar3 = ((kl2.a) aVar2.b()).f185266h;
                        RestrictionsScreenContract$InputData restrictionsScreenContract$InputData = restrictionsScreen.K;
                        restrictionsScreenContract$InputData.getClass();
                        return new kl2.b(aVar3, restrictionsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RestrictionsScreen.U;
                        return (j) ((kl2.b) restrictionsScreen.O.getValue()).f185275c.get();
                    default:
                        KProperty[] kPropertyArr3 = RestrictionsScreen.U;
                        RestrictionsScreen restrictionsScreen2 = this.f264087b;
                        return tki.g.a(restrictionsScreen2, restrictionsScreen2.d(), v.k(new LargeActionButtonDelegate(), restrictionsScreen2.R, new ListSubheaderDelegate(), restrictionsScreen2.S, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), restrictionsScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: sl2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RestrictionsScreen f264087b;

            {
                this.f264087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RestrictionsScreen restrictionsScreen = this.f264087b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RestrictionsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(restrictionsScreen.m2()).a().get(kl2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kl2.a.class, " is not found"));
                        }
                        kl2.a aVar3 = ((kl2.a) aVar2.b()).f185266h;
                        RestrictionsScreenContract$InputData restrictionsScreenContract$InputData = restrictionsScreen.K;
                        restrictionsScreenContract$InputData.getClass();
                        return new kl2.b(aVar3, restrictionsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RestrictionsScreen.U;
                        return (j) ((kl2.b) restrictionsScreen.O.getValue()).f185275c.get();
                    default:
                        KProperty[] kPropertyArr3 = RestrictionsScreen.U;
                        RestrictionsScreen restrictionsScreen2 = this.f264087b;
                        return tki.g.a(restrictionsScreen2, restrictionsScreen2.d(), v.k(new LargeActionButtonDelegate(), restrictionsScreen2.R, new ListSubheaderDelegate(), restrictionsScreen2.S, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), restrictionsScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
        this.Q = new FullScreenStateDelegate();
        this.R = new CounterTextDelegate();
        this.S = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: sl2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RestrictionsScreen f264087b;

            {
                this.f264087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RestrictionsScreen restrictionsScreen = this.f264087b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RestrictionsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(restrictionsScreen.m2()).a().get(kl2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kl2.a.class, " is not found"));
                        }
                        kl2.a aVar3 = ((kl2.a) aVar2.b()).f185266h;
                        RestrictionsScreenContract$InputData restrictionsScreenContract$InputData = restrictionsScreen.K;
                        restrictionsScreenContract$InputData.getClass();
                        return new kl2.b(aVar3, restrictionsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RestrictionsScreen.U;
                        return (j) ((kl2.b) restrictionsScreen.O.getValue()).f185275c.get();
                    default:
                        KProperty[] kPropertyArr3 = RestrictionsScreen.U;
                        RestrictionsScreen restrictionsScreen2 = this.f264087b;
                        return tki.g.a(restrictionsScreen2, restrictionsScreen2.d(), v.k(new LargeActionButtonDelegate(), restrictionsScreen2.R, new ListSubheaderDelegate(), restrictionsScreen2.S, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), restrictionsScreen2.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        sl2.m uiState = (sl2.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        c cVar = uiState.f264092a;
        b bVar = uiState.f264093b;
        if (cVar instanceof l) {
            navBarWithToolbar.l0();
            l lVar = (l) cVar;
            TextClause textClause = lVar.f264090a;
            navBarWithToolbar.setToolbarTitle(textClause);
            navBarWithToolbar.setTitle(textClause, null);
            Clause clause = lVar.f264091b;
            if (clause != null) {
                navBarWithToolbar.setSecondDescriptionText(clause);
                navBarWithToolbar.setSecondDescriptionVisible(true);
            }
        } else if (cVar.equals(c.b.f63215a)) {
            navBarWithToolbar.I0(t3.TWO_LINES, false);
        } else {
            if (!cVar.equals(c.a.f63214a)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.l0();
        }
        LargeActionButton largeActionButton = d3().f174564b;
        if (bVar.equals(b.C0458b.f63213a)) {
            largeActionButton.o(LargeActionButton.ButtonStyle.f58737s);
            largeActionButton.setVisibility(0);
        } else if (bVar instanceof k) {
            largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
            largeActionButton.setText(((k) bVar).f264089a);
            largeActionButton.setVisibility(0);
        } else {
            if (!bVar.equals(b.a.f63212a)) {
                throw new NoWhenBranchMatchedException();
            }
            largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
            largeActionButton.setVisibility(8);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        d dVar = (d) d();
        dVar.C2(dVar.f63218r.f63206a ? a.b.f63211a : a.C0457a.f63210a);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (kl2.b) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new sl2.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new sl2.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.d), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f53218h), new sl2.h(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
