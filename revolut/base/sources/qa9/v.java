package qa9;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.c {
    public wi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f244006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f244007x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, gim.c cVar) {
        super(cVar);
        this.f244006w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f244007x |= Integer.MIN_VALUE;
        return this.f244006w.e(null, this);
    }
}
