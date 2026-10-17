package hm1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bills.billers.api.navigation.BillersChooserNavigation$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillersChooserNavigation$InputData f153503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f153504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f153505c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f153506g;

    public f(d dVar, ViewController viewController, BillersChooserNavigation$InputData billersChooserNavigation$InputData) {
        this.f153503a = billersChooserNavigation$InputData;
        this.f153504b = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        this.f153505c = e4m.b.b(new hjg.b(dVar, this, 2, i));
        this.d = e4m.b.b(new hjg.b(dVar, this, 1, i));
        this.e = e4m.b.b(new hjg.b(dVar, this, 0, i));
        this.f = e4m.b.b(new hjg.b(dVar, this, 4, i));
        this.f153506g = e4m.b.b(new hjg.b(dVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
