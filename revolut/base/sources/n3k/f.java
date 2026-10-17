package n3k;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f212176w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f212177x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f212176w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f212177x |= Integer.MIN_VALUE;
        return this.f212176w.f(null, this);
    }
}
