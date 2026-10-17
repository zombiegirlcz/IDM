package ee8;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.c {
    public int A;
    public Object u;
    public String[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f125136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f125137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f125138y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, gim.c cVar) {
        super(cVar);
        this.z = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f125138y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, this);
    }
}
