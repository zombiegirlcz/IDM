package kmc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$Input;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$Step;
import com.revolut.feature.robo.impl.ui.screen.acknowledgement.AgreementsScreen;
import com.revolut.feature.robo.impl.ui.screen.acknowledgement.AgreementsScreenContract$Input;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreen;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreenContract$Input;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreen;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreenContract$Input;
import com.revolut.feature.trading.managed_portfolios.api.navigation.PortfolioRevealDestination;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import ke7.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f185759b;

    public /* synthetic */ f(s sVar, int i) {
        this.f185758a = i;
        this.f185759b = sVar;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Object obj4;
        switch (this.f185758a) {
            case 0:
                final s sVar = this.f185759b;
                qki.d dVar = sVar.f185782y;
                OnboardingFlowContract$Input onboardingFlowContract$Input = sVar.o;
                final yki.b LazyFlowCoordinator = (yki.b) obj2;
                OnboardingFlowContract$Step step = (OnboardingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                int i = o.f185770a[step.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            Template template = ((OnboardingFlowContract$State) ((j2) dVar.f22677a).getValue()).f85123c;
                            if (template == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            String templateId = template.f95706a;
                            String portfolioId = onboardingFlowContract$Input.f85119b;
                            Intrinsics.checkNotNullParameter(templateId, "templateId");
                            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                            return sVar.e1(new PortfolioRevealDestination(new PortfolioRevealDestination.InputData(templateId, portfolioId)));
                        }
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str = onboardingFlowContract$Input.f85118a;
                        Template template2 = ((OnboardingFlowContract$State) ((j2) dVar.f22677a).getValue()).f85123c;
                        if (template2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        AgreementsScreen agreementsScreen = new AgreementsScreen(new AgreementsScreenContract$Input(str, template2));
                        d dVar2 = new d(sVar, 1);
                        Intrinsics.checkNotNullParameter(dVar2, "<set-?>");
                        agreementsScreen.H = dVar2;
                        return agreementsScreen;
                    }
                    ProjectionScreen projectionScreen = new ProjectionScreen(new ProjectionScreenContract$Input(onboardingFlowContract$Input.f85119b, null, new TextLocalisedClause(R$string.common_action_continue, null, null, 14)));
                    final int i2 = 2;
                    Function1 block = new Function1() { // from class: kmc.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i2) {
                                case 0:
                                    k5f.e it8 = (k5f.e) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (it8 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Template template3 = it8.f181502a;
                                    s sVar2 = sVar;
                                    sVar2.H2(sVar2.f185782y, new e(template3, 0));
                                    oki.h.t2(sVar2, LazyFlowCoordinator, OnboardingFlowContract$Step.AGREEMENTS, true, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    wnc.o it9 = (wnc.o) obj5;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (it9 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Template template4 = it9.f298809a;
                                    s sVar3 = sVar;
                                    sVar3.H2(sVar3.f185782y, new e(template4, 0));
                                    oki.h.t2(sVar3, LazyFlowCoordinator, OnboardingFlowContract$Step.AGREEMENTS, true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    jnc.f it10 = (jnc.f) obj5;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    s sVar4 = sVar;
                                    sVar4.H2(sVar4.f185782y, new v(it10, 24));
                                    oki.h.t2(sVar4, LazyFlowCoordinator, OnboardingFlowContract$Step.AGREEMENTS, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    projectionScreen.H = block;
                    obj4 = projectionScreen;
                } else if (((Boolean) sVar.f185780w.getValue()).booleanValue()) {
                    ViewController viewControllerE1 = sVar.e1(new k5f.f(new k5f.c(onboardingFlowContract$Input.f85119b)));
                    final int i3 = 0;
                    Function1 block2 = new Function1() { // from class: kmc.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i3) {
                                case 0:
                                    k5f.e it8 = (k5f.e) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (it8 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Template template3 = it8.f181502a;
                                    s sVar2 = sVar;
                                    sVar2.H2(sVar2.f185782y, new e(template3, 0));
                                    oki.h.t2(sVar2, LazyFlowCoordinator, OnboardingFlowContract$Step.AGREEMENTS, true, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    wnc.o it9 = (wnc.o) obj5;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (it9 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Template template4 = it9.f298809a;
                                    s sVar3 = sVar;
                                    sVar3.H2(sVar3.f185782y, new e(template4, 0));
                                    oki.h.t2(sVar3, LazyFlowCoordinator, OnboardingFlowContract$Step.AGREEMENTS, true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    jnc.f it10 = (jnc.f) obj5;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    s sVar4 = sVar;
                                    sVar4.H2(sVar4.f185782y, new v(it10, 24));
                                    oki.h.t2(sVar4, LazyFlowCoordinator, OnboardingFlowContract$Step.AGREEMENTS, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    viewControllerE1.H = block2;
                    obj4 = viewControllerE1;
                } else {
                    TemplatesScreen templatesScreen = new TemplatesScreen(new TemplatesScreenContract$Input.SelectInitialTemplate(onboardingFlowContract$Input.f85119b));
                    final int i5 = 1;
                    Function1 function1 = new Function1() { // from class: kmc.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    k5f.e it8 = (k5f.e) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (it8 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Template template3 = it8.f181502a;
                                    s sVar2 = sVar;
                                    sVar2.H2(sVar2.f185782y, new e(template3, 0));
                                    oki.h.t2(sVar2, LazyFlowCoordinator, OnboardingFlowContract$Step.AGREEMENTS, true, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    wnc.o it9 = (wnc.o) obj5;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (it9 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Template template4 = it9.f298809a;
                                    s sVar3 = sVar;
                                    sVar3.H2(sVar3.f185782y, new e(template4, 0));
                                    oki.h.t2(sVar3, LazyFlowCoordinator, OnboardingFlowContract$Step.AGREEMENTS, true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    jnc.f it10 = (jnc.f) obj5;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    s sVar4 = sVar;
                                    sVar4.H2(sVar4.f185782y, new v(it10, 24));
                                    oki.h.t2(sVar4, LazyFlowCoordinator, OnboardingFlowContract$Step.AGREEMENTS, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function1, "<set-?>");
                    templatesScreen.H = function1;
                    obj4 = templatesScreen;
                }
                return obj4;
            default:
                if (((ilc.a) obj3) != null) {
                    return null;
                }
                r6.b.D("Robo context cannot be null to launch onboarding");
                oki.h.D2(this.f185759b.z);
                return null;
        }
    }
}
