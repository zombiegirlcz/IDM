package oxg;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends gim.c {
    public d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f230835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f230836x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, gim.c cVar) {
        super(cVar);
        this.f230835w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f230836x |= Integer.MIN_VALUE;
        return this.f230835w.c(null, this);
    }
}
