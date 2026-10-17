package tvf;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.transport.impl.ui.activation.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f274759w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.transport.impl.ui.activation.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f274759w |= Integer.MIN_VALUE;
        return com.revolut.feature.transport.impl.ui.activation.flow.a.I2(this.v, this);
    }
}
