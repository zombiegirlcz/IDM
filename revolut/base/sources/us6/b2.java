package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f282461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f282462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282463c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f282464g;

    public b2(c2 c2Var, a2 a2Var, ViewController viewController) {
        this.f282461a = c2Var;
        this.f282462b = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.f282463c = e4m.b.b(new q0(c2Var, this, 2, i));
        this.d = e4m.b.b(new q0(c2Var, this, 1, i));
        this.e = e4m.b.b(new q0(c2Var, this, 0, i));
        this.f = e4m.b.b(new q0(c2Var, this, 4, i));
        this.f282464g = e4m.b.b(new q0(c2Var, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
