package rvc;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f257751w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, gim.c cVar) {
        super(cVar);
        this.v = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f257751w |= Integer.MIN_VALUE;
        return n.I2(this.v, this);
    }
}
