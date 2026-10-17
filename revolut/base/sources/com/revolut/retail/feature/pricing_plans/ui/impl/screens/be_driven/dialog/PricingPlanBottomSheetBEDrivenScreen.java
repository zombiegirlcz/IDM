package com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog.PricingPlanBottomSheetBEDrivenScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog.PricingPlanBottomSheetBEDrivenScreenContract$InputData;
import com.revolut.tracking.v3.IdContext;
import dli.a;
import dli.c;
import kii.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ngk.n;
import no.k;
import ojk.c0;
import org.jetbrains.annotations.NotNull;
import qgk.i0;
import qgk.o1;
import qjk.b;
import qjk.d;
import te0.w;
import vc.s;
import z92.f;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/be_driven/dialog/PricingPlanBottomSheetBEDrivenScreen;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/be_driven/BasePricingPlanBEDrivenViewController;", "Laii/q;", "Ldli/a;", "Lqjk/d;", "Lno/k;", "Companion", "a", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PricingPlanBottomSheetBEDrivenScreen extends BasePricingPlanBEDrivenViewController<q> implements a, k {
    public final PricingPlanBottomSheetBEDrivenScreenContract$InputData c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f103372d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f103373e0;
    public final h f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f103374h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public AnalyticsContext f103375k0;
    public static final /* synthetic */ KProperty[] l0 = {o0.f186429a.j(new h0(PricingPlanBottomSheetBEDrivenScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPricingPlanBottomSheetBeDrivenBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog.PricingPlanBottomSheetBEDrivenScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PricingPlanBottomSheetBEDrivenScreen(PricingPlanBottomSheetBEDrivenScreenContract$InputData inputData) {
        String strQ;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.c0 = inputData;
        this.f103372d0 = R$layout.screen_pricing_plan_bottom_sheet_be_driven;
        this.f103373e0 = f.m(inputData.f103377b);
        this.f0 = s.t(this, b.f);
        final int i = 0;
        this.g0 = w.y0(new Function0(this) { // from class: qjk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PricingPlanBottomSheetBEDrivenScreen f246895b;

            {
                this.f246895b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PricingPlanBottomSheetBEDrivenScreen pricingPlanBottomSheetBEDrivenScreen = this.f246895b;
                switch (i2) {
                    case 0:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        PricingPlanBottomSheetBEDrivenScreen pricingPlanBottomSheetBEDrivenScreen2 = this.f246895b;
                        e eVar = (e) pricingPlanBottomSheetBEDrivenScreen2.i0.getValue();
                        aim.e eVarB = u.b();
                        eVarB.addAll(pricingPlanBottomSheetBEDrivenScreen2.f103366b0);
                        Unit unit = Unit.f186387a;
                        return dli.f.a(pricingPlanBottomSheetBEDrivenScreen2, eVar, u.a(eVarB), R$id.screenPlanPricingBottomSheetBeDriven_recyclerView, null, null, null, 56);
                    case 1:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion2 = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        PricingPlanBottomSheetBEDrivenScreen pricingPlanBottomSheetBEDrivenScreen3 = this.f246895b;
                        phm.a aVar = (phm.a) ue0.e.j(pricingPlanBottomSheetBEDrivenScreen3.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PricingPlanBottomSheetBEDrivenScreenContract$InputData pricingPlanBottomSheetBEDrivenScreenContract$InputData = pricingPlanBottomSheetBEDrivenScreen3.c0;
                        pricingPlanBottomSheetBEDrivenScreenContract$InputData.getClass();
                        return new o1(i0Var, pricingPlanBottomSheetBEDrivenScreen3, pricingPlanBottomSheetBEDrivenScreenContract$InputData, pricingPlanBottomSheetBEDrivenScreen3, pricingPlanBottomSheetBEDrivenScreen3);
                    case 2:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion3 = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        return (e) ((o1) pricingPlanBottomSheetBEDrivenScreen.f103374h0.getValue()).f246180l.get();
                    default:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion4 = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        return (e) pricingPlanBottomSheetBEDrivenScreen.i0.getValue();
                }
            }
        });
        final int i2 = 1;
        this.f103374h0 = w.y0(new Function0(this) { // from class: qjk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PricingPlanBottomSheetBEDrivenScreen f246895b;

            {
                this.f246895b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PricingPlanBottomSheetBEDrivenScreen pricingPlanBottomSheetBEDrivenScreen = this.f246895b;
                switch (i22) {
                    case 0:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        PricingPlanBottomSheetBEDrivenScreen pricingPlanBottomSheetBEDrivenScreen2 = this.f246895b;
                        e eVar = (e) pricingPlanBottomSheetBEDrivenScreen2.i0.getValue();
                        aim.e eVarB = u.b();
                        eVarB.addAll(pricingPlanBottomSheetBEDrivenScreen2.f103366b0);
                        Unit unit = Unit.f186387a;
                        return dli.f.a(pricingPlanBottomSheetBEDrivenScreen2, eVar, u.a(eVarB), R$id.screenPlanPricingBottomSheetBeDriven_recyclerView, null, null, null, 56);
                    case 1:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion2 = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        PricingPlanBottomSheetBEDrivenScreen pricingPlanBottomSheetBEDrivenScreen3 = this.f246895b;
                        phm.a aVar = (phm.a) ue0.e.j(pricingPlanBottomSheetBEDrivenScreen3.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PricingPlanBottomSheetBEDrivenScreenContract$InputData pricingPlanBottomSheetBEDrivenScreenContract$InputData = pricingPlanBottomSheetBEDrivenScreen3.c0;
                        pricingPlanBottomSheetBEDrivenScreenContract$InputData.getClass();
                        return new o1(i0Var, pricingPlanBottomSheetBEDrivenScreen3, pricingPlanBottomSheetBEDrivenScreenContract$InputData, pricingPlanBottomSheetBEDrivenScreen3, pricingPlanBottomSheetBEDrivenScreen3);
                    case 2:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion3 = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        return (e) ((o1) pricingPlanBottomSheetBEDrivenScreen.f103374h0.getValue()).f246180l.get();
                    default:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion4 = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        return (e) pricingPlanBottomSheetBEDrivenScreen.i0.getValue();
                }
            }
        });
        final int i3 = 2;
        this.i0 = w.y0(new Function0(this) { // from class: qjk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PricingPlanBottomSheetBEDrivenScreen f246895b;

            {
                this.f246895b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PricingPlanBottomSheetBEDrivenScreen pricingPlanBottomSheetBEDrivenScreen = this.f246895b;
                switch (i22) {
                    case 0:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        PricingPlanBottomSheetBEDrivenScreen pricingPlanBottomSheetBEDrivenScreen2 = this.f246895b;
                        e eVar = (e) pricingPlanBottomSheetBEDrivenScreen2.i0.getValue();
                        aim.e eVarB = u.b();
                        eVarB.addAll(pricingPlanBottomSheetBEDrivenScreen2.f103366b0);
                        Unit unit = Unit.f186387a;
                        return dli.f.a(pricingPlanBottomSheetBEDrivenScreen2, eVar, u.a(eVarB), R$id.screenPlanPricingBottomSheetBeDriven_recyclerView, null, null, null, 56);
                    case 1:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion2 = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        PricingPlanBottomSheetBEDrivenScreen pricingPlanBottomSheetBEDrivenScreen3 = this.f246895b;
                        phm.a aVar = (phm.a) ue0.e.j(pricingPlanBottomSheetBEDrivenScreen3.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PricingPlanBottomSheetBEDrivenScreenContract$InputData pricingPlanBottomSheetBEDrivenScreenContract$InputData = pricingPlanBottomSheetBEDrivenScreen3.c0;
                        pricingPlanBottomSheetBEDrivenScreenContract$InputData.getClass();
                        return new o1(i0Var, pricingPlanBottomSheetBEDrivenScreen3, pricingPlanBottomSheetBEDrivenScreenContract$InputData, pricingPlanBottomSheetBEDrivenScreen3, pricingPlanBottomSheetBEDrivenScreen3);
                    case 2:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion3 = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        return (e) ((o1) pricingPlanBottomSheetBEDrivenScreen.f103374h0.getValue()).f246180l.get();
                    default:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion4 = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        return (e) pricingPlanBottomSheetBEDrivenScreen.i0.getValue();
                }
            }
        });
        final int i5 = 3;
        this.j0 = w.y0(new Function0(this) { // from class: qjk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PricingPlanBottomSheetBEDrivenScreen f246895b;

            {
                this.f246895b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PricingPlanBottomSheetBEDrivenScreen pricingPlanBottomSheetBEDrivenScreen = this.f246895b;
                switch (i22) {
                    case 0:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        PricingPlanBottomSheetBEDrivenScreen pricingPlanBottomSheetBEDrivenScreen2 = this.f246895b;
                        e eVar = (e) pricingPlanBottomSheetBEDrivenScreen2.i0.getValue();
                        aim.e eVarB = u.b();
                        eVarB.addAll(pricingPlanBottomSheetBEDrivenScreen2.f103366b0);
                        Unit unit = Unit.f186387a;
                        return dli.f.a(pricingPlanBottomSheetBEDrivenScreen2, eVar, u.a(eVarB), R$id.screenPlanPricingBottomSheetBeDriven_recyclerView, null, null, null, 56);
                    case 1:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion2 = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        PricingPlanBottomSheetBEDrivenScreen pricingPlanBottomSheetBEDrivenScreen3 = this.f246895b;
                        phm.a aVar = (phm.a) ue0.e.j(pricingPlanBottomSheetBEDrivenScreen3.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PricingPlanBottomSheetBEDrivenScreenContract$InputData pricingPlanBottomSheetBEDrivenScreenContract$InputData = pricingPlanBottomSheetBEDrivenScreen3.c0;
                        pricingPlanBottomSheetBEDrivenScreenContract$InputData.getClass();
                        return new o1(i0Var, pricingPlanBottomSheetBEDrivenScreen3, pricingPlanBottomSheetBEDrivenScreenContract$InputData, pricingPlanBottomSheetBEDrivenScreen3, pricingPlanBottomSheetBEDrivenScreen3);
                    case 2:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion3 = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        return (e) ((o1) pricingPlanBottomSheetBEDrivenScreen.f103374h0.getValue()).f246180l.get();
                    default:
                        PricingPlanBottomSheetBEDrivenScreen.Companion companion4 = PricingPlanBottomSheetBEDrivenScreen.INSTANCE;
                        return (e) pricingPlanBottomSheetBEDrivenScreen.i0.getValue();
                }
            }
        });
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        IdContext.a aVarNewBuilder = IdContext.newBuilder();
        PricingPlanBottomSheetDescriptor pricingPlanBottomSheetDescriptor = inputData.f103376a;
        if (pricingPlanBottomSheetDescriptor instanceof PricingPlanBottomSheetDescriptor.BottomSheet) {
            strQ = j6.a.q("plan.hub.bottom_sheet.", ((PricingPlanBottomSheetDescriptor.BottomSheet) pricingPlanBottomSheetDescriptor).f102823a);
        } else if (pricingPlanBottomSheetDescriptor instanceof PricingPlanBottomSheetDescriptor.PartnerOfferDetail) {
            strQ = "plan.hub.bottom_sheet.partners";
        } else {
            if (!(pricingPlanBottomSheetDescriptor instanceof PricingPlanBottomSheetDescriptor.CryptoExchangeFees)) {
                throw new NoWhenBranchMatchedException();
            }
            strQ = "plan.hub.bottom_sheet.crypto_fees";
        }
        this.f103375k0 = new AnalyticsContext(e.d(aVarNewBuilder, strQ, companion));
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getM() {
        return Integer.valueOf(this.f103373e0);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        KProperty[] kPropertyArr = l0;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.f0;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        AnimatedBackgroundView animatedBackgroundView = ((n) value).f215220b;
        AnimatedBackgroundType animatedBackgroundType = uiState.f246899b;
        lw0.a aVar = uiState.f246898a;
        animatedBackgroundView.setVisibility(animatedBackgroundType != null ? 0 : 8);
        if (animatedBackgroundType != null) {
            animatedBackgroundView.setBackgroundType(animatedBackgroundType);
        }
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        NavBarBottomSheet navBarBottomSheet = ((n) value2).f215221c;
        if (aVar != null) {
            navBarBottomSheet.setHeaderModel(aVar);
        }
        navBarBottomSheet.setVisibility(aVar == null ? 8 : 0);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f103375k0 = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (o1) this.f103374h0.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF103375k0() {
        return this.f103375k0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (qjk.e) this.i0.getValue();
    }

    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        PricingPlanBottomSheetDescriptor pricingPlanBottomSheetDescriptor = this.c0.f103376a;
        if (pricingPlanBottomSheetDescriptor instanceof PricingPlanBottomSheetDescriptor.BottomSheet) {
            textLocalisedClause = new TextLocalisedClause(R$string.plan_hub_bottom_sheet_title, u.c(((PricingPlanBottomSheetDescriptor.BottomSheet) pricingPlanBottomSheetDescriptor).f102823a), null, 12);
        } else if (pricingPlanBottomSheetDescriptor instanceof PricingPlanBottomSheetDescriptor.PartnerOfferDetail) {
            textLocalisedClause = new TextLocalisedClause(R$string.plan_hub_bottom_sheet_partner_title, null, null, 14);
        } else {
            if (!(pricingPlanBottomSheetDescriptor instanceof PricingPlanBottomSheetDescriptor.CryptoExchangeFees)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.plan_hub_bottom_sheet_crypto_fees_title, null, null, 14);
        }
        pd.b.p(view, textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController
    public final c0 d3() {
        return (qjk.e) this.j0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.f103372d0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController
    public final RecyclerView h() {
        return ((c) this.g0.getValue()).h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((c) this.g0.getValue()).w().f;
    }
}
