package l25;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f191642w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, gim.c cVar) {
        super(cVar);
        this.v = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f191642w |= Integer.MIN_VALUE;
        return this.v.j3(null, this);
    }
}
