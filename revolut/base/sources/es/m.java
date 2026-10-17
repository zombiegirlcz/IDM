package es;

/* JADX INFO: loaded from: classes17.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.flow.launcher.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f128761w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f128761w |= Integer.MIN_VALUE;
        return com.revolut.biometric_verification.impl.ui.flow.launcher.d.J2(this.v, null, this);
    }
}
