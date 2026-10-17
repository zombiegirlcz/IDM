package g84;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g2e.t f141248w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f141249x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g2e.t tVar, gim.c cVar) {
        super(cVar);
        this.f141248w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f141249x |= Integer.MIN_VALUE;
        return this.f141248w.e(null, 0L, this);
    }
}
