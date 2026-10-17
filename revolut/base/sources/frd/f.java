package frd;

import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.c {
    public NetWorthAccount.Junior u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f137461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f137462x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, gim.c cVar) {
        super(cVar);
        this.f137461w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f137462x |= Integer.MIN_VALUE;
        return this.f137461w.h(null, this);
    }
}
