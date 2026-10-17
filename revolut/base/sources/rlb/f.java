package rlb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.SavingsCurrencySelectionContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import r7d.o;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsCurrencySelectionContract$InputData f254984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f254985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f254986c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f254987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f254988h;
    public final e4m.e i;

    public f(e eVar, g gVar, ViewController viewController, SavingsCurrencySelectionContract$InputData savingsCurrencySelectionContract$InputData) {
        this.f254984a = savingsCurrencySelectionContract$InputData;
        this.f254985b = e4m.b.b(e4m.c.a(viewController));
        int i = 14;
        this.f254986c = e4m.b.b(new o(eVar, this, 2, i));
        this.d = e4m.b.b(new o(eVar, this, 1, i));
        this.e = e4m.b.b(new o(eVar, this, 0, i));
        this.f = e4m.b.b(new o(eVar, this, 5, i));
        this.f254987g = e4m.b.b(new o(eVar, this, 4, i));
        this.f254988h = e4m.b.b(new o(eVar, this, 3, i));
        this.i = e4m.b.b(new o(eVar, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f254988h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
