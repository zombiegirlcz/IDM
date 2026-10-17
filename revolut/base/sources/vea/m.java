package vea;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tfm.n4;

/* JADX INFO: loaded from: classes5.dex */
public interface m {
    static efm.r a(x xVar, String searchQuery, int i, AccountId.Joint joint, efm.r rVar, o97.m mVar, int i2) {
        efm.r rVarJ;
        wsg.n nVar = xVar.f288243a;
        AccountId accountId = (i2 & 8) != 0 ? AccountId.Personal.f51414a : joint;
        efm.r remoteObservable = (i2 & 16) != 0 ? zi0.c.j(zhm.f0.f322471a) : rVar;
        o97.m mVar2 = (i2 & 32) != 0 ? null : mVar;
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        boolean z = xVar.f288254r;
        efm.r rVarW = nim.a.w(osg.b.e(nVar, false, null, null, io3.i.INTERNAL, null, null, accountId, 54), new v73.c(xVar, zhm.v.k(io3.l.CURRENT, io3.l.STAKING, io3.l.STAKING_PROXY), 15));
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.r rVarJ2 = nVar.J(accountId, w4l.h.f294642c);
        ahe.l lVar = new ahe.l(xVar.k.k(), 22);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r rVarC = rd0.e.c(lVar, gVar);
        if (z) {
            rVarJ = rd0.e.c(xVar.d.n(accountId), gVar);
        } else {
            zhm.f0 f0Var = zhm.f0.f322471a;
            rVarJ = zi0.c.j(new eda.a(f0Var, f0Var));
        }
        n4 n4VarE = m70.a.g(pd.b.r(mif.a.f(rVarW, rVarJ2, rVarC, rVarJ), new p(xVar, 1)), null, new b(3), 1).distinctUntilChanged().replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        ihm.b bVar = xVar.f288249l;
        efm.r rVarG = m70.a.g(remoteObservable, null, new b(2), 1);
        efm.r rVarX = xVar.f288244b.f(false).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.r map = te0.w.n(n4VarE, bVar, rVarG, rVarX).map(new vdl.s(24, new b6.a(searchQuery, xVar, accountId, i, mVar2, 7)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        String str = xVar.o;
        if (str != null) {
            return ue0.e.E(map, zi0.c.P(zhm.v.k(new o97.f0(new TextLocalisedClause(i, null, null, 14), str), o97.h0.f223107a), false, null, 3));
        }
        Intrinsics.r("sectionListId");
        throw null;
    }

    static void b(x xVar, Function1 pocketFilter, o97.r sourceIdentifier, String sectionListId, Set keywords, j0 j0Var, int i) {
        if ((i & 16) != 0) {
            j0Var = null;
        }
        boolean z = (i & 32) == 0;
        Intrinsics.checkNotNullParameter(pocketFilter, "pocketFilter");
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        Intrinsics.checkNotNullParameter(sectionListId, "sectionListId");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        xVar.f288251n = sourceIdentifier;
        xVar.o = sectionListId;
        xVar.f288250m = pocketFilter;
        xVar.f288253q = j0Var;
        xVar.f288254r = z;
        ctc.b bVar = new ctc.b();
        zsc.p pVar = zsc.p.WORD_PREFIX;
        zsc.h parent = new zsc.h(new Pair(bVar, pVar), new Pair(new ctc.a(), pVar), new Pair(new btc.a(xVar.f288245c, 1), pVar), new Pair(new atc.c(keywords), pVar));
        n mapper = new n(0);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        List<Pair> list = parent.f324874a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (Pair pair : list) {
            arrayList.add(new Pair(new zsc.a((atc.b) pair.f186385a, mapper), (zsc.p) pair.f186386b));
        }
        xVar.f288252p = new zsc.g(new zsc.h(arrayList), new zsc.h(new Pair(new btc.a(xVar.i), zsc.p.WORD_PREFIX)));
    }
}
