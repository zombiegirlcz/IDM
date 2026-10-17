package o84;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import te0.e;
import x94.g;
import x94.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends iri.a implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f222932b;

    public a(u documentViewerState) {
        Intrinsics.checkNotNullParameter(documentViewerState, "documentViewerState");
        this.f222932b = documentViewerState;
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f222932b.D(bundle);
    }

    @Override // x94.g
    public final e U() {
        u uVar = this.f222932b;
        return uVar.f303577c.getValue(uVar, u.d[0]);
    }

    @Override // qv3.a
    public final e n0() {
        return this.f222932b.n0();
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f222932b.s(bundle);
    }
}
