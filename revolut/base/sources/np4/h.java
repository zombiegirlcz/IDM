package np4;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f218135w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, gim.c cVar) {
        super(cVar);
        this.v = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f218135w |= Integer.MIN_VALUE;
        return o.I2(this.v, this);
    }
}
