package b3d;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f12020w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12021x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f12020w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f12021x |= Integer.MIN_VALUE;
        return this.f12020w.e(null, this);
    }
}
