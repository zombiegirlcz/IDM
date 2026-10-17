package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.dialogs.CardPersonalisationDialogsControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardPersonalisationDialogsControllerContract$InputData f302195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f302196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f302197c;
    public final e4m.e d;
    public final e4m.e e;

    public s(p pVar, q qVar, CardPersonalisationDialogsControllerContract$InputData cardPersonalisationDialogsControllerContract$InputData) {
        this.f302196b = pVar;
        this.f302197c = qVar;
        this.f302195a = cardPersonalisationDialogsControllerContract$InputData;
        int i = 15;
        this.d = e4m.b.b(new vy9.a(this, 1, i));
        this.e = e4m.b.b(new vy9.a(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302196b.V.get(), (yji.n) this.f302197c.f302183r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
