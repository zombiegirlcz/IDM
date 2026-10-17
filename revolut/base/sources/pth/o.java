package pth;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.c {
    public String u;
    public AnalyticsProduct v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f239704w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a f239705x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f239706y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, gim.c cVar) {
        super(cVar);
        this.f239705x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f239704w = obj2;
        this.f239706y |= Integer.MIN_VALUE;
        return com.revolut.feature.workflow.engine.onboarding.impl.workflow.a.I2(this.f239705x, null, null, null, this);
    }
}
