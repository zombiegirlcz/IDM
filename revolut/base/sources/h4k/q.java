package h4k;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h30.q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f149403w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(h30.q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f149403w |= Integer.MIN_VALUE;
        return this.v.E0(this);
    }
}
