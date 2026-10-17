package ur5;

import com.revolut.core.model.account.AccountId;
import efm.r;
import io3.i;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jmrtd.lds.LDSFile;
import uif.d;
import up5.d0;
import up5.k;
import w4l.h;

/* JADX INFO: loaded from: classes3.dex */
public interface a {
    static r a(c cVar, xi0.b bVar, xi0.b bVar2, int i) {
        if ((i & 1) != 0) {
            bVar = null;
        }
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVarSwitchMap = m70.a.g(u1.d(b(cVar, bVar, 2), nim.a.w(cVar.f282249a.X(AccountId.Personal.f51414a, loadingStrategy), new upc.b(24))), null, new k(16), 1).switchMap(new d0(10, new d(cVar, bVar2, 18)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    static r b(a aVar, xi0.b bVar, int i) {
        if ((i & 1) != 0) {
            bVar = null;
        }
        c cVar = (c) aVar;
        cVar.getClass();
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(osg.b.g(cVar.f282249a, loadingStrategy, null, null, i.INTERNAL, null, null, null, LDSFile.EF_DG4_TAG), new ou5.a(26, bVar));
    }
}
