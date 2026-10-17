package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday.LoanConfirmNewRepaymentDayScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanConfirmNewRepaymentDayScreenContract$InputData f277173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f277174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277175c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277176g;

    public m(h hVar, BaseScreen baseScreen, LoanConfirmNewRepaymentDayScreenContract$InputData loanConfirmNewRepaymentDayScreenContract$InputData) {
        this.f277173a = loanConfirmNewRepaymentDayScreenContract$InputData;
        this.f277174b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 6;
        this.f277175c = e4m.b.b(new e(hVar, this, 2, i));
        this.d = e4m.b.b(new e(hVar, this, 1, i));
        this.e = e4m.b.b(new e(hVar, this, 0, i));
        this.f = e4m.b.b(new e(hVar, this, 4, i));
        this.f277176g = e4m.b.b(new e(hVar, this, 3, i));
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
