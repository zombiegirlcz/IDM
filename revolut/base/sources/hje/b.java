package hje;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f152725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f152726x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f152725w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f152726x |= Integer.MIN_VALUE;
        return this.f152725w.e(null, this);
    }
}
