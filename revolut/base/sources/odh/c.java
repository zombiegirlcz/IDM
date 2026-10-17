package odh;

import aim.o;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ldh.m;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends p5d.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f224474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kdh.b f224475m;

    public c(m instrumentActionsNavigationExtension, kdh.b instrumentActionsInteractor) {
        Intrinsics.checkNotNullParameter(instrumentActionsNavigationExtension, "instrumentActionsNavigationExtension");
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        this.f224474l = instrumentActionsNavigationExtension;
        this.f224475m = instrumentActionsInteractor;
    }

    @Override // p5d.d
    public final Set Z2() {
        o oVar = new o();
        m mVar = this.f224474l;
        oVar.add(mVar);
        oVar.addAll(mVar.Z2());
        return y0.a(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p5d.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(p5d.b r7, p5d.f r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: odh.c.b3(p5d.b, p5d.f, gim.c):java.lang.Object");
    }
}
