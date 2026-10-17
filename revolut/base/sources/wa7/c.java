package wa7;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public int A;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.a f295826w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f295827x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f295828y;
    public final /* synthetic */ m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m mVar, gim.c cVar) {
        super(cVar);
        this.z = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f295828y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, this);
    }
}
