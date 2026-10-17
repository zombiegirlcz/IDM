package z7i;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ z1l.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f320015w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(z1l.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f320015w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
