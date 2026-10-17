package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.email.change.ChangeEmailInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements vll.a, wml.a, xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChangeEmailInputData f195931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f195932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f195933c;
    public final f d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f195934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f195935h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f195936j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f195937l;

    public f(q0 q0Var, ViewController viewController, ChangeEmailInputData changeEmailInputData) {
        this.f195933c = q0Var;
        this.f195931a = changeEmailInputData;
        this.f195932b = viewController;
        this.e = e4m.g.a(new l9f.z(q0Var, this, 2, 27));
        this.f = e4m.b.b(e4m.c.a(viewController));
        int i = 27;
        this.f195934g = e4m.b.b(new l9f.z(q0Var, this, 3, i));
        this.f195935h = e4m.b.b(new l9f.z(q0Var, this, 4, i));
        this.i = e4m.b.b(new l9f.z(q0Var, this, 1, i));
        this.f195936j = e4m.b.b(new l9f.z(q0Var, this, 5, i));
        this.k = e4m.b.b(new l9f.z(q0Var, this, 0, i));
        this.f195937l = e4m.b.b(new l9f.z(q0Var, this, 6, i));
    }

    @Override // vll.a
    public final b1 b() {
        return new b1(this.f195933c, this.d, 1);
    }

    @Override // wml.a
    public final h1 c() {
        return new h1(this.f195933c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
