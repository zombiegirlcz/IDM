package pth;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowState;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.c {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a H;
    public int I;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AnalyticsProduct f239715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WorkflowState f239716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Collection f239717y;
    public Iterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, gim.c cVar) {
        super(cVar);
        this.H = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.G = obj2;
        this.I |= Integer.MIN_VALUE;
        return this.H.R2(null, null, null, false, this);
    }
}
