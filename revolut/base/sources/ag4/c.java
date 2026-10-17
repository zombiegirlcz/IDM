package ag4;

import ft3.h1;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public tx3.b u;
    public h1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f4776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.a f4777x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4778y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.a aVar, gim.c cVar) {
        super(cVar);
        this.f4777x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f4776w = obj2;
        this.f4778y |= Integer.MIN_VALUE;
        return this.f4777x.a(this);
    }
}
