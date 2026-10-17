package wbf;

import efm.d0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vvc.s;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rbf.d f296153a;

    public l(rbf.d repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f296153a = repository;
    }

    public final d0 a(lbf.f code) {
        Intrinsics.checkNotNullParameter(code, "code");
        rbf.d dVar = this.f296153a;
        d0<List<qbf.o>> addOnsForGroup = dVar.f253043a.getAddOnsForGroup("TRADING");
        r83.d dVar2 = new r83.d(27, new rbf.a(dVar, 1));
        addOnsForGroup.getClass();
        ufm.i iVar = new ufm.i(addOnsForGroup, dVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.n nVarI0 = w.i0(iVar);
        d0<List<qbf.m>> enabledAddOns = dVar.f253043a.getEnabledAddOns("TRADING");
        rbf.c cVar = new rbf.c(new rbf.a(dVar, 15), 2);
        enabledAddOns.getClass();
        ufm.i iVar2 = new ufm.i(enabledAddOns, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        d0 d0VarD = d0.D(nVarI0, w.i0(iVar2), new w4l.c(new s(code, 26), 16));
        Intrinsics.checkNotNullExpressionValue(d0VarD, "zip(...)");
        return d0VarD;
    }
}
