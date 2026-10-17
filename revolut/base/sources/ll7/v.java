package ll7;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface v {
    static akg.n a(v vVar, String policyId) {
        e0 e0Var = (e0) vVar;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        return nim.a.v(e0Var.f.c(Unit.f186387a, false), new l3d.a(policyId, 19));
    }

    static Object b(v vVar, String str, gim.c cVar) {
        Object objD = ((e0) vVar).f196614j.d(str, false, cVar);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : Unit.f186387a;
    }

    static Object c(v vVar, gim.c cVar) {
        x4l.c cVar2 = ((e0) vVar).f;
        Unit unit = Unit.f186387a;
        Object objD = cVar2.d(unit, false, cVar);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : unit;
    }

    static vkm.d d(v vVar) {
        return ((e0) vVar).f.c(Unit.f186387a, false);
    }
}
