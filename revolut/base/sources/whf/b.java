package whf;

import com.revolut.core.model.account.AccountId;
import efm.r;
import efm.x;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import vf0.q;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public interface b {
    static r a(b bVar, r filterObservable, x transactionTransformer, Integer num, AccountId accountId, int i) {
        if ((i & 2) != 0) {
            transactionTransformer = new q(24);
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        anf.r rVar = (anf.r) bVar;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(filterObservable, "filterObservable");
        Intrinsics.checkNotNullParameter(transactionTransformer, "transactionTransformer");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        r rVarSwitchMap = filterObservable.switchMap(new ai0.j(new a31.m(rVar, 19, num, transactionTransformer), 22));
        r map = rVar.f7751c.b().map(new ai0.j(new amf.i(29), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarH = ue0.e.H(map, h0.f322473a, new anf.p(0));
        Intrinsics.h(rVarSwitchMap);
        return nim.a.w(u1.e(rVarSwitchMap, rVar.b(accountId), rVarH), new anf.p(1));
    }
}
