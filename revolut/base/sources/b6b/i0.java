package b6b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 implements x7b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsValueReminderScreenContract$InputData f12619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f12621c;
    public final e4m.e d;
    public final e4m.e e;

    public i0(o oVar, w wVar, CobrandedCardsValueReminderScreenContract$InputData cobrandedCardsValueReminderScreenContract$InputData) {
        this.f12620b = oVar;
        this.f12621c = wVar;
        this.f12619a = cobrandedCardsValueReminderScreenContract$InputData;
        this.d = e4m.b.b(new afj.d(oVar, wVar, this, 1, 14));
        this.e = e4m.b.b(new afj.d(oVar, wVar, this, 0, 14));
    }

    @Override // x7b.a
    public final w7b.k a() {
        return (w7b.k) this.e.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f12621c.f12688l.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
