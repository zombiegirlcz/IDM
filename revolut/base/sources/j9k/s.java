package j9k;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.c {
    public h6e.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f172381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f172382x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, gim.c cVar) {
        super(cVar);
        this.f172381w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f172382x |= Integer.MIN_VALUE;
        return this.f172381w.a(null, this);
    }
}
