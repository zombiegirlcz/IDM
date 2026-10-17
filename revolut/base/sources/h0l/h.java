package h0l;

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
public final class h extends iri.a implements k, e {
    public static final /* synthetic */ KProperty[] e = {o0.f186429a.j(new h0(h.class, "configuration", "getConfiguration()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f148435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f148436c;
    public final r d;

    public h(g1 backendFlowState) {
        Intrinsics.checkNotNullParameter(backendFlowState, "backendFlowState");
        this.f148435b = backendFlowState;
        this.f148436c = new j();
        this.d = new r(w0(), 1);
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f148435b.D(bundle);
    }

    @Override // qc0.k
    public final te0.e G() {
        return this.f148435b.G();
    }

    @Override // qc0.k
    public final v P() {
        return this.f148435b.f244432l;
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e a0() {
        return this.f148435b.f244427b.a0();
    }

    @Override // qc0.k
    public final te0.r b() {
        return this.f148435b.f244431j;
    }

    @Override // qc0.k
    public final te0.r e() {
        return this.f148435b.f244430h;
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e f0() {
        return this.f148435b.f244427b.f0();
    }

    @Override // qc0.k
    public final te0.r g() {
        return this.f148435b.i;
    }

    @Override // qc0.k
    public final v g0() {
        return this.f148435b.f244429g;
    }

    @Override // qc0.k
    public final te0.e getLocale() {
        return this.f148435b.getLocale();
    }

    @Override // qc0.k
    public final te0.e h() {
        return this.f148435b.h();
    }

    @Override // qc0.k
    public final te0.r i() {
        return this.f148435b.k;
    }

    @Override // com.revolut.feature.chooser.d
    public final v j() {
        return this.f148435b.f244427b.j();
    }

    @Override // qc0.k
    public final v k() {
        return this.f148435b.e;
    }

    @Override // qc0.k
    public final te0.e q() {
        return this.f148435b.q();
    }

    @Override // qc0.k
    public final te0.e r0() {
        return this.f148435b.r0();
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f148435b.s(bundle);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.d;
    }

    public final te0.e w0() {
        return this.f148436c.getValue(this, e[0]);
    }
}
