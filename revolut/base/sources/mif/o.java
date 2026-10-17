package mif;

import androidx.sqlite.db.SimpleSQLiteQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nif.a4;
import nif.e1;
import nif.f2;
import nif.h2;
import nif.k1;
import nif.l0;
import nif.m1;
import nif.n2;
import nif.w0;
import nif.y0;
import tof.i7;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dgm.e f205817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f205818b;

    public o() {
        dgm.e eVar = new dgm.e();
        Intrinsics.checkNotNullExpressionValue(eVar, "create(...)");
        this.f205817a = eVar;
    }

    public static List v(h2 h2Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        f2 f2Var;
        String str;
        String str2;
        Long l2;
        Long l3;
        Long l4;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        List listN0;
        List listN02;
        List listN03;
        List listN04;
        String strJ = h2Var.j();
        int i = 0;
        List listN05 = strJ != null ? kotlin.text.d0.n0(strJ, new String[]{","}, 0, 6) : null;
        String strL = h2Var.l();
        List listN06 = strL != null ? kotlin.text.d0.n0(strL, new String[]{","}, 0, 6) : null;
        String strA = h2Var.a();
        if (strA == null || (listN04 = kotlin.text.d0.n0(strA, new String[]{","}, 0, 6)) == null) {
            arrayList = null;
        } else {
            List list = listN04;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(kotlin.text.z.n((String) it8.next()));
            }
        }
        String strC = h2Var.c();
        if (strC == null || (listN03 = kotlin.text.d0.n0(strC, new String[]{","}, 0, 6)) == null) {
            arrayList2 = null;
        } else {
            List list2 = listN03;
            arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(kotlin.text.z.n((String) it9.next()));
            }
        }
        String strB = h2Var.b();
        if (strB == null || (listN02 = kotlin.text.d0.n0(strB, new String[]{","}, 0, 6)) == null) {
            arrayList3 = null;
        } else {
            List list3 = listN02;
            arrayList3 = new ArrayList(zhm.w.t(list3, 10));
            Iterator it10 = list3.iterator();
            while (it10.hasNext()) {
                arrayList3.add(kotlin.text.z.n((String) it10.next()));
            }
        }
        String strI = h2Var.i();
        List listN07 = strI != null ? kotlin.text.d0.n0(strI, new String[]{","}, 0, 6) : null;
        String strK = h2Var.k();
        List listN08 = strK != null ? kotlin.text.d0.n0(strK, new String[]{","}, 0, 6) : null;
        String strM = h2Var.m();
        List listN09 = strM != null ? kotlin.text.d0.n0(strM, new String[]{","}, 0, 6) : null;
        String strH = h2Var.h();
        List listN010 = strH != null ? kotlin.text.d0.n0(strH, new String[]{","}, 0, 6) : null;
        String strE = h2Var.e();
        List listN011 = strE != null ? kotlin.text.d0.n0(strE, new String[]{","}, 0, 6) : null;
        String strD = h2Var.d();
        List listN012 = strD != null ? kotlin.text.d0.n0(strD, new String[]{","}, 0, 6) : null;
        String strF = h2Var.f();
        List listN013 = strF != null ? kotlin.text.d0.n0(strF, new String[]{","}, 0, 6) : null;
        String strG = h2Var.g();
        if (strG == null || (listN0 = kotlin.text.d0.n0(strG, new String[]{","}, 0, 6)) == null) {
            arrayList4 = null;
        } else {
            List list4 = listN0;
            arrayList4 = new ArrayList(zhm.w.t(list4, 10));
            Iterator it11 = list4.iterator();
            while (it11.hasNext()) {
                arrayList4.add(kotlin.text.z.n((String) it11.next()));
            }
        }
        if (listN08 == null) {
            return f0.f322471a;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : listN08) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            String str9 = (String) obj2;
            if (listN05 == null || (str = (String) zhm.d0.e0(i, listN05)) == null || listN06 == null || (str2 = (String) zhm.d0.e0(i, listN06)) == null || arrayList == null || (l2 = (Long) zhm.d0.e0(i, arrayList)) == null || arrayList2 == null || (l3 = (Long) zhm.d0.e0(i, arrayList2)) == null || arrayList3 == null || (l4 = (Long) zhm.d0.e0(i, arrayList3)) == null || listN07 == null || (str3 = (String) zhm.d0.e0(i, listN07)) == null) {
                f2Var = null;
            } else {
                f2Var = new f2(str, str2, l2, l3, l4, str3, str9, (listN09 == null || (str8 = (String) zhm.d0.e0(i, listN09)) == null || str8.length() <= 0) ? null : str8, (listN010 == null || (str7 = (String) zhm.d0.e0(i, listN010)) == null || str7.length() <= 0) ? null : str7, (listN011 == null || (str6 = (String) zhm.d0.e0(i, listN011)) == null || str6.length() <= 0) ? null : str6, (listN013 == null || (str4 = (String) zhm.d0.e0(i, listN013)) == null || str4.length() <= 0) ? null : str4, (listN012 == null || (str5 = (String) zhm.d0.e0(i, listN012)) == null || str5.length() <= 0) ? null : str5, arrayList4 != null ? (Long) zhm.d0.e0(i, arrayList4) : null);
            }
            if (f2Var != null) {
                arrayList5.add(f2Var);
            }
            i = i2;
        }
        return arrayList5;
    }

    public abstract void A(w0 w0Var);

    public void a(i7 filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        b(((d0) e()).d("transaction_details", filter));
        b(((d0) e()).d("transactions", filter));
        b(((d0) e()).d("transfer_users", filter));
        b(((d0) e()).d("merchants", filter));
        b(((d0) e()).d("merchant_payments", filter));
        b(((d0) e()).d("acquiring_cashback", filter));
        b(((d0) e()).d("loans", filter));
        b(((d0) e()).d("extra_attributes", filter));
        b(((d0) e()).d("hidden", filter));
        b(((d0) e()).d("crypto_deposits", filter));
        b(((d0) e()).d("defi_metadata", filter));
    }

    public abstract int b(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract Long c(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract Long d(SimpleSQLiteQuery simpleSQLiteQuery);

    public final t e() {
        t tVar = this.f205818b;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.r("queryBuilder");
        throw null;
    }

    public abstract List f(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract List g(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract n2 h(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract List i(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract int j(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract List k(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract void l(ArrayList arrayList);

    public abstract void m(ArrayList arrayList);

    public abstract void n(ArrayList arrayList);

    public abstract void o(ArrayList arrayList);

    public abstract void p(ArrayList arrayList);

    public abstract void q(ArrayList arrayList);

    public abstract void r(ArrayList arrayList);

    public abstract void s(ArrayList arrayList);

    public void t(List transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        List list = transactions;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((y0) it8.next()).j());
        }
        s(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            a4 a4VarH = ((y0) it9.next()).h();
            if (a4VarH != null) {
                arrayList2.add(a4VarH);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it10 = list.iterator();
        while (it10.hasNext()) {
            a4 a4VarI = ((y0) it10.next()).i();
            if (a4VarI != null) {
                arrayList3.add(a4VarI);
            }
        }
        ArrayList arrayListE0 = zhm.d0.E0(arrayList3, arrayList2);
        if (!arrayListE0.isEmpty()) {
            u(arrayListE0);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it11 = list.iterator();
        while (it11.hasNext()) {
            k1 k1VarF = ((y0) it11.next()).f();
            if (k1VarF != null) {
                arrayList4.add(k1VarF);
            }
        }
        if (!arrayList4.isEmpty()) {
            q(arrayList4);
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it12 = list.iterator();
        while (it12.hasNext()) {
            m1 m1VarG = ((y0) it12.next()).g();
            if (m1VarG != null) {
                arrayList5.add(m1VarG);
            }
        }
        if (!arrayList5.isEmpty()) {
            r(arrayList5);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it13 = list.iterator();
        while (it13.hasNext()) {
            nif.c cVarA = ((y0) it13.next()).a();
            if (cVarA != null) {
                arrayList6.add(cVarA);
            }
        }
        if (!arrayList6.isEmpty()) {
            l(arrayList6);
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it14 = list.iterator();
        while (it14.hasNext()) {
            e1 e1VarE = ((y0) it14.next()).e();
            if (e1VarE != null) {
                arrayList7.add(e1VarE);
            }
        }
        if (!arrayList7.isEmpty()) {
            p(arrayList7);
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it15 = list.iterator();
        while (it15.hasNext()) {
            l0 l0VarD = ((y0) it15.next()).d();
            if (l0VarD != null) {
                arrayList8.add(l0VarD);
            }
        }
        if (!arrayList8.isEmpty()) {
            o(arrayList8);
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it16 = list.iterator();
        while (it16.hasNext()) {
            nif.z zVarB = ((y0) it16.next()).b();
            if (zVarB != null) {
                arrayList9.add(zVarB);
            }
        }
        if (!arrayList9.isEmpty()) {
            m(arrayList9);
        }
        ArrayList arrayList10 = new ArrayList();
        Iterator it17 = list.iterator();
        while (it17.hasNext()) {
            nif.d0 d0VarC = ((y0) it17.next()).c();
            if (d0VarC != null) {
                arrayList10.add(d0VarC);
            }
        }
        if (arrayList10.isEmpty()) {
            return;
        }
        n(arrayList10);
    }

    public abstract void u(ArrayList arrayList);

    public final pfm.t w(pfm.h hVar) {
        return hVar.l(new m(this, 0));
    }

    public Long x(long j2, String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        e();
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        b(new SimpleSQLiteQuery("\n            CREATE TEMPORARY VIEW running_balance_view AS\n            SELECT\n                leg_id,\n                state,\n                started_date,\n                COALESCE(amount_with_charges, amount_with_fee) AS amount_with_charges,\n                (\n                    " + j2 + "\n                    - COALESCE(\n                        SUM(\n                            CASE \n                                WHEN state = 'COMPLETED' \n                                THEN COALESCE(amount_with_charges, amount_with_fee)\n                                WHEN state = 'PENDING' AND COALESCE(amount_with_charges, amount_with_fee) <= 0 \n                                THEN COALESCE(amount_with_charges, amount_with_fee)\n                                ELSE 0 \n                            END\n                        ) OVER (\n                            ORDER BY started_date DESC\n                            ROWS BETWEEN UNBOUNDED PRECEDING AND 1 PRECEDING\n                        ),\n                        0\n                    )\n                ) AS new_calculated_balance\n            FROM transactions\n            WHERE pocket_id = " + e0.c(pocketId) + "\n            "));
        e();
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        b(new SimpleSQLiteQuery(p.a.p("\n            UPDATE transactions\n            SET calculated_balance = (\n                SELECT new_calculated_balance\n                FROM running_balance_view\n                WHERE running_balance_view.leg_id = transactions.leg_id\n            )\n            WHERE pocket_id = ", e0.c(pocketId), "\n            ")));
        e();
        Long lD = d(new SimpleSQLiteQuery("\n            SELECT\n                new_calculated_balance -\n                CASE\n                    WHEN state = 'COMPLETED'\n                    THEN amount_with_charges\n                    WHEN state = 'PENDING' AND amount_with_charges <= 0\n                    THEN amount_with_charges\n                    ELSE 0\n                END AS discrepancy\n            FROM running_balance_view\n            ORDER BY started_date ASC\n            LIMIT 1\n            "));
        e();
        b(new SimpleSQLiteQuery("DROP VIEW IF EXISTS running_balance_view"));
        return lD;
    }

    public abstract int y(SimpleSQLiteQuery simpleSQLiteQuery);

    public abstract void z(String str, String str2);
}
