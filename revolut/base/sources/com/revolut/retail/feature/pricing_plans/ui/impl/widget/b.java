package com.revolut.retail.feature.pricing_plans.ui.impl.widget;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.cancel_downgrade.CancelDowngradeScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$PlanReference;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$UIConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.widget.PricingPlanHomeBanner;
import dz6.n;
import ffk.t;
import j49.i;
import kjk.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import l80.e;
import org.jetbrains.annotations.NotNull;
import sjk.c;
import sjk.d;
import sjk.h;
import vkm.q;
import wim.z;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements kgk.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f103648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f103649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f103650c;
    public final e d;

    public b(t pricingPlanInteractor, h planNameMapper, gte.a featureToggleInteractor, c plansHomeBannerRepository, e dateTimeProvider) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planNameMapper, "planNameMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(plansHomeBannerRepository, "plansHomeBannerRepository");
        Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
        this.f103648a = pricingPlanInteractor;
        this.f103649b = featureToggleInteractor;
        this.f103650c = plansHomeBannerRepository;
        this.d = dateTimeProvider;
    }

    @Override // i49.c
    public final boolean a(com.revolut.core.ui_kit.delegates.t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.f(data.f54722b.f51590a, "LIST_ID_CANCEL_DOWNGRADE_ITEM");
    }

    @Override // i49.c
    public final Object d(Object obj2) {
        if (!(obj2 instanceof sjk.c)) {
            return j49.c.f171322a;
        }
        sjk.c cVar = (sjk.c) obj2;
        boolean zEquals = cVar.equals(c.a.f263737a);
        j49.a aVar = j49.a.f171320a;
        if (zEquals) {
            return aVar;
        }
        if (!(cVar instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        a aVar2 = Companion;
        PricingPlanSubscription pricingPlanSubscription = ((d) obj2).f263738a;
        aVar2.getClass();
        PricingPlanHomeBanner.CancelScheduledDowngrade banner = a.a(pricingPlanSubscription);
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.f103650c.f184423a.G(Boolean.TRUE, kjk.c.a(banner), z.d(o0.b(Boolean.TYPE)));
        return aVar;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return q.Q(q.q(mo3.a.g(rd0.e.b(this.f103648a.v(w4l.h.f294642c)), null, null, 3)), new n(null, this, 15));
    }

    @Override // i49.c
    public final Object g(com.revolut.core.ui_kit.delegates.t tVar, Continuation continuation) {
        ActionWidgetDelegate.a aVar = tVar.f54721a;
        ActionWidgetDelegate.Model model = tVar.f54722b;
        boolean zF = Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a);
        j49.a aVar2 = j49.a.f171320a;
        if (zF) {
            a aVar3 = Companion;
            Object obj2 = model.f51596l;
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.pricingplans.models.PricingPlanSubscription");
            aVar3.getClass();
            PricingPlanHomeBanner.CancelScheduledDowngrade banner = a.a((PricingPlanSubscription) obj2);
            Intrinsics.checkNotNullParameter(banner, "banner");
            this.f103650c.f184423a.G(Boolean.TRUE, kjk.c.a(banner), z.d(o0.b(Boolean.TYPE)));
            return aVar2;
        }
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a)) {
            return new j49.e(new CancelDowngradeScreen(), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a)) {
            Object obj3 = model.f51596l;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.pricingplans.models.PricingPlanSubscription");
            return new j49.e(new PlanBenefitsScreen(new PlanBenefitsScreenContract$InputData(new PlanBenefitsScreenContract$PlanReference.Id(((PricingPlanSubscription) obj3).f81129a.f152287a), (PlanBenefitsScreenContract$UIConfig) null, this.f103649b.a(PricingPlansUiApi$Toggles.RevampedPlanBackgrounds.f102640c), 10)), ModalDestination.Style.POPUP.f98311a);
        }
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a) || (aVar instanceof com.revolut.core.ui_kit.delegates.h)) {
            return aVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
