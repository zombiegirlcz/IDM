package bb2;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public r10.w u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r10.w f14137w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14138x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r10.w wVar, gim.c cVar) {
        super(cVar);
        this.f14137w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f14138x |= Integer.MIN_VALUE;
        return this.f14137w.d(null, this);
    }
}
