package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanAccountDetailsScreenContract$InputData f277117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277119c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public g(h hVar, LoanAccountDetailsScreenContract$InputData loanAccountDetailsScreenContract$InputData) {
        this.f277118b = hVar;
        this.f277117a = loanAccountDetailsScreenContract$InputData;
        int i = 1;
        this.f277119c = e4m.b.b(new e(hVar, this, 1, i));
        this.d = e4m.b.b(new e(hVar, this, 0, i));
        this.e = e4m.b.b(new e(hVar, this, 3, i));
        this.f = e4m.b.b(new e(hVar, this, 2, i));
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
