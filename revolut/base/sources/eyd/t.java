package eyd;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f130824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f130825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ehe.o f130826c;
    public final ehe.o d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130828h;
    public final e4m.e i;

    public t(b0 b0Var, r rVar, ViewController viewController) {
        this.f130824a = b0Var;
        this.f130825b = rVar;
        this.f130826c = new ehe.o(b0Var, rVar, this, 2, 9);
        int i = 9;
        this.d = new ehe.o(b0Var, rVar, this, 3, i);
        this.e = e4m.b.b(e4m.c.a(viewController));
        this.f = e4m.b.b(new ehe.o(b0Var, rVar, this, 4, i));
        this.f130827g = e4m.b.b(new ehe.o(b0Var, rVar, this, 1, i));
        this.f130828h = e4m.b.b(new ehe.o(b0Var, rVar, this, 0, i));
        this.i = e4m.b.b(new ehe.o(b0Var, rVar, this, 5, i));
    }

    public final kdh.b b() {
        b0 b0Var = this.f130824a;
        return new kdh.b(ImmutableMap.of("PERSONAL_CURRENT", b0Var.f130708r, "PRO_CURRENT", b0Var.f130709s, "JOINT_CURRENT", b0Var.f130710t), new lyd.s(b0Var.a()));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f130828h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
