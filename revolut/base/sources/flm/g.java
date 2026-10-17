package flm;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends gim.c {
    public h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f136009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f136010x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f136009w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f136010x |= Integer.MIN_VALUE;
        return this.f136009w.e(this);
    }
}
