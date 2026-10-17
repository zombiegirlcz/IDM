package lhk;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f195369w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar, gim.c cVar) {
        super(cVar);
        this.v = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f195369w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
