package com.revolut.feature.wealth.mutual_funds.impl.ui.mutual_fund_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.mutual_funds.api.ui.details.MutualFundDetailsContract$InputData;
import com.revolut.feature.wealth.mutual_funds.impl.ui.mutual_fund_details.MutualFundDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import feh.b;
import feh.c;
import feh.d;
import feh.e;
import feh.i;
import feh.j;
import feh.k;
import ieh.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/mutual_funds/impl/ui/mutual_fund_details/MutualFundDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "feature_wealth_mutual_funds_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MutualFundDetailsScreen extends ViewController<Object> implements a {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f95717b0 = {o0.f186429a.j(new h0(MutualFundDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinHorizontalButtonsBinding;", 0))};
    public final MutualFundDetailsContract$InputData K;
    public final h L;
    public final TrendViewDelegate M;
    public final FixedTabsDelegate N;
    public final HeaderDelegate O;
    public final RowDelegate P;
    public final ListSubheaderDelegate Q;
    public final SwipeToActionDelegate R;
    public final Object S;
    public final int T;
    public final Object U;
    public final Object V;
    public final c W;
    public final f4h.a X;
    public final e Y;
    public final d Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final avk.h f95718a0;

    public MutualFundDetailsScreen(MutualFundDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new TrendViewDelegate(1000L);
        this.N = new FixedTabsDelegate();
        this.O = new HeaderDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new ListSubheaderDelegate();
        this.R = new SwipeToActionDelegate(rowDelegate, false);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: feh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MutualFundDetailsScreen f134614b;

            {
                this.f134614b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MutualFundDetailsScreen mutualFundDetailsScreen = this.f134614b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MutualFundDetailsScreen.f95717b0;
                        return (h) ((deh.a) ((ieh.f) mutualFundDetailsScreen.V.getValue())).H.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MutualFundDetailsScreen.f95717b0;
                        MutualFundDetailsScreen mutualFundDetailsScreen2 = this.f134614b;
                        return dli.f.a(mutualFundDetailsScreen2, (h) mutualFundDetailsScreen2.S.getValue(), v.k(mutualFundDetailsScreen2.M, mutualFundDetailsScreen2.N, mutualFundDetailsScreen2.O, mutualFundDetailsScreen2.P, new RowLoadingDelegate(), mutualFundDetailsScreen2.Q, mutualFundDetailsScreen2.R), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = MutualFundDetailsScreen.f95717b0;
                        phm.a aVar = (phm.a) ue0.e.j(mutualFundDetailsScreen.m2()).a().get(deh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", deh.b.class, " is not found"));
                        }
                        deh.b bVar = ((deh.b) aVar2.b()).i;
                        MutualFundDetailsContract$InputData mutualFundDetailsContract$InputData = mutualFundDetailsScreen.K;
                        mutualFundDetailsContract$InputData.getClass();
                        c cVar = mutualFundDetailsScreen.W;
                        cVar.getClass();
                        f4h.a aVar3 = mutualFundDetailsScreen.X;
                        aVar3.getClass();
                        v2h.c cVar2 = new v2h.c(mutualFundDetailsScreen.P);
                        e eVar = mutualFundDetailsScreen.Y;
                        eVar.getClass();
                        d dVar = mutualFundDetailsScreen.Z;
                        dVar.getClass();
                        avk.h hVar = mutualFundDetailsScreen.f95718a0;
                        hVar.getClass();
                        return new deh.a(bVar, new f3h.b(), new f3h.a(), mutualFundDetailsContract$InputData, cVar, aVar3, cVar2, eVar, dVar, hVar);
                }
            }
        });
        this.T = R$layout.screen_recycler_navbar_twin_horizontal_buttons;
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: feh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MutualFundDetailsScreen f134614b;

            {
                this.f134614b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MutualFundDetailsScreen mutualFundDetailsScreen = this.f134614b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MutualFundDetailsScreen.f95717b0;
                        return (h) ((deh.a) ((ieh.f) mutualFundDetailsScreen.V.getValue())).H.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MutualFundDetailsScreen.f95717b0;
                        MutualFundDetailsScreen mutualFundDetailsScreen2 = this.f134614b;
                        return dli.f.a(mutualFundDetailsScreen2, (h) mutualFundDetailsScreen2.S.getValue(), v.k(mutualFundDetailsScreen2.M, mutualFundDetailsScreen2.N, mutualFundDetailsScreen2.O, mutualFundDetailsScreen2.P, new RowLoadingDelegate(), mutualFundDetailsScreen2.Q, mutualFundDetailsScreen2.R), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = MutualFundDetailsScreen.f95717b0;
                        phm.a aVar = (phm.a) ue0.e.j(mutualFundDetailsScreen.m2()).a().get(deh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", deh.b.class, " is not found"));
                        }
                        deh.b bVar = ((deh.b) aVar2.b()).i;
                        MutualFundDetailsContract$InputData mutualFundDetailsContract$InputData = mutualFundDetailsScreen.K;
                        mutualFundDetailsContract$InputData.getClass();
                        c cVar = mutualFundDetailsScreen.W;
                        cVar.getClass();
                        f4h.a aVar3 = mutualFundDetailsScreen.X;
                        aVar3.getClass();
                        v2h.c cVar2 = new v2h.c(mutualFundDetailsScreen.P);
                        e eVar = mutualFundDetailsScreen.Y;
                        eVar.getClass();
                        d dVar = mutualFundDetailsScreen.Z;
                        dVar.getClass();
                        avk.h hVar = mutualFundDetailsScreen.f95718a0;
                        hVar.getClass();
                        return new deh.a(bVar, new f3h.b(), new f3h.a(), mutualFundDetailsContract$InputData, cVar, aVar3, cVar2, eVar, dVar, hVar);
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: feh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MutualFundDetailsScreen f134614b;

            {
                this.f134614b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MutualFundDetailsScreen mutualFundDetailsScreen = this.f134614b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MutualFundDetailsScreen.f95717b0;
                        return (h) ((deh.a) ((ieh.f) mutualFundDetailsScreen.V.getValue())).H.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MutualFundDetailsScreen.f95717b0;
                        MutualFundDetailsScreen mutualFundDetailsScreen2 = this.f134614b;
                        return dli.f.a(mutualFundDetailsScreen2, (h) mutualFundDetailsScreen2.S.getValue(), v.k(mutualFundDetailsScreen2.M, mutualFundDetailsScreen2.N, mutualFundDetailsScreen2.O, mutualFundDetailsScreen2.P, new RowLoadingDelegate(), mutualFundDetailsScreen2.Q, mutualFundDetailsScreen2.R), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = MutualFundDetailsScreen.f95717b0;
                        phm.a aVar = (phm.a) ue0.e.j(mutualFundDetailsScreen.m2()).a().get(deh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", deh.b.class, " is not found"));
                        }
                        deh.b bVar = ((deh.b) aVar2.b()).i;
                        MutualFundDetailsContract$InputData mutualFundDetailsContract$InputData = mutualFundDetailsScreen.K;
                        mutualFundDetailsContract$InputData.getClass();
                        c cVar = mutualFundDetailsScreen.W;
                        cVar.getClass();
                        f4h.a aVar3 = mutualFundDetailsScreen.X;
                        aVar3.getClass();
                        v2h.c cVar2 = new v2h.c(mutualFundDetailsScreen.P);
                        e eVar = mutualFundDetailsScreen.Y;
                        eVar.getClass();
                        d dVar = mutualFundDetailsScreen.Z;
                        dVar.getClass();
                        avk.h hVar = mutualFundDetailsScreen.f95718a0;
                        hVar.getClass();
                        return new deh.a(bVar, new f3h.b(), new f3h.a(), mutualFundDetailsContract$InputData, cVar, aVar3, cVar2, eVar, dVar, hVar);
                }
            }
        });
        this.W = new c(this);
        this.X = new f4h.a(this, 1);
        this.Y = new e(this);
        this.Z = new d(this);
        this.f95718a0 = new avk.h(this);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        j jVar = uiState.f134627a;
        if (jVar != null) {
            if (jVar instanceof i) {
                i iVar = (i) jVar;
                navBarWithToolbar.l0();
                navBarWithToolbar.setDescriptionText(iVar.f134623a);
                navBarWithToolbar.setEndImage(new yy0.j(iVar.f134624b));
            } else {
                if (!(jVar instanceof j.a) && !(jVar instanceof j.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithToolbar.I0(t3.DEFAULT, true);
            }
        }
        x2h.b bVar = uiState.f134628b;
        TwinHorizontalButton twinHorizontalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(twinHorizontalButton, "twinHorizontalButton");
        n2h.h.a(bVar, twinHorizontalButton);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (feh.h) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitleAutoSize(true);
        navBarWithToolbar.setTitleVisible(false);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174567b.f59410q), new ev7.b(this, null, 27), 3);
    }

    public final jii.v d3() {
        ViewBinding value = this.L.getValue(this, f95717b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.v) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
