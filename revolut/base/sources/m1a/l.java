package m1a;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f201318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f201319x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, gim.c cVar) {
        super(cVar);
        this.f201318w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f201319x |= Integer.MIN_VALUE;
        return this.f201318w.b(null, this);
    }
}
