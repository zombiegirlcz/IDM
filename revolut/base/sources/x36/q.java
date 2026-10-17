package x36;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f302677w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y yVar, gim.c cVar) {
        super(cVar);
        this.v = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f302677w |= Integer.MIN_VALUE;
        return y.J2(this.v, this);
    }
}
