package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation.LoanConfirmWithdrawalControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanConfirmWithdrawalControllerContract$InputData f277179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277181c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public n(h hVar, k kVar, ViewController viewController, LoanConfirmWithdrawalControllerContract$InputData loanConfirmWithdrawalControllerContract$InputData) {
        this.f277180b = hVar;
        this.f277179a = loanConfirmWithdrawalControllerContract$InputData;
        this.f277181c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new e(hVar, this, 0, 7));
        this.e = e4m.b.b(new e(hVar, this, 1, 7));
        this.f = e4m.b.b(new e(hVar, this, 2, 7));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.d.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
