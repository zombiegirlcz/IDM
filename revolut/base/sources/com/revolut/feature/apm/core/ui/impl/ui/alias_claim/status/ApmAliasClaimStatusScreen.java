package com.revolut.feature.apm.core.ui.impl.ui.alias_claim.status;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import co7.c;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimStatusNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.status.ApmAliasClaimStatusScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cvi.b;
import d22.e;
import d22.g;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/alias_claim/status/ApmAliasClaimStatusScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ld22/e;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmAliasClaimStatusScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ApmAliasClaimStatusScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final FullScreenStateDelegate L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;

    public ApmAliasClaimStatusScreen(ApmAliasClaimStatusNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = new FullScreenStateDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: d22.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmAliasClaimStatusScreen f110701b;

            {
                this.f110701b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ApmAliasClaimStatusScreen.Q;
                        ApmAliasClaimStatusScreen apmAliasClaimStatusScreen = this.f110701b;
                        return dli.f.a(apmAliasClaimStatusScreen, (g) apmAliasClaimStatusScreen.O.getValue(), v.k(new ProgressStepVerticalLoadingV2Delegate(), new ProgressStepVerticalV2Delegate(), apmAliasClaimStatusScreen.L), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ApmAliasClaimStatusScreen.Q;
                        return (g) ((p12.q) this.f110701b.N.getValue()).f231746c.get();
                }
            }
        });
        this.N = w.y0(new b(this, inputData, 10));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: d22.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmAliasClaimStatusScreen f110701b;

            {
                this.f110701b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmAliasClaimStatusScreen.Q;
                        ApmAliasClaimStatusScreen apmAliasClaimStatusScreen = this.f110701b;
                        return dli.f.a(apmAliasClaimStatusScreen, (g) apmAliasClaimStatusScreen.O.getValue(), v.k(new ProgressStepVerticalLoadingV2Delegate(), new ProgressStepVerticalV2Delegate(), apmAliasClaimStatusScreen.L), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ApmAliasClaimStatusScreen.Q;
                        return (g) ((p12.q) this.f110701b.N.getValue()).f231746c.get();
                }
            }
        });
        this.P = s.t(this, d22.b.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setSecondDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionText(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p12.q) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.apm_alias_ownership_claim_status_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.apm_alias_ownership_claim_status_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new d22.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
