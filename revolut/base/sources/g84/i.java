package g84;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.c {
    public long u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f141257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f141258x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, gim.c cVar) {
        super(cVar);
        this.f141257w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f141258x |= Integer.MIN_VALUE;
        return this.f141257w.d(0L, this);
    }
}
