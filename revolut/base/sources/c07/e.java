package c07;

import cli.g;
import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements dli.b {
    public final kda.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f20191p;

    public e(kda.b accountClosureExtension, f stateMapper) {
        Intrinsics.checkNotNullParameter(accountClosureExtension, "accountClosureExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = accountClosureExtension;
        this.f20191p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f20191p;
    }
}
