package ee8;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public int A;
    public String[] u;
    public String[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f125139w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f125140x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f125141y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.z = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f125141y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, null, this);
    }
}
