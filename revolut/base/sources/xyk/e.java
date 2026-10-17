package xyk;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import nkm.r;
import qc0.g1;
import qc0.k;
import te0.j;
import te0.v;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends iri.a implements k, b {
    public static final /* synthetic */ KProperty[] e = {o0.f186429a.j(new h0(e.class, "configuration", "getConfiguration()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f309749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f309750c;
    public final r d;

    public e(g1 backendFlowState) {
        Intrinsics.checkNotNullParameter(backendFlowState, "backendFlowState");
        this.f309749b = backendFlowState;
        this.f309750c = new j();
        this.d = new r(w0(), 1);
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f309749b.D(bundle);
    }

    @Override // qc0.k
    public final te0.e G() {
        return this.f309749b.G();
    }

    @Override // qc0.k
    public final v P() {
        return this.f309749b.f244432l;
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e a0() {
        return this.f309749b.f244427b.a0();
    }

    @Override // qc0.k
    public final te0.r b() {
        return this.f309749b.f244431j;
    }

    @Override // qc0.k
    public final te0.r e() {
        return this.f309749b.f244430h;
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e f0() {
        return this.f309749b.f244427b.f0();
    }

    @Override // qc0.k
    public final te0.r g() {
        return this.f309749b.i;
    }

    @Override // qc0.k
    public final v g0() {
        return this.f309749b.f244429g;
    }

    @Override // qc0.k
    public final te0.e getLocale() {
        return this.f309749b.getLocale();
    }

    @Override // qc0.k
    public final te0.e h() {
        return this.f309749b.h();
    }

    @Override // qc0.k
    public final te0.r i() {
        return this.f309749b.k;
    }

    @Override // com.revolut.feature.chooser.d
    public final v j() {
        return this.f309749b.f244427b.j();
    }

    @Override // qc0.k
    public final v k() {
        return this.f309749b.e;
    }

    @Override // qc0.k
    public final te0.e q() {
        return this.f309749b.q();
    }

    @Override // qc0.k
    public final te0.e r0() {
        return this.f309749b.r0();
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f309749b.s(bundle);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.d;
    }

    public final te0.e w0() {
        return this.f309750c.getValue(this, e[0]);
    }
}
