package e8h;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f123692w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f123693x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f123692w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f123693x |= Integer.MIN_VALUE;
        return this.f123692w.a(this);
    }
}
