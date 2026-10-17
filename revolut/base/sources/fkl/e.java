package fkl;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f135862w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f135863x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f135862w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f135863x |= Integer.MIN_VALUE;
        return this.f135862w.a(null, null, this);
    }
}
