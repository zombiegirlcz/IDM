package n5k;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.c {
    public Double u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f212639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f212640x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, gim.c cVar) {
        super(cVar);
        this.f212639w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f212640x |= Integer.MIN_VALUE;
        return this.f212639w.g3(null, this);
    }
}
