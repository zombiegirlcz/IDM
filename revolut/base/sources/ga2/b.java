package ga2;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.c {
    public f5j.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f142043w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f142044x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f142043w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f142044x |= Integer.MIN_VALUE;
        return this.f142043w.b3(null, this);
    }
}
