package zoc;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f323970w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f323971x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f323970w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f323971x |= Integer.MIN_VALUE;
        return this.f323970w.a(null, this);
    }
}
