package com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import df4.a;
import df4.b;
import df4.c;
import df4.f;
import df4.i;
import dw3.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import tx0.x1;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/animated_intro/AnimatedIntroScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Laii/q;", "Lcli/w;", "Ldf4/f;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnimatedIntroScreen extends PluginScreenController<q> implements w {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AnimatedIntroScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditAnimatedIntroBinding;", 0))};
    public final AnimatedIntroScreenContract$InputData L;
    public final i M;
    public boolean N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final Object S;

    public AnimatedIntroScreen(AnimatedIntroScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = new i();
        this.O = R$layout.screen_credit_animated_intro;
        this.P = te0.w.y0(new a(this, 1));
        this.Q = te0.w.y0(new a(this, 2));
        this.R = s.t(this, b.f);
        this.S = te0.w.y0(new a(this, 3));
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        aw0.i iVar = uiState.f113784c;
        if (iVar != null) {
            d3().setModel(iVar);
        }
        NavBarLargeCentred navBarLargeCentredE3 = e3();
        navBarLargeCentredE3.setTopLabel(uiState.f113782a);
        navBarLargeCentredE3.setTitle(uiState.f113783b);
        if (!uiState.d || this.N) {
            return;
        }
        this.N = true;
        ActionFooterView actionFooterViewD3 = d3();
        NavBarLargeCentred navBarLargeCentredE32 = e3();
        a aVar = new a(this, 0);
        this.M.getClass();
        i.b(navBarLargeCentredE32, null, actionFooterViewD3, aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t8) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (df4.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarLargeCentred navBarLargeCentredE3 = e3();
        navBarLargeCentredE3.setAlwaysExpanded(true);
        navBarLargeCentredE3.setTitleStyle(x1.LARGE);
        navBarLargeCentredE3.setShadowVisible(false);
        Context context = navBarLargeCentredE3.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorForeground, context);
        Context context2 = navBarLargeCentredE3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        navBarLargeCentredE3.setTitleGradient(iS, kli.a.s(R$attr.uikit_colorGreyTone50, context2));
        navBarLargeCentredE3.setAlpha(BitmapDescriptorFactory.HUE_RED);
        d3().setAlpha(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f), null, new c(this, null, 0), 3);
    }

    public final ActionFooterView d3() {
        ViewBinding value = this.R.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ActionFooterView creditApplicationFooterActionButton = ((aw3.c) value).f10674b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationFooterActionButton, "creditApplicationFooterActionButton");
        return creditApplicationFooterActionButton;
    }

    public final NavBarLargeCentred e3() {
        ViewBinding value = this.R.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarLargeCentred creditApplicationNavBarLargeCentred = ((aw3.c) value).f10675c;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarLargeCentred, "creditApplicationNavBarLargeCentred");
        return creditApplicationNavBarLargeCentred;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.S.getValue();
    }
}
