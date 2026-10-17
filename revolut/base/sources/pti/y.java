package pti;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.c {
    public z u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f239767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f239768x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, gim.c cVar) {
        super(cVar);
        this.f239767w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f239768x |= Integer.MIN_VALUE;
        return this.f239767w.c(null, this);
    }
}
