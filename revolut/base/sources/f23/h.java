package f23;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.c {
    public m u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f131368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f131369x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, gim.c cVar) {
        super(cVar);
        this.f131368w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f131369x |= Integer.MIN_VALUE;
        return this.f131368w.e3(null, null, null, null, this);
    }
}
