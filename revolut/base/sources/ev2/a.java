package ev2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card.verification.impl.flow.card_penny_topup.CardPennyTopUpFlowContract$InputData;
import dw3.w3;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardPennyTopUpFlowContract$InputData f129680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f129681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f129682c = this;
    public final e4m.e d;

    public a(c cVar, CardPennyTopUpFlowContract$InputData cardPennyTopUpFlowContract$InputData) {
        this.f129681b = cVar;
        this.f129680a = cardPennyTopUpFlowContract$InputData;
        this.d = e4m.b.b(new w3(cVar, this, 22));
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
