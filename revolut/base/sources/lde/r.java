package lde;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lal.a f194094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f194095x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(lal.a aVar, gim.c cVar) {
        super(cVar);
        this.f194094w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f194095x |= Integer.MIN_VALUE;
        return this.f194094w.D(this, null, false);
    }
}
