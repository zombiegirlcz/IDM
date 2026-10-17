package c2d;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20755w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, gim.c cVar) {
        super(cVar);
        this.v = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f20755w |= Integer.MIN_VALUE;
        return z.a(this.v, this);
    }
}
