package ul5;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f280886w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f280887x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f280886w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f280887x |= Integer.MIN_VALUE;
        return this.f280886w.a(this);
    }
}
