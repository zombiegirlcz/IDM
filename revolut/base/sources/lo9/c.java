package lo9;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kdh.b f197423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f197424x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kdh.b bVar, gim.c cVar) {
        super(cVar);
        this.f197423w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f197424x |= Integer.MIN_VALUE;
        return this.f197423w.E(null, this);
    }
}
