package odd;

import e4k.m0;
import ed7.e;
import eed.n;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import w4l.h;

/* JADX INFO: loaded from: classes7.dex */
public interface a {
    static pfm.a a(a aVar, String vaultId, long j2) {
        n nVar = (n) aVar;
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        int i = 1;
        d0 d0VarFirstOrError = m70.a.g(nVar.g(vaultId, h.f294642c), null, new eed.a(i), 1).firstOrError();
        e eVar = new e(new m0(nVar, j2, i), 6);
        d0VarFirstOrError.getClass();
        pfm.a aVar2 = new pfm.a(d0VarFirstOrError, eVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }
}
