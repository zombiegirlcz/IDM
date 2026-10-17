package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.date.DatePickerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class u1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DatePickerScreenContract$InputData f119882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f119884c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119886h;

    public u1(c1 c1Var, r0 r0Var, ViewController viewController, DatePickerScreenContract$InputData datePickerScreenContract$InputData) {
        this.f119882a = datePickerScreenContract$InputData;
        this.f119883b = e4m.b.b(e4m.c.a(viewController));
        e0 e0Var = new e0(c1Var, r0Var, this, 1, 9);
        this.f119884c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, r0Var, this, 0, 9));
        this.f = e4m.b.b(this.f119884c);
        this.f119885g = e4m.b.b(new e0(c1Var, r0Var, this, 3, 9));
        this.f119886h = e4m.b.b(new e0(c1Var, r0Var, this, 2, 9));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
