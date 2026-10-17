package q78;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f242767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f242768x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, gim.c cVar) {
        super(cVar);
        this.f242767w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f242768x |= Integer.MIN_VALUE;
        return this.f242767w.e(null, null, null, this);
    }
}
