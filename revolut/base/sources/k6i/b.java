package k6i;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ jpc.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f181722w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jpc.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f181722w |= Integer.MIN_VALUE;
        return this.v.J(null, null, this);
    }
}
