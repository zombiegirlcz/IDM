package b6b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.CobrandedCardsTypeSelectionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 implements f7b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsTypeSelectionScreenContract$InputData f12574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f12576c;
    public final e4m.e d;
    public final e4m.e e;

    public d0(o oVar, p pVar, CobrandedCardsTypeSelectionScreenContract$InputData cobrandedCardsTypeSelectionScreenContract$InputData) {
        this.f12575b = oVar;
        this.f12576c = pVar;
        this.f12574a = cobrandedCardsTypeSelectionScreenContract$InputData;
        int i = 8;
        this.d = e4m.b.b(new aq1.e(this, 1, i));
        this.e = e4m.b.b(new aq1.e(this, 0, i));
    }

    @Override // f7b.a
    public final e7b.e a() {
        return (e7b.e) this.e.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f12576c.f12663m.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
