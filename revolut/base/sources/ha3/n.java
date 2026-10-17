package ha3;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r10.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f150418w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r10.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f150418w |= Integer.MIN_VALUE;
        return this.v.S(this);
    }
}
