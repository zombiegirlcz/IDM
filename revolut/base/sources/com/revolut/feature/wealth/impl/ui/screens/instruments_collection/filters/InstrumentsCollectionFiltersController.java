package com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RangeSliderTitleDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.InstrumentsCollectionFiltersController;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.InstrumentsCollectionFiltersControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import h9h.c;
import jch.b;
import jch.d;
import jch.f;
import jch.g;
import jch.i;
import jch.m;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/instruments_collection/filters/InstrumentsCollectionFiltersController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljch/m;", "Ldli/a;", "Ljch/o;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentsCollectionFiltersController extends ViewController<m> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(InstrumentsCollectionFiltersController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final InstrumentsCollectionFiltersControllerContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final ListSubheaderDelegate O;
    public final InputChecklistDelegate P;
    public final RangeSliderTitleDelegate Q;
    public final RowDelegate R;
    public final SelectableDelegate S;
    public final Object T;
    public final Object U;

    public InstrumentsCollectionFiltersController(InstrumentsCollectionFiltersControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: jch.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsCollectionFiltersController f172799b;

            {
                this.f172799b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InstrumentsCollectionFiltersController instrumentsCollectionFiltersController = this.f172799b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentsCollectionFiltersController.V;
                        return (i) ((h9h.c) instrumentsCollectionFiltersController.U.getValue()).f150294b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InstrumentsCollectionFiltersController.V;
                        InstrumentsCollectionFiltersController instrumentsCollectionFiltersController2 = this.f172799b;
                        return dli.f.a(instrumentsCollectionFiltersController2, instrumentsCollectionFiltersController2.R2(), v.k(instrumentsCollectionFiltersController2.O, instrumentsCollectionFiltersController2.P, instrumentsCollectionFiltersController2.Q, instrumentsCollectionFiltersController2.R, instrumentsCollectionFiltersController2.S), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = InstrumentsCollectionFiltersController.V;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentsCollectionFiltersController.m2()).a().get(h9h.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h9h.a.class, " is not found"));
                        }
                        h9h.a aVar3 = ((h9h.a) aVar2.b()).D;
                        InstrumentsCollectionFiltersControllerContract$InputData instrumentsCollectionFiltersControllerContract$InputData = instrumentsCollectionFiltersController.K;
                        instrumentsCollectionFiltersControllerContract$InputData.getClass();
                        return new h9h.c(aVar3, instrumentsCollectionFiltersControllerContract$InputData);
                }
            }
        });
        this.O = new ListSubheaderDelegate();
        this.P = new InputChecklistDelegate();
        this.Q = new RangeSliderTitleDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        this.S = new SelectableDelegate(rowDelegate);
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: jch.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsCollectionFiltersController f172799b;

            {
                this.f172799b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InstrumentsCollectionFiltersController instrumentsCollectionFiltersController = this.f172799b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentsCollectionFiltersController.V;
                        return (i) ((h9h.c) instrumentsCollectionFiltersController.U.getValue()).f150294b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InstrumentsCollectionFiltersController.V;
                        InstrumentsCollectionFiltersController instrumentsCollectionFiltersController2 = this.f172799b;
                        return dli.f.a(instrumentsCollectionFiltersController2, instrumentsCollectionFiltersController2.R2(), v.k(instrumentsCollectionFiltersController2.O, instrumentsCollectionFiltersController2.P, instrumentsCollectionFiltersController2.Q, instrumentsCollectionFiltersController2.R, instrumentsCollectionFiltersController2.S), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = InstrumentsCollectionFiltersController.V;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentsCollectionFiltersController.m2()).a().get(h9h.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h9h.a.class, " is not found"));
                        }
                        h9h.a aVar3 = ((h9h.a) aVar2.b()).D;
                        InstrumentsCollectionFiltersControllerContract$InputData instrumentsCollectionFiltersControllerContract$InputData = instrumentsCollectionFiltersController.K;
                        instrumentsCollectionFiltersControllerContract$InputData.getClass();
                        return new h9h.c(aVar3, instrumentsCollectionFiltersControllerContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: jch.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsCollectionFiltersController f172799b;

            {
                this.f172799b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InstrumentsCollectionFiltersController instrumentsCollectionFiltersController = this.f172799b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentsCollectionFiltersController.V;
                        return (i) ((h9h.c) instrumentsCollectionFiltersController.U.getValue()).f150294b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InstrumentsCollectionFiltersController.V;
                        InstrumentsCollectionFiltersController instrumentsCollectionFiltersController2 = this.f172799b;
                        return dli.f.a(instrumentsCollectionFiltersController2, instrumentsCollectionFiltersController2.R2(), v.k(instrumentsCollectionFiltersController2.O, instrumentsCollectionFiltersController2.P, instrumentsCollectionFiltersController2.Q, instrumentsCollectionFiltersController2.R, instrumentsCollectionFiltersController2.S), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = InstrumentsCollectionFiltersController.V;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentsCollectionFiltersController.m2()).a().get(h9h.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h9h.a.class, " is not found"));
                        }
                        h9h.a aVar3 = ((h9h.a) aVar2.b()).D;
                        InstrumentsCollectionFiltersControllerContract$InputData instrumentsCollectionFiltersControllerContract$InputData = instrumentsCollectionFiltersController.K;
                        instrumentsCollectionFiltersControllerContract$InputData.getClass();
                        return new h9h.c(aVar3, instrumentsCollectionFiltersControllerContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        jch.o uiState = (jch.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = uiState.f172808a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(uiState.f172809b);
        d3().f174564b.setText(uiState.f172810c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new jch.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new jch.c(this, null, 1), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(listSubheaderDelegate.f52707c), null, new jch.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(listSubheaderDelegate.d), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52518c), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.r()), null, new jch.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53139c), null, new d(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
