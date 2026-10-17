package n33;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jid.z f211686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f211687x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jid.z zVar, gim.c cVar) {
        super(cVar);
        this.f211686w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f211687x |= Integer.MIN_VALUE;
        return this.f211686w.l(null, this);
    }
}
