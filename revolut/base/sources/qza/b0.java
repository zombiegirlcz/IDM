package qza;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import v3e.e0;

/* JADX INFO: loaded from: classes13.dex */
public final class b0 extends iri.a implements g, v3e.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f250458g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f250459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f250460c;
    public final te0.j d;
    public final te0.j e;
    public final Sequence f;

    static {
        h0 h0Var = new h0(b0.class, "remoteStoriesModels", "getRemoteStoriesModels()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f250458g = new KProperty[]{p0Var.j(h0Var), p.a.y(b0.class, "config", "getConfig()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(b0.class, "loadingState", "getLoadingState()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public b0() {
        e0 storiesState = new e0();
        Intrinsics.checkNotNullParameter(storiesState, "storiesState");
        this.f250459b = storiesState;
        this.f250460c = new te0.j();
        this.d = new te0.j();
        this.e = new te0.j(h.INITIAL);
        te0.e[] elements = {y0(), w0(), x0()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f = kotlin.collections.d.E(elements);
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f250459b.D(bundle);
    }

    @Override // v3e.d
    public final te0.e H() {
        e0 e0Var = this.f250459b;
        return e0Var.f285897h.getValue(e0Var, e0.f285893j[6]);
    }

    @Override // v3e.d
    public final te0.e S() {
        e0 e0Var = this.f250459b;
        return e0Var.f285895c.getValue(e0Var, e0.f285893j[1]);
    }

    @Override // v3e.d
    public final te0.e Z() {
        e0 e0Var = this.f250459b;
        return e0Var.d.getValue(e0Var, e0.f285893j[2]);
    }

    @Override // v3e.d
    public final te0.e l0() {
        e0 e0Var = this.f250459b;
        return e0Var.f.getValue(e0Var, e0.f285893j[4]);
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f250459b.s(bundle);
        super.s(bundle);
    }

    @Override // v3e.d
    public final te0.e s0() {
        e0 e0Var = this.f250459b;
        return e0Var.f285896g.getValue(e0Var, e0.f285893j[5]);
    }

    @Override // v3e.d
    public final te0.e t0() {
        e0 e0Var = this.f250459b;
        return e0Var.i.getValue(e0Var, e0.f285893j[7]);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f;
    }

    public final te0.e w0() {
        return this.d.getValue(this, f250458g[1]);
    }

    @Override // v3e.d
    public final te0.e x() {
        e0 e0Var = this.f250459b;
        return e0Var.f285894b.getValue(e0Var, e0.f285893j[0]);
    }

    public final te0.e x0() {
        return this.e.getValue(this, f250458g[2]);
    }

    public final te0.e y0() {
        return this.f250460c.getValue(this, f250458g[0]);
    }
}
