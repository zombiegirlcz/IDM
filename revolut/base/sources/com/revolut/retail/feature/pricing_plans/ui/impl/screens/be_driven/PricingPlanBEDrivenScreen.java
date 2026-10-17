package com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.PricingPlanBEDrivenScreen;
import dli.a;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oa2.b;
import ocb.d;
import ojk.c0;
import ojk.i0;
import ojk.k0;
import ojk.l0;
import qgk.n1;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/be_driven/PricingPlanBEDrivenScreen;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/be_driven/BasePricingPlanBEDrivenViewController;", "Laii/q;", "Ldli/a;", "Lojk/k0;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PricingPlanBEDrivenScreen extends BasePricingPlanBEDrivenViewController<q> implements a {
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(PricingPlanBEDrivenScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final boolean f103367d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final h f103368e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f103369h0;
    public final Object i0;

    public PricingPlanBEDrivenScreen(PricingPlanBEDrivenScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.c0 = R$layout.screen_recycler_navbar;
        this.f103367d0 = true;
        this.f103368e0 = s.t(this, i0.f);
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: ojk.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PricingPlanBEDrivenScreen f225822b;

            {
                this.f225822b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PricingPlanBEDrivenScreen pricingPlanBEDrivenScreen = this.f225822b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PricingPlanBEDrivenScreen.j0;
                        PricingPlanBEDrivenScreen pricingPlanBEDrivenScreen2 = this.f225822b;
                        return dli.f.a(pricingPlanBEDrivenScreen2, (l0) pricingPlanBEDrivenScreen2.f103369h0.getValue(), pricingPlanBEDrivenScreen2.f103366b0, 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PricingPlanBEDrivenScreen.j0;
                        return (l0) ((n1) pricingPlanBEDrivenScreen.g0.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = PricingPlanBEDrivenScreen.j0;
                        return (l0) pricingPlanBEDrivenScreen.f103369h0.getValue();
                }
            }
        });
        this.g0 = w.y0(new b(this, inputData, 17));
        final int i2 = 1;
        this.f103369h0 = w.y0(new Function0(this) { // from class: ojk.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PricingPlanBEDrivenScreen f225822b;

            {
                this.f225822b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PricingPlanBEDrivenScreen pricingPlanBEDrivenScreen = this.f225822b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PricingPlanBEDrivenScreen.j0;
                        PricingPlanBEDrivenScreen pricingPlanBEDrivenScreen2 = this.f225822b;
                        return dli.f.a(pricingPlanBEDrivenScreen2, (l0) pricingPlanBEDrivenScreen2.f103369h0.getValue(), pricingPlanBEDrivenScreen2.f103366b0, 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PricingPlanBEDrivenScreen.j0;
                        return (l0) ((n1) pricingPlanBEDrivenScreen.g0.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = PricingPlanBEDrivenScreen.j0;
                        return (l0) pricingPlanBEDrivenScreen.f103369h0.getValue();
                }
            }
        });
        final int i3 = 2;
        this.i0 = w.y0(new Function0(this) { // from class: ojk.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PricingPlanBEDrivenScreen f225822b;

            {
                this.f225822b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PricingPlanBEDrivenScreen pricingPlanBEDrivenScreen = this.f225822b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PricingPlanBEDrivenScreen.j0;
                        PricingPlanBEDrivenScreen pricingPlanBEDrivenScreen2 = this.f225822b;
                        return dli.f.a(pricingPlanBEDrivenScreen2, (l0) pricingPlanBEDrivenScreen2.f103369h0.getValue(), pricingPlanBEDrivenScreen2.f103366b0, 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PricingPlanBEDrivenScreen.j0;
                        return (l0) ((n1) pricingPlanBEDrivenScreen.g0.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = PricingPlanBEDrivenScreen.j0;
                        return (l0) pricingPlanBEDrivenScreen.f103369h0.getValue();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k0 uiState = (k0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = e3().f174539b;
        TextClause textClause = uiState.f225826b;
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n1) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l0) this.f103369h0.getValue();
    }

    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        e3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f174539b.f59410q), null, new d(this, null, 11), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController
    public final c0 d3() {
        return (l0) this.i0.getValue();
    }

    public final m e3() {
        ViewBinding value = this.f103368e0.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getC0() {
        return this.c0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController
    public final RecyclerView h() {
        return ((c) this.f0.getValue()).h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f103367d0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((c) this.f0.getValue()).w().f;
    }
}
