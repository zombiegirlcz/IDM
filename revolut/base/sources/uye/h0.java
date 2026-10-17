package uye;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i f284282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f284283x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, gim.c cVar) {
        super(cVar);
        this.f284282w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f284283x |= Integer.MIN_VALUE;
        return this.f284282w.c3(null, this);
    }
}
