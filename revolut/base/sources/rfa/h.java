package rfa;

import aii.u;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public u u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.post_activation.impl.ui.flow.a f253744w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f253745x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.post_activation.impl.ui.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f253744w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f253745x |= Integer.MIN_VALUE;
        return this.f253744w.K2(null, this);
    }
}
