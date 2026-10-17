package c52;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21389w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, gim.c cVar) {
        super(cVar);
        this.v = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f21389w |= Integer.MIN_VALUE;
        return this.v.m3(null, this);
    }
}
