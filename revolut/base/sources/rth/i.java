package rth;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Workflow;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ j E;
    public int F;
    public Workflow u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AnalyticsProduct f257250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AnalyticsContext f257251x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Collection f257252y;
    public Iterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.E = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return this.E.m(null, null, null, null, this);
    }
}
