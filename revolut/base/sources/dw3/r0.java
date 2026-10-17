package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.ConveyancingAppointmentSchedulingFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class r0 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConveyancingAppointmentSchedulingFlowContract$InputData f119613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119614c;
    public final r0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119616h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119617j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119619m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119620n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119622q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119625t;
    public final e4m.e u;

    public r0(c1 c1Var, iq3.a aVar, ViewController viewController, ConveyancingAppointmentSchedulingFlowContract$InputData conveyancingAppointmentSchedulingFlowContract$InputData) {
        this.f119614c = c1Var;
        this.f119612a = aVar;
        this.f119613b = conveyancingAppointmentSchedulingFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f119615g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f119616h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(conveyancingAppointmentSchedulingFlowContract$InputData));
        int i2 = 21;
        this.f119617j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f119618l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f119619m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f119620n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f119621p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f119622q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f119623r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f119624s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f119625t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119624s.get(), (yji.n) this.f119625t.get(), (yji.n) this.f119621p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119616h.get(), (yji.d) this.f119623r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119614c, this.d, 25);
    }
}
