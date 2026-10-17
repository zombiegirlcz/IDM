package rlb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import r7d.o;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductSelectionContract$InputData f255000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f255001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f255002c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f255003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f255004h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f255005j;

    public j(e eVar, g gVar, ViewController viewController, SavingsProductSelectionContract$InputData savingsProductSelectionContract$InputData) {
        this.f255001b = eVar;
        this.f255000a = savingsProductSelectionContract$InputData;
        this.f255002c = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.d = e4m.b.b(new o(eVar, this, 2, i));
        this.e = e4m.b.b(new o(eVar, this, 1, i));
        this.f = e4m.b.b(new o(eVar, this, 0, i));
        this.f255003g = e4m.b.b(new o(eVar, this, 5, i));
        this.f255004h = e4m.b.b(new o(eVar, this, 4, i));
        this.i = e4m.b.b(new o(eVar, this, 3, i));
        this.f255005j = e4m.b.b(new o(eVar, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
