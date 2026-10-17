package xpl;

import akl.e1;
import akl.o0;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends oki.h implements i {
    public final gjl.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f308019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f308020q;

    public l(gjl.b connectedAppsControllerModelExtension, o0 userInfoRepository, n stateMapper) {
        Intrinsics.checkNotNullParameter(connectedAppsControllerModelExtension, "connectedAppsControllerModelExtension");
        Intrinsics.checkNotNullParameter(userInfoRepository, "userInfoRepository");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = connectedAppsControllerModelExtension;
        this.f308019p = userInfoRepository;
        this.f308020q = mra.d.b(this, new c(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        e1 e1Var = (e1) this.f308019p;
        e1Var.getClass();
        yji.l.a1(this, e1Var.f6010m.b(Unit.f186387a, w4l.i.f294643c), null, null, new k(this, null, 0), 3);
        yji.l.a1(this, (j2) ((jpl.d) this.o).f177326p.f22677a, null, null, new k(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f308020q;
    }
}
