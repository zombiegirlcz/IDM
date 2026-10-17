package ulf;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f280978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f280979x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f280978w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f280979x |= Integer.MIN_VALUE;
        return this.f280978w.c(null, null, this);
    }
}
