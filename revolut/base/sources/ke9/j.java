package ke9;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.passcode.ui.biometric_passcode_verification.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f183058w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.passcode.ui.biometric_passcode_verification.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f183058w |= Integer.MIN_VALUE;
        return com.revolut.feature.passcode.ui.biometric_passcode_verification.b.I2(this.v, this);
    }
}
