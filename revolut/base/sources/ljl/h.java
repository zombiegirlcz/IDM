package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements vll.a, qol.a, xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChangePhoneFlowContract$InputData f195954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f195955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f195956c;
    public final h d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f195957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f195958h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f195959j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f195960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f195961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f195962n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f195963p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f195964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f195965r;

    public h(q0 q0Var, ViewController viewController, ChangePhoneFlowContract$InputData changePhoneFlowContract$InputData) {
        this.f195956c = q0Var;
        this.f195954a = changePhoneFlowContract$InputData;
        this.f195955b = viewController;
        int i = 28;
        this.e = e4m.b.b(new l9f.z(q0Var, this, 1, i));
        this.f = e4m.b.b(new l9f.z(q0Var, this, 0, i));
        this.f195957g = e4m.b.b(new l9f.z(q0Var, this, 3, i));
        this.f195958h = e4m.b.b(new l9f.z(q0Var, this, 2, i));
        this.i = e4m.g.a(new l9f.z(q0Var, this, 6, i));
        this.f195959j = e4m.b.b(e4m.c.a(viewController));
        int i2 = 28;
        this.k = e4m.b.b(new l9f.z(q0Var, this, 7, i2));
        this.f195960l = e4m.b.b(new l9f.z(q0Var, this, 8, i2));
        this.f195961m = e4m.b.b(new l9f.z(q0Var, this, 5, i2));
        this.f195962n = e4m.b.b(new l9f.z(q0Var, this, 9, i2));
        this.o = e4m.b.b(new l9f.z(q0Var, this, 4, i2));
        this.f195963p = e4m.b.b(new l9f.z(q0Var, this, 10, i2));
        this.f195964q = e4m.b.b(new l9f.z(q0Var, this, 12, i2));
        this.f195965r = e4m.b.b(new l9f.z(q0Var, this, 11, i2));
    }

    @Override // vll.a
    public final b1 b() {
        return new b1(this.f195956c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get(), (yji.n) this.f195958h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // qol.a
    public final l1 j() {
        return new l1(this.f195956c, this.d, 1);
    }
}
