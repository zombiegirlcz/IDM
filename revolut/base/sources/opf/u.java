package opf;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends gim.c {
    public io3.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f227638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f227639x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, gim.c cVar) {
        super(cVar);
        this.f227638w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f227639x |= Integer.MIN_VALUE;
        return this.f227638w.f(null, null, null, null, this);
    }
}
