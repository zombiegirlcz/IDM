package tvc;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f274752w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f274752w |= Integer.MIN_VALUE;
        return com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a.I2(this.v, null, this);
    }
}
