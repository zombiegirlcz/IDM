package com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting;

import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlowContract$Step;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a extends q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, EsimConnectivityTroubleshootingFlowContract$Step.Restricted.class, "<init>", "<init>(Lcom/revolut/feature/full_screen_prompt/PromptMarketingScreenContract$InputData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        PromptMarketingScreenContract$InputData p0 = (PromptMarketingScreenContract$InputData) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new EsimConnectivityTroubleshootingFlowContract$Step.Restricted(p0);
    }
}
