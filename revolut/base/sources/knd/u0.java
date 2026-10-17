package knd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 extends gim.c {
    public AnalyticsSpendingPeriod$Interval u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kge.d f186138w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f186139x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(kge.d dVar, gim.c cVar) {
        super(cVar);
        this.f186138w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f186139x |= Integer.MIN_VALUE;
        return this.f186138w.A(null, this);
    }
}
