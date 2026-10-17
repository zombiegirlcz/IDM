package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanCheckoutScreenContract$InputData f4411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f4413c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f4414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f4415h;

    public r(b bVar, q qVar, EsimMobilePlanCheckoutScreenContract$InputData esimMobilePlanCheckoutScreenContract$InputData) {
        this.f4412b = bVar;
        this.f4411a = esimMobilePlanCheckoutScreenContract$InputData;
        this.f4413c = e4m.b.b(new d(bVar, qVar, this, 1, 2));
        int i = 2;
        this.d = e4m.b.b(new d(bVar, qVar, this, 0, i));
        this.e = e4m.b.b(new d(bVar, qVar, this, 2, i));
        this.f = e4m.b.b(new d(bVar, qVar, this, 3, i));
        this.f4414g = e4m.b.b(new d(bVar, qVar, this, 5, i));
        this.f4415h = e4m.b.b(new d(bVar, qVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get(), (yji.n) this.e.get(), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
