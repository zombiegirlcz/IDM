package v7e;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.c {
    public bla.c u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f286609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f286610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f286611y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, gim.c cVar) {
        super(cVar);
        this.f286610x = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f286609w = obj2;
        this.f286611y |= Integer.MIN_VALUE;
        return u.y2(this.f286610x, null, null, this);
    }
}
