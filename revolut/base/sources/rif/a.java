package rif;

import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import tof.a0;
import tof.b0;
import tof.c0;
import tof.c4;
import tof.d0;
import tof.f2;
import tof.gc;
import tof.k6;
import tof.l1;
import tof.l6;
import tof.m4;
import tof.m6;
import tof.n0;
import tof.n6;
import tof.o;
import tof.o6;
import tof.p4;
import tof.s2;
import tof.u;
import tof.u1;
import tof.u3;
import tof.v3;
import tof.w;
import tof.w2;
import tof.x2;
import tof.y0;
import tof.z;
import tof.z3;
import xhf.e2;
import xhf.m;
import xhf.o0;
import xhf.p;
import xhf.s1;
import xhf.t1;
import xhf.v1;
import yhf.g;
import yhf.j;
import yhf.l0;
import yhf.n;
import yhf.p0;
import yhf.r;
import yhf.s;
import yhf.v;
import yhf.y;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f254578a = ISODateTimeFormat.dateTimeParser().withZoneUTC();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DateTimeFormatter f254579b = ISODateTimeFormat.timeParser().withZoneUTC();

    public static final b0 a(v vVar) {
        a0 a0Var;
        p creditInsurance = vVar.getCreditInsurance();
        z zVar = null;
        if (creditInsurance == null) {
            return null;
        }
        n0 n0Var = new n0(creditInsurance.getDistributionInfo().getKey(), creditInsurance.getDistributionInfo().getParams());
        String strD = creditInsurance.getInsuranceType();
        a0[] a0VarArrValues = a0.values();
        int length = a0VarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                a0Var = null;
                break;
            }
            a0Var = a0VarArrValues[i2];
            if (kotlin.text.a0.z(a0Var.name(), strD, true)) {
                break;
            }
            i2++;
        }
        if (a0Var == null) {
            a0Var = a0.UNKNOWN;
        }
        a0 a0Var2 = a0Var;
        String strA = creditInsurance.getCreditProduct();
        z[] zVarArrValues = z.values();
        int length2 = zVarArrValues.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            z zVar2 = zVarArrValues[i];
            if (kotlin.text.a0.z(zVar2.name(), strA, true)) {
                zVar = zVar2;
                break;
            }
            i++;
        }
        if (zVar == null) {
            zVar = z.UNKNOWN;
        }
        return new b0(n0Var, a0Var2, zVar, creditInsurance.getFacilityId(), creditInsurance.getPolicyId());
    }

    public static final f2 b(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 35394935) {
            if (str.equals("PENDING")) {
                return f2.PENDING;
            }
            return null;
        }
        if (iHashCode == 1383663147) {
            if (str.equals("COMPLETED")) {
                return f2.COMPLETED;
            }
            return null;
        }
        if (iHashCode == 2066319421 && str.equals("FAILED")) {
            return f2.FAILED;
        }
        return null;
    }

    public static final DateTime c(String str) {
        if (str != null) {
            try {
                return DateTime.parse(str, f254578a);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
        return null;
    }

    public static final LocalTime d(String str) {
        if (str != null) {
            try {
                return DateTime.parse(str, f254579b).toLocalTime();
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x02bb. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0af8  */
    /* JADX WARN: Type inference failed for: r0v190, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v9, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v75, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r72v2 */
    /* JADX WARN: Type inference failed for: r72v3, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r72v4 */
    /* JADX WARN: Type inference failed for: r81v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList e(java.util.List r97) {
        /*
            Method dump skipped, instruction units count: 4300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rif.a.e(java.util.List):java.util.ArrayList");
    }

    public static final o f(yhf.p pVar) {
        return new o(pVar.getTitle(), pVar.getDescription(), pVar.getActionTitle());
    }

    public static final u g(m mVar) {
        return new u(mVar.getPlanId());
    }

    public static final tof.v h(yhf.f fVar) {
        LocalDate localDate;
        w wVar;
        String strA = fVar.getFacilityId();
        String strD = fVar.getType();
        w[] wVarArrValues = w.values();
        int length = wVarArrValues.length;
        int i = 0;
        while (true) {
            localDate = null;
            if (i >= length) {
                wVar = null;
                break;
            }
            wVar = wVarArrValues[i];
            if (kotlin.text.a0.z(wVar.name(), strD, true)) {
                break;
            }
            i++;
        }
        if (wVar == null) {
            wVar = w.UNKNOWN;
        }
        List listC = fVar.getRelatedTransactions();
        if (listC == null) {
            listC = f0.f322471a;
        }
        List list = listC;
        Object obj2 = r11.a.f250867a;
        String strB = fVar.getRelatedStatementDate();
        if (strB != null) {
            try {
                localDate = LocalDate.parse(strB);
            } catch (DateTimeParseException e) {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.VERBOSE, null, null, e, null, 16);
            }
        }
        return new tof.v(wVar, list, localDate, strA);
    }

    public static final d0 i(g gVar) {
        dj0.d dVarO = mo3.a.o(gVar.getPointsAmount());
        BigDecimal bigDecimalB = gVar.getExchangeRate().getPoints();
        BigDecimal bigDecimalA = gVar.getExchangeRate().getFiatAmount().getAmount();
        xi0.a aVar = xi0.b.Companion;
        String strB = gVar.getExchangeRate().getFiatAmount().getCurrency();
        aVar.getClass();
        return new d0(dVarO, new c0(new ej0.b(bigDecimalA, xi0.a.a(strB)), bigDecimalB));
    }

    public static final y0 j(yhf.d0 d0Var) {
        return new y0(d0Var.getInvoiceNumber(), d0Var.getInvoiceUrl());
    }

    public static final l1 k(j jVar) {
        Pair pairH = cp5.d.H(jVar.getPair());
        return new l1(Double.parseDouble(jVar.getAsk()), Double.parseDouble(jVar.getBid()), (xi0.b) pairH.f186385a, (xi0.b) pairH.f186386b, jVar.getTimestamp());
    }

    public static final u1 l(o0 o0Var) {
        return new u1(o0Var.getId());
    }

    public static final s2 m(n nVar) throws Throwable {
        String strB = nVar.getExpectedSettlementDate();
        LocalDateTime localDateTimeZ = null;
        if (strB != null) {
            try {
                Instant instant = Instant.parse(strB);
                Intrinsics.h(instant);
                localDateTimeZ = oi0.d.Z(instant);
            } catch (Exception e) {
                hx7.e.n(e);
            }
        }
        return new s2(localDateTimeZ, nVar.getCompleted());
    }

    public static final x2 n(yhf.o oVar) throws Throwable {
        Instant instant;
        Instant instantOfEpochMilli;
        Instant instantOfEpochMilli2;
        String strA = oVar.getInvoiceId();
        String strE = oVar.getSubscriptionId();
        String strD = oVar.getServiceProviderName();
        Long lC = oVar.getNextSubscriptionPeriodStartDate();
        Instant instant2 = null;
        if (lC != null) {
            try {
                instantOfEpochMilli2 = Instant.ofEpochMilli(lC.longValue());
            } catch (Exception e) {
                hx7.e.n(e);
                instantOfEpochMilli2 = null;
            }
            instant = null;
            instant2 = instantOfEpochMilli2;
        } else {
            instant = null;
        }
        Long lB = oVar.getNextInvoiceDueDate();
        if (lB != null) {
            try {
                instantOfEpochMilli = Instant.ofEpochMilli(lB.longValue());
            } catch (Exception e2) {
                hx7.e.n(e2);
                instantOfEpochMilli = instant;
            }
            instant = instantOfEpochMilli;
        }
        return new x2(strA, strE, strD, instant2, instant);
    }

    public static final u3 o(s sVar) {
        v3 v3Var;
        String strD = sVar.getDigitableLine();
        String strE = sVar.getDueDate();
        r rVarB = sVar.getBeneficiary();
        ArrayList arrayList = null;
        if (rVarB != null) {
            String strC = rVarB.getName();
            String strD2 = rVarB.getTaxId();
            String strE2 = rVarB.getType();
            v3Var = new v3(strC, strD2, Intrinsics.f(strE2, "PF") ? BeneficiaryIdentificationType.BR_CPF : Intrinsics.f(strE2, "PJ") ? BeneficiaryIdentificationType.BR_CNPJ : null, rVarB.getBankName(), rVarB.getBankCode());
        } else {
            v3Var = null;
        }
        List listA = sVar.getApmBillDetailsDto();
        if (listA != null) {
            List<yhf.e> list = listA;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            for (yhf.e eVar : list) {
                arrayList.add(new tof.j(eVar.getLabel(), eVar.getName(), eVar.getValue()));
            }
        }
        return new u3(strD, strE, v3Var, arrayList, sVar.getBillIdentifier());
    }

    public static final z3 p(xhf.y0 y0Var) {
        Double creditRate = y0Var.getCreditRate();
        jo3.a creditAmount = y0Var.getCreditAmount();
        return new z3(creditAmount != null ? mo3.a.o(creditAmount) : null, creditRate);
    }

    public static final c4 q(y yVar) {
        return new c4(yVar.getLabel(), yVar.getValue());
    }

    public static final m4 r(l0 l0Var) {
        return new m4(l0Var.getPointsAmount());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static final p4 s(e2 e2Var) {
        ?? arrayList;
        String recipientId = e2Var.getRecipientId();
        if (recipientId == null) {
            m70.a.c(t0.f186434a);
            recipientId = "";
        }
        List fields = e2Var.getFields();
        if (fields != null) {
            List<xhf.f2> list = fields;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            for (xhf.f2 f2Var : list) {
                arrayList.add(new w2(f2Var.getKey(), f2Var.getName(), f2Var.getValue()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        return new p4(recipientId, arrayList);
    }

    public static final k6 t(s1 s1Var) {
        String rate = s1Var.getRate();
        l6 l6Var = new l6(s1Var.getPromisedAmount().getAmount(), s1Var.getPromisedAmount().getCurrency());
        xhf.u1 taxDetails = s1Var.getTaxDetails();
        m6 m6Var = null;
        n6 n6Var = taxDetails != null ? new n6(new l6(taxDetails.getGrossAmount().getAmount(), taxDetails.getGrossAmount().getCurrency()), new l6(taxDetails.getTax().getAmount(), taxDetails.getTax().getCurrency())) : null;
        t1 taxBreakdown = s1Var.getTaxBreakdown();
        if (taxBreakdown != null) {
            long amount = taxBreakdown.getGrossAmount().getAmount();
            xi0.a aVar = xi0.b.Companion;
            String currency = taxBreakdown.getGrossAmount().getCurrency();
            aVar.getClass();
            dj0.d dVar = new dj0.d(amount, xi0.a.a(currency));
            List<v1> listB = taxBreakdown.getTaxes();
            ArrayList arrayList = new ArrayList(zhm.w.t(listB, 10));
            for (v1 v1Var : listB) {
                String title = v1Var.getTitle();
                long amount2 = v1Var.getValue().getAmount();
                xi0.a aVar2 = xi0.b.Companion;
                String currency2 = v1Var.getValue().getCurrency();
                aVar2.getClass();
                arrayList.add(new o6(new dj0.d(amount2, xi0.a.a(currency2)), title));
            }
            m6Var = new m6(dVar, arrayList);
        }
        return new k6(rate, l6Var, n6Var, m6Var);
    }

    public static final gc u(p0 p0Var) {
        return new gc(p0Var.getDescription());
    }
}
