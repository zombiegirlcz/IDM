package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.CardOrderExperimentFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOrderExperimentFlowContract$InputData f302152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f302153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f302154c;

    public o(p pVar, CardOrderExperimentFlowContract$InputData cardOrderExperimentFlowContract$InputData) {
        this.f302153b = pVar;
        this.f302152a = cardOrderExperimentFlowContract$InputData;
        this.f302154c = e4m.b.b(new whc.d(pVar, this, 10));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302153b.V.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
