package dlf;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f115756w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f115757x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, gim.c cVar) {
        super(cVar);
        this.f115756w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f115757x |= Integer.MIN_VALUE;
        return this.f115756w.Z2(null, this);
    }
}
