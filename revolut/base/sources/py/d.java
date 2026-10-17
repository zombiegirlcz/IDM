package py;

import kotlin.Unit;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f240639a = q.b(0, 7, null);

    public final Object a(c cVar, gim.c cVar2) throws Throwable {
        Object objEmit = this.f240639a.emit(cVar, cVar2);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }
}
