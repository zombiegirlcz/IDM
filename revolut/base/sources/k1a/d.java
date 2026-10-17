package k1a;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f180178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f180179x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f180178w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f180179x |= Integer.MIN_VALUE;
        return this.f180178w.e(null, this);
    }
}
