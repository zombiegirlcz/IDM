package rlb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.pick_your_rate.PickYourRateScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import r7d.o;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickYourRateScreenContract$InputData f254946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f254947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f254948c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f254949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f254950h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f254951j;

    public b(e eVar, g gVar, ViewController viewController, PickYourRateScreenContract$InputData pickYourRateScreenContract$InputData) {
        this.f254947b = eVar;
        this.f254946a = pickYourRateScreenContract$InputData;
        this.f254948c = e4m.b.b(e4m.c.a(viewController));
        int i = 11;
        this.d = e4m.b.b(new o(eVar, this, 2, i));
        this.e = e4m.b.b(new o(eVar, this, 1, i));
        this.f = e4m.b.b(new o(eVar, this, 0, i));
        this.f254949g = e4m.b.b(new o(eVar, this, 5, i));
        this.f254950h = e4m.b.b(new o(eVar, this, 4, i));
        this.i = e4m.b.b(new o(eVar, this, 3, i));
        this.f254951j = e4m.b.b(new o(eVar, this, 6, i));
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
