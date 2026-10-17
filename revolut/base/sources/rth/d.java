package rth;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public String A;
    public String B;
    public LinkedHashMap C;
    public WorkflowConfiguration.Extras D;
    public /* synthetic */ Object E;
    public final /* synthetic */ j F;
    public int G;
    public EligibilityStep u;
    public AnalyticsProduct v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f257235w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AnalyticsContext f257236x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public EligibilityStep.Workflow f257237y;
    public WorkflowStepNavigation.ExitDialog.Custom z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, gim.c cVar) {
        super(cVar);
        this.F = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.E = obj2;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(null, null, null, null, this);
    }
}
