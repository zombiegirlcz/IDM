package ine;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tax_residency.impl.ui.sole.TaxResidencySoleScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxResidencySoleScreenContract$InputData f162898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f162899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f162900c;
    public final e4m.e d;

    public r(o oVar, b bVar, ViewController viewController, TaxResidencySoleScreenContract$InputData taxResidencySoleScreenContract$InputData) {
        this.f162898a = taxResidencySoleScreenContract$InputData;
        this.f162899b = viewController;
        int i = 20;
        this.f162900c = e4m.b.b(new i9e.l(oVar, this, 1, i));
        this.d = e4m.b.b(new i9e.l(oVar, this, 0, i));
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
