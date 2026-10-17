package ale;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f6251w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6252x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f6251w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f6252x |= Integer.MIN_VALUE;
        return this.f6251w.b3(null, this);
    }
}
