package rv1;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.c {
    public r u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f257663w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f257664x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, gim.c cVar) {
        super(cVar);
        this.f257663w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f257664x |= Integer.MIN_VALUE;
        return this.f257663w.k(null, this);
    }
}
