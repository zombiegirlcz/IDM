package eh3;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r10.t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f125708w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r10.t tVar, gim.c cVar) {
        super(cVar);
        this.v = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f125708w |= Integer.MIN_VALUE;
        return this.v.c(this);
    }
}
