package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.payment.PaymentBreakdownScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentBreakdownScreenContract$InputData f247520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247522c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247523g;

    public x0(k0 k0Var, n nVar, BaseScreen baseScreen, PaymentBreakdownScreenContract$InputData paymentBreakdownScreenContract$InputData) {
        this.f247520a = paymentBreakdownScreenContract$InputData;
        this.f247521b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 9;
        this.f247522c = e4m.b.b(new t(this, 2, i));
        this.d = e4m.b.b(new t(this, 1, i));
        this.e = e4m.b.b(new t(this, 0, i));
        this.f = e4m.b.b(new t(this, 4, i));
        this.f247523g = e4m.b.b(new t(this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
