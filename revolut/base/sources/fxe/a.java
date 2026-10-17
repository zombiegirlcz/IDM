package fxe;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ zjh.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f138809w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zjh.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f138809w |= Integer.MIN_VALUE;
        return this.v.j(null, this);
    }
}
