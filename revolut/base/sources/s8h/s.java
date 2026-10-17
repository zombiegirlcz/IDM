package s8h;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f261035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f261036x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, gim.c cVar) {
        super(cVar);
        this.f261035w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f261036x |= Integer.MIN_VALUE;
        return this.f261035w.e(null, this);
    }
}
