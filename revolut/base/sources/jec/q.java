package jec;

import cli.y;
import com.revolut.feature.revolutpay.shared.ui.terminal_payment.TerminalPaymentScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends oki.h implements k {

    @NotNull
    public static final n Companion = new n();
    public final TerminalPaymentScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b6c.a f173269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f173270q;

    public q(TerminalPaymentScreenContract$InputData inputData, b6c.a paymentInitiationInteractor, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paymentInitiationInteractor, "paymentInitiationInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f173269p = paymentInitiationInteractor;
        this.f173270q = mra.d.b(this, new c(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, ((q7c.j) this.f173269p).c(this.o.f84733a, "INPERSON_TERMINAL"), null, new j82.q(this, null, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f173270q;
    }
}
