package tw4;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f274913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f274914x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f274913w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f274914x |= Integer.MIN_VALUE;
        return this.f274913w.b(null, this);
    }
}
