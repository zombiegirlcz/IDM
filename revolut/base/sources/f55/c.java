package f55;

import com.revolut.feature.credit.loan.api.models.legacy.UnavailabilityReason;
import i55.n;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k55.h;
import k55.p;
import k55.r;
import k55.s;
import k55.t;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l55.i;
import le.u1;
import m55.g;
import p35.b0;
import p35.d0;
import p35.e0;
import p35.g0;
import p35.h0;
import p35.i0;
import p35.j0;
import p35.k0;
import p35.l0;
import p35.m0;
import p35.n0;
import p35.o0;
import p35.p0;
import p35.q0;
import p35.u0;
import p35.y0;
import p35.z0;
import z92.f;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f132268a = r0.k(new Pair("ACTIVE", g0.ACTIVE), new Pair("INACTIVE", g0.INACTIVE), new Pair("PLANNED", g0.PLANNED), new Pair("RENOUNCED", g0.RENOUNCED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f132269b = r0.k(new Pair("ZERO_LOAN_AMOUNT", k0.ZERO_LOAN_AMOUNT), new Pair("REPAYMENT_DEFERRAL", k0.REPAYMENT_DEFERRAL), new Pair("PROLONGATION", k0.PROLONGATION), new Pair("INTEREST_ONLY_WITHOUT_TERM_EXTENSION", k0.INTEREST_ONLY_WITHOUT_TERM_EXTENSION), new Pair("INTEREST_FREE_PERIOD", k0.INTEREST_FREE_PERIOD));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f132270c = r0.k(new Pair("PARTIAL_REPAYMENT", q0.PARTIAL_REPAYMENT), new Pair("OVERDUE_REPAYMENT", q0.OVERDUE_REPAYMENT), new Pair("SCHEDULED", q0.SCHEDULED), new Pair("SCHEDULED_RESTRUCTURED", q0.SCHEDULED_RESTRUCTURED), new Pair("PAY_OFF", q0.PAY_OFF), new Pair("PENALTY", q0.PENALTY), new Pair("TERMINATION_REPAYMENT", q0.TERMINATION_REPAYMENT), new Pair("SCHEDULED_LAC", q0.SCHEDULED_LAC), new Pair("OUTSTANDING_PARTIAL_REPAYMENT", q0.OUTSTANDING_PARTIAL_REPAYMENT), new Pair("CLAIM_REPAYMENT", q0.CLAIM_REPAYMENT), new Pair("UNKNOWN", q0.UNKNOWN));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r44v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r61v1, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r9v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.ArrayList] */
    public static final e0 a(r rVar, String baseUrl, d0 countryConfig) {
        ?? arrayList;
        long amount;
        boolean z;
        boolean z3;
        ?? arrayList2;
        ChronoZonedDateTime<LocalDate> chronoZonedDateTimeAtZone;
        dj0.d dVar;
        String str;
        String str2;
        List list;
        String str3;
        int i;
        Long lValueOf;
        dj0.d dVar2;
        dj0.d dVar3;
        List list2;
        p0 p0Var;
        jo3.a totalAmount;
        jo3.a totalAmount2;
        jo3.a totalAmount3;
        String str4;
        String str5;
        j0 j0Var;
        m0 m0Var;
        Long lValueOf2;
        l0 l0Var;
        jo3.a totalAmount4;
        jo3.a principalAmount;
        jo3.a principalAmount2;
        String str6 = "<this>";
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(countryConfig, "countryConfig");
        g0 g0Var = (g0) u1.u(rVar.getState(), f132268a);
        boolean z4 = g0Var == g0.ACTIVE;
        boolean z6 = z4 && rVar.getTerminatedState();
        List payments = rVar.getPayments();
        if (payments != null) {
            Object obj2 = d.f132271a;
            Intrinsics.checkNotNullParameter(payments, "<this>");
            arrayList = new ArrayList();
            Iterator it8 = payments.iterator();
            while (it8.hasNext()) {
                arrayList.add(d.b((h) it8.next()));
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r142 = arrayList;
        Iterable<h0> iterable = (Iterable) r142;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : iterable) {
            i0[] elements = {i0.PAID, i0.CLAIMED};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (kotlin.collections.d.y0(elements).contains(((h0) obj3).f232643b)) {
                arrayList3.add(obj3);
            }
        }
        List listP0 = zhm.d0.P0(arrayList3, new b());
        long j2 = mo3.a.o(rVar.getPaidAmount()).f115082a;
        if (z6 || countryConfig.f232612b.f232640a == z0.TOTAL_AMOUNT) {
            amount = rVar.getPayoffAmountBreakdown().getTotalAmount().getAmount();
        } else {
            k55.c regularBreakdown = rVar.getPayoffAmountBreakdown().getRegularBreakdown();
            long amount2 = (regularBreakdown == null || (principalAmount2 = regularBreakdown.getPrincipalAmount()) == null) ? 0L : principalAmount2.getAmount();
            k55.c outstandingBreakdown = rVar.getPayoffAmountBreakdown().getOutstandingBreakdown();
            long amount3 = amount2 + ((outstandingBreakdown == null || (principalAmount = outstandingBreakdown.getPrincipalAmount()) == null) ? 0L : principalAmount.getAmount());
            k55.c overdueBreakdown = rVar.getPayoffAmountBreakdown().getOverdueBreakdown();
            amount = amount3 + ((overdueBreakdown == null || (totalAmount4 = overdueBreakdown.getTotalAmount()) == null) ? 0L : totalAmount4.getAmount());
        }
        long j3 = amount;
        if (!z4 || ((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            z = false;
        } else {
            for (h0 h0Var : iterable) {
                if (h0Var.f232643b == i0.OUTSTANDING && h0Var.f232645g) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean z11 = z4 && rVar.getAgreementCancelledFlag();
        if (!z4 || ((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            z3 = false;
        } else {
            Iterator it9 = iterable.iterator();
            while (it9.hasNext()) {
                if (((h0) it9.next()).f232643b == i0.LATE) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        }
        String strP = rVar.getImageId() != null ? com.google.android.gms.internal.mlkit_vision_face.a.p(baseUrl, "/loan-management/loan/", rVar.getId(), "/banner/", rVar.getImageId()) : null;
        List repaymentRequests = rVar.getRepaymentRequests();
        if (repaymentRequests != null) {
            arrayList2 = new ArrayList();
            Iterator it10 = repaymentRequests.iterator();
            while (it10.hasNext()) {
                i iVar = (i) it10.next();
                Map map = e.f132272a;
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                Iterator it11 = it10;
                n0 n0Var = (n0) u1.v(iVar.getType(), e.f132273b);
                if (n0Var == null || (m0Var = (m0) u1.v(iVar.getState(), e.f132272a)) == null) {
                    l0Var = null;
                } else {
                    String date = iVar.getDate();
                    if (date != null) {
                        LocalDate localDate = LocalDate.parse(date);
                        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                        lValueOf2 = Long.valueOf(oc.c.F(localDate));
                    } else {
                        lValueOf2 = null;
                    }
                    jo3.a topupAmount = iVar.getTopupAmount();
                    l0Var = new l0(n0Var, m0Var, topupAmount != null ? mo3.a.o(topupAmount) : null, lValueOf2, iVar.getRepaymentSourceId());
                }
                if (l0Var != null) {
                    arrayList2.add(l0Var);
                }
                it10 = it11;
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        ?? r44 = arrayList2;
        boolean z12 = z4 && !z6;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : iterable) {
            if (((h0) obj4).f232643b == i0.SCHEDULED) {
                arrayList4.add(obj4);
            }
        }
        int size = z6 ? 1 : z11 ? 0 : arrayList4.size();
        try {
            chronoZonedDateTimeAtZone = ZonedDateTime.parse(rVar.getDisbursalDateTime());
        } catch (DateTimeParseException unused) {
            chronoZonedDateTimeAtZone = LocalDateTime.parse(rVar.getDisbursalDateTime()).atZone(ZoneId.systemDefault());
        }
        String id10 = rVar.getId();
        String cardId = rVar.getCardId();
        double apr = rVar.getApr();
        long amount4 = rVar.getAmount();
        String currency = rVar.getCurrency();
        Intrinsics.h(chronoZonedDateTimeAtZone);
        String loanName = rVar.getLoanName();
        int term = rVar.getTerm();
        int duration = rVar.getDuration();
        dj0.d dVarO = mo3.a.o(rVar.getMinPartialRepaymentAmount());
        h nextRepayment = rVar.getNextRepayment();
        h0 h0VarB = nextRepayment != null ? d.b(nextRepayment) : null;
        boolean inCooldownPeriod = rVar.getInCooldownPeriod();
        double annualInterestRate = rVar.getAnnualInterestRate();
        Integer daysPastDue = rVar.getDaysPastDue();
        b0 b0VarF = f.F(rVar.getPayoffAmountBreakdown());
        b0 b0VarF2 = f.F(rVar.getMaxPartialRepaymentAmountBreakdown());
        int overdueRepaymentsCount = rVar.getOverdueRepaymentsCount();
        ?? r612 = chronoZonedDateTimeAtZone;
        xi0.a aVar = xi0.b.Companion;
        String currency2 = rVar.getCurrency();
        aVar.getClass();
        dj0.d dVar4 = new dj0.d(j3, xi0.a.a(currency2));
        List renegotiations = rVar.getRenegotiations();
        if (renegotiations != null) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it12 = renegotiations.iterator();
            while (it12.hasNext()) {
                n nVar = (n) it12.next();
                Intrinsics.checkNotNullParameter(nVar, "<this>");
                dj0.d dVar5 = dVar4;
                Iterator it13 = it12;
                k0 k0Var = (k0) u1.v(nVar.getType(), f132269b);
                if (k0Var != null) {
                    String applicationId = nVar.getApplicationId();
                    LocalDate localDate2 = LocalDate.parse(nVar.getEndDate());
                    Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
                    str4 = currency;
                    str5 = strP;
                    j0Var = new j0(applicationId, oc.c.F(localDate2), k0Var);
                } else {
                    str4 = currency;
                    str5 = strP;
                    j0Var = null;
                }
                if (j0Var != null) {
                    arrayList5.add(j0Var);
                }
                dVar4 = dVar5;
                it12 = it13;
                strP = str5;
                currency = str4;
            }
            dVar = dVar4;
            str = currency;
            str2 = strP;
            list = arrayList5;
        } else {
            dVar = dVar4;
            str = currency;
            str2 = strP;
            list = f0.f322471a;
        }
        p payoffAmountBreakdown = rVar.getPayoffAmountBreakdown();
        Intrinsics.checkNotNullParameter(payoffAmountBreakdown, "payoffAmountBreakdown");
        String currency3 = payoffAmountBreakdown.getTotalAmount().getCurrency();
        k55.c overdueBreakdown2 = payoffAmountBreakdown.getOverdueBreakdown();
        jo3.a totalAmount5 = overdueBreakdown2 != null ? overdueBreakdown2.getTotalAmount() : null;
        jo3.a overduePenaltyAmount = payoffAmountBreakdown.getOverduePenaltyAmount();
        if (totalAmount5 == null || overduePenaltyAmount == null) {
            str3 = loanName;
            i = term;
            if (totalAmount5 == null && overduePenaltyAmount != null) {
                totalAmount5 = overduePenaltyAmount;
            } else if (totalAmount5 == null || overduePenaltyAmount != null) {
                totalAmount5 = null;
            }
        } else {
            str3 = loanName;
            i = term;
            totalAmount5 = new jo3.a(totalAmount5.getAmount() + overduePenaltyAmount.getAmount(), currency3);
        }
        dj0.d dVarO2 = totalAmount5 != null ? mo3.a.o(totalAmount5) : null;
        k55.c outstandingBreakdown2 = rVar.getPayoffAmountBreakdown().getOutstandingBreakdown();
        dj0.d dVarO3 = (outstandingBreakdown2 == null || (totalAmount3 = outstandingBreakdown2.getTotalAmount()) == null) ? null : mo3.a.o(totalAmount3);
        p payoffAmountBreakdown2 = rVar.getPayoffAmountBreakdown();
        Intrinsics.checkNotNullParameter(payoffAmountBreakdown2, "payoffAmountBreakdown");
        k55.c overdueBreakdown3 = payoffAmountBreakdown2.getOverdueBreakdown();
        long amount5 = (overdueBreakdown3 == null || (totalAmount2 = overdueBreakdown3.getTotalAmount()) == null) ? 0L : totalAmount2.getAmount();
        k55.c outstandingBreakdown3 = payoffAmountBreakdown2.getOutstandingBreakdown();
        long amount6 = amount5 + ((outstandingBreakdown3 == null || (totalAmount = outstandingBreakdown3.getTotalAmount()) == null) ? 0L : totalAmount.getAmount());
        jo3.a overduePenaltyAmount2 = payoffAmountBreakdown2.getOverduePenaltyAmount();
        dj0.d dVarO4 = mo3.a.o(new jo3.a(amount6 + (overduePenaltyAmount2 != null ? overduePenaltyAmount2.getAmount() : 0L), payoffAmountBreakdown2.getTotalAmount().getCurrency()));
        long oneTimeFee = rVar.getOneTimeFee();
        xi0.a aVar2 = xi0.b.Companion;
        String currency4 = rVar.getCurrency();
        aVar2.getClass();
        dj0.d dVar6 = new dj0.d(oneTimeFee, xi0.a.a(currency4));
        wi0.b bVarC = com.bumptech.glide.d.c(rVar.getCountryCode());
        dj0.d dVarO5 = mo3.a.o(rVar.getTotalRepayable());
        t toggleStatus = rVar.getToggleStatus();
        y0 y0VarC = toggleStatus != null ? c(toggleStatus) : new y0(0);
        String paidDate = rVar.getPaidDate();
        if (paidDate != null) {
            LocalDate localDate3 = LocalDate.parse(paidDate);
            Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
            lValueOf = Long.valueOf(oc.c.F(localDate3));
        } else {
            lValueOf = null;
        }
        int i2 = i;
        int repaymentDay = rVar.getRepaymentDay();
        List<s> repaymentSources = rVar.getRepaymentSources();
        if (repaymentSources != null) {
            dVar2 = dVarO2;
            ArrayList arrayList6 = new ArrayList();
            for (s sVar : repaymentSources) {
                dj0.d dVar7 = dVarO4;
                Map map2 = e.f132272a;
                Intrinsics.checkNotNullParameter(sVar, str6);
                String str7 = str6;
                u0 u0Var = (u0) u1.v(sVar.getType(), e.f132274c);
                o0 o0Var = (u0Var == null || (p0Var = (p0) u1.v(sVar.getState(), e.d)) == null) ? null : new o0(u0Var, p0Var, sVar.getRepaymentSourceId(), sVar.getExternalId(), sVar.getBankIdentifier(), sVar.getAccountNumber(), sVar.getDebtorName());
                if (o0Var != null) {
                    arrayList6.add(o0Var);
                }
                dVarO4 = dVar7;
                str6 = str7;
            }
            dVar3 = dVarO4;
            list2 = arrayList6;
        } else {
            dVar2 = dVarO2;
            dVar3 = dVarO4;
            list2 = f0.f322471a;
        }
        jo3.a repaymentAmount = rVar.getRepaymentAmount();
        return new e0(id10, amount4, str, str2, g0Var, apr, i2, duration, str3, r612, cardId, r142, annualInterestRate, dVarO, h0VarB, inCooldownPeriod, daysPastDue, b0VarF, b0VarF2, overdueRepaymentsCount, dVar, size, j2, listP0, z3, z6, list, dVarO3, dVar2, dVar3, z, dVar6, bVarC, dVarO5, y0VarC, z11, lValueOf, repaymentDay, z12, r44, list2, repaymentAmount != null ? mo3.a.o(repaymentAmount) : null, countryConfig, rVar.getRefinanced());
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    public static final e0 b(m55.f fVar, d0 countryConfig) {
        String str = "<this>";
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(countryConfig, "countryConfig");
        String id10 = fVar.getId();
        g0 g0Var = (g0) u1.u(fVar.getState(), f132268a);
        ArrayList arrayListA = d.a(fVar.getPayments());
        String cardId = fVar.getCardId();
        double apr = fVar.getApr();
        long amount = fVar.getAmount();
        String currency = fVar.getCurrency();
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(fVar.getDisburseDateTime());
        Intrinsics.checkNotNullExpressionValue(zonedDateTime, "parse(...)");
        String loanName = fVar.getLoanName();
        int term = fVar.getTerm();
        int duration = fVar.getDuration();
        dj0.d dVarO = mo3.a.o(fVar.getMinPartialRepaymentAmount());
        m55.b nextRepayment = fVar.getNextRepayment();
        h0 h0VarC = nextRepayment != null ? d.c(nextRepayment) : null;
        boolean inCooldownPeriod = fVar.getInCooldownPeriod();
        double annualInterestRate = fVar.getAnnualInterestRate();
        Integer daysPastDue = fVar.getDaysPastDue();
        b0 b0VarG = f.G(fVar.getPayoffAmountBreakdown());
        b0 b0VarG2 = f.G(fVar.getMaxPartialRepaymentAmountBreakdown());
        int overdueRepaymentsCount = fVar.getOverdueRepaymentsCount();
        dj0.d dVarO2 = mo3.a.o(fVar.getLeftPrincipalAmount());
        boolean isPaymentOverdue = fVar.getIsPaymentOverdue();
        int leftRepaymentsCount = fVar.getLeftRepaymentsCount();
        ArrayList arrayListA2 = d.a(fVar.getPaidRepayments());
        long paidRepaymentAmount = fVar.getPaidRepaymentAmount();
        boolean terminatedState = fVar.getTerminatedState();
        List renegotiations = fVar.getRenegotiations();
        ArrayList arrayList = new ArrayList(w.t(renegotiations, 10));
        Iterator it8 = renegotiations.iterator();
        while (it8.hasNext()) {
            m55.e eVar = (m55.e) it8.next();
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            arrayList.add(new j0(eVar.getApplicationId(), eVar.getEndDate(), (k0) u1.u(eVar.getType(), f132269b)));
            it8 = it8;
            id10 = id10;
            amount = amount;
        }
        String str2 = id10;
        long j2 = amount;
        jo3.a overdueBalance = fVar.getOverdueBalance();
        dj0.d dVarO3 = overdueBalance != null ? mo3.a.o(overdueBalance) : null;
        jo3.a outstandingBalance = fVar.getOutstandingBalance();
        dj0.d dVarO4 = outstandingBalance != null ? mo3.a.o(outstandingBalance) : null;
        dj0.d dVarO5 = mo3.a.o(fVar.getFullOutstandingBalance());
        boolean isOutstanding = fVar.getIsOutstanding();
        dj0.d dVarO6 = mo3.a.o(fVar.getOneTimeFee());
        wi0.a aVar = wi0.b.Companion;
        String countryCode = fVar.getCountryCode();
        aVar.getClass();
        wi0.b bVarA = wi0.a.a(countryCode);
        dj0.d dVarO7 = mo3.a.o(fVar.getTotalRepayable());
        y0 y0VarC = c(fVar.getToggleStatus());
        boolean isCancelled = fVar.getIsCancelled();
        Long paidDate = fVar.getPaidDate();
        int repaymentDay = fVar.getRepaymentDay();
        boolean canChangeDirectDebit = fVar.getCanChangeDirectDebit();
        List repaymentRequests = fVar.getRepaymentRequests();
        dj0.d dVar = dVarO4;
        ArrayList arrayList2 = new ArrayList(w.t(repaymentRequests, 10));
        Iterator it9 = repaymentRequests.iterator();
        while (it9.hasNext()) {
            g gVar = (g) it9.next();
            Map map = e.f132272a;
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            String repaymentSourceId = gVar.getRepaymentSourceId();
            Iterator it10 = it9;
            n0 n0Var = (n0) u1.u(gVar.getType(), e.f132273b);
            m0 m0Var = (m0) u1.u(gVar.getState(), e.f132272a);
            Long date = gVar.getDate();
            jo3.a topupAmount = gVar.getTopupAmount();
            arrayList2.add(new l0(n0Var, m0Var, topupAmount != null ? mo3.a.o(topupAmount) : null, date, repaymentSourceId));
            it9 = it10;
        }
        List repaymentSources = fVar.getRepaymentSources();
        ArrayList arrayList3 = new ArrayList(w.t(repaymentSources, 10));
        for (Iterator it11 = repaymentSources.iterator(); it11.hasNext(); it11 = it11) {
            m55.h hVar = (m55.h) it11.next();
            Map map2 = e.f132272a;
            Intrinsics.checkNotNullParameter(hVar, str);
            arrayList3.add(new o0((u0) u1.u(hVar.getType(), e.f132274c), (p0) u1.u(hVar.getState(), e.d), hVar.getRepaymentSourceId(), hVar.getExternalId(), hVar.getBankIdentifier(), hVar.getAccountNumber(), hVar.getDebtorName()));
            str = str;
        }
        jo3.a repaymentAmount = fVar.getRepaymentAmount();
        return new e0(str2, j2, currency, null, g0Var, apr, term, duration, loanName, zonedDateTime, cardId, arrayListA, annualInterestRate, dVarO, h0VarC, inCooldownPeriod, daysPastDue, b0VarG, b0VarG2, overdueRepaymentsCount, dVarO2, leftRepaymentsCount, paidRepaymentAmount, arrayListA2, isPaymentOverdue, terminatedState, arrayList, dVar, dVarO3, dVarO5, isOutstanding, dVarO6, bVarA, dVarO7, y0VarC, isCancelled, paidDate, repaymentDay, canChangeDirectDebit, arrayList2, arrayList3, repaymentAmount != null ? mo3.a.o(repaymentAmount) : null, countryConfig, fVar.getIsRefinanced());
    }

    public static final y0 c(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        String changePayDayUnavailabilityReason = tVar.getChangePayDayUnavailabilityReason();
        UnavailabilityReason unavailabilityReasonE = changePayDayUnavailabilityReason != null ? e(changePayDayUnavailabilityReason) : null;
        String settlementUnavailabilityReason = tVar.getSettlementUnavailabilityReason();
        UnavailabilityReason unavailabilityReasonE2 = settlementUnavailabilityReason != null ? e(settlementUnavailabilityReason) : null;
        String statementUnavailabilityReason = tVar.getStatementUnavailabilityReason();
        UnavailabilityReason unavailabilityReasonE3 = statementUnavailabilityReason != null ? e(statementUnavailabilityReason) : null;
        String partialUnavailabilityReason = tVar.getPartialUnavailabilityReason();
        UnavailabilityReason unavailabilityReasonE4 = partialUnavailabilityReason != null ? e(partialUnavailabilityReason) : null;
        String cancellationUnavailabilityReason = tVar.getCancellationUnavailabilityReason();
        UnavailabilityReason unavailabilityReasonE5 = cancellationUnavailabilityReason != null ? e(cancellationUnavailabilityReason) : null;
        String zeroLoanAmountRenegotiationUnavailabilityReason = tVar.getZeroLoanAmountRenegotiationUnavailabilityReason();
        UnavailabilityReason unavailabilityReasonE6 = zeroLoanAmountRenegotiationUnavailabilityReason != null ? e(zeroLoanAmountRenegotiationUnavailabilityReason) : null;
        String repaymentDeferralRenegotiationUnavailabilityReason = tVar.getRepaymentDeferralRenegotiationUnavailabilityReason();
        UnavailabilityReason unavailabilityReasonE7 = repaymentDeferralRenegotiationUnavailabilityReason != null ? e(repaymentDeferralRenegotiationUnavailabilityReason) : null;
        String interestOnlyWithoutTermExtensionRenegotiationUnavailabilityReason = tVar.getInterestOnlyWithoutTermExtensionRenegotiationUnavailabilityReason();
        return new y0(unavailabilityReasonE, unavailabilityReasonE2, unavailabilityReasonE3, unavailabilityReasonE4, unavailabilityReasonE5, unavailabilityReasonE6, unavailabilityReasonE7, interestOnlyWithoutTermExtensionRenegotiationUnavailabilityReason != null ? e(interestOnlyWithoutTermExtensionRenegotiationUnavailabilityReason) : null);
    }

    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    public static final m55.f d(e0 e0Var) {
        String str = "<this>";
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        String str2 = e0Var.f232622a;
        String strG = u1.g(e0Var.e, f132268a);
        ArrayList arrayListD = d.d(e0Var.f232628l);
        String str3 = e0Var.k;
        double d = e0Var.f;
        long j2 = e0Var.f232623b;
        String str4 = e0Var.f232624c;
        String string = e0Var.f232627j.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String str5 = e0Var.i;
        int i = e0Var.f232625g;
        int i2 = e0Var.f232626h;
        jo3.a aVarP = mo3.a.p(e0Var.f232630n);
        h0 h0Var = e0Var.o;
        m55.b bVarE = h0Var != null ? d.e(h0Var) : null;
        boolean z = e0Var.f232631p;
        double d5 = e0Var.f232629m;
        m55.c cVarN = f.N(e0Var.f232633r);
        m55.c cVarN2 = f.N(e0Var.f232634s);
        int i3 = e0Var.f232635t;
        jo3.a aVarP2 = mo3.a.p(e0Var.u);
        boolean z3 = e0Var.f232638y;
        ArrayList arrayListD2 = d.d(e0Var.f232637x);
        long j3 = e0Var.f232636w;
        int i5 = e0Var.v;
        boolean z4 = e0Var.z;
        List list = e0Var.A;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            j0 j0Var = (j0) it8.next();
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            arrayList.add(new m55.e(j0Var.f232649a, j0Var.f232650b, u1.g(j0Var.f232651c, f132269b)));
            it8 = it8;
            strG = strG;
            d = d;
        }
        String str6 = strG;
        double d6 = d;
        dj0.d dVar = e0Var.C;
        jo3.a aVarP3 = dVar != null ? mo3.a.p(dVar) : null;
        dj0.d dVar2 = e0Var.B;
        jo3.a aVarP4 = dVar2 != null ? mo3.a.p(dVar2) : null;
        jo3.a aVarP5 = mo3.a.p(e0Var.D);
        jo3.a aVarP6 = mo3.a.p(e0Var.F);
        String str7 = e0Var.G.f297794a;
        jo3.a aVarP7 = mo3.a.p(e0Var.H);
        jo3.a aVar = aVarP3;
        y0 y0Var = e0Var.I;
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        UnavailabilityReason unavailabilityReason = y0Var.f232685a;
        String str8 = unavailabilityReason != null ? unavailabilityReason.f70102a : null;
        UnavailabilityReason unavailabilityReason2 = y0Var.d;
        String str9 = unavailabilityReason2 != null ? unavailabilityReason2.f70102a : null;
        UnavailabilityReason unavailabilityReason3 = y0Var.f232687c;
        String str10 = unavailabilityReason3 != null ? unavailabilityReason3.f70102a : null;
        UnavailabilityReason unavailabilityReason4 = y0Var.f232686b;
        String str11 = unavailabilityReason4 != null ? unavailabilityReason4.f70102a : null;
        UnavailabilityReason unavailabilityReason5 = y0Var.e;
        String str12 = unavailabilityReason5 != null ? unavailabilityReason5.f70102a : null;
        UnavailabilityReason unavailabilityReason6 = y0Var.f;
        String str13 = unavailabilityReason6 != null ? unavailabilityReason6.f70102a : null;
        UnavailabilityReason unavailabilityReason7 = y0Var.f232688g;
        String str14 = unavailabilityReason7 != null ? unavailabilityReason7.f70102a : null;
        UnavailabilityReason unavailabilityReason8 = y0Var.f232689h;
        t tVar = new t(str8, str11, str10, str9, str12, str13, str14, unavailabilityReason8 != null ? unavailabilityReason8.f70102a : null);
        int i6 = e0Var.L;
        boolean z6 = e0Var.M;
        List list2 = e0Var.N;
        jo3.a aVar2 = aVarP4;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            l0 l0Var = (l0) it9.next();
            Map map = e.f132272a;
            Intrinsics.checkNotNullParameter(l0Var, "<this>");
            String str15 = l0Var.e;
            Iterator it10 = it9;
            String strG2 = u1.g(l0Var.f232654a, e.f132273b);
            String strG3 = u1.g(l0Var.f232655b, e.f132272a);
            Long l2 = l0Var.d;
            dj0.d dVar3 = l0Var.f232656c;
            arrayList2.add(new g(str15, strG2, strG3, l2, dVar3 != null ? mo3.a.p(dVar3) : null));
            it9 = it10;
        }
        List list3 = e0Var.O;
        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
        for (Iterator it11 = list3.iterator(); it11.hasNext(); it11 = it11) {
            o0 o0Var = (o0) it11.next();
            Map map2 = e.f132272a;
            Intrinsics.checkNotNullParameter(o0Var, str);
            arrayList3.add(new m55.h(u1.g(o0Var.f232662a, e.f132274c), u1.g(o0Var.f232663b, e.d), o0Var.f232664c, o0Var.d, o0Var.e, o0Var.f, o0Var.f232665g));
            str = str;
        }
        dj0.d dVar4 = e0Var.P;
        return new m55.f(str2, j2, str6, d6, i, i2, str5, string, str4, d5, str3, arrayListD, aVarP, bVarE, z, e0Var.f232632q, cVarN, cVarN2, i3, aVarP2, i5, z3, arrayListD2, j3, z4, arrayList, aVar, aVar2, aVarP5, e0Var.E, aVarP6, str7, aVarP7, tVar, e0Var.J, e0Var.K, i6, z6, arrayList2, arrayList3, dVar4 != null ? mo3.a.p(dVar4) : null, e0Var.R);
    }

    public static final UnavailabilityReason e(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new UnavailabilityReason(reason, reason.concat(".title"), reason.concat(".description"));
    }
}
