package hwe;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flow.topup_methods.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f156166w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f156166w |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.flow.topup_methods.d.I2(this.v, null, this);
    }
}
