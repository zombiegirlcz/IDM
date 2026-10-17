package cic;

import cli.g;
import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wli.x;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends h implements dli.b {
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f24441p;

    public d(x deeplinkHandler, f stateMapper) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = deeplinkHandler;
        this.f24441p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f24441p;
    }
}
