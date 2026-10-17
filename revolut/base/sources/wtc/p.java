package wtc;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ ufm.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f299893w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ufm.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f299893w |= Integer.MIN_VALUE;
        return this.v.c(this);
    }
}
