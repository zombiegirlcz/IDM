package tv1;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ rs1.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f274687w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rs1.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f274687w |= Integer.MIN_VALUE;
        return this.v.b(this);
    }
}
