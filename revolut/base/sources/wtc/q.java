package wtc;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.c {
    public cuc.r u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ufm.d f299895w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f299896x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ufm.d dVar, gim.c cVar) {
        super(cVar);
        this.f299895w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f299896x |= Integer.MIN_VALUE;
        return this.f299895w.e(this);
    }
}
