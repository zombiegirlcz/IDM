package iyg;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f169751w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f169751w |= Integer.MIN_VALUE;
        return com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a.I2(this.v, this);
    }
}
