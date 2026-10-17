package c7i;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ zq.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22001w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zq.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f22001w |= Integer.MIN_VALUE;
        return this.v.B(null, null, this);
    }
}
