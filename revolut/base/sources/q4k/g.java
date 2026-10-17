package q4k;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public a2k.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f242190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f242191x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f242190w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f242191x |= Integer.MIN_VALUE;
        return h.b3(this.f242190w, null, null, null, this);
    }
}
