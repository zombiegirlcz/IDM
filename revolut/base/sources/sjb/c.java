package sjb;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ kbb.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f263707w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kbb.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f263707w |= Integer.MIN_VALUE;
        return this.v.F(this);
    }
}
