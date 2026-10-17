package znd;

import com.revolut.feature.categorisation.api.model.PeriodPreferenceType;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 extends gim.c {
    public String u;
    public PeriodPreferenceType v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f323765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b f323766x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f323767y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar, gim.c cVar) {
        super(cVar);
        this.f323766x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f323765w = obj2;
        this.f323767y |= Integer.MIN_VALUE;
        return com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b.J2(this.f323766x, this);
    }
}
