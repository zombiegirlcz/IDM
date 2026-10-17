package gik;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends oki.h implements dli.b {
    public final y21.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f144226p;

    public h(n stateMapper, y21.c optOutRepository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        this.o = optOutRepository;
        this.f144226p = mra.d.b(this, c.f144222a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f144226p;
    }
}
