package x4a;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f302832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f302833x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.f302832w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f302833x |= Integer.MIN_VALUE;
        return this.f302832w.Z2(null, null, this);
    }
}
