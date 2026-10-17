package rth;

import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ o B;
    public int C;
    public ril.d u;
    public WorkflowStepNavigation v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f257260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f257261x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f257262y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.B = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, null, this);
    }
}
