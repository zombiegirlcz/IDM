package si7;

import efm.r;
import fj5.e;
import fj7.b;
import kj7.j;
import kj7.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface a {
    static r a(a aVar) {
        return ((o) ((b) aVar).f135546a).f.f(Unit.f186387a, false);
    }

    static r b(a aVar, String claimId) {
        b bVar = (b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(claimId, "claimId");
        o oVar = (o) bVar.f135546a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(claimId, "claimId");
        return oVar.f184342g.f(claimId, false);
    }

    static r c(a aVar, String insuranceId) {
        b bVar = (b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
        j jVar = (j) bVar.f135547b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
        return jVar.d.f(insuranceId, false);
    }

    static r d(a aVar, String planId) {
        b bVar = (b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        o oVar = (o) bVar.f135546a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        return nim.a.w(oVar.e.f(planId, false), new e(5));
    }
}
