package ine;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tax_residency.impl.v2.ui.list.TaxResidencyListScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxResidencyListScreenContract$InputData f162922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f162923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f162924c;
    public final e4m.e d;

    public y(o oVar, g gVar, ViewController viewController, TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData) {
        this.f162922a = taxResidencyListScreenContract$InputData;
        this.f162923b = e4m.b.b(e4m.c.a(viewController));
        int i = 27;
        this.f162924c = e4m.b.b(new i9e.l(gVar, this, 1, i));
        this.d = e4m.b.b(new i9e.l(gVar, this, 0, i));
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
