package b9e;

import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import ibd.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13739c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f13740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f13741h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f13742j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f13743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f13744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f13745n;
    public final List o;

    public e(List raisedSubscriptions, List cardSubscriptions, List directDebits, List payLaterRepayments, List loanPayments, List scheduledTransfers, List deferredPayments, List inactiveSubscriptions, List blockedSubscriptions, List pendingRefunds, List boletoPayments, List billPayments, List pixAutomaticoPayments, List payToPayments, List upiPayments) {
        Intrinsics.checkNotNullParameter(raisedSubscriptions, "raisedSubscriptions");
        Intrinsics.checkNotNullParameter(cardSubscriptions, "cardSubscriptions");
        Intrinsics.checkNotNullParameter(directDebits, "directDebits");
        Intrinsics.checkNotNullParameter(payLaterRepayments, "payLaterRepayments");
        Intrinsics.checkNotNullParameter(loanPayments, "loanPayments");
        Intrinsics.checkNotNullParameter(scheduledTransfers, "scheduledTransfers");
        Intrinsics.checkNotNullParameter(deferredPayments, "deferredPayments");
        Intrinsics.checkNotNullParameter(inactiveSubscriptions, "inactiveSubscriptions");
        Intrinsics.checkNotNullParameter(blockedSubscriptions, "blockedSubscriptions");
        Intrinsics.checkNotNullParameter(pendingRefunds, "pendingRefunds");
        Intrinsics.checkNotNullParameter(boletoPayments, "boletoPayments");
        Intrinsics.checkNotNullParameter(billPayments, "billPayments");
        Intrinsics.checkNotNullParameter(pixAutomaticoPayments, "pixAutomaticoPayments");
        Intrinsics.checkNotNullParameter(payToPayments, "payToPayments");
        Intrinsics.checkNotNullParameter(upiPayments, "upiPayments");
        this.f13737a = raisedSubscriptions;
        this.f13738b = cardSubscriptions;
        this.f13739c = directDebits;
        this.d = payLaterRepayments;
        this.e = loanPayments;
        this.f = scheduledTransfers;
        this.f13740g = deferredPayments;
        this.f13741h = inactiveSubscriptions;
        this.i = blockedSubscriptions;
        this.f13742j = pendingRefunds;
        this.k = boletoPayments;
        this.f13743l = billPayments;
        this.f13744m = pixAutomaticoPayments;
        this.f13745n = payToPayments;
        this.o = upiPayments;
    }

    public final ArrayList a() {
        ArrayList arrayListE0 = d0.E0(this.f13744m, d0.E0(this.k, d0.E0(this.f13742j, d0.E0(this.f13740g, d0.E0(this.f, d0.E0(this.e, d0.E0(this.d, d0.E0(this.f13739c, this.f13738b))))))));
        List list = this.f13745n;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((RecurringPaymentWithExtra) obj2).getF81653a().f249316b == f.ACTIVE) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayListE02 = d0.E0(arrayList, arrayListE0);
        List list2 = this.o;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (((RecurringPaymentWithExtra) obj3).getF81653a().f249316b == f.ACTIVE) {
                arrayList2.add(obj3);
            }
        }
        return d0.E0(arrayList2, arrayListE02);
    }

    public final boolean b() {
        List list = this.f13745n;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((RecurringPaymentWithExtra) obj2).getF81653a().f249316b == f.ACTIVE) {
                arrayList.add(obj2);
            }
        }
        List list2 = this.o;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (((RecurringPaymentWithExtra) obj3).getF81653a().f249316b == f.ACTIVE) {
                arrayList2.add(obj3);
            }
        }
        List listK = v.k(this.f13738b, this.f13739c, this.f, this.d, this.e, this.f13740g, this.f13742j, this.k, this.f13744m, arrayList, arrayList2);
        if (!(listK instanceof Collection) || !listK.isEmpty()) {
            Iterator it8 = listK.iterator();
            while (it8.hasNext()) {
                if (!((List) it8.next()).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f13737a, eVar.f13737a) && Intrinsics.f(this.f13738b, eVar.f13738b) && Intrinsics.f(this.f13739c, eVar.f13739c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f13740g, eVar.f13740g) && Intrinsics.f(this.f13741h, eVar.f13741h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f13742j, eVar.f13742j) && Intrinsics.f(this.k, eVar.k) && Intrinsics.f(this.f13743l, eVar.f13743l) && Intrinsics.f(this.f13744m, eVar.f13744m) && Intrinsics.f(this.f13745n, eVar.f13745n) && Intrinsics.f(this.o, eVar.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(this.f13737a.hashCode() * 31, 31, this.f13738b), 31, this.f13739c), 31, this.d), 31, this.e), 31, this.f), 31, this.f13740g), 31, this.f13741h), 31, this.i), 31, this.f13742j), 31, this.k), 31, this.f13743l), 31, this.f13744m), 31, this.f13745n);
    }
}
