package com.revolut.feature.wealth_discovery.impl.collection.top_movers;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination;
import com.revolut.feature.wealth_discovery.impl.collection.top_movers.TopMoversScreen;
import com.revolut.feature.wealth_discovery.impl.collection.top_movers.TopMoversScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ff4.z;
import foh.k;
import foh.n;
import foh.r;
import grl.k9;
import jii.u;
import joh.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import pki.b;
import te0.w;
import tki.c;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/collection/top_movers/TopMoversScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lfoh/r;", "Lno/m;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopMoversScreen extends ViewController<q> implements c, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TopMoversScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TopMoversScreenContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final TextDelegate N;
    public final j O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TopMoversScreen(TopMoversScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, k.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new TextDelegate();
        this.O = new j(this, 6);
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: foh.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopMoversScreen f136969b;

            {
                this.f136969b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TopMoversScreen topMoversScreen = this.f136969b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TopMoversScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(topMoversScreen.m2()).a().get(joh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", joh.a.class, " is not found"));
                        }
                        joh.a aVar3 = ((joh.a) aVar2.b()).f176957c;
                        TopMoversScreenContract$InputData topMoversScreenContract$InputData = topMoversScreen.K;
                        avk.j jVar = topMoversScreen.O;
                        topMoversScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new joh.d(aVar3, topMoversScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TopMoversScreen.T;
                        return (o) ((joh.d) topMoversScreen.Q.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TopMoversScreen.T;
                        TopMoversScreen topMoversScreen2 = this.f136969b;
                        return tki.g.a(topMoversScreen2, (o) topMoversScreen2.R.getValue(), zhm.v.k(new PlaceholderRowDelegate(), new RowLoadingDelegate(), topMoversScreen2.M, topMoversScreen2.N), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: foh.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopMoversScreen f136969b;

            {
                this.f136969b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TopMoversScreen topMoversScreen = this.f136969b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TopMoversScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(topMoversScreen.m2()).a().get(joh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", joh.a.class, " is not found"));
                        }
                        joh.a aVar3 = ((joh.a) aVar2.b()).f176957c;
                        TopMoversScreenContract$InputData topMoversScreenContract$InputData = topMoversScreen.K;
                        avk.j jVar = topMoversScreen.O;
                        topMoversScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new joh.d(aVar3, topMoversScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TopMoversScreen.T;
                        return (o) ((joh.d) topMoversScreen.Q.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TopMoversScreen.T;
                        TopMoversScreen topMoversScreen2 = this.f136969b;
                        return tki.g.a(topMoversScreen2, (o) topMoversScreen2.R.getValue(), zhm.v.k(new PlaceholderRowDelegate(), new RowLoadingDelegate(), topMoversScreen2.M, topMoversScreen2.N), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: foh.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopMoversScreen f136969b;

            {
                this.f136969b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TopMoversScreen topMoversScreen = this.f136969b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TopMoversScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(topMoversScreen.m2()).a().get(joh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", joh.a.class, " is not found"));
                        }
                        joh.a aVar3 = ((joh.a) aVar2.b()).f176957c;
                        TopMoversScreenContract$InputData topMoversScreenContract$InputData = topMoversScreen.K;
                        avk.j jVar = topMoversScreen.O;
                        topMoversScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new joh.d(aVar3, topMoversScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TopMoversScreen.T;
                        return (o) ((joh.d) topMoversScreen.Q.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TopMoversScreen.T;
                        TopMoversScreen topMoversScreen2 = this.f136969b;
                        return tki.g.a(topMoversScreen2, (o) topMoversScreen2.R.getValue(), zhm.v.k(new PlaceholderRowDelegate(), new RowLoadingDelegate(), topMoversScreen2.M, topMoversScreen2.N), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uiState.f136977b, null);
        navBarWithToolbar.setToolbarTitle(uiState.f136977b);
        Clause clause = uiState.f136978c;
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setActions(uiState.d);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        TopMoversDestination topMoversDestination = this.K.f96139a;
        if (topMoversDestination instanceof TopMoversDestination.Crypto) {
            return ((TopMoversDestination.Crypto) topMoversDestination).f96122c;
        }
        if (!(topMoversDestination instanceof TopMoversDestination.Trading)) {
            throw new NoWhenBranchMatchedException();
        }
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (foh.o) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(8);
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new z(this, null, 24), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(d3().f174565c.s0()), 4), new n(this, null, 0), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(this.M.f53218h), 5), new n(this, null, 1), 3);
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
