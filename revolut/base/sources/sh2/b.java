package sh2;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ rs1.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f263391w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rs1.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f263391w |= Integer.MIN_VALUE;
        return this.v.b(this);
    }
}
