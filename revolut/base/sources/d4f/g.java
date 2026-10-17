package d4f;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ zjh.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f111286w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(zjh.f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f111286w |= Integer.MIN_VALUE;
        return this.v.G(null, this);
    }
}
