package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreenContract$InputData;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f277114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanRepaymentsListScreenContract$InputData f277115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277116c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public f0(h hVar, ScreenContentRecyclerView screenContentRecyclerView, LoanRepaymentsListScreenContract$InputData loanRepaymentsListScreenContract$InputData) {
        this.f277114a = screenContentRecyclerView;
        this.f277115b = loanRepaymentsListScreenContract$InputData;
        int i = 16;
        this.f277116c = e4m.b.b(new e(hVar, this, 1, i));
        this.d = e4m.b.b(new e(hVar, this, 0, i));
        this.e = e4m.b.b(new e(hVar, this, 3, i));
        this.f = e4m.b.b(new e(hVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
