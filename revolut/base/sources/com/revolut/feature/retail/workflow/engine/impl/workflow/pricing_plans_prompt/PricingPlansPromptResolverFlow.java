package com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt;

import aii.q;
import com.revolut.kompot.navigable.vc.flow.SimpleFlow;
import com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import plc.i;
import wik.m;
import yki.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/workflow/engine/impl/workflow/pricing_plans_prompt/PricingPlansPromptResolverFlow;", "Lcom/revolut/kompot/navigable/vc/flow/SimpleFlow;", "Lcom/revolut/feature/retail/workflow/engine/impl/workflow/pricing_plans_prompt/PricingPlansPromptResolverFlowContract$Step;", "Laii/q;", "feature_retail_workflow_engine_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PricingPlansPromptResolverFlow extends SimpleFlow<PricingPlansPromptResolverFlowContract$Step, q> {
    public final b M;

    public PricingPlansPromptResolverFlow(SharedStep.PricingPlansPrompt step, m pricingPlanOffersInteractor, jvh.a workflowInteractor, i onStepResult) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(pricingPlanOffersInteractor, "pricingPlanOffersInteractor");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(onStepResult, "onStepResult");
        this.M = new b(step, pricingPlanOffersInteractor, workflowInteractor, onStepResult);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.vc.flow.SimpleFlow
    public final k d3() {
        return this.M;
    }
}
