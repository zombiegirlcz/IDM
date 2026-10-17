package sjb;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ kbb.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f263706w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kbb.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f263706w |= Integer.MIN_VALUE;
        return this.v.D(this);
    }
}
