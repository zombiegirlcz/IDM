package eh9;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.c {
    public z u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f125799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f125800x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, gim.c cVar) {
        super(cVar);
        this.f125799w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f125800x |= Integer.MIN_VALUE;
        return z.K2(this.f125799w, null, this);
    }
}
