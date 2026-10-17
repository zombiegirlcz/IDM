package rnb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.a3;
import tof.d7;
import tof.hc;
import tof.i7;
import tof.q7;
import tof.y6;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements djb.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppk.f f255579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f255580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f255581c;
    public final djb.q d;

    public r(ppk.f ratesInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, l80.e dateProvider, lqg.a transactionsFilterFactory, djb.q savingsTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(transactionsFilterFactory, "transactionsFilterFactory");
        Intrinsics.checkNotNullParameter(savingsTransactionsInteractor, "savingsTransactionsInteractor");
        this.f255579a = ratesInteractor;
        this.f255580b = transactionsInteractor;
        this.f255581c = dateProvider;
        this.d = savingsTransactionsInteractor;
    }

    public static dj0.d a(dj0.d dVar, List list, xi0.b bVar) {
        xi0.b bVar2 = dVar.f115083b;
        if (Intrinsics.f(bVar2, bVar)) {
            return dVar;
        }
        Double dM = jb3.l.m(list, bVar2, bVar);
        if (dM != null) {
            return pyd.c.K(dVar, dM.doubleValue(), bVar);
        }
        hx7.e.n(new IllegalStateException(j6.a.s("Rate for currency ", bVar2.f306286a, " to ", bVar.f306286a, " is not found. The transaction was excluded from savings calculations.")));
        return new dj0.d(0L, bVar);
    }

    public static ej0.b b(ej0.b bVar, List list, xi0.b bVar2) {
        xi0.b bVar3 = bVar.f126704b;
        if (Intrinsics.f(bVar3, bVar2)) {
            return bVar;
        }
        Double dM = jb3.l.m(list, bVar3, bVar2);
        if (dM != null) {
            BigDecimal bigDecimalMultiply = bVar.f126703a.multiply(new BigDecimal(String.valueOf(dM.doubleValue())));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            return new ej0.b(bigDecimalMultiply, bVar2);
        }
        Throwable th10 = new Throwable(j6.a.s("No ", bVar3.f306286a, "-", bVar2.f306286a, " rate provided"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        throw new IllegalStateException(("No " + bVar3.f306286a + "-" + bVar2.f306286a + " rate provided").toString());
    }

    public static ejb.f i(xi0.b bVar, a3 a3Var, List list) {
        BigDecimal bigDecimalX;
        BigDecimal bigDecimalE0;
        BigDecimal bigDecimalA = k71.k.a(a3Var);
        dj0.d dVar = a3Var.k;
        xi0.b bVar2 = dVar.f115083b;
        xi0.b bVar3 = dVar.f115083b;
        ej0.b bVarB = b(new ej0.b(bigDecimalA, bVar2), list, bVar);
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        d7 d7Var = a3Var.S;
        if (d7Var == null || (bigDecimalX = k71.k.S(d7Var)) == null) {
            bigDecimalX = pyd.c.x(k71.k.h0(a3Var));
        }
        ej0.b bVarB2 = b(new ej0.b(bigDecimalX, bVar3), list, bVar);
        if (d7Var == null || (bigDecimalE0 = k71.k.e0(d7Var)) == null) {
            bigDecimalE0 = BigDecimal.ZERO;
        }
        Intrinsics.h(bigDecimalE0);
        return new ejb.f(bVarB, b(new ej0.b(bigDecimalE0, bVar3), list, bVar), bVarB2);
    }

    public static dj0.d j(List list, List list2, xi0.b bVar) {
        if (list != null) {
            dj0.d.Companion.getClass();
            dj0.d dVarA = dj0.d.e;
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                dVarA = i == 0 ? a(k71.k.b((a3) obj2), list2, bVar) : pyd.c.O(dVarA, a(k71.k.b((a3) obj2), list2, bVar));
                i = i2;
            }
            if (dVarA != null) {
                return dVarA;
            }
        }
        return new dj0.d(0L, bVar);
    }

    public final akg.n c(LocalDate startDate, LocalDate endDate, List vaults, xi0.b currency) {
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return nim.a.v(e(startDate, endDate, vaults, currency), new q(startDate, currency));
    }

    public final akg.n d() {
        i7 i7VarA = ejb.q.a(ejb.o.INTEREST);
        com.revolut.domain.interactors.transactions.a aVar = this.f255580b;
        vkm.d dVarB = rd0.e.b(com.revolut.domain.interactors.transactions.a.d(aVar, i7VarA, null, null, null, null, 30));
        i7.c cVar = i7.Companion;
        y6[] y6VarArr = {y6.TAX_REFUND};
        cVar.getClass();
        return nim.a.v(u0.m(dVarB, rd0.e.b(com.revolut.domain.interactors.transactions.a.d(aVar, i7.c.d(y6VarArr), null, null, null, null, 30))), new rm2.s(25));
    }

    public final Flow e(LocalDate startDate, LocalDate endDate, List vaults, xi0.b currency) {
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return boh.f.e(((v) this.d).e(vaults), new kwg.e(endDate, startDate, this, vaults, currency, 29));
    }

    public final Flow f(List list, xi0.b bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            xi0.b bVarU = kii.e.u((pcd.s) it8.next(), xi0.b.Companion);
            Pair pair = !bVarU.equals(bVar) ? new Pair(bVarU, bVar) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return !arrayList.isEmpty() ? rd0.e.b(this.f255579a.b(arrayList, false)) : zi0.c.i(f0.f322471a);
    }

    public final Flow g(List vaults, xi0.b currency, hc hcVar) {
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return boh.f.e(((v) this.d).e(vaults), new q2k.b(this, vaults, currency, (Serializable) hcVar, 18));
    }

    public final akg.n h(q7 q7Var, ejb.o oVar) {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {q7Var, ejb.q.a(oVar)};
        cVar.getClass();
        return nim.a.v(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(this.f255580b, i7.c.a(i7VarArr), null, null, null, null, 30)), new rm2.s(24));
    }
}
