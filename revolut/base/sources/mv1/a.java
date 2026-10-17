package mv1;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends gim.c {
    public int A;
    public d u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f209082w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f209083x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f209084y;
    public final /* synthetic */ d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.z = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f209084y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.j(this);
    }
}
