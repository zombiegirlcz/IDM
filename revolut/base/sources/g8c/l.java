package g8c;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import q7c.q;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends oki.h implements g {
    public final g9c.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f141348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f141349q;

    public l(g9c.b statusDialogModelBuilder, q revolutPayInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(statusDialogModelBuilder, "statusDialogModelBuilder");
        Intrinsics.checkNotNullParameter(revolutPayInteractor, "revolutPayInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = statusDialogModelBuilder;
        this.f141348p = revolutPayInteractor;
        m70.a.c(t0.f186434a);
        this.f141349q = mra.d.b(this, new e(""), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f141349q;
    }
}
