package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2FlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanCancellationV2FlowContract$InputData f277160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f277162c = this;
    public final e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277163g;

    public k(h hVar, LoanCancellationV2FlowContract$InputData loanCancellationV2FlowContract$InputData) {
        this.f277161b = hVar;
        this.f277160a = loanCancellationV2FlowContract$InputData;
        this.d = new e(hVar, this, 2, 4);
        this.e = e4m.b.b(new e(hVar, this, 1, 4));
        this.f = e4m.b.b(new e(hVar, this, 0, 4));
        this.f277163g = e4m.b.b(new e(hVar, this, 3, 4));
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
