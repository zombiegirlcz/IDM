package vsj;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f291828w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f291828w |= Integer.MIN_VALUE;
        return q.b(this.v, this);
    }
}
