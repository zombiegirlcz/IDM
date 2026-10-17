package r83;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f252327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f252328x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, gim.c cVar) {
        super(cVar);
        this.f252327w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f252328x |= Integer.MIN_VALUE;
        return this.f252327w.n(null, this);
    }
}
