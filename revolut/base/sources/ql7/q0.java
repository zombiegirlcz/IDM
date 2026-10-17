package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.car_type.MtaCarTypeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MtaCarTypeScreenContract$InputData f247435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247437c = e4m.b.b(new t(this, 3, 6));
    public final e4m.e d = e4m.b.b(new t(this, 2, 6));
    public final e4m.e e = e4m.b.b(new t(this, 1, 6));
    public final e4m.e f = e4m.b.b(new t(this, 0, 6));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247438g = e4m.b.b(new t(this, 4, 6));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247439h = e4m.b.b(new t(this, 6, 6));
    public final e4m.e i = e4m.b.b(new t(this, 5, 6));

    public q0(k0 k0Var, t0 t0Var, ViewController viewController, MtaCarTypeScreenContract$InputData mtaCarTypeScreenContract$InputData) {
        this.f247435a = mtaCarTypeScreenContract$InputData;
        this.f247436b = e4m.b.b(e4m.c.a(viewController));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f247438g.get());
    }
}
