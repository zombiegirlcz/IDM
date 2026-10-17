package ine;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxResidencyListScreenContract$InputData f162904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f162905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f162906c;
    public final e4m.e d;
    public final e4m.e e;

    public t(o oVar, n nVar, ViewController viewController, TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData) {
        this.f162905b = oVar;
        this.f162904a = taxResidencyListScreenContract$InputData;
        this.f162906c = e4m.b.b(e4m.c.a(viewController));
        int i = 1;
        this.d = e4m.b.b(new il8.d(oVar, nVar, this, 1, i));
        this.e = e4m.b.b(new il8.d(oVar, nVar, this, 0, i));
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
