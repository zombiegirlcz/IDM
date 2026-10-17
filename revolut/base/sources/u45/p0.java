package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.welcome.LoanWelcomeControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class p0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanWelcomeControllerContract$InputData f277194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f277195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277196c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f277198h;

    public p0(h hVar, ViewController viewController, LoanWelcomeControllerContract$InputData loanWelcomeControllerContract$InputData) {
        this.f277194a = loanWelcomeControllerContract$InputData;
        this.f277195b = e4m.b.b(e4m.c.a(viewController));
        this.f277196c = e4m.b.b(new e(hVar, this, 2, 23));
        this.d = e4m.b.b(new e(hVar, this, 1, 23));
        this.e = e4m.b.b(new e(hVar, this, 0, 23));
        this.f = e4m.b.b(new e(hVar, this, 3, 23));
        this.f277197g = e4m.b.b(new e(hVar, this, 5, 23));
        this.f277198h = e4m.b.b(new e(hVar, this, 4, 23));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f.get());
    }
}
