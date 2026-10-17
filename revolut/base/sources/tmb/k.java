package tmb;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.c {
    public l u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f272180w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f272181x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f272180w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f272181x |= Integer.MIN_VALUE;
        return this.f272180w.b3(null, this);
    }
}
