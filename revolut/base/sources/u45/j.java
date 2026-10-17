package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.LoanCancellationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanCancellationFlowContract$InputData f277153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f277155c = this;
    public final e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277156g;

    public j(h hVar, LoanCancellationFlowContract$InputData loanCancellationFlowContract$InputData) {
        this.f277154b = hVar;
        this.f277153a = loanCancellationFlowContract$InputData;
        int i = 3;
        this.d = new e(hVar, this, 2, i);
        this.e = e4m.b.b(new e(hVar, this, 1, i));
        this.f = e4m.b.b(new e(hVar, this, 0, i));
        this.f277156g = e4m.b.b(new e(hVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
