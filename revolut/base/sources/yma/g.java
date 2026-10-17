package yma;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends iri.a implements c, o3l.f {
    public static final /* synthetic */ KProperty[] k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3l.f f314909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f314910c;
    public final te0.j d;
    public final te0.j e;
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f314911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f314912h;
    public final te0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f314913j;

    static {
        h0 h0Var = new h0(g.class, "confirmationCode", "getConfirmationCode()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        k = new KProperty[]{p0Var.j(h0Var), p.a.y(g.class, "step", "getStep()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g.class, "initialEmail", "getInitialEmail()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g.class, "newEmail", "getNewEmail()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g.class, "verified", "getVerified()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g.class, "errorCode", "getErrorCode()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g.class, "verificationCodeSendTime", "getVerificationCodeSendTime()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g.class, "verificationCodeWasSent", "getVerificationCodeWasSent()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public g(o3l.f operationStatusState) {
        Intrinsics.checkNotNullParameter(operationStatusState, "operationStatusState");
        this.f314909b = operationStatusState;
        this.f314910c = new te0.j();
        this.d = new te0.j(d.EMAIL);
        this.e = new te0.j();
        this.f = new te0.j();
        this.f314911g = new te0.j();
        this.f314912h = new te0.j();
        this.i = new te0.j();
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f314913j = new te0.j(bool);
    }

    @Override // o3l.f
    public final te0.e B() {
        return this.f314909b.B();
    }

    @Override // o3l.f
    public final te0.e C() {
        return this.f314909b.C();
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f314909b.D(bundle);
    }

    @Override // o3l.f
    public final te0.e I() {
        return this.f314909b.I();
    }

    @Override // o3l.f
    public final te0.e L() {
        return this.f314909b.L();
    }

    @Override // o3l.f
    public final te0.e M() {
        return this.f314909b.M();
    }

    @Override // o3l.f
    public final te0.e N() {
        return this.f314909b.N();
    }

    @Override // o3l.f
    public final te0.e O() {
        return this.f314909b.O();
    }

    @Override // o3l.f
    public final te0.e Q() {
        return this.f314909b.Q();
    }

    @Override // o3l.f
    public final te0.e R() {
        return this.f314909b.R();
    }

    @Override // o3l.f
    public final te0.e T() {
        return this.f314909b.T();
    }

    @Override // o3l.f
    public final te0.e W() {
        return this.f314909b.W();
    }

    @Override // o3l.f
    public final te0.e X() {
        return this.f314909b.X();
    }

    @Override // o3l.f
    public final te0.e Y() {
        return this.f314909b.Y();
    }

    @Override // o3l.f
    public final te0.e c() {
        return this.f314909b.c();
    }

    @Override // o3l.f
    public final te0.e d0() {
        return this.f314909b.d0();
    }

    @Override // o3l.f
    public final te0.e e0() {
        return this.f314909b.e0();
    }

    @Override // o3l.f
    public final te0.e getImage() {
        return this.f314909b.getImage();
    }

    @Override // o3l.f
    public final te0.e getProgress() {
        return this.f314909b.getProgress();
    }

    @Override // o3l.f
    public final te0.e k0() {
        return this.f314909b.k0();
    }

    @Override // o3l.f
    public final te0.e l() {
        return this.f314909b.l();
    }

    @Override // o3l.f
    public final te0.e m() {
        return this.f314909b.m();
    }

    @Override // o3l.f
    public final te0.e m0() {
        return this.f314909b.m0();
    }

    @Override // o3l.f
    public final te0.e o0() {
        return this.f314909b.o0();
    }

    @Override // o3l.f
    public final te0.e p() {
        return this.f314909b.p();
    }

    @Override // o3l.f
    public final te0.e p0() {
        return this.f314909b.p0();
    }

    @Override // o3l.f
    public final te0.e r() {
        return this.f314909b.r();
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f314909b.s(bundle);
    }

    @Override // o3l.f
    public final te0.e t() {
        return this.f314909b.t();
    }

    @Override // o3l.f
    public final te0.e u() {
        return this.f314909b.u();
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e eVarW0 = w0();
        te0.e eVarY0 = y0();
        KProperty[] kPropertyArr = k;
        te0.e[] elements = {eVarW0, eVarY0, this.e.getValue(this, kPropertyArr[2]), x0(), this.f314911g.getValue(this, kPropertyArr[4]), this.f314912h.getValue(this, kPropertyArr[5]), this.i.getValue(this, kPropertyArr[6]), this.f314913j.getValue(this, kPropertyArr[7])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    @Override // o3l.f
    public final te0.e w() {
        return this.f314909b.w();
    }

    public final te0.e w0() {
        return this.f314910c.getValue(this, k[0]);
    }

    public final te0.e x0() {
        return this.f.getValue(this, k[3]);
    }

    public final te0.e y0() {
        return this.d.getValue(this, k[1]);
    }
}
