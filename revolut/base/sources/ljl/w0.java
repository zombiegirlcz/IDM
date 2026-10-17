package ljl;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class w0 implements qol.a, xki.c, hnl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yil.a f196124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutSsoApi$SignUpInputData f196125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewController f196126c;
    public final q0 d;
    public final w0 e = this;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f196127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f196128h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f196129j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f196130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f196131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f196132n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f196133p;

    public w0(q0 q0Var, ViewController viewController, RevolutSsoApi$SignUpInputData revolutSsoApi$SignUpInputData, yil.a aVar) {
        this.d = q0Var;
        this.f196124a = aVar;
        this.f196125b = revolutSsoApi$SignUpInputData;
        this.f196126c = viewController;
        this.f = e4m.b.b(e4m.c.a(viewController));
        this.f196127g = e4m.b.b(new u(q0Var, this, 1, 6));
        this.f196128h = e4m.b.b(new u(q0Var, this, 0, 6));
        this.i = e4m.g.a(new u(q0Var, this, 4, 6));
        this.f196129j = e4m.b.b(new u(q0Var, this, 5, 6));
        this.k = e4m.b.b(new u(q0Var, this, 6, 6));
        this.f196130l = e4m.b.b(new u(q0Var, this, 3, 6));
        this.f196131m = e4m.b.b(new u(q0Var, this, 2, 6));
        this.f196132n = e4m.b.b(new u(q0Var, this, 7, 6));
        this.o = e4m.b.b(new u(q0Var, this, 9, 6));
        this.f196133p = e4m.b.b(new u(q0Var, this, 8, 6));
    }

    @Override // hnl.a
    public final j1 b() {
        return new j1(this.d, this.e, 1);
    }

    public final gnl.a c() {
        q0 q0Var = this.d;
        Context context = q0Var.f196055a;
        g90.a aVarW = q0Var.f196062g.w();
        vc.s.j(aVarW);
        return new gnl.a(context, aVarW);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f196128h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // qol.a
    public final l1 j() {
        return new l1(this.d, this.e, 0);
    }
}
