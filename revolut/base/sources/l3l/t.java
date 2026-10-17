package l3l;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends iri.a implements c, o3l.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f191982j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3l.f f191983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f191984c;
    public final te0.j d;
    public final te0.j e;
    public final te0.r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.r f191985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.r f191986h;
    public final te0.r i;

    static {
        h0 h0Var = new h0(t.class, "successScreenIncrementEnabled", "getSuccessScreenIncrementEnabled()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f191982j = new KProperty[]{p0Var.j(h0Var), p.a.y(t.class, "autoFinishTimeout", "getAutoFinishTimeout()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(t.class, "extraData", "getExtraData()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public t(o3l.f operationStatusStepState) {
        Intrinsics.checkNotNullParameter(operationStatusStepState, "operationStatusStepState");
        this.f191983b = operationStatusStepState;
        this.f191984c = new te0.j();
        this.d = new te0.j();
        this.e = new te0.j();
        this.f = new te0.r();
        this.f191985g = new te0.r();
        this.f191986h = new te0.r();
        this.i = new te0.r();
    }

    @Override // o3l.f
    public final te0.e B() {
        return this.f191983b.B();
    }

    @Override // o3l.f
    public final te0.e C() {
        return this.f191983b.C();
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f191983b.D(bundle);
    }

    @Override // o3l.f
    public final te0.e I() {
        return this.f191983b.I();
    }

    @Override // o3l.f
    public final te0.e L() {
        return this.f191983b.L();
    }

    @Override // o3l.f
    public final te0.e M() {
        return this.f191983b.M();
    }

    @Override // o3l.f
    public final te0.e N() {
        return this.f191983b.N();
    }

    @Override // o3l.f
    public final te0.e O() {
        return this.f191983b.O();
    }

    @Override // o3l.f
    public final te0.e Q() {
        return this.f191983b.Q();
    }

    @Override // o3l.f
    public final te0.e R() {
        return this.f191983b.R();
    }

    @Override // o3l.f
    public final te0.e T() {
        return this.f191983b.T();
    }

    @Override // o3l.f
    public final te0.e W() {
        return this.f191983b.W();
    }

    @Override // o3l.f
    public final te0.e X() {
        return this.f191983b.X();
    }

    @Override // o3l.f
    public final te0.e Y() {
        return this.f191983b.Y();
    }

    @Override // o3l.f
    public final te0.e c() {
        return this.f191983b.c();
    }

    @Override // o3l.f
    public final te0.e d0() {
        return this.f191983b.d0();
    }

    @Override // o3l.f
    public final te0.e e0() {
        return this.f191983b.e0();
    }

    @Override // o3l.f
    public final te0.e getImage() {
        return this.f191983b.getImage();
    }

    @Override // o3l.f
    public final te0.e getProgress() {
        return this.f191983b.getProgress();
    }

    @Override // o3l.f
    public final te0.e k0() {
        return this.f191983b.k0();
    }

    @Override // o3l.f
    public final te0.e l() {
        return this.f191983b.l();
    }

    @Override // o3l.f
    public final te0.e m() {
        return this.f191983b.m();
    }

    @Override // o3l.f
    public final te0.e m0() {
        return this.f191983b.m0();
    }

    @Override // o3l.f
    public final te0.e o0() {
        return this.f191983b.o0();
    }

    @Override // o3l.f
    public final te0.e p() {
        return this.f191983b.p();
    }

    @Override // o3l.f
    public final te0.e p0() {
        return this.f191983b.p0();
    }

    @Override // o3l.f
    public final te0.e r() {
        return this.f191983b.r();
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f191983b.s(bundle);
    }

    @Override // o3l.f
    public final te0.e t() {
        return this.f191983b.t();
    }

    @Override // o3l.f
    public final te0.e u() {
        return this.f191983b.u();
    }

    @Override // iri.a
    public final Sequence v0() {
        KProperty[] kPropertyArr = f191982j;
        te0.e[] elements = {this.f191984c.getValue(this, kPropertyArr[0]), this.d.getValue(this, kPropertyArr[1]), this.e.getValue(this, kPropertyArr[2])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    @Override // o3l.f
    public final te0.e w() {
        return this.f191983b.w();
    }
}
