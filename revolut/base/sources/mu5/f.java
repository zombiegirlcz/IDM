package mu5;

import com.revolut.core.model.account.AccountId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements gt5.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f208972g = v.k(io3.k.ACTIVE, io3.k.INACTIVE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hu5.d f208973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f208974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppk.f f208975c;
    public final wsg.n d;
    public final usc.a e;
    public final xv5.c f;

    public f(hu5.d cryptoInvestmentsRepository, ang.f userInteractor, ppk.f ratesInteractor, wsg.n walletInteractor, usc.a pocketBalancesCache, xv5.c cryptoCommodityBaseCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(cryptoInvestmentsRepository, "cryptoInvestmentsRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(pocketBalancesCache, "pocketBalancesCache");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        this.f208973a = cryptoInvestmentsRepository;
        this.f208974b = userInteractor;
        this.f208975c = ratesInteractor;
        this.d = walletInteractor;
        this.e = pocketBalancesCache;
        this.f = cryptoCommodityBaseCurrencyInteractor;
    }

    public static dj0.d c(List list) {
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            if (i == 0) {
                io3.d dVar = ((io3.g) obj2).f163163a;
                dVarO = new dj0.d(dVar.i + dVar.f163151l, z92.f.l(dVar));
            } else {
                io3.d dVar2 = ((io3.g) obj2).f163163a;
                dVarO = pyd.c.O(dVarO, new dj0.d(dVar2.i + dVar2.f163151l, z92.f.l(dVar2)));
            }
            i = i2;
        }
        return dVarO;
    }

    public final dj0.d d(List list, xi0.b bVar) {
        List<io3.g> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (io3.g gVar : list2) {
            if (gVar.e == null) {
                String pocketId = gVar.f163163a.f163145a;
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                dj0.d dVar = (dj0.d) ((ne0.d) this.e.f282889b).get(pocketId);
                io3.d pocket = gVar.f163163a;
                dj0.d dVar2 = gVar.f163164b;
                Boolean bool = gVar.f163165c;
                Long l2 = gVar.d;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                gVar = new io3.g(pocket, dVar2, bool, l2, dVar);
            }
            arrayList.add(gVar);
        }
        if (!arrayList.isEmpty()) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (((io3.g) it8.next()).e != null) {
                    dj0.d.Companion.getClass();
                    dj0.d dVarO = dj0.d.e;
                    int i = 0;
                    for (Object obj2 : arrayList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            v.s();
                            throw null;
                        }
                        if (i == 0) {
                            dVarO = ((io3.g) obj2).e;
                            if (dVarO == null) {
                                dVarO = new dj0.d(0L, bVar);
                            }
                        } else {
                            dj0.d dVar3 = ((io3.g) obj2).e;
                            if (dVar3 == null) {
                                dVar3 = new dj0.d(0L, bVar);
                            }
                            dVarO = pyd.c.O(dVarO, dVar3);
                        }
                        i = i2;
                    }
                    return dVarO;
                }
            }
        }
        return null;
    }

    public final efm.r e(efm.r pocketsObservable, xi0.b bVar, n9l.b bVar2) {
        Intrinsics.checkNotNullParameter(pocketsObservable, "pocketsObservable");
        efm.r rVarSwitchMap = m70.a.g(u1.d(pocketsObservable, nim.a.w(this.d.W(AccountId.Personal.f51414a), new msb.c(21))), null, new mqg.a(23), 1).switchMap(new msb.e(9, new d(bVar, this, bVar2, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final efm.r f(List list, boolean z, n9l.b bVar) {
        ppk.f fVar = this.f208975c;
        if (z) {
            return nim.a.w(bVar == null ? cpk.a.a(fVar, list) : fVar.e(list, bVar), new msb.c(20));
        }
        return bVar == null ? fVar.b(list, false) : fVar.d(list, bVar);
    }
}
