package l40;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f191994w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f191994w |= Integer.MIN_VALUE;
        return q.h3(this.v, this);
    }
}
