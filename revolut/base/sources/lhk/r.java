package lhk;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f195373w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, gim.c cVar) {
        super(cVar);
        this.v = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f195373w |= Integer.MIN_VALUE;
        return this.v.b(null, this);
    }
}
