package b6b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsTerminationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements xki.c, x7b.b, b8b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsTerminationFlowContract$InputData f12700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f12702c = this;
    public final e4m.e d = e4m.b.b(new ap3.d(this, 9));

    public y(o oVar, CobrandedCardsTerminationFlowContract$InputData cobrandedCardsTerminationFlowContract$InputData) {
        this.f12701b = oVar;
        this.f12700a = cobrandedCardsTerminationFlowContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // x7b.b
    public final g0 j() {
        return new g0(this.f12701b, this.f12702c, 0);
    }

    @Override // b8b.b
    public final j0 q() {
        return new j0(this.f12701b, this.f12702c, 0);
    }
}
