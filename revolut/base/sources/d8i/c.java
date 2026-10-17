package d8i;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ zq.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f112281w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zq.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f112281w |= Integer.MIN_VALUE;
        return zq.a.c(this.v, null, this);
    }
}
