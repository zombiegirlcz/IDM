package t6k;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestActionNavigation$InputData;
import java.util.Set;
import t0b.l;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequestActionNavigation$InputData f268358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f268359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f268360c;
    public final e4m.e d;
    public final e4m.e e;

    public a(c cVar, MoneyRequestActionNavigation$InputData moneyRequestActionNavigation$InputData) {
        this.f268359b = cVar;
        this.f268358a = moneyRequestActionNavigation$InputData;
        int i = 13;
        this.f268360c = e4m.b.b(new l(cVar, this, 0, i));
        this.d = e4m.b.b(new l(cVar, this, 1, i));
        this.e = e4m.b.b(new l(cVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f268360c.get(), (yji.d) this.d.get());
    }
}
