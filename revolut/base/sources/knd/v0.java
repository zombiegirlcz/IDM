package knd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 extends gim.c {
    public String u;
    public AnalyticsSpendingPeriod$Interval v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public lzi.i f186146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f186147x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kge.d f186148y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(kge.d dVar, gim.c cVar) {
        super(cVar);
        this.f186148y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f186147x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f186148y.B(null, null, null, this);
    }
}
