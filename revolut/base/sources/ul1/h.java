package ul1;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.aani.impl.ui.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f280852w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.apm.aani.impl.ui.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f280852w |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.aani.impl.ui.c.I2(this.v, this);
    }
}
