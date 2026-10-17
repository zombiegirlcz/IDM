package com.revolut.feature.credit.application.plugins.impl.ui.congratulations.content;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.c;
import cli.o;
import cli.q;
import cli.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import df4.i;
import dli.a;
import dw3.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rr0.f;
import te0.w;
import tx0.x1;
import vc.s;
import vkm.j2;
import wvl.b;
import x64.d;
import x64.e;
import x64.g;
import x64.j;
import x64.k;
import x64.m;
import x64.n;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/congratulations/content/CongratulationsContentScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lx64/m;", "Ldli/a;", "Lx64/o;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CongratulationsContentScreen extends PluginScreenController<m> implements a, c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CongratulationsContentScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditCongratulationBinding;", 0))};
    public final CongratulationsContentScreenContract$InputData L;
    public final i M;
    public final int N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final FullScreenStateDelegate S;
    public f T;

    public CongratulationsContentScreen(CongratulationsContentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = new i();
        this.N = R$layout.screen_credit_congratulation;
        this.O = w.y0(new d(this, 1));
        this.P = w.y0(new d(this, 2));
        this.Q = s.t(this, e.f);
        this.R = w.y0(new d(this, 3));
        this.S = new FullScreenStateDelegate();
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        x64.o uiState = (x64.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton creditCongratulationLargeActionButton = d3().f10683b;
        Intrinsics.checkNotNullExpressionValue(creditCongratulationLargeActionButton, "creditCongratulationLargeActionButton");
        Clause clause = uiState.d;
        creditCongratulationLargeActionButton.setText(clause);
        creditCongratulationLargeActionButton.setVisibility(clause != null ? 0 : 8);
        f fVar = this.T;
        if (fVar == null) {
            Intrinsics.r("mainButtonLoadingController");
            throw null;
        }
        fVar.b(uiState.e);
        NavBarLargeCentred navBarLargeCentredF3 = f3();
        navBarLargeCentredF3.setTopLabel(uiState.f303045b);
        navBarLargeCentredF3.setTitle(uiState.f303046c);
        y yVar = ((x64.c) R2()).f303035r;
        if (((j) ((j2) yVar.f22677a).getValue()).f303041c || ((j) ((j2) yVar.f22677a).getValue()).f303040b.getLoading()) {
            return;
        }
        FrameLayout creditCongratulationLargeActionButtonContainer = d3().f10684c;
        Intrinsics.checkNotNullExpressionValue(creditCongratulationLargeActionButtonContainer, "creditCongratulationLargeActionButtonContainer");
        RecyclerView recyclerViewH = ((dli.c) this.R.getValue()).h();
        NavBarLargeCentred navBarLargeCentredF32 = f3();
        d dVar = new d(this, 0);
        this.M.getClass();
        i.b(navBarLargeCentredF32, recyclerViewH, creditCongratulationLargeActionButtonContainer, dVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((x64.c) R2()).C2(k.f303042a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarLargeCentred navBarLargeCentredF3 = f3();
        navBarLargeCentredF3.setTitleStyle(x1.LARGE);
        navBarLargeCentredF3.setShadowVisible(false);
        Context context = navBarLargeCentredF3.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorForeground, context);
        Context context2 = navBarLargeCentredF3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        navBarLargeCentredF3.setTitleGradient(iS, kli.a.s(R$attr.uikit_colorGreyTone50, context2));
        navBarLargeCentredF3.setAlpha(BitmapDescriptorFactory.HUE_RED);
        FrameLayout creditCongratulationLargeActionButtonContainer = d3().f10684c;
        Intrinsics.checkNotNullExpressionValue(creditCongratulationLargeActionButtonContainer, "creditCongratulationLargeActionButtonContainer");
        creditCongratulationLargeActionButtonContainer.setAlpha(BitmapDescriptorFactory.HUE_RED);
        LargeActionButton creditCongratulationLargeActionButton = d3().f10683b;
        Intrinsics.checkNotNullExpressionValue(creditCongratulationLargeActionButton, "creditCongratulationLargeActionButton");
        this.T = creditCongratulationLargeActionButton.A.V();
        ((dli.c) this.R.getValue()).h().setTag(R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        f3().animate().cancel();
        ((dli.c) this.R.getValue()).h().animate().cancel();
        FrameLayout creditCongratulationLargeActionButtonContainer = d3().f10684c;
        Intrinsics.checkNotNullExpressionValue(creditCongratulationLargeActionButtonContainer, "creditCongratulationLargeActionButtonContainer");
        creditCongratulationLargeActionButtonContainer.animate().cancel();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f59292m), null, new x64.h(this, null, 1), 3);
        LargeActionButton creditCongratulationLargeActionButton = d3().f10683b;
        Intrinsics.checkNotNullExpressionValue(creditCongratulationLargeActionButton, "creditCongratulationLargeActionButton");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(creditCongratulationLargeActionButton.o), null, new x64.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new b(rd0.e.b(f3().D()), 17), null, new x64.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52371h.f121375b), null, new g(this, null), 3);
    }

    public final aw3.f d3() {
        ViewBinding value = this.Q.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.P.getValue();
    }

    public final NavBarLargeCentred f3() {
        NavBarLargeCentred creditCongratulationNavBarLargeCentred = d3().d;
        Intrinsics.checkNotNullExpressionValue(creditCongratulationNavBarLargeCentred, "creditCongratulationNavBarLargeCentred");
        return creditCongratulationNavBarLargeCentred;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
