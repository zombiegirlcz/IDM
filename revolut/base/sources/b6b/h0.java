package b6b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 implements x7b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsValueReminderScreenContract$InputData f12614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f12616c;
    public final e4m.e d;

    public h0(o oVar, y yVar, CobrandedCardsValueReminderScreenContract$InputData cobrandedCardsValueReminderScreenContract$InputData) {
        this.f12615b = oVar;
        this.f12614a = cobrandedCardsValueReminderScreenContract$InputData;
        int i = 16;
        this.f12616c = e4m.b.b(new m(oVar, this, 1, i));
        this.d = e4m.b.b(new m(oVar, this, 0, i));
    }

    @Override // x7b.a
    public final w7b.k a() {
        return (w7b.k) this.d.get();
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
