package u3f;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.transaction.FeeType;
import dfl.b0;
import dfl.e0;
import dfl.f0;
import dfl.g;
import dfl.g0;
import dfl.h;
import dfl.h0;
import dfl.i;
import dfl.i0;
import dfl.j;
import dfl.k;
import dfl.k0;
import dfl.l;
import dfl.l0;
import dfl.m;
import dfl.o0;
import dfl.p0;
import dfl.q0;
import dfl.s;
import dfl.t;
import dfl.u;
import dfl.v;
import dfl.w;
import dfl.y;
import dfl.z;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import kotlin.text.d0;
import n3f.c0;
import n3f.s;
import org.joda.time.YearMonth;
import w3f.f;
import w3f.j0;
import w3f.n;
import w3f.o;
import w3f.p;
import w3f.q;
import w3f.r;
import w3f.u;
import w3f.x;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d {
    public static final p0 a(c0 c0Var) {
        String str = c0Var.H;
        if (str == null) {
            return null;
        }
        xi0.b.Companion.getClass();
        return new p0(xi0.a.a(str));
    }

    public static final p0 b(c0 c0Var) {
        String str = c0Var.I;
        if (str == null) {
            return null;
        }
        xi0.b.Companion.getClass();
        return new p0(xi0.a.a(str));
    }

    public static final String c(String str, String str2, String str3) throws IOException {
        String[] elements = {str, str2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listL) {
            if (!d0.W((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        String strK0 = zhm.d0.k0(arrayList, " ", null, null, 0, null, 62);
        if (d0.W(strK0)) {
            strK0 = null;
        }
        if (strK0 != null) {
            return strK0;
        }
        if (str3 == null || d0.W(str3)) {
            return null;
        }
        return str3;
    }

    public static final Pair d(i0 i0Var) {
        if (i0Var instanceof f0) {
            return ((f0) i0Var).f114304s;
        }
        if (i0Var instanceof dfl.e) {
            return ((dfl.e) i0Var).f114274t;
        }
        if ((i0Var instanceof dfl.c) || (i0Var instanceof g0) || (i0Var instanceof h0) || (i0Var instanceof g) || (i0Var instanceof y) || (i0Var instanceof dfl.b) || (i0Var instanceof dfl.d) || (i0Var instanceof h) || (i0Var instanceof i) || (i0Var instanceof j) || (i0Var instanceof k) || (i0Var instanceof l) || (i0Var instanceof s) || (i0Var instanceof v) || (i0Var instanceof w) || (i0Var instanceof z) || (i0Var instanceof b0) || (i0Var instanceof t) || (i0Var instanceof dfl.c0) || (i0Var instanceof e0) || (i0Var instanceof m) || (i0Var instanceof dfl.d0)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final cfl.j e(w3f.h0 h0Var) {
        cfl.j jVar;
        String accountHolderType = h0Var.getAccountHolderType();
        if (accountHolderType != null) {
            cfl.j[] jVarArrValues = cfl.j.values();
            int length = jVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jVar = null;
                    break;
                }
                jVar = jVarArrValues[i];
                if (a0.z(jVar.name(), accountHolderType, true)) {
                    break;
                }
                i++;
            }
            if (jVar != null) {
                return jVar;
            }
        }
        return cfl.j.PERSONAL;
    }

    /* JADX WARN: Removed duplicated region for block: B:306:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x07e5  */
    /* JADX WARN: Type inference failed for: r6v59, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final n3f.c0 f(dfl.i0 r73) {
        /*
            Method dump skipped, instruction units count: 2158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3f.d.f(dfl.i0):n3f.c0");
    }

    public static final u g(s.a aVar) {
        return new u(hx7.a.v(aVar.getValue()), aVar.getRef(), aVar.getSymbol());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0897  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dfl.i0 h(n3f.c0 r66) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3f.d.h(n3f.c0):dfl.i0");
    }

    public static final i0 i(w3f.h0 h0Var) {
        x3f.a aVar;
        List list;
        String str;
        nel.z zVarA;
        dfl.a aVar2;
        dfl.a aVar3;
        ArrayList arrayList;
        Instant instant;
        w3f.y yVar;
        dfl.a0 a0Var;
        nel.z zVarA2;
        dfl.a aVar4;
        bel.a aVar5;
        bel.a aVar6;
        w3f.d0 d0Var;
        List list2;
        String str2;
        nel.z zVarA3;
        dfl.a aVar7;
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        q initiatedBy = h0Var.getInitiatedBy();
        o0 o0Var = initiatedBy != null ? new o0(initiatedBy.getId(), initiatedBy.getName(), initiatedBy.getFirstName(), initiatedBy.getLastName(), initiatedBy.getCode(), c(initiatedBy.getFirstName(), initiatedBy.getLastName(), initiatedBy.getName())) : null;
        if (h0Var instanceof w3f.d0) {
            String id10 = h0Var.getId();
            String compoundId = h0Var.getCompoundId();
            String ref2 = h0Var.getRef();
            String holdingId = h0Var.getHoldingId();
            q0 q0VarA = c.a(h0Var.getState());
            Long completedAt = h0Var.getCompletedAt();
            long createdAt = h0Var.getCreatedAt();
            Long updatedAt = h0Var.getUpdatedAt();
            dfl.q qVarU = md6.s.u(h0Var.getValue());
            w3f.d0 d0Var2 = (w3f.d0) h0Var;
            jo3.a aVarA = d0Var2.getExecutedPrice();
            dj0.d dVarO = aVarA != null ? mo3.a.o(aVarA) : null;
            bfl.g gVarC = f4l.a.c(d0Var2.getSide());
            String strC = d0Var2.getExternalId();
            List listD = d0Var2.getFees();
            if (listD != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it8 = listD.iterator();
                while (it8.hasNext()) {
                    w3f.d0 d0Var3 = d0Var2;
                    l0 l0VarB = a.b((w3f.i0) it8.next());
                    if (l0VarB != null) {
                        arrayList2.add(l0VarB);
                    }
                    d0Var2 = d0Var3;
                }
                d0Var = d0Var2;
                list2 = arrayList2;
            } else {
                d0Var = d0Var2;
                list2 = zhm.f0.f322471a;
            }
            List list3 = list2;
            jo3.a aVarE = d0Var.getGross();
            dj0.d dVarO2 = aVarE != null ? mo3.a.o(aVarE) : null;
            jo3.a aVarH = d0Var.getNet();
            dj0.d dVarO3 = aVarH != null ? mo3.a.o(aVarH) : null;
            boolean zV = d0Var.getConfirmed();
            String strX = d0Var.getEstimatedQuantity();
            BigDecimal bigDecimal = strX != null ? new BigDecimal(strX) : null;
            jo3.a aVarY = d0Var.getEstimatedTotal();
            dj0.d dVarO4 = aVarY != null ? mo3.a.o(aVarY) : null;
            String strB = d0Var.getExecutedQuantity();
            BigDecimal bigDecimal2 = strB != null ? new BigDecimal(strB) : null;
            w3f.g0 g0VarU = d0Var.getCommission();
            k0 k0VarJ = g0VarU != null ? mif.a.J(g0VarU) : null;
            String strK = d0Var.getSymbol();
            String strF = d0Var.getInstrumentName();
            if (strF == null) {
                m70.a.c(t0.f186434a);
                str2 = "";
            } else {
                str2 = strF;
            }
            String strG = d0Var.getInstrumentType();
            if (strG == null || (zVarA3 = tbl.a.a(strG)) == null) {
                zVarA3 = nel.z.UNSPECIFIED;
            }
            nel.z zVar = zVarA3;
            Long settlementDate = h0Var.getSettlementDate();
            Instant instantOfEpochMilli = settlementDate != null ? Instant.ofEpochMilli(settlementDate.longValue()) : null;
            String standingOrderId = h0Var.getStandingOrderId();
            String strT = d0Var.getClientOrderId();
            boolean zJ = d0Var.getStanding();
            w3f.d0 d0Var4 = d0Var;
            WealthAccountType wealthAccountTypeQ = edl.a.q(h0Var);
            String portfolioId = h0Var.getPortfolioId();
            j0 baseInstrument = h0Var.getBaseInstrument();
            p0 p0VarK = baseInstrument != null ? k(baseInstrument) : null;
            j0 counterInstrument = h0Var.getCounterInstrument();
            p0 p0VarK2 = counterInstrument != null ? k(counterInstrument) : null;
            String badge = h0Var.getBadge();
            dfl.j0 j0VarU = badge != null ? yh5.b.U(badge) : null;
            r rVarZ = d0Var4.getExchangedValue();
            if (rVarZ != null) {
                dfl.q qVarU2 = md6.s.u(rVarZ);
                Intrinsics.checkNotNullParameter(qVarU2, "<this>");
                aVar7 = (dfl.a) qVarU2;
            } else {
                aVar7 = null;
            }
            return new f0(id10, compoundId, ref2, holdingId, q0VarA, createdAt, updatedAt, completedAt, qVarU, instantOfEpochMilli, standingOrderId, wealthAccountTypeQ, portfolioId, p0VarK, p0VarK2, j0VarU, o0Var, e(h0Var), cp5.d.H(d0Var4.getCurrencyPair()), d0Var4.getAwaitingSettlement(), strK, str2, zVar, gVarC, dVarO, k0VarJ, list3, dVarO2, dVarO3, strC, bigDecimal, bigDecimal2, dVarO4, zV, strT, zJ, aVar7);
        }
        if (h0Var instanceof w3f.e) {
            w3f.e eVar = (w3f.e) h0Var;
            w3f.d fromAccount = eVar.getFromAccount();
            if (fromAccount != null) {
                bel.b bVarD = yoj.b.d(fromAccount.getType());
                xi0.a aVar8 = xi0.b.Companion;
                String currency = fromAccount.getCurrency();
                aVar8.getClass();
                aVar5 = new bel.a(bVarD, xi0.a.a(currency));
            } else {
                aVar5 = null;
            }
            w3f.d toAccount = eVar.getToAccount();
            if (toAccount != null) {
                bel.b bVarD2 = yoj.b.d(toAccount.getType());
                xi0.a aVar9 = xi0.b.Companion;
                String currency2 = toAccount.getCurrency();
                aVar9.getClass();
                aVar6 = new bel.a(bVarD2, xi0.a.a(currency2));
            } else {
                aVar6 = null;
            }
            String id11 = h0Var.getId();
            String compoundId2 = h0Var.getCompoundId();
            String ref3 = h0Var.getRef();
            String holdingId2 = h0Var.getHoldingId();
            q0 q0VarA2 = c.a(h0Var.getState());
            Long completedAt2 = h0Var.getCompletedAt();
            long createdAt2 = h0Var.getCreatedAt();
            Long updatedAt2 = h0Var.getUpdatedAt();
            dfl.q qVarU3 = md6.s.u(h0Var.getValue());
            bfl.g gVarC2 = f4l.a.c(eVar.getSide());
            Long settlementDate2 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli2 = settlementDate2 != null ? Instant.ofEpochMilli(settlementDate2.longValue()) : null;
            String standingOrderId2 = h0Var.getStandingOrderId();
            String clientOrderId = eVar.getClientOrderId();
            boolean isAutoTopUp = eVar.getIsAutoTopUp();
            WealthAccountType wealthAccountTypeQ2 = edl.a.q(h0Var);
            String portfolioId2 = h0Var.getPortfolioId();
            j0 baseInstrument2 = h0Var.getBaseInstrument();
            p0 p0VarK3 = baseInstrument2 != null ? k(baseInstrument2) : null;
            j0 counterInstrument2 = h0Var.getCounterInstrument();
            p0 p0VarK4 = counterInstrument2 != null ? k(counterInstrument2) : null;
            String badge2 = h0Var.getBadge();
            return new dfl.b(id11, compoundId2, ref3, holdingId2, q0VarA2, createdAt2, updatedAt2, completedAt2, qVarU3, instantOfEpochMilli2, standingOrderId2, wealthAccountTypeQ2, portfolioId2, p0VarK3, p0VarK4, badge2 != null ? yh5.b.U(badge2) : null, o0Var, e(h0Var), gVarC2, clientOrderId, isAutoTopUp, eVar.getSymbol(), eVar.getCorrectionType(), eVar.getAmountGuaranteed(), eVar.getIsSpareChange(), eVar.getIsFromIncomeSorter(), eVar.getLocalisedDescription(), aVar5, aVar6, null);
        }
        if (h0Var instanceof n) {
            String id12 = h0Var.getId();
            String compoundId3 = h0Var.getCompoundId();
            String ref4 = h0Var.getRef();
            String holdingId3 = h0Var.getHoldingId();
            q0 q0VarA3 = c.a(h0Var.getState());
            Long completedAt3 = h0Var.getCompletedAt();
            long createdAt3 = h0Var.getCreatedAt();
            Long updatedAt3 = h0Var.getUpdatedAt();
            dfl.q qVarU4 = md6.s.u(h0Var.getValue());
            n nVar = (n) h0Var;
            String instrumentName = nVar.getInstrumentName();
            String instrumentType = nVar.getInstrumentType();
            if (instrumentType == null || (zVarA2 = tbl.a.a(instrumentType)) == null) {
                zVarA2 = nel.z.UNSPECIFIED;
            }
            nel.z zVar2 = zVarA2;
            jo3.a tax = nVar.getTax();
            dj0.d dVarO5 = tax != null ? mo3.a.o(tax) : null;
            jo3.a gross = nVar.getGross();
            dj0.d dVarO6 = gross != null ? mo3.a.o(gross) : null;
            String symbol = nVar.getSymbol();
            Long settlementDate3 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli3 = settlementDate3 != null ? Instant.ofEpochMilli(settlementDate3.longValue()) : null;
            String standingOrderId3 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ3 = edl.a.q(h0Var);
            String portfolioId3 = h0Var.getPortfolioId();
            j0 baseInstrument3 = h0Var.getBaseInstrument();
            p0 p0VarK5 = baseInstrument3 != null ? k(baseInstrument3) : null;
            j0 counterInstrument3 = h0Var.getCounterInstrument();
            p0 p0VarK6 = counterInstrument3 != null ? k(counterInstrument3) : null;
            String badge3 = h0Var.getBadge();
            dfl.j0 j0VarU2 = badge3 != null ? yh5.b.U(badge3) : null;
            cfl.j jVarE = e(h0Var);
            r exchangedValue = nVar.getExchangedValue();
            if (exchangedValue != null) {
                dfl.q qVarU5 = md6.s.u(exchangedValue);
                Intrinsics.checkNotNullParameter(qVarU5, "<this>");
                aVar4 = (dfl.a) qVarU5;
            } else {
                aVar4 = null;
            }
            String rate = nVar.getRate();
            return new j(id12, compoundId3, ref4, holdingId3, q0VarA3, createdAt3, updatedAt3, completedAt3, qVarU4, instantOfEpochMilli3, standingOrderId3, wealthAccountTypeQ3, portfolioId3, p0VarK5, p0VarK6, j0VarU2, o0Var, jVarE, instrumentName, zVar2, dVarO5, dVarO6, symbol, aVar4, rate != null ? new BigDecimal(rate) : null);
        }
        if (h0Var instanceof w3f.k) {
            String id13 = h0Var.getId();
            String compoundId4 = h0Var.getCompoundId();
            String ref5 = h0Var.getRef();
            String holdingId4 = h0Var.getHoldingId();
            q0 q0VarA4 = c.a(h0Var.getState());
            Long completedAt4 = h0Var.getCompletedAt();
            long createdAt4 = h0Var.getCreatedAt();
            Long updatedAt4 = h0Var.getUpdatedAt();
            dfl.q qVarU6 = md6.s.u(h0Var.getValue());
            Long settlementDate4 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli4 = settlementDate4 != null ? Instant.ofEpochMilli(settlementDate4.longValue()) : null;
            String standingOrderId4 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ4 = edl.a.q(h0Var);
            String portfolioId4 = h0Var.getPortfolioId();
            j0 baseInstrument4 = h0Var.getBaseInstrument();
            p0 p0VarK7 = baseInstrument4 != null ? k(baseInstrument4) : null;
            j0 counterInstrument4 = h0Var.getCounterInstrument();
            p0 p0VarK8 = counterInstrument4 != null ? k(counterInstrument4) : null;
            String badge4 = h0Var.getBadge();
            dfl.j0 j0VarU3 = badge4 != null ? yh5.b.U(badge4) : null;
            w3f.k kVar = (w3f.k) h0Var;
            jo3.a tax2 = kVar.getTax();
            dj0.d dVarO7 = tax2 != null ? mo3.a.o(tax2) : null;
            jo3.a gross2 = kVar.getGross();
            return new g(id13, compoundId4, ref5, holdingId4, q0VarA4, createdAt4, updatedAt4, completedAt4, qVarU6, instantOfEpochMilli4, standingOrderId4, wealthAccountTypeQ4, portfolioId4, p0VarK7, p0VarK8, j0VarU3, o0Var, e(h0Var), dVarO7, gross2 != null ? mo3.a.o(gross2) : null, kVar.getSymbol(), kVar.getInstrumentName());
        }
        if (h0Var instanceof x) {
            String id14 = h0Var.getId();
            String compoundId5 = h0Var.getCompoundId();
            String ref6 = h0Var.getRef();
            String holdingId5 = h0Var.getHoldingId();
            q0 q0VarA5 = c.a(h0Var.getState());
            Long completedAt5 = h0Var.getCompletedAt();
            long createdAt5 = h0Var.getCreatedAt();
            Long updatedAt5 = h0Var.getUpdatedAt();
            dfl.q qVarU7 = md6.s.u(h0Var.getValue());
            Long settlementDate5 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli5 = settlementDate5 != null ? Instant.ofEpochMilli(settlementDate5.longValue()) : null;
            String standingOrderId5 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ5 = edl.a.q(h0Var);
            String portfolioId5 = h0Var.getPortfolioId();
            j0 baseInstrument5 = h0Var.getBaseInstrument();
            p0 p0VarK9 = baseInstrument5 != null ? k(baseInstrument5) : null;
            j0 counterInstrument5 = h0Var.getCounterInstrument();
            p0 p0VarK10 = counterInstrument5 != null ? k(counterInstrument5) : null;
            String badge5 = h0Var.getBadge();
            dfl.j0 j0VarU4 = badge5 != null ? yh5.b.U(badge5) : null;
            x xVar = (x) h0Var;
            return new y(id14, compoundId5, ref6, holdingId5, q0VarA5, createdAt5, updatedAt5, completedAt5, qVarU7, instantOfEpochMilli5, standingOrderId5, wealthAccountTypeQ5, portfolioId5, p0VarK9, p0VarK10, j0VarU4, o0Var, e(h0Var), xVar.getSymbol(), xVar.getInstrumentName());
        }
        if (h0Var instanceof w3f.l) {
            String id15 = h0Var.getId();
            String compoundId6 = h0Var.getCompoundId();
            String ref7 = h0Var.getRef();
            String holdingId6 = h0Var.getHoldingId();
            q0 q0VarA6 = c.a(h0Var.getState());
            Long completedAt6 = h0Var.getCompletedAt();
            long createdAt6 = h0Var.getCreatedAt();
            Long updatedAt6 = h0Var.getUpdatedAt();
            dfl.q qVarU8 = md6.s.u(h0Var.getValue());
            Long settlementDate6 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli6 = settlementDate6 != null ? Instant.ofEpochMilli(settlementDate6.longValue()) : null;
            String forMonth = ((w3f.l) h0Var).getForMonth();
            YearMonth yearMonth = forMonth != null ? YearMonth.parse(forMonth) : null;
            String standingOrderId6 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ6 = edl.a.q(h0Var);
            String portfolioId6 = h0Var.getPortfolioId();
            j0 baseInstrument6 = h0Var.getBaseInstrument();
            p0 p0VarK11 = baseInstrument6 != null ? k(baseInstrument6) : null;
            j0 counterInstrument6 = h0Var.getCounterInstrument();
            p0 p0VarK12 = counterInstrument6 != null ? k(counterInstrument6) : null;
            String badge6 = h0Var.getBadge();
            return new h(id15, compoundId6, ref7, holdingId6, q0VarA6, createdAt6, updatedAt6, completedAt6, qVarU8, instantOfEpochMilli6, standingOrderId6, wealthAccountTypeQ6, portfolioId6, p0VarK11, p0VarK12, badge6 != null ? yh5.b.U(badge6) : null, o0Var, e(h0Var), yearMonth);
        }
        if (h0Var instanceof w3f.z) {
            String id16 = h0Var.getId();
            String compoundId7 = h0Var.getCompoundId();
            String ref8 = h0Var.getRef();
            String holdingId7 = h0Var.getHoldingId();
            q0 q0VarA7 = c.a(h0Var.getState());
            Long completedAt7 = h0Var.getCompletedAt();
            long createdAt7 = h0Var.getCreatedAt();
            Long updatedAt7 = h0Var.getUpdatedAt();
            dfl.q qVarU9 = md6.s.u(h0Var.getValue());
            Long settlementDate7 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli7 = settlementDate7 != null ? Instant.ofEpochMilli(settlementDate7.longValue()) : null;
            String standingOrderId7 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ7 = edl.a.q(h0Var);
            String portfolioId7 = h0Var.getPortfolioId();
            j0 baseInstrument7 = h0Var.getBaseInstrument();
            p0 p0VarK13 = baseInstrument7 != null ? k(baseInstrument7) : null;
            j0 counterInstrument7 = h0Var.getCounterInstrument();
            p0 p0VarK14 = counterInstrument7 != null ? k(counterInstrument7) : null;
            String badge7 = h0Var.getBadge();
            return new b0(id16, compoundId7, ref8, holdingId7, q0VarA7, createdAt7, updatedAt7, completedAt7, qVarU9, instantOfEpochMilli7, standingOrderId7, wealthAccountTypeQ7, portfolioId7, p0VarK13, p0VarK14, badge7 != null ? yh5.b.U(badge7) : null, o0Var, e(h0Var));
        }
        if (h0Var instanceof w3f.e0) {
            String id17 = h0Var.getId();
            String compoundId8 = h0Var.getCompoundId();
            String ref9 = h0Var.getRef();
            String holdingId8 = h0Var.getHoldingId();
            q0 q0VarA8 = c.a(h0Var.getState());
            Long completedAt8 = h0Var.getCompletedAt();
            long createdAt8 = h0Var.getCreatedAt();
            Long updatedAt8 = h0Var.getUpdatedAt();
            dfl.q qVarU10 = md6.s.u(h0Var.getValue());
            Long settlementDate8 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli8 = settlementDate8 != null ? Instant.ofEpochMilli(settlementDate8.longValue()) : null;
            String standingOrderId8 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ8 = edl.a.q(h0Var);
            String portfolioId8 = h0Var.getPortfolioId();
            j0 baseInstrument8 = h0Var.getBaseInstrument();
            p0 p0VarK15 = baseInstrument8 != null ? k(baseInstrument8) : null;
            j0 counterInstrument8 = h0Var.getCounterInstrument();
            p0 p0VarK16 = counterInstrument8 != null ? k(counterInstrument8) : null;
            String badge8 = h0Var.getBadge();
            dfl.j0 j0VarU5 = badge8 != null ? yh5.b.U(badge8) : null;
            w3f.l0 transferRequestDetails = ((w3f.e0) h0Var).getTransferRequestDetails();
            return new g0(id17, compoundId8, ref9, holdingId8, q0VarA8, createdAt8, updatedAt8, completedAt8, qVarU10, instantOfEpochMilli8, standingOrderId8, wealthAccountTypeQ8, portfolioId8, p0VarK15, p0VarK16, j0VarU5, o0Var, e(h0Var), transferRequestDetails != null ? e.b(transferRequestDetails) : null);
        }
        if (h0Var instanceof w3f.g) {
            String id18 = h0Var.getId();
            String compoundId9 = h0Var.getCompoundId();
            String ref10 = h0Var.getRef();
            String holdingId9 = h0Var.getHoldingId();
            q0 q0VarA9 = c.a(h0Var.getState());
            Long completedAt9 = h0Var.getCompletedAt();
            long createdAt9 = h0Var.getCreatedAt();
            Long updatedAt9 = h0Var.getUpdatedAt();
            dfl.q qVarU11 = md6.s.u(h0Var.getValue());
            Long settlementDate9 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli9 = settlementDate9 != null ? Instant.ofEpochMilli(settlementDate9.longValue()) : null;
            String standingOrderId9 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ9 = edl.a.q(h0Var);
            String portfolioId9 = h0Var.getPortfolioId();
            j0 baseInstrument9 = h0Var.getBaseInstrument();
            p0 p0VarK17 = baseInstrument9 != null ? k(baseInstrument9) : null;
            j0 counterInstrument9 = h0Var.getCounterInstrument();
            p0 p0VarK18 = counterInstrument9 != null ? k(counterInstrument9) : null;
            String badge9 = h0Var.getBadge();
            return new dfl.d(id18, compoundId9, ref10, holdingId9, q0VarA9, createdAt9, updatedAt9, completedAt9, qVarU11, instantOfEpochMilli9, standingOrderId9, wealthAccountTypeQ9, portfolioId9, p0VarK17, p0VarK18, badge9 != null ? yh5.b.U(badge9) : null, o0Var, e(h0Var));
        }
        if (h0Var instanceof w3f.y) {
            String id19 = h0Var.getId();
            String compoundId10 = h0Var.getCompoundId();
            String ref11 = h0Var.getRef();
            String holdingId10 = h0Var.getHoldingId();
            q0 q0VarA10 = c.a(h0Var.getState());
            Long completedAt10 = h0Var.getCompletedAt();
            long createdAt10 = h0Var.getCreatedAt();
            Long updatedAt10 = h0Var.getUpdatedAt();
            dfl.q qVarU12 = md6.s.u(h0Var.getValue());
            Long settlementDate10 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli10 = settlementDate10 != null ? Instant.ofEpochMilli(settlementDate10.longValue()) : null;
            String standingOrderId10 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ10 = edl.a.q(h0Var);
            String portfolioId10 = h0Var.getPortfolioId();
            j0 baseInstrument10 = h0Var.getBaseInstrument();
            p0 p0VarK19 = baseInstrument10 != null ? k(baseInstrument10) : null;
            j0 counterInstrument10 = h0Var.getCounterInstrument();
            p0 p0VarK20 = counterInstrument10 != null ? k(counterInstrument10) : null;
            String badge10 = h0Var.getBadge();
            dfl.j0 j0VarU6 = badge10 != null ? yh5.b.U(badge10) : null;
            w3f.y yVar2 = (w3f.y) h0Var;
            String refundType = yVar2.getRefundType();
            if (refundType != null) {
                dfl.a0[] a0VarArrValues = dfl.a0.values();
                int length = a0VarArrValues.length;
                instant = instantOfEpochMilli10;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        yVar = yVar2;
                        a0Var = null;
                        break;
                    }
                    dfl.a0 a0Var2 = a0VarArrValues[i];
                    int i2 = i;
                    yVar = yVar2;
                    if (a0.z(a0Var2.name(), refundType, true)) {
                        a0Var = a0Var2;
                        break;
                    }
                    i = i2 + 1;
                    yVar2 = yVar;
                }
                if (a0Var == null) {
                }
                w3f.y yVar3 = yVar;
                return new z(id19, compoundId10, ref11, holdingId10, q0VarA10, createdAt10, updatedAt10, completedAt10, qVarU12, instant, standingOrderId10, wealthAccountTypeQ10, portfolioId10, p0VarK19, p0VarK20, j0VarU6, o0Var, e(h0Var), a0Var, yVar.getDescription(), yVar3.getStartedAt(), yVar3.getAutoTopup(), yVar3.getSpareChange());
            }
            instant = instantOfEpochMilli10;
            yVar = yVar2;
            a0Var = dfl.a0.UNKNOWN;
            w3f.y yVar32 = yVar;
            return new z(id19, compoundId10, ref11, holdingId10, q0VarA10, createdAt10, updatedAt10, completedAt10, qVarU12, instant, standingOrderId10, wealthAccountTypeQ10, portfolioId10, p0VarK19, p0VarK20, j0VarU6, o0Var, e(h0Var), a0Var, yVar.getDescription(), yVar32.getStartedAt(), yVar32.getAutoTopup(), yVar32.getSpareChange());
        }
        if (h0Var instanceof w3f.s) {
            String id20 = h0Var.getId();
            String compoundId11 = h0Var.getCompoundId();
            String ref12 = h0Var.getRef();
            String holdingId11 = h0Var.getHoldingId();
            q0 q0VarA11 = c.a(h0Var.getState());
            Long completedAt11 = h0Var.getCompletedAt();
            long createdAt11 = h0Var.getCreatedAt();
            Long updatedAt11 = h0Var.getUpdatedAt();
            dfl.q qVarU13 = md6.s.u(h0Var.getValue());
            Long settlementDate11 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli11 = settlementDate11 != null ? Instant.ofEpochMilli(settlementDate11.longValue()) : null;
            String standingOrderId11 = h0Var.getStandingOrderId();
            w3f.s sVar = (w3f.s) h0Var;
            bfl.g gVarC3 = f4l.a.c(sVar.getSide());
            ko3.a aVarU = sVar.getExecutedPrice();
            ej0.b bVarQ = aVarU != null ? cj9.c.Q(aVarU) : null;
            String strV = sVar.getExecutedQuantity();
            BigDecimal bigDecimal3 = strV != null ? new BigDecimal(strV) : null;
            w3f.g0 g0VarS = sVar.getCommission();
            k0 k0VarJ2 = g0VarS != null ? mif.a.J(g0VarS) : null;
            String strA = sVar.getSymbol();
            BigDecimal bigDecimal4 = new BigDecimal(sVar.getLeverage());
            dj0.d dVarO8 = mo3.a.o(sVar.getExposure());
            WealthAccountType wealthAccountTypeQ11 = edl.a.q(h0Var);
            String portfolioId11 = h0Var.getPortfolioId();
            j0 baseInstrument11 = h0Var.getBaseInstrument();
            p0 p0VarK21 = baseInstrument11 != null ? k(baseInstrument11) : null;
            j0 counterInstrument11 = h0Var.getCounterInstrument();
            p0 p0VarK22 = counterInstrument11 != null ? k(counterInstrument11) : null;
            String badge11 = h0Var.getBadge();
            return new dfl.s(id20, compoundId11, ref12, holdingId11, q0VarA11, createdAt11, updatedAt11, completedAt11, qVarU13, instantOfEpochMilli11, standingOrderId11, wealthAccountTypeQ11, portfolioId11, p0VarK21, p0VarK22, badge11 != null ? yh5.b.U(badge11) : null, o0Var, e(h0Var), strA, gVarC3, bVarQ, bigDecimal3, k0VarJ2, bigDecimal4, dVarO8, sVar.getConfirmed(), pd.b.j(sVar.getLiquidation()));
        }
        if (h0Var instanceof w3f.u) {
            String id21 = h0Var.getId();
            String compoundId12 = h0Var.getCompoundId();
            String ref13 = h0Var.getRef();
            String holdingId12 = h0Var.getHoldingId();
            q0 q0VarA12 = c.a(h0Var.getState());
            Long completedAt12 = h0Var.getCompletedAt();
            long createdAt12 = h0Var.getCreatedAt();
            Long updatedAt12 = h0Var.getUpdatedAt();
            dfl.q qVarU14 = md6.s.u(h0Var.getValue());
            Long settlementDate12 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli12 = settlementDate12 != null ? Instant.ofEpochMilli(settlementDate12.longValue()) : null;
            String standingOrderId12 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ12 = edl.a.q(h0Var);
            String portfolioId12 = h0Var.getPortfolioId();
            j0 baseInstrument12 = h0Var.getBaseInstrument();
            p0 p0VarK23 = baseInstrument12 != null ? k(baseInstrument12) : null;
            j0 counterInstrument12 = h0Var.getCounterInstrument();
            p0 p0VarK24 = counterInstrument12 != null ? k(counterInstrument12) : null;
            String badge12 = h0Var.getBadge();
            dfl.j0 j0VarU7 = badge12 != null ? yh5.b.U(badge12) : null;
            List listS = ((w3f.u) h0Var).getBreakdown();
            if (listS != null) {
                List list4 = listS;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    u.a aVar10 = (u.a) it9.next();
                    arrayList3.add(new dfl.u(mo3.a.o(aVar10.getValue()), aVar10.getRef(), aVar10.getSymbol()));
                    it9 = it9;
                    instantOfEpochMilli12 = instantOfEpochMilli12;
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            return new v(id21, compoundId12, ref13, holdingId12, q0VarA12, createdAt12, updatedAt12, completedAt12, qVarU14, instantOfEpochMilli12, standingOrderId12, wealthAccountTypeQ12, portfolioId12, p0VarK23, p0VarK24, j0VarU7, o0Var, e(h0Var), arrayList);
        }
        if (h0Var instanceof w3f.v) {
            String id22 = h0Var.getId();
            String compoundId13 = h0Var.getCompoundId();
            String ref14 = h0Var.getRef();
            String holdingId13 = h0Var.getHoldingId();
            q0 q0VarA13 = c.a(h0Var.getState());
            Long completedAt13 = h0Var.getCompletedAt();
            long createdAt13 = h0Var.getCreatedAt();
            Long updatedAt13 = h0Var.getUpdatedAt();
            dfl.q qVarU15 = md6.s.u(h0Var.getValue());
            Long settlementDate13 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli13 = settlementDate13 != null ? Instant.ofEpochMilli(settlementDate13.longValue()) : null;
            String standingOrderId13 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ13 = edl.a.q(h0Var);
            String portfolioId13 = h0Var.getPortfolioId();
            j0 baseInstrument13 = h0Var.getBaseInstrument();
            p0 p0VarK25 = baseInstrument13 != null ? k(baseInstrument13) : null;
            j0 counterInstrument13 = h0Var.getCounterInstrument();
            p0 p0VarK26 = counterInstrument13 != null ? k(counterInstrument13) : null;
            String badge13 = h0Var.getBadge();
            return new w(id22, compoundId13, ref14, holdingId13, q0VarA13, createdAt13, updatedAt13, completedAt13, qVarU15, instantOfEpochMilli13, standingOrderId13, wealthAccountTypeQ13, portfolioId13, p0VarK25, p0VarK26, badge13 != null ? yh5.b.U(badge13) : null, o0Var, e(h0Var), ((w3f.v) h0Var).getSymbol());
        }
        if (h0Var instanceof w3f.h) {
            String id23 = h0Var.getId();
            String compoundId14 = h0Var.getCompoundId();
            if (compoundId14 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String ref15 = h0Var.getRef();
            String holdingId14 = h0Var.getHoldingId();
            q0 q0VarA14 = c.a(h0Var.getState());
            long createdAt14 = h0Var.getCreatedAt();
            Long updatedAt14 = h0Var.getUpdatedAt();
            Long completedAt14 = h0Var.getCompletedAt();
            dfl.q qVarU16 = md6.s.u(h0Var.getValue());
            Long settlementDate14 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli14 = settlementDate14 != null ? Instant.ofEpochMilli(settlementDate14.longValue()) : null;
            String standingOrderId14 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ14 = edl.a.q(h0Var);
            String portfolioId14 = h0Var.getPortfolioId();
            j0 baseInstrument14 = h0Var.getBaseInstrument();
            p0 p0VarK27 = baseInstrument14 != null ? k(baseInstrument14) : null;
            j0 counterInstrument14 = h0Var.getCounterInstrument();
            p0 p0VarK28 = counterInstrument14 != null ? k(counterInstrument14) : null;
            String badge14 = h0Var.getBadge();
            dfl.j0 j0VarU8 = badge14 != null ? yh5.b.U(badge14) : null;
            w3f.h hVar = (w3f.h) h0Var;
            bfl.g gVarC4 = f4l.a.c(hVar.getSide());
            Pair pairH = cp5.d.H(hVar.getCurrencyPair());
            dj0.d dVarO9 = mo3.a.o(hVar.getNet());
            dj0.d dVarO10 = mo3.a.o(hVar.getTotal());
            r tradedValue = hVar.getTradedValue();
            return new dfl.e(id23, compoundId14, ref15, holdingId14, q0VarA14, createdAt14, updatedAt14, completedAt14, qVarU16, instantOfEpochMilli14, standingOrderId14, wealthAccountTypeQ14, portfolioId14, p0VarK27, p0VarK28, j0VarU8, o0Var, e(h0Var), gVarC4, pairH, dVarO9, dVarO10, tradedValue != null ? md6.s.u(tradedValue) : null, mo3.a.o(hVar.getPrice()), hVar.getPocketId(), hVar.getClientOrderId(), hVar.getStanding());
        }
        if (h0Var instanceof o) {
            String id24 = h0Var.getId();
            String compoundId15 = h0Var.getCompoundId();
            if (compoundId15 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String ref16 = h0Var.getRef();
            String holdingId15 = h0Var.getHoldingId();
            q0 q0VarA15 = c.a(h0Var.getState());
            long createdAt15 = h0Var.getCreatedAt();
            Long updatedAt15 = h0Var.getUpdatedAt();
            Long completedAt15 = h0Var.getCompletedAt();
            dfl.q qVarU17 = md6.s.u(h0Var.getValue());
            Long settlementDate15 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli15 = settlementDate15 != null ? Instant.ofEpochMilli(settlementDate15.longValue()) : null;
            String standingOrderId15 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ15 = edl.a.q(h0Var);
            String portfolioId15 = h0Var.getPortfolioId();
            j0 baseInstrument15 = h0Var.getBaseInstrument();
            p0 p0VarK29 = baseInstrument15 != null ? k(baseInstrument15) : null;
            j0 counterInstrument15 = h0Var.getCounterInstrument();
            p0 p0VarK30 = counterInstrument15 != null ? k(counterInstrument15) : null;
            String badge15 = h0Var.getBadge();
            dfl.j0 j0VarU9 = badge15 != null ? yh5.b.U(badge15) : null;
            o oVar = (o) h0Var;
            dfl.q qVarU18 = md6.s.u(oVar.getExchangedValue());
            Intrinsics.checkNotNullParameter(qVarU18, "<this>");
            return new k(id24, compoundId15, ref16, holdingId15, q0VarA15, createdAt15, updatedAt15, completedAt15, qVarU17, instantOfEpochMilli15, standingOrderId15, wealthAccountTypeQ15, portfolioId15, p0VarK29, p0VarK30, j0VarU9, o0Var, e(h0Var), (dfl.a) qVarU18, new BigDecimal(oVar.getRate()), mo3.a.o(oVar.getFees()));
        }
        if (h0Var instanceof w3f.f0) {
            String id25 = h0Var.getId();
            String compoundId16 = h0Var.getCompoundId();
            String ref17 = h0Var.getRef();
            String holdingId16 = h0Var.getHoldingId();
            q0 q0VarA16 = c.a(h0Var.getState());
            long createdAt16 = h0Var.getCreatedAt();
            Long updatedAt16 = h0Var.getUpdatedAt();
            Long completedAt16 = h0Var.getCompletedAt();
            dfl.q qVarU19 = md6.s.u(h0Var.getValue());
            Long settlementDate16 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli16 = settlementDate16 != null ? Instant.ofEpochMilli(settlementDate16.longValue()) : null;
            String standingOrderId16 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ16 = edl.a.q(h0Var);
            String portfolioId16 = h0Var.getPortfolioId();
            j0 baseInstrument16 = h0Var.getBaseInstrument();
            p0 p0VarK31 = baseInstrument16 != null ? k(baseInstrument16) : null;
            j0 counterInstrument16 = h0Var.getCounterInstrument();
            p0 p0VarK32 = counterInstrument16 != null ? k(counterInstrument16) : null;
            String badge16 = h0Var.getBadge();
            dfl.j0 j0VarU10 = badge16 != null ? yh5.b.U(badge16) : null;
            w3f.f0 f0Var = (w3f.f0) h0Var;
            w3f.l0 transferRequestDetails2 = f0Var.getTransferRequestDetails();
            return new h0(id25, compoundId16, ref17, holdingId16, q0VarA16, createdAt16, updatedAt16, completedAt16, qVarU19, instantOfEpochMilli16, standingOrderId16, wealthAccountTypeQ16, portfolioId16, p0VarK31, p0VarK32, j0VarU10, o0Var, e(h0Var), f4l.a.c(f0Var.getSide()), f0Var.getSymbol(), new BigDecimal(f0Var.getExecutedQuantity()), transferRequestDetails2 != null ? e.b(transferRequestDetails2) : null);
        }
        if (h0Var instanceof f) {
            String id26 = h0Var.getId();
            String compoundId17 = h0Var.getCompoundId();
            String ref18 = h0Var.getRef();
            String holdingId17 = h0Var.getHoldingId();
            q0 q0VarA17 = c.a(h0Var.getState());
            Long completedAt17 = h0Var.getCompletedAt();
            long createdAt17 = h0Var.getCreatedAt();
            Long updatedAt17 = h0Var.getUpdatedAt();
            dfl.q qVarU20 = md6.s.u(h0Var.getValue());
            Long settlementDate17 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli17 = settlementDate17 != null ? Instant.ofEpochMilli(settlementDate17.longValue()) : null;
            String standingOrderId17 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ17 = edl.a.q(h0Var);
            String portfolioId17 = h0Var.getPortfolioId();
            j0 baseInstrument17 = h0Var.getBaseInstrument();
            p0 p0VarK33 = baseInstrument17 != null ? k(baseInstrument17) : null;
            j0 counterInstrument17 = h0Var.getCounterInstrument();
            p0 p0VarK34 = counterInstrument17 != null ? k(counterInstrument17) : null;
            String badge17 = h0Var.getBadge();
            dfl.j0 j0VarU11 = badge17 != null ? yh5.b.U(badge17) : null;
            f fVar = (f) h0Var;
            return new dfl.c(id26, compoundId17, ref18, holdingId17, q0VarA17, createdAt17, updatedAt17, completedAt17, qVarU20, instantOfEpochMilli17, standingOrderId17, wealthAccountTypeQ17, portfolioId17, p0VarK33, p0VarK34, j0VarU11, o0Var, e(h0Var), f4l.a.c(fVar.getSide()), e.b(fVar.getTransferRequestDetails()));
        }
        if (h0Var instanceof p) {
            String id27 = h0Var.getId();
            String compoundId18 = h0Var.getCompoundId();
            String ref19 = h0Var.getRef();
            String holdingId18 = h0Var.getHoldingId();
            q0 q0VarA18 = c.a(h0Var.getState());
            long createdAt18 = h0Var.getCreatedAt();
            Long updatedAt18 = h0Var.getUpdatedAt();
            Long completedAt18 = h0Var.getCompletedAt();
            dfl.q qVarU21 = md6.s.u(h0Var.getValue());
            Long settlementDate18 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli18 = settlementDate18 != null ? Instant.ofEpochMilli(settlementDate18.longValue()) : null;
            String standingOrderId18 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ18 = edl.a.q(h0Var);
            String portfolioId18 = h0Var.getPortfolioId();
            j0 baseInstrument18 = h0Var.getBaseInstrument();
            p0 p0VarK35 = baseInstrument18 != null ? k(baseInstrument18) : null;
            j0 counterInstrument18 = h0Var.getCounterInstrument();
            p0 p0VarK36 = counterInstrument18 != null ? k(counterInstrument18) : null;
            String badge18 = h0Var.getBadge();
            dfl.j0 j0VarU12 = badge18 != null ? yh5.b.U(badge18) : null;
            p pVar = (p) h0Var;
            FeeType feeType = pVar.getFeeType();
            if (feeType == null) {
                throw new IllegalStateException("Fee type is required");
            }
            String transactionId = pVar.getTransactionId();
            String assetType = pVar.getAssetType();
            Long startedAt = pVar.getStartedAt();
            boolean autoTopup = pVar.getAutoTopup();
            String description = pVar.getDescription();
            boolean spareChange = pVar.getSpareChange();
            r exchangedValue2 = pVar.getExchangedValue();
            if (exchangedValue2 != null) {
                dfl.q qVarU22 = md6.s.u(exchangedValue2);
                Intrinsics.checkNotNullParameter(qVarU22, "<this>");
                aVar3 = (dfl.a) qVarU22;
            } else {
                aVar3 = null;
            }
            BigDecimal bigDecimal5 = pVar.getRate() != null ? new BigDecimal(pVar.getRate()) : null;
            String forMonth2 = pVar.getForMonth();
            return new l(id27, compoundId18, ref19, holdingId18, q0VarA18, createdAt18, updatedAt18, completedAt18, qVarU21, instantOfEpochMilli18, standingOrderId18, wealthAccountTypeQ18, portfolioId18, p0VarK35, p0VarK36, j0VarU12, o0Var, e(h0Var), aVar3, feeType, transactionId, assetType, startedAt, autoTopup, description, spareChange, bigDecimal5, forMonth2 != null ? java.time.YearMonth.parse(forMonth2) : null);
        }
        if (h0Var instanceof w3f.m) {
            String id28 = h0Var.getId();
            String compoundId19 = h0Var.getCompoundId();
            String ref20 = h0Var.getRef();
            String holdingId19 = h0Var.getHoldingId();
            q0 q0VarA19 = c.a(h0Var.getState());
            Long completedAt19 = h0Var.getCompletedAt();
            long createdAt19 = h0Var.getCreatedAt();
            Long updatedAt19 = h0Var.getUpdatedAt();
            dfl.q qVarU23 = md6.s.u(h0Var.getValue());
            Long settlementDate19 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli19 = settlementDate19 != null ? Instant.ofEpochMilli(settlementDate19.longValue()) : null;
            String standingOrderId19 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ19 = edl.a.q(h0Var);
            String portfolioId19 = h0Var.getPortfolioId();
            j0 baseInstrument19 = h0Var.getBaseInstrument();
            p0 p0VarK37 = baseInstrument19 != null ? k(baseInstrument19) : null;
            j0 counterInstrument19 = h0Var.getCounterInstrument();
            p0 p0VarK38 = counterInstrument19 != null ? k(counterInstrument19) : null;
            String badge19 = h0Var.getBadge();
            return new i(id28, compoundId19, ref20, holdingId19, q0VarA19, createdAt19, updatedAt19, completedAt19, qVarU23, instantOfEpochMilli19, standingOrderId19, wealthAccountTypeQ19, portfolioId19, p0VarK37, p0VarK38, badge19 != null ? yh5.b.U(badge19) : null, o0Var, e(h0Var));
        }
        if (h0Var instanceof w3f.t) {
            String id29 = h0Var.getId();
            String compoundId20 = h0Var.getCompoundId();
            String ref21 = h0Var.getRef();
            String holdingId20 = h0Var.getHoldingId();
            q0 q0VarA20 = c.a(h0Var.getState());
            Long completedAt20 = h0Var.getCompletedAt();
            long createdAt20 = h0Var.getCreatedAt();
            Long updatedAt20 = h0Var.getUpdatedAt();
            dfl.q qVarU24 = md6.s.u(h0Var.getValue());
            Long settlementDate20 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli20 = settlementDate20 != null ? Instant.ofEpochMilli(settlementDate20.longValue()) : null;
            String standingOrderId20 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ20 = edl.a.q(h0Var);
            String portfolioId20 = h0Var.getPortfolioId();
            j0 baseInstrument20 = h0Var.getBaseInstrument();
            p0 p0VarK39 = baseInstrument20 != null ? k(baseInstrument20) : null;
            j0 counterInstrument20 = h0Var.getCounterInstrument();
            p0 p0VarK40 = counterInstrument20 != null ? k(counterInstrument20) : null;
            String badge20 = h0Var.getBadge();
            dfl.j0 j0VarU13 = badge20 != null ? yh5.b.U(badge20) : null;
            w3f.t tVar = (w3f.t) h0Var;
            return new t(id29, compoundId20, ref21, holdingId20, q0VarA20, createdAt20, updatedAt20, completedAt20, qVarU24, instantOfEpochMilli20, standingOrderId20, wealthAccountTypeQ20, portfolioId20, p0VarK39, p0VarK40, j0VarU13, o0Var, e(h0Var), tVar.getClientOrderId(), tVar.getStartedAt(), tVar.getSymbol(), tVar.getAllLinkedSymbols(), tVar.getEventId());
        }
        if (h0Var instanceof w3f.a0) {
            String id30 = h0Var.getId();
            String compoundId21 = h0Var.getCompoundId();
            String ref22 = h0Var.getRef();
            String holdingId21 = h0Var.getHoldingId();
            q0 q0VarA21 = c.a(h0Var.getState());
            Long completedAt21 = h0Var.getCompletedAt();
            long createdAt21 = h0Var.getCreatedAt();
            Long updatedAt21 = h0Var.getUpdatedAt();
            dfl.q qVarU25 = md6.s.u(h0Var.getValue());
            Long settlementDate21 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli21 = settlementDate21 != null ? Instant.ofEpochMilli(settlementDate21.longValue()) : null;
            String standingOrderId21 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ21 = edl.a.q(h0Var);
            String portfolioId21 = h0Var.getPortfolioId();
            j0 baseInstrument21 = h0Var.getBaseInstrument();
            p0 p0VarK41 = baseInstrument21 != null ? k(baseInstrument21) : null;
            j0 counterInstrument21 = h0Var.getCounterInstrument();
            p0 p0VarK42 = counterInstrument21 != null ? k(counterInstrument21) : null;
            String badge21 = h0Var.getBadge();
            dfl.j0 j0VarU14 = badge21 != null ? yh5.b.U(badge21) : null;
            w3f.a0 a0Var3 = (w3f.a0) h0Var;
            return new dfl.c0(id30, compoundId21, ref22, holdingId21, q0VarA21, createdAt21, updatedAt21, completedAt21, qVarU25, instantOfEpochMilli21, standingOrderId21, wealthAccountTypeQ21, portfolioId21, p0VarK41, p0VarK42, j0VarU14, o0Var, e(h0Var), a0Var3.getClientOrderId(), a0Var3.getStartedAt(), a0Var3.getSymbol(), a0Var3.getAllLinkedSymbols(), a0Var3.getEventId());
        }
        if (h0Var instanceof w3f.c0) {
            String id31 = h0Var.getId();
            String compoundId22 = h0Var.getCompoundId();
            String ref23 = h0Var.getRef();
            String holdingId22 = h0Var.getHoldingId();
            q0 q0VarA22 = c.a(h0Var.getState());
            Long completedAt22 = h0Var.getCompletedAt();
            long createdAt22 = h0Var.getCreatedAt();
            Long updatedAt22 = h0Var.getUpdatedAt();
            dfl.q qVarU26 = md6.s.u(h0Var.getValue());
            Long settlementDate22 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli22 = settlementDate22 != null ? Instant.ofEpochMilli(settlementDate22.longValue()) : null;
            String standingOrderId22 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ22 = edl.a.q(h0Var);
            String portfolioId22 = h0Var.getPortfolioId();
            j0 baseInstrument22 = h0Var.getBaseInstrument();
            p0 p0VarK43 = baseInstrument22 != null ? k(baseInstrument22) : null;
            j0 counterInstrument22 = h0Var.getCounterInstrument();
            p0 p0VarK44 = counterInstrument22 != null ? k(counterInstrument22) : null;
            String badge22 = h0Var.getBadge();
            dfl.j0 j0VarU15 = badge22 != null ? yh5.b.U(badge22) : null;
            w3f.c0 c0Var = (w3f.c0) h0Var;
            return new e0(id31, compoundId22, ref23, holdingId22, q0VarA22, createdAt22, updatedAt22, completedAt22, qVarU26, instantOfEpochMilli22, standingOrderId22, wealthAccountTypeQ22, portfolioId22, p0VarK43, p0VarK44, j0VarU15, o0Var, e(h0Var), c0Var.getClientOrderId(), c0Var.getStartedAt(), c0Var.getSymbol(), c0Var.getEventId());
        }
        if (!(h0Var instanceof x3f.a)) {
            if (!(h0Var instanceof w3f.b0)) {
                throw new IllegalStateException();
            }
            String id32 = h0Var.getId();
            String compoundId23 = h0Var.getCompoundId();
            String ref24 = h0Var.getRef();
            String holdingId23 = h0Var.getHoldingId();
            q0 q0VarA23 = c.a(h0Var.getState());
            long createdAt23 = h0Var.getCreatedAt();
            Long updatedAt23 = h0Var.getUpdatedAt();
            Long completedAt23 = h0Var.getCompletedAt();
            dfl.q qVarU27 = md6.s.u(h0Var.getValue());
            Long settlementDate23 = h0Var.getSettlementDate();
            Instant instantOfEpochMilli23 = settlementDate23 != null ? Instant.ofEpochMilli(settlementDate23.longValue()) : null;
            String standingOrderId23 = h0Var.getStandingOrderId();
            WealthAccountType wealthAccountTypeQ23 = edl.a.q(h0Var);
            String portfolioId23 = h0Var.getPortfolioId();
            j0 baseInstrument23 = h0Var.getBaseInstrument();
            p0 p0VarK45 = baseInstrument23 != null ? k(baseInstrument23) : null;
            j0 counterInstrument23 = h0Var.getCounterInstrument();
            p0 p0VarK46 = counterInstrument23 != null ? k(counterInstrument23) : null;
            String badge23 = h0Var.getBadge();
            return new dfl.d0(id32, compoundId23, ref24, holdingId23, q0VarA23, createdAt23, updatedAt23, completedAt23, qVarU27, instantOfEpochMilli23, standingOrderId23, wealthAccountTypeQ23, portfolioId23, p0VarK45, p0VarK46, badge23 != null ? yh5.b.U(badge23) : null, o0Var, e(h0Var));
        }
        String id33 = h0Var.getId();
        String compoundId24 = h0Var.getCompoundId();
        String ref25 = h0Var.getRef();
        String holdingId24 = h0Var.getHoldingId();
        q0 q0VarA24 = c.a(h0Var.getState());
        Long completedAt24 = h0Var.getCompletedAt();
        long createdAt24 = h0Var.getCreatedAt();
        Long updatedAt24 = h0Var.getUpdatedAt();
        dfl.q qVarU28 = md6.s.u(h0Var.getValue());
        x3f.a aVar11 = (x3f.a) h0Var;
        jo3.a aVarZ = aVar11.getExecutedPrice();
        dj0.d dVarO11 = aVarZ != null ? mo3.a.o(aVarZ) : null;
        bfl.g gVarC5 = f4l.a.c(aVar11.getSide());
        String strB2 = aVar11.getExternalId();
        List listC = aVar11.getFees();
        if (listC != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it10 = listC.iterator();
            while (it10.hasNext()) {
                x3f.a aVar12 = aVar11;
                l0 l0VarB2 = a.b((w3f.i0) it10.next());
                if (l0VarB2 != null) {
                    arrayList4.add(l0VarB2);
                }
                aVar11 = aVar12;
            }
            aVar = aVar11;
            list = arrayList4;
        } else {
            aVar = aVar11;
            list = zhm.f0.f322471a;
        }
        List list5 = list;
        jo3.a aVarD = aVar.getGross();
        dj0.d dVarO12 = aVarD != null ? mo3.a.o(aVarD) : null;
        jo3.a aVarG = aVar.getNet();
        dj0.d dVarO13 = aVarG != null ? mo3.a.o(aVarG) : null;
        boolean zV2 = aVar.getConfirmed();
        String strW = aVar.getEstimatedQuantity();
        BigDecimal bigDecimal6 = strW != null ? new BigDecimal(strW) : null;
        jo3.a aVarX = aVar.getEstimatedTotal();
        dj0.d dVarO14 = aVarX != null ? mo3.a.o(aVarX) : null;
        String strA2 = aVar.getExecutedQuantity();
        BigDecimal bigDecimal7 = strA2 != null ? new BigDecimal(strA2) : null;
        w3f.g0 g0VarU2 = aVar.getCommission();
        k0 k0VarJ3 = g0VarU2 != null ? mif.a.J(g0VarU2) : null;
        String strJ = aVar.getSymbol();
        String strE = aVar.getInstrumentName();
        if (strE == null) {
            m70.a.c(t0.f186434a);
            str = "";
        } else {
            str = strE;
        }
        String strF2 = aVar.getInstrumentType();
        if (strF2 == null || (zVarA = tbl.a.a(strF2)) == null) {
            zVarA = nel.z.UNSPECIFIED;
        }
        nel.z zVar3 = zVarA;
        Long settlementDate24 = h0Var.getSettlementDate();
        Instant instantOfEpochMilli24 = settlementDate24 != null ? Instant.ofEpochMilli(settlementDate24.longValue()) : null;
        String standingOrderId24 = h0Var.getStandingOrderId();
        String strT2 = aVar.getClientOrderId();
        x3f.a aVar13 = aVar;
        WealthAccountType wealthAccountTypeQ24 = edl.a.q(h0Var);
        String portfolioId24 = h0Var.getPortfolioId();
        j0 baseInstrument24 = h0Var.getBaseInstrument();
        p0 p0VarK47 = baseInstrument24 != null ? k(baseInstrument24) : null;
        j0 counterInstrument24 = h0Var.getCounterInstrument();
        p0 p0VarK48 = counterInstrument24 != null ? k(counterInstrument24) : null;
        String badge24 = h0Var.getBadge();
        dfl.j0 j0VarU16 = badge24 != null ? yh5.b.U(badge24) : null;
        r rVarY = aVar13.getExchangedValue();
        if (rVarY != null) {
            dfl.q qVarU29 = md6.s.u(rVarY);
            Intrinsics.checkNotNullParameter(qVarU29, "<this>");
            aVar2 = (dfl.a) qVarU29;
        } else {
            aVar2 = null;
        }
        return new m(id33, compoundId24, ref25, holdingId24, q0VarA24, createdAt24, updatedAt24, completedAt24, qVarU28, instantOfEpochMilli24, standingOrderId24, wealthAccountTypeQ24, portfolioId24, p0VarK47, p0VarK48, j0VarU16, o0Var, e(h0Var), strJ, str, zVar3, gVarC5, dVarO11, k0VarJ3, list5, dVarO12, dVarO13, strB2, bigDecimal6, bigDecimal7, dVarO14, zV2, strT2, aVar13.getStanding(), aVar2, aVar13.getAwaitingSettlement());
    }

    public static final o0 j(n3f.n nVar) {
        return new o0(nVar.getId(), nVar.getName(), nVar.getFirstName(), nVar.getLastName(), nVar.getCode(), c(nVar.getFirstName(), nVar.getLastName(), nVar.getName()));
    }

    public static final p0 k(j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        xi0.a aVar = xi0.b.Companion;
        String currency = j0Var.getCurrency();
        aVar.getClass();
        return new p0(xi0.a.a(currency));
    }
}
