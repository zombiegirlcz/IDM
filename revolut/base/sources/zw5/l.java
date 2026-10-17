package zw5;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f325741w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f325742x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, gim.c cVar) {
        super(cVar);
        this.f325741w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f325742x |= Integer.MIN_VALUE;
        return n.z2(this.f325741w, null, null, null, this);
    }
}
