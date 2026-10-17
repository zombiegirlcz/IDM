package pth;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a C;
    public int D;
    public String u;
    public AnalyticsProduct v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Collection f239708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f239709x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f239710y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, gim.c cVar) {
        super(cVar);
        this.C = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.P2(null, null, null, null, this);
    }
}
