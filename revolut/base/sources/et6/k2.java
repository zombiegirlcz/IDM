package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class k2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ zjh.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129261w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(zjh.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f129261w |= Integer.MIN_VALUE;
        return this.v.i(null, this);
    }
}
