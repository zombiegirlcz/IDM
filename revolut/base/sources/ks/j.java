package ks;

import com.revolut.biometric_verification.impl.domain.models.active_liveness.ActiveLivenessCode;

/* JADX INFO: loaded from: classes17.dex */
public final class j extends gim.c {
    public boolean u;
    public ActiveLivenessCode v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f189056w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c f189057x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f189058y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f189057x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f189056w = obj2;
        this.f189058y |= Integer.MIN_VALUE;
        return com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c.I2(this.f189057x, this);
    }
}
