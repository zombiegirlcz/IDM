package e0f;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.c {
    public dj0.d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f121660w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f121661x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f121662y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, gim.c cVar) {
        super(cVar);
        this.f121661x = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f121660w = obj2;
        this.f121662y |= Integer.MIN_VALUE;
        return this.f121661x.g(null, this);
    }
}
