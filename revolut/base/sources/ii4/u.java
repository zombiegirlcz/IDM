package ii4;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends gim.c {
    public it3.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f161559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f161560x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, gim.c cVar) {
        super(cVar);
        this.f161559w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f161560x |= Integer.MIN_VALUE;
        return this.f161559w.c(null, this);
    }
}
