package v4j;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ su9.c f286101w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f286102x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(su9.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f286101w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f286102x |= Integer.MIN_VALUE;
        return this.f286101w.j(null, this);
    }
}
