package ks;

/* JADX INFO: loaded from: classes17.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f189059w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f189059w |= Integer.MIN_VALUE;
        return com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c.J2(this.v, this);
    }
}
