package g84;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.c {
    public long u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f141254w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f141255x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, gim.c cVar) {
        super(cVar);
        this.f141254w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f141255x |= Integer.MIN_VALUE;
        return this.f141254w.a(0L, this);
    }
}
