package ar3;

import aoa.h;
import aqb.s;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import dj0.d;
import efm.d0;
import efm.r;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import ppk.f;
import ufm.i;
import wsg.n;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f8514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f8515b;

    public c(f ratesInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f8514a = walletInteractor;
        this.f8515b = ratesInteractor;
    }

    public static d a(List list) {
        d.Companion.getClass();
        d dVarO = d.e;
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                d dVar = (d) listIterator.previous();
                xi0.b bVar = dVar.f115083b;
                d.Companion.getClass();
                dVarO = Intrinsics.f(bVar, d.f115081c) ? pyd.c.O(new d(dVar.f115082a, dVarO.f115083b), dVarO) : pyd.c.O(dVarO, dVar);
            }
        }
        return dVarO;
    }

    public final i b(d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        d0 d0VarJ = osg.b.j(this.f8514a, null, null, null, null, null, null, 63);
        h hVar = new h(new a(0, money), 7);
        d0VarJ.getClass();
        i iVar = new i(new i(new i(d0VarJ, hVar, 1), new h(new b(this, 2), 8), 0), new h(new a(1, money), 9), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final r c(xi0.b bVar) {
        if (bVar == null) {
            return nim.a.w(this.f8514a.W(AccountId.Personal.f51414a), new s(16));
        }
        r rVarJust = r.just(new Data(bVar, null, false, 6, null));
        Intrinsics.h(rVarJust);
        return rVarJust;
    }
}
