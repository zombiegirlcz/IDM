package v6e;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.c {
    public String u;
    public ks8.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f286359w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f286360x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f286361y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, gim.c cVar) {
        super(cVar);
        this.f286360x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f286359w = obj2;
        this.f286361y |= Integer.MIN_VALUE;
        return this.f286360x.d(null, this);
    }
}
