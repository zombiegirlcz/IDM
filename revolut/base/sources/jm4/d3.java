package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.credit_cards.CreditCardsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class d3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardsScreenContract$InputData f176038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176040c;

    public d3(a3 a3Var, CreditCardsScreenContract$InputData creditCardsScreenContract$InputData) {
        this.f176039b = a3Var;
        this.f176038a = creditCardsScreenContract$InputData;
        this.f176040c = e4m.b.b(new c3(a3Var, this, 0));
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
