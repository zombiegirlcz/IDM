package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$CombinedAuthentication;
import com.revolut.sso.api.models.UICustomization;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements xki.c, hnl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutSsoApi$InputData$CombinedAuthentication f195983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ywj.i f195984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UICustomization f195985c;
    public final ViewController d;
    public final q0 e;
    public final j f = this;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f195986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f195987h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f195988j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f195989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f195990m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f195991n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f195992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f195993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f195994r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f195995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l9f.z f195996t;

    public j(q0 q0Var, ViewController viewController, RevolutSsoApi$InputData$CombinedAuthentication revolutSsoApi$InputData$CombinedAuthentication, ywj.i iVar, UICustomization uICustomization) {
        this.e = q0Var;
        this.f195983a = revolutSsoApi$InputData$CombinedAuthentication;
        this.f195984b = iVar;
        this.f195985c = uICustomization;
        this.d = viewController;
        this.f195986g = e4m.g.a(new l9f.z(q0Var, this, 4, 29));
        this.f195987h = e4m.b.b(e4m.c.a(viewController));
        int i = 29;
        this.i = e4m.b.b(new l9f.z(q0Var, this, 5, i));
        this.f195988j = e4m.b.b(new l9f.z(q0Var, this, 6, i));
        this.k = e4m.b.b(new l9f.z(q0Var, this, 3, i));
        this.f195989l = e4m.b.b(new l9f.z(q0Var, this, 7, i));
        this.f195990m = e4m.b.b(new l9f.z(q0Var, this, 2, i));
        this.f195991n = e4m.b.b(new l9f.z(q0Var, this, 1, i));
        this.o = e4m.b.b(new l9f.z(q0Var, this, 0, i));
        this.f195992p = e4m.b.b(new l9f.z(q0Var, this, 8, i));
        this.f195993q = e4m.b.b(new l9f.z(q0Var, this, 9, i));
        this.f195994r = e4m.b.b(new l9f.z(q0Var, this, 10, i));
        this.f195995s = e4m.b.b(new l9f.z(q0Var, this, 12, i));
        this.f195996t = new l9f.z(q0Var, this, 11, i);
    }

    @Override // hnl.a
    public final j1 b() {
        return new j1(this.e, this.f, 2);
    }

    public final mp.p c() {
        q0 q0Var = this.e;
        l70.e eVar = q0Var.f196062g;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        cpi.g gVarH = q0Var.i.h();
        s70.a aVarM = eVar.m();
        vc.s.j(aVarM);
        return new mp.p(aVarF, gVarH, aVarM, jge.r.u(q0Var.f196055a));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f195992p.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.o.get());
    }
}
