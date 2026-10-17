package hlf;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f153453w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f153454x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f153453w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f153454x |= Integer.MIN_VALUE;
        return this.f153453w.Z2(this);
    }
}
