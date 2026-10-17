package c84;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22102w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, gim.c cVar) {
        super(cVar);
        this.v = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f22102w |= Integer.MIN_VALUE;
        return t.I2(this.v, this);
    }
}
