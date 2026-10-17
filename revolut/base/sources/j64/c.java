package j64;

import android.os.Bundle;
import c84.f;
import kotlin.jvm.internal.Intrinsics;
import te0.e;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends iri.a implements b, qv3.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f171670b;

    public c(f pluginState) {
        Intrinsics.checkNotNullParameter(pluginState, "pluginState");
        this.f171670b = pluginState;
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f171670b.D(bundle);
    }

    @Override // qv3.a
    public final e n0() {
        return this.f171670b.n0();
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f171670b.s(bundle);
    }
}
