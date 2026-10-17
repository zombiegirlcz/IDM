package com.revolut.retail.feature.esim.impl.ui.flows.get_plan;

import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$Step;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, EsimGetPlanFlowContract$Step.Restricted.class, "<init>", "<init>(Lcom/revolut/feature/full_screen_prompt/PromptMarketingScreenContract$InputData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        PromptMarketingScreenContract$InputData p0 = (PromptMarketingScreenContract$InputData) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new EsimGetPlanFlowContract$Step.Restricted(p0);
    }
}
