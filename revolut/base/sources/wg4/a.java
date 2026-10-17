package wg4;

import android.os.Bundle;
import j64.b;
import j64.c;
import kotlin.jvm.internal.Intrinsics;
import p54.e;
import p54.n;
import te0.r;
import te0.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends iri.a implements e, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f297231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f297232c;

    public a(n creditBackendFlowState, c creditApplicationCloseFlowState) {
        Intrinsics.checkNotNullParameter(creditBackendFlowState, "creditBackendFlowState");
        Intrinsics.checkNotNullParameter(creditApplicationCloseFlowState, "creditApplicationCloseFlowState");
        this.f297231b = creditBackendFlowState;
        this.f297232c = creditApplicationCloseFlowState;
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f297231b.D(bundle);
        this.f297232c.D(bundle);
    }

    @Override // qc0.k
    public final te0.e G() {
        return this.f297231b.f233017b.G();
    }

    @Override // p54.e
    public final te0.e J() {
        n nVar = this.f297231b;
        return nVar.d.getValue(nVar, n.f233016h[0]);
    }

    @Override // qc0.k
    public final v P() {
        return this.f297231b.f233017b.f244432l;
    }

    @Override // p54.e
    public final te0.e V() {
        n nVar = this.f297231b;
        return nVar.e.getValue(nVar, n.f233016h[1]);
    }

    @Override // p54.e
    public final te0.e a() {
        n nVar = this.f297231b;
        return nVar.f233019g.getValue(nVar, n.f233016h[3]);
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e a0() {
        return this.f297231b.a0();
    }

    @Override // qc0.k
    public final r b() {
        return this.f297231b.f233017b.f244431j;
    }

    @Override // qc0.k
    public final r e() {
        return this.f297231b.f233017b.f244430h;
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e f0() {
        return this.f297231b.f0();
    }

    @Override // qc0.k
    public final r g() {
        return this.f297231b.f233017b.i;
    }

    @Override // qc0.k
    public final v g0() {
        return this.f297231b.f233017b.f244429g;
    }

    @Override // qc0.k
    public final te0.e getLocale() {
        return this.f297231b.f233017b.getLocale();
    }

    @Override // qc0.k
    public final te0.e h() {
        return this.f297231b.f233017b.h();
    }

    @Override // qc0.k
    public final r i() {
        return this.f297231b.f233017b.k;
    }

    @Override // com.revolut.feature.chooser.d
    public final v j() {
        return this.f297231b.j();
    }

    @Override // qc0.k
    public final v k() {
        return this.f297231b.f233017b.e;
    }

    @Override // p54.e
    public final te0.e n() {
        n nVar = this.f297231b;
        return nVar.f.getValue(nVar, n.f233016h[2]);
    }

    @Override // qv3.a
    public final te0.e n0() {
        return this.f297231b.f233018c.n0();
    }

    @Override // qc0.k
    public final te0.e q() {
        return this.f297231b.f233017b.q();
    }

    @Override // qc0.k
    public final te0.e r0() {
        return this.f297231b.f233017b.r0();
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f297231b.s(bundle);
        this.f297232c.s(bundle);
    }
}
