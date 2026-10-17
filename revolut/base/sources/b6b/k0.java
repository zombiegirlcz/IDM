package b6b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.confirmation.CobrandedCardsDowngradeConfirmationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class k0 implements b8b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsDowngradeConfirmationScreenContract$InputData f12630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f12632c;
    public final e4m.e d;

    public k0(o oVar, y yVar, CobrandedCardsDowngradeConfirmationScreenContract$InputData cobrandedCardsDowngradeConfirmationScreenContract$InputData) {
        this.f12631b = oVar;
        this.f12630a = cobrandedCardsDowngradeConfirmationScreenContract$InputData;
        int i = 9;
        this.f12632c = e4m.b.b(new aq1.e(this, 1, i));
        this.d = e4m.b.b(new aq1.e(this, 0, i));
    }

    @Override // b8b.a
    public final a8b.h a() {
        return (a8b.h) this.d.get();
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
