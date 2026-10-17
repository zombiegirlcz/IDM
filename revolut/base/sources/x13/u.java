package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.guidelines.CardPersonalisationGuidelinesControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class u implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardPersonalisationGuidelinesControllerContract$InputData f302201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f302202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f302203c;
    public final e4m.e d;
    public final e4m.e e;

    public u(p pVar, q qVar, CardPersonalisationGuidelinesControllerContract$InputData cardPersonalisationGuidelinesControllerContract$InputData) {
        this.f302202b = pVar;
        this.f302203c = qVar;
        this.f302201a = cardPersonalisationGuidelinesControllerContract$InputData;
        int i = 17;
        this.d = e4m.b.b(new vy9.a(this, 1, i));
        this.e = e4m.b.b(new vy9.a(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302202b.V.get(), (yji.n) this.f302203c.f302183r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
