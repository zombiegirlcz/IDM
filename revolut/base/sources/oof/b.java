package oof;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.c f227095w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f227096x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f227095w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f227096x |= Integer.MIN_VALUE;
        return this.f227095w.a(null, this);
    }
}
