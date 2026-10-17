package wa7;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f295845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f295846x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f295845w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f295846x |= Integer.MIN_VALUE;
        return this.f295845w.m(null, this);
    }
}
