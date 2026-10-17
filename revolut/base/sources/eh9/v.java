package eh9;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f125797w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, gim.c cVar) {
        super(cVar);
        this.v = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f125797w |= Integer.MIN_VALUE;
        return z.J2(this.v, this);
    }
}
