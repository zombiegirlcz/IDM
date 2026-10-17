package rth;

import com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public EligibilityStep.Eligibility u;
    public WorkflowStepNavigation v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f257238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f257239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f257240y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, gim.c cVar) {
        super(cVar);
        this.f257240y = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f257239x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f257240y.h(null, this);
    }
}
