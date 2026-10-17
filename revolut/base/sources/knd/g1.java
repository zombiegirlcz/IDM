package knd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;

/* JADX INFO: loaded from: classes7.dex */
public final class g1 extends gim.c {
    public int A;
    public AnalyticsSpendingPeriod$Interval u;
    public m1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f186079w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f186080x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f186081y;
    public final /* synthetic */ h1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, gim.c cVar) {
        super(cVar);
        this.z = h1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f186081y = obj2;
        this.A |= Integer.MIN_VALUE;
        return h1.b(this.z, null, 0, this);
    }
}
