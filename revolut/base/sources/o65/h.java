package o65;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f222507w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f222508x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, gim.c cVar) {
        super(cVar);
        this.f222507w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f222508x |= Integer.MIN_VALUE;
        return this.f222507w.d3(null, this);
    }
}
