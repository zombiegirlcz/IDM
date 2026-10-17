package w5f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.InvestorUpdateHistoryFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestorUpdateHistoryFlowContract$InputData f295114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f295115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f295116c = this;
    public final e4m.e d;
    public final e4m.e e;

    public b(m mVar, InvestorUpdateHistoryFlowContract$InputData investorUpdateHistoryFlowContract$InputData) {
        this.f295115b = mVar;
        this.f295114a = investorUpdateHistoryFlowContract$InputData;
        int i = 8;
        this.d = e4m.b.b(new vzc.j(mVar, this, 1, i));
        this.e = e4m.b.b(new vzc.j(mVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
