package a05;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import qc0.g1;
import qc0.k;
import te0.e;
import te0.j;
import te0.r;
import te0.v;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends iri.a implements c05.d, k {
    public static final /* synthetic */ KProperty[] d = {o0.f186429a.j(new h0(d.class, "facilityId", "getFacilityId()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f132c;

    public d(g1 backendFlowState) {
        Intrinsics.checkNotNullParameter(backendFlowState, "backendFlowState");
        this.f131b = backendFlowState;
        m70.a.c(t0.f186434a);
        Intrinsics.checkNotNullParameter("", "default");
        this.f132c = new j("");
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f131b.D(bundle);
    }

    @Override // qc0.k
    public final e G() {
        return this.f131b.G();
    }

    @Override // qc0.k
    public final v P() {
        return this.f131b.f244432l;
    }

    @Override // com.revolut.feature.chooser.d
    public final e a0() {
        return this.f131b.f244427b.a0();
    }

    @Override // qc0.k
    public final r b() {
        return this.f131b.f244431j;
    }

    @Override // c05.d
    public final e b0() {
        return this.f132c.getValue(this, d[0]);
    }

    @Override // qc0.k
    public final r e() {
        return this.f131b.f244430h;
    }

    @Override // com.revolut.feature.chooser.d
    public final e f0() {
        return this.f131b.f244427b.f0();
    }

    @Override // qc0.k
    public final r g() {
        return this.f131b.i;
    }

    @Override // qc0.k
    public final v g0() {
        return this.f131b.f244429g;
    }

    @Override // qc0.k
    public final e getLocale() {
        return this.f131b.getLocale();
    }

    @Override // qc0.k
    public final e h() {
        return this.f131b.h();
    }

    @Override // qc0.k
    public final r i() {
        return this.f131b.k;
    }

    @Override // com.revolut.feature.chooser.d
    public final v j() {
        return this.f131b.f244427b.j();
    }

    @Override // qc0.k
    public final v k() {
        return this.f131b.e;
    }

    @Override // qc0.k
    public final e q() {
        return this.f131b.q();
    }

    @Override // qc0.k
    public final e r0() {
        return this.f131b.r0();
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f131b.s(bundle);
    }

    @Override // iri.a
    public final Sequence v0() {
        return new nkm.r(this.f132c.getValue(this, d[0]), 1);
    }
}
