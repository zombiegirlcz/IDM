package afa;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.pockets.impl.ui.pockets_list.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4014w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.feature.pockets.impl.ui.pockets_list.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f4014w |= Integer.MIN_VALUE;
        return com.revolut.feature.pockets.impl.ui.pockets_list.c.I2(this.v, null, null, this);
    }
}
