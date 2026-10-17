package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.LoanInstalmentDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanInstalmentDetailsScreenContract$InputData f277212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277214c;
    public final e4m.e d;
    public final e4m.e e;

    public s(h hVar, LoanInstalmentDetailsScreenContract$InputData loanInstalmentDetailsScreenContract$InputData) {
        this.f277213b = hVar;
        this.f277212a = loanInstalmentDetailsScreenContract$InputData;
        this.f277214c = e4m.b.b(new e(hVar, this, 1, 9));
        this.d = e4m.b.b(new e(hVar, this, 0, 9));
        this.e = e4m.b.b(new e(hVar, this, 2, 9));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
