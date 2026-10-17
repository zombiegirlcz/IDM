package g84;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.c {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f141259w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f141260x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, gim.c cVar) {
        super(cVar);
        this.f141259w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f141260x |= Integer.MIN_VALUE;
        return this.f141259w.c(0, this);
    }
}
