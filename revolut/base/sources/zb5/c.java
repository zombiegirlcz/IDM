package zb5;

import ac5.f;
import ac5.g;
import ac5.h;
import ac5.i;
import ac5.j;
import ac5.l;
import ac5.m;
import ac5.n;
import ac5.o;
import ac5.p;
import ac5.r;
import ac5.x;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nb5.d;
import nb5.e;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class c {
    public static final CreditCardAutopayPayment.PaymentAmount a(j jVar) {
        if (jVar instanceof h) {
            return CreditCardAutopayPayment.PaymentAmount.StatementBalance.f70714a;
        }
        if (jVar instanceof g) {
            return CreditCardAutopayPayment.PaymentAmount.MinRepayment.f70713a;
        }
        if (jVar instanceof i) {
            return CreditCardAutopayPayment.PaymentAmount.Unsupported.f70715a;
        }
        if (jVar instanceof f) {
            return new CreditCardAutopayPayment.PaymentAmount.Fixed(mo3.a.o(((f) jVar).getFixedAmount()));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final CreditCardAutopayPayment.PaymentSource b(p pVar) {
        String id10 = pVar.getId();
        nb5.c cVarValueOf = nb5.c.valueOf(pVar.getState());
        xi0.a aVar = xi0.b.Companion;
        String currency = pVar.getCurrency();
        aVar.getClass();
        return new CreditCardAutopayPayment.PaymentSource(id10, cVarValueOf, xi0.a.a(currency));
    }

    public static final CreditCardAutopayPayment c(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar instanceof n) {
            n nVar = (n) oVar;
            String id10 = nVar.getId();
            e eVarValueOf = e.valueOf(nVar.getType());
            d dVarValueOf = d.valueOf(nVar.getState());
            CreditCardAutopayPayment.PaymentSource paymentSourceB = b(nVar.getSource());
            x day = nVar.getDay();
            CreditCardAutopayPayment.PaymentDay paymentDay = new CreditCardAutopayPayment.PaymentDay(nb5.b.valueOf(day.getType()), day.getValue(), day.getIsEditable());
            CreditCardAutopayPayment.PaymentAmount paymentAmountA = a(nVar.getAmount());
            Instant nextPaymentDate = nVar.getNextPaymentDate();
            Integer daysInAdvance = nVar.getDaysInAdvance();
            Boolean isStateToggleable = nVar.getIsStateToggleable();
            return new CreditCardAutopayPayment.AutoPayment(id10, eVarValueOf, dVarValueOf, paymentSourceB, paymentAmountA, paymentDay, nextPaymentDate, daysInAdvance, isStateToggleable != null ? isStateToggleable.booleanValue() : true);
        }
        if (!(oVar instanceof m)) {
            if (!(oVar instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            l lVar = (l) oVar;
            return new CreditCardAutopayPayment.BackupCard(lVar.getId(), e.valueOf(lVar.getType()), d.valueOf(lVar.getState()), b(lVar.getSource()), lVar.getNextPaymentDate());
        }
        m mVar = (m) oVar;
        String id11 = mVar.getId();
        e eVarValueOf2 = e.valueOf(mVar.getType());
        d dVarValueOf2 = d.valueOf(mVar.getState());
        CreditCardAutopayPayment.PaymentSource paymentSourceB2 = b(mVar.getSource());
        x day2 = mVar.getDay();
        return new CreditCardAutopayPayment.AutoPayment(id11, eVarValueOf2, dVarValueOf2, paymentSourceB2, a(mVar.getAmount()), new CreditCardAutopayPayment.PaymentDay(nb5.b.valueOf(day2.getType()), day2.getValue(), day2.getIsEditable()), mVar.getNextPaymentDate(), mVar.getDaysInAdvance(), true);
    }

    public static final CreditCardAutopayPayments d(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        LocalDate currentDate = rVar.getCurrentDate();
        LocalDate dueDate = rVar.getDueDate();
        xi0.a aVar = xi0.b.Companion;
        String currency = rVar.getCurrency();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(currency);
        List autoPayments = rVar.getAutoPayments();
        ArrayList arrayList = new ArrayList(w.t(autoPayments, 10));
        Iterator it8 = autoPayments.iterator();
        while (it8.hasNext()) {
            arrayList.add(c((o) it8.next()));
        }
        return new CreditCardAutopayPayments(currentDate, dueDate, arrayList, bVarA);
    }

    public static final j e(CreditCardAutopayPayment.PaymentAmount paymentAmount) {
        if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.StatementBalance) {
            return h.f3050a;
        }
        if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.MinRepayment) {
            return g.f3049a;
        }
        if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.Unsupported) {
            return i.f3051a;
        }
        if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.Fixed) {
            return new f(mo3.a.p(((CreditCardAutopayPayment.PaymentAmount.Fixed) paymentAmount).f70712a));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final p f(CreditCardAutopayPayment.PaymentSource paymentSource) {
        return new p(paymentSource.f70719a, paymentSource.f70720b.name(), paymentSource.f70721c.f306286a);
    }

    public static final x g(CreditCardAutopayPayment.PaymentDay paymentDay) {
        return new x(paymentDay.f70716a.name(), paymentDay.f70717b, paymentDay.f70718c);
    }
}
