package n7i;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f213104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f213105x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f213104w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f213105x |= Integer.MIN_VALUE;
        return this.f213104w.b(null, this);
    }
}
