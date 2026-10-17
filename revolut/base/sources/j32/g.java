package j32;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends oki.h implements e {
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f170937p;

    public g(m navigator, n stateMapper) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = navigator;
        this.f170937p = mra.d.b(this, d.f170935a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f170937p;
    }
}
