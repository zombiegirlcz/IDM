package tf2;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends oki.h implements dli.b {
    public final uvl.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f270221p;

    public m(i mapper, uvl.c interactor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = interactor;
        this.f270221p = mra.d.b(this, new d(null), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new j(this, null, 0), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f270221p;
    }
}
