package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.ScheduleScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class x5 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduleScreenContract$InputData f120146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f120147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t5 f120148c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120150h;

    public x5(c1 c1Var, r0 r0Var, ViewController viewController, ScheduleScreenContract$InputData scheduleScreenContract$InputData) {
        this.f120146a = scheduleScreenContract$InputData;
        this.f120147b = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        t5 t5Var = new t5(c1Var, r0Var, this, 1, i);
        this.f120148c = t5Var;
        this.d = e4m.b.b(t5Var);
        this.e = e4m.b.b(new t5(c1Var, r0Var, this, 0, i));
        this.f = e4m.b.b(this.f120148c);
        this.f120149g = e4m.b.b(new t5(c1Var, r0Var, this, 3, i));
        this.f120150h = e4m.b.b(new t5(c1Var, r0Var, this, 2, i));
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
