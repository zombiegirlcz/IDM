package if2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.upi.impl.flow.pending_payment.UpiPendingPaymentFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiPendingPaymentFlowContract$InputData f160879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f160880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f160881c = this;
    public final e4m.e d;

    public k(f fVar, UpiPendingPaymentFlowContract$InputData upiPendingPaymentFlowContract$InputData) {
        this.f160880b = fVar;
        this.f160879a = upiPendingPaymentFlowContract$InputData;
        this.d = e4m.b.b(new hc2.r(fVar, this, 19));
    }

    public final kgm.i b() {
        f fVar = this.f160880b;
        vz1.g gVarH = ((lz1.m) fVar.f160852b).h();
        vc.s.j(gVarH);
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) fVar.f160863s).c();
        vc.s.j(aVarC);
        return new kgm.i(gVarH, aVarC);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
