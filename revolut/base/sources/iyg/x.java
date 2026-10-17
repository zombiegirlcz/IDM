package iyg;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f169752w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f169752w |= Integer.MIN_VALUE;
        return com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a.J2(this.v, this);
    }
}
