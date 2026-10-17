package b6b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details.CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class u implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData f12676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f12678c;
    public final e4m.e d;

    public u(o oVar, q qVar, CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData cobrandedCardsPlanHubTransactionDetailsScreenContract$InputData) {
        this.f12677b = oVar;
        this.f12676a = cobrandedCardsPlanHubTransactionDetailsScreenContract$InputData;
        int i = 6;
        this.f12678c = e4m.b.b(new m(oVar, this, 1, i));
        this.d = e4m.b.b(new m(oVar, this, 0, i));
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
