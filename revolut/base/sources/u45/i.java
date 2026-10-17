package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.autopay.flow.LoanAutopayFlowContract$InputData;
import dw3.k9;
import dw3.z5;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements qji.a, rk4.a, ok4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanAutopayFlowContract$InputData f277147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f277149c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public i(h hVar, LoanAutopayFlowContract$InputData loanAutopayFlowContract$InputData) {
        this.f277148b = hVar;
        this.f277147a = loanAutopayFlowContract$InputData;
        this.d = e4m.b.b(new e(hVar, this, 1, 2));
        this.e = e4m.b.b(new e(hVar, this, 0, 2));
        this.f = e4m.b.b(new e(hVar, this, 2, 2));
    }

    @Override // rk4.a
    public final z5 c() {
        return new z5(this.f277148b, this.f277149c, 2);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // ok4.a
    public final k9 s() {
        return new k9(this.f277148b, this.f277149c, 4);
    }
}
