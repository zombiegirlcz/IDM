package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.delivery.DeviceDeliveryScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceDeliveryScreenContract$InputData f247527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f247529c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247531h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f247532j;

    public y(k0 k0Var, o oVar, BaseScreen baseScreen, DeviceDeliveryScreenContract$InputData deviceDeliveryScreenContract$InputData) {
        this.f247528b = k0Var;
        this.f247529c = oVar;
        this.f247527a = deviceDeliveryScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 7;
        this.e = e4m.b.b(new l(k0Var, this, 2, i));
        this.f = e4m.b.b(new l(k0Var, this, 1, i));
        this.f247530g = e4m.b.b(new l(k0Var, this, 0, i));
        this.f247531h = e4m.b.b(new l(k0Var, this, 4, i));
        this.i = e4m.b.b(new l(k0Var, this, 5, i));
        this.f247532j = e4m.b.b(new l(k0Var, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f247530g.get());
    }
}
