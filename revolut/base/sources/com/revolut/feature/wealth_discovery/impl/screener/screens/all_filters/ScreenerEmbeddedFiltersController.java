package com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters;

import an9.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeSliderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RangeSliderTitleDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth_discovery.impl.R$id;
import com.revolut.feature.wealth_discovery.impl.R$layout;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.ScreenerEmbeddedFiltersController;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.ScreenerEmbeddedFiltersControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.wealth.resources.R$string;
import ihm.f;
import joh.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q97.b1;
import qph.b;
import qph.c;
import qph.k;
import qph.l;
import qph.n;
import te0.w;
import vc.s;
import vkm.d;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqph/n;", "", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerEmbeddedFiltersController extends ViewController<n> implements dli.a {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f96206b0 = {o0.f186429a.j(new h0(ScreenerEmbeddedFiltersController.class, "binding", "getBinding()Lcom/revolut/feature/wealth_discovery/impl/databinding/ScreenScreenerEmbeddedFiltersBinding;", 0))};
    public final ScreenerEmbeddedFiltersControllerContract$InputData K;
    public final Object L;
    public final int M;
    public final h N;
    public final ActionsDelegate O;
    public final ActionsLoadingDelegate P;
    public final ListSubheaderDelegate Q;
    public final ListSubheaderLoadingDelegate R;
    public final RangeSliderTitleDelegate S;
    public final CellDetailsChevronDelegate T;
    public final RowDelegate U;
    public final SelectableDelegate V;
    public final FullScreenStateDelegate W;
    public final TextDelegate X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final j f96207a0;

    public ScreenerEmbeddedFiltersController(ScreenerEmbeddedFiltersControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: qph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerEmbeddedFiltersController f248397b;

            {
                this.f248397b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScreenerEmbeddedFiltersController screenerEmbeddedFiltersController = this.f248397b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerEmbeddedFiltersController.f96206b0;
                        return (l) ((joh.m) screenerEmbeddedFiltersController.Z.getValue()).f177030g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerEmbeddedFiltersController.f96206b0;
                        ScreenerEmbeddedFiltersController screenerEmbeddedFiltersController2 = this.f248397b;
                        return dli.f.a(screenerEmbeddedFiltersController2, screenerEmbeddedFiltersController2.R2(), zhm.v.k(screenerEmbeddedFiltersController2.O, screenerEmbeddedFiltersController2.P, screenerEmbeddedFiltersController2.Q, screenerEmbeddedFiltersController2.R, screenerEmbeddedFiltersController2.S, screenerEmbeddedFiltersController2.T, screenerEmbeddedFiltersController2.U, screenerEmbeddedFiltersController2.V, screenerEmbeddedFiltersController2.W, screenerEmbeddedFiltersController2.X, new ListSubheaderLoadingDelegate(), new ActionsLoadingDelegate(), new LargeSliderLoadingDelegate(), new RowLoadingDelegate()), R$id.screenScreenerEmbeddedFilters_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerEmbeddedFiltersController.f96206b0;
                        qji.b bVarU2 = screenerEmbeddedFiltersController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.di.ScreenerEmbeddedFiltersControllerComponent.Injector");
                        joh.j jVar = (joh.j) bVarU2;
                        joh.w wVar = jVar.f177011c;
                        joh.j jVar2 = jVar.d;
                        ScreenerEmbeddedFiltersControllerContract$InputData screenerEmbeddedFiltersControllerContract$InputData = screenerEmbeddedFiltersController.K;
                        RowDelegate rowDelegate = screenerEmbeddedFiltersController.U;
                        ListSubheaderDelegate listSubheaderDelegate = screenerEmbeddedFiltersController.Q;
                        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
                        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
                        avk.j jVar3 = screenerEmbeddedFiltersController.f96207a0;
                        yph.g gVar = new yph.g(listSubheaderDelegate, screenerEmbeddedFiltersController.O, screenerEmbeddedFiltersController.S, screenerEmbeddedFiltersController.V);
                        screenerEmbeddedFiltersControllerContract$InputData.getClass();
                        jVar3.getClass();
                        return new joh.m(wVar, jVar2, screenerEmbeddedFiltersControllerContract$InputData, jVar3, gVar);
                }
            }
        });
        this.M = R$layout.screen_screener_embedded_filters;
        this.N = s.t(this, c.f);
        this.O = new ActionsDelegate();
        this.P = new ActionsLoadingDelegate();
        this.Q = new ListSubheaderDelegate();
        this.R = new ListSubheaderLoadingDelegate();
        this.S = new RangeSliderTitleDelegate();
        this.T = new CellDetailsChevronDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.U = rowDelegate;
        this.V = new SelectableDelegate(rowDelegate);
        this.W = new FullScreenStateDelegate();
        this.X = new TextDelegate();
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: qph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerEmbeddedFiltersController f248397b;

            {
                this.f248397b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScreenerEmbeddedFiltersController screenerEmbeddedFiltersController = this.f248397b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerEmbeddedFiltersController.f96206b0;
                        return (l) ((joh.m) screenerEmbeddedFiltersController.Z.getValue()).f177030g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerEmbeddedFiltersController.f96206b0;
                        ScreenerEmbeddedFiltersController screenerEmbeddedFiltersController2 = this.f248397b;
                        return dli.f.a(screenerEmbeddedFiltersController2, screenerEmbeddedFiltersController2.R2(), zhm.v.k(screenerEmbeddedFiltersController2.O, screenerEmbeddedFiltersController2.P, screenerEmbeddedFiltersController2.Q, screenerEmbeddedFiltersController2.R, screenerEmbeddedFiltersController2.S, screenerEmbeddedFiltersController2.T, screenerEmbeddedFiltersController2.U, screenerEmbeddedFiltersController2.V, screenerEmbeddedFiltersController2.W, screenerEmbeddedFiltersController2.X, new ListSubheaderLoadingDelegate(), new ActionsLoadingDelegate(), new LargeSliderLoadingDelegate(), new RowLoadingDelegate()), R$id.screenScreenerEmbeddedFilters_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerEmbeddedFiltersController.f96206b0;
                        qji.b bVarU2 = screenerEmbeddedFiltersController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.di.ScreenerEmbeddedFiltersControllerComponent.Injector");
                        joh.j jVar = (joh.j) bVarU2;
                        joh.w wVar = jVar.f177011c;
                        joh.j jVar2 = jVar.d;
                        ScreenerEmbeddedFiltersControllerContract$InputData screenerEmbeddedFiltersControllerContract$InputData = screenerEmbeddedFiltersController.K;
                        RowDelegate rowDelegate2 = screenerEmbeddedFiltersController.U;
                        ListSubheaderDelegate listSubheaderDelegate = screenerEmbeddedFiltersController.Q;
                        Intrinsics.checkNotNullParameter(rowDelegate2, "rowDelegate");
                        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
                        avk.j jVar3 = screenerEmbeddedFiltersController.f96207a0;
                        yph.g gVar = new yph.g(listSubheaderDelegate, screenerEmbeddedFiltersController.O, screenerEmbeddedFiltersController.S, screenerEmbeddedFiltersController.V);
                        screenerEmbeddedFiltersControllerContract$InputData.getClass();
                        jVar3.getClass();
                        return new joh.m(wVar, jVar2, screenerEmbeddedFiltersControllerContract$InputData, jVar3, gVar);
                }
            }
        });
        final int i3 = 2;
        this.Z = w.y0(new Function0(this) { // from class: qph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerEmbeddedFiltersController f248397b;

            {
                this.f248397b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScreenerEmbeddedFiltersController screenerEmbeddedFiltersController = this.f248397b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerEmbeddedFiltersController.f96206b0;
                        return (l) ((joh.m) screenerEmbeddedFiltersController.Z.getValue()).f177030g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerEmbeddedFiltersController.f96206b0;
                        ScreenerEmbeddedFiltersController screenerEmbeddedFiltersController2 = this.f248397b;
                        return dli.f.a(screenerEmbeddedFiltersController2, screenerEmbeddedFiltersController2.R2(), zhm.v.k(screenerEmbeddedFiltersController2.O, screenerEmbeddedFiltersController2.P, screenerEmbeddedFiltersController2.Q, screenerEmbeddedFiltersController2.R, screenerEmbeddedFiltersController2.S, screenerEmbeddedFiltersController2.T, screenerEmbeddedFiltersController2.U, screenerEmbeddedFiltersController2.V, screenerEmbeddedFiltersController2.W, screenerEmbeddedFiltersController2.X, new ListSubheaderLoadingDelegate(), new ActionsLoadingDelegate(), new LargeSliderLoadingDelegate(), new RowLoadingDelegate()), R$id.screenScreenerEmbeddedFilters_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerEmbeddedFiltersController.f96206b0;
                        qji.b bVarU2 = screenerEmbeddedFiltersController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.di.ScreenerEmbeddedFiltersControllerComponent.Injector");
                        joh.j jVar = (joh.j) bVarU2;
                        joh.w wVar = jVar.f177011c;
                        joh.j jVar2 = jVar.d;
                        ScreenerEmbeddedFiltersControllerContract$InputData screenerEmbeddedFiltersControllerContract$InputData = screenerEmbeddedFiltersController.K;
                        RowDelegate rowDelegate2 = screenerEmbeddedFiltersController.U;
                        ListSubheaderDelegate listSubheaderDelegate = screenerEmbeddedFiltersController.Q;
                        Intrinsics.checkNotNullParameter(rowDelegate2, "rowDelegate");
                        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
                        avk.j jVar3 = screenerEmbeddedFiltersController.f96207a0;
                        yph.g gVar = new yph.g(listSubheaderDelegate, screenerEmbeddedFiltersController.O, screenerEmbeddedFiltersController.S, screenerEmbeddedFiltersController.V);
                        screenerEmbeddedFiltersControllerContract$InputData.getClass();
                        jVar3.getClass();
                        return new joh.m(wVar, jVar2, screenerEmbeddedFiltersControllerContract$InputData, jVar3, gVar);
                }
            }
        });
        this.f96207a0 = new j(this, 23);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((qph.q) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, f96206b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView screenContentRecyclerView = ((hoh.c) value).f154296b;
        ScreenerEmbeddedFiltersControllerContract$InputData screenerEmbeddedFiltersControllerContract$InputData = this.K;
        screenContentRecyclerView.setTag(new ScreenerEmbeddedFiltersTag(screenerEmbeddedFiltersControllerContract$InputData.f96208a));
        int i2 = b.f248398a[screenerEmbeddedFiltersControllerContract$InputData.f96208a.ordinal()];
        if (i2 == 1) {
            i = R$string.screener_picker_product_stocks_title;
        } else if (i2 == 2) {
            i = R$string.screener_picker_product_etps_title;
        } else if (i2 == 3) {
            i = R$string.screener_picker_product_bonds_title;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.screener_picker_product_cfds_title;
        }
        pd.b.p(view, new TextLocalisedClause(i, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, new b1(rd0.e.b(this.U.f53218h), 12), new k(this, continuation, 0), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.Q;
        d dVarB = rd0.e.b(listSubheaderDelegate.e);
        f fVar = listSubheaderDelegate.d;
        ViewController.P2(this, new g(vkm.q.J(dVarB, rd0.e.b(fVar)), 24), new k(this, continuation, 1), 3);
        ViewController.P2(this, new b1(rd0.e.b(fVar), 13), new k(this, continuation, 2), 3);
        ViewController.P2(this, new b1(rd0.e.b(listSubheaderDelegate.f52707c), 14), new k(this, continuation, 3), 3);
        ViewController.P2(this, new b1(rd0.e.b(this.W.f52371h.f121375b), 11), new qph.j(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Y.getValue();
    }
}
