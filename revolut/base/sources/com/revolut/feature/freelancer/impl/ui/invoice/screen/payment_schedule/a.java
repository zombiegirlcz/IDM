package com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerRecurringSchedule;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoiceDateOption;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentSchedule;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import ofm.q;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final Clause a(InvoiceDateOption invoiceDateOption) {
        Intrinsics.checkNotNullParameter(invoiceDateOption, "<this>");
        if (invoiceDateOption instanceof InvoiceDateOption.CustomDate) {
            long jN = oc.c.N(((InvoiceDateOption.CustomDate) invoiceDateOption).f73893a);
            TimeClause.Format.INSTANCE.getClass();
            return new TimeClause(jN, TimeClause.Format.f57959a, null, null, 12);
        }
        if (invoiceDateOption instanceof InvoiceDateOption.DateOffset) {
            return q.M(((InvoiceDateOption.DateOffset) invoiceDateOption).f73894a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final InvoicePaymentSchedule b(FreelancerInvoice freelancerInvoice) {
        Pair pair;
        LocalDate localDateN;
        Object next;
        LocalDate localDatePlusDays;
        InvoiceDateOption customDate;
        Object next2;
        LocalDate localDatePlusDays2;
        InvoiceDateOption customDate2;
        Intrinsics.checkNotNullParameter(freelancerInvoice, "<this>");
        boolean zC = freelancerInvoice.c();
        String str = freelancerInvoice.f73374a;
        DateTime dateTime = freelancerInvoice.e;
        if (zC) {
            Integer numValueOf = Integer.valueOf(jli.b.a(freelancerInvoice.j(), freelancerInvoice.e()));
            DateTime dateTimeJ = freelancerInvoice.j();
            if (dateTime == null) {
                throw new IllegalArgumentException(j6.a.q("Sale date should not be null. Invoice id: ", str).toString());
            }
            pair = new Pair(numValueOf, Integer.valueOf(jli.b.a(dateTimeJ, dateTime)));
        } else {
            pair = new Pair(Integer.valueOf(freelancerInvoice.z().f), Integer.valueOf(freelancerInvoice.z().f73438g));
        }
        int iIntValue = ((Number) pair.f186385a).intValue();
        int iIntValue2 = ((Number) pair.f186386b).intValue();
        if (freelancerInvoice.c()) {
            Date date = freelancerInvoice.j().toDate();
            Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
            localDateN = ebm.a.N(date);
        } else {
            localDateN = freelancerInvoice.z().f73435a;
        }
        LocalDate localDate = localDateN;
        Iterator<E> it8 = sr6.b.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((sr6.b) next).b() == iIntValue) {
                break;
            }
        }
        sr6.b bVar = (sr6.b) next;
        if (bVar != null) {
            customDate = new InvoiceDateOption.DateOffset(bVar);
        } else {
            if (freelancerInvoice.c()) {
                Date date2 = freelancerInvoice.e().toDate();
                Intrinsics.checkNotNullExpressionValue(date2, "toDate(...)");
                localDatePlusDays = ebm.a.N(date2);
            } else {
                FreelancerRecurringSchedule freelancerRecurringScheduleZ = freelancerInvoice.z();
                LocalDate localDate2 = freelancerRecurringScheduleZ.f73439h;
                if (!e0.w(freelancerInvoice)) {
                    localDate2 = null;
                }
                if (localDate2 == null) {
                    localDate2 = freelancerRecurringScheduleZ.f73435a;
                }
                localDatePlusDays = localDate2.plusDays(freelancerInvoice.z().f);
            }
            Intrinsics.h(localDatePlusDays);
            customDate = new InvoiceDateOption.CustomDate(localDatePlusDays);
        }
        Iterator<E> it9 = sr6.b.a().iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (((sr6.b) next2).b() == iIntValue2) {
                break;
            }
        }
        sr6.b bVar2 = (sr6.b) next2;
        if (bVar2 != null) {
            customDate2 = new InvoiceDateOption.DateOffset(bVar2);
        } else {
            if (!freelancerInvoice.c()) {
                FreelancerRecurringSchedule freelancerRecurringScheduleZ2 = freelancerInvoice.z();
                LocalDate localDate3 = freelancerRecurringScheduleZ2.f73439h;
                if (!e0.w(freelancerInvoice)) {
                    localDate3 = null;
                }
                if (localDate3 == null) {
                    localDate3 = freelancerRecurringScheduleZ2.f73435a;
                }
                localDatePlusDays2 = localDate3.plusDays(freelancerInvoice.z().f73438g);
            } else {
                if (dateTime == null) {
                    throw new IllegalArgumentException(j6.a.q("Sale date should not be null. Invoice id: ", str).toString());
                }
                Date date3 = dateTime.toDate();
                Intrinsics.checkNotNullExpressionValue(date3, "toDate(...)");
                localDatePlusDays2 = ebm.a.N(date3);
            }
            Intrinsics.h(localDatePlusDays2);
            customDate2 = new InvoiceDateOption.CustomDate(localDatePlusDays2);
        }
        FreelancerRecurringSchedule freelancerRecurringSchedule = freelancerInvoice.f73389x;
        return new InvoicePaymentSchedule(localDate, customDate, customDate2, freelancerRecurringSchedule != null ? freelancerRecurringSchedule.f73439h : null, freelancerInvoice.d() ? new InvoicePaymentSchedule.Type.Recurring(e0.w(freelancerInvoice)) : InvoicePaymentSchedule.Type.OneTime.f73898a);
    }
}
