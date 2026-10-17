package al4;

import dp4.n0;
import kotlin.Unit;
import om4.y3;

/* JADX INFO: loaded from: classes22.dex */
public interface q {
    static Object a(q qVar, gim.c cVar) {
        Object objD = ((y3) qVar).f226759a.d.d(new n0(true), false, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }
}
