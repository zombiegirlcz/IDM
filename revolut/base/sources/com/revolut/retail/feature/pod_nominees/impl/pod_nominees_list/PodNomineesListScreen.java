package com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list.PodNomineesListScreen;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list.PodNomineesListScreenContract$InputData;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sek.b;
import sek.c;
import sek.d;
import sek.f;
import sek.g;
import sek.j;
import sek.k;
import sek.m;
import sek.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/impl/pod_nominees_list/PodNomineesListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsek/k;", "Ldli/a;", "Lsek/n;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PodNomineesListScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PodNomineesListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PodNomineesListScreenContract$InputData K;
    public final FullScreenStateDelegate L;
    public final ListSubheaderDelegate M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final int Q;
    public final Object R;
    public final h S;

    public PodNomineesListScreen(PodNomineesListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new FullScreenStateDelegate();
        this.M = new ListSubheaderDelegate();
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: sek.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PodNomineesListScreen f262203b;

            {
                this.f262203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PodNomineesListScreen podNomineesListScreen = this.f262203b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PodNomineesListScreen.T;
                        PodNomineesListScreen podNomineesListScreen2 = this.f262203b;
                        return dli.f.a(podNomineesListScreen2, podNomineesListScreen2.R2(), v.k(podNomineesListScreen2.N, podNomineesListScreen2.L, new RowLoadingDelegate(), podNomineesListScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PodNomineesListScreen.T;
                        qji.b bVarU2 = podNomineesListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list.di.PodNomineesListScreenInjector");
                        kek.d dVar = (kek.d) bVarU2;
                        kek.c cVar = dVar.f183128b;
                        kek.d dVar2 = dVar.f183129c;
                        PodNomineesListScreenContract$InputData podNomineesListScreenContract$InputData = podNomineesListScreen.K;
                        podNomineesListScreenContract$InputData.getClass();
                        return new kek.e(cVar, dVar2, podNomineesListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PodNomineesListScreen.T;
                        return (m) ((kek.e) podNomineesListScreen.P.getValue()).f183132c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: sek.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PodNomineesListScreen f262203b;

            {
                this.f262203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PodNomineesListScreen podNomineesListScreen = this.f262203b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PodNomineesListScreen.T;
                        PodNomineesListScreen podNomineesListScreen2 = this.f262203b;
                        return dli.f.a(podNomineesListScreen2, podNomineesListScreen2.R2(), v.k(podNomineesListScreen2.N, podNomineesListScreen2.L, new RowLoadingDelegate(), podNomineesListScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PodNomineesListScreen.T;
                        qji.b bVarU2 = podNomineesListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list.di.PodNomineesListScreenInjector");
                        kek.d dVar = (kek.d) bVarU2;
                        kek.c cVar = dVar.f183128b;
                        kek.d dVar2 = dVar.f183129c;
                        PodNomineesListScreenContract$InputData podNomineesListScreenContract$InputData = podNomineesListScreen.K;
                        podNomineesListScreenContract$InputData.getClass();
                        return new kek.e(cVar, dVar2, podNomineesListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PodNomineesListScreen.T;
                        return (m) ((kek.e) podNomineesListScreen.P.getValue()).f183132c.get();
                }
            }
        });
        this.Q = R$layout.screen_recycler_navbar_nextbutton;
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: sek.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PodNomineesListScreen f262203b;

            {
                this.f262203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PodNomineesListScreen podNomineesListScreen = this.f262203b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PodNomineesListScreen.T;
                        PodNomineesListScreen podNomineesListScreen2 = this.f262203b;
                        return dli.f.a(podNomineesListScreen2, podNomineesListScreen2.R2(), v.k(podNomineesListScreen2.N, podNomineesListScreen2.L, new RowLoadingDelegate(), podNomineesListScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PodNomineesListScreen.T;
                        qji.b bVarU2 = podNomineesListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list.di.PodNomineesListScreenInjector");
                        kek.d dVar = (kek.d) bVarU2;
                        kek.c cVar = dVar.f183128b;
                        kek.d dVar2 = dVar.f183129c;
                        PodNomineesListScreenContract$InputData podNomineesListScreenContract$InputData = podNomineesListScreen.K;
                        podNomineesListScreenContract$InputData.getClass();
                        return new kek.e(cVar, dVar2, podNomineesListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PodNomineesListScreen.T;
                        return (m) ((kek.e) podNomineesListScreen.P.getValue()).f183132c.get();
                }
            }
        });
        this.S = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        j jVar = uiState.f262214b;
        navBarWithToolbar.setTitle(jVar.f262207a, null);
        navBarWithToolbar.setSecondDescriptionText(jVar.f262208b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        sek.h hVar = uiState.f262215c;
        largeActionButton.setText(hVar.f262204a);
        largeActionButton.setVisibility(hVar.f262205b ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (kek.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.K.f102623b) {
            d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52707c), new sek.e(this, null), 3);
        RowDelegate rowDelegate = this.N;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53220l), new g(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m R2() {
        return (m) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
