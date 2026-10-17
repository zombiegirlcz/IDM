package com.revolut.feature.revolutpay.impl.domain.models.payment_schedule;

import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.PayLaterOffer;
import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t6c.f;
import t6c.k;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final boolean a(PayLaterOffer payLaterOffer, PayLaterOffer other) {
        Intrinsics.checkNotNullParameter(payLaterOffer, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return payLaterOffer.f84354b == other.f84354b && payLaterOffer.f84355c == other.f84355c && payLaterOffer.f84356g.size() == other.f84356g.size();
    }

    public static final PaymentScheduleSelection b(f fVar, PaymentScheduleSelection selection) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(selection, "selection");
        if (selection instanceof PaymentScheduleSelection.PayNow) {
            return PaymentScheduleSelection.PayNow.f84446a;
        }
        if (!(selection instanceof PaymentScheduleSelection.PayLater)) {
            throw new NoWhenBranchMatchedException();
        }
        k kVar = fVar.f268293c;
        List list = kVar != null ? kVar.f268301b : null;
        if (list == null) {
            list = f0.f322471a;
        }
        List list2 = list;
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((PayLaterOffer) next).f84353a, ((PaymentScheduleSelection.PayLater) selection).f84445a.f84353a)) {
                break;
            }
        }
        PayLaterOffer payLaterOffer = (PayLaterOffer) next;
        if (payLaterOffer == null) {
            Iterator it9 = list2.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it9.next();
                if (a((PayLaterOffer) next2, ((PaymentScheduleSelection.PayLater) selection).f84445a)) {
                    break;
                }
            }
            payLaterOffer = (PayLaterOffer) next2;
        }
        if (payLaterOffer != null) {
            return new PaymentScheduleSelection.PayLater(payLaterOffer);
        }
        return null;
    }
}
