package r83;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f252322w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f252322w |= Integer.MIN_VALUE;
        return this.v.k(this);
    }
}
