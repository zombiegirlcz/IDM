package p7c;

import com.revolut.feature.revolutpay.shared.ui.terminal_payment.TerminalPaymentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class p0 implements kec.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f233659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f233660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f233661c;
    public TerminalPaymentScreenContract$InputData d;

    public p0(r rVar, x xVar) {
        this.f233659a = rVar;
        this.f233660b = xVar;
    }

    @Override // kec.a
    public final kec.a H(TerminalPaymentScreenContract$InputData terminalPaymentScreenContract$InputData) {
        terminalPaymentScreenContract$InputData.getClass();
        this.d = terminalPaymentScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f233661c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f233661c, ViewController.class);
        vc.s.h(this.d, TerminalPaymentScreenContract$InputData.class);
        return new q0(this.f233659a, this.f233660b, this.d);
    }
}
