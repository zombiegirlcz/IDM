package w52;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.c {
    public int A;
    public e u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f294679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f294680x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f294681y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.z = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f294681y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.j(this);
    }
}
