package d6l;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f111631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f111632x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.f111631w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f111632x |= Integer.MIN_VALUE;
        return this.f111631w.b(null, null, this);
    }
}
