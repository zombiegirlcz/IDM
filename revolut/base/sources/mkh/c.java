package mkh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.explanation.CashHoldingFundsExplanationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashHoldingFundsExplanationScreenContract$InputData f206315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f206316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f206317c;

    public c(s sVar, CashHoldingFundsExplanationScreenContract$InputData cashHoldingFundsExplanationScreenContract$InputData) {
        this.f206315a = cashHoldingFundsExplanationScreenContract$InputData;
        int i = 3;
        this.f206316b = e4m.b.b(new mjl.b(sVar, this, 1, i));
        this.f206317c = e4m.b.b(new mjl.b(sVar, this, 0, i));
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
