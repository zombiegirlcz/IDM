package cam;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends gim.c {
    public t u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f22690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22691x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, gim.c cVar) {
        super(cVar);
        this.f22690w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f22691x |= Integer.MIN_VALUE;
        return t.H(this.f22690w, this);
    }
}
