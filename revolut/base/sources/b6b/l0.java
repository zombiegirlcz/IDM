package b6b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.confirmation.CobrandedCardsDowngradeConfirmationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class l0 implements b8b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsDowngradeConfirmationScreenContract$InputData f12636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f12638c;
    public final e4m.e d;
    public final e4m.e e;

    public l0(o oVar, w wVar, CobrandedCardsDowngradeConfirmationScreenContract$InputData cobrandedCardsDowngradeConfirmationScreenContract$InputData) {
        this.f12637b = oVar;
        this.f12638c = wVar;
        this.f12636a = cobrandedCardsDowngradeConfirmationScreenContract$InputData;
        int i = 10;
        this.d = e4m.b.b(new aq1.e(this, 1, i));
        this.e = e4m.b.b(new aq1.e(this, 0, i));
    }

    @Override // b8b.a
    public final a8b.h a() {
        return (a8b.h) this.e.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f12638c.f12688l.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
