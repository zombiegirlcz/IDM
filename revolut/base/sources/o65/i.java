package o65;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.c {
    public String u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f222509w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f222510x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f222511y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, gim.c cVar) {
        super(cVar);
        this.f222510x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f222509w = obj2;
        this.f222511y |= Integer.MIN_VALUE;
        return o.b3(this.f222510x, null, null, this);
    }
}
