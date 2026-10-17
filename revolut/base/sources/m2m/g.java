package m2m;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f202250w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, gim.c cVar) {
        super(cVar);
        this.v = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f202250w |= Integer.MIN_VALUE;
        return this.v.g(null, this);
    }
}
