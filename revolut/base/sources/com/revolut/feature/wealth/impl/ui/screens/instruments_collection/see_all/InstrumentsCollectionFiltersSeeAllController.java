package com.revolut.feature.wealth.impl.ui.screens.instruments_collection.see_all;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.see_all.InstrumentsCollectionFiltersSeeAllController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import h9h.d;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mzb.e;
import nch.b;
import nch.c;
import nch.h;
import nch.i;
import nch.j;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/instruments_collection/see_all/InstrumentsCollectionFiltersSeeAllController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnch/h;", "Ldli/a;", "Lnch/j;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentsCollectionFiltersSeeAllController extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(InstrumentsCollectionFiltersSeeAllController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ao.h K;
    public final int L;
    public final Object M;
    public final RowDelegate N;
    public final SelectableDelegate O;
    public final Object P;
    public final Object Q;

    public InstrumentsCollectionFiltersSeeAllController(InstrumentsCollectionFiltersSeeAllControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nch.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsCollectionFiltersSeeAllController f214184b;

            {
                this.f214184b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentsCollectionFiltersSeeAllController.R;
                        return (e) ((h9h.d) this.f214184b.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = InstrumentsCollectionFiltersSeeAllController.R;
                        InstrumentsCollectionFiltersSeeAllController instrumentsCollectionFiltersSeeAllController = this.f214184b;
                        return dli.f.a(instrumentsCollectionFiltersSeeAllController, instrumentsCollectionFiltersSeeAllController.R2(), v.k(new FullScreenStateDelegate(), instrumentsCollectionFiltersSeeAllController.N, instrumentsCollectionFiltersSeeAllController.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        this.O = new SelectableDelegate(rowDelegate);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: nch.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsCollectionFiltersSeeAllController f214184b;

            {
                this.f214184b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentsCollectionFiltersSeeAllController.R;
                        return (e) ((h9h.d) this.f214184b.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = InstrumentsCollectionFiltersSeeAllController.R;
                        InstrumentsCollectionFiltersSeeAllController instrumentsCollectionFiltersSeeAllController = this.f214184b;
                        return dli.f.a(instrumentsCollectionFiltersSeeAllController, instrumentsCollectionFiltersSeeAllController.R2(), v.k(new FullScreenStateDelegate(), instrumentsCollectionFiltersSeeAllController.N, instrumentsCollectionFiltersSeeAllController.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new e(this, inputData, 23));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        i iVar = uiState.f214191a;
        TextLocalisedClause textLocalisedClause = iVar.f214189a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Object obj2 = Boolean.TRUE;
        navBarWithToolbar.setSearchButtonActive(obj2.equals(obj2));
        navBarWithToolbar.setHint(iVar.f214190b);
        d3().f174564b.setText(uiState.f214192b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59409p.f57337m), null, new naf.j(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.r()), null, new nch.d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final nch.e R2() {
        return (nch.e) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
