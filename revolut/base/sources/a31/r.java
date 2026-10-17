package a31;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f988w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x xVar, gim.c cVar) {
        super(cVar);
        this.v = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f988w |= Integer.MIN_VALUE;
        return this.v.a(null, null, null, this);
    }
}
