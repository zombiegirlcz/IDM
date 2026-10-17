package g84;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.c {
    public cv3.u u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f141262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f141263x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f141262w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f141263x |= Integer.MIN_VALUE;
        return this.f141262w.g(null, null, this);
    }
}
