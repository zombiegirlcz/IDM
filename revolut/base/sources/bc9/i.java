package bc9;

import com.revolut.feature.onboarding.impl.onboarding.workflow.OnboardingWorkflowFlowContract$Step;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.c {
    public OnboardingWorkflowFlowContract$Step u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f14404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f14405x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14406y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f14405x = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f14404w = obj2;
        this.f14406y |= Integer.MIN_VALUE;
        return this.f14405x.I2(null, false, this);
    }
}
