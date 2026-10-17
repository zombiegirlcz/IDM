package fk3;

import gim.c;
import ik3.g;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    static Object a(a aVar, c cVar) {
        Object objG = ((g) ((ik3.c) aVar).f161878a).f161888g.g(false, cVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objG != aVar2) {
            objG = Unit.f186387a;
        }
        return objG == aVar2 ? objG : Unit.f186387a;
    }
}
