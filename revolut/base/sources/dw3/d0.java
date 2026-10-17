package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.ChangeRepaymentDayScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChangeRepaymentDayScreenContract$InputData f118528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118530c;
    public final afj.d d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118532h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118533j;

    public d0(c1 c1Var, q4 q4Var, ViewController viewController, ChangeRepaymentDayScreenContract$InputData changeRepaymentDayScreenContract$InputData) {
        this.f118529b = c1Var;
        this.f118528a = changeRepaymentDayScreenContract$InputData;
        this.f118530c = e4m.b.b(e4m.c.a(viewController));
        afj.d dVar = new afj.d(c1Var, q4Var, this, 1, 29);
        this.d = dVar;
        this.e = e4m.b.b(dVar);
        this.f = e4m.b.b(new afj.d(c1Var, q4Var, this, 0, 29));
        this.f118531g = e4m.b.b(new afj.d(c1Var, q4Var, this, 2, 29));
        this.f118532h = e4m.b.b(new afj.d(c1Var, q4Var, this, 3, 29));
        this.i = e4m.b.b(this.d);
        this.f118533j = e4m.b.b(new afj.d(c1Var, q4Var, this, 4, 29));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f118531g.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118532h.get(), (yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f118531g.get());
    }
}
