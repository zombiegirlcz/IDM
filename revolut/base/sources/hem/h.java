package hem;

/* JADX INFO: loaded from: classes23.dex */
public final class h extends gim.c {
    public int A;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f151734w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f151735x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f151736y;
    public final /* synthetic */ g1m.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g1m.c cVar, gim.c cVar2) {
        super(cVar2);
        this.z = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f151736y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(this);
    }
}
