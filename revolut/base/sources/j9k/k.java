package j9k;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f172368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f172369x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, gim.c cVar) {
        super(cVar);
        this.f172368w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f172369x |= Integer.MIN_VALUE;
        return this.f172368w.f(null, null, null, null, this);
    }
}
