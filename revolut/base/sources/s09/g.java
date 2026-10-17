package s09;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public k u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f258906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f258907x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, gim.c cVar) {
        super(cVar);
        this.f258906w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f258907x |= Integer.MIN_VALUE;
        return k.Z2(this.f258906w, null, this);
    }
}
