package com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import aw3.u;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard.WaitingListV3DashboardScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard.WaitingListV3DashboardScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import dw3.c1;
import dw3.h7;
import dw3.i7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pgk.d;
import pj4.b;
import pj4.h;
import pj4.i;
import pj4.k;
import te0.w;
import vc.s;
import xki.e;
import yy0.f;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/waiting_list_v3/dashboard/WaitingListV3DashboardScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpj4/h;", "Ldli/a;", "Lpj4/i;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitingListV3DashboardScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(WaitingListV3DashboardScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenWaitingListV3DashboardBinding;", 0))};
    public final WaitingListV3DashboardScreenContract$InputData K;
    public final int L;
    public final ao.h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public WaitingListV3DashboardScreen(WaitingListV3DashboardScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_waiting_list_v3_dashboard;
        this.M = s.t(this, b.f);
        this.N = w.y0(new d(17));
        this.O = w.y0(new d(18));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: pj4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListV3DashboardScreen f236661b;

            {
                this.f236661b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WaitingListV3DashboardScreen waitingListV3DashboardScreen = this.f236661b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WaitingListV3DashboardScreen.S;
                        qji.b bVarU2 = waitingListV3DashboardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard.di.WaitingListV3DashboardScreenInjector");
                        i7 i7Var = (i7) bVarU2;
                        c1 c1Var = i7Var.f118986b;
                        i7 i7Var2 = i7Var.f118987c;
                        WaitingListV3DashboardScreenContract$InputData waitingListV3DashboardScreenContract$InputData = waitingListV3DashboardScreen.K;
                        waitingListV3DashboardScreenContract$InputData.getClass();
                        return new h7(c1Var, i7Var2, waitingListV3DashboardScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = WaitingListV3DashboardScreen.S;
                        return (k) ((h7) waitingListV3DashboardScreen.P.getValue()).f118916b.get();
                    default:
                        KProperty[] kPropertyArr3 = WaitingListV3DashboardScreen.S;
                        WaitingListV3DashboardScreen waitingListV3DashboardScreen2 = this.f236661b;
                        return dli.f.a(waitingListV3DashboardScreen2, waitingListV3DashboardScreen2.R2(), v.k((FullScreenStateDelegate) waitingListV3DashboardScreen2.O.getValue(), new RowLoadingDelegate(), (RowDelegate) waitingListV3DashboardScreen2.N.getValue(), new TextDelegate()), R$id.waitingListV3Dashboard_recyclerView, new pij.d(21), null, null, 48);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: pj4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListV3DashboardScreen f236661b;

            {
                this.f236661b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WaitingListV3DashboardScreen waitingListV3DashboardScreen = this.f236661b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WaitingListV3DashboardScreen.S;
                        qji.b bVarU2 = waitingListV3DashboardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard.di.WaitingListV3DashboardScreenInjector");
                        i7 i7Var = (i7) bVarU2;
                        c1 c1Var = i7Var.f118986b;
                        i7 i7Var2 = i7Var.f118987c;
                        WaitingListV3DashboardScreenContract$InputData waitingListV3DashboardScreenContract$InputData = waitingListV3DashboardScreen.K;
                        waitingListV3DashboardScreenContract$InputData.getClass();
                        return new h7(c1Var, i7Var2, waitingListV3DashboardScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = WaitingListV3DashboardScreen.S;
                        return (k) ((h7) waitingListV3DashboardScreen.P.getValue()).f118916b.get();
                    default:
                        KProperty[] kPropertyArr3 = WaitingListV3DashboardScreen.S;
                        WaitingListV3DashboardScreen waitingListV3DashboardScreen2 = this.f236661b;
                        return dli.f.a(waitingListV3DashboardScreen2, waitingListV3DashboardScreen2.R2(), v.k((FullScreenStateDelegate) waitingListV3DashboardScreen2.O.getValue(), new RowLoadingDelegate(), (RowDelegate) waitingListV3DashboardScreen2.N.getValue(), new TextDelegate()), R$id.waitingListV3Dashboard_recyclerView, new pij.d(21), null, null, 48);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: pj4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListV3DashboardScreen f236661b;

            {
                this.f236661b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WaitingListV3DashboardScreen waitingListV3DashboardScreen = this.f236661b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WaitingListV3DashboardScreen.S;
                        qji.b bVarU2 = waitingListV3DashboardScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard.di.WaitingListV3DashboardScreenInjector");
                        i7 i7Var = (i7) bVarU2;
                        c1 c1Var = i7Var.f118986b;
                        i7 i7Var2 = i7Var.f118987c;
                        WaitingListV3DashboardScreenContract$InputData waitingListV3DashboardScreenContract$InputData = waitingListV3DashboardScreen.K;
                        waitingListV3DashboardScreenContract$InputData.getClass();
                        return new h7(c1Var, i7Var2, waitingListV3DashboardScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = WaitingListV3DashboardScreen.S;
                        return (k) ((h7) waitingListV3DashboardScreen.P.getValue()).f118916b.get();
                    default:
                        KProperty[] kPropertyArr3 = WaitingListV3DashboardScreen.S;
                        WaitingListV3DashboardScreen waitingListV3DashboardScreen2 = this.f236661b;
                        return dli.f.a(waitingListV3DashboardScreen2, waitingListV3DashboardScreen2.R2(), v.k((FullScreenStateDelegate) waitingListV3DashboardScreen2.O.getValue(), new RowLoadingDelegate(), (RowDelegate) waitingListV3DashboardScreen2.N.getValue(), new TextDelegate()), R$id.waitingListV3Dashboard_recyclerView, new pij.d(21), null, null, 48);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        f fVarQ = jh.d.f(m2()).Q();
        Image image = uiState.f236669b;
        UIKitImageView waitingListV3DashboardBackgroundImage = d3().f10729c;
        Intrinsics.checkNotNullExpressionValue(waitingListV3DashboardBackgroundImage, "waitingListV3DashboardBackgroundImage");
        f.e(fVarQ, image, waitingListV3DashboardBackgroundImage, null, null, 12);
        ActionFooterView waitingListV3DashboardActionFooter = d3().f10728b;
        Intrinsics.checkNotNullExpressionValue(waitingListV3DashboardActionFooter, "waitingListV3DashboardActionFooter");
        aw0.i iVar = uiState.f236670c;
        waitingListV3DashboardActionFooter.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            ActionFooterView waitingListV3DashboardActionFooter2 = d3().f10728b;
            Intrinsics.checkNotNullExpressionValue(waitingListV3DashboardActionFooter2, "waitingListV3DashboardActionFooter");
            waitingListV3DashboardActionFooter2.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h7) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        navBarWithToolbar.setExpanded(false, false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.j0(false);
        d3().e.setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59410q), null, new pj4.d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f10728b.f), null, new pj4.d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new p73.d(rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), 11), null, new pfk.o0(this, (Continuation) null, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), null, new pj4.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
