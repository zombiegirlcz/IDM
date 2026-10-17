package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedcreditlistv2.LoanRefinancedCreditListV2ControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class z implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanRefinancedCreditListV2ControllerContract$InputData f277259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f277260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277261c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277262g;

    public z(h hVar, ViewController viewController, LoanRefinancedCreditListV2ControllerContract$InputData loanRefinancedCreditListV2ControllerContract$InputData) {
        this.f277259a = loanRefinancedCreditListV2ControllerContract$InputData;
        this.f277260b = e4m.b.b(e4m.c.a(viewController));
        this.f277261c = e4m.b.b(new e(hVar, this, 2, 11));
        this.d = e4m.b.b(new e(hVar, this, 1, 11));
        this.e = e4m.b.b(new e(hVar, this, 0, 11));
        this.f = e4m.b.b(new e(hVar, this, 4, 11));
        this.f277262g = e4m.b.b(new e(hVar, this, 3, 11));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
