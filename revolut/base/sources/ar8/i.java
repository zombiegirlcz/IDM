package ar8;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8533w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f8533w |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a.J2(this.v, null, this);
    }
}
