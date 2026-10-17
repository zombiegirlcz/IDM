package v0f;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.screens.card_details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f284813w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.revolut.feature.topup_screen.impl.screens.card_details.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f284813w |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.screens.card_details.b.I2(this.v, this);
    }
}
