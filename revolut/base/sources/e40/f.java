package e40;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gim.c {
    public r40.k u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f122346w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f122347x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f122346w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f122347x |= Integer.MIN_VALUE;
        return this.f122346w.k(null, this);
    }
}
