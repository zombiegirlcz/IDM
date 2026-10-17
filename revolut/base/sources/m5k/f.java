package m5k;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public hel.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f202959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f202960x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f202959w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f202960x |= Integer.MIN_VALUE;
        return this.f202959w.a(null, this);
    }
}
