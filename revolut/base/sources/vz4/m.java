package vz4;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import qc0.g1;
import te0.n;
import te0.r;
import te0.v;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends iri.a implements b, qc0.k {
    public static final /* synthetic */ KProperty[] f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f293397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f293398c;
    public final te0.j d;
    public final n e;

    static {
        h0 h0Var = new h0(m.class, "facilityId", "getFacilityId()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f = new KProperty[]{p0Var.j(h0Var), p.a.y(m.class, "applicationId", "getApplicationId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m.class, "applicationPayload", "getApplicationPayload()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public m(g1 backendFlowState) {
        Intrinsics.checkNotNullParameter(backendFlowState, "backendFlowState");
        this.f293397b = backendFlowState;
        this.f293398c = new te0.j();
        this.d = new te0.j();
        this.e = new n();
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f293397b.D(bundle);
    }

    @Override // qc0.k
    public final te0.e G() {
        return this.f293397b.G();
    }

    @Override // qc0.k
    public final v P() {
        return this.f293397b.f244432l;
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e a0() {
        return this.f293397b.f244427b.a0();
    }

    @Override // qc0.k
    public final r b() {
        return this.f293397b.f244431j;
    }

    @Override // qc0.k
    public final r e() {
        return this.f293397b.f244430h;
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e f0() {
        return this.f293397b.f244427b.f0();
    }

    @Override // qc0.k
    public final r g() {
        return this.f293397b.i;
    }

    @Override // qc0.k
    public final v g0() {
        return this.f293397b.f244429g;
    }

    @Override // qc0.k
    public final te0.e getLocale() {
        return this.f293397b.getLocale();
    }

    @Override // qc0.k
    public final te0.e h() {
        return this.f293397b.h();
    }

    @Override // qc0.k
    public final r i() {
        return this.f293397b.k;
    }

    @Override // com.revolut.feature.chooser.d
    public final v j() {
        return this.f293397b.f244427b.j();
    }

    @Override // qc0.k
    public final v k() {
        return this.f293397b.e;
    }

    @Override // qc0.k
    public final te0.e q() {
        return this.f293397b.q();
    }

    @Override // qc0.k
    public final te0.e r0() {
        return this.f293397b.r0();
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f293397b.s(bundle);
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e eVarB0 = b0();
        KProperty[] kPropertyArr = f;
        te0.e[] elements = {eVarB0, this.d.getValue(this, kPropertyArr[1]), this.e.getValue(this, kPropertyArr[2])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    @Override // c05.d
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final te0.e b0() {
        return this.f293398c.getValue(this, f[0]);
    }
}
