package k38;

import c48.g;
import kotlin.Unit;
import w4l.f;

/* JADX INFO: loaded from: classes13.dex */
public interface d {
    static Object a(d dVar, gim.c cVar) {
        f fVar = ((g) dVar).k;
        Unit unit = Unit.f186387a;
        Object objA = nim.a.a(fVar.g(unit, false), cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : unit;
    }
}
