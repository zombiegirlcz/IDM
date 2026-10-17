package oi9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_later.impl.ui.purchasecalculator.PurchaseCalculatorControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PurchaseCalculatorControllerContract$InputData f225570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f225571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f225572c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f225573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f225574h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f225575j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f225576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f225577m;

    public v(f fVar, ViewController viewController, PurchaseCalculatorControllerContract$InputData purchaseCalculatorControllerContract$InputData) {
        this.f225571b = fVar;
        this.f225570a = purchaseCalculatorControllerContract$InputData;
        this.f225572c = e4m.b.b(e4m.c.a(viewController));
        int i = 14;
        this.d = e4m.b.b(new a(fVar, this, 2, i));
        this.e = e4m.b.b(new a(fVar, this, 1, i));
        this.f = e4m.b.b(new a(fVar, this, 0, i));
        this.f225573g = e4m.b.b(new a(fVar, this, 4, i));
        this.f225574h = e4m.b.b(new a(fVar, this, 3, i));
        this.i = e4m.b.b(new a(fVar, this, 6, i));
        this.f225575j = e4m.b.b(new a(fVar, this, 5, i));
        this.k = e4m.b.b(new a(fVar, this, 9, i));
        this.f225576l = e4m.b.b(new a(fVar, this, 8, i));
        this.f225577m = e4m.b.b(new a(fVar, this, 7, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f225575j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f225574h.get());
    }
}
