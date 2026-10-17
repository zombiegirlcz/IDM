package p54;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import qc0.g1;
import te0.r;
import te0.v;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends iri.a implements qc0.k, qv3.a, e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f233016h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f233017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c84.f f233018c;
    public final te0.j d;
    public final te0.j e;
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.n f233019g;

    static {
        h0 h0Var = new h0(n.class, "finishActionState", "getFinishActionState()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f233016h = new KProperty[]{p0Var.j(h0Var), p.a.y(n.class, "requiresCancellation", "getRequiresCancellation()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n.class, "showLegacyCancelResultDialog", "getShowLegacyCancelResultDialog()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n.class, "parcel", "getParcel()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public n(g1 backendFlowState, c84.f pluginFlowState) {
        Intrinsics.checkNotNullParameter(backendFlowState, "backendFlowState");
        Intrinsics.checkNotNullParameter(pluginFlowState, "pluginFlowState");
        this.f233017b = backendFlowState;
        this.f233018c = pluginFlowState;
        this.d = new te0.j(c.MOVE_NEXT);
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.e = new te0.j(bool);
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f = new te0.j(bool);
        this.f233019g = new te0.n();
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f233017b.D(bundle);
        this.f233018c.D(bundle);
    }

    @Override // qc0.k
    public final te0.e G() {
        return this.f233017b.G();
    }

    @Override // p54.e
    public final te0.e J() {
        return this.d.getValue(this, f233016h[0]);
    }

    @Override // qc0.k
    public final v P() {
        return this.f233017b.f244432l;
    }

    @Override // p54.e
    public final te0.e V() {
        return this.e.getValue(this, f233016h[1]);
    }

    @Override // p54.e
    public final te0.e a() {
        return this.f233019g.getValue(this, f233016h[3]);
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e a0() {
        return this.f233017b.f244427b.a0();
    }

    @Override // qc0.k
    public final r b() {
        return this.f233017b.f244431j;
    }

    @Override // qc0.k
    public final r e() {
        return this.f233017b.f244430h;
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e f0() {
        return this.f233017b.f244427b.f0();
    }

    @Override // qc0.k
    public final r g() {
        return this.f233017b.i;
    }

    @Override // qc0.k
    public final v g0() {
        return this.f233017b.f244429g;
    }

    @Override // qc0.k
    public final te0.e getLocale() {
        return this.f233017b.getLocale();
    }

    @Override // qc0.k
    public final te0.e h() {
        return this.f233017b.h();
    }

    @Override // qc0.k
    public final r i() {
        return this.f233017b.k;
    }

    @Override // com.revolut.feature.chooser.d
    public final v j() {
        return this.f233017b.f244427b.j();
    }

    @Override // qc0.k
    public final v k() {
        return this.f233017b.e;
    }

    @Override // p54.e
    public final te0.e n() {
        return this.f.getValue(this, f233016h[2]);
    }

    @Override // qv3.a
    public final te0.e n0() {
        return this.f233018c.n0();
    }

    @Override // qc0.k
    public final te0.e q() {
        return this.f233017b.q();
    }

    @Override // qc0.k
    public final te0.e r0() {
        return this.f233017b.r0();
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f233017b.s(bundle);
        this.f233018c.s(bundle);
    }
}
