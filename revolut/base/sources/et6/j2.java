package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class j2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ zjh.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129254w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(zjh.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f129254w |= Integer.MIN_VALUE;
        return this.v.b(null, this);
    }
}
