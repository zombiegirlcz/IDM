package ugb;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import xfb.s;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends oki.h implements dli.b {
    public final s o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bib.a f279994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f279995q;

    public f(s salaryHubInteractor, bib.a salaryAccountErrorHandler, g stateMapper) {
        Intrinsics.checkNotNullParameter(salaryHubInteractor, "salaryHubInteractor");
        Intrinsics.checkNotNullParameter(salaryAccountErrorHandler, "salaryAccountErrorHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = salaryHubInteractor;
        this.f279994p = salaryAccountErrorHandler;
        this.f279995q = mra.d.b(this, new a(0), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f279995q;
    }
}
