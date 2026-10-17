package y4j;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public tyl.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f310949w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f310950x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f310949w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f310950x |= Integer.MIN_VALUE;
        return this.f310949w.Z2(null, null, null, this);
    }
}
