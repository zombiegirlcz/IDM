package k7c;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.c {
    public u6c.f0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f182012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f182013x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, gim.c cVar) {
        super(cVar);
        this.f182012w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f182013x |= Integer.MIN_VALUE;
        return z.c(this.f182012w, null, this);
    }
}
