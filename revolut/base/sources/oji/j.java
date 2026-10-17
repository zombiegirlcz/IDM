package oji;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f225800a = q.c(null);

    public final Object a(Function2 function2, gim.i iVar) {
        Object objO = q.o(this.f225800a, new ob0.k(function2, null, 2), iVar);
        return objO == fim.a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
    }

    public final void b(Object obj2) {
        i iVar = new i(obj2);
        j2 j2Var = this.f225800a;
        j2Var.getClass();
        j2Var.g(null, iVar);
    }
}
