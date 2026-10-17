package fed;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.DateTime;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f134528a;

    static {
        iel.n nVar = iel.n.DELISTED;
        Pair pair = new Pair(nVar.getId(), nVar);
        iel.n nVar2 = iel.n.LISTED;
        Pair pair2 = new Pair(nVar2.getId(), nVar2);
        iel.n nVar3 = iel.n.NEW_LISTING;
        Pair pair3 = new Pair(nVar3.getId(), nVar3);
        iel.n nVar4 = iel.n.RESUMED;
        Pair pair4 = new Pair(nVar4.getId(), nVar4);
        iel.n nVar5 = iel.n.SUSPENDED;
        f134528a = r0.k(pair, pair2, pair3, pair4, new Pair(nVar5.getId(), nVar5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v10, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    public static final iel.i a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof c) {
            c cVar = (c) fVar;
            return new iel.d(cVar.f134506b, cVar.d, cVar.e, cVar.f, cVar.f134508g, mo3.a.o(cVar.f134509h));
        }
        if (fVar instanceof k) {
            k kVar = (k) fVar;
            return new iel.k(kVar.f134532b, kVar.d, kVar.e, kVar.f, kVar.f134534g, mo3.a.o(kVar.f134535h));
        }
        ?? arrayList = 0;
        ?? arrayList2 = 0;
        if (fVar instanceof m) {
            m mVar = (m) fVar;
            iel.n nVar = (iel.n) u1.v(mVar.f134546g, f134528a);
            if (nVar != null) {
                return new iel.o(mVar.f134544b, mVar.d, mVar.e, mVar.f, nVar);
            }
            return null;
        }
        if (fVar instanceof n) {
            n nVar2 = (n) fVar;
            String str = nVar2.f134549b;
            LocalDate localDate = nVar2.d;
            iel.l lVar = nVar2.e;
            String str2 = nVar2.f;
            boolean z = nVar2.f134551g;
            Instant instant = nVar2.f134552h;
            DateTime dateTime = instant != null ? new DateTime(instant.toEpochMilli()) : null;
            Instant instant2 = nVar2.i;
            return new iel.p(str, localDate, lVar, str2, z, dateTime, instant2 != null ? new DateTime(instant2.toEpochMilli()) : null);
        }
        if (fVar instanceof y) {
            y yVar = (y) fVar;
            return new iel.x(yVar.f134579b, yVar.d, yVar.e, yVar.f, yVar.f134581g, yVar.f134582h);
        }
        if (fVar instanceof z) {
            z zVar = (z) fVar;
            String str3 = zVar.f134585b;
            LocalDate localDate2 = zVar.d;
            String str4 = zVar.e;
            String str5 = zVar.f;
            LocalDate localDate3 = zVar.f134587g;
            LocalDate localDate4 = zVar.f134588h;
            x xVar = zVar.i;
            Intrinsics.checkNotNullParameter(xVar, "<this>");
            return new iel.y(str3, localDate2, str4, str5, localDate3, localDate4, new iel.w(xVar.f134577a, xVar.f134578b));
        }
        if (fVar instanceof b0) {
            b0 b0Var = (b0) fVar;
            return new iel.a0(b0Var.f134501b, b0Var.d, b0Var.e, b0Var.f, b0Var.f134503g, b0Var.f134504h);
        }
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            String str6 = eVar.f134521b;
            LocalDate localDate5 = eVar.d;
            String str7 = eVar.e;
            String str8 = eVar.f;
            Instant instant3 = eVar.i;
            DateTime dateTime2 = instant3 != null ? new DateTime(instant3.toEpochMilli()) : null;
            Instant instant4 = eVar.f134525j;
            return new iel.h(str6, localDate5, str7, str8, eVar.f134523g, eVar.f134524h, dateTime2, instant4 != null ? new DateTime(instant4.toEpochMilli()) : null, eVar.k);
        }
        if (fVar instanceof p) {
            p pVar = (p) fVar;
            String str9 = pVar.f134561b;
            LocalDate localDate6 = pVar.d;
            String str10 = pVar.e;
            String str11 = pVar.f;
            List list = pVar.f134563g;
            if (list != null) {
                List<s> list2 = list;
                arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (s sVar : list2) {
                    Intrinsics.checkNotNullParameter(sVar, "<this>");
                    arrayList.add(new iel.t(sVar.f134566a, sVar.f134567b, sVar.f134568c));
                }
            }
            if (arrayList == 0) {
                arrayList = f0.f322471a;
            }
            return new iel.r(str9, localDate6, str10, str11, arrayList);
        }
        if (fVar instanceof u) {
            u uVar = (u) fVar;
            String str12 = uVar.f134572b;
            LocalDate localDate7 = uVar.d;
            String str13 = uVar.e;
            String str14 = uVar.f;
            List list3 = uVar.f134574g;
            if (list3 != null) {
                List<s> list4 = list3;
                arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                for (s sVar2 : list4) {
                    Intrinsics.checkNotNullParameter(sVar2, "<this>");
                    arrayList2.add(new iel.t(sVar2.f134566a, sVar2.f134567b, sVar2.f134568c));
                }
            }
            if (arrayList2 == 0) {
                arrayList2 = f0.f322471a;
            }
            return new iel.v(str12, localDate7, str13, str14, arrayList2);
        }
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            return new iel.b(aVar.f134492b, aVar.e, aVar.f, aVar.d);
        }
        if (fVar instanceof b) {
            b bVar = (b) fVar;
            return new iel.c(bVar.f134496b, bVar.d, bVar.e, bVar.f, bVar.f134498g, nz8.d.y(bVar.f134499h));
        }
        if (fVar instanceof l) {
            l lVar2 = (l) fVar;
            String str15 = lVar2.f134537b;
            LocalDate localDate8 = lVar2.d;
            String str16 = lVar2.e;
            String str17 = lVar2.f;
            LocalDate localDate9 = lVar2.f134539g;
            LocalDate localDate10 = lVar2.f134540h;
            hed.a aVar2 = lVar2.i;
            return new iel.m(str15, localDate8, str16, str17, localDate9, localDate10, aVar2 != null ? nz8.d.y(aVar2) : null, lVar2.f134541j);
        }
        if (fVar instanceof d) {
            d dVar = (d) fVar;
            String str18 = dVar.f134514b;
            LocalDate localDate11 = dVar.d;
            String str19 = dVar.e;
            String str20 = dVar.f;
            LocalDate localDate12 = dVar.f134516g;
            LocalDate localDate13 = dVar.f134517h;
            hed.a aVar3 = dVar.i;
            return new iel.g(str18, localDate11, str19, str20, localDate12, localDate13, aVar3 != null ? nz8.d.y(aVar3) : null, dVar.f134518j);
        }
        if (!(fVar instanceof o)) {
            if (fVar instanceof c0) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        o oVar = (o) fVar;
        String str21 = oVar.f134554b;
        LocalDate localDate14 = oVar.d;
        String str22 = oVar.e;
        String str23 = oVar.f;
        LocalDate localDate15 = oVar.f134556g;
        LocalDate localDate16 = oVar.f134557h;
        hed.a aVar4 = oVar.i;
        return new iel.q(str21, localDate14, str22, str23, localDate15, localDate16, aVar4 != null ? nz8.d.y(aVar4) : null, oVar.f134558j);
    }
}
