package p01;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.c {
    public jid.z u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f231434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f231435x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f231434w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f231435x |= Integer.MIN_VALUE;
        return this.f231434w.a(null, this);
    }
}
