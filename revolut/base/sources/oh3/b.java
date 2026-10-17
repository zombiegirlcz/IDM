package oh3;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public long u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f225275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f225276x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, gim.c cVar) {
        super(cVar);
        this.f225275w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f225276x |= Integer.MIN_VALUE;
        return f.a(this.f225275w, null, null, null, null, this);
    }
}
