package cbk;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.c {
    public o u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f22881w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22882x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.f22881w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f22882x |= Integer.MIN_VALUE;
        return o.d3(this.f22881w, null, this);
    }
}
