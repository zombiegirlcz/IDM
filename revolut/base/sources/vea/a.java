package vea;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import e7l.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface a {
    static efm.r a(l lVar, String searchQuery, int i, GlobalSearchContext globalSearchContext, AccountId.Joint joint, efm.r rVar, o97.m mVar, int i2) {
        GlobalSearchContext globalSearchContext2 = (i2 & 8) != 0 ? null : globalSearchContext;
        AccountId accountId = (i2 & 16) != 0 ? AccountId.Personal.f51414a : joint;
        efm.r remoteObservable = (i2 & 32) != 0 ? zi0.c.j(zhm.f0.f322471a) : rVar;
        o97.m mVar2 = (i2 & 64) != 0 ? null : mVar;
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        if (mVar2 == null) {
            remoteObservable = efm.r.just(new Data(zhm.f0.f322471a, null, false, 6, null));
            Intrinsics.h(remoteObservable);
        }
        efm.r rVarSwitchMap = m70.a.g(nim.a.w(mif.a.f(osg.b.e(lVar.f288204a, false, lVar.f288215r == null ? io3.l.CURRENT : null, null, io3.i.INTERNAL, io3.j.PERSONAL, null, accountId, 36), ((ik3.g) lVar.f288206c).a(g.b.f123407a, false), remoteObservable, rd0.e.c(new ahe.l(lVar.i.k(), 21), kotlin.coroutines.g.f186406a)), new uyh.w(lVar, 13, globalSearchContext2, mVar2)), null, new b(0), 1).distinctUntilChanged().switchMap(new vdl.s(15, new vdl.a(lVar, 9)));
        Intrinsics.h(rVarSwitchMap);
        efm.r map = te0.w.l(rVarSwitchMap, lVar.f288210l).map(new vdl.s(16, new c18.c(searchQuery, i, lVar, accountId)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        String str = lVar.o;
        if (str != null) {
            return ue0.e.E(map, new Data(zhm.v.k(new o97.f0(textLocalisedClause, str), o97.h0.f223107a), null, false, 6, null));
        }
        Intrinsics.r("sectionListId");
        throw null;
    }
}
