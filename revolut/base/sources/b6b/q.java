package b6b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements xki.c, h7b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsPlanHubFlowContract$InputData f12664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f12666c = this;
    public final e4m.e d;
    public final e4m.e e;

    public q(o oVar, CobrandedCardsPlanHubFlowContract$InputData cobrandedCardsPlanHubFlowContract$InputData) {
        this.f12665b = oVar;
        this.f12664a = cobrandedCardsPlanHubFlowContract$InputData;
        this.d = e4m.b.b(new m(oVar, this, 1, 2));
        this.e = e4m.b.b(new m(oVar, this, 0, 2));
    }

    @Override // h7b.a
    public final e0 b() {
        return new e0(this.f12665b, this.f12666c, 1);
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
