package c1f;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ o7.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20466w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o7.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f20466w |= Integer.MIN_VALUE;
        return this.v.j(null, null, this);
    }
}
