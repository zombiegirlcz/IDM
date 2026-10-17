package y3f;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f310699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f310700x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, gim.c cVar) {
        super(cVar);
        this.f310699w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f310700x |= Integer.MIN_VALUE;
        return this.f310699w.a(0L, 0L, this);
    }
}
