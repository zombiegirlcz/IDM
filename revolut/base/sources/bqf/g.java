package bqf;

import blh.g0;
import bq5.o0;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nj8.n;
import oq9.o;
import oq9.p;
import oq9.q;
import oq9.r;
import oq9.s;
import tof.i7;
import tof.j8;
import tof.l8;
import tof.oa;
import tof.q7;
import tof.qb;
import tof.v6;
import ufm.i;
import zhm.u;
import zm3.j;
import zm3.k;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f17828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f17829b;

    public g(com.revolut.domain.interactors.transactions.a transactionsInteractor, hj8.a juniorProfileInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f17828a = transactionsInteractor;
        this.f17829b = juniorProfileInteractor;
    }

    public static q7 e(i7 i7Var) {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new qb(u.c(v6.COMPLETED)), i7Var};
        cVar.getClass();
        return i7.c.a(i7VarArr);
    }

    public final d0 a(i7 i7Var) {
        if (i7Var != null) {
            return new i(com.revolut.domain.interactors.transactions.a.b(this.f17828a, i7Var, null, 1, TransactionsSort.NO_SORT, null, 18), new g0(new o0(7), 12), 1);
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r9 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r9 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        if (r9 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e9, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bqf.g.b(com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty, gim.c):java.lang.Object");
    }

    public final i c(zm3.a contact) {
        d0 d0VarM;
        Intrinsics.checkNotNullParameter(contact, "contact");
        j jVar = contact instanceof j ? (j) contact : null;
        if ((jVar != null ? jVar.e : null) != k.JUNIOR) {
            d0VarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
        } else {
            i iVar = new i(((n) this.f17829b).h(), new g0(new bd2.b(((j) contact).f, 12), 13), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            d0VarM = iVar;
        }
        i iVar2 = new i(d0VarM, new g0(new bnj.n(contact, this, 13), 10), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }

    public final d0 d(ArrayList arrayList) {
        Object l8Var;
        ArrayList arrayListS = t61.a.s("members", arrayList);
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            r rVarL = oi0.d.l((o) it8.next());
            if (rVarL instanceof p) {
                i7.c cVar = i7.Companion;
                i7[] i7VarArr = {new j8(((p) rVarL).f227848a)};
                cVar.getClass();
                l8Var = i7.c.b(i7VarArr);
            } else if (rVarL instanceof s) {
                l8Var = new l8(((s) rVarL).f227852a);
            } else {
                if (!(rVarL instanceof q) && !(rVarL instanceof r.a) && rVarL != null) {
                    throw new NoWhenBranchMatchedException();
                }
                l8Var = null;
            }
            if (l8Var != null) {
                arrayListS.add(l8Var);
            }
        }
        return arrayListS.isEmpty() ? d0.m(Boolean.FALSE) : new i(com.revolut.domain.interactors.transactions.a.b(this.f17828a, e(new oa(arrayListS)), null, null, null, null, 30), new g0(new o0(8), 14), 1);
    }
}
