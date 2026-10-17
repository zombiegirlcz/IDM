package g82;

import cli.k;
import cli.y;
import fo1.b0;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends h implements e {
    public final ang.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f141246p;

    public g(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = userInteractor;
        this.f141246p = mra.d.b(this, k.f25028a, new a54.b(11), null, false, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (skm.k0.b(200, r2) == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(g82.g r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g82.g.I2(g82.g, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new b0(this, null, 17), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f141246p;
    }
}
