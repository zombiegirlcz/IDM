package com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pod_nominees.impl.R$string;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage.PodNomineesPercentageScreen;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage.PodNomineesPercentageScreenContract$InputData;
import dli.a;
import kek.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import uek.b;
import uek.c;
import uek.d;
import uek.m;
import vc.s;
import xki.e;
import yhm.j;
import yhm.k;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/impl/pod_nominees_percentage/PodNomineesPercentageScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Luek/h;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PodNomineesPercentageScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PodNomineesPercentageScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final PodNomineesPercentageScreenContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final h Q;

    public PodNomineesPercentageScreen(PodNomineesPercentageScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: uek.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PodNomineesPercentageScreen f279462b;

            {
                this.f279462b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PodNomineesPercentageScreen podNomineesPercentageScreen = this.f279462b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PodNomineesPercentageScreen.R;
                        PodNomineesPercentageScreen podNomineesPercentageScreen2 = this.f279462b;
                        return dli.f.a(podNomineesPercentageScreen2, (m) podNomineesPercentageScreen2.O.getValue(), v.k((RowDelegate) podNomineesPercentageScreen2.P.getValue(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PodNomineesPercentageScreen.R;
                        qji.b bVarU2 = podNomineesPercentageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage.di.PodNomineesPercentageScreenInjector");
                        kek.d dVar = (kek.d) bVarU2;
                        kek.c cVar = dVar.f183128b;
                        kek.d dVar2 = dVar.f183129c;
                        PodNomineesPercentageScreenContract$InputData podNomineesPercentageScreenContract$InputData = podNomineesPercentageScreen.K;
                        podNomineesPercentageScreenContract$InputData.getClass();
                        return new kek.f(cVar, dVar2, podNomineesPercentageScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PodNomineesPercentageScreen.R;
                        return (m) ((kek.f) podNomineesPercentageScreen.N.getValue()).f183135c.get();
                    default:
                        KProperty[] kPropertyArr4 = PodNomineesPercentageScreen.R;
                        return new RowDelegate(null, new u7k.w(podNomineesPercentageScreen, 15), 5);
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: uek.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PodNomineesPercentageScreen f279462b;

            {
                this.f279462b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PodNomineesPercentageScreen podNomineesPercentageScreen = this.f279462b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PodNomineesPercentageScreen.R;
                        PodNomineesPercentageScreen podNomineesPercentageScreen2 = this.f279462b;
                        return dli.f.a(podNomineesPercentageScreen2, (m) podNomineesPercentageScreen2.O.getValue(), v.k((RowDelegate) podNomineesPercentageScreen2.P.getValue(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PodNomineesPercentageScreen.R;
                        qji.b bVarU2 = podNomineesPercentageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage.di.PodNomineesPercentageScreenInjector");
                        kek.d dVar = (kek.d) bVarU2;
                        kek.c cVar = dVar.f183128b;
                        kek.d dVar2 = dVar.f183129c;
                        PodNomineesPercentageScreenContract$InputData podNomineesPercentageScreenContract$InputData = podNomineesPercentageScreen.K;
                        podNomineesPercentageScreenContract$InputData.getClass();
                        return new kek.f(cVar, dVar2, podNomineesPercentageScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PodNomineesPercentageScreen.R;
                        return (m) ((kek.f) podNomineesPercentageScreen.N.getValue()).f183135c.get();
                    default:
                        KProperty[] kPropertyArr4 = PodNomineesPercentageScreen.R;
                        return new RowDelegate(null, new u7k.w(podNomineesPercentageScreen, 15), 5);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: uek.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PodNomineesPercentageScreen f279462b;

            {
                this.f279462b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PodNomineesPercentageScreen podNomineesPercentageScreen = this.f279462b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PodNomineesPercentageScreen.R;
                        PodNomineesPercentageScreen podNomineesPercentageScreen2 = this.f279462b;
                        return dli.f.a(podNomineesPercentageScreen2, (m) podNomineesPercentageScreen2.O.getValue(), v.k((RowDelegate) podNomineesPercentageScreen2.P.getValue(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PodNomineesPercentageScreen.R;
                        qji.b bVarU2 = podNomineesPercentageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage.di.PodNomineesPercentageScreenInjector");
                        kek.d dVar = (kek.d) bVarU2;
                        kek.c cVar = dVar.f183128b;
                        kek.d dVar2 = dVar.f183129c;
                        PodNomineesPercentageScreenContract$InputData podNomineesPercentageScreenContract$InputData = podNomineesPercentageScreen.K;
                        podNomineesPercentageScreenContract$InputData.getClass();
                        return new kek.f(cVar, dVar2, podNomineesPercentageScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PodNomineesPercentageScreen.R;
                        return (m) ((kek.f) podNomineesPercentageScreen.N.getValue()).f183135c.get();
                    default:
                        KProperty[] kPropertyArr4 = PodNomineesPercentageScreen.R;
                        return new RowDelegate(null, new u7k.w(podNomineesPercentageScreen, 15), 5);
                }
            }
        });
        final int i5 = 3;
        this.P = j.c(k.NONE, new Function0(this) { // from class: uek.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PodNomineesPercentageScreen f279462b;

            {
                this.f279462b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PodNomineesPercentageScreen podNomineesPercentageScreen = this.f279462b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PodNomineesPercentageScreen.R;
                        PodNomineesPercentageScreen podNomineesPercentageScreen2 = this.f279462b;
                        return dli.f.a(podNomineesPercentageScreen2, (m) podNomineesPercentageScreen2.O.getValue(), v.k((RowDelegate) podNomineesPercentageScreen2.P.getValue(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PodNomineesPercentageScreen.R;
                        qji.b bVarU2 = podNomineesPercentageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage.di.PodNomineesPercentageScreenInjector");
                        kek.d dVar = (kek.d) bVarU2;
                        kek.c cVar = dVar.f183128b;
                        kek.d dVar2 = dVar.f183129c;
                        PodNomineesPercentageScreenContract$InputData podNomineesPercentageScreenContract$InputData = podNomineesPercentageScreen.K;
                        podNomineesPercentageScreenContract$InputData.getClass();
                        return new kek.f(cVar, dVar2, podNomineesPercentageScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PodNomineesPercentageScreen.R;
                        return (m) ((kek.f) podNomineesPercentageScreen.N.getValue()).f183135c.get();
                    default:
                        KProperty[] kPropertyArr4 = PodNomineesPercentageScreen.R;
                        return new RowDelegate(null, new u7k.w(podNomineesPercentageScreen, 15), 5);
                }
            }
        });
        this.Q = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        uek.h uiState = (uek.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        jii.s sVarD3 = d3();
        FooterTextView footerTextView = sVarD3.f174558c;
        d dVar = uiState.f279474b;
        footerTextView.setTextClause(dVar.f279465c);
        FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView = sVarD3.f174558c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView, "screenRecyclerNavbarFooterNextbuttonFooterView");
        screenRecyclerNavbarFooterNextbuttonFooterView.setVisibility(dVar.f279465c != null ? 0 : 8);
        sVarD3.e.setMenuItems(dVar.f279464b);
        sVarD3.f174557b.setEnabled(dVar.f279463a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (m) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pod_nominees_edit_percentage_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(new TextLocalisedClause(R$string.pod_nominees_edit_percentage_cta_title, null, null, 14));
        largeActionButton.setLoadingButtonTag("POD_PERCENTAGE_CTA_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o.f57403b), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new c(this, continuation, 2), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
