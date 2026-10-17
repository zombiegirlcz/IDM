package c62;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.c {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f21579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f21580x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21581y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f21580x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21579w = obj2;
        this.f21581y |= Integer.MIN_VALUE;
        return this.f21580x.a(null, this);
    }
}
