package xg6;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f305595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f305596x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, gim.c cVar) {
        super(cVar);
        this.f305595w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f305596x |= Integer.MIN_VALUE;
        return this.f305595w.f(null, this);
    }
}
