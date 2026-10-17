package wwj;

import cli.k;
import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends oki.h implements d {
    public final s70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w70.a f300698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f300699q;

    public f(n stateMapper, s70.a intentProvider, w70.a androidVersion) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.o = intentProvider;
        this.f300698p = androidVersion;
        this.f300699q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f300699q;
    }
}
