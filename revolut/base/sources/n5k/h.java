package n5k;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f212634w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f212635x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, gim.c cVar) {
        super(cVar);
        this.f212634w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f212635x |= Integer.MIN_VALUE;
        return this.f212634w.e3(this);
    }
}
