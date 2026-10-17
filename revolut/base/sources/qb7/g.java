package qb7;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import wa7.m;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends oki.h implements dli.b {
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f244131p;

    public g(h stateMapper, m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.o = hiddenAccountsInteractor;
        this.f244131p = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f244131p;
    }
}
