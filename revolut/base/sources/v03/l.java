package v03;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f284727w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.v = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f284727w |= Integer.MIN_VALUE;
        return m.I2(this.v, this);
    }
}
