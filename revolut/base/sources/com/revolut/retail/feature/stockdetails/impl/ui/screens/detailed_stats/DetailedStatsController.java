package com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.R$id;
import com.revolut.retail.feature.stockdetails.impl.R$layout;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsControllerContract$InputData;
import dcf.v0;
import dmj.k;
import dvk.f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nrk.d;
import prk.g0;
import prk.n0;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/detailed_stats/DetailedStatsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Ldvk/h;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DetailedStatsController extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(DetailedStatsController.class, "binding", "getBinding()Lcom/revolut/retail/feature/stockdetails/impl/databinding/ScreenDetailedStatsBinding;", 0))};
    public final DetailedStatsControllerContract$InputData K;
    public final h L;
    public String M;
    public final ListSubheaderDelegate N;
    public final CellDetailsDelegate O;
    public final TextDelegate P;
    public final j Q;
    public final Object R;
    public final Object S;
    public final int T;
    public final Object U;

    public DetailedStatsController(DetailedStatsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, dvk.b.f);
        this.N = new ListSubheaderDelegate();
        this.O = new CellDetailsDelegate();
        this.P = new TextDelegate();
        this.Q = new j(this, 4);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: dvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DetailedStatsController f118145b;

            {
                this.f118145b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DetailedStatsController detailedStatsController = this.f118145b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DetailedStatsController.V;
                        phm.a aVar = (phm.a) ue0.e.j(detailedStatsController.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        DetailedStatsControllerContract$InputData detailedStatsControllerContract$InputData = detailedStatsController.K;
                        avk.j jVar = detailedStatsController.Q;
                        detailedStatsControllerContract$InputData.getClass();
                        jVar.getClass();
                        return new prk.l(g0Var, new srk.a(), detailedStatsControllerContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = DetailedStatsController.V;
                        return (f) ((prk.l) ((evk.a) detailedStatsController.R.getValue())).f239229g.get();
                    default:
                        KProperty[] kPropertyArr3 = DetailedStatsController.V;
                        DetailedStatsController detailedStatsController2 = this.f118145b;
                        return tki.g.a(detailedStatsController2, detailedStatsController2.d(), v.k(detailedStatsController2.N, detailedStatsController2.O, detailedStatsController2.P), R$id.detailedStats_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: dvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DetailedStatsController f118145b;

            {
                this.f118145b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DetailedStatsController detailedStatsController = this.f118145b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DetailedStatsController.V;
                        phm.a aVar = (phm.a) ue0.e.j(detailedStatsController.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        DetailedStatsControllerContract$InputData detailedStatsControllerContract$InputData = detailedStatsController.K;
                        avk.j jVar = detailedStatsController.Q;
                        detailedStatsControllerContract$InputData.getClass();
                        jVar.getClass();
                        return new prk.l(g0Var, new srk.a(), detailedStatsControllerContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = DetailedStatsController.V;
                        return (f) ((prk.l) ((evk.a) detailedStatsController.R.getValue())).f239229g.get();
                    default:
                        KProperty[] kPropertyArr3 = DetailedStatsController.V;
                        DetailedStatsController detailedStatsController2 = this.f118145b;
                        return tki.g.a(detailedStatsController2, detailedStatsController2.d(), v.k(detailedStatsController2.N, detailedStatsController2.O, detailedStatsController2.P), R$id.detailedStats_recyclerView, null, null, null, 56);
                }
            }
        });
        this.T = R$layout.screen_detailed_stats;
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: dvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DetailedStatsController f118145b;

            {
                this.f118145b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DetailedStatsController detailedStatsController = this.f118145b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DetailedStatsController.V;
                        phm.a aVar = (phm.a) ue0.e.j(detailedStatsController.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        DetailedStatsControllerContract$InputData detailedStatsControllerContract$InputData = detailedStatsController.K;
                        avk.j jVar = detailedStatsController.Q;
                        detailedStatsControllerContract$InputData.getClass();
                        jVar.getClass();
                        return new prk.l(g0Var, new srk.a(), detailedStatsControllerContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = DetailedStatsController.V;
                        return (f) ((prk.l) ((evk.a) detailedStatsController.R.getValue())).f239229g.get();
                    default:
                        KProperty[] kPropertyArr3 = DetailedStatsController.V;
                        DetailedStatsController detailedStatsController2 = this.f118145b;
                        return tki.g.a(detailedStatsController2, detailedStatsController2.d(), v.k(detailedStatsController2.N, detailedStatsController2.O, detailedStatsController2.P), R$id.detailedStats_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        dvk.h uiState = (dvk.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f218669b;
        navBarWithToolbar.setTitle(uiState.f118152a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f118152a);
        navBarWithToolbar.setSecondDescriptionText(uiState.f118153b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        Tabs tabs = d3().f218670c;
        ArrayList arrayList = uiState.f118154c;
        String str = uiState.d;
        tabs.setItems(arrayList, str);
        String str2 = this.M;
        if (str2 != null && !str2.equals(str)) {
            ((tki.b) ((tki.a) this.U.getValue())).f271959b.h().scrollToPosition(0);
        }
        this.M = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (evk.a) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f218669b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f218669b.f59410q), new v0(this, null, 20), 3);
        ViewController.P2(this, rd0.e.b(d3().f218670c.f58882b), new dvk.e(this, null, 0), 3);
        ViewController.P2(this, new k(rd0.e.b(this.N.d), 10), new dvk.e(this, null, 1), 3);
        ViewController.P2(this, new k(rd0.e.b(this.O.d), 11), new dvk.e(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.P.d), new dvk.e(this, null, 3), 3);
    }

    public final d d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.U.getValue();
    }
}
