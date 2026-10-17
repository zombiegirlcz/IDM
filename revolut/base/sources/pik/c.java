package pik;

import aii.r;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.PlanSwitchToAnnualFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.PlanSwitchToAnnualEntryFlowContract$Step;
import k50.b2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kp0.m;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a f236609b;

    public /* synthetic */ c(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a aVar, int i) {
        this.f236608a = i;
        this.f236609b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f236608a) {
            case 0:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                PlanSwitchToAnnualEntryFlowContract$Step step = (PlanSwitchToAnnualEntryFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean z = step instanceof PlanSwitchToAnnualEntryFlowContract$Step.Prompt;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a aVar = this.f236609b;
                Continuation continuation = null;
                if (z) {
                    PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(((PlanSwitchToAnnualEntryFlowContract$Step.Prompt) step).f103248a);
                    x5d.b.n(aVar, promptMarketingScreen, new b2(2, aVar, com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 21), new d(aVar, continuation, 0), new m(aVar, step, 24));
                    return promptMarketingScreen;
                }
                if (!(step instanceof PlanSwitchToAnnualEntryFlowContract$Step.SwitchToAnnual)) {
                    throw new NoWhenBranchMatchedException();
                }
                PlanSwitchToAnnualEntryFlowContract$Step.SwitchToAnnual switchToAnnual = (PlanSwitchToAnnualEntryFlowContract$Step.SwitchToAnnual) step;
                PlanSwitchToAnnualFlow planSwitchToAnnualFlow = new PlanSwitchToAnnualFlow(new oik.c(switchToAnnual.f103251a, switchToAnnual.f103252b, false));
                x5d.b.n(aVar, planSwitchToAnnualFlow, new b2(2, aVar, com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 22), new d(aVar, continuation, 1), new c(aVar, 1));
                return planSwitchToAnnualFlow;
            default:
                Intrinsics.checkNotNullParameter((r) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((oki.g) obj3, "<unused var>");
                oki.h.D2(this.f236609b.f103255r);
                return Unit.f186387a;
        }
    }
}
