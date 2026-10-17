package qzh;

import com.revolut.feature.exchange.models.ExchangeResult;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public ExchangeResult.Success u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f250639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f250640x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f250639w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f250640x |= Integer.MIN_VALUE;
        return this.f250639w.d3(null, null, this);
    }
}
