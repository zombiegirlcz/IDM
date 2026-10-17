package p7c;

import com.revolut.feature.revolutpay.shared.ui.terminal_payment.TerminalPaymentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class r0 implements kec.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f233696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f233697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TerminalPaymentScreenContract$InputData f233698c;

    public r0(r rVar) {
        this.f233696a = rVar;
    }

    @Override // kec.a
    public final kec.a H(TerminalPaymentScreenContract$InputData terminalPaymentScreenContract$InputData) {
        terminalPaymentScreenContract$InputData.getClass();
        this.f233698c = terminalPaymentScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f233697b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f233697b, ViewController.class);
        vc.s.h(this.f233698c, TerminalPaymentScreenContract$InputData.class);
        return new q0(this.f233696a, this.f233698c);
    }
}
