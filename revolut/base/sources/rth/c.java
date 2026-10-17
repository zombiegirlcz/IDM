package rth;

import com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public String A;
    public boolean B;
    public boolean C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ j F;
    public int G;
    public EligibilityStep u;
    public WorkflowStepNavigation v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WorkflowStepConfiguration.Screen f257232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f257233x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f257234y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, gim.c cVar) {
        super(cVar);
        this.F = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.E = obj2;
        this.G |= Integer.MIN_VALUE;
        return this.F.c(null, null, this);
    }
}
