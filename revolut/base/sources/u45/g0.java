package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectautopay.LoanSelectAutopayScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanSelectAutopayScreenContract$InputData f277120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f277121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277122c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277123g;

    public g0(h hVar, BaseScreen baseScreen, LoanSelectAutopayScreenContract$InputData loanSelectAutopayScreenContract$InputData) {
        this.f277120a = loanSelectAutopayScreenContract$InputData;
        this.f277121b = e4m.b.b(e4m.c.a(baseScreen));
        this.f277122c = e4m.b.b(new e(hVar, this, 2, 17));
        this.d = e4m.b.b(new e(hVar, this, 1, 17));
        this.e = e4m.b.b(new e(hVar, this, 0, 17));
        this.f = e4m.b.b(new e(hVar, this, 4, 17));
        this.f277123g = e4m.b.b(new e(hVar, this, 3, 17));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
