package d6l;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f111633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f111634x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f111633w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f111634x |= Integer.MIN_VALUE;
        return this.f111633w.d(null, this);
    }
}
