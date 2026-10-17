package com.revolut.feature.credit.application.plugins.impl.ui.personal_details.customer_identification;

import aii.r;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.kompot.common.R$layout;
import dli.a;
import dli.c;
import dw3.t1;
import ff4.z;
import fg4.b;
import fg4.d;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/personal_details/customer_identification/CustomerIdentificationScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Laii/r;", "Ldli/a;", "Lfg4/d;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomerIdentificationScreen extends PluginScreenController<r> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CustomerIdentificationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public CustomerIdentificationScreen(CustomerIdentificationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = w.y0(new fg4.a(this, inputData));
        this.O = w.y0(new fg4.a(this, 1));
        this.P = w.y0(new fg4.a(this, 2));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f134898b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (fg4.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new z(this, null, 4), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
