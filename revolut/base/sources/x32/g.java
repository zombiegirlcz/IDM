package x32;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f302626w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f302626w |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d.I2(this.v, null, this);
    }
}
