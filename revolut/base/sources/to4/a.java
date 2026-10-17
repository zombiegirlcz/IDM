package to4;

import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$AccruedInterest;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$Charge;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$ChargesBreakdown;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$Instalment;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$OutstandingBalance;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$RevolverTransaction;
import dj0.d;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import so4.a;
import so4.b;
import vl4.b;
import vl4.c;
import vl4.e;
import vl4.f;
import vl4.g;
import vl4.h;
import vl4.i;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final CreditCardInAppStatement$Charge a(a.b bVar) {
        LocalDate chargeDate = bVar.getChargeDate();
        jo3.a amount = bVar.getAmount();
        return new CreditCardInAppStatement$Charge(amount != null ? mo3.a.o(amount) : null, chargeDate);
    }

    public static final CreditCardInAppStatement$RevolverTransaction b(a.g gVar) throws Throwable {
        CreditCardInAppStatement$Instalment creditCardInAppStatement$Instalment;
        Object objA;
        Object obj2;
        ZonedDateTime completedDate = gVar.getCompletedDate();
        d dVarO = mo3.a.o(gVar.getAmount());
        jo3.a interestAmount = gVar.getInterestAmount();
        d dVarO2 = null;
        if (interestAmount != null) {
            creditCardInAppStatement$Instalment = null;
            dVarO2 = mo3.a.o(interestAmount);
        } else {
            creditCardInAppStatement$Instalment = null;
        }
        String referenceTransactionId = gVar.getReferenceTransactionId();
        CreditCardInAppStatement$Instalment creditCardInAppStatement$Instalment2 = creditCardInAppStatement$Instalment;
        String description = gVar.getDescription();
        String type = gVar.getType();
        try {
            m.Companion companion = m.INSTANCE;
            e[] eVarArrValues = e.values();
            int length = eVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    obj2 = creditCardInAppStatement$Instalment2;
                    break;
                }
                e eVar = eVarArrValues[i];
                if (a0.z(eVar.name(), type, true)) {
                    obj2 = eVar;
                    break;
                }
                i++;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (obj2 == null) {
            throw new IllegalStateException("Unsupported enum value: " + type + " for " + o0.f186429a.b(e.class).m());
        }
        objA = obj2;
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        boolean z = objA instanceof n;
        Object obj3 = objA;
        if (z) {
            obj3 = creditCardInAppStatement$Instalment2;
        }
        e eVar2 = (e) ((Enum) obj3);
        if (eVar2 == null) {
            eVar2 = e.UNKNOWN;
        }
        a.e instalment = gVar.getInstalment();
        return new CreditCardInAppStatement$RevolverTransaction(completedDate, dVarO, dVarO2, referenceTransactionId, description, eVar2, instalment != null ? new CreditCardInAppStatement$Instalment(instalment.getNumber(), instalment.getTotalNumber(), instalment.getPlanId()) : creditCardInAppStatement$Instalment2);
    }

    public static final g c(so4.a aVar) throws Throwable {
        Object objA;
        d dVar;
        d dVarO;
        d dVar2;
        d dVarO2;
        ArrayList arrayList;
        LocalDate localDate;
        Object objA2;
        b bVar;
        CreditCardInAppStatement$OutstandingBalance creditCardInAppStatement$OutstandingBalance;
        String str;
        f fVar;
        LocalDate localDate2;
        ArrayList arrayList2;
        Object objA3;
        vl4.d dVar3;
        CreditCardInAppStatement$ChargesBreakdown creditCardInAppStatement$ChargesBreakdown;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        LocalDate referenceDate = aVar.getReferenceDate();
        LocalDate startDate = aVar.getStartDate();
        LocalDate endDate = aVar.getEndDate();
        LocalDate dueDate = aVar.getDueDate();
        LocalDate nextDueDate = aVar.getNextDueDate();
        LocalDate nextInterestChargeDate = aVar.getNextInterestChargeDate();
        d dVarO3 = mo3.a.o(aVar.getStatementBalance());
        String state = aVar.getState();
        try {
            m.Companion companion = m.INSTANCE;
            c[] cVarArrValues = c.values();
            int length = cVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    objA = null;
                    break;
                }
                c cVar = cVarArrValues[i];
                if (a0.z(cVar.name(), state, true)) {
                    objA = cVar;
                    break;
                }
                i++;
            }
            if (objA == null) {
                throw new IllegalStateException("Unsupported enum value: " + state + " for " + o0.f186429a.b(c.class).m());
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Object obj2 = objA;
        Throwable thA = m.a(obj2);
        if (thA != null) {
            hx7.e.n(thA);
        }
        boolean z = obj2 instanceof n;
        Object obj3 = obj2;
        if (z) {
            obj3 = null;
        }
        c cVar2 = (c) ((Enum) obj3);
        if (cVar2 == null) {
            cVar2 = c.UNKNOWN;
        }
        c cVar3 = cVar2;
        List revolverTransactions = aVar.getRevolverTransactions();
        ArrayList arrayList3 = new ArrayList(w.t(revolverTransactions, 10));
        Iterator it8 = revolverTransactions.iterator();
        while (it8.hasNext()) {
            arrayList3.add(b((a.g) it8.next()));
        }
        jo3.a spendBalance = aVar.getSpendBalance();
        d dVarO4 = spendBalance != null ? mo3.a.o(spendBalance) : null;
        jo3.a minRepaymentAmount = aVar.getMinRepaymentAmount();
        if (minRepaymentAmount != null) {
            dVar = dVarO4;
            dVarO = mo3.a.o(minRepaymentAmount);
        } else {
            dVar = dVarO4;
            dVarO = null;
        }
        jo3.a repaymentAmount = aVar.getRepaymentAmount();
        d dVarO5 = repaymentAmount != null ? mo3.a.o(repaymentAmount) : null;
        jo3.a remainingAmount = aVar.getRemainingAmount();
        d dVarO6 = remainingAmount != null ? mo3.a.o(remainingAmount) : null;
        jo3.a statementDeferredAmount = aVar.getStatementDeferredAmount();
        if (statementDeferredAmount != null) {
            dVar2 = dVar;
            dVarO2 = mo3.a.o(statementDeferredAmount);
        } else {
            dVar2 = dVar;
            dVarO2 = null;
        }
        String repaymentStatus = aVar.getRepaymentStatus();
        if (repaymentStatus != null) {
            try {
                try {
                    m.Companion companion3 = m.INSTANCE;
                    b[] bVarArrValues = b.values();
                    int length2 = bVarArrValues.length;
                    arrayList = arrayList3;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            localDate = referenceDate;
                            objA2 = null;
                            break;
                        }
                        try {
                            b bVar2 = bVarArrValues[i2];
                            int i3 = i2;
                            localDate = referenceDate;
                            try {
                                if (a0.z(bVar2.name(), repaymentStatus, true)) {
                                    objA2 = bVar2;
                                    break;
                                }
                                i2 = i3 + 1;
                                referenceDate = localDate;
                            } catch (Throwable th11) {
                                th = th11;
                                m.Companion companion4 = m.INSTANCE;
                                objA2 = o.a(th);
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            localDate = referenceDate;
                            m.Companion companion42 = m.INSTANCE;
                            objA2 = o.a(th);
                        }
                    }
                    if (objA2 == null) {
                        throw new IllegalStateException("Unsupported enum value: " + repaymentStatus + " for " + o0.f186429a.b(b.class).m());
                    }
                } catch (CancellationException e2) {
                    throw e2;
                }
            } catch (Throwable th13) {
                th = th13;
                arrayList = arrayList3;
            }
            Object obj4 = objA2;
            Throwable thA2 = m.a(obj4);
            if (thA2 != null) {
                hx7.e.n(thA2);
            }
            boolean z3 = obj4 instanceof n;
            Object obj5 = obj4;
            if (z3) {
                obj5 = null;
            }
            bVar = (b) ((Enum) obj5);
        } else {
            arrayList = arrayList3;
            localDate = referenceDate;
            bVar = null;
        }
        a.f outstandingBalance = aVar.getOutstandingBalance();
        if (outstandingBalance != null) {
            d dVarO7 = mo3.a.o(outstandingBalance.getTotalAmount());
            d dVarO8 = mo3.a.o(outstandingBalance.getRemainingBalance());
            LocalDate fromDate = outstandingBalance.getFromDate();
            boolean overdue = outstandingBalance.getOverdue();
            a.c chargesBreakdown = outstandingBalance.getChargesBreakdown();
            if (chargesBreakdown != null) {
                a.b interest = chargesBreakdown.getInterest();
                CreditCardInAppStatement$Charge creditCardInAppStatement$ChargeA = interest != null ? a(interest) : null;
                a.b fee2 = chargesBreakdown.getFee();
                CreditCardInAppStatement$Charge creditCardInAppStatement$ChargeA2 = fee2 != null ? a(fee2) : null;
                a.b tax = chargesBreakdown.getTax();
                CreditCardInAppStatement$Charge creditCardInAppStatement$ChargeA3 = tax != null ? a(tax) : null;
                a.b lateFee = chargesBreakdown.getLateFee();
                CreditCardInAppStatement$Charge creditCardInAppStatement$ChargeA4 = lateFee != null ? a(lateFee) : null;
                a.b lateInterest = chargesBreakdown.getLateInterest();
                creditCardInAppStatement$ChargesBreakdown = new CreditCardInAppStatement$ChargesBreakdown(creditCardInAppStatement$ChargeA, creditCardInAppStatement$ChargeA2, creditCardInAppStatement$ChargeA3, creditCardInAppStatement$ChargeA4, lateInterest != null ? a(lateInterest) : null);
            } else {
                creditCardInAppStatement$ChargesBreakdown = null;
            }
            creditCardInAppStatement$OutstandingBalance = new CreditCardInAppStatement$OutstandingBalance(dVarO7, dVarO8, fromDate, null, null, overdue, creditCardInAppStatement$ChargesBreakdown);
        } else {
            creditCardInAppStatement$OutstandingBalance = null;
        }
        d dVar4 = dVar2;
        String statementFileName = aVar.getStatementFileName();
        String spreadsheetStatementFileName = aVar.getSpreadsheetStatementFileName();
        a.h transactionsFilter = aVar.getTransactionsFilter();
        if (transactionsFilter != null) {
            a.d completedTransactions = transactionsFilter.getCompletedTransactions();
            str = spreadsheetStatementFileName;
            fVar = new f(new vl4.a(completedTransactions.getCreatedDateFrom(), completedTransactions.getCreatedDateTo(), completedTransactions.getCompletedDateFrom(), completedTransactions.getCompletedDateTo(), completedTransactions.getExcludeIds()), transactionsFilter.getIncludeTransactionIds(), transactionsFilter.getIncludePendingTransactions());
        } else {
            str = spreadsheetStatementFileName;
            fVar = null;
        }
        List accruedInterests = aVar.getAccruedInterests();
        if (accruedInterests != null) {
            List list = accruedInterests;
            localDate2 = startDate;
            arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                a.C1478a c1478a = (a.C1478a) it9.next();
                Intrinsics.checkNotNullParameter(c1478a, str2);
                String label = c1478a.getLabel();
                Iterator it10 = it9;
                String explainer = c1478a.getExplainer();
                String str3 = str2;
                d dVarO9 = mo3.a.o(c1478a.getAmount());
                List transactions = c1478a.getTransactions();
                LocalDate localDate3 = endDate;
                LocalDate localDate4 = dueDate;
                LocalDate localDate5 = nextDueDate;
                ArrayList arrayList4 = new ArrayList(w.t(transactions, 10));
                Iterator it11 = transactions.iterator();
                while (it11.hasNext()) {
                    arrayList4.add(b((a.g) it11.next()));
                }
                arrayList2.add(new CreditCardInAppStatement$AccruedInterest(label, explainer, dVarO9, arrayList4));
                it9 = it10;
                endDate = localDate3;
                str2 = str3;
                dueDate = localDate4;
                nextDueDate = localDate5;
            }
        } else {
            localDate2 = startDate;
            arrayList2 = null;
        }
        LocalDate localDate6 = endDate;
        LocalDate localDate7 = dueDate;
        LocalDate localDate8 = nextDueDate;
        String status = aVar.getStatus();
        try {
            m.Companion companion5 = m.INSTANCE;
            vl4.d[] dVarArrValues = vl4.d.values();
            int length3 = dVarArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length3) {
                    dVar3 = null;
                    break;
                }
                vl4.d dVar5 = dVarArrValues[i5];
                if (a0.z(dVar5.name(), status, true)) {
                    dVar3 = dVar5;
                    break;
                }
                i5++;
            }
        } catch (CancellationException e4) {
            throw e4;
        } catch (Throwable th14) {
            m.Companion companion6 = m.INSTANCE;
            objA3 = o.a(th14);
        }
        if (dVar3 == null) {
            throw new IllegalStateException("Unsupported enum value: " + status + " for " + o0.f186429a.b(vl4.d.class).m());
        }
        objA3 = dVar3;
        Throwable thA3 = m.a(objA3);
        if (thA3 != null) {
            hx7.e.n(thA3);
        }
        vl4.d dVar6 = (vl4.d) ((Enum) (objA3 instanceof n ? null : objA3));
        if (dVar6 == null) {
            dVar6 = vl4.d.UNKNOWN;
        }
        List detailsSection = aVar.getDetailsSection();
        ArrayList arrayList5 = new ArrayList(w.t(detailsSection, 10));
        Iterator it12 = detailsSection.iterator();
        while (it12.hasNext()) {
            arrayList5.add(jo4.a.a((io4.f) it12.next()));
        }
        return new g(localDate, localDate2, localDate6, localDate7, localDate8, nextInterestChargeDate, dVarO3, cVar3, arrayList, dVar4, dVarO, dVarO5, dVarO6, dVarO2, bVar, creditCardInAppStatement$OutstandingBalance, statementFileName, str, fVar, dVar6, arrayList2, arrayList5);
    }

    public static final i d(so4.b bVar) throws Throwable {
        Object objA;
        Object objA2;
        c cVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        LocalDate referenceDate = bVar.getReferenceDate();
        LocalDate startDate = bVar.getStartDate();
        LocalDate endDate = bVar.getEndDate();
        LocalDate dueDate = bVar.getDueDate();
        d dVarO = mo3.a.o(bVar.getStatementBalance());
        String state = bVar.getState();
        try {
            m.Companion companion = m.INSTANCE;
            c[] cVarArrValues = c.values();
            int length = cVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cVar = null;
                    break;
                }
                c cVar2 = cVarArrValues[i];
                if (a0.z(cVar2.name(), state, true)) {
                    cVar = cVar2;
                    break;
                }
                i++;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (cVar == null) {
            throw new IllegalStateException("Unsupported enum value: " + state + " for " + o0.f186429a.b(c.class).m());
        }
        objA = cVar;
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        boolean z = objA instanceof n;
        Object obj2 = objA;
        if (z) {
            obj2 = null;
        }
        c cVar3 = (c) ((Enum) obj2);
        if (cVar3 == null) {
            cVar3 = c.UNKNOWN;
        }
        c cVar4 = cVar3;
        b.a outstandingBalance = bVar.getOutstandingBalance();
        h hVar = outstandingBalance != null ? new h(outstandingBalance.getOverdue()) : null;
        String status = bVar.getStatus();
        try {
            vl4.d[] dVarArrValues = vl4.d.values();
            int length2 = dVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    objA2 = null;
                    break;
                }
                vl4.d dVar = dVarArrValues[i2];
                if (a0.z(dVar.name(), status, true)) {
                    objA2 = dVar;
                    break;
                }
                i2++;
            }
            if (objA2 == null) {
                throw new IllegalStateException("Unsupported enum value: " + status + " for " + o0.f186429a.b(vl4.d.class).m());
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th11) {
            m.Companion companion3 = m.INSTANCE;
            objA2 = o.a(th11);
        }
        Object obj3 = objA2;
        Throwable thA2 = m.a(obj3);
        if (thA2 != null) {
            hx7.e.n(thA2);
        }
        boolean z3 = obj3 instanceof n;
        Object obj4 = obj3;
        if (z3) {
            obj4 = null;
        }
        vl4.d dVar2 = (vl4.d) ((Enum) obj4);
        if (dVar2 == null) {
            dVar2 = vl4.d.UNKNOWN;
        }
        vl4.d dVar3 = dVar2;
        jo3.a remainingAmount = bVar.getRemainingAmount();
        return new i(referenceDate, startDate, endDate, dueDate, dVarO, cVar4, hVar, dVar3, remainingAmount != null ? mo3.a.o(remainingAmount) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final vl4.u e(so4.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: to4.a.e(so4.c):vl4.u");
    }

    public static final a.b f(CreditCardInAppStatement$Charge creditCardInAppStatement$Charge) {
        LocalDate localDate = creditCardInAppStatement$Charge.f68870a;
        d dVar = creditCardInAppStatement$Charge.f68871b;
        return new a.b(localDate, dVar != null ? mo3.a.p(dVar) : null);
    }

    public static final a.g g(CreditCardInAppStatement$RevolverTransaction creditCardInAppStatement$RevolverTransaction) {
        jo3.a aVarP;
        a.e eVar;
        ZonedDateTime zonedDateTime = creditCardInAppStatement$RevolverTransaction.f68882a;
        jo3.a aVarP2 = mo3.a.p(creditCardInAppStatement$RevolverTransaction.f68883b);
        d dVar = creditCardInAppStatement$RevolverTransaction.f68884c;
        if (dVar != null) {
            aVarP = mo3.a.p(dVar);
            eVar = null;
        } else {
            aVarP = null;
            eVar = null;
        }
        String str = creditCardInAppStatement$RevolverTransaction.d;
        a.e eVar2 = eVar;
        String str2 = creditCardInAppStatement$RevolverTransaction.e;
        String strName = creditCardInAppStatement$RevolverTransaction.f.name();
        CreditCardInAppStatement$Instalment creditCardInAppStatement$Instalment = creditCardInAppStatement$RevolverTransaction.f68885g;
        if (creditCardInAppStatement$Instalment != null) {
            eVar2 = new a.e(creditCardInAppStatement$Instalment.f68875a, creditCardInAppStatement$Instalment.f68876b, creditCardInAppStatement$Instalment.f68877c);
        }
        return new a.g(zonedDateTime, aVarP2, aVarP, str, str2, strName, eVar2);
    }
}
