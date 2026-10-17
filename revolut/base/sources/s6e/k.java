package s6e;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f260293w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(z zVar, gim.c cVar) {
        super(cVar);
        this.v = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f260293w |= Integer.MIN_VALUE;
        return this.v.h(null, this);
    }
}
