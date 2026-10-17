package pb3;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f234630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f234631x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, gim.c cVar) {
        super(cVar);
        this.f234630w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f234631x |= Integer.MIN_VALUE;
        return this.f234630w.b(null, this);
    }
}
