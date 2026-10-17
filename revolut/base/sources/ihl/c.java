package ihl;

import ehl.e;
import ehl.l;
import ehl.m;
import ehl.q;
import ehl.s;
import ehl.t;
import ehl.u;
import ehl.x;
import iel.a0;
import iel.d;
import iel.g;
import iel.h;
import iel.i;
import iel.j;
import iel.k;
import iel.n;
import iel.o;
import iel.p;
import iel.r;
import iel.v;
import iel.w;
import iel.y;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f161430a;

    static {
        n nVar = n.DELISTED;
        Pair pair = new Pair(nVar.getId(), nVar);
        n nVar2 = n.LISTED;
        Pair pair2 = new Pair(nVar2.getId(), nVar2);
        n nVar3 = n.NEW_LISTING;
        Pair pair3 = new Pair(nVar3.getId(), nVar3);
        n nVar4 = n.RESUMED;
        Pair pair4 = new Pair(nVar4.getId(), nVar4);
        n nVar5 = n.SUSPENDED;
        f161430a = r0.k(pair, pair2, pair3, pair4, new Pair(nVar5.getId(), nVar5));
    }

    public static final ehl.c a(i iVar, boolean z) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        x xVarB = b(iVar);
        return new ehl.c(xVarB.f126302a, xVarB.f126303b, xVarB.f126304c, z, xVarB.d, xVarB.e, xVarB.f, xVarB.f126305g, xVarB.f126306h, xVarB.i, xVarB.f126307j, xVarB.k, xVarB.f126308l, xVarB.f126309m, xVarB.f126310n, xVarB.o, xVarB.f126311p, xVarB.f126312q, xVarB.f126313r);
    }

    public static final x b(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (iVar instanceof d) {
            d dVar = (d) iVar;
            return new x(dVar.f160775a, j.CASH_DIVIDEND, dVar.f160776b, null, new e(dVar.f160777c, dVar.d, dVar.e, hx7.a.A(dVar.f)), null, null, null, null, null, null, null, null, null, null, null, null, null, 262120);
        }
        if (iVar instanceof k) {
            k kVar = (k) iVar;
            return new x(kVar.f160789a, j.EX_DIVIDEND, kVar.f160790b, null, null, null, null, null, null, null, new ehl.k(kVar.f160791c, kVar.d, kVar.e, hx7.a.A(kVar.f)), null, null, null, null, null, null, null, 261112);
        }
        if (iVar instanceof o) {
            o oVar = (o) iVar;
            return new x(oVar.f160799a, j.LISTING_STATUS_CHANGE, oVar.f160800b, null, null, null, new m(oVar.f160801c, oVar.d, oVar.e), null, null, null, null, null, null, null, null, null, null, null, 262072);
        }
        if (iVar instanceof p) {
            p pVar = (p) iVar;
            return new x(pVar.f160802a, j.MARKET_HOLIDAY, pVar.f160803b, new ehl.n(pVar.f160804c, pVar.d, pVar.e, pVar.f, pVar.f160805g), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262128);
        }
        if (iVar instanceof iel.x) {
            iel.x xVar = (iel.x) iVar;
            return new x(xVar.f160823a, j.STOCK_DIVIDEND, xVar.f160824b, null, null, new s(xVar.f160825c, xVar.d, xVar.e, xVar.f), null, null, null, null, null, null, null, null, null, null, null, null, 262104);
        }
        if (iVar instanceof y) {
            y yVar = (y) iVar;
            String str = yVar.f160826a;
            j jVar = j.STOCK_SPLIT;
            LocalDate localDate = yVar.f160827b;
            String str2 = yVar.f160828c;
            String str3 = yVar.d;
            LocalDate localDate2 = yVar.e;
            LocalDate localDate3 = yVar.f;
            w wVar = yVar.f160829g;
            return new x(str, jVar, localDate, null, null, null, null, null, new t(str2, str3, localDate2, localDate3, wVar.f160821a, wVar.f160822b), null, null, null, null, null, null, null, null, null, 261880);
        }
        if (iVar instanceof a0) {
            a0 a0Var = (a0) iVar;
            return new x(a0Var.f160766a, j.SYMBOL_CHANGE, a0Var.f160767b, null, null, null, null, new u(a0Var.f160768c, a0Var.d, a0Var.e, a0Var.f), null, null, null, null, null, null, null, null, null, null, 262008);
        }
        if (iVar instanceof h) {
            h hVar = (h) iVar;
            return new x(hVar.f160783a, j.EARNINGS_CALL, hVar.f160784b, null, null, null, null, null, null, new ehl.j(hVar.f160785c, hVar.d, hVar.f160786g, hVar.f160787h, hVar.e, hVar.f, hVar.i), null, null, null, null, null, null, null, null, 261624);
        }
        if (iVar instanceof r) {
            r rVar = (r) iVar;
            String str4 = rVar.f160811a;
            j jVar2 = j.MERGER;
            LocalDate localDate4 = rVar.f160812b;
            String str5 = rVar.f160813c;
            String str6 = rVar.d;
            List<iel.t> list = rVar.e;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (iel.t tVar : list) {
                arrayList.add(new q(tVar.f160814a, tVar.f160815b, tVar.f160816c));
            }
            return new x(str4, jVar2, localDate4, null, null, null, null, null, null, null, null, new ehl.p(str5, str6, arrayList), null, null, null, null, null, null, 260088);
        }
        if (iVar instanceof v) {
            v vVar = (v) iVar;
            String str7 = vVar.f160818a;
            j jVar3 = j.SPINOFF;
            LocalDate localDate5 = vVar.f160819b;
            String str8 = vVar.f160820c;
            String str9 = vVar.d;
            List<iel.t> list2 = vVar.e;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            for (iel.t tVar2 : list2) {
                arrayList2.add(new q(tVar2.f160814a, tVar2.f160815b, tVar2.f160816c));
            }
            return new x(str7, jVar3, localDate5, null, null, null, null, null, null, null, null, null, new ehl.r(str8, str9, arrayList2), null, null, null, null, null, 258040);
        }
        if (iVar instanceof iel.b) {
            iel.b bVar = (iel.b) iVar;
            return new x(bVar.f160769a, j.BANKRUPTCY, bVar.f160770b, null, null, null, null, null, null, null, null, null, null, new ehl.a(bVar.f160771c, bVar.d), null, null, null, null, 253944);
        }
        if (iVar instanceof iel.c) {
            iel.c cVar = (iel.c) iVar;
            return new x(cVar.f160772a, j.BOND_COUPON, cVar.f160773b, null, null, null, null, null, null, null, null, null, null, null, new ehl.b(cVar.f160774c, cVar.d, cVar.e, cp5.c.M(cVar.f)), null, null, null, 245752);
        }
        if (iVar instanceof iel.m) {
            iel.m mVar = (iel.m) iVar;
            String str10 = mVar.f160793a;
            j jVar4 = j.INTEREST_PAYMENT;
            LocalDate localDate6 = mVar.f160794b;
            String str11 = mVar.f160795c;
            String str12 = mVar.d;
            LocalDate localDate7 = mVar.e;
            LocalDate localDate8 = mVar.f;
            ej0.b bVar2 = mVar.f160796g;
            return new x(str10, jVar4, localDate6, null, null, null, null, null, null, null, null, null, null, null, null, new l(str11, str12, localDate7, localDate8, bVar2 != null ? cp5.c.M(bVar2) : null, mVar.f160797h), null, null, 229368);
        }
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            String str13 = gVar.f160778a;
            j jVar5 = j.EARLY_REDEMPTION;
            LocalDate localDate9 = gVar.f160779b;
            String str14 = gVar.f160780c;
            String str15 = gVar.d;
            LocalDate localDate10 = gVar.e;
            LocalDate localDate11 = gVar.f;
            ej0.b bVar3 = gVar.f160781g;
            return new x(str13, jVar5, localDate9, null, null, null, null, null, null, null, null, null, null, null, null, null, new ehl.i(str14, str15, localDate10, localDate11, bVar3 != null ? cp5.c.M(bVar3) : null, gVar.f160782h), null, 196600);
        }
        if (!(iVar instanceof iel.q)) {
            throw new NoWhenBranchMatchedException();
        }
        iel.q qVar = (iel.q) iVar;
        String str16 = qVar.f160806a;
        j jVar6 = j.MATURITY_REDEMPTION;
        LocalDate localDate12 = qVar.f160807b;
        String str17 = qVar.f160808c;
        String str18 = qVar.d;
        LocalDate localDate13 = qVar.e;
        LocalDate localDate14 = qVar.f;
        ej0.b bVar4 = qVar.f160809g;
        return new x(str16, jVar6, localDate12, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ehl.o(str17, str18, localDate13, localDate14, bVar4 != null ? cp5.c.M(bVar4) : null, qVar.f160810h), 131064);
    }

    public static final i c(ehl.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return d(new x(cVar.f126227a, cVar.f126228b, cVar.f126229c, cVar.e, cVar.f, cVar.f126230g, cVar.f126231h, cVar.i, cVar.f126232j, cVar.k, cVar.f126233l, cVar.f126234m, cVar.f126235n, cVar.o, cVar.f126236p, cVar.f126237q, cVar.f126238r, cVar.f126239s));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    public static final i d(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        ?? arrayList = 0;
        ?? arrayList2 = 0;
        switch (b.f161429a[xVar.f126303b.ordinal()]) {
            case 1:
                e eVar = xVar.e;
                if (eVar != null) {
                    return new d(xVar.f126302a, xVar.f126304c, eVar.f126242a, eVar.f126243b, eVar.f126244c, hx7.a.v(eVar.d));
                }
                return null;
            case 2:
                ehl.k kVar = xVar.k;
                if (kVar != null) {
                    return new k(xVar.f126302a, xVar.f126304c, kVar.f126259a, kVar.f126260b, kVar.f126261c, hx7.a.v(kVar.d));
                }
                return null;
            case 3:
                m mVar = xVar.f126305g;
                if (mVar != null) {
                    return new o(xVar.f126302a, xVar.f126304c, mVar.f126265a, mVar.f126266b, mVar.f126267c);
                }
                return null;
            case 4:
                ehl.n nVar = xVar.d;
                if (nVar != null) {
                    return new p(xVar.f126302a, xVar.f126304c, nVar.f126268a, nVar.f126269b, nVar.f126270c, nVar.d, nVar.e);
                }
                return null;
            case 5:
                s sVar = xVar.f;
                if (sVar != null) {
                    return new iel.x(xVar.f126302a, xVar.f126304c, sVar.f126283a, sVar.f126284b, sVar.f126285c, sVar.d);
                }
                return null;
            case 6:
                t tVar = xVar.i;
                if (tVar != null) {
                    return new y(xVar.f126302a, xVar.f126304c, tVar.f126286a, tVar.f126287b, tVar.f126288c, tVar.d, new w(tVar.e, tVar.f));
                }
                return null;
            case 7:
                u uVar = xVar.f126306h;
                if (uVar != null) {
                    return new a0(xVar.f126302a, xVar.f126304c, uVar.f126289a, uVar.f126290b, uVar.f126291c, uVar.d);
                }
                return null;
            case 8:
                ehl.j jVar = xVar.f126307j;
                if (jVar != null) {
                    return new h(xVar.f126302a, xVar.f126304c, jVar.f126255a, jVar.f126256b, jVar.e, jVar.f, jVar.f126257c, jVar.d, jVar.f126258g);
                }
                return null;
            case 9:
                ehl.p pVar = xVar.f126308l;
                if (pVar != null) {
                    String str = xVar.f126302a;
                    LocalDate localDate = xVar.f126304c;
                    String str2 = pVar.f126274a;
                    String str3 = pVar.f126275b;
                    List list = pVar.f126276c;
                    if (list != null) {
                        List<q> list2 = list;
                        arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (q qVar : list2) {
                            arrayList.add(new iel.t(qVar.getType(), qVar.getAsset(), qVar.getAmount()));
                        }
                    }
                    if (arrayList == 0) {
                        arrayList = f0.f322471a;
                    }
                    return new r(str, localDate, str2, str3, arrayList);
                }
                return null;
            case 10:
                ehl.r rVar = xVar.f126309m;
                if (rVar != null) {
                    String str4 = xVar.f126302a;
                    LocalDate localDate2 = xVar.f126304c;
                    String str5 = rVar.f126280a;
                    String str6 = rVar.f126281b;
                    List list3 = rVar.f126282c;
                    if (list3 != null) {
                        List<q> list4 = list3;
                        arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (q qVar2 : list4) {
                            arrayList2.add(new iel.t(qVar2.getType(), qVar2.getAsset(), qVar2.getAmount()));
                        }
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = f0.f322471a;
                    }
                    return new v(str4, localDate2, str5, str6, arrayList2);
                }
                return null;
            case 11:
                ehl.a aVar = xVar.f126310n;
                if (aVar != null) {
                    return new iel.b(xVar.f126302a, aVar.f126222a, aVar.f126223b, xVar.f126304c);
                }
                return null;
            case 12:
                ehl.b bVar = xVar.o;
                if (bVar != null) {
                    return new iel.c(xVar.f126302a, xVar.f126304c, bVar.f126224a, bVar.f126225b, bVar.f126226c, cp5.c.I(bVar.d));
                }
                return null;
            case 13:
                l lVar = xVar.f126311p;
                if (lVar != null) {
                    String str7 = xVar.f126302a;
                    LocalDate localDate3 = xVar.f126304c;
                    String str8 = lVar.f126262a;
                    String str9 = lVar.f126263b;
                    LocalDate localDate4 = lVar.f126264c;
                    LocalDate localDate5 = lVar.d;
                    ko3.b bVar2 = lVar.e;
                    return new iel.m(str7, localDate3, str8, str9, localDate4, localDate5, bVar2 != null ? cp5.c.I(bVar2) : null, lVar.f);
                }
                return null;
            case 14:
                ehl.i iVar = xVar.f126312q;
                if (iVar != null) {
                    String str10 = xVar.f126302a;
                    LocalDate localDate6 = xVar.f126304c;
                    String str11 = iVar.f126252a;
                    String str12 = iVar.f126253b;
                    LocalDate localDate7 = iVar.f126254c;
                    LocalDate localDate8 = iVar.d;
                    ko3.b bVar3 = iVar.e;
                    return new g(str10, localDate6, str11, str12, localDate7, localDate8, bVar3 != null ? cp5.c.I(bVar3) : null, iVar.f);
                }
                return null;
            case 15:
                ehl.o oVar = xVar.f126313r;
                if (oVar != null) {
                    String str13 = xVar.f126302a;
                    LocalDate localDate9 = xVar.f126304c;
                    String str14 = oVar.f126271a;
                    String str15 = oVar.f126272b;
                    LocalDate localDate10 = oVar.f126273c;
                    LocalDate localDate11 = oVar.d;
                    ko3.b bVar4 = oVar.e;
                    return new iel.q(str13, localDate9, str14, str15, localDate10, localDate11, bVar4 != null ? cp5.c.I(bVar4) : null, oVar.f);
                }
                return null;
            case 16:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
