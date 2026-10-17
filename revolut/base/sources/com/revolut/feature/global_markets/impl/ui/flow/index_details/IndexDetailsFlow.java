package com.revolut.feature.global_markets.impl.ui.flow.index_details;

import aii.q;
import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.global_markets.impl.R$id;
import com.revolut.feature.global_markets.impl.R$layout;
import com.revolut.feature.global_markets.impl.ui.flow.index_details.IndexDetailsFlow;
import com.revolut.feature.global_markets.impl.ui.flow.index_details.IndexDetailsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import dze.n;
import e87.c;
import e87.d;
import e87.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/global_markets/impl/ui/flow/index_details/IndexDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lali/g;", "Le87/d;", "Lcom/revolut/feature/global_markets/impl/ui/flow/index_details/IndexDetailsFlowContract$PagerItem;", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndexDetailsFlow extends ViewController<q> implements g {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(IndexDetailsFlow.class, "binding", "getBinding()Lcom/revolut/feature/global_markets/impl/databinding/FlowIndexDetailsBinding;", 0))};
    public final IndexDetailsFlowContract$InputData K;
    public final h L;
    public final int M;
    public final boolean N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public IndexDetailsFlow(IndexDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, e87.b.f);
        this.M = R$layout.flow_index_details;
        this.N = true;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: e87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexDetailsFlow f123607b;

            {
                this.f123607b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IndexDetailsFlow indexDetailsFlow = this.f123607b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IndexDetailsFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(indexDetailsFlow.m2()).a().get(y77.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y77.c.class, " is not found"));
                        }
                        y77.c cVar = ((y77.c) aVar2.b()).f311372r;
                        IndexDetailsFlowContract$InputData indexDetailsFlowContract$InputData = indexDetailsFlow.K;
                        indexDetailsFlowContract$InputData.getClass();
                        return new y77.e(cVar, indexDetailsFlow, indexDetailsFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IndexDetailsFlow.R;
                        return (c) ((y77.e) indexDetailsFlow.O.getValue()).f311385j.get();
                    default:
                        KProperty[] kPropertyArr3 = IndexDetailsFlow.R;
                        return mif.a.a(indexDetailsFlow, 0, R$id.flowIndexDetails_Pager, (c) indexDetailsFlow.P.getValue(), 5);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: e87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexDetailsFlow f123607b;

            {
                this.f123607b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IndexDetailsFlow indexDetailsFlow = this.f123607b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IndexDetailsFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(indexDetailsFlow.m2()).a().get(y77.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y77.c.class, " is not found"));
                        }
                        y77.c cVar = ((y77.c) aVar2.b()).f311372r;
                        IndexDetailsFlowContract$InputData indexDetailsFlowContract$InputData = indexDetailsFlow.K;
                        indexDetailsFlowContract$InputData.getClass();
                        return new y77.e(cVar, indexDetailsFlow, indexDetailsFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IndexDetailsFlow.R;
                        return (c) ((y77.e) indexDetailsFlow.O.getValue()).f311385j.get();
                    default:
                        KProperty[] kPropertyArr3 = IndexDetailsFlow.R;
                        return mif.a.a(indexDetailsFlow, 0, R$id.flowIndexDetails_Pager, (c) indexDetailsFlow.P.getValue(), 5);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: e87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexDetailsFlow f123607b;

            {
                this.f123607b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IndexDetailsFlow indexDetailsFlow = this.f123607b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IndexDetailsFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(indexDetailsFlow.m2()).a().get(y77.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y77.c.class, " is not found"));
                        }
                        y77.c cVar = ((y77.c) aVar2.b()).f311372r;
                        IndexDetailsFlowContract$InputData indexDetailsFlowContract$InputData = indexDetailsFlow.K;
                        indexDetailsFlowContract$InputData.getClass();
                        return new y77.e(cVar, indexDetailsFlow, indexDetailsFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IndexDetailsFlow.R;
                        return (c) ((y77.e) indexDetailsFlow.O.getValue()).f311385j.get();
                    default:
                        KProperty[] kPropertyArr3 = IndexDetailsFlow.R;
                        return mif.a.a(indexDetailsFlow, 0, R$id.flowIndexDetails_Pager, (c) indexDetailsFlow.P.getValue(), 5);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f295491b;
        navBarWithToolbar.setDescriptionText(uiState.f123610c);
        navBarWithToolbar.setToolbarTitle(uiState.f123610c);
        navBarWithToolbar.setEndIconImage(uiState.f123612h);
        navBarWithToolbar.setSecondDescriptionText(uiState.d);
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, uiState.e, uiState.f, null, 4, null);
        navBarWithToolbar.setMenuItems(uiState.f123611g);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        IndexDetailsFlowContract$PagerItem pagerItem2 = (IndexDetailsFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        b bVar = (b) ((c) this.P.getValue());
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        bVar.H2(bVar.f74594t, new e(pagerItem2, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (y77.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (y77.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f295491b.f59410q), null, new n(this, null, 19), 3);
        NavBarWithToolbar navBarWithToolbar = d3().f295491b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        navBarWithToolbar.setTitleVisible(false);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f295491b.o.f57403b), null, new e0b.c(this, null, 23), 3);
    }

    public final w77.b d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w77.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
