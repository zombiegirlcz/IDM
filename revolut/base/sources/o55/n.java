package o55;

import com.revolut.feature.credit.loan.api.models.rev10.ExcludedAmountRange;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual;
import com.revolut.feature.credit.loan.api.models.rev10.LoanAutoPayRepaymentSource;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCardPaymentSource;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBorrower;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentAccountDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentConfig;
import com.revolut.feature.credit.loan.api.models.rev10.LoanUnavailableFeatures;
import com.revolut.feature.credit.loan.api.models.rev10.RepaymentSuggestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import q35.k0;
import q35.l0;
import q35.m0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.q implements Function1 {
    public static final n f = new n();

    public n() {
        super(1, d55.c.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/loan/impl/network/models/LoanDetailsDto;)Lcom/revolut/feature/credit/loan/api/models/rev10/LoanDetails;", 1);
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList;
        dj0.d dVar;
        List list;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it8;
        dj0.d dVar2;
        io3.l lVar;
        q35.g0 g0Var;
        i55.i iVar;
        String str;
        LoanRepaymentAccountDetails loanRepaymentAccountDetails;
        i55.i p0 = (i55.i) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = d55.c.f111351a;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(p0, "<this>");
        xi0.a aVar = xi0.b.Companion;
        String currency = p0.getCurrency();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(currency);
        Loan loanB = d55.f.b(p0);
        int iT = p0.getTerm();
        int iS = p0.getRepaymentDay();
        dj0.d dVar3 = new dj0.d(p0.getOutstandingBalance(), bVarA);
        LoanAccrual loanAccrualA = d55.c.a(p0.getAccruedInterest(), bVarA);
        LoanAccrual loanAccrualA2 = d55.c.a(p0.getAccruedFee(), bVarA);
        LoanAccrual loanAccrualA3 = d55.c.a(p0.getOneTimeFee(), bVarA);
        dj0.d dVar4 = new dj0.d(p0.getMonthlyRepayment(), bVarA);
        boolean zN = p0.getInCooldownPeriod();
        List<i55.f> listM = p0.getBorrowers();
        char c2 = '\n';
        ArrayList arrayList4 = new ArrayList(zhm.w.t(listM, 10));
        for (i55.f fVar : listM) {
            String clientId = fVar.getClientId();
            int paymentPriority = fVar.getPaymentPriority();
            i55.u paymentSource = fVar.getPaymentSource();
            com.revolut.feature.credit.loan.api.models.rev10.c cVar = (com.revolut.feature.credit.loan.api.models.rev10.c) u1.u(paymentSource.getType(), d55.c.f111354g);
            com.revolut.feature.credit.loan.api.models.rev10.b bVar = (com.revolut.feature.credit.loan.api.models.rev10.b) u1.u(paymentSource.getState(), d55.c.f);
            String sourceId = paymentSource.getSourceId();
            String pocketId = paymentSource.getPocketId();
            i55.a0 accountDetails = paymentSource.getAccountDetails();
            if (accountDetails != null) {
                Intrinsics.checkNotNullParameter(accountDetails, str2);
                iVar = p0;
                str = str2;
                loanRepaymentAccountDetails = new LoanRepaymentAccountDetails(accountDetails.getAccountNumber(), accountDetails.getInternalPocketId());
            } else {
                iVar = p0;
                str = str2;
                loanRepaymentAccountDetails = null;
            }
            ArrayList arrayList5 = arrayList4;
            arrayList5.add(new LoanBorrower(clientId, paymentPriority, fVar.getFirstName(), fVar.getLastName(), new LoanBorrower.PaymentSource(cVar, bVar, sourceId, pocketId, bVarA, loanRepaymentAccountDetails)));
            arrayList4 = arrayList5;
            c2 = '\n';
            p0 = iVar;
            str2 = str;
        }
        i55.i iVar2 = p0;
        List listP0 = zhm.d0.P0(arrayList4, new d55.b());
        i55.d dVarI = iVar2.getAutoPayRepaymentSource();
        LoanAutoPayRepaymentSource loanAutoPayRepaymentSource = dVarI != null ? new LoanAutoPayRepaymentSource(dVarI.getId(), (q35.a) u1.u(dVarI.getState(), d55.c.f111355h), (q35.b) u1.u(dVarI.getType(), d55.c.i), dVarI.getExternalId(), dVarI.getBankIdentifier(), dVarI.getAccountNumber()) : null;
        i55.e eVarK = iVar2.getBackupCard();
        LoanBackupCardPaymentSource loanBackupCardPaymentSource = eVarK != null ? new LoanBackupCardPaymentSource(eVarK.getId(), eVarK.getOwner(), (q35.c) u1.u(eVarK.getState(), d55.c.f111356j), eVarK.getCardId()) : null;
        i55.j0 j0VarU = iVar2.getUnavailableFeatures();
        String partialRepayment = j0VarU.getPartialRepayment();
        q35.j0 j0Var = partialRepayment != null ? (q35.j0) u1.u(partialRepayment, d55.c.f111351a) : null;
        String settlement = j0VarU.getSettlement();
        l0 l0Var = settlement != null ? (l0) u1.u(settlement, d55.c.f111352b) : null;
        String statement = j0VarU.getStatement();
        m0 m0Var = statement != null ? (m0) u1.u(statement, d55.c.f111353c) : null;
        String repaymentDayChange = j0VarU.getRepaymentDayChange();
        k0 k0Var = repaymentDayChange != null ? (k0) i26.l.B(repaymentDayChange, d55.c.d, k0.Unknown) : null;
        String cancellation = j0VarU.getCancellation();
        LoanUnavailableFeatures loanUnavailableFeatures = new LoanUnavailableFeatures(j0Var, l0Var, m0Var, k0Var, cancellation != null ? (q35.i0) u1.u(cancellation, d55.c.e) : null);
        i55.b0 b0VarR = iVar2.getRepaymentConfig();
        Long initialAmount = b0VarR.getInitialAmount();
        dj0.d dVar5 = initialAmount != null ? new dj0.d(initialAmount.longValue(), bVarA) : null;
        dj0.d dVar6 = new dj0.d(b0VarR.getMinAmount(), bVarA);
        dj0.d dVar7 = new dj0.d(b0VarR.getMaxAmount(), bVarA);
        List<String> partialRepaymentTypes = b0VarR.getPartialRepaymentTypes();
        if (partialRepaymentTypes != null) {
            ArrayList arrayList6 = new ArrayList();
            for (String str3 : partialRepaymentTypes) {
                q35.g0[] g0VarArrValues = q35.g0.values();
                int length = g0VarArrValues.length;
                i55.b0 b0Var = b0VarR;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        g0Var = null;
                        break;
                    }
                    q35.g0 g0Var2 = g0VarArrValues[i];
                    int i2 = i;
                    q35.g0[] g0VarArr = g0VarArrValues;
                    if (kotlin.text.a0.z(g0Var2.name(), str3, true)) {
                        g0Var = g0Var2;
                        break;
                    }
                    i = i2 + 1;
                    g0VarArrValues = g0VarArr;
                }
                if (g0Var != null) {
                    arrayList6.add(g0Var);
                }
                b0VarR = b0Var;
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        i55.b0 b0Var2 = b0VarR;
        List allowedPocketTypes = b0Var2.getAllowedPocketTypes();
        if (allowedPocketTypes != null) {
            ArrayList arrayList7 = new ArrayList();
            Iterator it9 = allowedPocketTypes.iterator();
            while (it9.hasNext()) {
                String str4 = (String) it9.next();
                io3.l[] lVarArrValues = io3.l.values();
                int length2 = lVarArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        it8 = it9;
                        dVar2 = dVar4;
                        lVar = null;
                        break;
                    }
                    io3.l lVar2 = lVarArrValues[i3];
                    it8 = it9;
                    dVar2 = dVar4;
                    if (kotlin.text.a0.z(lVar2.name(), str4, true)) {
                        lVar = lVar2;
                        break;
                    }
                    i3++;
                    it9 = it8;
                    dVar4 = dVar2;
                }
                if (lVar != null) {
                    arrayList7.add(lVar);
                }
                it9 = it8;
                dVar4 = dVar2;
            }
            dVar = dVar4;
            list = arrayList7;
        } else {
            dVar = dVar4;
            list = zhm.f0.f322471a;
        }
        q35.f0 f0Var = new q35.f0(bVarA.f306286a, list, pd.b.j(b0Var2.getRequireSameCurrency()), pd.b.j(b0Var2.getAllowJointAccountPockets()));
        Long zeroBreakageFeeAmount = b0Var2.getZeroBreakageFeeAmount();
        dj0.d dVar8 = zeroBreakageFeeAmount != null ? new dj0.d(zeroBreakageFeeAmount.longValue(), bVarA) : null;
        Long strategySelectionThreshold = b0Var2.getStrategySelectionThreshold();
        dj0.d dVar9 = strategySelectionThreshold != null ? new dj0.d(strategySelectionThreshold.longValue(), bVarA) : null;
        List suggestions = b0Var2.getSuggestions();
        if (suggestions != null) {
            List<i55.i0> list2 = suggestions;
            ArrayList arrayList8 = new ArrayList(zhm.w.t(list2, 10));
            for (i55.i0 i0Var : list2) {
                arrayList8.add(new RepaymentSuggestion(new dj0.d(i0Var.getAmount(), bVarA), i0Var.getTitle()));
                loanUnavailableFeatures = loanUnavailableFeatures;
            }
            arrayList2 = arrayList8;
        } else {
            arrayList2 = null;
        }
        LoanUnavailableFeatures loanUnavailableFeatures2 = loanUnavailableFeatures;
        List excludedAmountRanges = b0Var2.getExcludedAmountRanges();
        if (excludedAmountRanges != null) {
            List<i55.a> list3 = excludedAmountRanges;
            ArrayList arrayList9 = new ArrayList(zhm.w.t(list3, 10));
            for (i55.a aVar2 : list3) {
                arrayList9.add(new ExcludedAmountRange(new dj0.d(aVar2.getMinAmount(), bVarA), new dj0.d(aVar2.getMaxAmount(), bVarA), aVar2.getText()));
                dVar6 = dVar6;
                dVar7 = dVar7;
                f0Var = f0Var;
            }
            arrayList3 = arrayList9;
        } else {
            arrayList3 = null;
        }
        return new LoanDetails(loanB, iT, iS, dVar3, loanAccrualA, loanAccrualA2, loanAccrualA3, dVar, zN, loanAutoPayRepaymentSource, loanBackupCardPaymentSource, listP0, loanUnavailableFeatures2, new LoanRepaymentConfig(dVar5, dVar6, dVar7, arrayList, f0Var, dVar8, dVar9, arrayList2, arrayList3), iVar2.getAgreementNumber());
    }
}
