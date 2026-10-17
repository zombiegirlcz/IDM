package v6e;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f286351w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f286352x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, gim.c cVar) {
        super(cVar);
        this.f286351w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f286352x |= Integer.MIN_VALUE;
        return this.f286351w.j(null, this);
    }
}
