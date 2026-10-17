package ljl;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements tkl.a, wml.a, qol.a, xki.c, hnl.a {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;
    public final e4m.e I;
    public final e4m.e J;
    public final e4m.e K;
    public final e4m.e L;
    public final e4m.e M;
    public final e4m.e N;
    public final e4m.e O;
    public final e4m.e P;
    public final e4m.e Q;
    public final e4m.e R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f195891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yil.a f195892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mki.b f195893c;
    public final AuthenticationFlowContract$InputData d;
    public final UICustomization e;
    public final q0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f195894g = this;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f195895h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f195896j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f195897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f195898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f195899n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f195900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f195901q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f195902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f195903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f195904t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f195905w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f195906x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f195907y;
    public final e4m.e z;

    public c(q0 q0Var, ViewController viewController, AuthenticationFlowContract$InputData authenticationFlowContract$InputData, mki.b bVar, yil.a aVar, UICustomization uICustomization) {
        this.f = q0Var;
        this.f195891a = viewController;
        this.f195892b = aVar;
        this.f195893c = bVar;
        this.d = authenticationFlowContract$InputData;
        this.e = uICustomization;
        int i = 26;
        this.f195895h = e4m.b.b(new l9f.z(q0Var, this, 3, i));
        this.i = e4m.b.b(new l9f.z(q0Var, this, 4, i));
        this.f195896j = e4m.b.b(e4m.c.a(viewController));
        int i2 = 26;
        this.k = e4m.b.b(new l9f.z(q0Var, this, 6, i2));
        this.f195897l = e4m.b.b(new l9f.z(q0Var, this, 8, i2));
        this.f195898m = e4m.b.b(new l9f.z(q0Var, this, 7, i2));
        this.f195899n = e4m.g.a(new l9f.z(q0Var, this, 10, i2));
        this.o = e4m.b.b(new l9f.z(q0Var, this, 11, i2));
        this.f195900p = e4m.b.b(new l9f.z(q0Var, this, 9, i2));
        this.f195901q = e4m.b.b(new l9f.z(q0Var, this, 5, i2));
        this.f195902r = e4m.b.b(new l9f.z(q0Var, this, 12, i2));
        this.f195903s = e4m.b.b(new l9f.z(q0Var, this, 13, i2));
        this.f195904t = e4m.b.b(new l9f.z(q0Var, this, 14, i2));
        this.u = e4m.b.b(new l9f.z(q0Var, this, 15, i2));
        this.v = e4m.b.b(new l9f.z(q0Var, this, 16, i2));
        this.f195905w = e4m.b.b(new l9f.z(q0Var, this, 17, i2));
        this.f195906x = e4m.b.b(new l9f.z(q0Var, this, 18, i2));
        this.f195907y = e4m.b.b(new l9f.z(q0Var, this, 19, i2));
        this.z = e4m.b.b(new l9f.z(q0Var, this, 20, i2));
        this.A = e4m.b.b(new l9f.z(q0Var, this, 21, i2));
        this.B = e4m.b.b(new l9f.z(q0Var, this, 2, i2));
        this.C = e4m.b.b(new l9f.z(q0Var, this, 1, i2));
        this.D = e4m.b.b(new l9f.z(q0Var, this, 0, i2));
        this.E = e4m.b.b(new l9f.z(q0Var, this, 22, i2));
        this.F = e4m.b.b(new l9f.z(q0Var, this, 23, i2));
        this.G = e4m.b.b(new l9f.z(q0Var, this, 24, i2));
        this.H = e4m.b.b(new l9f.z(q0Var, this, 25, i2));
        this.I = e4m.b.b(new l9f.z(q0Var, this, 26, i2));
        this.J = e4m.b.b(new l9f.z(q0Var, this, 27, i2));
        this.K = e4m.b.b(new l9f.z(q0Var, this, 28, i2));
        this.L = e4m.b.b(new l9f.z(q0Var, this, 29, i2));
        this.M = e4m.b.b(new l9f.z(q0Var, this, 30, i2));
        this.N = e4m.b.b(new l9f.z(q0Var, this, 31, i2));
        this.O = e4m.b.b(new l9f.z(q0Var, this, 32, i2));
        this.P = e4m.b.b(new l9f.z(q0Var, this, 33, i2));
        this.Q = e4m.b.b(new l9f.z(q0Var, this, 34, i2));
        this.R = e4m.b.b(new l9f.z(q0Var, this, 35, i2));
    }

    @Override // hnl.a
    public final j1 b() {
        return new j1(this.f, this.f195894g, 0);
    }

    @Override // wml.a
    public final h1 c() {
        return new h1(this.f, this.f195894g, 1);
    }

    @Override // xki.e
    public final Set f() {
        yji.n nVar = (yji.n) this.F.get();
        yji.n nVar2 = (yji.n) this.G.get();
        yji.n nVar3 = (yji.n) this.H.get();
        yji.n nVar4 = (yji.n) this.I.get();
        yji.n nVar5 = (yji.n) this.J.get();
        yji.n nVar6 = (yji.n) this.K.get();
        Object extension = (tnl.e) this.v.get();
        unl.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.n nVar7 = (yji.n) extension;
        vc.s.k(nVar7);
        yji.n nVar8 = (yji.n) this.L.get();
        yji.n nVar9 = (yji.n) this.M.get();
        yji.n nVar10 = (yji.n) this.N.get();
        Object extension2 = (zpl.a) this.z.get();
        aql.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension2, "extension");
        yji.n nVar11 = (yji.n) extension2;
        vc.s.k(nVar11);
        return ImmutableSet.of(nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, (yji.n) this.O.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.D.get(), (yji.d) this.E.get());
    }

    @Override // qol.a
    public final l1 j() {
        return new l1(this.f, this.f195894g, 2);
    }

    @Override // tkl.a
    public final z0 q() {
        return new z0(this.f, this.f195894g, 1);
    }

    public final mp.p s() {
        q0 q0Var = this.f;
        l70.e eVar = q0Var.f196062g;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        cpi.g gVarH = q0Var.i.h();
        s70.a aVarM = eVar.m();
        vc.s.j(aVarM);
        return new mp.p(aVarF, gVarH, aVarM, jge.r.u(q0Var.f196055a));
    }

    public final gnl.a y() {
        q0 q0Var = this.f;
        Context context = q0Var.f196055a;
        g90.a aVarW = q0Var.f196062g.w();
        vc.s.j(aVarW);
        return new gnl.a(context, aVarW);
    }
}
