package x94;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends iri.a implements g, j64.b {
    public static final /* synthetic */ KProperty[] d = {o0.f186429a.j(new h0(u.class, "creditDocumentToView", "getCreditDocumentToView()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j64.c f303576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f303577c;

    public u(j64.c closeFlowState) {
        Intrinsics.checkNotNullParameter(closeFlowState, "closeFlowState");
        this.f303576b = closeFlowState;
        this.f303577c = new te0.j();
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f303576b.D(bundle);
    }

    @Override // x94.g
    public final te0.e U() {
        return this.f303577c.getValue(this, d[0]);
    }

    @Override // qv3.a
    public final te0.e n0() {
        return this.f303576b.f171670b.n0();
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f303576b.s(bundle);
    }

    @Override // iri.a
    public final Sequence v0() {
        return new nkm.r(this.f303577c.getValue(this, d[0]), 1);
    }
}
