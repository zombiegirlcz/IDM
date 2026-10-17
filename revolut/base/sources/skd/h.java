package skd;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.c {
    public tkd.e u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f263832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f263833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f263834y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f263834y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f263833x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f263834y.k(null, null, null, this);
    }
}
