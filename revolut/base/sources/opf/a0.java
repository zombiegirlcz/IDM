package opf;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ lal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f227601w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(lal.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f227601w |= Integer.MIN_VALUE;
        return this.v.u(this);
    }
}
