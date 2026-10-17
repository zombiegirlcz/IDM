package jvc;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.security_hub.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f178820w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.revolut.feature.security_hub.impl.ui.security_hub.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f178820w |= Integer.MIN_VALUE;
        return com.revolut.feature.security_hub.impl.ui.security_hub.c.I2(this.v, this);
    }
}
