package xq8;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.junior_transfer.impl.ui.add_money.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f308129w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.junior_transfer.impl.ui.add_money.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f308129w |= Integer.MIN_VALUE;
        return this.v.K2(null, this);
    }
}
