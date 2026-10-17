package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.LoanRepaymentAccountsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanRepaymentAccountsControllerContract$InputData f277227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277229c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f277231h;

    public u0(h hVar, t0 t0Var, ViewController viewController, LoanRepaymentAccountsControllerContract$InputData loanRepaymentAccountsControllerContract$InputData) {
        this.f277228b = hVar;
        this.f277227a = loanRepaymentAccountsControllerContract$InputData;
        this.f277229c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new e(hVar, this, 2, 28));
        this.e = e4m.b.b(new e(hVar, this, 1, 28));
        this.f = e4m.b.b(new e(hVar, this, 0, 28));
        this.f277230g = e4m.b.b(new e(hVar, this, 4, 28));
        this.f277231h = e4m.b.b(new e(hVar, this, 3, 28));
    }

    @Override // xki.e
    public final Set f() {
        s85.c extension = new s85.c((l35.b) this.f277228b.L.get());
        t85.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        return ImmutableSet.of(extension);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
