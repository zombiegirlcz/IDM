package wtc;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.c {
    public String u;
    public cuc.r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f299897w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ufm.d f299898x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f299899y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ufm.d dVar, gim.c cVar) {
        super(cVar);
        this.f299898x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f299897w = obj2;
        this.f299899y |= Integer.MIN_VALUE;
        return this.f299898x.k(null, this);
    }
}
