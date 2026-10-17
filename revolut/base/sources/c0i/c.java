package c0i;

import com.revolut.feature.exchange.models.ExchangeResult;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public ExchangeResult.Success u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f20276w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20277x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f20276w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f20277x |= Integer.MIN_VALUE;
        return this.f20276w.a(null, null, null, this);
    }
}
