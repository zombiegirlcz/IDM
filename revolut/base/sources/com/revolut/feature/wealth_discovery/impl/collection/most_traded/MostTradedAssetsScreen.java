package com.revolut.feature.wealth_discovery.impl.collection.most_traded;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import boh.k;
import boh.p;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination;
import com.revolut.feature.wealth_discovery.impl.collection.most_traded.MostTradedAssetsScreen;
import com.revolut.feature.wealth_discovery.impl.collection.most_traded.MostTradedAssetsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import joh.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tki.c;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/collection/most_traded/MostTradedAssetsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lboh/p;", "Lno/m;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MostTradedAssetsScreen extends ViewController<q> implements c, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(MostTradedAssetsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final MostTradedAssetsScreenContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final TextDelegate N;
    public final j O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public MostTradedAssetsScreen(MostTradedAssetsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, boh.h.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new TextDelegate();
        this.O = new j(this, 1);
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: boh.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MostTradedAssetsScreen f17466b;

            {
                this.f17466b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MostTradedAssetsScreen mostTradedAssetsScreen = this.f17466b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MostTradedAssetsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(mostTradedAssetsScreen.m2()).a().get(joh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", joh.a.class, " is not found"));
                        }
                        joh.a aVar3 = ((joh.a) aVar2.b()).f176957c;
                        MostTradedAssetsScreenContract$InputData mostTradedAssetsScreenContract$InputData = mostTradedAssetsScreen.K;
                        avk.j jVar = mostTradedAssetsScreen.O;
                        mostTradedAssetsScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new joh.b(aVar3, mostTradedAssetsScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = MostTradedAssetsScreen.T;
                        return (m) ((joh.b) mostTradedAssetsScreen.Q.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = MostTradedAssetsScreen.T;
                        MostTradedAssetsScreen mostTradedAssetsScreen2 = this.f17466b;
                        return tki.g.a(mostTradedAssetsScreen2, (m) mostTradedAssetsScreen2.R.getValue(), zhm.v.k(new PlaceholderRowDelegate(), new RowLoadingDelegate(), mostTradedAssetsScreen2.M, mostTradedAssetsScreen2.N), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: boh.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MostTradedAssetsScreen f17466b;

            {
                this.f17466b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MostTradedAssetsScreen mostTradedAssetsScreen = this.f17466b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MostTradedAssetsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(mostTradedAssetsScreen.m2()).a().get(joh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", joh.a.class, " is not found"));
                        }
                        joh.a aVar3 = ((joh.a) aVar2.b()).f176957c;
                        MostTradedAssetsScreenContract$InputData mostTradedAssetsScreenContract$InputData = mostTradedAssetsScreen.K;
                        avk.j jVar = mostTradedAssetsScreen.O;
                        mostTradedAssetsScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new joh.b(aVar3, mostTradedAssetsScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = MostTradedAssetsScreen.T;
                        return (m) ((joh.b) mostTradedAssetsScreen.Q.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = MostTradedAssetsScreen.T;
                        MostTradedAssetsScreen mostTradedAssetsScreen2 = this.f17466b;
                        return tki.g.a(mostTradedAssetsScreen2, (m) mostTradedAssetsScreen2.R.getValue(), zhm.v.k(new PlaceholderRowDelegate(), new RowLoadingDelegate(), mostTradedAssetsScreen2.M, mostTradedAssetsScreen2.N), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: boh.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MostTradedAssetsScreen f17466b;

            {
                this.f17466b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MostTradedAssetsScreen mostTradedAssetsScreen = this.f17466b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MostTradedAssetsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(mostTradedAssetsScreen.m2()).a().get(joh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", joh.a.class, " is not found"));
                        }
                        joh.a aVar3 = ((joh.a) aVar2.b()).f176957c;
                        MostTradedAssetsScreenContract$InputData mostTradedAssetsScreenContract$InputData = mostTradedAssetsScreen.K;
                        avk.j jVar = mostTradedAssetsScreen.O;
                        mostTradedAssetsScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new joh.b(aVar3, mostTradedAssetsScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = MostTradedAssetsScreen.T;
                        return (m) ((joh.b) mostTradedAssetsScreen.Q.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = MostTradedAssetsScreen.T;
                        MostTradedAssetsScreen mostTradedAssetsScreen2 = this.f17466b;
                        return tki.g.a(mostTradedAssetsScreen2, (m) mostTradedAssetsScreen2.R.getValue(), zhm.v.k(new PlaceholderRowDelegate(), new RowLoadingDelegate(), mostTradedAssetsScreen2.M, mostTradedAssetsScreen2.N), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uiState.f17475b, null);
        navBarWithToolbar.setToolbarTitle(uiState.f17475b);
        navBarWithToolbar.setSecondDescriptionText(uiState.f17476c);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setActions(uiState.d);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        MostTradedAssetsDestination mostTradedAssetsDestination = this.K.f96125a;
        MostTradedAssetsDestination.Crypto crypto = mostTradedAssetsDestination instanceof MostTradedAssetsDestination.Crypto ? (MostTradedAssetsDestination.Crypto) mostTradedAssetsDestination : null;
        if (crypto != null) {
            return crypto.f96116c;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (boh.m) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(8);
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new bf5.a(this, null, 23), 3);
        ViewController.P2(this, new bk6.c(rd0.e.b(d3().f174565c.s0()), 8), new k(this, null, 0), 3);
        ViewController.P2(this, new bk6.c(rd0.e.b(this.M.f53218h), 9), new k(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
