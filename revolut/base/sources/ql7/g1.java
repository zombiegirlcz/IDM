package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.reservation.ReservationScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReservationScreenContract$InputData f247309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247311c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247312g;

    public g1(k0 k0Var, n nVar, BaseScreen baseScreen, ReservationScreenContract$InputData reservationScreenContract$InputData) {
        this.f247309a = reservationScreenContract$InputData;
        this.f247310b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 22;
        this.f247311c = e4m.b.b(new l(k0Var, this, 2, i));
        this.d = e4m.b.b(new l(k0Var, this, 1, i));
        this.e = e4m.b.b(new l(k0Var, this, 0, i));
        this.f = e4m.b.b(new l(k0Var, this, 4, i));
        this.f247312g = e4m.b.b(new l(k0Var, this, 3, i));
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
