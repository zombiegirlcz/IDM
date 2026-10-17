package kjk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import com.revolut.retail.feature.pricing_plans.ui.impl.network.LegacyPricingPlanOffersService;
import com.revolut.retail.feature.pricing_plans.ui.impl.network.PricingPlanOffersService;
import ggk.o1;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements f {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanOffersService f184459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LegacyPricingPlanOffersService f184460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f184461c;
    public final e d;
    public final Lazy e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f184462g;

    public o(PricingPlanOffersService service, LegacyPricingPlanOffersService legacyService, ne0.j memoryCache, e errorMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(legacyService, "legacyService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        this.f184459a = service;
        this.f184460b = legacyService;
        this.f184461c = memoryCache;
        this.d = errorMapper;
        final int i = 0;
        this.e = yhm.j.b(new Function0(this) { // from class: kjk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184446b;

            {
                this.f184446b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        final o oVar = this.f184446b;
                        Continuation continuation = null;
                        final int i2 = 1;
                        return new x4l.c(new k3c.k(oVar, continuation, 4), new Function1() { // from class: kjk.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i2) {
                                    case 0:
                                        k params = (k) obj2;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        return (o1) oVar.f184461c.get(params.e);
                                    case 1:
                                        Unit it8 = (Unit) obj2;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        return (ggk.d) oVar.f184461c.get("onboarding_free_trial_offer");
                                    default:
                                        l params2 = (l) obj2;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        return (PricingPlanOfferPrompt) oVar.f184461c.get(params2.f184456c);
                                }
                            }
                        }, new Function2() { // from class: kjk.i
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i2) {
                                    case 0:
                                        k params = (k) obj2;
                                        o1 domain = (o1) obj3;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        Intrinsics.checkNotNullParameter(domain, "domain");
                                        oVar.f184461c.f(params.e, domain);
                                        break;
                                    case 1:
                                        ggk.d domain2 = (ggk.d) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(domain2, "domain");
                                        oVar.f184461c.f("onboarding_free_trial_offer", domain2);
                                        break;
                                    default:
                                        l params2 = (l) obj2;
                                        PricingPlanOfferPrompt domain3 = (PricingPlanOfferPrompt) obj3;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        Intrinsics.checkNotNullParameter(domain3, "domain");
                                        oVar.f184461c.f(params2.f184456c, domain3);
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new iz1.g(2, 19, continuation), new k3c.l(3, 12, continuation));
                    case 1:
                        final o oVar2 = this.f184446b;
                        Continuation continuation2 = null;
                        final int i3 = 2;
                        final int i5 = 2;
                        return new x4l.c(new k7c.x(oVar2, continuation2, 9), new Function1() { // from class: kjk.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i3) {
                                    case 0:
                                        k params = (k) obj2;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        return (o1) oVar2.f184461c.get(params.e);
                                    case 1:
                                        Unit it8 = (Unit) obj2;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        return (ggk.d) oVar2.f184461c.get("onboarding_free_trial_offer");
                                    default:
                                        l params2 = (l) obj2;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        return (PricingPlanOfferPrompt) oVar2.f184461c.get(params2.f184456c);
                                }
                            }
                        }, new Function2() { // from class: kjk.i
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i5) {
                                    case 0:
                                        k params = (k) obj2;
                                        o1 domain = (o1) obj3;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        Intrinsics.checkNotNullParameter(domain, "domain");
                                        oVar2.f184461c.f(params.e, domain);
                                        break;
                                    case 1:
                                        ggk.d domain2 = (ggk.d) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(domain2, "domain");
                                        oVar2.f184461c.f("onboarding_free_trial_offer", domain2);
                                        break;
                                    default:
                                        l params2 = (l) obj2;
                                        PricingPlanOfferPrompt domain3 = (PricingPlanOfferPrompt) obj3;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        Intrinsics.checkNotNullParameter(domain3, "domain");
                                        oVar2.f184461c.f(params2.f184456c, domain3);
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new iz1.g(2, 20, continuation2), new k3c.l(3, 13, continuation2));
                    default:
                        final o oVar3 = this.f184446b;
                        Continuation continuation3 = null;
                        final int i6 = 0;
                        final int i21 = 0;
                        return new x4l.c(new k7c.x(oVar3, continuation3, 8), new Function1() { // from class: kjk.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i6) {
                                    case 0:
                                        k params = (k) obj2;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        return (o1) oVar3.f184461c.get(params.e);
                                    case 1:
                                        Unit it8 = (Unit) obj2;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        return (ggk.d) oVar3.f184461c.get("onboarding_free_trial_offer");
                                    default:
                                        l params2 = (l) obj2;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        return (PricingPlanOfferPrompt) oVar3.f184461c.get(params2.f184456c);
                                }
                            }
                        }, new Function2() { // from class: kjk.i
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i21) {
                                    case 0:
                                        k params = (k) obj2;
                                        o1 domain = (o1) obj3;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        Intrinsics.checkNotNullParameter(domain, "domain");
                                        oVar3.f184461c.f(params.e, domain);
                                        break;
                                    case 1:
                                        ggk.d domain2 = (ggk.d) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(domain2, "domain");
                                        oVar3.f184461c.f("onboarding_free_trial_offer", domain2);
                                        break;
                                    default:
                                        l params2 = (l) obj2;
                                        PricingPlanOfferPrompt domain3 = (PricingPlanOfferPrompt) obj3;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        Intrinsics.checkNotNullParameter(domain3, "domain");
                                        oVar3.f184461c.f(params2.f184456c, domain3);
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new iz1.g(2, 18, continuation3), new k3c.l(3, 11, continuation3));
                }
            }
        });
        final int i2 = 1;
        this.f = yhm.j.b(new Function0(this) { // from class: kjk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184446b;

            {
                this.f184446b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        final o oVar = this.f184446b;
                        Continuation continuation = null;
                        final int i22 = 1;
                        return new x4l.c(new k3c.k(oVar, continuation, 4), new Function1() { // from class: kjk.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i22) {
                                    case 0:
                                        k params = (k) obj2;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        return (o1) oVar.f184461c.get(params.e);
                                    case 1:
                                        Unit it8 = (Unit) obj2;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        return (ggk.d) oVar.f184461c.get("onboarding_free_trial_offer");
                                    default:
                                        l params2 = (l) obj2;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        return (PricingPlanOfferPrompt) oVar.f184461c.get(params2.f184456c);
                                }
                            }
                        }, new Function2() { // from class: kjk.i
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i22) {
                                    case 0:
                                        k params = (k) obj2;
                                        o1 domain = (o1) obj3;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        Intrinsics.checkNotNullParameter(domain, "domain");
                                        oVar.f184461c.f(params.e, domain);
                                        break;
                                    case 1:
                                        ggk.d domain2 = (ggk.d) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(domain2, "domain");
                                        oVar.f184461c.f("onboarding_free_trial_offer", domain2);
                                        break;
                                    default:
                                        l params2 = (l) obj2;
                                        PricingPlanOfferPrompt domain3 = (PricingPlanOfferPrompt) obj3;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        Intrinsics.checkNotNullParameter(domain3, "domain");
                                        oVar.f184461c.f(params2.f184456c, domain3);
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new iz1.g(2, 19, continuation), new k3c.l(3, 12, continuation));
                    case 1:
                        final o oVar2 = this.f184446b;
                        Continuation continuation2 = null;
                        final int i3 = 2;
                        final int i5 = 2;
                        return new x4l.c(new k7c.x(oVar2, continuation2, 9), new Function1() { // from class: kjk.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i3) {
                                    case 0:
                                        k params = (k) obj2;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        return (o1) oVar2.f184461c.get(params.e);
                                    case 1:
                                        Unit it8 = (Unit) obj2;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        return (ggk.d) oVar2.f184461c.get("onboarding_free_trial_offer");
                                    default:
                                        l params2 = (l) obj2;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        return (PricingPlanOfferPrompt) oVar2.f184461c.get(params2.f184456c);
                                }
                            }
                        }, new Function2() { // from class: kjk.i
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i5) {
                                    case 0:
                                        k params = (k) obj2;
                                        o1 domain = (o1) obj3;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        Intrinsics.checkNotNullParameter(domain, "domain");
                                        oVar2.f184461c.f(params.e, domain);
                                        break;
                                    case 1:
                                        ggk.d domain2 = (ggk.d) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(domain2, "domain");
                                        oVar2.f184461c.f("onboarding_free_trial_offer", domain2);
                                        break;
                                    default:
                                        l params2 = (l) obj2;
                                        PricingPlanOfferPrompt domain3 = (PricingPlanOfferPrompt) obj3;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        Intrinsics.checkNotNullParameter(domain3, "domain");
                                        oVar2.f184461c.f(params2.f184456c, domain3);
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new iz1.g(2, 20, continuation2), new k3c.l(3, 13, continuation2));
                    default:
                        final o oVar3 = this.f184446b;
                        Continuation continuation3 = null;
                        final int i6 = 0;
                        final int i21 = 0;
                        return new x4l.c(new k7c.x(oVar3, continuation3, 8), new Function1() { // from class: kjk.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i6) {
                                    case 0:
                                        k params = (k) obj2;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        return (o1) oVar3.f184461c.get(params.e);
                                    case 1:
                                        Unit it8 = (Unit) obj2;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        return (ggk.d) oVar3.f184461c.get("onboarding_free_trial_offer");
                                    default:
                                        l params2 = (l) obj2;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        return (PricingPlanOfferPrompt) oVar3.f184461c.get(params2.f184456c);
                                }
                            }
                        }, new Function2() { // from class: kjk.i
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i21) {
                                    case 0:
                                        k params = (k) obj2;
                                        o1 domain = (o1) obj3;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        Intrinsics.checkNotNullParameter(domain, "domain");
                                        oVar3.f184461c.f(params.e, domain);
                                        break;
                                    case 1:
                                        ggk.d domain2 = (ggk.d) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(domain2, "domain");
                                        oVar3.f184461c.f("onboarding_free_trial_offer", domain2);
                                        break;
                                    default:
                                        l params2 = (l) obj2;
                                        PricingPlanOfferPrompt domain3 = (PricingPlanOfferPrompt) obj3;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        Intrinsics.checkNotNullParameter(domain3, "domain");
                                        oVar3.f184461c.f(params2.f184456c, domain3);
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new iz1.g(2, 18, continuation3), new k3c.l(3, 11, continuation3));
                }
            }
        });
        final int i3 = 2;
        this.f184462g = yhm.j.b(new Function0(this) { // from class: kjk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f184446b;

            {
                this.f184446b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        final o oVar = this.f184446b;
                        Continuation continuation = null;
                        final int i22 = 1;
                        return new x4l.c(new k3c.k(oVar, continuation, 4), new Function1() { // from class: kjk.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i22) {
                                    case 0:
                                        k params = (k) obj2;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        return (o1) oVar.f184461c.get(params.e);
                                    case 1:
                                        Unit it8 = (Unit) obj2;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        return (ggk.d) oVar.f184461c.get("onboarding_free_trial_offer");
                                    default:
                                        l params2 = (l) obj2;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        return (PricingPlanOfferPrompt) oVar.f184461c.get(params2.f184456c);
                                }
                            }
                        }, new Function2() { // from class: kjk.i
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i22) {
                                    case 0:
                                        k params = (k) obj2;
                                        o1 domain = (o1) obj3;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        Intrinsics.checkNotNullParameter(domain, "domain");
                                        oVar.f184461c.f(params.e, domain);
                                        break;
                                    case 1:
                                        ggk.d domain2 = (ggk.d) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(domain2, "domain");
                                        oVar.f184461c.f("onboarding_free_trial_offer", domain2);
                                        break;
                                    default:
                                        l params2 = (l) obj2;
                                        PricingPlanOfferPrompt domain3 = (PricingPlanOfferPrompt) obj3;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        Intrinsics.checkNotNullParameter(domain3, "domain");
                                        oVar.f184461c.f(params2.f184456c, domain3);
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new iz1.g(2, 19, continuation), new k3c.l(3, 12, continuation));
                    case 1:
                        final o oVar2 = this.f184446b;
                        Continuation continuation2 = null;
                        final int i32 = 2;
                        final int i5 = 2;
                        return new x4l.c(new k7c.x(oVar2, continuation2, 9), new Function1() { // from class: kjk.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i32) {
                                    case 0:
                                        k params = (k) obj2;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        return (o1) oVar2.f184461c.get(params.e);
                                    case 1:
                                        Unit it8 = (Unit) obj2;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        return (ggk.d) oVar2.f184461c.get("onboarding_free_trial_offer");
                                    default:
                                        l params2 = (l) obj2;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        return (PricingPlanOfferPrompt) oVar2.f184461c.get(params2.f184456c);
                                }
                            }
                        }, new Function2() { // from class: kjk.i
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i5) {
                                    case 0:
                                        k params = (k) obj2;
                                        o1 domain = (o1) obj3;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        Intrinsics.checkNotNullParameter(domain, "domain");
                                        oVar2.f184461c.f(params.e, domain);
                                        break;
                                    case 1:
                                        ggk.d domain2 = (ggk.d) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(domain2, "domain");
                                        oVar2.f184461c.f("onboarding_free_trial_offer", domain2);
                                        break;
                                    default:
                                        l params2 = (l) obj2;
                                        PricingPlanOfferPrompt domain3 = (PricingPlanOfferPrompt) obj3;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        Intrinsics.checkNotNullParameter(domain3, "domain");
                                        oVar2.f184461c.f(params2.f184456c, domain3);
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new iz1.g(2, 20, continuation2), new k3c.l(3, 13, continuation2));
                    default:
                        final o oVar3 = this.f184446b;
                        Continuation continuation3 = null;
                        final int i6 = 0;
                        final int i21 = 0;
                        return new x4l.c(new k7c.x(oVar3, continuation3, 8), new Function1() { // from class: kjk.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i6) {
                                    case 0:
                                        k params = (k) obj2;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        return (o1) oVar3.f184461c.get(params.e);
                                    case 1:
                                        Unit it8 = (Unit) obj2;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        return (ggk.d) oVar3.f184461c.get("onboarding_free_trial_offer");
                                    default:
                                        l params2 = (l) obj2;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        return (PricingPlanOfferPrompt) oVar3.f184461c.get(params2.f184456c);
                                }
                            }
                        }, new Function2() { // from class: kjk.i
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i21) {
                                    case 0:
                                        k params = (k) obj2;
                                        o1 domain = (o1) obj3;
                                        Intrinsics.checkNotNullParameter(params, "params");
                                        Intrinsics.checkNotNullParameter(domain, "domain");
                                        oVar3.f184461c.f(params.e, domain);
                                        break;
                                    case 1:
                                        ggk.d domain2 = (ggk.d) obj3;
                                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(domain2, "domain");
                                        oVar3.f184461c.f("onboarding_free_trial_offer", domain2);
                                        break;
                                    default:
                                        l params2 = (l) obj2;
                                        PricingPlanOfferPrompt domain3 = (PricingPlanOfferPrompt) obj3;
                                        Intrinsics.checkNotNullParameter(params2, "params");
                                        Intrinsics.checkNotNullParameter(domain3, "domain");
                                        oVar3.f184461c.f(params2.f184456c, domain3);
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, new iz1.g(2, 18, continuation3), new k3c.l(3, 11, continuation3));
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kjk.o r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof kjk.m
            if (r0 == 0) goto L13
            r0 = r10
            kjk.m r0 = (kjk.m) r0
            int r1 = r0.f184457w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184457w = r1
            goto L18
        L13:
            kjk.m r0 = new kjk.m
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184457w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L44
            goto L3f
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r10)
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L44
            com.revolut.retail.feature.pricing_plans.ui.impl.network.LegacyPricingPlanOffersService r9 = r9.f184460b     // Catch: java.lang.Throwable -> L44
            r0.f184457w = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r10 = r9.getPlansOnboardingFreeTrial(r0)     // Catch: java.lang.Throwable -> L44
            if (r10 != r1) goto L3f
            return r1
        L3f:
            bjk.k r10 = (bjk.k) r10     // Catch: java.lang.Throwable -> L44
            yhm.m$a r9 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L44
            goto L4c
        L44:
            r0 = move-exception
            r9 = r0
            yhm.m$a r10 = yhm.m.INSTANCE
            yhm.n r10 = yhm.o.a(r9)
        L4c:
            java.lang.Throwable r9 = yhm.m.a(r10)
            if (r9 != 0) goto La5
            bjk.k r10 = (bjk.k) r10
            ggk.b r9 = new ggk.b
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            ggk.f r1 = new ggk.f
            java.lang.String r2 = r10.getId()
            bjk.g2$b r0 = r10.getNavigation()
            r3 = 0
            if (r0 == 0) goto L6d
            ggk.i0 r0 = mjk.s.a(r0)
            goto L6e
        L6d:
            r0 = r3
        L6e:
            java.lang.String r4 = r10.getTitle()
            bjk.g2$d$q r5 = r10.getHeader()
            if (r5 == 0) goto L7d
            ggk.y0 r5 = mjk.r.h(r5)
            goto L7e
        L7d:
            r5 = r3
        L7e:
            bjk.g2$d$h r6 = r10.getBillingOptions()
            if (r6 == 0) goto L88
            com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions r3 = mjk.k.b(r6)
        L88:
            r6 = r3
            java.util.List r3 = r10.getButtons()
            if (r3 != 0) goto L91
            zhm.f0 r3 = zhm.f0.f322471a
        L91:
            ggk.x0 r7 = mjk.r.g(r3)
            java.util.List r10 = r10.getBenefitCategories()
            java.util.ArrayList r8 = mjk.r.a(r10)
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.<init>(r1)
            goto Lb6
        La5:
            boolean r10 = r9 instanceof retrofit2.HttpException
            if (r10 == 0) goto Lb7
            r10 = r9
            retrofit2.HttpException r10 = (retrofit2.HttpException) r10
            int r10 = r10.code()
            r0 = 404(0x194, float:5.66E-43)
            if (r10 != r0) goto Lb7
            ggk.c r9 = ggk.c.f143706a
        Lb6:
            return r9
        Lb7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kjk.o.a(kjk.o, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(kjk.o r19, kotlin.jvm.functions.Function1 r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kjk.o.b(kjk.o, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }
}
