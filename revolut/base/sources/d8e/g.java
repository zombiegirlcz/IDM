package d8e;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f112226w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f112226w |= Integer.MIN_VALUE;
        return this.v.Q2(null, this);
    }
}
