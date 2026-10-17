package r83;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.c {
    public String u;
    public i93.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f252334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f252335x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f252336y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, gim.c cVar) {
        super(cVar);
        this.f252335x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f252334w = obj2;
        this.f252336y |= Integer.MIN_VALUE;
        return this.f252335x.r(null, null, this);
    }
}
